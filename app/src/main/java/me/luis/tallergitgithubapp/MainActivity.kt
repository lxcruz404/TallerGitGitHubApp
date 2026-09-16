package me.luis.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import me.luis.tallergitgithubapp.ui.theme.TallerGitGitHubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGitGitHubAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Perfil(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Perfil(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Luis Cruz"
        )

        Text(
            text = "Ingeniería de Sistemas"
        )

        Text(
            text = "19 años"
        )

        Text(
            text = "lcruz289@unab.edu.co"
        )

        Text(
            text = "Bucaramanga"
        )

        Text(
            text = "Mis intereses académicos y profesionales están enfocados en el desarrollo de software, la inteligencia artificial, el desarrollo de aplicaciones y las tecnologías relacionadas con sistemas. Me interesa seguir fortaleciendo mis conocimientos para crear soluciones tecnológicas útiles e innovadoras."
        )

        Button(
            onClick = { }
        ) {
            Text("Contactar conmigo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PerfilPreview() {
    TallerGitGitHubAppTheme {
        Perfil()
    }
}