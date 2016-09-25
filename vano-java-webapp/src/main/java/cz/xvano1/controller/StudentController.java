package cz.xvano1.controller;

import cz.xvano1.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String showForm(ModelMap model) {

        return "studentForm";

    }

    @RequestMapping(value = "/studentData", method = RequestMethod.GET)
    public String showData(Student student, ModelMap model) {

        model.addAttribute("student", student);
        return "studentData";

    }
}