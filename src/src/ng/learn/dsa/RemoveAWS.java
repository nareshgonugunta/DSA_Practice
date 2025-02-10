package ng.learn.dsa;

import java.sql.Timestamp;
import java.util.Timer;
import java.util.TimerTask;

public class RemoveAWS {

    class User{
        Integer userId;
        Address address;
    }
    class Address {
        String city;
    }

    public static void main(String[] args) {
        //String s = "AAWSWSNGSHGJHSHNNKCNKNKFNKNKNKNDKFDKRNREDAKDSDDGGFGGGFABBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAREENKNLNKNKNNNZXNPDBJBGGBBVBEERBJBCUHEBBBUEGWGBIWHHHFHIHEFNHIAFFFIJIJIHIHIHH";
        String s = "ABBAWSWSG";
        long startTime = System.nanoTime();
        String result = getFinalString(s);
        System.out.println(result);
        String result1 = finalAWS(s);
        System.out.println(result1);
        long endTime = (System.nanoTime() - startTime)/1000000;
        System.out.println("Time taken :"+endTime);

        System.out.println("Hello".equals(new String("Hello")));

    }

    static  String finalAWS(String s) {
        while(s.contains("AWS")){
            s = s.replaceFirst("AWS","");
            if(s.length() == 0){
                return  "-1";
            }
        }
        return s;
    }

    private static String getFinalString(String s) {
        int start = 0, end = s.length();
        while(start < end) {
            int awsIndex = s.indexOf("AWS", start);
            if (awsIndex == -1) {
                break;
            }
            if( end < awsIndex){
                end = end-3;
            }
            start = awsIndex+3;
        }
        return start < end ? s.substring(start, end) : "-1";
    }
}
