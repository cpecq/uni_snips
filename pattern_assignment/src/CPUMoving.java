import java.util.*;
public class CPUMoving extends State {

	public CPUMoving(Stage stage) {
		super(stage);
	}

	public void mouseClicked(int x, int y){}

	@Override
	public void cpuMove(Stage stage){

		for(Actor a: stage.actors){
                if (!a.isTeamRed()){
                    List<Cell> possibleLocs = stage.getClearRadius(a.loc, a.moves, true);

                    Cell nextLoc = a.strat.chooseNextLoc(possibleLocs);

                    a.setLocation(nextLoc);
                }
            }
            stage.changeState(new ChoosingActor(stage));
            for(Actor a: stage.actors){
                a.turns = 1;
            }
	}
}
