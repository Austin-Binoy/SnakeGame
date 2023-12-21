import javax.swing.JFrame;

public class Gameframe extends JFrame
{
    private static final long serialVersionUID = 1L;

    Gameframe()
    {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
