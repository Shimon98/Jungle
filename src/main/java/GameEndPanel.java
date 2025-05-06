import javax.swing.*;
import java.awt.event.ActionListener;

public class GameEndPanel extends BackgroundPanel{
    private JButton backToMenu;




    public GameEndPanel(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.setBackground( new ImageIcon(getClass().getResource("images/end_game.png")).getImage());

        this.backToMenu=new JButton("Back to menu!");
        this.add(this.backToMenu);

    }

    public void setBackToMenuButtonAction(ActionListener backToMenu) {
        this.backToMenu.addActionListener(backToMenu);
    }
}
