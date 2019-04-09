package com.stackroute;

public class StringTranspose {
    public String transpose(String query){
        String transposse = "";
        String [] reverse = query.toLowerCase().split(" ");
        for (int i=0;i<reverse.length;i++) {
            StringBuilder temp= new StringBuilder(reverse[i]);
            transposse += temp.reverse()+" ";
        }
        return transposse.trim() ;
    }
}
