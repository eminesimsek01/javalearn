package j01_j02_Homework.ArraysEasyTask;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String a="$12 $23 $10 $2 $5 $2";
        String newarr[]=a.split(" ");
        int toplam=0;
        for (int i=0; i<newarr.length; i++){
              toplam+= Integer.parseInt( newarr[i].replace("$",""));
            }
        System.out.println("toplam = " + toplam);
    }



    }
