void setup(){
 size(500,500); 
  
  
}
void draw(){
  PImage space = loadImage("Space.jpg");
  size(space.width, space.height);
  image(space,0,0);
  fill(0,0,255);
  rect(200,200,100,100);
  fill(255,0,0);
  ellipse(250,250,50,50);
  //rect(250,mouseY,30,30);
  
  
  
  
}
