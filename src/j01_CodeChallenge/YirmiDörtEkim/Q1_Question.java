package j01_CodeChallenge.YirmiDörtEkim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1_Question {
    public static void main(String[] args) {

        /*
        A list has elements "H", "G" and "E"
        Ask user to enter a letter
        If the letter exists in list convert it to "Got it"
        otherwise add it to the list.
        Example : [H, G, E]
                        Enter a letter :  h
                        [Got It, G, E]
                        Enter a letter :  a
                        [H, G, E, A]
              */
        List<String> list=new ArrayList<>();

        list.add("H");
        list.add("G");
        list.add("E");
        System.out.println("list = " + list);

        Scanner input=new Scanner(System.in);
        System.out.println("Bir harf giriniz : ");
        String letter=input.next().trim().substring(0,1).toUpperCase();

        if (list.contains(letter)) {
            list.set(list.indexOf(letter), "got it");
            }
        else
            list.add(letter);


        System.out.println(list);
        }

    }

