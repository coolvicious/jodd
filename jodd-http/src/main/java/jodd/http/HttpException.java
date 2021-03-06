// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.http;

import jodd.exception.UncheckedException;

/**
 * HTTP exception.
 */
public class HttpException extends UncheckedException {

	public HttpException(Throwable t) {
		super(t);
	}

	public HttpException(String message) {
		super(message);
	}

	public HttpException(String message, Throwable t) {
		super(message, t);
	}
}
