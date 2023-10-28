package DZ1;

import java.util.Scanner;

public class MainDZ1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in, "ibm866");

        System.out.println("Введите логин: ");

        String login = iScanner.nextLine();

        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Логин должен быть не более 20 символов.");
            }
        } catch (WrongLoginException e) {
            System.out.println("Ошибка: WrongLoginException " + e.getMessage());
            return;
        }

        System.out.println("Введите пароль: ");
        String password = iScanner.nextLine();
        try {
            if (password.length() >= 20) {
                throw new WrongPasswordException("Пароль должен быть не более 20 символов.");
            }
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка: WrongPasswordException " + e.getMessage());
            return;
        }

        System.out.println("Повторите пароль: ");
        String confirmPassword = iScanner.nextLine();

        try {
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают.");
            }
            System.out.println("Пароль введен успешно");

        } catch (WrongPasswordException e) {
            System.out.println("Ошибка: WrongPasswordException " + e.getMessage());
            return;
        }
        iScanner.close();

    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message)  {super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
