package loginregister;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.Scanner;

public class jsonDB {
    private static final String FILE_NAME = "C:\\Users\\night\\Documents\\NetBeansProjects\\loginRegister\\src\\loginregister\\users.json";

    public static void saveUser(user u) {
        JSONArray usersArray = new JSONArray();

        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                StringBuilder content = new StringBuilder();
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine());
                }
                if (!content.toString().isEmpty()) {
                    usersArray = (JSONArray) org.json.simple.JSONValue.parse(content.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        JSONObject userJson = new JSONObject();
        userJson.put("email", u.getEmail());
        userJson.put("nume", u.getNume());
        userJson.put("prenume", u.getPrenume());
        userJson.put("password", u.getPassword());

        usersArray.add(userJson);

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(usersArray.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean userExists(String email) {
    File file = new File(FILE_NAME);
    if (!file.exists()) {
        return false;
    }

    try (Scanner scanner = new Scanner(file)) {
        StringBuilder content = new StringBuilder();
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine());
        }
        if (!content.toString().isEmpty()) {
            JSONArray usersArray = (JSONArray) org.json.simple.JSONValue.parse(content.toString());
            for (Object obj : usersArray) {
                JSONObject userJson = (JSONObject) obj;
                String storedEmail = (String) userJson.get("email");
                if (storedEmail.equalsIgnoreCase(email)) {
                    return true; 
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return false; 
}
    public static boolean verifyLogin(String email, String password) {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return false;
        }
        try (Scanner scanner = new Scanner(file)) {
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            if (!content.toString().isEmpty()) {
                JSONArray usersArray = (JSONArray) org.json.simple.JSONValue.parse(content.toString());
                for (Object obj : usersArray) {
                    JSONObject userJson = (JSONObject) obj;
                    if (((String) userJson.get("email")).equalsIgnoreCase(email) &&((String) userJson.get("password")).equalsIgnoreCase(password)) {
                        return true; 
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    return false; 
}

}
