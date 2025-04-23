package collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
//        baseHashSet();
        person();
    }

    private static void baseHashSet() {
        HashSet<String> StringHashSet= new HashSet<String>();
        StringHashSet.add("A");
        StringHashSet.add("B");
        StringHashSet.add("C");
        StringHashSet.add("D");
        StringHashSet.add("E");
        System.out.println(StringHashSet);
//        HashSet<Integer> integerHashSet = new HashSet<>();
//        integerHashSet.add(1);
//        integerHashSet.add(2);
//        integerHashSet.add(3);
//        integerHashSet.add(4);
//        integerHashSet.remove(0);
//        integerHashSet.remove(1);
//        for(Integer i : integerHashSet){
//            System.out.println(i);
//        }
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
    }

    private static void person() {
        HashSet<Person> personHashSet = new HashSet<>();
        Person burak1 = new Person("Burak");
        Person burak2 = new Person("Burak");
        Person emrah1 = new Person("Emrah");
        Person emrah2 = new Person("Emrah2");
        Person emrah3 = new Person("Emrah3");
        personHashSet.add(burak1);
        personHashSet.add(burak2);
        personHashSet.add(emrah1);
        personHashSet.add(emrah2);
        personHashSet.add(emrah3);
        for(Person person : personHashSet) {
            System.out.println(person.getName());
        }
//        System.out.println(burak1.hashCode());  // 1705736037 -- 64550601
//        System.out.println(burak2.hashCode());  // 455659002  -- 64550601
//        System.out.println(emrah1.hashCode());  // 250421012  -- 67082833
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
//        System.out.println(personHashSet.size());
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
//        for (Person person : personHashSet) {
//            System.out.println(person.getName());
//        }
//        System.out.println("**************************************************************");
//        System.out.println("**************************************************************");
//        personHashSet.add(null);
//        System.out.println(personHashSet.size());
//        System.out.println(personHashSet);
    }
}
