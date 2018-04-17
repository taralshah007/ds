package com.tashah.cs.arrays;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
        if(s == null || t ==null) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<String, String> charMap = new HashMap<String, String>();
        for(int i = 0; i < s.length(); i++) {
            String charS = Character.toString(s.charAt(i));
            
            String charT = Character.toString(t.charAt(i));
            if( !charS.equals(charT)) {
                charMap.put(charS, charT);    
            }
        }
        System.out.println(charMap);
        String output = "";
        for(int j = 0; j < s.length(); j++) {
            String charSJ = Character.toString(s.charAt(j));
            String x = charMap.containsKey(charSJ) ? charMap.get(charSJ) : charSJ;
            output = output + x;
        }
        return output.equals(t);
    }
	public static void main(String[] args) {
		IsomorphicString i = new IsomorphicString();
		System.out.println(i.isIsomorphic("ab", "aa"));
		System.out.println((45 << 8)+5);
		System.out.println((45 << 8)+5 & 0xFF);
	}
}
