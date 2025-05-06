import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends BackgroundPanel {
    public static final int BUTTON_WIDTH = 0;
    public static final int BUTTON_HEIGHT = 30;
    private JButton start;
    private JButton instructions;
    private JPanel buttonPanel;

    public Menu(int x, int y, int width, int height){
        super( x,  y,  width,  height);
        this.setBackground(new ImageIcon(getClass().getResource("images/menu.png")).getImage());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.buttonPanel = new JPanel();
        this.buttonPanel.setOpaque(false); //בלי זה לא נראה את הרקע
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, BoxLayout.Y_AXIS));
        this.buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(this.buttonPanel);

        this.start = new JButton("START GAME"); //יצרתי כפתורים
        this.instructions = new JButton("INSTRUCTIONS");

        this.start.setAlignmentX(Component.CENTER_ALIGNMENT); //למרכז אותם עם ה BOXLAYOUT
        this.instructions.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.buttonPanel.add(Box.createVerticalGlue()); // רווח גמיש מלמעלה

        this.buttonPanel.add(start);

        this.buttonPanel.add(Box.createRigidArea(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT))); // רווח קבוע בין הכפתורים

        this.buttonPanel.add(instructions);

        this.buttonPanel.add(Box.createVerticalGlue()); // רווח גמיש מלמטה



    }

    public void setStartButtonAction(ActionListener actionListener){
        this.start.addActionListener(actionListener);
    }


    public void setInstructionsButtonAction(ActionListener actionListener) {
        this.instructions.addActionListener(actionListener);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
    }
}
