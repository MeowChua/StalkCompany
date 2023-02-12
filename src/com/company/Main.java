package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < 58 ; i++) {
            Document doc = Jsoup.connect("https://masothue.com/tra-cuu-ma-so-thue-theo-tinh/ho-chi-minh-23?page=" + i).get();
            ArrayList<objectIn4> objIn4 = new ArrayList<objectIn4>();
            /*
            Elements s = doc.select(".tax-listing > div > h3 ");
            for (Element element : s) {
                objectIn4 obj = new objectIn4();
                obj.setName(element.text());
                objIn4.add(obj);
                //System.out.println(element.text());
            }
            */


            Elements s1 = doc.select(".tax-listing > div > div > a ");
            for (Element element : s1) {
                objectIn4 obj = new objectIn4();
                obj.setTax(element.text());
                objIn4.add(obj);
                System.out.println(element.text());
            }

/*
            Elements s2 = doc.select(".tax-listing > div > address ");
            for (Element element : s2) {
                objectIn4 obj = new objectIn4();
                obj.setAddress(element.text());
                objIn4.add(obj);
                System.out.println(element.text());
            }
*/
            /*
            for( objectIn4 obj : objIn4){
                System.out.println(obj.getName());
            }
            */

        }
    }
}
