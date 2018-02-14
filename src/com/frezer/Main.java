package com.frezer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("Frx.txt");
        int[] integers = new int[10];
        int i = 0;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                integers[i] = input.nextInt();
                i++;
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(integers));

        int sum = IntStream.of(integers).sum();
        System.out.println(" ");
        System.out.println("The sum is " + (double)sum);
        System.out.println(" ");
        System.out.println("The Avarage value is " + (double) sum/10);
    }
}
