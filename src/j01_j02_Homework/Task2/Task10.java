package j01_j02_Homework.Task2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        // formula

        // c = (f-32)*5/9
        Scanner scan=new Scanner(System.in);
        System.out.println("Please give a temperature as Fahrenheit : ");
        double fahrenheit=scan.nextDouble();
        double celsius=((fahrenheit-32)*5/9);
        System.out.println("Temperature as celsius unit = " + celsius);


    }







}
