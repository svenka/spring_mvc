package com.fyodork.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail,String> {

    private String endOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {


        endOfEmail=checkEmail.value();

    }

    @Override
    public boolean isValid(String enteredValue,
                           ConstraintValidatorContext constraintValidatorContext) {

     /*   boolean flag = false;
        for (String s : endOfEmail) {
            if (enteredValue.endsWith(s)) {
                flag = true;
                break;
            }

        }

        return flag;*/
        return enteredValue.endsWith(endOfEmail);
    }
}
