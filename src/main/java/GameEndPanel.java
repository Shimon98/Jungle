import javax.swing.*;

public class GameEndPanel extends BackgroundPanel{



    public GameEndPanel(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.setBackground( new ImageIcon(getClass().getResource("images/end_game.png")).getImage());

    }

}
