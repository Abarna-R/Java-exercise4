package com.stackroute;

import java.util.Arrays;

public class SortWords {
    public String[] sort(String s) {
        String[] string = s.trim().toLowerCase().split(" ");
        Arrays.sort(string);
        return string;
    }
}
