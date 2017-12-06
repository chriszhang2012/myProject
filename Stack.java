package Cart;

import java.util.Arrays;
import java.util.EmptyStackException;

public final class Stack<T> implements StackInterface<T>{
	private T[] stack;    
	private int topIndex; 
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	public Stack()
	{
		
      this(DEFAULT_CAPACITY);
 	} 
	
	public Stack(int initialCapacity)
	{
		System.out.println("This constructor is called");
      checkCapacity(initialCapacity);
      
      
      @SuppressWarnings("unchecked")
      T[] tempStack = (T[])new Object[initialCapacity];
      stack = tempStack;
		topIndex = -1;
      initialized = true;
	} 

	public void push(T newEntry)
	{
		checkInitialization();
		ensureCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	} 

	public T peek()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
         return stack[topIndex];
	} 

	public T pop()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
		{
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--; 
         return top;
		} 
   } 
	

   public boolean isEmpty()
	{
		return topIndex < 0;
	} 
	
	public void clear()
	{
		checkInitialization();
      
      
		while (topIndex > -1)
      {
			stack[topIndex] = null;
         topIndex--;
      } 
	} 
   
   private void checkInitialization()
   {
      if (!initialized)
         throw new SecurityException ("ArrayStack object is not initialized properly.");
   } 
   
   private void checkCapacity(int capacity)
   {
      if (capacity > MAX_CAPACITY)
         throw new IllegalStateException("Attempt to create a stack " +
                                         "whose capacity exceeds " +
                                         "allowed maximum.");
   } 
   
	private void ensureCapacity()
	{
 	   if (topIndex >= stack.length - 1) 
      {
         int newLength = 2 * stack.length;
         checkCapacity(newLength);
         stack = Arrays.copyOf(stack, newLength);
      } 
	} 
	public String toString(){
		String str = "";
		
		for(int i = 0; i<= topIndex; i ++){
			str = str +" "+ stack[i];
		}
		
		return str;
	}
	
	
} 
