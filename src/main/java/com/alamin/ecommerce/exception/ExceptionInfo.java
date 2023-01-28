package com.alamin.ecommerce.exception;

import org.springframework.http.HttpStatusCode;

import java.util.Date;

public record ExceptionInfo(
        Date date,
        String error,
        String message,
        HttpStatusCode status,
        String path
) {

}
