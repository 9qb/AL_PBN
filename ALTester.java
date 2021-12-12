import java.util.ArrayList;

public class ALTester{
  public ArrayList<Integer> randle;

  public ALTester(){
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

  public boolean checkSort(){
    for (int i = 0; i + 1 < randle.size(); i++){
      if ((randle.get(i).compareTo(randle.get(i+1))) <= 0){
        return false;
      }
    }
    return true;
  }

  public String toString(){
    return randle.toString();
  }

  public static void main(String[] args){
    ALTester test = new ALTester();
    System.out.println(test);
    System.out.println("is sorted?: " + test.checkSort());
  }
}
