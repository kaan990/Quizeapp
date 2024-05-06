package UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Starting() {

    Box() {

//        Design behind the screen

        Column {
//            Image(modifier = Modifier.clip(150.dp), contentScale = ContentScale.FillWidth)
//                Text(
//                    text = "",
//                    modifier = Modifier.padding(50.dp)
//                        .size(200.dp)
//                        .clip(CircleShape)
//                        .background(Color.Blue),
//                )
        Screen2()

        }


        Column(
            modifier = Modifier.padding(10.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            var IntroImg: Painter = painterResource("quizetable.jfif")
            Image(
                painter = IntroImg, contentDescription = "quize Image",
                modifier = Modifier.width(300.dp)
                    .size(300.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Gray, CircleShape)
                    .background(Color.White)
                    .height(300.dp),
            )
            Spacer(modifier = Modifier.padding(5.dp)
                .fillMaxWidth()
                .height(10.dp))

            Text(text = "Click below and Start your Quize app")
            Button(onClick = { "Quize is loading" }) {
                Text(text = "Start Quize")
            }
        }
    }

}