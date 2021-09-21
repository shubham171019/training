import java.util.*;
import java.lang.Math;
class main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        String dataType = null;
 
        // checking for Integer
        if (input.matches("\\d+")) {
            dataType = "Integer";
        }
 
        // checking for floating point numbers
        else if (input.matches("\\d*[.]\\d+")) {
            dataType = "Double";
        }
        else{
            
        }
        System.out.println("The datatype of " + input
                           + " is: " + dataType);
        
        
        if(dataType=="Integer"){
            long i=Long.parseLong(input); 
            // int i=Integer.parseInt(input);
            System.out.println(i);
            
            if(i>-128 && i<127){
                System.out.println("recommended as byte");
            }
            else if(i>-32768 && i<32767){
                System.out.println("prompted as short and byte but recommended as short");
            }
            else if(i>-2147483648 && i<2147483647){
                System.out.println("prompted as short and byte and int but recommended as int");
            }
            else if(i>-9223372036854775808l && i<9223372036854775807l){
                System.out.println("prompted as short and byte and int  and long but recommended as long");
            }
           
        }
        
        else if(dataType=="Double"){
            double d=Double.parseDouble(input);
            if(d>1.40239846*Math.pow(10,-45) && d< 3.40282347*Math.pow(10,38) ){
                System.out.println("recommended as float");
            }
            else{
                System.out.println("recommended as double");
            }
        }
        
        
    }
}
