package screens;


import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Screen2 extends ScreenBase{

	
	public Screen2(Canvas canvas) {
		super(canvas);
	}

	public void paint() {
		gc.setFill(Color.RED);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}


	public void onKeyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onClick(javafx.scene.input.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
