package cz.xvano1.pojo;

public class Student {

    String name;
    String surname;
    String birthDate;
    String sex;

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String value) {
        this.surname = value;
    }

    public String getBirthdate() {
        return this.birthDate;
    }

    public void setBirthdate(String value) {
        this.birthDate = value;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String value) {
        this.sex = value;
    }
}