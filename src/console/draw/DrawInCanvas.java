package console.draw;

import java.util.Scanner;

public class DrawInCanvas {
	
	Scanner in = new Scanner(System.in);
	int x1; int y1; int x2; int y2;

	// method that builds a vert or horz lines from two coordinates
	public void buildLine(char canvasBody[][], BuildCanvas canvas){	
		System.out.println("Draw line between points x1,y1 and x2,y2 ");
		x1 = in.nextInt()-1;
		y1 = in.nextInt()-1;
		x2 = in.nextInt()-1;
		y2 = in.nextInt()-1;
        
		// find out if the line is vertical or horizontal
		// draw horizontal line
		if (x1 == x2) {
			for (int j = y1; j <= y2; j++) {
				canvasBody[j][x1] = 'x';
			}
			canvas.drawCanvas();
		}
		// draw vertical line
		else if (y1 == y2) {
			for (int i = x1; i <= x2; i++) {
				canvasBody[y1][i] = 'x';
			}
			canvas.drawCanvas();
		}
		else{
			System.out.println("Only vertical or horisontal lines can be drawn");
		}
	}
	
	// build rectangle from x1,y1 x2,y2
	public void buildRectangle(char body[][], BuildCanvas canvas){
		System.out.println("Draw Rectangle between potins x1,y1 and x2,y2 ");
		x1 = in.nextInt()-1;
		y1 = in.nextInt()-1;
		x2 = in.nextInt()-1;
		y2 = in.nextInt()-1;
		//if (x1 <= x2 && y1 <=y2) {
			for (int i = x1 ; i <= x2; i++) {	
				body[y1][i] = 'x';
				body[y2][i] = 'x';
			}
			for(int j=y1; j <=y2; j++){
				body[j][x1] = 'x';
				body[j][x2] = 'x';
			}
		//}
	  canvas.drawCanvas();
	}
	
	//colour fill the areas in the canvas where there are no other shapes
	public void colourFill(BuildCanvas canvas, int x, int y, char newColor) {
		
		if (x < 0 || x >= canvas.canvasBody.length || y < 0 || y >= canvas.canvasBody[0].length) {
			return;
		}
		if (canvas.canvasBody[x][y] != ' ' || canvas.canvasBody[x][y] == newColor) {
			return;
		}
		canvas.canvasBody[x][y] = newColor;
		colourFill(canvas, x, y + 1, newColor);
		colourFill(canvas, x, y - 1, newColor);
		colourFill(canvas, x + 1, y, newColor);
		colourFill(canvas, x - 1, y, newColor);
	}

}
