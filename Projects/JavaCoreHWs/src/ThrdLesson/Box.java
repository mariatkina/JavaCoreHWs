package ThrdLesson;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruitBox;
    private T[] box;
    private T[] box1;
    private int amount;
    private float weightOfOne;

    public Box(int amount, float weightOfOne) {
        this.amount = amount;
        this.weightOfOne = weightOfOne;
    }
    public Box(float weightOfOne) {

        this.weightOfOne = weightOfOne;
    }
    public Box(ArrayList<T>fruitBox){
        this.fruitBox= fruitBox;
    }

    public T[] getBox() {
        return box;
    }

    public T[] getBox1() {
        return box1;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        if (amount>0) {
            this.amount=amount;
        }



    }

    public float getWeightOfOne() {
        return weightOfOne;
    }

    public void getWeight (){
        float weightOfBox = (float)getAmount() * getWeightOfOne();
        System.out.println("Вес коробки: " +weightOfBox);
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public boolean compare (ArrayList<? extends Fruit> box1, ArrayList<? extends Fruit> box2){


        float boxWeight = (float) box1.size() * box1.get(0).getWeight();
        float boxWeight1 = (float) box2.size() * box2.get(0).getWeight();
        System.out.println("Вес коробok: " + boxWeight + " и " + boxWeight1);

        if (boxWeight == boxWeight1) {
            return true;
        }return false;
    }


    /*public void addFruits(Box<T>box1){
        for (T t : box1.getFruitBox()){
            this.getFruitBox().add(t);
        }
        box1.getFruitBox().clear();
        System.out.println(box1);
    }*/






}
