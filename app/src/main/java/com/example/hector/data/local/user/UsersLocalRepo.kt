package com.example.hector.data.local.user

import io.reactivex.Observable
import io.reactivex.Single

interface UsersLocalRepo {

    fun getAllUsers(): Observable<List<User>>

    fun getUserById(id: Long): Single<User>

    fun updateUser(user: User)

    fun addUser(user: User)

    fun deleteUser(id: Long)
}