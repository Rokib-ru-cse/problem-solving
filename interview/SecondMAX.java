package interview;

public class SecondMAX {


    public static int secondMAX(int[] arr) {

        int firstMax = -1;
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(secondMAX(new int[]{1, 4, 2, 5, 7, 9, 12, 11}));
    }
}
