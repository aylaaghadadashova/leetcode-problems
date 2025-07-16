package solutions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String commonPrefix = "";
        for(int i = 0; i < strs[0].length(); i++) {
            char charToCompare = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != charToCompare) {
                    return commonPrefix;
                }
            }
            commonPrefix = commonPrefix.concat(String.valueOf(charToCompare));
        }
        return commonPrefix;
    }
}
