public class Q3 {
    public static void main(String[] args) {
       
        String text = "hello world hello java";

        String[] words = text.split("\\s+");

        System.out.println("Total words: " + words.length);

        System.out.println("Word Frequencies:");

        boolean[] counted = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) { 
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(words[i] + " -> " + count);
            }
        }
    }
}
