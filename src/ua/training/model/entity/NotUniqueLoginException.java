package ua.training.model.entity;

public class NotUniqueLoginException extends Exception {

    private String login;

    NotUniqueLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
