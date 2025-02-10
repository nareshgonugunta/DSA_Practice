package ng.learn;

public class EpamTestRoundOne implements  A, B{

    public static void main(String[] args) {
        System.out.println("flower".indexOf("flight"));
        String[] strs = {"flower", "flow", "flight"};
        //System.out.println(findLongestCommonPrefix(strs));

    }

    public  String findLongestCommonPrefix( String[] strs){

        EpamTestRoundOne epamTestRoundOne = new EpamTestRoundOne();
        print();

        String prefix = strs[0];


        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }


    @Override
    public void print() {
        A.super.print();
    }
}


interface A {
    default void print(){
        System.out.println("A");
    }
}

interface B {
    default void print(){
        System.out.println("B");
    }
}