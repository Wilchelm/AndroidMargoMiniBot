import Controls.Arcymag;
import Controls.Autoexp;
import Controls.Loop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by X on 28.06.2017.
 */
public class MainGui extends JFrame {

    private JButton startButton;
    private JButton stopButton;
    private JPanel mainPanel;
    private JButton arcymagButton;

    Arcymag arcymag = new Arcymag();
    Loop loop = new Loop();


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
        setSize(new Dimension(230, 350));
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
        centerPanel.setPreferredSize(new Dimension(200, 300));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;

        startButton = new JButton(" Start ");
        startButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(startButton, gbc);
        stopButton = new JButton(" Stop  ");
        stopButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(stopButton, gbc);
        arcymagButton = new JButton("Arcymag");
        arcymagButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(arcymagButton, gbc);

        mainPanel.add(centerPanel);
    }

    private void setOnClicks() {
        startButton.addActionListener(e -> {
            Thread thread = new Thread() {
                public void run() {
                    loop.start();
                }
            };
            thread.start();
        });

        stopButton.addActionListener(e -> {
            Thread thread = new Thread() {
                public void run() {
                    loop.stop();
                }
            };
            thread.start();
        });

        arcymagButton.addActionListener(e -> {

            long start=System.currentTimeMillis();

            String mainCommand=("cmd /B start cmd.exe /K \"adb shell screencap -p /mnt/sdcard/output.png && adb pull /mnt/sdcard/output.png C:\\Users\\X\\Desktop\\output.png && adb shell rm /mnt/sdcard/output.png\"");
            try{
                Runtime.getRuntime().exec(mainCommand);
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            arcymag.arcymag();

            long stop=System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): "+(stop-start));
        });

    }

}
