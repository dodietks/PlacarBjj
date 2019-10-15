import javax.swing.JFrame



fun main() {
    val frame = JFrame("Placar BJJ")

    frame.contentPane = MainController().mainPane
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(1280, 720)
    frame.isResizable = true
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}
