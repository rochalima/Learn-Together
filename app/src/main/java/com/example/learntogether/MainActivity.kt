package com.example.learntogether

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NovoArtigo()
                }
            }
        }
    }
}

@Composable
fun NovoArtigo(){
    PainelArtigo(titulo = stringResource(R.string.titulo),
        resumo = stringResource(R.string.resumo),
        descricao = stringResource(R.string.contexto)
    )
}

@Composable
fun PainelArtigo(
    titulo: String,
    resumo: String,
    descricao: String
) {
    var image = painterResource(id = R.drawable.bg_compose_background)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )

        Text (text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            )
        )
        Text (text = resumo,
              modifier = Modifier
                  .padding(start = 16.dp, end = 16.dp),
              textAlign = TextAlign.Justify

            )
        Text (text =  descricao,
              modifier = Modifier.padding(
                  start = 16.dp,
                  top = 16.dp,
                  end = 16.dp,
                  bottom = 16.dp
              ),
            textAlign = TextAlign.Justify


        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        NovoArtigo()
    }
}