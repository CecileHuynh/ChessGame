package controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import model.ChessGame;
import model.Echiquier;
import model.PieceIHM;

public class ObservableM extends Observable{
	Echiquier echiquier;
	public ObservableM(Echiquier echeq){
		this.echiquier=echeq;
	}
	
	public List<PieceIHM> getPieceIHM(){
		return this.echiquier.getPiecesIHM();
	}
}
