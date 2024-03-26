package kelas;

import java.util.Scanner;

public class clsLCD {

    // Attributte //
    private String status;
    private int volume;
    private int brightness;
    private String cable;


    // Constructor //
    public clsLCD () {
        this.status = "off";
        this. volume = 50;
        this.brightness = 30;
        this.cable = "None";
    }


    // Method //
    // LCD Status
    public void setTurnoff (){
        this.status = "off";
    }
    public void setTurnon (){
        this.status = "on";
    }
    public void setfreeze (){
        this.status = "freeze";
    }

    // LCD volume
    public void setVolume (){
        Scanner input = new Scanner(System.in);
        System.out.println("input your volume : ");
        volume = input.nextInt();

        if (this.volume >= 0 && this.volume <= 100){
            this.volume = volume;
        } else {
            System.out.println("please set your volume between 0 - 100");
        }
    }
    public void setVolumeUp (){
        if (this.status.equalsIgnoreCase("on")){
            this.volume ++;
        }
    }
    public void setVolumeDown (){
        if (this.status.equalsIgnoreCase("on")){
            this.volume --;
        }
    }
    
    // LCD Brightness
    public void setBrightness (){
        Scanner input = new Scanner(System.in);
        System.out.println("input your brightness : ");
        brightness = input.nextInt();

        if (this.brightness >= 0 && this.brightness <= 100){
            this.brightness = brightness;
        } else {
            System.out.println("please set your brightness between 0 - 100");
        }
    }
    public void setBrightnessUp (){
        if (this.status.equalsIgnoreCase("on")){
            this.brightness ++;
        }
    }
    public void setBrightnessDown (){
        if (this.status.equalsIgnoreCase("on")){
            this.brightness --;
        }
    }

    // LCD Cable
    public enum cable {
        HDMI, VGA, DVI, DisplayPort;
    }
    public void setCable (cable kabel) {
        this.cable = kabel.name();
    }

    // Display System
    public void Display (){
        System.out.println("\nLCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }

}