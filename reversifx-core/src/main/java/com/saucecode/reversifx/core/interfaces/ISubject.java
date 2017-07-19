package com.saucecode.reversifx.core.interfaces;

/**
 * Interface for subjects, which need the ability to notify anonymous observers.
 * 
 * @author Torben Kr&uuml;ger
 *
 * @since 0.2
 */
public interface ISubject {

	/**
	 * Notifies all observers.
	 * 
	 * @since 0.2
	 */
	public void updateAll();

	/**
	 * Attaches an observer to this subject.
	 * 
	 * @param obs
	 *            observer, which shall be attached
	 * 
	 * @since 0.2
	 */
	public void attach(IObserver obs);

	/**
	 * Detaches an observer from this subject.
	 * 
	 * @param obs
	 *            observer, which shall be detached
	 * @return {@code true}, if this Subject contained the specified observer
	 * 
	 * @since 0.2
	 */
	public boolean detach(IObserver obs);

}
