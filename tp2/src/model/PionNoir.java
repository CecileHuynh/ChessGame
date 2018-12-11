package model;

public class PionNoir extends Pion{
	private boolean premierCoup;

	/**
	 * @param name
	 * @param couleur_de_piece
	 * @param coord
	 */
	public PionNoir(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		this.premierCoup = true;
	}

	public boolean moveVertical(int yFinal){
		boolean ret=false;
		
		if ((yFinal - this.getY() > 0)) {
			ret = true;
		}
		return ret;
	}
	
	public boolean moveDiagonal(int xFinal, int yFinal){
		boolean ret= false;	
		if ((yFinal == this.getY()+1 && xFinal == this.getX()+1) 
			|| (yFinal == this.getY()+1 && xFinal == this.getX()-1)) {
			ret = true;
		}
		return ret;
	}	

}
