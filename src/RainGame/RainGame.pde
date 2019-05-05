int y=0;
int randomNumber = (int) random(width);
int score = 0;
int strike = 5;
void setup(){
  size(500,500);
}

void draw(){
  background(175,175,175);
  if (strike==0){
    textSize(50);
    text("YOU LOSE", 125, 250);
     }
  else if (score>=100){
   textSize(50);
  text("YOU WIN", 125, 250); 
  }
  else{
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  text("Strikes: " + strike, 110, 20);
  fill(62,203,227);
  stroke(147,219,227);
  ellipse(randomNumber,y,10,20);
    if (score<10){
    y=y+5;
  }
  else if (score>=10 && score<20){
    y=y+6;
  }
  else if (score>=20 && score<30){
    y=y+7;
  }
  else if (score>=30 && score<40){
    y=y+8;
  }
  else if (score>=40 && score<50){
    y=y+9;
  }
  else if (score>=50 && score<90){
    y=y+10;
  }
  else if (score>=90 && score<100){
    y=y+15;
  }
  fill(157,171,173);
  rect(mouseX, 425, 50, 75);
  if (y>=500) {
    checkCatch(randomNumber);
    y=0;
    randomNumber = (int) random(width);
  }
  }
}

void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) {
          strike--;
     }
     println("Your score is now: " + score); }