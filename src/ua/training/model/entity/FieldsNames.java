package ua.training.model.entity;

import ua.training.controller.RegexContainer;
import ua.training.view.TextConstant;

public enum FieldsNames implements TextConstant, RegexContainer {

    LAST_NAME_FIELD("lastName",LAST_NAME, REGEX_LAST_NAME),
    FIRST_NAME_FIELD("firstName",FIRST_NAME, REGEX_NAME),
    FATHER_NAME_FIELD("fatherName", FATHER_NAME, REGEX_FATHER_NAME);


    private String fieldName;
    private String viewName;
    private String regexName;

    FieldsNames(String fieldName, String viewName, String regexName) {
        this.fieldName = fieldName;
        this.viewName = viewName;
        this.regexName = regexName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getViewName() {
        return viewName;
    }

    public String getRegexName() {
        return regexName;
    }
}
