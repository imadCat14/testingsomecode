package page_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");

            try {
                LineNumberReader reader = new LineNumberReader(new InputStreamReader(url.openStream()));
                String string = reader.readLine();
                while (string != null) {
                    System.out.println(string);
                    string = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }
}