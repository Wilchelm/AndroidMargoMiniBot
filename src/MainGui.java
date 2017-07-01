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
    int i=0;

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
        arcymagButton = new JButton("Stop -> Arcymag");
        arcymagButton.setPreferredSize(new Dimension(200, 100));
        centerPanel.add(arcymagButton, gbc);

        mainPanel.add(centerPanel);
    }

    private void setOnClicks() {

        startButton.addActionListener(e -> {
            if(i==0) {
                Thread thread = new Thread() {
                    public void run() {
                        loop.start();
                    }
                };
                thread.start();
                i=1;
            }
        });

        stopButton.addActionListener(e -> {
            Thread thread = new Thread() {
                public void run() {
                    loop.stop();
                }
            };
            thread.start();
            i=0;
        });

        arcymagButton.addActionListener(e -> {

            Runtime rs = Runtime.getRuntime();

            long start=System.currentTimeMillis();

            String mainCommand=("cmd /B start cmd.exe /K \"adb shell screencap -p \"/sdcard/output.png\" && adb pull \"/sdcard/output.png\" \"C:\\Users\\X\\IdeaProjects\\output.png\" && adb shell rm \"/sdcard/output.png\" \"");
            try{
                rs.exec(mainCommand);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            if(arcymag.arcymagcheck()==true) {
                arcymag.arcymag1();
            }
            else System.out.print("Nie znaleziono");

            String mainCommand2=("cmd /B start cmd.exe /K \"adb shell screencap -p \"/sdcard/output.png\" && adb pull \"/sdcard/output.png\" \"C:\\Users\\X\\IdeaProjects\\output.png\" && adb shell rm \"/sdcard/output.png\" \"");
            try{
                rs.exec(mainCommand2);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            if(arcymag.arcymagcheck()==true) {
                arcymag.arcymag2();
            }
            else System.out.print("Nie znaleziono");

            String mainCommand3=("cmd /B start cmd.exe /K \"adb shell screencap -p \"/sdcard/output.png\" && adb pull \"/sdcard/output.png\" \"C:\\Users\\X\\IdeaProjects\\output.png\" && adb shell rm \"/sdcard/output.png\" \"");
            try{
                rs.exec(mainCommand3);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            if(arcymag.arcymagcheck()==true) {
                arcymag.arcymag3();
            }
            else System.out.print("Nie znaleziono");
            long stop=System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): "+(stop-start));

        });

    }

}
