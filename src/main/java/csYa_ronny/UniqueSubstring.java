package csYa_ronny;

public class UniqueSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";  // Example input
        System.out.println("Longest unique substring: " + 
                longestUniqueSubstring(input));
    }

    public static String longestUniqueSubstring(String input) {
        int[] lastSeen = new int[128]; //128 because there are 128 ascii values that are used in the keyboard
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        int left = 0;
        int maxLength = 0;
        int startOfLongest = 0;
        for (int right = 0; right < input.length(); right++)
        {
            char currentChar = input.charAt(right);
            if (lastSeen[currentChar] >= left)
            {
                left = lastSeen[currentChar] + 1;
            }
            lastSeen[currentChar] = right;
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startOfLongest = left;
            }
        }
        return input.substring(startOfLongest, startOfLongest + maxLength);

    }
}