package com.example.ontap.Validate;

import com.example.ontap.model.Book;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BookValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Book.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof Book)) {
            return;
        }
    }
}
