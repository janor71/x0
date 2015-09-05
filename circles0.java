//// Wild circles #0.

// Setup:  screen size. //
void setup() {
  size(400, 400);                 // increase window size
   background(250,84,0);          // add color 
}

// Next frame:  circle at (x,y).  //
void draw() {
  ellipse( 200,200,80,80 );       // move the circle to the middle 
  ellipse(200,200,40,40);         //add another circle inside
  ellipse(200,200,20,20);         // add a 3rd circle inside 
}
