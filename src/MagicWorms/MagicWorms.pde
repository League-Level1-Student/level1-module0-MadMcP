int x=0;
int y=0;
void setup(){
 size(500,500);
 background(0,0,0);
}

void draw(){
 for(int i = 0; i<=300; i++){
   fill(255,0,0);
   stroke(255,0,0);
   ellipse(x,y,10,5);
  x=x+5;
  y=y+5;
 }
}
