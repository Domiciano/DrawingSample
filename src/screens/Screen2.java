package screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Screen2 extends ScreenBase{

	
	public Screen2(Canvas canvas) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
	}
	
	public void paint() {
		gc.setFill(Color.RED);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}

	public void onClick() {
		// TODO Auto-generated method stub
		
	}

	public void onKeyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
