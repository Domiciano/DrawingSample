package model;

import java.io.File;
import java.io.FileInputStream;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Avatar {

	//Ref
	private Canvas canvas;
	private GraphicsContext gc;
	
	private int X;
	private int Y;
	private Image image;

	public Avatar(Canvas canvas, int X, int Y) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
		this.X = X;
		this.Y = Y;
		
		try {
			File f = new File("src/images/1.png");
			image = new Image(new FileInputStream(f));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void paint() {
		gc.drawImage(image, X, Y);
	}

}





