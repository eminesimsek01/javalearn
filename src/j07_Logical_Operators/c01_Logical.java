package j07_Logical_Operators;

public class c01_Logical {
    public static void main(String[] args) {
        /*
        -------- && - and - (ve)---------

                True   &&    True    -->  True
        True   &&    False   -->  False
        False  &&    True    -->  False
        False  &&    False   -->  False


                -------- ||- or - (veya)---------

                True   ||    True    -->  True
        True   ||    False   -->  True
        False  ||    True    -->  True
        False  ||    False   -->  False
         */
        //and &
    boolean b1=true;
    int a=3;
    int c=7;
        System.out.println(b1&(a<c));//True
        System.out.println(b1&&(a>c));//False
        System.out.println(b1&(a==c));//False
        //or->veya
        System.out.println(b1||(a<c));//True
        System.out.println(b1||(a>c));//True
        System.out.println(b1||(a==c));//True
       //Değil !=
        System.out.println(!(b1&&(a<c)));//False
        System.out.println(!(b1&(a>c)));//True
        System.out.println(!(b1||(a==c)));//False
    }
}
