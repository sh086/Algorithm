package com.common.converter.orika;

/**
 * Orika自定义组件注册异常
 *
 * @author luxp
 * @date 2019/1/14
 */
public class RegisterException extends RuntimeException {
	public RegisterException() {
		super();
	}

	public RegisterException(String message) {
		super(message);
	}

	public RegisterException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegisterException(Throwable cause) {
		super(cause);
	}

	protected RegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
