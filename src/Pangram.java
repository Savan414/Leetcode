public class Pangram {


    public static boolean checkIfPangram(String sentence) {

        for(int i = 0; i < 26; i++){
            if(!sentence.contains(Character.toString(i + 97))){
                return false;
            }

        }
        return true;
    }
}
