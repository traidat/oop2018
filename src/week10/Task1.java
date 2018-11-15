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
                line1 = line;
                if(line1.contains("static") == true ) {
                    temp = temp + line1 + "\r\n";
                    while ((line2 = br.readLine())!= null && line2.equals("") == false ) {
                        temp = temp + line2 + "\r\n";
                    }
                    s.add(temp);
                    temp = "";
                }
                

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String findFunctionByName(String name) throws IOException {
        String name1 = name.substring(0,name.length() - 2);
        String line = new String();
        String result = "Khong co ham trong file";
        List<String> s = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\oop2018\\src\\week9\\Utils.java");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while((line = br.readLine())!=null) {
                if(line.contains("static")) {
                    s.add(line);
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (name1.contains(",")) {
            String[] a = name1.split(",");
            for (int i = 0; i < s.size(); i++) {
                String[] b = s.get(i).split(",");
                if (b[0].contains(a[0]) == true && b[1].contains(a[1]) == true) {
                    if (s.get(i).contains("//"))
                        result =  "Ham trong phan comment";
                    else result = "Co ham trong file";
                }
            }
        }
        else {
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).contains(name1)) {
                    if (s.get(i).contains("//")) {
                        result = "Ham trong phan comment";
                        break;
                    } else {
                        result = "Co ham trong file";
                        break;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\oop2018\\src\\week9\\Utils.java");
        List<String> s = getAllFunctions(file);
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
        System.out.println(findFunctionByName("writeContentToFile1(String)"));
    }

}
