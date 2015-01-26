package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.Destroyable;

public class Brick extends BFObject implements Destroyable{
	
	public Brick(){
		this.color = new Color(230,6,6); 
		try {
			this.image = ImageIO.read(new File("Blocks.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		  }	
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
 
	
}
