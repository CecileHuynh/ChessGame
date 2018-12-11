package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class ChessGame extends Observable implements BoardGames{
	protected Echiquier echiquier;
	public ChessGame(){
		echiquier=new Echiquier();
	}

	@Override
	public String toString()
	{
		return this.getMessage()+echiquier.getPiecesIHM();
	}
	
	public boolean move(int xInit, int yInit, int xFinal, int yFinal){
		boolean ret = false;
		if(echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)){
			if(echiquier.move(xInit, yInit, xFinal, yFinal))
			{
				echiquier.switchJoueur(); 
				setChanged();
				notifyObservers(this.echiquier.getPiecesIHM());
				ret = true;
			}
		}
		return ret;
	}
	
	
	public List<Coord> moveIndicator(int xInit,int yInit){
		List<Coord> listCoord=new ArrayList<>();
		for(int x=0;x<8;x++)
		{
			for(int y=0;y<8;y++)
			{
				if(echiquier.isMoveOk(xInit, yInit, x, y)){
					Coord c=new Coord(x,y);
					listCoord.add(c);
				}
			}
		}
		return listCoord;
	}
	
	public boolean isEnd(){
		return echiquier.isEnd();
	}
	
	public String getMessage(){
		return echiquier.getMessage();
	}
	
	public Couleur getColorCurrentPlayer(){
		return echiquier.getColorCurrentPlayer();
	}
	
	public Couleur getPieceColor(int x,int y)
	{
		return echiquier.getPieceColor(x, y);
	}	

}
