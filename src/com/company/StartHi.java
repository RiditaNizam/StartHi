package com.company;

/**
 * Created by ridita on 3/19/17.
 */
public class StartHi {

    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

}
