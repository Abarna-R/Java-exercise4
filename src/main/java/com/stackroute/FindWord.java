package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
    public String find(String query){
        Pattern p = Pattern.compile("[H|h]arry");
        Matcher m = p.matcher(query);
        if(m.find()){
            return "is Harry here ? True";
        }
        else
            return "is Harry here ? False";
    }
}
