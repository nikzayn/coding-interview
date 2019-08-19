import java.util.*;

class Anagram{
    public static void AnagramDetector(String[] arr){
        //Create Hashmap 
        HashMap<String, List<String>> map = new HashMap<>();
        
        //Iterate over length of strings
        for(int i = 0; i < arr.length; i++){

            //Convert to char array, sort it and then re-convert to string
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            }
            else{
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        for(String s : map.keySet()){
            List<String> values = map.get(s);
            if(values.size() > 1){
                System.out.println(values);
            }
        }
    }

    public static void main(String[] args){
        String[] arr = { "cat", "dog", "tac", "god", "act" };
        AnagramDetector(arr);
    }
}