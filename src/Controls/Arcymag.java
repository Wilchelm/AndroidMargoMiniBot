package Controls;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wilchelm on 28.06.2017.
 */
public class Arcymag {

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
    private BufferedImage arcymaghelm;
    private BufferedImage arcymagbuty;


    private boolean compare(int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g = 0;

        for (int y = b; y < (b + 58); y++) {
            for (int x = a; x < (a + 58); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x - a, y - b) == imgB.getRGB(x, y)) {
                    g = g + 1;
                }
            }
        }

        if (g > 2500) {
            return true;
        } else return false;

    }

    private boolean whatcompare(int a, int b, BufferedImage imgA, BufferedImage imgB) {
        int g = 0;

        for (int y = b; y < (b + 39); y++) {
            for (int x = a; x < (a + 320); x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x - a, y - b) == imgB.getRGB(x, y)) {
                    g = g + 1;
                }
            }
        }

        if (g > 11000) {
            return true;
        } else return false;

    }

    public boolean arcymagcheck() {

        ClassLoader classLoader = getClass().getClassLoader();

        try {
            arcymagpierscien = ImageIO.read(new File(classLoader.getResource("arcymagpierscien.png").getFile()));
            arcymagmiecz = ImageIO.read(new File(classLoader.getResource("arcymagmiecz.png").getFile()));
            arcymagnaszyjnik = ImageIO.read(new File(classLoader.getResource("arcymagnaszyjnik.png").getFile()));
            arcymagrekawice = ImageIO.read(new File(classLoader.getResource("arcymagrekawice.png").getFile()));
            arcymagzbroja = ImageIO.read(new File(classLoader.getResource("arcymagzbroja.png").getFile()));
            arcymagbuty = ImageIO.read(new File(classLoader.getResource("arcymagbuty.png").getFile()));
            arcymaghelm = ImageIO.read(new File(classLoader.getResource("arcymaghelm.png").getFile()));

            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }

        if (whatcompare(80, 204, arcymagpierscien, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagpierscien, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymagmiecz, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagmiecz, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymagnaszyjnik, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagnaszyjnik, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymagrekawice, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagrekawice, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymagzbroja, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagzbroja, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymagbuty, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymagbuty, image) == true) {
            return true;
        }
        if (whatcompare(80, 204, arcymaghelm, image) == true) {
            return true;
        }
        if (whatcompare(80, 216, arcymaghelm, image) == true) {
            return true;
        } else return false;

    }

    private void sleep5() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void swipe(String x) {

        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec(x);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }


    public void arcymag1() {

        boolean zmienna = false;
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

            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));

        } catch (IOException es) {
            es.printStackTrace();
        }

        if (whatcompare(80, 204, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");

            ////////////////pierscien///////////

            if (compare(79, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");


            ////////////////pierscien///////////

            if (compare(79, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");

            ////////////////zbroja///////////

            if (compare(79, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");

            ////////////////zbroja///////////

            if (compare(79, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");

            ////////////////buty///////////

            if (compare(79, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");


            ////////////////buty///////////

            if (compare(79, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");

            ////////////////helm///////////

            if (compare(79, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");


            ////////////////helm///////////

            if (compare(79, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }

        System.out.println("Koniec arcymag1.");
    }


    public void arcymag2() {

        boolean zmienna = false;
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

            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }

        if (whatcompare(80, 204, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");


            ////////////////pierscien///////////

            if (compare(79, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");

            ////////////////pierscien///////////

            if (compare(79, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");

            ////////////////zbroja///////////

            if (compare(79, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");


            ////////////////zbroja///////////

            if (compare(79, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");

            ////////////////buty///////////

            if (compare(79, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");


            ////////////////buty///////////

            if (compare(79, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");

            ////////////////helm///////////

            if (compare(79, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");


            ////////////////helm///////////

            if (compare(79, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 242 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }

        System.out.println("Koniec arcymag2.");
    }


    public void arcymag3() {

        boolean zmienna = false;
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

            image = ImageIO.read(new File("C:\\Users\\X\\IdeaProjects\\output.png"));

        } catch (IOException es) {
            es.printStackTrace();
        }

        if (whatcompare(80, 204, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");

            ////////////////pierscien///////////

            if (compare(79, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagpierscien, image) == true) {

            System.out.println("Zwróć Arcymagowi: pierscien");

            ////////////////pierscien///////////

            if (compare(79, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, pierscien, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagmiecz, image) == true) {

            System.out.println("Zwróć Arcymagowi: miecz");

            ////////////////miecz///////////

            if (compare(79, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, miecz, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagnaszyjnik, image) == true) {

            System.out.println("Zwróć Arcymagowi: naszyjnik");

            ////////////////naszyjnik///////////

            if (compare(79, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, naszyjnik, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagrekawice, image) == true) {

            System.out.println("Zwróć Arcymagowi: rekawice");

            ////////////////rekawice///////////

            if (compare(79, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, rekawice, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");

            ////////////////zbroja///////////

            if (compare(79, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagzbroja, image) == true) {

            System.out.println("Zwróć Arcymagowi: zbroja");

            ////////////////zbroja///////////

            if (compare(79, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, zbroja, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");

            ////////////////buty///////////

            if (compare(79, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymagbuty, image) == true) {

            System.out.println("Zwróć Arcymagowi: buty");

            ////////////////buty///////////

            if (compare(79, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, buty, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }


        if (whatcompare(80, 204, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");


            ////////////////helm///////////

            if (compare(79, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }

            if (compare(145, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 243, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 309, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 375, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 441, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 507, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
        }
        if (whatcompare(80, 216, arcymaghelm, image) == true) {

            System.out.println("Zwróć Arcymagowi: helm");

            ////////////////helm///////////

            if (compare(79, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 255, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 280 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 321, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 345 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 387, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 410 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 453, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 475 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(145, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(211, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(277, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }
            }
            if (compare(343, 519, helm, image) == true) {
                if (zmienna == false) {
                    String x = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 307 180\"");
                    swipe(x);
                    zmienna = true;
                }

            }
        }

        System.out.println("Koniec arcymag3.");
    }
}

