import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel painelPrincipal;
    private JLabel HelloWorld;

    public HelloWorld(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld("HelloWorld").setVisible(true);
    }
}

