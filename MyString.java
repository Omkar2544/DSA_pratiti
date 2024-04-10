package com.om.dsa;

public class MyString {
	
	public static void main(String[] args) {
		
    	MyString  st = new MyString("Hello");
    	System.out.println(st);
	}
	
	private char[] characters;

    // Constructor for creating a String from a character array
    public MyString(char[] chars) {
        this.characters = chars;
    }

    // Constructor for creating a String from a literal
    public MyString(String literal) {
        this.characters = literal.toCharArray();
    }

    // Returns the length of the String
    public int length() {
        return characters.length;
    }

    // Returns the character at a specific index
    public char charAt(int index) {
        return characters[index];
    }

    // Creates a substring from a start index to an end index (exclusive)
    public MyString substring(int start, int end) {
        char[] subChars = new char[end - start];
        System.arraycopy(characters, start, subChars, 0, end - start);
        return new MyString(subChars);
    }

    // Concatenates two Strings
    public MyString concat(MyString other) {
        int totalLength = length() + other.length();
        char[] newChars = new char[totalLength];
        System.arraycopy(characters, 0, newChars, 0, length());
        System.arraycopy(other.characters, 0, newChars, length(), other.length());
        return new MyString(newChars);
    }

    // Returns a lowercase version of the String
    public MyString toLowerCase() {
        char[] lowerChars = new char[length()];
        for (int i = 0; i < length(); i++) {
            lowerChars[i] = Character.toLowerCase(characters[i]);
        }
        return new MyString(lowerChars);
    }

    // Returns a String representation of the object
    @Override
    public String toString() {
        return new String(characters);
    }
    
    
}