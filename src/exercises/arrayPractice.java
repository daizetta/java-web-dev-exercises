package exercises;

public class arrayPractice {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < someOtherInts.length; i++) {
            if (someOtherInts[i] % 2 != 0)
                System.out.println(someOtherInts[i]);
        }
        String str = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] arrOfStr = str.split("(?<=[.])( )");
        for (String arr : arrOfStr) {
            System.out.println(arr);
        }
    }
}
