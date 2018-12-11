package vue;

import model.Coord;
import model.PieceIHM;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

import controler.ChessGameControler;

/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD *
 * 
 * Vue console d'un jeu d'échec
 * Cette classe est un observateur et le damier est mis à jour à chaque changement dans la classe métier
 */
public class ChessGameCmdLine implements Observer{

	ChessGameControler chessGameControler;
	List<PieceIHM> listPieceIHM=new ArrayList<PieceIHM>();
	public ChessGameCmdLine(ChessGameControler chessGameControler) {
		this.chessGameControler = chessGameControler;
	}


	public void go() {
		chessGameControler.move(new Coord(0,1), new Coord(2, 0));
		

		System.out.print("\n Déplacement de 3,6 vers 3,4 = ");
		chessGameControler.move(new Coord(3,6), new Coord(3, 4));	// true
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");		
		chessGameControler.move(new Coord(3,4), new Coord(3, 6));	// false 
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 4,1 vers 4,3 = ");
		chessGameControler.move(new Coord(4, 1), new Coord(4, 3));	// true
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 3,4 = ");
		chessGameControler.move(new Coord(3, 4), new Coord(3, 4));	// false
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 4,3 = ");
		chessGameControler.move(new Coord(3, 4), new Coord(4, 3));	// true		
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
	}


	@Override
	public void update(Observable o, Object arg) {
		listPieceIHM=(List<PieceIHM>)arg;
		System.out.println("changement effectué");
	}

}
