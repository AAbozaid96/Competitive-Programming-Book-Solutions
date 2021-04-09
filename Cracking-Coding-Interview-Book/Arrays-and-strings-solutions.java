1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

// using Set Data Structure
//time O(n)  space O(n)
// using additional data structure
Boolean isUniqueString(String str){
        Set<Character> S=new HashSet<>();
        for (char c :s.toCharArray()) {
            S.add(c);
        }
    return S.size() == str.length();
}

// using bet-vector
//time O(n)  space O(0)
// without additional data structure
Boolean isUniqueString(String s){
         int checker = 0;
        for (char c :s.toCharArray()) {
            int charAcii= c;
          // check if the bit is true or false
            if((checker & (1 << charAcii)) > 0){
                return false;
            }
           // toggle the bit is true
            checker |= ( 1 << charAcii);
        }
    return true;
}

=============================================================================================================
