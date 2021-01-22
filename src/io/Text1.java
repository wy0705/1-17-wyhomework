package io;

import java.io.*;

class Mythread implements Runnable{
    File fout = new File("src/table.txt");
    @Override
    public void run() {
        try {
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            synchronized (this) {
                for (int i = 1; i < 10; i++) {
                    StringBuilder s = new StringBuilder(" ");
                    for (int j = 1; j <= i; j++) {
                        s.append(i + "*" + j + "=" + (i * j) + "\t");
                    }
                    System.out.println(s.toString());
                    bw.write(s.toString());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
public class Text1 {
    public static void main(String[] args) {

        Mythread mythread=new Mythread();
        new Thread(mythread).start();
        new Thread(mythread).start();
    }
}
