
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);
  x=  width/2;
  y=  height/2;
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse

}

void draw() {
  fill(242,219,210);
  ellipse(200, 200, 100, 100);
  fill(0);
  ellipse(x-75,y-60,10,20);   // ADD EYES TO FIGURE
  ellipse(x-25,y-60,10,20);
  ellipse(x-50,y-40,5,10);
  textAlign(CENTER,CENTER);
  fill(0);
  textSize(10);
  text("DRAFT PANDA", x-50, y+90); // NAME THE POSSIBLE FIGURE

}
// it will add shapes for a draft // NOT SURE IF THIS IS HAPPENING
void mousePressed() { 
  ellipse(150, 150, 50, 50);
  ellipse(250,150,50,50);
  rectMode(CENTER);
  rect(200,290,w/3 ,h); 
  stroke(10);
  }
 //> THIS IS NOT LONGER HAPPENING THOUGH?// it will change collor, pressed mouse and it will add shapes again. 
void keyPressed() {
 background(225, 205, 10);
 background(208, 185, 232); // CHANGED COLOR TO BACKGROUND.

}

 
