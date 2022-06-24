//        Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
//        Написать метод, который записывает в файл строку, переданную параметром.
//        Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
//        Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileInputStream fileInputStream = new FileInputStream("N1_ReadtoString/file1.txt");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }

    }




}
