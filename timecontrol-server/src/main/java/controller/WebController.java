package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView model = new ModelAndView();

		model.setViewName("index");

		return model;

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView mainPage() {

		ModelAndView model = new ModelAndView();

		model.setViewName("private/main");

		return model;

	}

}
