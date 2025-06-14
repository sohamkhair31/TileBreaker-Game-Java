import javax.swing.*;
import java.awt.*;

public class Animation extends  JPanel {

    protected int max_x;
    protected int max_y;
    int BallPos_X = 0;
    int BallPos_Y = 0;
    int BallWidth=30;
    int BallHeight = 30;
    int Speed_X = 10;
    int Speed_Y = 10;
    JPanel Stage = new JPanel();
    Animation(int Temp_X,int Temp_Y)
    {
        this.max_x = Temp_X-BallWidth;
        this.max_y = Temp_Y-BallHeight;
            this.setBackground(new Color(230,230,250));
            Stage.setBackground(Color.BLACK);
            Stage.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.BLACK));

    }
    @Override
    public void paint(Graphics PanelGraphics)
    {

        super.paint(PanelGraphics);

        PanelGraphics.setColor(Color.gray);
        PanelGraphics.fillOval(BallPos_X,BallPos_Y,BallWidth,BallHeight);
        Rectangle rect = new Rectangle(BallPos_X,BallPos_Y,60,60);
        Rectangle StageRect = new Rectangle(Stage.getX(),480,180,30);

        if(rect.intersects(StageRect))
        {
            Speed_Y=-Speed_Y;
        }


        this.add(Stage);
        this.BallPos_X += Speed_X;
        this.BallPos_Y += Speed_Y;
        System.out.println(" BallPos_X of Stage : "+Stage.getX());
        System.out.println(" BallPos_Y of Stage : "+Stage.getY());
        System.out.println(" xBall of Stage : "+BallPos_X);
        System.out.println(" yBall of Stage : "+BallPos_Y);
        if(BallPos_X>max_x || BallPos_X<0)
        {
            Speed_X=-Speed_X;
        }
        else if(BallPos_Y<0)
        {
            Speed_Y=-Speed_Y;
        }
        else if(BallPos_Y>max_x)
        {
            JOptionPane.showMessageDialog(null,"Game is Over !!!","Game : Status",JOptionPane.OK_OPTION);
            System.exit(0);
        }


        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();

    }

}
