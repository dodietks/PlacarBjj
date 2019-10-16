import javax.swing.JFrame
import java.awt.Frame.MAXIMIZED_BOTH





fun main() {
    val frame = JFrame("Placar BJJ")
    frame.contentPane = MainController().mainPane
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(1300, 900)
    frame.isResizable = true
    frame.setLocationRelativeTo(null)
    frame.isUndecorated = true
    frame.extendedState = JFrame.MAXIMIZED_BOTH
    frame.isVisible = true


}
