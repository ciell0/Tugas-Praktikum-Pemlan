package objek;
import kelas.clsLCD;

public class LCD {
    public static void main(String[] args) {
        clsLCD LCD1 = new clsLCD();

        // activate LCD
        LCD1.setTurnon();

        // volume setting
        LCD1.setVolume();
        LCD1.setVolumeUp();

        // brightness setting
        LCD1.setBrightness();
        LCD1.setBrightnessDown();

        // cable setting
        LCD1.setCable(clsLCD.cable.HDMI);

        // diplay result
        LCD1.Display();
    }
}
