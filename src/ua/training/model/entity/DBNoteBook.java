package ua.training.model.entity;

public enum DBNoteBook {
    NOTE_ONE ("Ivan","ivan1234");

    private String firstName;
    private String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkIfExists(String login) {
        for (DBNoteBook note : DBNoteBook.values()) {
            if(note.getLogin().equals(login)) {
                 return true;
        }
        }
        return false;
    }
}
