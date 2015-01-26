package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Water extends BFObject{

	 public Water(){
		 this.color = new Color(65,105,225);
		 try {
				this.image = ImageIO.read(new File("Water.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
	 }
}