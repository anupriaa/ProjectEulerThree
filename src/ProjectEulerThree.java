import java.util.ArrayList;

/**
 * Solves the project Euler Problem 3.
 */
public class ProjectEulerThree {
  /**
   * Calcultes the largest prime factor of the number 600851475143.
   * @param args Ignored.
   */
  public  static void main(String[] args){
    long number = 600851475143l;
    ArrayList<Long> pf = calculatesLargestPrimeFactor(number);
    System.out.print("largest factor"+pf.get(pf.size()-1));
  }

  /**
   * Calcultes the largest prime factor of the number.
   * @param number The number who's largest prime factor is to be calculated.
   * @return the ArrayList containg the largest prime factor.
   */
  public static ArrayList<Long> calculatesLargestPrimeFactor(long number) {
    ArrayList<Long> pf = new ArrayList<Long>();
    long num = number, i = 2l;
    while (num>1) {
      while (num % i == 0) {
        pf.add(i);
        num /= i;
      }
      i++;
    }
    return pf;
  }
}
