import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 800;
    public static final int WINDOW_X = 0;
    public static final int WINDOW_Y = 0;


    private CardLayout cardLayout;
    private Container container;
    private Menu menu;
    private GamePanel gamePanel;
    private GameEndPanel gameEndPanel;

    public MainFrame() {
        this.setTitle("JUNGLE JUMP");
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        this.container = getContentPane();
        this.container.setLayout(this.cardLayout);
        this.menu = new Menu(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.container.add(this.menu, ScreenNames.MENU);
        this.cardLayout.show(this.container, ScreenNames.MENU);
        this.gamePanel = new GamePanel(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.container.add(this.gamePanel, ScreenNames.GAME);
        this.gameEndPanel=new GameEndPanel(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);


        this.container.add(this.gameEndPanel,ScreenNames.END_GAME);

        this.menu.setStartButtonAction(e -> {
            System.out.println("startPRAS");
            this.gamePanel.startGame();// הסבר למה המשחק לא מתחיל שאני לוחץ על הכפתור
            this.cardLayout.show(this.container,ScreenNames.GAME);
            gamePanel.requestFocusInWindow();
            this.lostGame();

        });

        this.gameEndPanel.setBackToMenuButtonAction(e->{
            this.cardLayout.show(this.container,ScreenNames.MENU);
        });




    }

    private void lostGame(){
        new Thread(()->{
            try {
                while (!this.gamePanel.gameLost()){
                    System.out.print("");

                }
                System.out.println("endGAME");
                this.cardLayout.show(this.container,ScreenNames.END_GAME);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }).start();


    }


}
