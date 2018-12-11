package model;

public class PieceIHM {
	protected Pieces piece;
	public PieceIHM(Pieces piece){
		this.piece=piece;
	}
	
	public int getX(){
		return this.piece.getX();
	}

	public int getY(){
		return this.piece.getY();
	}
	
	public Couleur getCouleur(){
		return this.piece.getCouleur();
	}
	
	public String getName(){
		return this.piece.getName();
	}
	
	@Override
	public String toString(){
		return this.getName() + this.getX() + this.getY()+ this.getCouleur();
	}
	
}
