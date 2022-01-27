package WIX1003_FinalTest;

import java.io.*;
import java.util.Scanner;

class S2004131Q2 {
    static int count = 0;

    public static void main(String[] args) {
        try {
            Scanner countPpl = new Scanner(new FileInputStream("diving.txt"));

            while (countPpl.hasNextLine()) {
                count++;
                for (int i = 0; i < 5; i++) {
                    countPpl.nextLine();
                }
            }
            countPpl.close();

            Diving[] diving = new Diving[count];
            Scanner read = new Scanner(new FileInputStream("diving.txt"));

            for (int i = 0; i < count; i++) {
                String name = read.nextLine();
                String country = read.nextLine();

                double[][] score = new double[3][7];
                double[] difficulty = new double[3];
                for (int j = 0; j < score.length; j++) {
                    for (int k = 0; k < score[j].length; k++) {
                        score[j][k] = read.nextDouble();
                    }
                    difficulty[j] = read.nextDouble();
                }

                if (read.hasNextLine()) {
                    read.nextLine();
                }

                //diving[i] = new Diving(name, country, score, difficulty);
                System.out.println(diving[i].toString());
            }

            read.close();
            medal(diving);

        } catch (FileNotFoundException e) {
            System.out.println("File Can not found");
        } catch (IOException e) {
            System.out.println("Problem file input");
        }
    }

    public static void medal(Diving[] diving) {
        double[] rank = new double[count];

        for (int i = 0; i < count; i++) {
            //有问题啊
            //rank[i] = diving[i].getJudges_scores();
        }

        for (int pass = 0; pass < rank.length; pass++) {
            for (int i = 1; i < rank.length-1; i++) {
                if (rank[i] > rank[i+1]) {
                    double temp = rank[i];
                    rank[i] = rank[i+1];
                    rank[i+1] = temp;

                    Diving hold = diving[i];
                    diving[i] = diving[i+1];
                    diving[i+1] = hold;
                }
            }
        }
        System.out.println();

    }
}

