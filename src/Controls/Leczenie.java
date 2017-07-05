package Controls;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wilchelm on 02.07.2017.
 */
public class Leczenie {

    private BufferedImage image;
    private BufferedImage no_hp;
    private BufferedImage porazka;

    private boolean compare(int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g = 0;

        for (int y = b; y < (b + 10); y++) {
            for (int x = a; x < (a + 49); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x - a, y - b) == imgB.getRGB(x, y)) {
                    g = g + 1;
                }
            }
        }

        if (g > 480) {
            return true;
        } else return false;
    }

    private boolean compare2(int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g = 0;

        for (int y = b; y < (b + 20); y++) {
            for (int x = a; x < (a + 3); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x - a, y - b) == imgB.getRGB(x, y)) {
                    g = g + 1;
                }
            }
        }

        if (g > 20) {
            return true;
        } else return false;
    }

    public void leczenie() {
        ClassLoader classLoader = getClass().getClassLoader();
        Runtime rs = Runtime.getRuntime();

        try {
            porazka = ImageIO.read(new File(classLoader.getResource("porazka.png").getFile()));
            no_hp = ImageIO.read(new File(classLoader.getResource("no_hp.png").getFile()));
            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }

        if(compare(216,115, no_hp, image)==true) {

           String jeden = ("cmd /B start cmd.exe /K \"adb shell input tap 50 440\"");

            try {
                rs.exec(jeden);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            String dwa = ("cmd /B start cmd.exe /K \"adb shell input tap 380 650\"");

            try {
                rs.exec(dwa);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }

        else if(compare2(192,195, porazka, image)==true) {

            String jeden = ("cmd /B start cmd.exe /K \"adb shell input tap 50 440\"");

            try {
                rs.exec(jeden);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            String dwa = ("cmd /B start cmd.exe /K \"adb shell input tap 380 650\"");

            try {
                rs.exec(dwa);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
    }


}
