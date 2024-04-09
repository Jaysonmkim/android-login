package com.jayson.loginjayson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.loginjayson.ui.theme.LoginJaysonTheme
import java.time.format.TextStyle

class SimpleListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginJaysonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    SimpleListview()
                }
            }
        }
    }
}

private val namelist= mutableListOf("Jayson","Victor","Kelly","John","Joan","Purity")

private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Cyan)
    .padding(30.dp)



@Composable
fun SimpleListview() {
    LazyColumn(modifier = listModifier){
        items(namelist){

                jina ->
            Text(text = jina)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyList() {
    SimpleListview()
}
