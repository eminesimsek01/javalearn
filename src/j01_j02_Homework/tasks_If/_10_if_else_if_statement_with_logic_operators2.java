package j01_j02_Homework.tasks_If;

public class _10_if_else_if_statement_with_logic_operators2 {

    public static void main(String[] args) {

/* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/
        int c=60;
        if (c%9==0&&c%5==0){
            System.out.println("The number can be divide with 9 and 5 without a remaining");
        }
        if(c%4==0&&c%5==0){
            System.out.println("The number can be divided with 4 and 15 without a remaining");
        }

    }
}
