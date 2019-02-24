package ua.training.model.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NoteBook {

    private String lastName;
    private String firstName;
    private String fatherName;
    private String form;

    public NoteBook(Map<String,String> notes) {
        this.lastName = notes.get("lastName");
        this.firstName = notes.get("firstName");
        this.fatherName = notes.get("fatherName");
        this.form = notes.get("form");

    }

    public String getForm() {
        return form;
    }
}
