int maximum69Number (int num) {
    int rev = 0;
    while(num!=0){
        int n = num%10;
        rev = rev*10 + n;
        num = num/10;
    }
    int revc = 0;
    while(rev!=0){
        int n = rev%10;
        if(n==6){
            n= 9;
            revc = revc*10+n;
            rev = rev/10;
            while(rev!=0){
                int n = rev%10;
                revc = revc*10 +n;
                rev = rev/10;
            }
            return revc;
        }
        revc = revc*10 +n;
        rev = rev/10;
    }
    return revc;
        
}