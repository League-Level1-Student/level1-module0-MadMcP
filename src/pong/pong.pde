int x=250;
int y=250;
int s=5;
import ddf.minim.*;
Minim minim;
AudioSample sound;int speed=10;
void setup(){
  size(500,500);
  background(78,161,242);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}

void draw(){
  background(78,161,242);
  fill(255,33,26);
  stroke(255,33,26);
  ellipse(x,y,25,25);
  x=x+s;
  y=y+speed;
  if (x>=500){
   s=-s; 
  }
  if (x<=0){
   s=-s; 
  }
  if(y>=475){
   speed=-speed; 
   sound.trigger();
   intersects(x, y, mouseX, 475, 100);
  }
  if(y<=0){
   speed=-speed;
  }
  fill(70,252,61);
  rect(mouseX, 475, 100, 25);
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
 if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
  return true;
 else
  return false;
    }
