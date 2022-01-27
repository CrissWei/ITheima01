package WIX1003_FinalTest;

import java.util.Random;

/*
* Write a Java program to
perform the following task:
▪ Generate 3 random price values (100.00-300.00)
* and display the price values in two decimal places.
▪ Generate 5 random even-numbered years (1990-2030) and display the years.
*
▪ Generate 1 random car plate number and display the car plate number.
The car plate number begin with 5 digits and end with two uppercase letters.
*
▪ Generate 1 random word and display the word. The word consists of maximum 8
characters and each character must be from a-z or A-Z.
*
You must use the Random class nextInt(int bound), nextDouble() methods and char c =
'Z'; to solve the above problems.

* */
public class S2004131_Q1 {
    public static void main(String[] args) {

        methodQ1();
        System.out.println("===");
        methodQ2();
        System.out.println("===");
        methodQ3();
        System.out.println("===");
        methodQ4();
        System.out.println("===");
    }

    // Generate 1 random word and display the word. The word consists of maximum 8
    //characters and each character must be from a-z or A-Z.
    private static void methodQ4() {

            // Random number
            Random random = new Random();

            int count = 0;

            String str = "";

            while (true) {
                if (count == 8) {
                    break;
                }
                char c = (char) random.nextInt(123);

                if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) { // 满足
                    str += c;
                    count++;
                }
            }

            System.out.println(str);
    }

    private static void methodQ3() {
//▪ Generate 1 random car plate number and display the car plate number.
//The car plate number begin with 5 digits and end with two uppercase大写 letters.
        Random random = new Random();

        // Random numbers
        int licensePlateBegin = random.nextInt(90000) + 10000;

        // licensePlateEnd to receive
        String licensePlateEnd = "";

        //Random number to char
        for (int i = 0; i < 2; i++) {
            char end = (char)(random.nextInt(26) + 65);
            licensePlateEnd += end;
        }
        System.out.println(licensePlateBegin + licensePlateEnd);

    }

    // Generate 5 random even-numbered years (1990-2030) and display the years.
    private static void methodQ2() {
        Random random = new Random();

        int num = 0;
        int year;
        while (true) {

            if (num == 5) {
                break;
            }

            year = random.nextInt(41) + 1990;

            // if even or not
            if (year % 2 == 0) {// it is even

                num++;
                System.out.println(year);
            }
        }
    }


    public static void methodQ1(){
        //Random number
        Random random = new Random();
       /*
       for (int i = 0; i < 3; i++) {
            //int price = random.nextInt(201) + 100;
            double price = (random.nextInt(201) + 100) * 1.00;
            //System.out.printf("%.2f",num);
            //System.out.println("the price values "+price);

            System.out.println(String.format("%.2f", price));
            //System.out.println(price);
        }*/

        for (int i = 0; i < 3; i++) {
            double price = 100 + 200 * random.nextDouble();
            System.out.println(String.format("%.2f", price));
            //System.out.printf("%.2f", price);
        }
    }
}
