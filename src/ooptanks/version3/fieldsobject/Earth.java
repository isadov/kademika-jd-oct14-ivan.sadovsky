package ooptanks.version3.fieldsobject;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Earth extends BFObject {

	public Earth() {
		this.color = new Color(102, 255, 102);
		try {
			this.image = ImageIO.read(new File("C:\\Users\\Skadufex\\Desktop\\tanks\\GreenGrass.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Earth(int x, int y) {
		this.color = new Color(102, 255, 102);
		this.x = x;
		this.y = y;
		try {
			this.image = ImageIO.read(new File("C:\\Users\\Skadufex\\Desktop\\tanks\\GreenGrass.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}