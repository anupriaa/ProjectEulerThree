import java.util.ArrayList;

/**
 * Created by Anupriya on 2/4/2015.
 */
public class ProjectEulerThree {
  public  static void main(String[] args){
    ArrayList<Long> pf = new ArrayList<Long>();
    long num =600851475143l , i=2l;
    while(num>1){
      while(num%i == 0){
        pf.add(i);
        num /=i;
      }
      i++;
    }
    System.out.print("largest factor"+pf.get(pf.size()-1));
  }
}
