package Dsa.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithGivenXor {
  public int solve(ArrayList<Integer> A, int B) {
    int ans =0;
    int n = A.size();
    HashMap<Integer, Integer> m = new HashMap<>();
    int[] arr = new int[n];
    arr[0]= A.get(0);
    for(int i =1;i<n;i++){
      arr[i] = arr[i-1]^A.get(i);
    }
    for(int i =0;i<n;i++){
      int k = B^arr[i];
      if(m.containsKey(k)){
        ans =  ans + m.get(k);
      }
      if(arr[i]==B){
        ans++;
      }
      if(m.containsKey(arr[i])){
        m.put(arr[i] , m.get(arr[i])+1);
      }
      else{
        m.put(arr[i],1);
      }
    }
    return ans;
  }
}

