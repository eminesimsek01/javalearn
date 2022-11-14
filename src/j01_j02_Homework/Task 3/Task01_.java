public class Task01_ {
	public static void main(String[] args) {
		int x = 4;
        x++; // 4 olarak yazdırır x=5
        x += x; //x=10
        --x; //x=9
        x = 7 + x; //x=16;
        x *= x; //216
        x -= 3; //253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a; //d=7.5
        a+=d;//a=10
        d-=a;//-2.5
        a-=d;//12

        System.out.println(" d = " + ++d );//-1.5
        System.out.println(" a = " + a-- );//12 yazdırır 11 hesaplar
        
        

	}

}
