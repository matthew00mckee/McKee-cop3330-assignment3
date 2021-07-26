package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class ScanAndPrint {
    public static ArrayList<Map<String, Integer>> scanning(String filePath) {
        ArrayList<Map<String, Integer>> List = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner in = new Scanner(file);

            loopThrough: while (in.hasNext()) {
                Map<String, Integer> word = new HashMap<>();
                int frequency = 1;
                String key = in.next();

                for (int i = 0; i < List.size(); i++) {
                    Map<String, Integer> temp = List.get(i);

                    //if word exists in arraylist
                    if (temp.containsKey(key)) {
                        frequency += temp.get(key);
                        word.put(key, frequency);
                        List.set(i, word);
                        continue loopThrough;
                    }
                }

                word.put(key, frequency);
                List.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file.");
        }

        List.sort(new wordSort());
        return List;
    }

    public static String printing(ArrayList<Map<String, Integer>> List) {
        StringBuilder out = new StringBuilder();
        for (Map<String, Integer> word : List) {


            String key = (String) word.keySet().toArray()[0];
            out.append(String.format("%s: ", key));
            for (int i = 0; i < word.get(key); i++) {
                out.append("*");
            }
            out.append("\n");
        }
        return out.toString();
    }
}
