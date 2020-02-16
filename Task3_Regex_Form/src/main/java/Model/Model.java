package Model;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Model {
    private String surname;
    private String name;
    private String nickname;
    private String patronymic;

    public void setSurname(String surname){ this.surname = surname; }
    public void setName(String name){ this.name = name; }
    public void setNickname(String nickname){ this.nickname = nickname; }
    public void setPatronymic(String patronymic){ this.patronymic = patronymic; }

    public String getSurname(){ return surname; }
    public String getNickname(){ return nickname; }
    public String getName(){ return name; }
    public String getPatronymic(){ return patronymic; }
}
