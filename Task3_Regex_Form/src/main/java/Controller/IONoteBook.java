package Controller;

import View.View;
import Model.Model;
import java.util.*;

import static Controller.RegexContainer.*;
import static View.TextConstant.*;
import static Controller.StringContainer.*;

public class IONoteBook {
    private View view;
    private Model model;
    private Scanner sc;
    private ResourceBundle bundle;

    public IONoteBook(View view, Model model, ResourceBundle bundle, Scanner sc){
        this.view = view;
        this.sc = sc;
        this.bundle = bundle;
        this.model = model;
        StringContainer.loadStrings(bundle);

    }
    public void inputNote(){
        model.setSurname(inputStringValueWithScanner(C_IN_SURNAME, C_REGEX_SURNAME));
        model.setName(inputStringValueWithScanner(C_IN_NAME, C_REGEX_NAME));
        model.setNickname(inputStringValueWithScanner(C_IN_NICKNAME, C_REGEX_NICKNAME));
        model.setPatronymic(inputStringValueWithScanner(C_IN_PATRONYMIC, C_REGEX_PATRONYMIC));
    }
    public String inputStringValueWithScanner(String message, String regex){
        String res;
        view.printMessage(message);
        while(!(sc.hasNext() && (res = sc.next()).matches(regex))){
            view.printIncorrectInput(C_ERROR + ' ' + message);
        }
        return res;
    }
    public void outputNote(){
        view.printMessage(C_OUT_SURNAME + model.getSurname());
        view.printMessage(C_OUT_NAME + model.getName());
        view.printMessage(C_OUT_NICKNAME + model.getNickname());
        view.printMessage(C_OUT_PATRONYMIC + model.getPatronymic());
    }
}
