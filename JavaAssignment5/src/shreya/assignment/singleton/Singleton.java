package shreya.assignment.singleton;

public class Singleton {
    public String s;
    public static Singleton init(String input){
        Singleton object=new Singleton();
        object.s=input;
        return object;

    }
    public void printString(){
        System.out.println(s);
    }


}
