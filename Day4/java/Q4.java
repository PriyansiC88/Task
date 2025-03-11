public class Q4 {
    public static void main(String[] args) {
        int[] number = {10,20,24,35,45,59,67,90};

        System.out.println("Even numbers: ");
        for(int num : number){
            if(num%2 == 0){
                System.out.println(num + " ");
            }
        }

        System.out.println("Odd numbers: ");
        for(int num : number){
            if(num%2 != 0){
                System.out.println(num + " ");
            }
        }


    }
}