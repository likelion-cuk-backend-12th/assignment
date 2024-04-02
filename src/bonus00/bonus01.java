package src.bonus00;

public class bonus01 {
    public static int findLSL(String str){
        int cnt = 0;
        int maxVal = 0;
        char preChar;
        for(int i = 0; i < str.length(); i++)
        {
            cnt = 0;
            preChar = str.charAt(i);
            for(int j = i; j < str.length(); j++)
            {
                if(preChar == str.charAt(j)) {
                    cnt++;
                    preChar = str.charAt(j);
                }
                else
                    break;
            }
            if(cnt > maxVal)
                maxVal = cnt;
        }



        return maxVal;
    }

    public static void main(String[] args) {
        String str = "bcdegdaaacc";

        System.out.println("findLSL(str) = " + findLSL(str));
    }
}
