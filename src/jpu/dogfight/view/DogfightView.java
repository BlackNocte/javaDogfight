package jpu.dogfight.view;
  import java.lang.Runnable;
  import java.util.Observable;
  import jpu2016.gameframe.GameFrame;
public class DogfightView <orderPerformer, dogfightModel> implements IViewSystem {
    public EventPerformer eventPerformer;
	public GraphicsBuilder graphicsBuilder;
    public GameFrame gameFrame;
	public orderPerformer IOrderPerformer;
	public dogfightModel IDogfightModel;
	public Observable Observable;

    @Override
	public void displayMessage(String Message) {
	}

	@Override
	public void CloseAll() {	
	}
	private void run(){
    }
	public orderPerformer IOrderPerformer(){
	return this.IOrderPerformer;
	}
	public dogfightModel IDogfightModel(){
		return this.IDogfightModel;
	}
}