package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import screens.Screen1;
import screens.Screen2;

public class MainWindow implements Initializable {

	@FXML
	private Canvas canvas;

	private int screen = 0;
	private Screen1 s1;
	private Screen2 s2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		canvas.setFocusTraversable(true);
		s1 = new Screen1(canvas);
		s2 = new Screen2(canvas);
		events();
		
		new Thread(() -> {
			while (true) {
				switch (screen) {
				case 0:
					s1.paint();
					break;

				case 1:
					s2.paint();
					break;

				}
				pause(50);
			}
		}).start();

	}

	private void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void events() {
		canvas.setOnKeyPressed(e -> {
			switch (screen) {
			case 0:
				s1.onKeyPressed(e);
				break;
			case 1:
				s2.onKeyPressed(e);
				break;

			}
		});

		canvas.setOnMouseClicked(e -> {
			switch (screen) {
			case 0:
				s1.onClick();
				break;
			case 1:
				s2.onClick();
				break;

			}
		});
	}

}
