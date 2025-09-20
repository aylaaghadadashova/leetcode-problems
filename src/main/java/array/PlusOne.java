package array;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int j;
        int reminder = 0;
        for (j = digits.length-1; j >= 0; j--){
            if(j == digits.length-1){
                reminder = (digits[j] + 1)/10;
                digits[j] = (digits[j] + 1)%10;
            } else{
                int sum = reminder + digits[j];
                reminder = sum/10;
                digits[j] = sum%10;
            }

            if(j == 0 && reminder > 0){
                int[] newArr = new int[digits.length+1];
                newArr[0] = reminder;
                for(int i = 0; i < digits.length; i++){
                    newArr[i+1] = digits[i];
                }
                return newArr;
            }
        }
        return digits;
    }
}
