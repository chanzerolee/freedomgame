package gmae.controller;
import game.model.GameModel;

public class GameController {
		GameModel gm = new GameModel();
		public void gameStart(String id) {
			gm.gameStart(id);
		}
		public void plazaAction(int num) {
			gm.plazaAction(num);
		}
		public  void playGame() {
			gm.playGame();
		}
}
