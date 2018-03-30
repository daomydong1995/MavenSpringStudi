package dong.controller;

import dong.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

@Controller
@RequestMapping("HelloController")
public class HelloWorldController {
    @Autowired
    @Qualifier("person")
    private Person person;

	@RequestMapping("/hello/{name}")
	public String sayHello(HttpServletRequest request,@PathVariable(name = "name") String name) {
		request.setAttribute("data",name);
		return "hello";
	}
	@RequestMapping(value = "/them-nguoi" ,method = RequestMethod.GET)
	public  String addPerson(HttpServletRequest request){
		request.setAttribute("person", new Person());
		return "addPerson";
	}
	@RequestMapping(value = "/them-nguoi" ,method = RequestMethod.POST)
	public  String addPerson(HttpServletRequest request , @ModelAttribute("person") Person person){
		request.setAttribute("person", person);
		return "viewPerson";
	}

}
