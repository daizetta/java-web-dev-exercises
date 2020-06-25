package exercises;

import java.util.*;



public class arrayListPractice {
    public static int evenSum = 0;
    public static int evenSum(ArrayList<String> numbers) {
        for (int i=0; i < numbers.size(); i++) {
            if(Integer.parseInt(numbers.get(i)) % 2 == 0) {
                evenSum += Integer.parseInt(numbers.get(i));
             }
        }
        return evenSum;
    }

    public static ArrayList<String> charPrint(List<String> word) {
        ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).length() == 5) {
              listOfWords.add(word.get(i));
            }
        }
        return listOfWords;
    }

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        System.out.println(evenSum(numbers));

        String str = ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String strWords[] = str.split("[ ,.]+");
        List<String> words = new ArrayList<String>();
        words = Arrays.asList(strWords);
        System.out.println(words);
        System.out.println(charPrint(words));
    }
}
