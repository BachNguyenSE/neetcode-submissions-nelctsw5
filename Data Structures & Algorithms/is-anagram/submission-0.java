class Solution {
    public boolean isAnagram(String s, String t) {
        return sortChar(s).equals(sortChar(t));
    }
    
    public ArrayList<Character> sortChar(String s){
        ArrayList<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            list.add(c);
        }
        list.sort(null);
        return list;
    }
}
