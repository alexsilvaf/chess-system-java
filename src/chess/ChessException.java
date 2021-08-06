package chess;

<<<<<<< HEAD
import boardgame.BoardException;

public class ChessException extends BoardException {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
=======
public class ChessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
>>>>>>> 681b9e044347cabe3dab08a7c508b4333b4890d3
