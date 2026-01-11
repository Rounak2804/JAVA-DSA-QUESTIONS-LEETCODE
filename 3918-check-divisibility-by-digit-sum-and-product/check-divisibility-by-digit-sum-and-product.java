class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int p = 1;
        int a = 0;
        int o = n;
        while(o!=0){
            int last = o % 10;
            sum = sum + last;
            p = p * last;
            o = o / 10;
        }
    
    a = p + sum;
    if(n%a==0){
        return true;
    }
    else{
        return false;
    }
}
}