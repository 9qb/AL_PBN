# Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha


## ALTester

ALTester has a default constructor which initializes a new object ArrayList with 23 indices that can only contain integer elements. Once initialized, each index is assigned a randomly generated value. Then, it uses checkSort() to confirm whether or not the array's elements are arranged in ascending order. This method checks for sortedness in ascending order, it returns false at first detection of unsortedness. otherwise returns true. A string message is then printed to display whether or not the array is sorted in ascending order.  

It also tests the methods of OrderedArrayList.

## OrderedArrayList

- toString(): Overrides toString() with ArrayList's toString().
- get(int index): Using ArrayList's get(), returns the int at a certain index.
- size(): Using ArrayList's size(), returns the size of the ArrayList.
- swap(int a, int b): Swap method to be used with sort().
- sort(): Iterates through _data, size() times. Every time the value at an index n is greater than the value at index n+1, the values swap places. The outer for loop ensures the appropriate number of swaps are done, while the nested for loop allows for swapping at a lower scope.
- set(int index, int newVal): Employs ArrayList's set(), and then sorts the list in case the replaced value breaks ascending order.
- add(int newVal): Employs ArrayList's add(). Index of insertion is based on the appropriate index that maintains ascending order. Proceeding values are shifted one index greater.  
- remove(int index): Using ArrayList's remove(), removes the element at a certain index and shifts proceeding values one index less. 
