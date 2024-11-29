class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
      roman.put('I',1);
      roman.put('V',5);
      roman.put('X',10);
      roman.put('L',50);
      roman.put('C',100);
      roman.put('D',500);
      roman.put('M',1000);
      int sum =0;
      int i,j;
      char [] arr = s.toCharArray();
      for( i = 0 , j=1; j<arr.length; i++,j++){
        if(roman.get(arr[i]) >= roman.get(arr[j])){
            sum+=roman.get(arr[i]);
        }
        else{
            sum-=roman.get(arr[i]);
        }
      }
         sum+=roman.get(arr[i]);
         return sum;
    }
}
