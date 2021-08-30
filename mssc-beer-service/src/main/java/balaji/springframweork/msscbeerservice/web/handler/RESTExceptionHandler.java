package balaji.springframweork.msscbeerservice.web.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class RESTExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Set> validationErrorHandler(ConstraintViolationException exception) {
        return new ResponseEntity<>(exception.getConstraintViolations(), HttpStatus.BAD_REQUEST);
    }

}
