package j01_Homework.StringManipulationÖdev;

import java.util.Scanner;

public class Q9Ex {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime=sc.nextLine();
        System.out.println(kelime.substring(0,kelime.length()/2));

        }


    }

