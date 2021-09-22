
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("Enter the cols");
        int col = sc.nextInt();
        
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        
        System.out.println("Enter the elements of array1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements of array2");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]= sc.nextInt();
            }
        }
        // System.out.println("Enter the elements of array1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
