package org.usc.edu;

import java.util.HashMap;

public class Anagaram {
    public boolean isAnagram(String s, String t) {
        
        if(s.equals(t)){
            return Boolean.TRUE;
        }
        HashMap<Character,Integer> myHash = new HashMap<Character,Integer>();
        char []mArray = s.toCharArray();
        int len = s.length();
        for(int i=0;i<len;i++){
            if(!myHash.containsKey(mArray[i])){
                myHash.put(mArray[i],1);
            }
            else
            {
                myHash.put(mArray[i],myHash.get(mArray[i])+1);
            }
        }
        char []nArray = t.toCharArray();
        int len2 = t.length();
        HashMap<Character,Integer> nHash = new HashMap<Character,Integer>();
        for(int i=0;i<len2;i++){
            if(!nHash.containsKey(nArray[i])){
                nHash.put(nArray[i],1);
            }
            else
            {
                nHash.put(nArray[i],nHash.get(nArray[i])+1);
            }
        }
        if(myHash.equals(nHash)){
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
        
        
    }
}