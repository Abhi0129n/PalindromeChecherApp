public class PalindromeCheckerApp {
    public static void main(String[] args) {


        // ===== UC2 =====
        String input1 = "madam";
        boolean isPalindrome1 = true;

        for (int i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - 1 - i)) {
                isPalindrome1 = false;
                break;
            }
        }

        System.out.println("UC2 Result : " + isPalindrome1);
        System.out.println();
    }
}