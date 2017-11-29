/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Maxine
 */
public class ORGJson {

    public static void main(String args[]) throws FileNotFoundException {
        // Ask the user for information
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of owner: ");
        String ownerName = input.nextLine();

        // Create new JSON object
        JSONObject aName = new JSONObject();

        // Add the name value pair
        aName.put("Owner Name", ownerName);

        // Create JSON array
        JSONArray petInfo = new JSONArray();

        while (true) {

            // Get the type of pet
            System.out.println("Enter name of pet: ");
            String petName = input.nextLine();

            // Cpheck if user hit enter
            if (petName.length() == 0) {
                break;
            }

            //  Get the date of birth or date of adoption
            System.out.println("Enter date of birth or date of adoption: ");
            String petDate = input.nextLine();

            // Get the pet owner name
            System.out.println("Enter type of pet: ");
            String petType = input.nextLine();

            // Create JSON object and array; store class object
            JSONObject petObject1 = new JSONObject();
            petObject1.put("name", petName);
            petObject1.put("dates", petDate);
            petObject1.put("type", petType);

            // Add to the array
            petInfo.add(petObject1);
        }

        // Add the array to aName object
        aName.put("Pet Information", petInfo);

        System.out.println(aName.toJSONString());

        // Create and write to file
        File file = new File("C:\\Users\\Maxine\\Documents\\NetBeansProjects\\ORG.Json\\jsonFile.json");

        try (PrintWriter writeFile = new PrintWriter(file)) {
            writeFile.print(aName.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        // Read the file
        System.out.println("File created.\n\n Hit return to display.");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()){
                jsonIn.append(input.nextLine());
            }
                System.out.println(jsonIn.toString());
                
                JSONParser parser = new JSONParser(); // Parse objects
                
                JSONObject objAname = (JSONObject) parser.parse(jsonIn.toString()); // Cast object
                
                System.out.printf("Pet owner is: \n", objAname.get("Owner Name").toString());
                
                JSONArray petsIn = (JSONArray) objAname.get("Pet Information");
                
                for(int i = 0; i < petsIn.size(); i++) {
                    JSONObject petIn = (JSONObject) petsIn.get(i);
                    String petNameIn = (String) petIn.get("name");
                    String petDateIn = (String) petIn.get("dates");
                    String petTypeIn = (String) petIn.get("type");
                    
                    System.out.printf("Pet Information: ", petNameIn, petDateIn, petTypeIn);
                }
                
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());  
        }
}
}