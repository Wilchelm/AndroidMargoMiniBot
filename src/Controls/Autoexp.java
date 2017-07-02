package Controls;

import java.io.IOException;

/**
 * Created by Wilchelm on 28.06.2017.
 */
public class Autoexp {
    Runtime rs = Runtime.getRuntime();

    public void exp() {
        String jeden = ("cmd /B start cmd.exe /K \"adb shell input tap 350 430\"");


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
    }

    public void exp2() {
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
