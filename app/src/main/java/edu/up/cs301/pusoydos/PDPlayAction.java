package edu.up.cs301.pusoydos;

import edu.up.cs301.game.GamePlayer;

/**
 * A PDPlayAction is an action that represents playing a card on the "up"
 * pile.
 * 
 * @author Jason Twigg
 * @author Cole Holbrook
 * @author Tawny Motoyama
 * @author Josh Azicate
 *
 * @version 31 July 2002
 */
public class PDPlayAction extends PDMoveAction
{
	private static final long serialVersionUID = 3250639793499599047L;

	/**
     * Constructor for the SJPlayMoveAction class.
     * 
     * @param player  the player making the move
     */
    public PDPlayAction(GamePlayer player)
    {
        // initialize the source with the superclass constructor
        super(player);
    }

    /**
     * @return
     * 		whether this action is a "play" move
     */
    public boolean isPlay() {
        return true;
    }
    
}