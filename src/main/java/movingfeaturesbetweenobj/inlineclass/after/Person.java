package movingfeaturesbetweenobj.inlineclass.after;

public class Person {
    private String name;
    private String number;
    private String areaCode;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }
    void setTelephoneNumber(String arg) {
        arg = "(" + areaCode + ") " + number;
    }

}
