public class Zakaz {

    private String surname;
    private String name;
    private String lastname;
    private String phoneNumber; // номер телефона представлен строкой,
    // но с помощью регулярного выражения будем проверять на коректность
    private String orders; // будем считать что заказ это строка


    public Zakaz(String surname, String name, String lastname, String phoneNumber, String orders) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }

    public Zakaz() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    // проверка коректности введенного номера телефона
    public static boolean phoneCorrect(String phoneNumber){
        return phoneNumber.matches("(\\+*)\\d{11}");
    }
    // проверка коректности введения ФИМ
    public static boolean textCorrect(String text){
        return text.matches("[А-Я][а-я]{2,15}");
    }

    @Override
    public String toString() {
        return "Zakaz{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orders='" + orders + '\'' +
                '}';
    }
}
