import java.util.ArrayList;

public class OrderedArrayList{
  public ArrayList<Integer> _data;

  public OrderedArrayList(){
    _data = new ArrayList<Integer>(10);
  }

  public OrderedArrayList(ArrayList<Integer> array){
    _data = new ArrayList<Integer>(array.size());
    for (int val : array){
      add(val);
    }
  }

  public String toString(){
    return _data.toString();
  }

  public int get(int index){
    return _data.get(index);
  }

  public int size(){
    return _data.size();
  }

  private void swap(int a, int b){
    int temp = _data.get(a);
    _data.set(a, _data.get(b));
    _data.set(b, temp);
  }

  private void sort(){
    for (int i = 0; i < size(); i++){
      for (int nestedI = 0; nestedI + 1 < size(); nestedI++){
        if (_data.get(nestedI).compareTo(get(size() - 1)) > 0){
          swap(0, size() - 1);
        }
        if (_data.get(nestedI).compareTo(get(nestedI + 1)) > 0){
          swap(nestedI, nestedI + 1);
        }
      }
    }
  }

  public int set(int index, int newVal){
    int oldVal = _data.set(index, newVal);
    sort();
    return oldVal;
  }

  public void add(int newVal){
    for (int index = 0; index < size(); index++){
      // when an existing int in _data is greater than newVal, newVal is inserted in that index.
      // the succeeding values are shifted one index greater.
      if (_data.get(index).compareTo(newVal) > 0){
        _data.add(index, newVal);
        return; // ends once the first addition is made
      }
    }
    _data.add(newVal);
  }

  public int remove(int index){
    return _data.remove(index);
  }

  // FOR TESTING
  // public static void main(String[] args){
  //   ArrayList<Integer> randle = new ArrayList<Integer>(10);
  //   for (int counter = 0; counter < 10; counter++){
  //     randle.add((int)(Math.random() * 100));
  //   }
  //   System.out.println("unsorted: \t" + randle.toString() + "\t\t size: " + randle.size());
  //
  //   OrderedArrayList test = new OrderedArrayList(randle);
  //   System.out.println("sorted: \t" + test.toString() + "\t\t size: " + test.size());
  //
  //   test.add(50);
  //   System.out.println("post-addition: \t" + test.toString() + "\t\t size: " + test.size());
  //
  //   test.remove(4);
  //   System.out.println("post-removal: \t" + test.toString() + "\t\t size: " + test.size());
  //
  //   test.set(3, 99);
  //   System.out.println("post-set: \t" + test.toString() + "\t\t size: " + test.size());
  // }

}
