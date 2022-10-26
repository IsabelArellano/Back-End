package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;
@RestController
public class controller_web {
	// 1r Endpoint
	@RequestMapping("/")
	// Informacion ejemplo
    String get() {	
        return "Hola y bienvenido en mi web";
    }
	// 2n Endpoint
    @RequestMapping("/Home")
    // Informacion de la web principal
    ModelAndView Home() {
    	ModelAndView index = new ModelAndView();
		index.setViewName("html/index.html");
		
	    return index;
    }
    // 3r Endpoint 
    @RequestMapping("/About")
    // Informacion relativa de About Us
    ModelAndView About() {
    	ModelAndView about = new ModelAndView();
    	about.setViewName("html/about.html");
    	
    	return about;
    }
    // 4t Endpoint
    @RequestMapping("/Contacto")
    // Informacion relativa de Contacto
    ModelAndView Contacto() {
    	ModelAndView contact = new ModelAndView();
    	contact.setViewName("html/contacto.html");
    	
    	return contact;
    }
}
