import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

   int ScreenSize;

  public void settings() {
	// put your size call here
    size(400, 400);

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

    //current issue
    int gradiant = 0;
    for (int i = 0; i <= (width / 2); i += (width / 2 / 255))
    {
        strokeWeight(255 / (width / 2) );
        stroke(gradiant, gradiant, gradiant);
        line(i, height / 2, i, height);
        gradiant = gradiant + (width / 2 / 255);
    }
  }
  
  // define other methods down here.
}