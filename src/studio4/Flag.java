package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		int redOne = 255;
		int greenOne = 60;
		int blueOne = 184;
		Color pink = new Color(redOne, greenOne, blueOne);
		
		StdDraw.point(0.5, 0.5);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		
		int redTwo = 255;
		int greenTwo = 246;
		int blueTwo = 158;
		Color yellow = new Color(redTwo, greenTwo, blueTwo);
		
		StdDraw.point(0.5, 0.5);
		StdDraw.setPenColor(yellow);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.05);
		
	}
}