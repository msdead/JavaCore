package lesson5;

import lesson3.Person;

public class NoPersonException extends RuntimeException {
    public NoPersonException(String id) {
        super("Отстуствует пользователь с id " + id);
    }
}
