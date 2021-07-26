package ex44;

import java.util.Scanner;
import java.util.*;

public class mainController {
    public static void main(String[] args) {
        String filePath = "C:\\COP3330\\mcKee-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        Scanner Input = new Scanner(System.in);
        String user;

        ArrayList<Map<String, Object>> list =JSON.read(filePath);

        do {
            System.out.print("Enter a product name: ");
            String itemName = Input.nextLine().trim();
            user = JSON.search(list, itemName);
            System.out.println(user);
        } while (user.equals("Product does not exist."));
    }
}

