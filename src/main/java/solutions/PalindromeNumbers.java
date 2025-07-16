package solutions;

public class PalindromeNumbers {
    public static boolean isPalindrome(int x) {
        int num = x;
        int reversedNum = 0;
        while(num > 0){
            reversedNum = reversedNum*10 + num%10;
            num=num / 10;
        }
        return (x == reversedNum);
    }
}
