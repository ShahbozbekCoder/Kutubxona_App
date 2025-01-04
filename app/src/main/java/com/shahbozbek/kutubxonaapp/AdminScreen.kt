package com.shahbozbek.kutubxonaapp

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AdminScreen(navController: NavHostController) {
    var bookName by remember { mutableStateOf("") }
    val context = LocalContext.current
    val users = listOf("User1", "User2")
    val books = listOf("Book1", "Book2")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Admin Panel")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Add Book:")
        TextField(
            value = bookName,
            onValueChange = { bookName = it },
            label = { Text("Book Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            Toast.makeText(context, "Kitob qo'shildi", Toast.LENGTH_SHORT).show()
        }) {
            Text("Add Book")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Users:")
        users.forEach { user ->
            Text(user)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Books:")
        books.forEach { book ->
            Text(book)
        }
    }
}