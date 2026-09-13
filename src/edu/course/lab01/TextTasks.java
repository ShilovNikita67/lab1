package edu.course.lab01;

public class TextTasks {
    public static String reverse(String input){
        String result = "";

        for (int i = input.length()-1; i>=0; i--){
            result = result + input.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String input){
        int left = 0;
        int right = input.length() - 1;

        while (left < right){
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else{
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right++;
            }
        }

        return true;
    }
}
