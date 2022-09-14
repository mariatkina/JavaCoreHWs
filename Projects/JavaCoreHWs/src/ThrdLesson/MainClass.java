package ThrdLesson;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        firstTask();
        System.out.println();
        getWeight();
        System.out.println();
        compareBoxes();
        System.out.println();
        addBox();
    }
    public static void firstTask () {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("апрель");
        arrayList.add("май");
        arrayList.add("июнь");
        arrayList.add("июль");
        arrayList.add("август");
        System.out.println("Задание 1: ");
        System.out.println("Начальный вид масива: "+arrayList);
        Collections.swap(arrayList, 1, 4);
        System.out.println("Элементы 2 и 5 поменялись: "+arrayList);
    }
    public static void getWeight (){
        Box<Apple> appleBox = new Box<>(6, 1.0f);
        Box<Orange> orangeBox = new Box<>(4, 1.5f);
        System.out.println("Задание 2: ");
        System.out.println("Яблок в коробке: " + appleBox.getAmount());
        appleBox.getWeight();
        System.out.println("Апельсин в коробке: " + orangeBox.getAmount());
        orangeBox.getWeight();
    }
    public static void compareBoxes(){

           ArrayList<Apple> apples = new ArrayList<>();
           apples.add(new Apple("apple", 1.0f));
           apples.add(new Apple("apple", 1.0f));
           apples.add(new Apple("apple", 1.0f));
           apples.add(new Apple("apple", 1.0f));
           apples.add(new Apple("apple", 1.0f));
           apples.add(new Apple("apple", 1.0f));
           Box<Apple> appleBox = new Box<>(apples);

           ArrayList<Orange> oranges = new ArrayList<>();
           oranges.add(new Orange("orange", 1.5f));
           oranges.add(new Orange("orange", 1.5f));
           oranges.add(new Orange("orange", 1.5f));
           oranges.add(new Orange("orange", 1.5f));
           Box<Orange>orangeBox = new Box<>(oranges);

           System.out.println("Задание 3: ");
           System.out.println(appleBox.compare(apples,oranges));
           System.out.println();
    }
    public static void addBox() {
        Box<Apple> appleBox = new Box<>(6, 1.0f);
        Box<Orange> orangeBox = new Box<>(4, 1.5f);
        System.out.println("Задание 4: ");
        System.out.println("Яблок в коробке 1: " + appleBox.getAmount());
        System.out.println("Апельсин в коробке 2: " + orangeBox.getAmount());
        Box<Apple> aBox = new Box<>(0,0.0f);
        System.out.println("Яблок в коробке 3: " + aBox.getAmount());
        Box<Orange> oBox = new Box<>(0,0.0f);
        int val = 8;
        int aBox1 = appleBox.getAmount() - val;
        appleBox.setAmount(aBox1);
        int aBox3 = aBox.getAmount() + val;
        aBox.setAmount(aBox3);

        System.out.println("Перенесём "+val+" ябл из коробки 1 в коробку 3. \nТеперь в коробке 1: " + (appleBox.getAmount()) + ", в коробке 3: " + aBox.getAmount());


    }
}
