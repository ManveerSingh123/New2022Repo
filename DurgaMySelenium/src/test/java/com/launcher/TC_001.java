package com.launcher;

public class TC_001 extends BaseTest {
	
	public static void main(String args [])
	{
		launch("chrome");
		
		navigate("https://www.amazon.in");
	}

}
