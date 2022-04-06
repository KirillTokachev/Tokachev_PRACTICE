package com.example.tokachev_practice.tasks;

// Task 3
/*https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/solutions/java*/
public class BackspacesInString {
    public String cleanString(String s) {
        int idx = s.indexOf("#");
        return idx < 0 ? s : idx == 0 ? cleanString(s.substring(1)) : cleanString(s.substring(0, idx-1) + s.substring(idx+1));
    }
}
