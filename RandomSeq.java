/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomSeq {
  public static void main(String[] args) {
    // lo, hi 범위에서 랜덤하게 N개의 숫자를 출력한다.
    int N = Integer.parseInt(args[0]);
    double lo = Double.parseDouble(args[1]);
    double hi = Double.parseDouble(args[2]);
    for (int i = 0; i < N; i++) {
      double x = StdRandom.uniform(lo, hi);
      StdOut.printf("%.2f\n", x);
    }
  }
}
