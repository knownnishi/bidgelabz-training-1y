import java.util.*;

class TwoD_to_OneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of columns: ");
        col = input.nextInt();
        int twoD[][] = new int[row][col];
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoD[i][j] = input.nextInt();
            }
        }
        int oneD[] = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                oneD[index] = twoD[i][j];
                index++;
            }
        }
        System.out.println("1D Array:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
    }
}	