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
    private BufferedImage helm;
    private BufferedImage buty;
    private BufferedImage arcymagpierscien;
    private BufferedImage arcymagmiecz;
    private BufferedImage arcymagnaszyjnik;
    private BufferedImage arcymagrekawice;
    private BufferedImage arcymagzbroja;
    private BufferedImage arcymagimage;
    private BufferedImage arcymaghelm;
    private BufferedImage arcymagbuty;


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
            ClassLoader classLoader = getClass().getClassLoader();

                try {

                    pierscien = ImageIO.read(new File(classLoader.getResource("pierscien.png").getFile()));
                    miecz = ImageIO.read(new File(classLoader.getResource("miecz.png").getFile()));
                    naszyjnik = ImageIO.read(new File(classLoader.getResource("naszyjnik.png").getFile()));
                    rekawice = ImageIO.read(new File(classLoader.getResource("rekawice.png").getFile()));
                    zbroja = ImageIO.read(new File(classLoader.getResource("zbroja.png").getFile()));
                    buty = ImageIO.read(new File(classLoader.getResource("buty.png").getFile()));
                    helm = ImageIO.read(new File(classLoader.getResource("helm.png").getFile()));

                    arcymagpierscien = ImageIO.read(new File(classLoader.getResource("arcymagpierscien.png").getFile()));
                    arcymagmiecz = ImageIO.read(new File(classLoader.getResource("arcymagmiecz.png").getFile()));
                    arcymagnaszyjnik = ImageIO.read(new File(classLoader.getResource("arcymagnaszyjnik.png").getFile()));
                    arcymagrekawice = ImageIO.read(new File(classLoader.getResource("arcymagrekawice.png").getFile()));
                    arcymagzbroja = ImageIO.read(new File(classLoader.getResource("arcymagzbroja.png").getFile()));
                    arcymagbuty = ImageIO.read(new File(classLoader.getResource("arcymagbuty.png").getFile()));
                    arcymaghelm = ImageIO.read(new File(classLoader.getResource("arcymaghelm.png").getFile()));

                    image = ImageIO.read(new File("C:\\Users\\X\\Desktop\\7.png"));
                }
                catch (IOException es) {
                    es.printStackTrace();
                }

            if(whatcompare(80,204,arcymagbuty,image)==true){
                System.out.println("buty");
            }
            if(whatcompare(80+8,204+8,arcymagbuty,image)==true){
                System.out.println("buty");
            }
            if(whatcompare(80,204,arcymaghelm,image)==true){
                System.out.println("helm");
            }
            if(whatcompare(80+8,204+8,arcymaghelm,image)==true){
                System.out.println("helm");
            }
            if(whatcompare(80,204,arcymagzbroja,image)==true){
                System.out.println("zbroja");
            }
            if(whatcompare(80+8,204+8,arcymagzbroja,image)==true){
                System.out.println("zbroja");
            }
            if(whatcompare(80,204,arcymagpierscien,image)==true){
                System.out.println("pierscien");
            }
            if(whatcompare(80+8,204+8,arcymagpierscien,image)==true){
                System.out.println("pierscien");
            }
            if(whatcompare(80,204,arcymagmiecz,image)==true){
                System.out.println("miecz");
            }
            if(whatcompare(80+8,204+8,arcymagmiecz,image)==true){
                System.out.println("miecz");
            }
            if(whatcompare(80,204,arcymagnaszyjnik,image)==true){
                System.out.println("naszyjnik");
            }
            if(whatcompare(80+8,204+8,arcymagnaszyjnik,image)==true){
                System.out.println("naszyjnik");
            }
            if(whatcompare(80,204,arcymagrekawice,image)==true){
                System.out.println("rekawice");
            }
            if(whatcompare(80+8,204+8,arcymagrekawice,image)==true){
                System.out.println("rekawice");
            }





            ////////////////helm///////////

            if (compare(79,247, helm, image) == true) {
                System.out.println("1 helm");
            }
            if (compare(145,247, helm, image) == true) {
                System.out.println("2 helm");
            }
            if (compare(211,247, helm, image) == true) {
                System.out.println("3 helm");
            }
            if (compare(277,247, helm, image) == true) {
                System.out.println("4 helm");
            }
            if (compare(343,247, helm, image) == true) {
                System.out.println("5 helm");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, helm, image) == true) {
                System.out.println("6 helm");
            }
            if (compare(145,313, helm, image) == true) {
                System.out.println("7 helm");
            }
            if (compare(211,313, helm, image) == true) {
                System.out.println("8 helm");
            }
            if (compare(277,313, helm, image) == true) {
                System.out.println("9 helm");
            }
            if (compare(343,313, helm, image) == true) {
                System.out.println("10 helm");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, helm, image) == true) {
                System.out.println("11 helm");
            }
            if (compare(145,379, helm, image) == true) {
                System.out.println("12 helm");
            }
            if (compare(211,379, helm, image) == true) {
                System.out.println("13 helm");
            }
            if (compare(277,379, helm, image) == true) {
                System.out.println("14 helm");
            }
            if (compare(343,379, helm, image) == true) {
                System.out.println("15 helm");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, helm, image) == true) {
                System.out.println("16 helm");
            }
            if (compare(145,445, helm, image) == true) {
                System.out.println("17 helm");
            }
            if (compare(211,445, helm, image) == true) {
                System.out.println("18 helm");
            }
            if (compare(277,445, helm, image) == true) {
                System.out.println("19 helm");
            }
            if (compare(343,445, helm, image) == true) {
                System.out.println("20 helm");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, helm, image) == true) {
                System.out.println("21 helm");
            }
            if (compare(145,511, helm, image) == true) {
                System.out.println("22 helm");
            }
            if (compare(211,511, helm, image) == true) {
                System.out.println("23 helm");
            }
            if (compare(277,511, helm, image) == true) {
                System.out.println("24 helm");
            }
            if (compare(343,511, helm, image) == true) {
                System.out.println("25 helm");
            }

            ////////////////buty///////////

            if (compare(79,247, buty, image) == true) {
                System.out.println("1 buty");
            }
            if (compare(145,247, buty, image) == true) {
                System.out.println("2 buty");
            }
            if (compare(211,247, buty, image) == true) {
                System.out.println("3 buty");
            }
            if (compare(277,247, buty, image) == true) {
                System.out.println("4 buty");
            }
            if (compare(343,247, buty, image) == true) {
                System.out.println("5 buty");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, buty, image) == true) {
                System.out.println("6 buty");
            }
            if (compare(145,313, buty, image) == true) {
                System.out.println("7 buty");
            }
            if (compare(211,313, buty, image) == true) {
                System.out.println("8 buty");
            }
            if (compare(277,313, buty, image) == true) {
                System.out.println("9 buty");
            }
            if (compare(343,313, buty, image) == true) {
                System.out.println("10 buty");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, buty, image) == true) {
                System.out.println("11 buty");
            }
            if (compare(145,379, buty, image) == true) {
                System.out.println("12 buty");
            }
            if (compare(211,379, buty, image) == true) {
                System.out.println("13 buty");
            }
            if (compare(277,379, buty, image) == true) {
                System.out.println("14 buty");
            }
            if (compare(343,379, buty, image) == true) {
                System.out.println("15 buty");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, buty, image) == true) {
                System.out.println("16 buty");
            }
            if (compare(145,445, buty, image) == true) {
                System.out.println("17 buty");
            }
            if (compare(211,445, buty, image) == true) {
                System.out.println("18 buty");
            }
            if (compare(277,445, buty, image) == true) {
                System.out.println("19 buty");
            }
            if (compare(343,445, buty, image) == true) {
                System.out.println("20 buty");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, buty, image) == true) {
                System.out.println("21 buty");
            }
            if (compare(145,511, buty, image) == true) {
                System.out.println("22 buty");
            }
            if (compare(211,511, buty, image) == true) {
                System.out.println("23 buty");
            }
            if (compare(277,511, buty, image) == true) {
                System.out.println("24 buty");
            }
            if (compare(343,511, buty, image) == true) {
                System.out.println("25 buty");
            }

            ////////////////miecz///////////

            if (compare(79,247, miecz, image) == true) {
                System.out.println("1 miecz");
            }
            if (compare(145,247, miecz, image) == true) {
                System.out.println("2 miecz");
            }
            if (compare(211,247, miecz, image) == true) {
                System.out.println("3 miecz");
            }
            if (compare(277,247, miecz, image) == true) {
                System.out.println("4 miecz");
            }
            if (compare(343,247, miecz, image) == true) {
                System.out.println("5 miecz");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, miecz, image) == true) {
                System.out.println("6 miecz");
            }
            if (compare(145,313, miecz, image) == true) {
                System.out.println("7 miecz");
            }
            if (compare(211,313, miecz, image) == true) {
                System.out.println("8 miecz");
            }
            if (compare(277,313, miecz, image) == true) {
                System.out.println("9 miecz");
            }
            if (compare(343,313, miecz, image) == true) {
                System.out.println("10 miecz");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, miecz, image) == true) {
                System.out.println("11 miecz");
            }
            if (compare(145,379, miecz, image) == true) {
                System.out.println("12 miecz");
            }
            if (compare(211,379, miecz, image) == true) {
                System.out.println("13 miecz");
            }
            if (compare(277,379, miecz, image) == true) {
                System.out.println("14 miecz");
            }
            if (compare(343,379, miecz, image) == true) {
                System.out.println("15 miecz");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, miecz, image) == true) {
                System.out.println("16 miecz");
            }
            if (compare(145,445, miecz, image) == true) {
                System.out.println("17 miecz");
            }
            if (compare(211,445, miecz, image) == true) {
                System.out.println("18 miecz");
            }
            if (compare(277,445, miecz, image) == true) {
                System.out.println("19 miecz");
            }
            if (compare(343,445, miecz, image) == true) {
                System.out.println("20 miecz");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, miecz, image) == true) {
                System.out.println("21 miecz");
            }
            if (compare(145,511, miecz, image) == true) {
                System.out.println("22 miecz");
            }
            if (compare(211,511, miecz, image) == true) {
                System.out.println("23 miecz");
            }
            if (compare(277,511, miecz, image) == true) {
                System.out.println("24 miecz");
            }
            if (compare(343,511, miecz, image) == true) {
                System.out.println("25 miecz");
            }

            ////////////////zbroja///////////

            if (compare(79,247, zbroja, image) == true) {
                System.out.println("1 zbroja");
            }
            if (compare(145,247, zbroja, image) == true) {
                System.out.println("2 zbroja");
            }
            if (compare(211,247, zbroja, image) == true) {
                System.out.println("3 zbroja");
            }
            if (compare(277,247, zbroja, image) == true) {
                System.out.println("4 zbroja");
            }
            if (compare(343,247, zbroja, image) == true) {
                System.out.println("5 zbroja");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, zbroja, image) == true) {
                System.out.println("6 zbroja");
            }
            if (compare(145,313, zbroja, image) == true) {
                System.out.println("7 zbroja");
            }
            if (compare(211,313, zbroja, image) == true) {
                System.out.println("8 zbroja");
            }
            if (compare(277,313, zbroja, image) == true) {
                System.out.println("9 zbroja");
            }
            if (compare(343,313, zbroja, image) == true) {
                System.out.println("10 zbroja");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, zbroja, image) == true) {
                System.out.println("11 zbroja");
            }
            if (compare(145,379, zbroja, image) == true) {
                System.out.println("12 zbroja");
            }
            if (compare(211,379, zbroja, image) == true) {
                System.out.println("13 zbroja");
            }
            if (compare(277,379, zbroja, image) == true) {
                System.out.println("14 zbroja");
            }
            if (compare(343,379, zbroja, image) == true) {
                System.out.println("15 zbroja");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, zbroja, image) == true) {
                System.out.println("16 zbroja");
            }
            if (compare(145,445, zbroja, image) == true) {
                System.out.println("17 zbroja");
            }
            if (compare(211,445, zbroja, image) == true) {
                System.out.println("18 zbroja");
            }
            if (compare(277,445, zbroja, image) == true) {
                System.out.println("19 zbroja");
            }
            if (compare(343,445, zbroja, image) == true) {
                System.out.println("20 zbroja");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, zbroja, image) == true) {
                System.out.println("21 zbroja");
            }
            if (compare(145,511, zbroja, image) == true) {
                System.out.println("22 zbroja");
            }
            if (compare(211,511, zbroja, image) == true) {
                System.out.println("23 zbroja");
            }
            if (compare(277,511, zbroja, image) == true) {
                System.out.println("24 zbroja");
            }
            if (compare(343,511, zbroja, image) == true) {
                System.out.println("25 zbroja");
            }

            ////////////////pierscien///////////

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


            ///////////////naszyjnik////////

            if (compare(79,247, naszyjnik, image) == true) {
                System.out.println("1 naszyjnik");
            }
            if (compare(145,247, naszyjnik, image) == true) {
                System.out.println("2 naszyjnik");
            }
            if (compare(211,247, naszyjnik, image) == true) {
                System.out.println("3 naszyjnik");
            }
            if (compare(277,247, naszyjnik, image) == true) {
                System.out.println("4 naszyjnik");
            }
            if (compare(343,247, naszyjnik, image) == true) {
                System.out.println("5 naszyjnik");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, naszyjnik, image) == true) {
                System.out.println("6 naszyjnik");
            }
            if (compare(145,313, naszyjnik, image) == true) {
                System.out.println("7 naszyjnik");
            }
            if (compare(211,313, naszyjnik, image) == true) {
                System.out.println("8 naszyjnik");
            }
            if (compare(277,313, naszyjnik, image) == true) {
                System.out.println("9 naszyjnik");
            }
            if (compare(343,313, naszyjnik, image) == true) {
                System.out.println("10 naszyjnik");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, naszyjnik, image) == true) {
                System.out.println("11 naszyjnik");
            }
            if (compare(145,379, naszyjnik, image) == true) {
                System.out.println("12 naszyjnik");
            }
            if (compare(211,379, naszyjnik, image) == true) {
                System.out.println("13 naszyjnik");
            }
            if (compare(277,379, naszyjnik, image) == true) {
                System.out.println("14 naszyjnik");
            }
            if (compare(343,379, naszyjnik, image) == true) {
                System.out.println("15 naszyjnik");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, naszyjnik, image) == true) {
                System.out.println("16 naszyjnik");
            }
            if (compare(145,445, naszyjnik, image) == true) {
                System.out.println("17 naszyjnik");
            }
            if (compare(211,445, naszyjnik, image) == true) {
                System.out.println("18 naszyjnik");
            }
            if (compare(277,445, naszyjnik, image) == true) {
                System.out.println("19 naszyjnik");
            }
            if (compare(343,445, naszyjnik, image) == true) {
                System.out.println("20 naszyjnik");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, naszyjnik, image) == true) {
                System.out.println("21 naszyjnik");
            }
            if (compare(145,511, naszyjnik, image) == true) {
                System.out.println("22 naszyjnik");
            }
            if (compare(211,511, naszyjnik, image) == true) {
                System.out.println("23 naszyjnik");
            }
            if (compare(277,511, naszyjnik, image) == true) {
                System.out.println("24 naszyjnik");
            }
            if (compare(343,511, naszyjnik, image) == true) {
                System.out.println("25 naszyjnik");
            }

            /////////////rekawice/////////

            if (compare(79,247, rekawice, image) == true) {
                System.out.println("1 rekawice");
            }
            if (compare(145,247, rekawice, image) == true) {
                System.out.println("2 rekawice");
            }
            if (compare(211,247, rekawice, image) == true) {
                System.out.println("3 rekawice");
            }
            if (compare(277,247, rekawice, image) == true) {
                System.out.println("4 rekawice");
            }
            if (compare(343,247, rekawice, image) == true) {
                System.out.println("5 rekawice");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,313, rekawice, image) == true) {
                System.out.println("6 rekawice");
            }
            if (compare(145,313, rekawice, image) == true) {
                System.out.println("7 rekawice");
            }
            if (compare(211,313, rekawice, image) == true) {
                System.out.println("8 rekawice");
            }
            if (compare(277,313, rekawice, image) == true) {
                System.out.println("9 rekawice");
            }
            if (compare(343,313, rekawice, image) == true) {
                System.out.println("10 rekawice");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,379, rekawice, image) == true) {
                System.out.println("11 rekawice");
            }
            if (compare(145,379, rekawice, image) == true) {
                System.out.println("12 rekawice");
            }
            if (compare(211,379, rekawice, image) == true) {
                System.out.println("13 rekawice");
            }
            if (compare(277,379, rekawice, image) == true) {
                System.out.println("14 rekawice");
            }
            if (compare(343,379, rekawice, image) == true) {
                System.out.println("15 rekawice");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,445, rekawice, image) == true) {
                System.out.println("16 rekawice");
            }
            if (compare(145,445, rekawice, image) == true) {
                System.out.println("17 rekawice");
            }
            if (compare(211,445, rekawice, image) == true) {
                System.out.println("18 rekawice");
            }
            if (compare(277,445, rekawice, image) == true) {
                System.out.println("19 rekawice");
            }
            if (compare(343,445, rekawice, image) == true) {
                System.out.println("20 rekawice");
            }
            ////////////////////////////////////////////////////////

            if (compare(79,511, rekawice, image) == true) {
                System.out.println("21 rekawice");
            }
            if (compare(145,511, rekawice, image) == true) {
                System.out.println("22 rekawice");
            }
            if (compare(211,511, rekawice, image) == true) {
                System.out.println("23 rekawice");
            }
            if (compare(277,511, rekawice, image) == true) {
                System.out.println("24 rekawice");
            }
            if (compare(343,511, rekawice, image) == true) {
                System.out.println("25 rekawice");
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

        if(g>2500) {
            return true;
        }
        else return false;

    }

    private boolean whatcompare (int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g=0;

        for ( int y = b; y < (b+43); y++) {
            for (int x = a; x < (a+320); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x-a, y-b) == imgB.getRGB(x, y)) {
                    g=g+1;
                }
            }
        }

        if(g>13000) {
            return true;
        }
        else return false;

    }


}
