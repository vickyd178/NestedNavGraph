package com.doops.nestednavgraph.utils.base

import androidx.navigation.NavDirections

sealed class NavigationEvent {
    data class ToDirection(val direction: NavDirections) : NavigationEvent()
    object Back : NavigationEvent()
}
