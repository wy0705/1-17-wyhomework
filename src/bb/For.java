package bb;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //用target标记
        target:for (int n:arrayList){
            for (int m:arrayList){
                if (m==3){
                    break target;//利用target跳出外层for循环
                }
            }
            System.out.println(n);
        }
    }
}
