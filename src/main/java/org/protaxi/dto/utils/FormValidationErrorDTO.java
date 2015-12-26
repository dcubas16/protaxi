package org.protaxi.dto.utils;

import java.util.ArrayList;
import java.util.List;

public class FormValidationErrorDTO {

	private List<FieldValidationErrorDTO> fieldErrors = new ArrayList<FieldValidationErrorDTO>();

	public FormValidationErrorDTO() {

	}

	public void addFieldError(String path, String message) {
		FieldValidationErrorDTO fieldError = new FieldValidationErrorDTO(path, message);
		fieldErrors.add(fieldError);
	}

	public List<FieldValidationErrorDTO> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldValidationErrorDTO> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
}
