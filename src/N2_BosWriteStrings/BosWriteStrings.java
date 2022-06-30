////        Написать метод, который записывает в файл строку, переданную параметром.
package N2_BosWriteStrings;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class BosWriteStrings {
    public static void main(String[] args) {
        File file = new File("F:\\JavaPrj\\txt2.txt");
        final String sp = System.getProperty("line.separator");
        String myStr = "My_Test_String" + sp;

        ArrayList<String> strList = new ArrayList();
        strList.add(myStr);
        strList.add(myStr);
        strList.add(myStr);

        bosWriteStrings(file, strList);
    }

    //Вариант для строки
    public static void bosWriteStrings(File file, String str) {
        // Запись строки
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.getAbsoluteFile()))) {
            bufferedOutputStream.write(str.getBytes());
        } catch (IOException e) {

        }
    }
    //Вариант для списка строк

    public static void bosWriteStrings(File file, ArrayList<String> strList) {
        String str;
        //Резервируем строку-символ - разделитель строки
        final String sp = System.getProperty("line.separator");
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.getAbsoluteFile()))) {

            for (int i = 0; i < strList.size(); i++) {
                str = strList.get(i);
                bufferedOutputStream.write(str.getBytes());
            }
        } catch (IOException e) {

        }
    }


}
