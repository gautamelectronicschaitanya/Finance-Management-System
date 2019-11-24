package com.controller;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
	
	@RequestMapping("/hello")  
    public String redirect()  
    {  
        return "viewpage";  
    }     
@RequestMapping("/helloagain")  
public String display()  
{  
    return "final";  
}  
}
