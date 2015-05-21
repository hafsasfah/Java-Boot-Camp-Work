import java.util.Iterator;

import javax.swing.JPanel;

public interface IMaze {
	IPosition getStartingPosition();
	IPosition getCurrentPosition();
	Iterator<IPosition> iterator( IPosition position );
	boolean isEndPosition( IPosition position );
	boolean isValidPosition( IPosition position );
	JPanel getPanel();
}
