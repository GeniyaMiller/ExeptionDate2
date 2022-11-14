package date;


public class Date {

    private static String reg = "^[a-zA-Z0-9_]{1,20}$";


    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(reg) || login.isBlank() || login.isEmpty()) {
            throw new WrongLoginException("Введен некорректный логин");
        }
        if (!password.matches(reg) || password.isEmpty() || password.isBlank() || password == null) {
            throw new WrongPasswordException("Введен некорректный пароль");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

}
