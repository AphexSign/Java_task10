//        Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
//        Метод будет читать файл, обрабатывать построчно ArrayList строк, заменяя все символы не буквы и не цифры на ДОЛЛАР
//        Полученный список будем записывать в файл

package N4_InsertSymbol;

import N1_BisReadStrings.BisReadStr;
import N2_BosWriteStrings.BosWriteStrings;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class InsertSymbol {

    public static void insertSymbol(File file) throws IOException {
        //Читает и заносит файлы в ArrayList
        ArrayList<String> arr = BisReadStr.fileToList(file);

        //Обработка каждой строки, с заменой всех элементов, кроме чисел и букв

        for (int i = 0; i < arr.size(); i++) {
            //Переводим строку в массив символов
            char[] charArray = arr.get(i).toCharArray();
            char tmpChar;
            //Пройдемся по массиву char
            for (int j = 0; j < charArray.length; j++) {
                tmpChar = charArray[j];
                //Пропускаем все символы - буквы и цифры
                if (Character.isAlphabetic(tmpChar) || (Character.isDigit(tmpChar))) {
                } else {
                    charArray[j] = '$';
                }
            }
            //Перезаписываем в элемент списка наш сконверченный массив символов
            arr.set(i, new String(charArray));
        }

        //Передаем наш список на запись в файл
        BosWriteStrings.bosWriteStrings(file, arr);
    }


    public static void main(String[] args) throws IOException {
        String filepath1 = "F:\\JavaPrj\\txt5.txt";
        File file = new File(filepath1);
        insertSymbol(file);
    }
}
