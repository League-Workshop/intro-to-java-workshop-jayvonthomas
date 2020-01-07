PImage catPic;

int leftx = 303;
int rightx = 523;
int lefty = 402;
int righty =414;
void setup() {
  size(800, 700);

  catPic = loadImage("cat.jpg");
  catPic.resize(width, height);
  background(catPic);
  noStroke();
}

void draw () {


  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  fill(#96FA0D);

  ellipse(leftx, lefty, 100, 80);
  ellipse(rightx, righty, 100, 80);
}

void keyPressed() {
  leftx+=3;
  lefty+=5;
rightx+=4;
righty+=2;

if (lefty > height){
 background(catPic);
  leftx = 303;
 rightx = 523;
 lefty = 402;
 righty =414;
}


}
