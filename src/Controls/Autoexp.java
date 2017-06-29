package Controls;

import java.io.IOException;

/**
 * Created by X on 28.06.2017.
 */
public class Autoexp {
    Runtime rs = Runtime.getRuntime();

    public void exp() {
        String jeden = ("cmd /B start cmd.exe /K \"adb shell input tap 350 430\"");
        String dwa = ("cmd /B start cmd.exe /K \"adb shell input tap 350 740\"");

        try {
            try {
                rs.exec(jeden).waitFor();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        catch (InterruptedException exception) {
        }

        try {
            try {
                rs.exec(jeden).waitFor();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        catch (InterruptedException exception) {
        }
    }
}
