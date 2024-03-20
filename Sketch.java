import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

   int ScreenSize;

  public void settings() {
	// put your size call here
    size(600, 600);

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

    if (width >= height)
    {
      ScreenSize = height;
    }
    else
    {
      ScreenSize = width;
    }

  }

  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stroke(0);
    strokeWeight(1);

    // top left quadrent

    // vertical lines
    for (int i = 0; i <= (width / 2); i += (ScreenSize / 20) )
    {
      line(i, 0, i, (height / 2) );
    }
    // horizontal lines
    for (int i = 0; i <= (height / 2); i += (ScreenSize / 20) )
    {
      line(0, i, (width / 2), i );
    }

    // top right quadrent

    // going horizsontaly
    for (int i = (width / 2) + (ScreenSize / 10); i <= width - (ScreenSize / 10); i += (ScreenSize / 10) )
    {
      // going verticaly
      for (int n = (ScreenSize / 10); n <= (height / 2) - (ScreenSize / 10); n += (ScreenSize / 10) )
      {
        fill(200,255,255);
        circle(i, n, (ScreenSize / 12) );
      }
    }

    // bottom left quadrent
    for (int i = 0; i <= (width / 2); i += 1)
    {
      int Gradiant = (int)(i * 1.3);
      stroke(Gradiant, Gradiant, Gradiant);
      line(i, height / 2, i, height);
    }

    //bottom right quadrent

    pushMatrix();
    // new origon point
    translate(width - (width / 4), height - (height / 4) );

    // large petal inital rotation
    rotate(QUARTER_PI/2);

    // first large petal set up
    stroke(0);
    fill(100, 184, 205);

    for (int i = 0; i <= 8; i++)
    {
      rotate(TWO_PI / 8);
      ellipse(0, ScreenSize / 10 , ScreenSize / 12, ScreenSize / 5);
    }

    // second large petal set up
    stroke(255);
    strokeWeight(ScreenSize / 200);
    fill(124, 214, 231);
    for (int i = 0; i <= 8; i++)
    {
      rotate(TWO_PI / 8);
      ellipse(0, ScreenSize / 10 , ScreenSize / 18, ScreenSize / 7);
    }
    popMatrix();

    // flower center thing
    strokeWeight(ScreenSize / 150);
    stroke(196, 174, 36);
    fill(243, 216, 96);
    circle(width - (width / 4), height - (height / 4), ScreenSize / 10);

  }
  
  // define other methods down here.
}