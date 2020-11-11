package io;

import java.io.File;

public class DataReaderTestRun {

    public static void main(String[] args) {

        TextDataReader reader = new TextDataReader();

        //pag 86 ex A
        System.out.println(reader.countStrings("textfiles" + File.separator + "LoremIpsum.txt"));
        System.out.println("\n");
        //pag 86 ex B
        System.out.println(reader.countSpecialSigns("textfiles" + File.separator + "LoremIpsum.txt"));


    }

}
