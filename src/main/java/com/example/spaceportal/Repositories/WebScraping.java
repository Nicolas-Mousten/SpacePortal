package com.example.spaceportal.Repositories;

import com.example.spaceportal.Service.FindWord;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScraping {
    public ArrayList<String> extractText(){
        String result = "";
        ArrayList<String> listOfColumns = new ArrayList<>();
        try {
            String page = "https://nssdc.gsfc.nasa.gov/planetary/factsheet/";

            Connection conn = Jsoup.connect(page);

            Document doc = conn.get();

            //----------------------------------parse doc into smaller bits
            String docString = doc.toString();
            FindWord wordfinder = new FindWord();
            List<Integer> tabelStart = wordfinder.findWord(docString, "<tr>");
            List<Integer> tabelFinish = wordfinder.findWord(docString, "</tr>");


            for (int i = 0; i < tabelStart.size(); i++) {
                String column = docString.substring(tabelStart.get(i),tabelFinish.get(i));
                Document firstDoc = Jsoup.parse(column);
                String output = firstDoc.body().text();
                listOfColumns.add(output);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    return listOfColumns;
    }
}
