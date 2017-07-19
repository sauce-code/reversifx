package com.saucecode.reversifx.core.interfaces;

/**
 * All possible States of a reversi game.
 * 
 * @author Torben Kr&uuml;ger
 *
 * @since 0.2
 */
public enum State {

	/**
	 * It's light's turn.
	 * 
	 * @since 0.2
	 */
	LIGHT_TURN,

	/**
	 * It's dark's turn.
	 * 
	 * @since 0.2
	 */
	DARK_TURN,

	/**
	 * Light won.
	 * 
	 * @since 0.2
	 */
	LIGHT_WON,

	/**
	 * Dark won.
	 * 
	 * @since 0.2
	 */
	DARK_WON,

	/**
	 * It's a draw.
	 * 
	 * @since 0.2
	 */
	DRAW;

}
