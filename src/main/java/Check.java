import Dsa.Hashing.SubArrayWithGivenXor;
import Dsa.Hashing.Two_out_of_Three;
import java.util.ArrayList;
import java.util.Arrays;

public class Check {

  public static void main(String[] args){

//    Two_out_of_Three two_out_of_three = new Two_out_of_Three();
//    System.out.println(two_out_of_three.solve(new ArrayList<>(Arrays.asList(1,2)),new ArrayList<>(Arrays.asList(2,3)),
//        new ArrayList<>(Arrays.asList(3,4))));

    SubArrayWithGivenXor subArrayWithGivenXor  = new SubArrayWithGivenXor();
    System.out.println(subArrayWithGivenXor.solve(new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,3)),3));
  }

}
