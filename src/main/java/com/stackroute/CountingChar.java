package com.stackroute;

public class CountingChar {
    public int count(String query,String s){
        if(query.contains(s)) {
            String[] count = query.split("("+s+"|"+s.toUpperCase()+")",-2);
            return (count.length-1);
        }
        else
            return 0;
    }
}
