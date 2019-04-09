package com.stackroute;

public class ReplaceLetter {
    public String replace(String query){
        query = query.replaceAll("[L|l]","t");
        return query.replaceAll("[D|d]", "f");
    }
}
