package chess;

import boardgame.Board;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessPieceFactory {
    public static ChessPiece createPiece(char type, Color color, Board board, ChessMatch match) {
        switch (type) {
            case 'R':
                return new Rook(board, color);
            case 'N':
                return new Knight(board, color);
            case 'B':
                return new Bishop(board, color);
            case 'Q':
                return new Queen(board, color);
            case 'K':
                return new King(board, color, match);
            case 'P':
                return new Pawn(board, color, match);
            case 'H':
            	return new Knight(board, color);	
            default:
                throw new IllegalArgumentException("Invalid piece type: " + type);
        }
    }

}
