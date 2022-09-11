package ScndLesson;

import java.util.Random;

public class Main {
    static String [] [] strArray ={{"48","5", "6", "82"}, {"5", "65", "12", "54"}, {"12", "6", "98", "78"}, {"2", "45", "58", "17"}};
    static String [] [] strArrayCut = {{"4","55"}, {"15", "6"}, {"15", "64"}, {"42", "2"}};
    static String [] [] strArrayFormat ={{"8","5", "62", "82"}, {"5", "12", "12", "5jg4"}, {"12", "6", "9", "78"}, {"2", "45", "48", "17"}};

    public static void main(String[] args) {
        try {
            System.out.println("Сумма массива: " + getSumm(strArray));
        } catch (NotFourToFourException | NotNumbersException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива: " + getSumm(strArrayCut));
        } catch (NotFourToFourException | NotNumbersException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива: " + getSumm(strArrayFormat));
        } catch (NotFourToFourException | NotNumbersException ex){
            System.out.println(ex.getMessage());
        }

    }
    static Integer getSumm(String[][] strArray) throws NotFourToFourException,NotNumbersException{
        checkArrSize(strArray);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < strArray.length; i++) {
                j =0;
                for (; j < strArray.length; j++) {
                    result = result + Integer.parseInt(strArray[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new NotNumbersException("Ошибка в позиции: " + (i+1)+","+(j+1));
        }

        return result;
    }

    static void checkArrSize (String[][] strArray) throws NotFourToFourException {
        if ((strArray.length !=4) | (strArray[0].length !=4))
            throw new NotFourToFourException();
    }

     static class NotFourToFourException extends Exception {
        public NotFourToFourException () {
            super("Массив не 4х4!");
        }
    }


    static class NotNumbersException extends Exception {
        public NotNumbersException(String error) {
            super(error);
        }
    }

    /*
    public static void ArrayFourXFour (){
        Random random = new Random(0);
        String[][] strArray = new String[4][4];
        for (int i = 0; i<strArray.length; i++){
            for (int j =0; j<strArray[i].length; j++){
                int randomNumber = random.nextInt(100);
                strArray[i][j] = Integer.toString(randomNumber);
            }
        }
    }*/




}






