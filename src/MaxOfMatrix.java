import java.util.Scanner;

public class MaxOfMatrix {
    public static int[][] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i< size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return array;
    }
    public static void printArr(int[][] arr) {
        for (int i =0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void searchMaxValue(int[][] arr) {
        int max = arr[0][0];
        for (int i =0; i < arr.length; i++) {
            for (int j =0; j< arr[i].length; j++) {
                if (max<arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[][] arr = creatArr();
        printArr(arr);
        System.out.println();
        searchMaxValue(arr);
    }
}
