package jpu.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.gameframe.IEventPerformer;
import javafx.scene.input.KeyCode;
     
public abstract class EventPerformer implements IEventPerformer {
 public int keyCode;
 public int getkeyCode() {
		return keyCode;
}
    public EventPerformer (IOrderPerformer  orderPerformer){
}
    public void eventPerform(KeyCode KeyEvent){    
}
	private int UserOrder(int KeyCode){
}}