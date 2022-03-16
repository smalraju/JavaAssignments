package shreya.assignment.main;

import shreya.assignment.data.Data;
import shreya.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.dataClass();
        d.func();
        System.out.println();
        Singleton s = Singleton.init("hello");
        s.printString();
    }
}
