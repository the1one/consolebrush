package console.draw;

import java.util.Arrays;

public class BuildCanvas {
	
	public char[][] canvasBody;
	
	public void buildShape(){
		
		for(char[] row : canvasBody){
			Arrays.fill(row, ' ');
		}
	}
	
	public void drawCanvas(){
		int k=1;
		while(k <=canvasBody[0].length+2){System.out.print("-"); k++;}
		System.out.println();
		
		for(int i=0; i < canvasBody.length; i++){
			System.out.print('|');
			for(int j=0; j < canvasBody[i].length; j++){
    				System.out.print( canvasBody[i][j] );
			}
			System.out.println("|");
		}
		k=1;
		while(k <=canvasBody[0].length+2){System.out.print("-"); k++;}
		System.out.println();
	}
}
