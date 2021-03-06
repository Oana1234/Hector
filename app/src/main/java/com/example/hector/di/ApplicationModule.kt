package com.example.hector.di

import dagger.Module
import android.app.Application
import android.content.Context
import androidx.room.Room.*
import com.example.hector.base.api.ApiHelper
import com.example.hector.data.UsersRepo
import com.example.hector.data.UsersRepository
import com.example.hector.data.local.AppDatabase
import com.example.hector.data.local.user.UsersLocalRepository
import com.example.hector.data.preferences.AppPreferenceHelper
import com.example.hector.data.preferences.PreferenceHelper
import com.example.hector.data.remote.user.UserApiHelper
import com.example.hector.utils.AppConstants
import com.example.hector.utils.SchedulerProvider
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@SuppressWarnings("TooManyFunctions")
@Module
class ApplicationModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
        databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideUsersRepository(): UsersRepo = UsersRepository()

    @Provides
    @Singleton
    internal fun provideUsersLocalRepository(appDatabase: AppDatabase): UsersLocalRepository =
        UsersLocalRepository(appDatabase.usersDao())

    @Provides
    @Singleton
    fun provideUserApiHelper(usersApiHelper: UserApiHelper): ApiHelper = usersApiHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()
}