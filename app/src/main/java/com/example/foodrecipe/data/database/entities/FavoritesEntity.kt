package com.example.foodrecipe.data.database.entities

import androidx.room.Entity
import com.example.foodrecipe.models.Result
import androidx.room.PrimaryKey
import com.example.foodrecipe.util.Constants.Companion.FAVORITE_RECIPES_TABLE


@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
){
}