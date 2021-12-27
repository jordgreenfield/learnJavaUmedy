package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Convert pounds to kilograms here: ");
        double numberOfPounds = s.nextDouble();

        double convertToKilograms = numberOfPounds * 0.45359237d;//remember the D ;)

        System.out.println("Conversion = " + convertToKilograms);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;



    }
}


      /*  float myMinFloatValue = Float.MIN_VALUE;//32 bytes
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum Value = " + myMinFloatValue);
        System.out.println("Float maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;//64 bytes
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum Value = " + myMinDoubleValue);
        System.out.println("double maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;  //float not recommended to use
        float myCastFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;//f = float
        double myDoubleValue = 5.00 / 3.00;//d = double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);*/

/*
        byte b = 10;
        short s = 50;
        int i = 100;


        long l = (50000L) + 10L * (b + s + i);

        System.out.println(l);

        short shortTotal = (short)
                (1000 + 10 * (b + s + i));*/
