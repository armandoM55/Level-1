PImage record;
int angle= 45;
import ddf.minim.*;
Minim minim;        
  AudioPlayer song;      

void setup(){

record= loadImage("record.jpeg");
size (record.width, record.height);

minim = new Minim(this);    
song = minim.loadFile("h.mp3", 512);


}
void draw(){
  if(mousePressed){
    
  rotateImage(record, angle);
  image (record, 10, 10);
angle= angle+15;
song.play();
}}
void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}

