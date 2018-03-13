package k3j123.puzzlegame;

import android.content.Context;

/**
 * Created by k3j123 on 3/12/18.
 */

public class PuzzlePiece  extends android.support.v7.widget.AppCompatImageView {
    public int xCoord;
    public int yCoord;
    public int pieceWidth;
    public int pieceHeight;
    public boolean canMove = true;

    public PuzzlePiece(Context context) {
        super(context);
    }
}

