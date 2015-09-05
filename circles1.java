//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);                    // width and height were changed /4 instead of 2
  x=  width/4;           
  y=  height/4;        
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 80, 80);
  ellipse(x+200, y+200, 40, 40);   // x and y values were altered 
  ellipse(x+100, y+100, 20, 20);   // x and y valuse were altered
 
  // Move them???? //--             
  x=  x + 3;  y=  y + 2;           // change x and y values
  // Insert BREAK here ^
  // to uncomment the above code,
}
