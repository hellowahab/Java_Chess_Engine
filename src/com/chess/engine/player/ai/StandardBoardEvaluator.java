package com.chess.engine.player.ai;

import com.chess.engine.board.Board;
import com.chess.engine.pieces.Piece;
import com.chess.engine.player.Player;

/**
 * Java_Chess_Engine: Created by mertkarakas on 10/18/2016.
 */
public final class StandardBoardEvaluator implements BoardEvaluator {
    @Override
    public int evaluate(Board board, int depth) {

        //positive if white in advantage ? negative is black is in advantage
        return scorePlayer(board, board.whitePlayer(), depth) -
               scorePlayer(board, board.blackPlayer(), depth);
    }

    private int scorePlayer(final Board board, final Player player, final int depth) {
        //according to piece value
        return pieceValue(player);
    }
    private static int pieceValue(final Player player){
        int pieceValueScore = 0;
        for (final Piece piece : player.getActivePieces()){
            pieceValueScore += piece.getPieceValue();
        }
        return pieceValueScore;
    }


}
