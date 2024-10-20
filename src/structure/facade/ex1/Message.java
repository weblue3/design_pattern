package structure.facade.ex1;

//-- Row 클래스를 보기좋게 출력하는 클래스
public class Message {

    private Row row;

    public Message(Row row) {
        this.row = row;
    }

    public String makeName() {
        return "Name : \"" + row.getName() + "\"";
    }

    public String makeBirthday() {
        return "BirthDay : " + row.getBirthDay();
    }

    public String makeEmail() {
        return "Email : " + row.getEmail();
    }

}
