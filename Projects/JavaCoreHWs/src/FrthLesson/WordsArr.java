package FrthLesson;

import java.util.*;

public class WordsArr {

    public static List<String> wordsList = new ArrayList<>(17);



    public static void main(String[] args) {

        wordsList.add("одуванчик");
        wordsList.add("ромашка");
        wordsList.add("василёк");
        wordsList.add("донник");
        wordsList.add("василёк");
        wordsList.add("лютик");
        wordsList.add("василёк");
        wordsList.add("одуванчик");
        wordsList.add("незабудка");
        wordsList.add("одуванчик");
        wordsList.add("василёк");
        wordsList.add("ромашка");
        wordsList.add("лютик");
        wordsList.add("одуванчик");
        wordsList.add("василёк");
        wordsList.add("ромашка");
        wordsList.add("василёк");
        System.out.println(wordsList);
        System.out.println(wordsList.size());
        Set<String> distFlowers = new HashSet<>(wordsList);
        System.out.println(distFlowers);


        Map<String, Integer> matchFlowers = new HashMap<>();
        for (String str : distFlowers) {

            for (int i = 0; i< wordsList.size();i++){

            matchFlowers.put(str, count(str));}

        }
        System.out.println(matchFlowers);
    }
    public static Integer count(String str){
        Integer result = 0;
        for(String str1 : wordsList){
            if(str1.equals(str)) result++;
        }

        return result;

    }





}
