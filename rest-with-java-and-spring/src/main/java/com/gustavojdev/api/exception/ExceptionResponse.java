package com.gustavojdev.api.exception;

import java.util.Date;

public record ExceptionResponse(Date timeStamp, String message, String Details) { }
