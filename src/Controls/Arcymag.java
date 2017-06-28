package Controls;

import java.awt.image.BufferedImage;

/**
 * Created by X on 28.06.2017.
 */
public class Arcymag {


    private boolean whatcompare (int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g=0;

        for ( int y = b; y < (b+320); y++) {
            for (int x = a; x < (a+43); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x-a, y-b) == imgB.getRGB(x, y)) {
                    g=g+1;
                }
            }
        }

        if(g>11000) {
            return true;
        }
        else return false;

    }


}
