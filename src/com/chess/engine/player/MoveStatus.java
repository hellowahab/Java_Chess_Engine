package com.chess.engine.player;

/**
 * JChess: Created by mertkarakas on 9/4/2016.
 */
public enum MoveStatus {
    DONE {
        @Override
        public boolean isDone() {
            System.out.println("done move status");
            return true;
        }
    },
    ILLEGAL_MOVE{
        @Override
        public boolean isDone() {
            System.out.println("illegal move status");
            return false;
        }
    },
    LEAVES_PLAYER_IN_CHECK {
        @Override
        public boolean isDone() {
            System.out.println("leaves player in check");
            return false;
        }
    };

    public abstract boolean isDone();

}
