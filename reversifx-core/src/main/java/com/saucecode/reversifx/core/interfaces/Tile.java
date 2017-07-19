package com.saucecode.reversifx.core.interfaces;

/**
 * Represents a tile of a reversi board.
 * 
 * @author Torben Kr&uuml;ger
 *
 * @since 0.2
 */
public enum Tile {

	/**
	 * It's a light tile
	 * 
	 * @since 0.2
	 */
	LIGHT,

	/**
	 * It's an empty tile, with move possibility for light.
	 * 
	 * @since 0.2
	 */
	LIGHT_POSS,

	/**
	 * It's a dark tile
	 * 
	 * @since 0.2
	 */
	DARK,

	/**
	 * It's an empty tile, with move possibility for dark.
	 * 
	 * @since 0.2
	 */
	DARK_POSS,

	/**
	 * It's an empty tile with no move possibility.
	 * 
	 * @since 0.2
	 */
	NONE;

}
