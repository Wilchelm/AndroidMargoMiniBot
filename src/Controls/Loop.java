package Controls;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Wilchelm on 29.06.2017.
 */
public class Loop  implements Runnable {
    Autoexp autoexp = new Autoexp();
    Arcymag arcymag = new Arcymag();
    Krok krok = new Krok();
    private volatile boolean cancelled;
    private BufferedImage image;

    public void run() {

        while (!cancelled) {

            Runtime rs = Runtime.getRuntime();

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

            krok.krokCheck();

            if (arcymag.arcymagcheck()==true) {

                if(arcymag.arcymagcheck()==true) {
                    arcymag.arcymag1();
                }
                else System.out.print("Nie znaleziono");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }


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

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }


                String mainCommand3=("cmd /B start cmd.exe /K \"adb shell screencap -p \"/sdcard/output.png\" && adb pull \"/sdcard/output.png\" \"C:\\Users\\X\\IdeaProjects\\output.png\" && adb shell rm \"/sdcard/output.png\" \"");
                try{
                    rs.exec(mainCommand3);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                if(arcymag.arcymagcheck()==true) {
                    arcymag.arcymag3();
                }
            }
            //if () {


            //}
            else {
                autoexp.exp();
                autoexp.exp2();
            }
        }
    }

    public void start(){
        cancelled = false;
        run();
    }

    public void stop() {
        cancelled = true;
        run();
    }

}