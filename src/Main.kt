import view.gui
import javax.swing.JFrame

fun main(args: Array<String>) {
    val frame = JFrame("Placar BJJ")
    frame.contentPane = gui().mainPane
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(1300, 900)
    frame.isResizable = true
    frame.setLocationRelativeTo(null)
    frame.isUndecorated = true
    frame.extendedState = JFrame.MAXIMIZED_BOTH
    frame.isVisible = true


}
