//import java.util.Scanner;
//
//public class SelectionSort {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] a = new int[1];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (int)(Math.random()*100+1);
//        }
//        for (int i : a) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        int min = a[0];
//        int index = 0;
//        for (int i = 0; i < a.length; i++) {
//            min = a[i];
//            index = i;
//            for (int j = i+1; j < a.length; j++) {
//                if(a[j]<min){
//                    min = a[j];
//                    index = j;
//                }
//            }
//            int temp = a[i];
//            a[i] = min;
//            a[index] = temp;
//        }
//        for (int i : a) {
//            System.out.print(i+" ");
//        }
//    }
//}
