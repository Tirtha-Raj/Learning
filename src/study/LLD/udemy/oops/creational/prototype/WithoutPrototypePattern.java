package study.LLD.udemy.oops.creational.prototype;

import java.util.ArrayList;
import java.util.List;

//Consider a board game where you need to save the current state of the game at
//	various checkpoints. Instead of manually creating new board objects and copying all
//		the pieces or their states
public class WithoutPrototypePattern {
	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		board.addPieces(new GamePiece("Red", 3));
		board.addPieces(new GamePiece("Blue", 6));
		board.addPieces(new GamePiece("Green", 10));
		System.out.println("Current states : ");
		board.showCurrentState();

		GameBoard cloneBoard = new GameBoard();
		for (GamePiece piece : board.getPieces()) {
// Here problem exposing functionality to client, if inner class changes client needs to be change
			cloneBoard.addPieces(new GamePiece(piece.getColor(), piece.getPosition()));
		}
		System.out.println("Cloned state : ");
		cloneBoard.showCurrentState();
	}
}

class GameBoard {
	private List<GamePiece> gamePieces = new ArrayList<>();

	public void addPieces(GamePiece gamepiece) {
		gamePieces.add(gamepiece);
	}

	public List<GamePiece> getPieces() {
		return gamePieces;
	}

	public void showCurrentState() {
		for (GamePiece piece : gamePieces) {
			System.out.println("Color : " + piece.getColor() + "	Position : " + piece.getPosition());
		}
	}

}

class GamePiece {
	private String color;
	private int position;

	public GamePiece(String color, int position) {
		this.color = color;
		this.position = position;
	}

	public String getColor() {
		return color;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}