package Dsa.Hashing;

import java.util.ArrayList;
import java.util.TreeMap;

public class Two_out_of_Three {

  public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
    ArrayList<Integer> ans = new ArrayList<>();
    TreeMap<Integer,Integer> t = new TreeMap<>();
    for(int i =0;i<A.size();i++){
      if(!t.containsKey(A.get(i))){
        t.put(A.get(i),-40);
      }
    }
    for(int i =0;i<B.size();i++){
      if(!t.containsKey(B.get(i))){
        t.put(B.get(i),-30);
      }
      else{
        if(t.get(B.get(i))==-40){
          t.put(B.get(i),-70);
        }
      }
    }
    for(int i =0;i<C.size();i++){
      if(!t.containsKey(C.get(i))){
        t.put(C.get(i),-20);
      }
      else{
        if(t.get(C.get(i))==-40 || t.get(C.get(i))==-30 || t.get(C.get(i))==-70){
          t.put(C.get(i),t.get(C.get(i))-20);
        }
      }
    }

    t.forEach((k,v)->{
      if(v== -70 || v == -60 || v == -50 || v==- 90 ){
        ans.add(k);
      }
    });
    return ans;
  }
}
