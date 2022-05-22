package com.gpeal.droidconanvilsample.feature.weatherui

import com.gpeal.droidconanvilsample.lib.daggerscopes.AppScope
import com.gpeal.droidconanvilsample.lib.daggerscopes.WeatherScope
import com.gpeal.droidconanvilsample.lib.daggerscopes.utils.SingleIn
import com.squareup.anvil.annotations.ContributesSubcomponent
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent
import kotlinx.coroutines.CoroutineScope

@SingleIn(WeatherScope::class)
@ContributesSubcomponent(WeatherScope::class, AppScope::class)
interface WeatherComponent {
    @ContributesSubcomponent.Factory
    interface Factory {
        fun create(): WeatherComponent
    }

    @ContributesTo(AppScope::class)
    interface ParentBindings {
        fun weatherComponentBuilder(): Factory
    }
}