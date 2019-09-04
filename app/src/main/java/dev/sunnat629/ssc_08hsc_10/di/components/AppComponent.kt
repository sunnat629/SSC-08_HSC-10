package dev.sunnat629.ssc_08hsc_10.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.sunnat629.ssc_08hsc_10.di.modules.StorageModule
import dev.sunnat629.ssc_08hsc_10.ui.dashboard.DashboardFragment
import dev.sunnat629.ssc_08hsc_10.ui.dashboard.DashboardViewModel
import dev.sunnat629.ssc_08hsc_10.ui.home.HomeFragment
import dev.sunnat629.ssc_08hsc_10.ui.home.HomeViewModel
import dev.sunnat629.ssc_08hsc_10.ui.notifications.NotificationsFragment
import dev.sunnat629.ssc_08hsc_10.ui.notifications.NotificationsViewModel
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
    StorageModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(fragment: DashboardFragment)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: NotificationsFragment)

    fun inject(viewModel: DashboardViewModel)
    fun inject(viewModel: HomeViewModel)
    fun inject(viewModel: NotificationsViewModel)
}