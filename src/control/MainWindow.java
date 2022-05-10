package control;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import screens.Screen1;
import screens.Screen2;
import screens.ScreenBase;

public class MainWindow implements Initializable {

	@FXML
	private Canvas canvas;

	private int screen = 0;
	private List<ScreenBase> screens;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		screens = new ArrayList<>();
		screens.add(new Screen1(canvas));
		screens.add(new Screen2(canvas));	
		canvas.setFocusTraversable(true);
	
		events();
		
		new Thread(() -> {
			while (true) {
				switch (screen) {
				case 0:
					screens.get(0).paint();
					break;

				case 1:
					screens.get(1).paint();
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
			screens.get(screen).onKeyPressed(e);
		});

		
		
		canvas.setOnMouseClicked(e -> {
			screens.get(screen).onClick(e);	
		});
	}

}
