package com.zz;

import java.util.Map;
import java.util.Set;

import static java.lang.Math.abs;

public class Driver {
    public static void main(String[] args) {

        int a=21;
        String b=countAndSay(a);
        System.out.println(b);

        // find local environment
//        Map<String,String>envs=System.getenv();
//        Set<Map.Entry<String,String>> entries=envs.entrySet();
//
//        for(Map.Entry<String,String> entry: entries){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }


//        if(args.length<3){
//            System.out.println("not enough argument");
//        }
//
//        if(args[0].equals("--add")){
//            System.out.println(add(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
//
//        }
//        if(args[0].equals("-sub")){
//            System.out.println(sub(Integer.valueOf(args[1]),Integer.valueOf(args[2])));
//
//        }

    }

    public static int add(int x,int y){
        return x+y;
    }

    public static int sub(int x,int y){
        return Math.abs(x-y);
    }

    public static int subString(String haystack, String needle){

        return haystack.indexOf(needle);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        else {
            String prev = countAndSay(n-1);
            char curr = prev.charAt(0);
            int count = 0;

            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < prev.length(); i++){
                if (prev.charAt(i) == curr) {
                    count++;
                }
                else {
                    sb = sb.append(Integer.toString(count)).append(String.valueOf(curr));
                    curr = prev.charAt(i);
                    count = 1;
                }
            }
            sb = sb.append(Integer.toString(count)).append(String.valueOf(curr));
            return sb.toString();
        }


//        String str=String.valueOf(n);
//        String ans="";
//        char[] array=str.toCharArray();
//        for(int i=1;i<str.length();i++){
//            int localcount=1;
//            while(array[i-1]==array[i] && i<str.length()-1){
//                localcount++;
//                i++;
//            }
//            ans+=String.valueOf(localcount)+array[i-1];
//
//        }
//        if(array[str.length()-2]!=array[str.length()-1]){
//            ans+="1"+array[str.length()-1];
//        }
//        return ans;

    }

}
