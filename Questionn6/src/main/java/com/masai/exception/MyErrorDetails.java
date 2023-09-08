package com.masai.exception;


import lombok.Data;

import java.time.LocalDate;

@Data
public class MyErrorDetails {

	private LocalDate timestamp;
    private String message;
    private String details;
}
