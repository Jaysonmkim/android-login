package com.jayson.loginjayson

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jayson.loginjayson.ui.theme.LoginJaysonTheme

class MainActivity : ComponentActivity() {
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
                    Login()
                }
            }
        }
    }
}


@Composable
fun Login () {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(20.dp)){
        Text(text = "Jayson Login",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
        )

        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            label = { Text(text = "Enter Email",
                color = Color.Red,
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )

        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password",
                color = Color.Red,
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()

                .padding(vertical = 10.dp),
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
                         val intent=Intent(context,Jay::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "Login",
                 fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,RecyclerViewActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "RecyclerViewActivity",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,Jay::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "Jay",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,IntentActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "IntentActivity",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,CalculatorActivities::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "CalculatorActivities",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,SimpleListActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "SimpleListActivity",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        Button(onClick = {
            val intent=Intent(context,CustomListActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "CustomListActivity",
                fontSize = 22.sp,
                fontFamily = FontFamily.Cursive
            )
        }

        }



}

@Preview
@Composable
private fun Loginprev() {
    Login()

}




