package j01_j02_Homework.WhileLoopTasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		int i=100;
		while(i<1000){
			System.out.print(i % 4 == 0 && i % 6 == 0 ? i+" " : "");
			i++;
		}
		
		

		
		
			
	}

}
