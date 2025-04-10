package loginregister;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;

public class encrypt {

    public static String encrypt(String strToEncrypt, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SecretKey getKeyFromBytes(byte[] keyBytes) {
        return new SecretKeySpec(keyBytes, "AES");
    }

    public static SecretKey getKeyFromBase64(String base64Key) {
        byte[] decodedKey = Base64.getDecoder().decode(base64Key);
        return getKeyFromBytes(decodedKey);
    }

    public static String keyToBase64(SecretKey key) {
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

    public static SecretKey defaultKey() {
        try {
            String path = "C:\\Users\\night\\Documents\\NetBeansProjects\\loginRegister\\src\\loginregister\\keyCriptare.key";
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            String base64Key = new String(encoded, StandardCharsets.UTF_8).trim();
            return getKeyFromBase64(base64Key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
