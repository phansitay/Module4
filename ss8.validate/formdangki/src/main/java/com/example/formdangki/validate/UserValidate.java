package com.example.formdangki.validate;
import com.example.formdangki.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof User)){
            return;
        }else {
            User user = (User) target;
            if (user.getPhoneNumber().length()!=10){
                errors.rejectValue("phoneNumber","phoneNumber",new String[]{"10"},"Số điện thoại không đúng định dạng!");
            }else {
                if (!(user.getPhoneNumber().startsWith("0"))){
                    errors.rejectValue("phoneNumber", "phonenumberstart", "Số điện thoại bắt đầu phải bằng số 0");
                }
            }
        }
    }
}
