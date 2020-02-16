package Controller;

import Model.Model;
import View.View;
import java.util.*;

public class Controller {

    private Model model;
    private View view;
    Locale locale;
    ResourceBundle bundle;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runProcess(){
        Scanner sc = new Scanner(System.in);
        locale = new Locale("ua", "UA");
        //locale = new Locale("en", "US");
        bundle = ResourceBundle.getBundle("resources", locale);
        IONoteBook ioNoteBook = new IONoteBook(view, model, bundle, sc);
        ioNoteBook.inputNote();
        ioNoteBook.outputNote();
    }

}
