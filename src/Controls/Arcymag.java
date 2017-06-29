package Controls;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by X on 28.06.2017.
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
    private BufferedImage arcymagimage;
    private BufferedImage arcymaghelm;
    private BufferedImage arcymagbuty;


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


    public void arcymag() {
        ClassLoader classLoader = getClass().getClassLoader();
        Runtime rs = Runtime.getRuntime();

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

            image = ImageIO.read(new File("C:\\Users\\X\\Desktop\\output.png"));
        } catch (IOException es) {
            es.printStackTrace();
        }

        if(whatcompare(80,204,arcymaghelm,image)==true) {

            System.out.println("helm");


            ////////////////helm///////////

            if (compare(79, 247, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {

                    try {
                        rs.exec(jeden).waitFor();
                        rs.exec(dwa).waitFor();
                        rs.exec(trzy).waitFor();
                    }
                    catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            
            if (compare(145, 247, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymaghelm,image)==true) {

            System.out.println("helm");


            ////////////////helm///////////

            if (compare(79, 259, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, helm, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,204,arcymagbuty,image)==true) {

            System.out.println("buty");


            ////////////////buty///////////

            if (compare(79, 247, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagbuty,image)==true) {

            System.out.println("buty");


            ////////////////buty///////////

            if (compare(79, 259, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, buty, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

        if(whatcompare(80,204,arcymagrekawice,image)==true) {

            System.out.println("rekawice");


            ////////////////rekawice///////////

            if (compare(79, 247, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagrekawice,image)==true) {

            System.out.println("rekawice");


            ////////////////rekawice///////////

            if (compare(79, 259, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, rekawice, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

        if(whatcompare(80,204,arcymagnaszyjnik,image)==true) {

            System.out.println("naszyjnik");


            ////////////////naszyjnik///////////

            if (compare(79, 247, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagnaszyjnik,image)==true) {

            System.out.println("naszyjnik");


            ////////////////naszyjnik///////////

            if (compare(79, 259, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, naszyjnik, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

        if(whatcompare(80,204,arcymagzbroja,image)==true) {

            System.out.println("zbroja");


            ////////////////zbroja///////////

            if (compare(79, 247, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagzbroja,image)==true) {

            System.out.println("zbroja");


            ////////////////zbroja///////////

            if (compare(79, 259, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, zbroja, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

        if(whatcompare(80,204,arcymagmiecz,image)==true) {

            System.out.println("miecz");


            ////////////////miecz///////////

            if (compare(79, 247, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagmiecz,image)==true) {

            System.out.println("miecz");


            ////////////////miecz///////////

            if (compare(79, 259, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, miecz, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

        if(whatcompare(80,204,arcymagpierscien,image)==true) {

            System.out.println("pierscien");


            ////////////////pierscien///////////

            if (compare(79, 247, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 247, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 247, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 247, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 247, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 313, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 313, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 313, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 313, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 313, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 379, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 379, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 379, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 379, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 379, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 445, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 445, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 445, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 445, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 445, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 511, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 511, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 511, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 511, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 511, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }
        if(whatcompare(80,216,arcymagpierscien,image)==true) {

            System.out.println("pierscien");


            ////////////////pierscien///////////

            if (compare(79, 259, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 259, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 259, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 259, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 259, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 270 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 325, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 325, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 325, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 325, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 325, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 335 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 381, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 381, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 381, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 381, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 381, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 400 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 457, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 457, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 457, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 457, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 457, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 470 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            ////////////////////////////////////////////////////////

            if (compare(79, 523, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 110 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(145, 523, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 172 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(211, 523, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 240 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(277, 523, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 305 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
            if (compare(343, 523, pierscien, image) == true) {
                String jeden = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 175 170\"");
                String dwa = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 240 170\"");
                String trzy = ("cmd /B start cmd.exe /K \"adb shell input swipe 370 535 305 170\"");

                try {
                    
                        try {
                            rs.exec(jeden).waitFor();
                            rs.exec(dwa).waitFor();
                            rs.exec(trzy).waitFor();
                        }
                        catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
                catch (InterruptedException exception) {
                }
            }
        }

    }



}
