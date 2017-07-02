package Controls;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wilchelm on 02.07.2017.
 */
public class Krok {

    private BufferedImage image;
    private BufferedImage krok;

    private boolean compare(int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g = 0;

        for (int y = b; y < (b + 50); y++) {
            for (int x = a; x < (a + 300); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x - a, y - b) == imgB.getRGB(x, y)) {
                    g = g + 1;
                }
            }
        }

        if (g > 14000) {
            return true;
        } else return false;
    }


    public void krokCheck() {
        ClassLoader classLoader = getClass().getClassLoader();
        Runtime rs = Runtime.getRuntime();

        try {
            krok = ImageIO.read(new File(classLoader.getResource("krok.png").getFile()));
            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }

        if (compare(51,341,krok,image) == true) {
            String jeden = ("cmd /B start cmd.exe /K \"adb shell input tap 235 440\"");


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

            String dwa = ("cmd /B start cmd.exe /K \"adb shell input tap 350 740\"");

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
