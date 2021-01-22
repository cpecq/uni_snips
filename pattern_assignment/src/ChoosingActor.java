import java.util.*;
public class ChoosingActor extends State {

	public ChoosingActor(Stage stage){
		super(stage);
	}

	@Override
	public void mouseClicked(int x, int y){

		stage.actorInAction = Optional.empty();
                for (Actor a : stage.actors) {
                    if (a.loc.contains(x, y) && a.isTeamRed() && a.turns > 0) {
                        stage.cellOverlay = stage.grid.getRadius(a.loc, a.moves, true);
                        stage.actorInAction = Optional.of(a);
						stage.changeState(new SelectingNewLocation(stage));
                    }
                }
                if(!stage.actorInAction.isPresent()){
					stage.changeState(new SelectingMenuItem(stage));
                    stage.menuOverlay.add(new MenuItem("Oops", x, y, () -> stage.changeState(new ChoosingActor(stage))));
                    stage.menuOverlay.add(new MenuItem("End Turn", x, y+MenuItem.height, () -> stage.changeState(new CPUMoving(stage))));
                    stage.menuOverlay.add(new MenuItem("End Game", x, y+MenuItem.height*2, () -> System.exit(0)));
                }
	}

	@Override
	public void cpuMove(Stage stage) {}
}
