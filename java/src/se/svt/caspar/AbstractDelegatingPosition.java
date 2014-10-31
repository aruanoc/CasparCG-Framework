/*
* Copyright (c) 2011 Sveriges Television AB <info@casparcg.com>
*
* This file is part of CasparCG (www.casparcg.com).
*
* CasparCG is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* CasparCG is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with CasparCG. If not, see <http://www.gnu.org/licenses/>.
*
* Author: Helge Norberg
*/
package se.svt.caspar;

import javafx.beans.property.DoubleProperty;

/**
 * TODO documentation.
 *
 * @author Helge Norberg, helge.norberg@svt.se
 */
public class AbstractDelegatingPosition implements Position {
	private final Position mDelegate;

	/**
	 * Constructor.
	 */
	public AbstractDelegatingPosition(Position delegate) {
		mDelegate = delegate;
	}

	protected Position delegate() {
		return mDelegate;
	}

	/** {@inheritDoc} */
	@Override
	public void autoSubmit(boolean on) {
		mDelegate.autoSubmit(on);
	}

	/** {@inheritDoc} */
	@Override
	public boolean autoSubmit() {
		return mDelegate.autoSubmit();
	}

	/** {@inheritDoc} */
	@Override
	public void submit() {
		mDelegate.submit();
	}

	/** {@inheritDoc} */
	@Override
	public boolean stale() {
		return mDelegate.stale();
	}

	/** {@inheritDoc} */
	@Override
	public void autoFetch(boolean on) {
		mDelegate.autoFetch(on);
	}

	/** {@inheritDoc} */
	@Override
	public boolean autoFetch() {
		return mDelegate.autoFetch();
	}

	/** {@inheritDoc} */
	@Override
	public void fetch() {
		mDelegate.fetch();
	}

	/** {@inheritDoc} */
	@Override
	public void wasReset() {
		mDelegate.wasReset();
	}

	/** {@inheritDoc} */
	@Override
	public void easing(Easing easing, int frames) {
		mDelegate.easing(easing, frames);
	}

	/** {@inheritDoc} */
	@Override
	public void resetEasing() {
		mDelegate.resetEasing();
	}

	/** {@inheritDoc} */
	@Override
	public Easing easing() {
		return mDelegate.easing();
	}

	/** {@inheritDoc} */
	@Override
	public int frames() {
		return mDelegate.frames();
	}

	/** {@inheritDoc} */
	@Override
	public void defer(boolean on) {
		mDelegate.defer(on);
	}

	/** {@inheritDoc} */
	@Override
	public boolean defer() {
		return mDelegate.defer();
	}

	/** {@inheritDoc} */
	@Override
	public Layer layer() {
		return mDelegate.layer();
	}

	/** {@inheritDoc} */
	@Override
	public void setStale() {
		mDelegate.setStale();
	}

	/** {@inheritDoc} */
	@Override
	public void position(double x, double y) {
		mDelegate.position(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public DoubleProperty positionX() {
		return mDelegate.positionX();
	}

	/** {@inheritDoc} */
	@Override
	public DoubleProperty positionY() {
		return mDelegate.positionY();
	}

	/** {@inheritDoc} */
	@Override
	public void reset() {
		mDelegate.reset();
	}
}
