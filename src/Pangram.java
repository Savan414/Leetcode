public class Pangram {

    public static void main (String[] args){
        String input = "qwertyuiopasdfghjkklzxcvbnm";

        System.out.println(checkIfPangram(input));

    }

    public static boolean checkIfPangram(String sentence) {

        for(int i = 0; i < 26; i++){
            if(!sentence.contains(Character.toString(i + 97))){
                return false;
            }

        }
        return true;
    }
}
