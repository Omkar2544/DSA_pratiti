package com.om.dsa;

import java.io.*;
import java.util.*;

class Book
{
	int  bookNumber;
	String bookName;
	float bookPrice;

	public Book(int bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	public Book(int bookNumber, String bookName, float bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookName, bookNumber, bookPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && bookNumber == other.bookNumber
				&& Float.floatToIntBits(bookPrice) == Float.floatToIntBits(other.bookPrice);
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	


	
	
}
public class StoreBooks {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashTable hashTable = new LinearProbingHashTable(sc.nextInt());
		
		
		
		
	}
}
