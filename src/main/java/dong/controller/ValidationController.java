package dong.controller;

import dong.model.User;
import dong.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("Validate")
public class ValidationController {

    @Autowired
    private UserValidator userValidator;
    @Autowired
    MessageSource messageSource;
    @RequestMapping(value = "/add-user" ,method = RequestMethod.GET)
    public  String addUser(HttpServletRequest request ){
        request.setAttribute("user",new User());
        return "validate/addUsers";
    }
    @RequestMapping(value = "/add-user" ,method = RequestMethod.POST)
    public  String addUser(HttpServletRequest request ,@ModelAttribute("user") User user , BindingResult result){
        userValidator.validate(user,result);
        if (result.hasErrors()){
            request.setAttribute("user",user);
            return "validate/addUsers";
        }
        request.setAttribute("user",user);
        return "validate/viewUser";
    }
}
