package com.training.job_portal_application.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@SuppressWarnings("serial")
@Getter
@AllArgsConstructor
public class ApllicantNotFoundByIdException extends RuntimeException {
	public String message;
}
