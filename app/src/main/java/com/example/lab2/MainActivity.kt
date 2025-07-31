package com.example.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme {
                PantallaInicial()
            }
        }
    }
}

@Composable
fun PantallaInicial() {
    // Obtener el contexto de la aplicación
    val contexto = LocalContext.current

    // Creamos un espacio con un Column que organiza los elementos verticalmente
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título con el nombre del proyecto
        Text(text = "UVG PPM Lab 2", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y el siguiente texto

        // Texto de bienvenida
        Text(text = "¡Bienvenido a mi aplicación!", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(32.dp)) // Espacio entre el texto de bienvenida y el botón

        // Botón que al presionarlo muestra un mensaje (Toast)
        Button(onClick = {
            // Aquí creamos el mensaje cuando el botón es presionado
            Toast.makeText(contexto, "¡Soy un pro con Jetpack Compose!", Toast.LENGTH_SHORT).show()
        }) {
            Text("Presióname")
        }
    }
}
