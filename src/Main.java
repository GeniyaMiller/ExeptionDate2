import date.Date;
import date.WrongLoginException;
import date.WrongPasswordException;

import static date.Date.check;


public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        check("", "WWW7543_jhj", "WWW7543_jhj");

    }
}