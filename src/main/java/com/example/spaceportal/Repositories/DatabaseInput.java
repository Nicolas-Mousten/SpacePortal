package com.example.spaceportal.Repositories;

import com.example.spaceportal.Planet.Model.Planet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseInput {
    public ArrayList<Planet> InsertIntoDatabase(){
        //Initialising
        WebScraping test = new WebScraping();
        ArrayList<String> text = test.extractText();
        ArrayList<Planet> planets = new ArrayList<>();

        //Reparsing into arrays to create models
        ArrayList<List<String>> parsedList = new ArrayList<>();
        for (int i = 0; i < text.size(); i++) {
            String[] textList = text.get(i).split(" ");
            List<String> temp = Arrays.asList(textList);
            parsedList.add(temp);
        }

        //Create models
        for (int i = 1; i <= parsedList.get(0).size() ; i++) {

           // System.out.println(parsedList.get(0).get(parsedList.get(0).size()-1-i));

            Planet temp = new Planet(
                    parsedList.get(0).get(parsedList.get(0).size()-i),
                    parsedList.get(1).get(parsedList.get(1).size()-i),
                    parsedList.get(2).get(parsedList.get(2).size()-i),
                    parsedList.get(3).get(parsedList.get(3).size()-i),
                    parsedList.get(4).get(parsedList.get(4).size()-i),
                    parsedList.get(5).get(parsedList.get(5).size()-i),
                    parsedList.get(6).get(parsedList.get(6).size()-i),
                    parsedList.get(7).get(parsedList.get(7).size()-i),
                    parsedList.get(8).get(parsedList.get(8).size()-i),
                    parsedList.get(9).get(parsedList.get(9).size()-i),
                    parsedList.get(10).get(parsedList.get(10).size()-i),
                    parsedList.get(11).get(parsedList.get(11).size()-i),
                    parsedList.get(12).get(parsedList.get(12).size()-i),
                    parsedList.get(13).get(parsedList.get(13).size()-i),
                    parsedList.get(14).get(parsedList.get(14).size()-i),
                    parsedList.get(15).get(parsedList.get(15).size()-i),
                    parsedList.get(16).get(parsedList.get(16).size()-i),
                    parsedList.get(17).get(parsedList.get(17).size()-i),
                    parsedList.get(18).get(parsedList.get(18).size()-i),
                    parsedList.get(19).get(parsedList.get(19).size()-i),
                    parsedList.get(20).get(parsedList.get(20).size()-i)
                );
            planets.add(temp);
            //removes last item in arraylist to acces next element
        }
        return planets;
    }

}
