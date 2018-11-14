package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static List<String> getAllFunctions(File path) throws IOException {
        List<String> s = new ArrayList<>();
        String temp = new String();
        String line  = new String();
        String line1 = new String();
        String line2 = new String();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!= null ) {
                line1= line;
                if(line1.contains("static")) {
                    temp = temp + line1 + "\r\n";
                    while ((line2 = br.readLine())!= null && line2.contains("static") == false) {
                        temp = temp + line2 + "\r\n";
                    }
                    s.add(temp);
                    temp = "";
                    temp = temp + line2 +"\r\n";
                }
                if (line2.contains("static")) {
                    while ((line1 = br.readLine())!= null && line1.contains("static") == false) {
                        temp = temp + line1 + "\r\n";
                    }
                    s.add(temp);
                    temp = "";
                    temp = temp + line1 +"\r\n";
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }


    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\VX15\\IdeaProjects\\oop2018\\src\\week9\\Utils.java");
        List<String> s = getAllFunctions(file);
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

}
