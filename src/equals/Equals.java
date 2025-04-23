package equals;

public class Equals {
    public static void main(String[] args) {
//        nullName();
        equals();
        plusStringEquals();
    }

    private static void plusStringEquals() {
        String s1 = "java";         // java
        String s2 = "ja" + "va";    // java
        String replacedStr = s2.replace('a', ' ');
        System.out.println(replacedStr);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private static void nullName() {
        String burak = null;
        if("Burak".equals(burak)) {
            System.out.println("1. if bloğu calisti");
        } else if (burak.equals("Burak")) {
            System.out.println("2. if bloğu calisti");
        } else {
            System.out.println("Sonuncu blok calisti");
        }
    }

    private static void equals() {
//        String firstName1 = "Emrah";
//        String firstName2 = "Emrah";
//        System.out.println(firstName1 == firstName2);
//        System.out.println(firstName1.equals(firstName2));
//        System.out.println("firstName1 " + System.identityHashCode(firstName1));
//        System.out.println("firstName2 " + System.identityHashCode(firstName2));
//        System.out.println("*******************************************************************");
//        System.out.println("*******************************************************************");
        String firstName3 = "Burak";
        String firstName4 = new String("Burak");
        System.out.println(firstName3 == firstName4.intern()); // intern ile true döner, normalde false
        System.out.println(firstName3.equals(firstName4));
        System.out.println("firstName3 " + System.identityHashCode(firstName3));
        System.out.println("firstName4 " + System.identityHashCode(firstName4));
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");
    }
}
