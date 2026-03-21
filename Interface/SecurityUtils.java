
interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*");
    }
}

class TestSecurity {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Pass1234"));
    }
}
