package FstLesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Member [] members = new Member[4];
        members[0]= new Member("Павлик", 30, 30, 50, 195, 30);
        members[1]= new Member("Света", 26, 32, 45, 165, 18);
        members[2]= new Member("Вадик", 19, 27, 55, 200, 40);
        members[3]= new Member("Наташа", 40, 45, 125, 125, 5);
        Team team = new Team("Молодцы", members);

        Course course = new Course("Полоса препятствий",40, 90, 150, 20);
        System.out.println("Соревнование " + course.getCourseName() + ".\nНормативы: \n"
                + "Бег на 100м - не более " + course.getRunHundred() + "сек;\n"
                + "Заплыв на 100м - не более " + course.getSwimHundred()+ "сек;\n"
                + "Прыжок в длину - не менее " + course.getJumping()+ "см;\n"
                + "Подтягивания - не менее " + course.getPullUps()+ "раз.\n");
        String result = course.competition(team);
        System.out.println(result);
    }



}
