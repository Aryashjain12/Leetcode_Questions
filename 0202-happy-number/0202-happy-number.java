class Solution {
    public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
        while(n!=1 && n>0){
            int sum = 0;
            int x = n;
            while(x!=0){
                int l = x%10;
                sum+=(l*l);
                x = x/10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;            
        }
        return true;
    }
}