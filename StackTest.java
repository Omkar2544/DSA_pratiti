//package com.om.dsa;
//
//import java.util.Stack;
//
//public class StackTest {
//	public static void main(String[] args) {
//		Stack<String> st = new Stack<String>();
//		
//		MyStack stack = new MyStack(5);
//		stack.push('A');
//		stack.push("asjd");
//		stack.push("Jack");
//		stack.push("skjdf");
//		stack.push("ksdhfj");
//		
//		
//	//	System.out.println(stack.peek());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//
//		//System.out.println(stack.pop());
//
//	}
//}
//
//class MyStack<T>
//{
//	T array[]; // = new int[ ? ]
//	int top=-1;
//	int size;
//	
//	public MyStack(int size) {
//		this.size = size;
//		
////		array =  new Object [ size ];
//	}
//	void push(Object item) {
//			
//		if(top+1 >= size)
//			throw new StackOverFlowException("Stack is full");
//		
//		array [ ++top ] = (T) item;
//	}
//	
//	Object pop() {
//		if(top==-1) 
//			throw new EmptyStackExeption("Stack is Empty");
//		
//		return array [ top-- ];
//	}
//	
//	Object peek() {
//		if(top==-1) 
//			throw new EmptyStackExeption("Stack is Empty");
//		
//		return array[top];
//	}
//}
//
//class StackOverFlowException extends RuntimeException
//{
//
//	public StackOverFlowException(String message) {
//		super(message);
//	}
//	
//}
//
//class EmptyStackExeption extends RuntimeException {
//	EmptyStackExeption(String str) {
//		super(str);
//	}
//}
