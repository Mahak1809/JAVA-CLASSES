// public class app2 {
//     public static void main(String args[]){
//         int number = 321;
//         int first_digit;
//         int middle_digit;
//         int last_digit;
//         last_digit = number%100;
//         // System.out.println(last_digit);
//         first_digit = last_digit/10;
//         // System.out.println(first_digit);
//          middle_digit = last_digit%10;
//         // System.out.println(middle_digit);
//         int x = number/100;
//         // System.out.println(x);
//         System.out.println("After reversing : "+(middle_digit)+(first_digit)+(x));
//     }
// }


public class app2{
    public static void main(String args[]){
        int number = 321;
        int reverse_number = 0;
        while(number>0){
            int digit = number % 10; 
            reverse_number = reverse_number * 10 + digit; 
            number = number / 10;
            System.out.println(reverse_number);
        }

    }
}