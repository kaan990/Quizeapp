import UI.Screen2
import UI.Starting
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
@Preview
fun App(
//    navController: NavController = rememberNavController()
) {
//    Starting()
    Screen2()
}


fun main() = application {
    var state = rememberWindowState(
        size = DpSize(600.dp, 500.dp),
        position = WindowPosition(300.dp, 300.dp)
    )
    val icon: Painter = painterResource("quiz.png")
    Window(onCloseRequest = ::exitApplication, icon = icon, title = "Quize app", state = state) {
        App()
    }
}
