import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) {
        // Create a Properties object-g
        Properties properties = new Properties();

        // Set some properties (key-value pairs)
        properties.setProperty("username", "admin");
        properties.setProperty("password", "12345");
        properties.setProperty("url", "http://example.com");

        // Save the properties to a file
        try (FileOutputStream output = new FileOutputStream("config.properties")) {
            properties.store(output, "User Configuration");
            System.out.println("Properties saved to file.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Load the properties from the file
        Properties loadedProperties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            loadedProperties.load(input);
            System.out.println("Properties loaded from file.");

            // Access the loaded properties
            String username = loadedProperties.getProperty("username");
            String password = loadedProperties.getProperty("password");
            String url = loadedProperties.getProperty("url");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
