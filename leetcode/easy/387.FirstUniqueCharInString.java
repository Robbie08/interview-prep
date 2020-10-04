// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

// Examples:

// s = "leetcode"
// return 0.

// s = "loveleetcode"
// return 2.

public int firstUniqChar(String s) {
        Hashtable<Character, Integer> htable = new Hashtable<Character, Integer>(); // create our hashtable
        
        if(s.length() == 0)
            return -1;
        
        for(int i = 0; i < s.length(); i++)
        {
            // check if value is in hashtable
            if(!htable.containsKey(s.charAt(i)))
                htable.put(s.charAt(i),1); // initialize with value of 1
            else
                htable.put(s.charAt(i), htable.get(s.charAt(i))+1); // we must increase counter   
        }
    
        int index = -1;
        // we just need to loop through the elements again and see if the key is == 1
        for(int j = 0; j < s.length(); j++)
        {
            if(htable.get(s.charAt(j)) == 1)
            {
                index = j; // store the current index
                break;
            }
        }
        
        return index;
    }