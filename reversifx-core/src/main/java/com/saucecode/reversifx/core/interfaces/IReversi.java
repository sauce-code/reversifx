package com.saucecode.reversifx.core.interfaces;

/**
 * Specifies all operations for a reversi game.
 * 
 * @author Torben Kr&uuml;ger
 *
 * @since 0.2
 */
public interface IReversi {

	/**
	 * Default width and height of a reversi board.
	 * 
	 * @since 0.2
	 */
	public static final int DIM = 8;

	/**
	 * Returns <b>a clone</b> of the current board.
	 * 
	 * @return clone of the current board
	 */
	public Tile[][] getTiles();

	/**
	 * Puts a piece on a specified tile.
	 * 
	 * @param x
	 *            x-coordinate of the tile
	 * @param y
	 *            y-coordinate of the tile
	 * @return {@code true}, if the operation was sucessful
	 * @throws IllegalArgumentException
	 *             if {@code x} or {@code y} are out of bounds
	 */
	public boolean put(int x, int y);

	/**
	 * Undos the last move.
	 * 
	 * @return {@code true}, if sucessful
	 * 
	 * @since 0.2
	 */
	public boolean undo();

	/**
	 * Redos the last move.
	 * 
	 * @return {@code true}, if sucessful
	 * 
	 * @since 0.2
	 */
	public boolean redo();

	/**
	 * Tells wether there is any undo left.
	 * 
	 * @return {@code true}, if there is any undo left
	 * 
	 * @since 0.2
	 */
	public boolean isAnyUndoLeft();

	/**
	 * Tells wether there is any redo left.
	 * 
	 * @return {@code true}, if there is any redo left
	 * 
	 * @since 0.2
	 */
	public boolean isAnyRedoLeft();

	/**
	 * Returns the current State.
	 * 
	 * @return
	 * 
	 * @since 0.2
	 */
	public State getState();

}
