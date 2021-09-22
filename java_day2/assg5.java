import java.util.*;
class Dada{
    void land(){
        System.out.println("We have land");
    }
}
class dad extends Dada{
    void house(){
        System.out.println("we have house");
    }
}
class son extends dad{
    void car(){
        System.out.println("we have car");
    }
}
class main{
    public static void main(String[] args){
        son d= new son();
        d.car();
        d.house();
        d.land();

    }
}
