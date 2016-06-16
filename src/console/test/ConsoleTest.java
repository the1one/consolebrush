package console.test;

import java.util.InputMismatchException;

import org.junit.Test;

import console.draw.BuildCanvas;
import console.draw.DrawInCanvas;

public class ConsoleTest {


	static char[][] body = new char[10][10];
	static BuildCanvas canvas1 = new BuildCanvas();
	DrawInCanvas testDraw = new DrawInCanvas();

	
	@Test(expected = NullPointerException.class)
	public void test() {
		
		testDraw.buildLine(body, canvas1);
	}
	
	@Test(expected = NullPointerException.class)
	public void test1() {
		
		testDraw.buildRectangle(body, canvas1);
	}
	
	@Test(expected = NullPointerException.class)
	public void test3(){
		
		testDraw.colourFill(canvas1, 1, 10, 'C');
	}

}

