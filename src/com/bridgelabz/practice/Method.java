package practice;

public class Method {
    static int staticvariabe;
    int instancevariable;

    static void statMethod(int a, int b) {
        int c = a+a+b;
        System.out.println("statMethod    " +c);

    }
    void instanceMethod() {
        System.out.println("instance");
    }

    public static void main(String[] args) {
        
        statMethod(50, 90);
        Method obj1 = new Method();
        obj1.instanceMethod();
    }

    
}
