PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(500,500);
     pepperoni=loadImage("pepperoni.png");
   olive=loadImage("olive.png");
   mushroom=loadImage("mushroom.png");
    pepperoni.resize(50,50);
    olive.resize(50,50);
    mushroom.resize(50,50);
    
    
      fill(#D8862E);
   ellipse(250,250,300,300);
   fill(#B2230D);
   ellipse(250,250,270,270);
   fill(#CBB323);
   ellipse(250,250,240,240); 
}

   
   
     void draw() {
   
   
   image(pepperoni, 250,250);
  image(pepperoni, 250,150);
   image(pepperoni, 170,250);
   image(mushroom, 250,250);
   image(olive,200,200);
   
   if(mousePressed &&(mouseButton == LEFT )){
   
   image(olive, mouseX,mouseY);
   }
   if(mousePressed && (mouseButton == RIGHT )){  
     
     image(pepperoni, mouseX,mouseY);
     
     
   }
 }
   