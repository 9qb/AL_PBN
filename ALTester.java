// Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
// APCS pd6
// L02 -- OrderedArrayList
// 2021-12-10
// time spent: 0.8 hours

/*
DISCO
- Have to import java.util.ArrayList and limit the ArrayList object to only use integers.
- ArrayList has its own compareTo() method. 
QCC
- How could you modify this program to work with Objects other than Integer?
- How would compareTo work with Strings? Other objects?
*/

import java.util.ArrayList;

public class ALTester{
  public ArrayList<Integer> randle;

  public ALTester(){ // populates ArrayList of size 23
    randle = new ArrayList<Integer>(23);
    for (int counter = 0; counter < 23; counter++){
      randle.add((int)(Math.random() * 100));
    }
  }

  public ALTester(int _size){
    randle = new ArrayList<Integer>(_size);
    for (int counter = 0; counter < _size; counter++){
      randle.add((int)(Math.random() * 100));
    }
  }

  // checks for sortedness in ascending order, returns false at first detection of
  // unsortedness. otherwise returns true.
  public boolean checkSort(){
    for (int i = 0; i + 1 < randle.size(); i++){
      if ((randle.get(i).compareTo(randle.get(i+1))) <= 0){
        return false;
      }
    }
    return true;
  }

  // employs ArrayList's toString()
  public String toString(){
    return randle.toString();
  }

  public static void main(String[] args){
    ALTester test = new ALTester();
    System.out.println(test);
    System.out.println("is sorted?: " + test.checkSort());
  }
}
