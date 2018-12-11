package controler;

import java.util.List;
import java.util.ArrayList;

import model.ChessGame;
import model.Coord;

public class ChessGameControler implements ChessGameControlers {
	ChessGame chessGame;
	
	public ChessGameControler(ChessGame chessGames){
		this.chessGame=chessGames;
	}
	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {
		int xInit=initCoord.x;
		int yInit=initCoord.y;
		int xFinal=finalCoord.x;
		int yFinal=finalCoord.y;
		this.chessGame.move(xInit, yInit, xFinal, yFinal);
		return false;
	}
	
	@Override
	public List<Coord> moveIndicator(Coord initCoord){
		List<Coord> listCoord=new ArrayList<>();
		listCoord=this.chessGame.moveIndicator(initCoord.x,initCoord.y);
		return listCoord;
	}

	@Override
	public String getMessage() {
		this.chessGame.getMessage();
		return null;
	}

	@Override
	public boolean isEnd() {
		this.chessGame.isEnd();
		return false;
	}

	@Override
	public boolean isPlayerOK(Coord initCoord) {
		return this.chessGame.getColorCurrentPlayer()==this.chessGame.getPieceColor(initCoord.x, initCoord.y);
	}

}
