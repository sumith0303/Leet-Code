class Solution {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String i : strs) {
        String r = sortString(i);
        map.putIfAbsent(r, new ArrayList<>());
        map.get(r).add(i);
    }
        return new ArrayList<>(map.values());
        
    }
}