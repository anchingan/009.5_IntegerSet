/*
 * Practice 009.2_Integer set
 * Date 20170811
 */
public class TestIntegerSet {

	public static void main(String[] args) {

	}

}

class IntegerSet {
	
	private int[] element;	//Used to store numbers, minimum length is 10.
	private int count;		//Count of numbers in array.

	//Constructor
	public IntegerSet () {}
	
	//Constructor which assign maximum size.
	public IntegerSet (int size) {
		
	}		
	
	//Insert new element value to array which cannot be duplicate.
	public void Insert(int value) {
		
	}	
	
	//Get integer of index i, if input index is out of boundary, return -1.
	public int getElement(int i) {
		return -1;
	}
	
	//Print all elements in the array.
	public void output() {
		
	}
	
	//Search whether value is in the set. Return index if yes and return -1 if it's not in the set.
	public int seach(int value) {
		return -1;
	}
	
	//Remove element value.
	public void delete(int value) {
		
	} 
	
	//Find intersection with A and return.
	public IntegerSet intersection(IntegerSet A) {
		IntegerSet a = new IntegerSet();
		return a;
	}
	
	//Find union with A and return.
	public IntegerSet union(IntegerSet A) {
		IntegerSet a = new IntegerSet();
		return a;
	}
	
	//Resize array if input numbers is more than available.
	private void resize(int newSize) {
		
	}

}