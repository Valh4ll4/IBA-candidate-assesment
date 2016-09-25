package cz.xvano1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(@RequestParam(value = "x", required = false) String count_parameter, ModelMap model) {

        if (count_parameter != null) {
            int count;
            try {
                count = Integer.parseInt(count_parameter);
            } catch (NumberFormatException e) {
                count = 0;
            }
            if (count < -1) {
                count = -1;
            }
            model.addAttribute("x", count);
        }

        return "helloMultiple";

    }
}