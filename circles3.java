
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
  ellipse(200, 200, 100, 100);
  textAlign(CENTER,CENTER);
  text("DRAFT", 175, 175); 
  stroke(10);
  textSize(15);

}
// it will add shapes for a draft 
void mousePressed() { 
  ellipse(150, 150, 50, 50);
  ellipse(250,150,50,50);
  rectMode(CENTER);
  rect(200,290,w/3 ,h);
  stroke(10);
  }
// it will change collor, pressed mouse and it will add shapes again. 
void keyPressed() {
 background(225, 205, 10);
 background(255, 200, 0);

}

 
