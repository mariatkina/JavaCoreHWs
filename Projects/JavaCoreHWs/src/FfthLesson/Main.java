package FfthLesson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static ArrayList<Values> fIleObjectArrayList = new ArrayList<>();
    public static String pathToFile = "src/FfthLesson/resourses/test.csv";
    public static String title = "col1"+ ";" + "col2"
            + ";" + "col3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();

        writeStream();

        AppData appData = readToObject();
    }

    public static void createFileObjects(){
        Random random = new Random();

        for(int i=0;i<10;i++){
            fIleObjectArrayList.add( new Values(i, random.nextInt(1000), random.nextInt(1000)));
        }
    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            writer.write(title);
            for(Values fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValue1() + ";" + fIleObject.getValue2()
                        + ";" + fIleObject.getValue3() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)){
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(Values fIleObject : fIleObjectArrayList){
                String raw = fIleObject.getValue1() + ";" + fIleObject.getValue2()
                        + ";" + fIleObject.getValue3() + ";"+ System.getProperty("line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)){
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }


}
