package com.memoryleak;

public class MemoryLeakDemo {
	
	static Object1 object = new Object1();

	public static void main(String[] args) {
		
		try {
			object.grow();
		}catch(Throwable e)
		{
			System.out.println(e);
		}
	}

}
