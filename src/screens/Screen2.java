package screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Screen2 {

	private Canvas canvas;
	private GraphicsContext gc;
	
	public Screen2(Canvas canvas) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
	}
	
	public void paint() {
		gc.setFill(Color.RED);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}

}
