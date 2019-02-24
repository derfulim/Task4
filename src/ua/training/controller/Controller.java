package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.entity.FieldsNames;
import ua.training.model.entity.NotUniqueLoginException;
import ua.training.model.entity.NoteBook;
import ua.training.view.TextConstant;
import ua.training.view.View;

import java.util.*;

public class Controller implements TextConstant,RegexContainer {

    static String REGEXES_BUNDLE = "regexes";
    public static final ResourceBundle regexBundle =
            ResourceBundle.getBundle(
                    REGEXES_BUNDLE,
                    new Locale("ua", "UA"));  // Ukrainian
//                    new Locale("en"));        // English

    private Model model;
    private View view;
    private Map<String,String> notes = new LinkedHashMap();
    private Scanner scanner = new Scanner(System.in);
    private String userInput;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void createNoteBook() {

        prepareNotes();
        NoteBook noteBook = new NoteBook(notes);
//        view.printMessage(noteBook.getForm());

    }

    private void prepareNotes() {
        String form;

        for (FieldsNames field : FieldsNames.values()) {
            view.printStringInput(field.getViewName());
            processUserInput(field.getRegexName(),field.getViewName());
            notes.put(field.getFieldName(),userInput);
        }
        form = view.concatForm(notes.get(FieldsNames.LAST_NAME_FIELD.getFieldName()),
                notes.get(FieldsNames.FIRST_NAME_FIELD.getFieldName()));
        notes.put("form",form);


    }

    private void  processUserInput(String regex, String message) {
            while (!checkInputWithRegex(userInput = getUserInput(),regex)){
                view.printWrongStringInput(message);
            }
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

     boolean checkInputWithRegex(String input,String regex) {
        if(input.matches(regexBundle.getString(regex))) {
            return true;
        }
        else return false;
    }





}
