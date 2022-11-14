package EmailCreationProjects;

public class Test {
    public static void main(String[] args) {
        StringBuilder strB1 = new StringBuilder("AVATAR");

        System.out.println("strB1.subSequence(1,5) = " + strB1.subSequence(1, 5));
        System.out.println("strB1.reverse() = " + strB1.reverse());

        System.out.println("strB1.deleteCharAt(2) = " + strB1.deleteCharAt(2));

        System.out.println(strB1);

    }

}
