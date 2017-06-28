import javax.swing.*;
import java.awt.*;

/**
 * Created by X on 28.06.2017.
 */
public class MainGui extends JFrame {

    private JButton startButton;
    private JButton stopButton;
    private JPanel mainPanel;

    public static void main(String[] args) {
        new MainGui();
    }

    public MainGui() {
        super("AndroiMargoMiniBot");


        setMainPanel();
        setCenterArea();


        setOnClicks();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(new Dimension(230, 250));
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLUE);
        setContentPane(mainPanel);
    }

    private void setCenterArea() {
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.black);
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setPreferredSize(new Dimension(200, 200));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;

        startButton = new JButton(" Start ");
        startButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(startButton, gbc);
        stopButton = new JButton(" Stop  ");
        stopButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(stopButton, gbc);

        mainPanel.add(centerPanel);
    }


    private void setOnClicks() {
        startButton.addActionListener(e -> {System.out.println("Start");});

        stopButton.addActionListener(e -> {System.out.println("Stop");});

    }

}
