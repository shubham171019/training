import java.io.*;
import java.util.*;

class Test
{
	// Pushing element on the top of the stack
	static void stack_push(Stack<Integer> stack)
	{
		for(int i = 0; i < 5; i++)
		{
			stack.push(i);
		}
	}
	

	// Displaying element on the top of the stack
	static void stack_peek(Stack<Integer> stack)
	{
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	// Searching element in the stack
	static void stack_add(Stack<Integer> stack, int element, Stack<Integer> cart)
	{
		Integer pos = (Integer) stack.search(element);

		if(pos == -1)
			System.out.println("Element not found");
		else{
			System.out.println("Element is present and added to cart");
            cart.push(element);
            // stack.pop();
        }
	}


	public static void main (String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> cart = new Stack<Integer>();

		stack_push(stack);
		stack_push(stack);
// 		stack_peek(stack);
		stack_add(stack, 2, cart);
		stack_add(stack, 6, cart);
	}
}
