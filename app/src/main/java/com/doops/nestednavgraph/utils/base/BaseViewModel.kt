package com.doops.nestednavgraph.utils.base

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections

abstract class BaseViewModel : ViewModel() {
    private val _navigation: MutableLiveData<Event<NavigationEvent>> =
        MutableLiveData<Event<NavigationEvent>>()

    val navigation: LiveData<Event<NavigationEvent>> get() = _navigation

    fun navigate(navDirections: NavDirections) {
        _navigation.value = Event(NavigationEvent.ToDirection(navDirections))
    }

    fun navigateBack() {
        _navigation.value = Event(NavigationEvent.Back)
    }


}

//observe only non null values
fun <T> LiveData<T>.observeNonNull(owner: LifecycleOwner, observer: (t: T) -> Unit) {
    this.observe(
        owner
    ) {
        it?.let(observer)
    }
}