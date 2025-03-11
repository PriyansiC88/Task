public class  Q1{
    public static String reverse(String str) {
        String reversed = "";

        for(int i = str.length()-1; i >=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
      
        String str = "Hello World!";
        
        System.out.println("Normal string: "+ str);
        System.out.println("Reversed string: "+ reverse(str));
    
    }
   
}