package br.com.okayamafilho.tcomposereader

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.okayamafilho.tcomposereader.ui.theme.TComposeReaderTheme
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TComposeReaderTheme {
//                val db = FirebaseFirestore.getInstance()
//                val user: MutableMap<String, Any> = HashMap()
//                user["firstName"] = "Toshiaki"
//                user["lastName"] = "Okayama Filho"

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    db.collection("users").add(user).addOnSuccessListener {
//                        Log.d("FB", "onCreate: ${it.id}")
//                    }.addOnFailureListener {
//                        Log.d("FB", "onCreate: $it")
//                    }
                    Greeting(

                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TComposeReaderTheme {
        Greeting("Android")
    }
}