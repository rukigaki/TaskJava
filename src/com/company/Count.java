package com.company;

public class Count {
    String str, letter;
    String[] strArr;
    int count, result;
    Count (String str) {
        this.str = str;
        strArr = str.split("");
        count = result = 0;
        letter = "";
    }

    void getResult() {
        for (String a : strArr) {
            for (String s : strArr)
                if (a.equals(s)) {
                    ++count;
                    if (count >= result) {
                        result = count;
                        letter = a;
                    }
                }
            count = 0;
        }
        System.out.println(letter + " " + result);
    }
}
