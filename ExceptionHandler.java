import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }

@ExceptionHandler(ResourceNotFoundException.class)
public ResponseEntity<Map<String,String>> handleResourceNotFoundException(ResourceNotFoundException ex){
    Map<String, String> errors = new HashMap<>();
    errors.put("error",ex.getMessage());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
}

}