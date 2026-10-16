class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums2){
            if(set1.contains(num)){
                ans.add(num);
                set1.remove(num);
            }
        }
        int[] a = new int[ans.size()];

        for(int i = 0 ; i<ans.size() ; i++){
            a[i] = ans.get(i);
        }
        return a;
    }
}