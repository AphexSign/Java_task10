//        Написать метод, который записывает в файл строку, переданную параметром.
package N2_StringToFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class N2_StrToFile {
    //Вариант для строки
    public static void strToFile(File file, String value) throws IOException {
        Writer writer = new FileWriter(file);
        writer.write(value);
        writer.flush();
        writer.close();

    }

    //Вариант для списка строк
    public static void strToFile(File file, ArrayList<String> value) throws IOException {
        Writer writer = new FileWriter(file);
        //Резервируем символ переноса строки
        final String sp = System.getProperty("line.separator");

        for (int i = 0; i < value.size(); i++) {
            writer.write(value.get(i) + sp);
        }
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        String filepath = "F:\\JavaPrj\\txt2.txt";
        File file = new File(filepath);
        String str = "Моя строка5";

        strToFile(file, str);
    }
}
