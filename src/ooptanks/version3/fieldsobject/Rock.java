package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.Destroyable;

public class Rock extends BFObject implements Destroyable{

	boolean tigerCanDestroy = true; 
	
	public Rock(){
		this.color = new Color(128,128,128);
		try {
			this.image = ImageIO.read(new File("Stones.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
