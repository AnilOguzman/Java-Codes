package Stack;

public class Stack_Array {
private static final int DEFAULT_CAPACITY=10;
private Object[] items;
private int top;
public Stack_Array() {
	// TODO Auto-generated constructor stub
	items=new Object[DEFAULT_CAPACITY];
	top=-1;
}
public boolean isEmpty() {
	return top<=0;
}
public void push(int item) {
	if(top<items.length-1) {
		//expandCapacity();
	}
	top++;
	items[top]=item;
}
public int pop() {
	if(isEmpty()) {
		System.out.println("BOÞ");
		//return null;
	}
	//int retVal=items[top];
	
	top--;
	return (int) items[top];
}
public Object top() {
	if(isEmpty()) {
		return null;
	}
	return items[top];
}
}
