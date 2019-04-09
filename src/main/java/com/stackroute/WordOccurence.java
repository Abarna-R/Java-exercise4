package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurence {
    public String [] occurence(String query,String word) {
        List<String> position = new ArrayList<>();
        if (query.contains(word)) {
            Pattern p = Pattern.compile("\\b" + word + "*");
            Matcher m = p.matcher(query);
            while (m.find()) {
                position.add(m.start() + "-" + m.end());
            }
            return position.toArray(new String[position.size()]);
        }
        else {
            return  null;
        }
    }
}
