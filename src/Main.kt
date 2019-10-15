import javax.swing.JFrame



fun main() {
    val frame = JFrame("Placar BJJ")

    frame.contentPane = MainController().mainPane
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(1300, 900)
    frame.isResizable = true
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}
