package dong.validator;

import dong.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }
    @Override
    public void validate(Object o, Errors errors) {
        User u = (User) o;
        if(u.getUsername().isEmpty() || u.getUsername().length() == 0) {
            errors.rejectValue("username", "field.required");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","field.required");
        if(u.getPassword().length() <6 || u.getPassword().length() >12){
            errors.rejectValue("password","field.length");
        }
    }
}
