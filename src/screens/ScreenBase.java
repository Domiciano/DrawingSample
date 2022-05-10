package screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public abstract class ScreenBase {
	
	protected Canvas canvas;
	protected GraphicsContext gc;
	
	public ScreenBase(Canvas canvas) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
	}
	
	public abstract void paint();
	public abstract void onClick(MouseEvent e);
	public abstract void onKeyPressed(KeyEvent e);
	

}
