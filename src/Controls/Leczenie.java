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

    public void leczenie() {
        ClassLoader classLoader = getClass().getClassLoader();

        try {
            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }
    }
}
