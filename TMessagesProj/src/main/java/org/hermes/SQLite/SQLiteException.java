/*
 * This is the source code of Hermes for Android v. 1.3.2.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013.
 */

package org.hermes.SQLite;

public class SQLiteException extends Exception {
	private static final long serialVersionUID = -2398298479089615621L;
	public final int errorCode;
	
	public SQLiteException(int errcode, String msg) {
		super(msg);
		errorCode = errcode;		
	}

	public SQLiteException(String msg) {
		this(0, msg);
	}

	public SQLiteException() {
		errorCode = 0;
	}
}
