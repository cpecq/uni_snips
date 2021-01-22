public abstract class State {
	Stage stage;

	State(Stage stage) {
		this.stage = stage;
	}

    public abstract void mouseClicked(int x, int y);
	public abstract void cpuMove(Stage stage);

	}
