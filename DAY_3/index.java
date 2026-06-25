public class index{
    public static void main(String args[]){
        String s = "I love Java Programming";
        int vowels = 0;
        int consonents = 0;
        String str = s.toLowerCase();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonents : "+consonents);
    }
}