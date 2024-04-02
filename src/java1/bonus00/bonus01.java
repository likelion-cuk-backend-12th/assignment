package java1.bonus00;

import java.util.Collections;
import java.util.HashMap;

public class bonus01 {
    public static void main(String[] args) {
        String str="가가가나나나다다다다다라라라라마";
        System.out.println(findLSL(str));
    }

    public static int findLSL(String str){
        char[] chararr = str.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();

        for(int i=0; i< chararr.length; i++){
            if(count.get(chararr[i])==null){
                count.put(chararr[i], 1);
            }
            else{
                int a = count.get(chararr[i]);
                count.put(chararr[i], a+=1);
            }
        }
        Integer maxValue = Collections.max(count.values());

        return maxValue;
    }
}
