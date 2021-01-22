import java.util.*;

public class SelectingTarget extends State {

	public SelectingTarget (Stage stage){
		super(stage);
	}

	@Override
	public void mouseClicked(int x, int y){
		for(Cell c: stage.cellOverlay){
				if (c.contains(x, y)){
					Optional<Actor> oa = stage.actorAt(c);
					if (oa.isPresent()){
						oa.get().makeRedder(0.1f);
					}
				}
		}
		stage.cellOverlay = new ArrayList<Cell>();
		stage.changeState(new ChoosingActor(stage));
	}

	@Override
	public void cpuMove(Stage stage){}
}
