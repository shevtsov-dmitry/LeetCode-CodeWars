package code_wars.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DirectionsReduction {

    public static void main(String[] args) {
        dirReduc(new String[]{"UP", "LEFT", "DOWN", "RIGHT"});
        dirReduc(new String[]{"UP", "DOWN", "DOWN", "RIGHT", "LEFT", "UP", "LEFT"});
    }
    public static String[] dirReduc(String[] arr) {
        int x = 0;
        int y = 0;
        for (String str : arr) {
            switch (str){
                case "UP" -> y++;
                case "DOWN" -> y--;
                case "LEFT" -> x--;
                case "RIGHT" -> x++;
            }
        }
        System.out.print("x = " + x);
        System.out.println("\ty = " + y);


        return new String[]{};

    }
}
