package collections;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
//        ArrayList<int> arrayList = new ArrayList<int>();
//        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        ArrayList<Integer> arrayListForLoop = new ArrayList<Integer>();
        for (int i= 1; i<6;i++){
            arrayListForLoop.add(i);    //1-2-3-4-5
        }
        arrayListForLoop.add(2);
        arrayListForLoop.add(2);
        System.out.println(arrayListForLoop);
        System.out.println("********************************************");
//        arrayListForLoop.remove(3);
        System.out.println(arrayListForLoop);
        System.out.println("********************************************");
        for(Integer i : arrayListForLoop){
            System.out.print(i+" ");    // 1 2 3 4 5
        }
        System.out.println(" ");
        arrayListForLoop.removeIf(num -> num ==2);
//        for(Integer i : arrayListForLoop){
//            if(i == 2){
//                arrayListForLoop.remove(i);
//            }
//        }
//        for (int i = 1; i<arrayListForLoop.size();i++){
//            if (arrayListForLoop.get(i) == 3){
//                arrayListForLoop.remove(i); // 1 2 4 5  index olarak da 2'deyiz - 3 geçtik - 4 geçtik - 5 geçtik
//                i--;
//            }
//
//        }
        System.out.println(arrayListForLoop);
    }
}
