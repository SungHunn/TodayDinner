package com.AiPrj.TodayDinner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.AiPrj.TodayDinner.ui.screen.HomeScreen
import com.AiPrj.TodayDinner.ui.theme.TodayDinnerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodayDinnerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(
                        onCameraClick = { /* TODO: 카메라 클릭 처리 */ },
                        onGalleryClick = { /* TODO: 갤러리 클릭 처리 */ }
                    )
                }
            }
        }
    }
}
