//start coding a new Program
import java.util.*;
class Main{
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
        int condition =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                // a[i][j] = a[i][j] + b[i][j];
                if( a[i][j] != b[i][j]){
                    condition = 1;
                }
            }
        }
        int c[][] = new int[row][col];
        int d[][] = new int[row][col];
        if(condition ==0){
            System.out.println("Equal matrix");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    // a[i][j] = a[i][j] + b[i][j];
                    if( a[i][j] == b[i][j]){
                        c[i][j] =0;
                        d[i][j] =0;
                    }
                    else{
                        c[i][j] =a[i][j];
                        d[i][j] =b[i][j];
                    }
            }
            //displaying
            System.out.println("First one");
            for(int k=0;k<row;k++){
            for(int j=0;j<col;j++){
                System.out.print(c[k][j]+" ");
            }
            System.out.println();
            }
            
            System.out.println("2nd one");
            for(int k=0;k<row;k++){
            for(int j=0;j<col;j++){
                System.out.print(d[k][j]+" ");
            }
            System.out.println();
            }
        
        
        }
            
        }
    }
}









 //Click Enter to expand window
