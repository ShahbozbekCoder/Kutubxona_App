package com.shahbozbek.kutubxonaapp

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun UserScreen(navController: NavHostController) {
    val availableBooks = listOf("Book1", "Book2", "Book3")
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("User Panel")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Available Books:")
        availableBooks.forEach { book ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(book, modifier = Modifier.weight(1f))
                Button(onClick = {
                    Toast.makeText(context, "Kitob olingan", Toast.LENGTH_SHORT).show()
                }) {
                    Text("Take")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}