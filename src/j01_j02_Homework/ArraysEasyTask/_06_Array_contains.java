package j01_j02_Homework.ArraysEasyTask;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String array[]={"Apple", "Orange", "Banana", "Pineapple"};
        boolean flag=true;
        for (int i=0; i<array.length; i++){
            if (array[i].equalsIgnoreCase("apple")) {
                System.out.println(array[i]+" " + flag);
            }
            else {
                System.out.println(flag=false);
            }
        }
    }
}
