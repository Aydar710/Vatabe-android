package com.gina.gienamobile.data.repository
import com.gina.gienamobile.data.model.Card

interface CardRepository {
    suspend fun getCard(userId : Int): Result<Card>
}