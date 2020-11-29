package com.bserrato.operators;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    int dif = 0;
    int spot = 0;


    public Difference(int[] elemental) {
        elements = elemental;
    }

    public int computeDifference() {
        for(int b = 0; b < elements.length; b++){
            for (int s = 0; s < elements.length ; s++){
                dif = Math.abs(elements[b] - elements[s]);
                if (dif>spot){
                    spot = dif;
                }
            }
        maximumDifference = spot;
        }
        return maximumDifference;
    }
}
