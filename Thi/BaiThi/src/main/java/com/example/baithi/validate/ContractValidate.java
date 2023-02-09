package com.example.baithi.validate;

import com.example.baithi.model.Contract;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContractValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Contract.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof Contract)) {
            return;
        }
    }
}
