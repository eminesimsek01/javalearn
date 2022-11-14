package j01_j02_Homework.ArraysEasyTask;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int minumumeleman=100;
        int array[]={14,19,5,21};
        for (int i=0; i<array.length; i++){
           if(minumumeleman>array[i]) {
               minumumeleman = array[i];
           }else{
               minumumeleman=minumumeleman;
           }
        }
        System.out.println("minumumeleman = " + minumumeleman);
    }

    }

