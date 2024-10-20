package structure.facade.ex1;

//-- DBMS에 저장된 데이터를 나타내는 클래스
public class Row {
    private String name;
    private String birthDay;
    private String email;


    public Row(String name, String birthDay, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }
}
