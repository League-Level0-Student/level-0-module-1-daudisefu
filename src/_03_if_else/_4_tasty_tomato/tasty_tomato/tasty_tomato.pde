void setup() {
    size(500, 500);
}
void draw() {
  fill(#F51423);
    background(200, 200, 200);
    noStroke();
    if(mousePressed) fill(#D11B1B);
   
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#19A53A);
    rect(176, 103, 12, 32);
    fill(#CBC5C5);
    if(mousePressed)  ellipse(75,220,50,50);
    
    
}