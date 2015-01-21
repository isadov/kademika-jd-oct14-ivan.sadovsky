package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ooptanks.version3.serviceclass.Destroyable;

public class Eagle extends BFObject implements Destroyable{

	public Eagle(){
		this.color = new Color(255,255,255);
		try {
			this.image = ImageIO.read(new File("C:\\Users\\Skadufex\\Desktop\\tanks\\Eagle.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }	
	}
	
	@Override
	public void destroy() throws Exception {
		
	}

}
