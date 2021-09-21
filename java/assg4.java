import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the series");
        int num = sc.nextInt();
        long a []= new long[num];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<num;i++){
            a[i] = a[i - 2] + a[i - 1];
        }
        for (int i = num - 1; i >= 0; i--)
        {
            System.out.print(a[i] +" ");
        }
        
    }        
}
