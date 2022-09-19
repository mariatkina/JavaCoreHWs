package FrthLesson;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneList = new PhoneBook();

        phoneList.add("+79884561245", "Смирнов");
        phoneList.add("+79884561456", "Попов");
        phoneList.add("+79884561145", "Петров");
        phoneList.add("+79884563155", "Иванов");
        phoneList.add("+79884561255", "Бубликов");
        phoneList.add("+79884661245", "Петров");
        phoneList.add("+79883561245", "Смирнов");
        phoneList.add("+79824561245", "Павлов");
        phoneList.add("+79814561245", "Попов");
        phoneList.add("+79834151249", "Иванов");
        phoneList.add("+79889561245", "Иванов");
        phoneList.add("+79887531245", "Шариков");
        phoneList.add("+79881256245", "Стасов");
        phoneList.add("+79884651245", "Попова");
        phoneList.add("+79885461245", "Куликов");
        System.out.println(phoneList.getPhoneByName("Смирнов"));
    }
}