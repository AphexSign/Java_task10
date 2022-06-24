//        Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.

package N3_MergeFiles;//

import N1_ReadtoString.ReadtoStrings;
import N2_StringToFile.N2_StrToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class N3_MergeFiles {

    public static void merge(File file1, File file2) throws IOException {

        //Из двух файлов заносим строки в списки. Пользуемся процедурой из первого задания
        var arr1 = ReadtoStrings.readToString(file1);
        var arr2 = ReadtoStrings.readToString(file2);
        String filepath3 = file1.getName();
        //Даем имя новому файлу, добавляя префикс _merged
        filepath3 = file1.getParent() + "\\" + filepath3.replace(".", "_merged.");
        //Выделяем место в памяти для нового файла
        File file3 = new File(filepath3);
        //Cклеиваем списки в один большой
        arr1.addAll(arr2);
        //Передаем склеянный список в новый файл
        N2_StrToFile.strToFile(file3, arr1);
    }

    public static void main(String[] args) throws IOException {
        //Написать метод, который на входе принимает два файла и выдает новый файл,
        //структура которого равна слиянию строк 1-ого файла со строками 2-ого файла
        //Название придумывается если такого файла нет
        //Название файла равно название1+названние2+мердж

        String filepath1 = "F:\\JavaPrj\\txt.txt";
        String filepath2 = "F:\\JavaPrj\\txt2.txt";
        File file1 = new File(filepath1);
        File file2 = new File(filepath2);

        merge(file1, file2);

    }
}
