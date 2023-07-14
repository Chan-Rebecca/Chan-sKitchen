
package com.example.androiddevchallenge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.DataProvider
import com.example.androiddevchallenge.data.model.Meal

@Composable
fun MealHomeContent(navigateToProfile: (Meal) -> Unit) {
    val meals = remember { DataProvider.mealList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = meals,
            itemContent = {
                MealListItem(meal = it, navigateToProfile)
            }
        )
    }
}
