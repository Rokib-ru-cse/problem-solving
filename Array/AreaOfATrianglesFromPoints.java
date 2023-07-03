package Array;

public class AreaOfATrianglesFromPoints {
 
    public static double areaOfATrianglesFromPoints(int [][] arr){

        double a = Math.sqrt((arr[0][0]-arr[1][0])*(arr[0][0]-arr[1][0])+(arr[0][1]-arr[1][1])*(arr[0][1]-arr[1][1]));
        double b = Math.sqrt((arr[1][0]-arr[2][0])*(arr[1][0]-arr[2][0])+(arr[1][1]-arr[2][1])*(arr[1][1]-arr[2][1]));
        double c = Math.sqrt((arr[0][0]-arr[2][0])*(arr[0][0]-arr[2][0])+(arr[0][1]-arr[2][1])*(arr[0][1]-arr[2][1]));

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return area;
    }
    
    public static void main(String[] args) {
        System.out.println(areaOfATrianglesFromPoints(new int[][]{{0,0},{2,0},{2,5}}));
    }
}
