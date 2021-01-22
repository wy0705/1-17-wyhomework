package io;

import java.io.*;

public class InputTable {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/table.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fis.close();

    }
}
