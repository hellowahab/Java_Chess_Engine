package com.chess.engine.player;

/**
 * JChess: Created by mertkarakas on 9/4/2016.
 */
public enum MoveStatus {
    DONE {
        @Override
        public boolean isDone() {
            return true;
        }
    },
    ILLEGAL_MOVE{
        @Override
        public boolean isDone() {
            return false;
        }
    },
    LEAVES_PLAYER_IN_CHECK {
        @Override
        public boolean isDone() {
            return false;
        }
    };

    public abstract boolean isDone();

}
