import javax.swing.*;
import java.awt.*;

public class BreakablePlatform extends Platform{
    private boolean isBreaking;
    private Image brokenPlatform;

    public BreakablePlatform(int platformX, int platformY) {
        super(platformX, platformY);
        this.setPlatformImage(new ImageIcon(getClass().getResource("images/platform_leaf.png")).getImage());
        this.isBreaking = false;
    }


    public void broke (){
        isBreaking=true;
        this.setPlatformImage(new ImageIcon(getClass().getResource("images/platform_break.png")).getImage());
    }

}
