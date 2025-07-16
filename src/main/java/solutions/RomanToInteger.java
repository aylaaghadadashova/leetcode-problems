package solutions;

public class RomanToInteger {
    public static void main(String[] args) {
        String num = "MCMXCIV";
        System.out.println(romanToInt(num));
    }

    public static int romanToInt(String s) {
        int total = 0;
        int preInt = 0;
        int currentInt;
        for(int i = s.length()-1; i>=0; i--){
            currentInt = (s.charAt(i) == 'I')? 1:
                    (s.charAt(i) == 'V')? 5:
                    (s.charAt(i) == 'X')? 10:
                    (s.charAt(i) == 'L')? 50:
                    (s.charAt(i) == 'C')? 100:
                    (s.charAt(i) == 'D')? 500: 1000;

            if (currentInt < preInt) total -= currentInt;
            else total += currentInt;

            preInt = currentInt;
        }

        return total;
    }
}
