package me.luis.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.luis.tallergitgithubapp.ui.theme.TallerGitGitHubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TallerGitGitHubAppTheme {
                Perfil()
            }
        }
    }
}

@Composable
fun Perfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(20.dp),
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

        Spacer(modifier = Modifier.size(15.dp))

        Text(
            text = "Luis Cruz",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Ingeniería de Sistemas",
            fontSize = 17.sp,
            color = Color(0xFF2E7D32)
        )

        Spacer(modifier = Modifier.size(15.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp)
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Text(text = "Edad: 19 años")
                Text(text = "Correo: lcruz289@unab.edu.co")
                Text(text = "Ciudad: Bucaramanga")
            }
        }

        Spacer(modifier = Modifier.size(15.dp))

        Text(
            text = "Me interesa el desarrollo de software, las aplicaciones móviles, la inteligencia artificial y las nuevas tecnologías.",
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.size(15.dp))

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