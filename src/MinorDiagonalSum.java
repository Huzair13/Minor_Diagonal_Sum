import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Inputs");
        int sizeRow=scanner.nextInt();
        int sizeColumn=scanner.nextInt();
        int array[][]=new int[sizeRow][sizeColumn];
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int sum=minorDiagonalSum(array,sizeRow,sizeColumn);
        System.out.println("Sum of the Minor Diagonals :"+sum);
    }

    private static int minorDiagonalSum(int[][] array, int sizeRow, int sizeColumn) {
        int i=0,j=sizeColumn-1;
        int sum=0;
        while(i<sizeColumn && j>=0){
            sum+=array[i][j];
            j--;
            i++;
        }
        return sum;
    }
}