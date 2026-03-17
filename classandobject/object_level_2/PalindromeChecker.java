class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean checkPalindrome() {
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (checkPalindrome())
            System.out.println("\"" + text + "\" is a Palindrome!");
        else
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("madam");
        pc1.displayResult();

        PalindromeChecker pc2 = new PalindromeChecker("hello");
        pc2.displayResult();
    }
}