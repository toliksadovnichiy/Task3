package Controller;
import View.View;
import java.util.*;
import static View.TextConstant.*;
import static Controller.RegexContainer.*;

public class StringContainer {
    static String C_IN_SURNAME;
    static String C_IN_NAME;
    static String C_IN_PATRONYMIC;
    static String C_IN_NICKNAME;

    static String C_OUT_SURNAME;
    static String C_OUT_NAME;
    static String C_OUT_PATRONYMIC;
    static String C_OUT_NICKNAME;

    static String C_REGEX_SURNAME;
    static String C_REGEX_NAME;
    static String C_REGEX_PATRONYMIC;
    static String C_REGEX_NICKNAME;
    static String C_ERROR;

    static void loadStrings(ResourceBundle resourceBundle) {

        C_IN_SURNAME = resourceBundle.getString(INPUT_SURNAME);
        C_IN_PATRONYMIC = resourceBundle.getString(INPUT_PATRONYMIC);
        C_IN_NICKNAME = resourceBundle.getString(INPUT_NICKNAME);
        C_IN_NAME = resourceBundle.getString(INPUT_NAME);

        C_OUT_SURNAME = resourceBundle.getString(OUTPUT_SURNAME);
        C_OUT_PATRONYMIC = resourceBundle.getString(OUTPUT_PATRONYMIC);
        C_OUT_NICKNAME = resourceBundle.getString(OUTPUT_NICKNAME);
        C_OUT_NAME = resourceBundle.getString(OUTPUT_NAME);

        C_ERROR = resourceBundle.getString(WRONG_INPUT);

        C_REGEX_SURNAME = resourceBundle.getString(REGEX_SURNAME);
        C_REGEX_PATRONYMIC = resourceBundle.getString(REGEX_PATRONYMIC);
        C_REGEX_NICKNAME = resourceBundle.getString(REGEX_NICKNAME);
        C_REGEX_NAME = resourceBundle.getString(REGEX_NAME);
    }
}
