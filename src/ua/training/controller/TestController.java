package ua.training.controller;

import org.junit.*;
import ua.training.model.Model;
import ua.training.model.entity.FieldsNames;
import ua.training.view.View;
/*
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;*/

public class TestController {


    static Controller controller = new Controller(new Model(),new View());

    @Test
     public void testCheckRegex(){
        String array[] = {"Я","ЯРослав","Ирина","Ьна","Эмма"};
        boolean isRegexWright = true;
        for (String input:array
             ) {isRegexWright = controller.checkInputWithRegex(input,FieldsNames.FIRST_NAME_FIELD.getRegexName());
            System.out.println(input);
            Assert.assertFalse(isRegexWright);
        }
    }
}

