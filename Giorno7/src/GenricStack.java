
import java.util.ArrayList;
import java.util.List;

public class GenricStack<E> {

	List<E> myStack = new ArrayList<E>();
	
	public int getSize() {
		return myStack == null ? 
				0 :
				myStack.size();
	}
	
	
	public E peek() {
		if(myStack == null) return null;
		
		return myStack.get(getSize() -1);
	}
	
	public void push( E obj) {
		
		if(myStack == null) return;
		myStack.add(obj);
	}
	
	public E pop() {
		
		if(myStack ==  null) return null;
		
		int lastInd =getSize() -1;
		E obj = myStack.get(lastInd);
		myStack.remove(lastInd);
		
		return obj;
	}
	
	public boolean isEmpty() {
		
		
		
		return myStack == null ? true : myStack.isEmpty();
		
		
		
		
	}
	
	@Override
	public String toString() {
		return myStack == null ? "null" :myStack.toString();
	}
	
	public static void main(String[] args) {
	
	
		GenricStack<Integer> ms = new GenricStack<>();
		ms.push(10);
		ms.push(50);
		ms.push(300);
		ms.push(1);
	
		
		System.out.println("actual stack: "+ ms.toString());
		System.out.println("actual stack: "+ ms.peek());
		
		System.out.println("pop last element: "+ ms.pop());
		System.out.println("pop last element: "+ ms.pop());
		System.out.println("pop last element: "+ ms.pop());
		
		System.out.println("actual stack: "+ ms.toString());
		
	}
	
	
}
