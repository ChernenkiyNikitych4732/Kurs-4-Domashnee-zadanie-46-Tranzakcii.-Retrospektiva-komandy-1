package skypro.javaunion.teamdevelopment.telegrambot.exception;


/**
 * Ошибка по поиску усыновителя в БД.
 */
public class NotFoundAdopterException extends RuntimeException {

    public NotFoundAdopterException(String message) {
        super("Усыновитель не найден в БД!");
    }
}