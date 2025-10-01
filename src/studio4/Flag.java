package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(128, 128, 0);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);

		StdDraw.setPenColor(255, 175, 175);
		StdDraw.ellipse(0.5, 0.5, 0.28, 0.14);
		StdDraw.filledEllipse(0.5, 0.5, 0.28, 0.14);

		StdDraw.setPenColor(3, 252, 236);
		StdDraw.ellipse(0.5, 0.5, 0.13, 0.14);
		StdDraw.filledEllipse(0.5, 0.5, 0.13, 0.14);
	}
}