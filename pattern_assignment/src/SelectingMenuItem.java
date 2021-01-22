import java.util.ArrayList;
public class SelectingMenuItem extends State {

	public SelectingMenuItem(Stage stage){
		super(stage);
	}

	@Override
	public void mouseClicked(int x, int y){
		for(MenuItem mi : stage.menuOverlay){
			if (mi.contains(x,y)){
				mi.action.run();
				stage.menuOverlay = new ArrayList<MenuItem>();
			}
		}
	}

	@Override
	public void cpuMove(Stage stage) {}
}
