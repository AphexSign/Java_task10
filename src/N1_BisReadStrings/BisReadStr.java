package N1_BisReadStrings;

import java.io.*;
import java.util.ArrayList;

public class BisReadStr {
    public static void main(String[] args) throws IOException {

        File file = new File("F:\\JavaPrj\\txt.txt");
        ArrayList<String> mylist = fileToList(file);

        for (String s : mylist) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> fileToList(File file) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile());

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        String line;
        ArrayList<Byte> arrBts = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        while (bufferedInputStream.available() > 0) {
            int mb = bufferedInputStream.read();

            if (mb == '\n' || bufferedInputStream.available() == 0) {
                byte[] lnb = new byte[arrBts.size()];
                for (int i = 0; i < arrBts.size(); i++) {
                    lnb[i] = arrBts.get(i);
                }
                strList.add(new String(lnb));
                arrBts.clear();
            } else {
                arrBts.add((byte) mb);
            }
        }
        return strList;
    }


}





