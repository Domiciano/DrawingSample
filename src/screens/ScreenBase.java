package screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

public abstract class ScreenBase {
	
	protected Canvas canvas;
	protected GraphicsContext gc;
	
	
	public abstract void paint();
	public abstract void onClick();
	public abstract void onKeyPressed(KeyEvent e);
	

}
