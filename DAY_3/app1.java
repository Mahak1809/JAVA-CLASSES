//Swapping of two numbers
public class app1 {
    public static void main(String args[]){
        int x = 10;
        int y = 20;
        int temp;
        System.out.println("Before Swapping x : "+x);
        System.out.println("Before Swapping y : "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping x : "+x);
        System.out.println("After Swapping y : "+y); 
    }
}
