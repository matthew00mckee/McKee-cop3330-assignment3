package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class JSON {
    public static ArrayList<Map<String, Object>> read(String filePath) {
        ArrayList<Map<String, Object>> returnList = new ArrayList<>();
        File file = new File(filePath);

        try {
            JsonElement jsonElement = JsonParser.parseReader(new FileReader(file));
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            JsonArray array = jsonObject.get("products").getAsJsonArray();

            for (JsonElement product : array) {
                JsonObject item = product.getAsJsonObject();

                //extracts data into different variables
                String name = item.get("name").getAsString();
                Double price = item.get("price").getAsDouble();
                int quantity = item.get("quantity").getAsInt();

                Map<String, Object> newTemp = new HashMap<>();
                newTemp.put("name", name);
                newTemp.put("price", price);
                newTemp.put("quantity", quantity);

                returnList.add(newTemp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read JSON file. Try again.");
        }
        return returnList;
    }

    public static String search(ArrayList<Map<String, Object>> list, String name) {
        for (Map<String, Object> temp : list) {
            String tempName = (String) temp.get("name");
            if (tempName.equalsIgnoreCase(name)) {
                return String.format("Name: %s | Price: %.2f | Quantity: %d%n",
                        temp.get("name"), temp.get("price"), temp.get("quantity"));
            }
        }
        return "Product does not exist.";
    }
}
