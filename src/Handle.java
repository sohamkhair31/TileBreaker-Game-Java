import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Handle extends JFrame implements KeyListener {
    static Animation panel= new Animation(780,560);
    private int SpeedOfBar = 50;
    Handle()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Soham Khair\\IdeaProjects\\Game\\src\\ball.png");
        Image img = icon.getImage();
            this.setIconImage(img);
            this.setTitle("Brick Breaker Game - Stage I ");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800,600);
            this.setLocationRelativeTo(null);
            this.addKeyListener(this);
            this.add(panel);
                 panel.Stage.setBounds(100,480,180,30);
    }

    public static void main(String[] args) {
        new Handle().setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'a')
        {
            panel.Stage.setLocation(panel.Stage.getX()-SpeedOfBar,480);
                 System.out.println("Panel Loc : "+panel.getLocation());
        }
        else if (e.getKeyChar()=='d')
        {
            panel.Stage.setLocation(panel.Stage.getX()+SpeedOfBar,480);
                System.out.println("Panel Loc : "+panel.getLocation());

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
