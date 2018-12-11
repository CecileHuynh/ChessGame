package controler;

import java.util.Observable;
import java.util.Observer;

public class ObserverV implements Observer{
	private ObservableM observable;
	
	@Override
	public void update(ObservableM o, Object arg) {
		observable=new ObservableM()
	}

}
