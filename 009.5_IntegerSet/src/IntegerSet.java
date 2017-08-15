import java.util.Arrays;

public class IntegerSet {
	
	private int[] element;	//Used to store numbers, minimum length is 10.
	private int count;		//Count of numbers in array.

	//Constructor
	public IntegerSet () {
		element = new int[10];
		count = 0;
		fillIn(0);
	}
	
	//Constructor which assign maximum size.
	public IntegerSet (int size) {
		this();
		element = new int[size];
	}		
	
	//Fill in -1.
	private void fillIn(int start) {
		for (int i = start; i < this.element.length; i++)
			this.element[i] = -1;
	}
	
	//Insert new element value to array which cannot be duplicated to elements in array.
	public void insert(int value) {
		//If number of input is more than array size, resize.
		if (this.count >= this.element.length)
			this.resize(this.count * 2);
		
		//If input value is not in valid range, show message.
		if (value < 0 || value > 100)
			System.out.printf("'%d' out of range!\n", value);
		//If input value is duplicated, print message, else, add to array.
		else if (this.search(value) == -1)
			this.element[count++] = value;
		else
			System.out.printf("'%d' duplicated!\n", value);
	}	
	
	//Get integer of index i, if input index is out of boundary, return -1.
	public int getElement(int i) {
		if (i > this.count)
			return -1;
		else
			return (this.element[i]);
	}
	
	//Print all elements in the array.
	public void output() {
		for (int i = 0; i < this.count; i++)
			System.out.printf("%d ",this.element[i]);
		System.out.print("\n");
	}
	
	//Search whether value is in the set. Return index if yes and return -1 if it's not in the set.
	public int search(int value) {
		for (int i = 0; i < count; i++) {
			if(this.element[i] == value)
				return i;
		}
		return -1;
	}
	
	//Remove element value.
	public void delete(int value) {
		int targetIndex = this.search(value);
		if (targetIndex == -1)
			System.out.printf("'%d' not found!\n", value);
		else {
			for (int i = targetIndex; i < this.count - 1; i++)
				this.element[i] = this.element[i + 1];
			this.count--;
			System.out.printf("'%d' successfully deleted!\n", value);
		}
	} 
	
	//Find intersection with A and return.
	public IntegerSet intersection(IntegerSet A) {
		if (A == this)
			return A;
		
		IntegerSet a = new IntegerSet();
		
		//Do intersection.
		for (int i = 0; i < this.count; i++) {
			if (A.search(this.element[i]) != -1)
				a.insert(this.element[i]);
		}
		return a;
	}
	
	//Find union with A and return.
	public IntegerSet union(IntegerSet A) {
		if (A == this)
			return A;
		IntegerSet a = new IntegerSet();
		//Copy element of A to a.
		for (int i = 0; i < A.count; i++) {
			a.insert(A.element[i]);
		}
		//If element of this is not in array a, add in.
		for (int i = 0; i < this.count; i++) {
			if (a.search(this.element[i]) == -1)
				a.insert(this.element[i]);
		}
		return a;
	}
	
	//Resize array if input numbers is more than available.
	private void resize(int newSize) {
		this.element = Arrays.copyOf(this.element, newSize);
		this.fillIn(this.count);
	}


}
