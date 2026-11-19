public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String currentWord : args) {
            char firstLetter = currentWord.charAt(0);
            
            if (firstLetter % 5 == 0)
            {
                System.out.println(firstLetter);  
            }
        }
    }
}
