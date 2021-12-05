package com.gmail.kutepov89.sergey;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Rectangle rt1 = new Rectangle("Rectangle1", 5, 10);
		Rectangle rt2 = new Rectangle("Rectangle2", 11, 17);
		Rectangle rt3 = new Rectangle("Rectangle3", 20, 30);
		Rectangle rt4 = new Rectangle("Rectangle4", 2, 6);
		Rectangle rt5 = new Rectangle("Rectangle5", 7, 12);
		Rectangle[] rectangles = new Rectangle[] { rt1, rt2, rt3, rt4, rt5 };

		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		
		System.out.println();
		
		Arrays.sort(rectangles);
		
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
	}

}
