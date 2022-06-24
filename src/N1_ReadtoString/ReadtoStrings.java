//        Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
package N1_ReadtoString;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadtoStrings {

    public static ArrayList<String> readToString(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> mylist = new ArrayList<>();
        while (scanner.hasNext()) {
            mylist.add(scanner.nextLine());
        }
        scanner.close();
        return mylist;
    }

    public static void main(String[] args) throws IOException {

        String filepath = "F:\\JavaPrj\\Java_task10\\src\\N1_ReadtoString\\file1.txt";
        File file = new File(filepath);

        //Записываем в список все строки файла
        ArrayList<String> strList = readToString(file);

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

    }
}
