class Solution {
    public boolean judgeCircle(String mov) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        char arr[] = mov.toCharArray();

        for(int i = 0;i<arr.length;i++){
            char a = arr[i];
            if(a == 'U') count1++;
            else if(a == 'D')count2++;
            else if(a == 'R') count3++;
            else if(a == 'L') count4++;
        }
      if(count1 == count2 && count3 == count4){
        return true;
      }
      else return false;

    }
}