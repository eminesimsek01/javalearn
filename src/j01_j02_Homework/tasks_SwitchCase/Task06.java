package j01_j02_Homework.tasks_SwitchCase;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Açılımını öğrenmek istediğiniz harfi giriniz : ");
		char ch=scan.nextLine().toLowerCase().charAt(0);
		switch (ch) {
			case 'v':
				System.out.println("Very");
				break;
			case 'ı':
				System.out.println("Important");
				break;
			case 'p':
				System.out.println("Person");
				break;
		}
	}
}
