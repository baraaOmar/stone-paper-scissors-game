/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import com.sun.org.apache.bcel.internal.util.SecuritySupport;
import java.awt.event.ActionListener;
import java.io.File;
//import java.io.IOException;
import java.io.InputStream;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.Timer;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import static sun.audio.AudioPlayer.player;
import sun.audio.AudioStream;

/**
 *
 * @author Visitor
 */
public class JavaApplication28 {

//    Hwm a1 = new Hwm("rock", 1);
//    Hwm a2 = new Hwm("paper", 1);
//    Hwm a3 = new Hwm("spong", 1);
//    Hwm a4 = new Hwm("air", 1);
//    Hwm a5 = new Hwm("fire", 1);
//    Hwm a6 = new Hwm("water", 1);
//    Hwm a7 = new Hwm("scissor", 1);
    int secondPassed = 0;

    public JavaApplication28(String a, String b) {
        TheWinnerInColm(a, b);

    }
    static String[][] aa = {{"rock", "fire", "scissor", "spong"},
    {"fire", "scissor", "paper", "spong"},
    {"spong", "paper", "air", "water"},
    {"scissor", "paper", "air", "sponge"},
    {"paper", "rock", "air", "water"},
    {"air", "fire", "rock", "water"},
    {"water", "rock", "fire", "scissor"}
    };
//    public  void time(String[] args) {
//        ActionListener al = null;
////        Timer timer=new Timer(0);
//Timer myTimer=new Timer(secondPassed, al);
//        TimerTask task=new TimerTask() {
//            @Override
//            public void run() {
//                secondPassed++;System.out.println("sec"+secondPassed);
//            }
//        }
//    }
//    public void start(){
//    myTimer.
//
//    }

    public String TheWinnerInColm(String a, String b) {
        boolean flag = false;
        int num = 0;
        int j = 0;
        for (int i = 0; i < 7; i++) {
            if (aa[i][j].equals(a)) {
//

                flag = true;
                num = i;
                break;
            }

        }
        for (int i = 0; i < 4; i++) {

            if (aa[num][i].equals(b)) {
//
//                System.out.println(a);
                return a;

            }
        }

        for (int i = 0; i < 7; i++) {
            if (aa[i][0].equalsIgnoreCase(b)) {
                num = i;
                break;
            }

        }
        for (int i = 0; i < 4; i++) {
            if (aa[num][i].equals(a)) {
//                System.out.println(b);
                return b;
            }
        }
        return "";
    }

    public String m(String a, String b) {
        if (a.equals("rock") && b.equals("fire")) {
            return "Rock pound out the fire";
        }
        if (a.equals("rock") && b.equals("rock")) {
            return "THE SAME";
        }
        if (a.equals("fire") && b.equals("fire")) {
            return "THE SAME";
        }
        if (a.equals("paper") && b.equals("paper")) {
            return "THE SAME";
        }
        if (a.equals("sponge") && b.equals("sponge")) {
            return "THE SAME";
        }
        if (a.equals("scissor") && b.equals("scissor")) {
            return "THE SAME";
        }
        if (a.equals("water") && b.equals("water")) {
            return "THE SAME";
        }
        if (a.equals("air") && b.equals("air")) {
            return "THE SAME";
        } else if (a.equals("rock") && b.equals("scissor")) {
            return "Rock crushs scissor";
        } else if (a.equals("rock") && b.equals("sponge")) {
            return "Rock crushs sponge";
        } else if (a.equals("fire") && (b.equals("sponge") || b.equals("paper"))) {
            return "fire burn" + b;
        } else if (a.equals("fire") && (b.equals("scissor"))) {
            return "fire melt" + b;
        } else if (a.equals("scissor") && (b.equals("air"))) {
            return a + " swich throw air" + b;
        } else if (a.equals("scissor") && (b.equals("sponge") || b.equals("paper"))) {
            return a + " cut" + b;
        } else if (a.equals("sponge") && b.equals("paper")) {
            return a + " saoks paper" + b;
        } else if (a.equals("sponge") && b.equals("air")) {
            return a + " uses air pockets";
        } else if (a.equals("sponge") && b.equals("water")) {
            return a + " absorb water" + b;
        } else if (a.equals("paper") && b.equals("water")) {
            return a + " floats on" + b;
        } else if (a.equals("paper") && b.equals("air")) {
            return a + " fans" + b;
        } else if (a.equals("paper") && b.equals("rock")) {
            return a + " cover" + b;
        } else if (a.equals("air") && b.equals("fire")) {
            return a + " blows out fire" + b;
        } else if (a.equals("air") && b.equals("rock")) {
            return a + " crodes" + b;
        } else if (a.equals("air") && b.equals("water")) {
            return a + " evaporates" + b;
        } else if (a.equals("water") && b.equals("rock")) {
            return a + " erods" + b;
        } else if (a.equals("water") && b.equals("fire")) {
            return a + " puts on" + b;
        } else if (a.equals("water") && b.equals("scissor")) {
            return a + " rusts" + b;

        } else {
            return "";
        }
    }

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String a = s.next();
//        String b = s.next();
//        TheWinnerInColm(a, b);
//    }
    public static void music() {
        try {
            InputStream d = JavaApplication28.class.getResourceAsStream("/Music/baraa.wav");
            AudioStream a = new AudioStream(d);
            AudioPlayer.player.start(a);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void music2() {
        try {
            InputStream d = JavaApplication28.class.getResourceAsStream("/Music/foz.wav");
            AudioStream a = new AudioStream(d);
            AudioPlayer.player.start(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void music3() {
        try {
            InputStream d = JavaApplication28.class.getResourceAsStream("/Music/bb.wav");
            AudioStream a = new AudioStream(d);
            AudioPlayer.player.start(a);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void music4() {
        try {
            InputStream d = JavaApplication28.class.getResourceAsStream("/Music/z.wav");
            AudioStream a = new AudioStream(d);
            AudioPlayer.player.start(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JavaApplication28 v = new JavaApplication28("rock", "paper");
        System.out.println(v.TheWinnerInColm("paper", "fire"));

    }
}
