package com.ai.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.composelearning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    ComposelearningTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            TextCustomization()
            TextCustomization2()
            TextSelection()
        }
    }
}

@Composable
fun TextCustomization() {
    Text(
        text = stringResource(R.string.app_name),
        modifier = Modifier
            .background(Color.Blue)
            .padding(15.dp)
            .width(100.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.titleSmall.fontSize,

        )
}

@Composable
fun TextCustomization2() {

    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }

        },
        modifier = Modifier.width(200.dp)
    )
}

@Composable
fun TextSelection(){
    SelectionContainer {
        Column {
            Text(text = "Selectable text")
            DisableSelection {
                Text(text = "Not selectable")
            }
            Text(text = "Selectable again")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainContent()
}