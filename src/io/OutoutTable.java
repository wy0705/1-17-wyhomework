package io;

import java.io.*;

public class OutoutTable {
    public static void main(String[] args) throws IOException {
        File fout = new File("src/table.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i=1; i < 10; i++) {
            StringBuilder s=new StringBuilder(" ");
            for (int j = 1; j <= i; j++) {
                s.append(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println(s.toString());
            bw.write(s.toString());
            bw.newLine();
        }

        bw.close();
    }
}
