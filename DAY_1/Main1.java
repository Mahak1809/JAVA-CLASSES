class Test{
    int a = 10;
    static int b = 100;

    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    void change(){
      a = 20;
     b = 210;
    
    }
    
     void displayAfterChange(){
        System.out.println(a);
        System.out.println(b);
    }

}

public class Main1 {
    public static void main(String args[]){
        Test t = new Test();
        t.display();
        t.change();
        t.displayAfterChange();
    }
}