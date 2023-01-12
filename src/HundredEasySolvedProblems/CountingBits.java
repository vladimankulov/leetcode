package HundredEasySolvedProblems;

import java.util.Arrays;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 */

public class CountingBits {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(countBits(6)));
    System.out.println(Arrays.toString(countBits(5)));
  }

  public static int[] countBits(int n) {
    int[] arr = new int[n+1];
    arr[0]=0; //Since for decimal number 0 , no. of '1' bits in its binary representation = 0
    for(int i=1; i<=n; i++){
      int count=0;
      int new_i=i; //as we do not want to change the value of original i variable, so we will store it in new_i variable which will get updated at each iteration for counting '1' bits.
      //loop to iterate each bit of the number and count no. of '1' bits
      while(new_i>0){ //till the number becomes 0 i.e.it has no '1' bits remaining in its binary representation
        count+= (new_i & 1); //0 will be added to count if last bit is 0 , and 1 will be added to count variable if last bit is 1, therby increasing count to 1.
        new_i= new_i >> 1;  // to drop the last bit
      }
      arr[i]= count;

    }
    return arr;
  }

}
