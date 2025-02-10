package com.polidoro.desafio3.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO{

    List<FieldMessageDTO> fields = new ArrayList<>();

    public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageDTO> getFields() {
        return fields;
    }

    public void addError(String fieldError, String message) {
        fields.add(new FieldMessageDTO(fieldError, message));
    }
}
