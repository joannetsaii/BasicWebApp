package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "JT-Team";
        }
        

        if (query.toLowerCase().contains("largest")) {
            query = query.replaceAll("[^\\d.]", "");
            query.replace(" ", "");
            String[] parts = query.split(",");
            int curLargest = Integer.parseInt(parts[0]);
            for (int i = 0; i < parts.length; i++) {
                int num = Integer.parseInt(parts[i]);
                if (num > curLargest) {
                    curLargest = num;
                };
            }
            String res = String.valueOf(curLargest);
            return res;
        }

        return "";

    }
}
