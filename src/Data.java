public class Data {
    private static final String VALID_CHARS = "abcdefjhijklmnopqrstuvwxyz-0123456789";

    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;

    }

    private static void check(String login,
                              String password,
                              String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (validate(login)) {
            throw new WrongLoginException("неверный логин");
        }if (validate(password)) {
            throw new WrongLoginException("неверный пароль");
        }if (!password.equals(confirmPassword)) {
            throw new WrongLoginException("пароли должны совпадать");
        }

    }

    public static boolean validate(String e) {
        if (e.length() < 20) {
            return false;
        }
        for (int i = 0; i <e.length(); i++) {
            if (!VALID_CHARS.contains(String.valueOf(e.charAt(i)))) {
                return false;
            }
        }
        return true;

    } 
}
