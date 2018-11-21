package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        String s = new String();
        File file = new File(path);
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            s = br.readLine();
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void writeContentToFile2(String path) throws IOException {
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("viet thanh cong");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFile1(String path) throws IOException {
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("viet thanh cong");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) throws IOException{
        File folder = new File(folderPath);
        boolean check = false;
        String[] nameAllFile = folder.list();
        for (int i = 0; i < nameAllFile.length; i++) {
            if (nameAllFile[i].equals(fileName)){
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("khong co " + fileName + " trong " + folderPath);
            return folder;
        }
        else {
            System.out.println("co " + fileName + " trong " + folderPath);
            File file = new File(fileName);
            return file;
        }
    }
    
    public static void main (String[] args) throws IOException{
        System.out.println(readContentFromFile("oop.txt"));
//        writeContentToFile2("oop.txt");
        System.out.println(readContentFromFile("oop.txt"));
        findFileByName("C:\\Users\\VX15\\IdeaProjects\\oop2018", "oop.txt");
    }
}
