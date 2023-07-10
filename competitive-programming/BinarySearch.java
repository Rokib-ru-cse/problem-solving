//import java.util.Scanner;
//
//public class BinarySearch {
//
//    public static int binarySearch(int[] a, int low_index, int high_index, int data) {
//        while (low_index <= high_index) {
//            int mid_index = (low_index + high_index) / 2;
//
//            if (a[mid_index] == data) {
//                return a[mid_index];
//            } else if (a[mid_index] > data) {
//                high_index = mid_index-1;
//            } else {
//                low_index = mid_index+1;
//            }
//        }
//        return -1;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] a = new int[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i;
//        }
//        Scanner in = new Scanner(System.in);
//        int data = in.nextInt();
//        int low_index = 0;
//        int high_index = a.length - 1;
//        System.out.println(binarySearch(a, low_index, high_index, data));
//    }
//}