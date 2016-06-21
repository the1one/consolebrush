package console.draw;

import java.util.Scanner;

public class DrawShapeMain {

	static char[][] body;
	static String command;
	static BuildCanvas canvas = new BuildCanvas();
	static DrawInCanvas drawShape = new DrawInCanvas();

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a command: C=Canvas, L=Line, R=Rectangle, B=Fill or Q=Quit");
		System.out.println();

		command = in.next();
		while (!command.equals("Q")) {

			// draw canvas
			if (command.equals("C")) {

				int width = in.nextInt();
				int height = in.nextInt();
				body = new char[height][width];
				canvas.canvasBody = body;
				canvas.buildShape();
				canvas.drawCanvas();
			}

			// draw line
			if (command.equals("L")) {
				try {
					drawShape.buildLine(canvas.canvasBody, canvas);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("your input is out of bounds ");
				}
			}
			// draw rectangle
			if (command.equals("R")) {
				try {
					drawShape.buildRectangle(body, canvas);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("your input is out of bounds ");
				}
			}
			// command to fill the empty spaces
			if (command.equals("B")) {
				System.out.println("Enter coordinates and a fill");
				int width = in.nextInt();
				int height = in.nextInt();
				char[] fill = in.next().toCharArray();
				if (fill.length > 1) {
					System.out.println("please enter one character only");
				}
				// fill in the empty spaces of canvas
				drawShape.colourFill(canvas, width, height, fill[0]);

				// print canvas on screen
				try {
					canvas.drawCanvas();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("your input is out of bounds ");
				}
			}

			if (command.equals("Q")) {
				System.out.println("Program exited ");
				break;
			}

			System.out.println();
			command = in.next();

		}
		System.out.println("Program exited ");
	}

}
