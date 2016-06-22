This is consolebrush version 2 that contains some minor improvements and the below user guide. 

How to use this program.

a.1.0) Run the program and wait for the prompt 
"Enter a command: C=Canvas, L=Line, R=Rectangle, B=Fill or Q=Quit"

 a.1.1) select C to draw a canvas and then wait for the next prompt. 
 
  "Enter the length and height"
  
a.1.2) Enter the x(length) and y(height) you want to draw. Example is shown below.
  10 5

a.2.1) Enter L to draw a line inside the canvas where you will be promted to enter coordinates x1,y1/x2,y2.
L
"Draw line between points x1,y1 and x2,y2"

a.2.2) After this prompt enter the coordinates to draw a line. Only vertical or horisontal lines can be drawn.
3 2 5 2

a.3.1) Enter R to draw a rectangle inside the canvas and wait for the prompt.
R
"Draw Rectangle between points x1,y1 and x2,y2"

a.3.2) After the prompt enter the coordinates to draw the rectangle.
3 3 7 5

a.4.1) Enter B to fill the canvas and wait for the prompt
B
"Enter coordinates and a fill"

a.4.2) After the prompt enter two points and a colour fill
1 1 c

a.5.1) Enter Q to quit the program.

Running the tests

b.1.0) select the ConsoleTest class and pres run

b.2.1) you will be promted to enter coordinates to draw a line

"Draw line between points x1,y1 and x2,y2" 
2 3 6 3
the test should fail or pass at this point depending on the size of canvas and the coordinates you entered. For example if the canvas is 5 by 5 the above test will fail.

b.2.2) the test will then prompt to enter the cordinates to draw a rectangle
Draw Rectangle between potins x1,y1 and x2,y2 
3 1 7 4

again the test should pass or fail depending on the coordinates provided.

