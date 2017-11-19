/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Maxine
 */
public class URLConnect {
     public static void main(String[] args) {
        try {
            // Read from a website
            URL url = new URL("https://www.w3schools.com");
            URLConnection urlCon = url.openConnection(); // Create URL connection object
            urlCon.setDoOutput(true); // Use to write to a connection
            urlCon.connect(); // Use connect() method to connect to URL
            
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlCon.getInputStream()));
            
            // Read each line as long as line is not null
            String line = "";
           while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
          inputStream.close(); // close the stream
            
            // Use an exception in case there's an error
        } catch(MalformedURLException e) {
            System.out.println("Bad URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
