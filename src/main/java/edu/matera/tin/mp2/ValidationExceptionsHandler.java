package edu.matera.tin.mp2;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ValidationExceptionsHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidationErrorMessage handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        var message = ex.getBindingResult().getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(", "));
        var fieldNames = ex.getBindingResult().getAllErrors().stream().map(ValidationExceptionsHandler::getFieldName).distinct().collect(Collectors.toList());
        return new ValidationErrorMessage(message, fieldNames);
    }

    private static String getFieldName(ObjectError objectError) {
        return ((FieldError) objectError).getField();
    }

    @Value
    @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
    @AllArgsConstructor
    @Builder
    public static class ValidationErrorMessage {
        String message;
        List<String> erroredFields;
    }
}
