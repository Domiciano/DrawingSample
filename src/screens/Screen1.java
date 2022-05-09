package screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import model.Avatar;

public class Screen1 extends ScreenBase{
	
	//Componentes
	private Avatar avatar;
	
	public Screen1(Canvas canvas) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
		this.avatar = new Avatar(canvas, 250, 250);
	}
	
	public void paint() {
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		avatar.paint();
	}

	public void onClick() {
		// TODO Auto-generated method stub
	}

	public void onKeyPressed(KeyEvent e) {
		if(e.getCode().equals(KeyCode.UP)) {
			avatar.moveUp();
		}else if(e.getCode().equals(KeyCode.DOWN)) {
			avatar.moveDown();
		}
	}

}
