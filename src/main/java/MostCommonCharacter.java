import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

//FIRST CASE 
//Within these numbers, 1 appears the most. X
//SECOND CASE
//Within these numbers, 4 appears the most. X
//THIRD CASE
//With these numbers, 7 appears the most. X
//FOURTH CASE
//Within these numbers, 6 appears the most. X
//FIFTH CASE
//Within these numbers, 5 appears the most. X
//SIXTH CASE
//Within this string, n appears the most. X

    HashMap<Character, Integer> map = new HashMap<>();
    int maxValue = 0;
    char mostCommon = ' ';
for( int i = 0; i < str.length(); i++){
    if(!map.containsKey(str.charAt(i))){
        map.put(str.charAt(i), 1);
    }else{
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
    }
}




       
// map.forEach(
//     (key, value)
//         -> System.out.println(key + " = " + value));

        for (char key : map.keySet()) {
            if(map.get(key) > maxValue){
                maxValue = map.get(key);
                mostCommon = key;
            }
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
System.out.println(mostCommon + " RESULTS");
        return mostCommon;
    }
}
