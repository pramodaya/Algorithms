import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        boolean resutl = anagram_solution_2("abcd", "cdab");
        if(resutl){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }

    /**
     * Hash map method
     * @param text1
     * @param text2
     * @return boolean
     */
    public static boolean anagram_solution_1(String text1, String text2){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if(text1.length() != text2.length()){
            return false;
        }

        for(int i=0; i< text1.length(); i++){
            char c = text1.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for( int i =0; i<text2.length(); i++){
            char c = text2.charAt(i);

            if(!hashMap.containsKey(c)){
                return false;
            }

            int count = hashMap.get(c);
            if(count == 1){
                hashMap.remove(c);
            }else{
                hashMap.put(c, count - 1);
            }
        }

        return hashMap.isEmpty();
    }

    /**
     * Sorting method
     * @param text1
     * @param text2
     * @return boolean
     */
    public static boolean anagram_solution_2(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
