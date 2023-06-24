import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        boolean resutl = anagram_solution_1("abcd", "cdab");
        if(resutl == true){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }

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

    public static boolean anagram_solution_2(String text1, String text2) {
       return true;
    }
}
