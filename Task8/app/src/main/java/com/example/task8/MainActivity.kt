package com.example.task8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.task8.ui.apps.AppsScreen
import com.example.task8.ui.theme.Task8Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppsScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
