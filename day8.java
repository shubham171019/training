import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.print("even");
        }
        int firstValue =2;
        int count=0;
        while(num!=0){
            if(num%2==0){
                count++;
            }
            num = num/2;
        }
        System.out.print(" and multple of 2 present = "+ count);
    }
}
