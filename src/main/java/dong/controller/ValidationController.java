package dong.controller;

import dong.model.User;
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
    @RequestMapping(value = "/add-user" ,method = RequestMethod.GET)
    public  String addUser(HttpServletRequest request ){
        request.setAttribute("user",new User());
        return "validate/addUsers";
    }
    @RequestMapping(value = "/add-user" ,method = RequestMethod.POST)
    public  String addUser(HttpServletRequest request ,@Valid @ModelAttribute("user") User user , BindingResult result){
        if (result.hasErrors()){
            request.setAttribute("user",user);
            return "validate/addUsers";
        }
        request.setAttribute("user",user);
        return "validate/viewUser";
    }
}
