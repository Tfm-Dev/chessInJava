package chess;

import java.util.List;

import chess.pieces.Bishop;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public final class ChessEvaluate {

    private static final int Pawn = 10;
    private static final int Knight = 30;
    private static final int Bishop = 30;
    private static final int Rook = 50;
    private static final int Queen = 90;
    private static final int King = 900;

    public static int evaluate(List<ChessPiece> pieces, Color color) {
        int sum = 0;
        for(ChessPiece p : pieces) {
            if (p instanceof Pawn) sum = (p.getColor() == color) ? sum + Pawn : sum - Pawn;
            else if (p instanceof Knight) sum = (p.getColor() == color) ? sum + Knight : sum - Knight;
            else if (p instanceof Bishop) sum = (p.getColor() == color) ? sum + Bishop : sum - Bishop;
            else if (p instanceof Rook) sum = (p.getColor() == color) ? sum + Rook : sum - Rook;
            else if (p instanceof Queen) sum = (p.getColor() == color) ? sum + Queen : sum - Queen;
            else sum = (p.getColor() == color) ? sum + King : sum - King;
        }
        return sum;
    }
}
