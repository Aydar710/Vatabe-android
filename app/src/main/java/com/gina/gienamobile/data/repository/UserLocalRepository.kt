package com.gina.gienamobile.data.repository

import com.gina.gienamobile.data.model.User

interface UserLocalRepository {

    fun getCurrentUser() : User
}