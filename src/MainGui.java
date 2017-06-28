import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by X on 28.06.2017.
 */
public class MainGui extends JFrame {

    private JButton startButton;
    private JButton stopButton;
    private JPanel mainPanel;

    private BufferedImage pierscien;
    private BufferedImage miecz;
    private BufferedImage naszyjnik;
    private BufferedImage rekawice;
    private BufferedImage zbroja;
    private BufferedImage image;

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
        startButton.addActionListener(e -> {System.out.println("Start");
            long start=System.currentTimeMillis();

                try {
                    pierscien = ImageIO.read(new File("C:\\Users\\X\\Desktop\\pierscien.png"));
                    miecz = ImageIO.read(new File("C:\\Users\\X\\Desktop\\miecz.png"));
                    naszyjnik = ImageIO.read(new File("C:\\Users\\X\\Desktop\\naszyjnik.png"));
                    rekawice = ImageIO.read(new File("C:\\Users\\X\\Desktop\\rekawice.png"));
                    zbroja = ImageIO.read(new File("C:\\Users\\X\\Desktop\\zbroja.png"));

                    image = ImageIO.read(new File("C:\\Users\\X\\Desktop\\3.png"));
                }
                catch (IOException es) {
                    es.printStackTrace();
                }

            if (compare(79,247, pierscien, image) == true) {
                System.out.println("1 pierscien");
            }
            if (compare(145,247, pierscien, image) == true) {
                System.out.println("2 pierscien");
            }
            if (compare(211,247, pierscien, image) == true) {
                System.out.println("3 pierscien");
            }
            if (compare(277,247, pierscien, image) == true) {
                System.out.println("4 pierscien");
            }
            if (compare(343,247, pierscien, image) == true) {
                System.out.println("5 pierscien");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, pierscien, image) == true) {
                System.out.println("6 pierscien");
            }
            if (compare(145,313, pierscien, image) == true) {
                System.out.println("7 pierscien");
            }
            if (compare(211,313, pierscien, image) == true) {
                System.out.println("8 pierscien");
            }
            if (compare(277,313, pierscien, image) == true) {
                System.out.println("9 pierscien");
            }
            if (compare(343,313, pierscien, image) == true) {
                System.out.println("10 pierscien");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, pierscien, image) == true) {
                System.out.println("11 pierscien");
            }
            if (compare(145,379, pierscien, image) == true) {
                System.out.println("12 pierscien");
            }
            if (compare(211,379, pierscien, image) == true) {
                System.out.println("13 pierscien");
            }
            if (compare(277,379, pierscien, image) == true) {
                System.out.println("14 pierscien");
            }
            if (compare(343,379, pierscien, image) == true) {
                System.out.println("15 pierscien");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, pierscien, image) == true) {
                System.out.println("16 pierscien");
            }
            if (compare(145,445, pierscien, image) == true) {
                System.out.println("17 pierscien");
            }
            if (compare(211,445, pierscien, image) == true) {
                System.out.println("18 pierscien");
            }
            if (compare(277,445, pierscien, image) == true) {
                System.out.println("19 pierscien");
            }
            if (compare(343,445, pierscien, image) == true) {
                System.out.println("20 pierscien");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, pierscien, image) == true) {
                System.out.println("21 pierscien");
            }
            if (compare(145,511, pierscien, image) == true) {
                System.out.println("22 pierscien");
            }
            if (compare(211,511, pierscien, image) == true) {
                System.out.println("23 pierscien");
            }
            if (compare(277,511, pierscien, image) == true) {
                System.out.println("24 pierscien");
            }
            if (compare(343,511, pierscien, image) == true) {
                System.out.println("25 pierscien");
            }



            long stop=System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): "+(stop-start));
        });

        stopButton.addActionListener(e -> {System.out.println("Stop");});

    }

    private boolean compare (int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g=0;

        for ( int y = b; y < (b+58); y++) {
            for (int x = a; x < (a+58); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x-a, y-b) == imgB.getRGB(x, y)) {
                    g=g+1;
                }
            }
        }

        if(g>3300) {
            return true;
        }
        else return false;

    }


}
