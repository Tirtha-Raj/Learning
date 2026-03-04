package study.LLD.udemy.oops.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class WithPrototypePattern {
	public static void main(String[] args) {
		GameBoardV2 board = new  GameBoardV2();
		board.addPieces(new GamePieceV2("Orange", 1));
		board.addPieces(new GamePieceV2("Purple", 2));
		board.addPieces(new GamePieceV2("Pink", 5));
		System.out.println("Current : ");
		board.showCurrentState();
		System.out.println("Cloned : ");
		GameBoardV2 clonedBoard =  board.cloneObj();
		clonedBoard.showCurrentState();
	}
}

interface Prototype<T> {
	T cloneObj();
}

class GameBoardV2 implements Prototype<GameBoardV2> {
	private List<GamePieceV2> gamePieces = new ArrayList<>();

	public void addPieces(GamePieceV2 gamepiece) {
		gamePieces.add(gamepiece);
	}

	public List<GamePieceV2> getPieces() {
		return gamePieces;
	}

	public void showCurrentState() {
		for (GamePieceV2 piece : gamePieces) {
			System.out.println("Color : " + piece.getColor() + "	Position : " + piece.getPosition());
		}
	}

	@Override
	public GameBoardV2 cloneObj() {
		GameBoardV2 clonedgameBoard = new GameBoardV2();
		for (GamePieceV2 piece : gamePieces) {
			clonedgameBoard.addPieces(piece.cloneObj());
		}
		return clonedgameBoard;
	}

}

class GamePieceV2 implements Prototype<GamePieceV2> {
	private String color;
	private int position;

	public GamePieceV2(String color, int position) {
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
	public GamePieceV2 cloneObj() {
		return new GamePieceV2(color, position);
	}
}