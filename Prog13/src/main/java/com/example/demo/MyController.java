package com.example.demo;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@Validated
public class MyController {

    @RequestMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/message")
    public ModelAndView message(@RequestParam String name,
                                @RequestParam String occupation) {

        var msg = String.format("%s is a %s", name, occupation);

        Map<String, Object> params = new HashMap<>();
        params.put("message", msg);

        return new ModelAndView("showMessage", params);

    }

    @ExceptionHandler(ConstraintViolationException.class)
    public RedirectView handleError(ConstraintViolationException ex,
                                    WebRequest request,
                                    RedirectAttributes atts) {

        var name = request.getParameter("name");
        var occupation = request.getParameter("occupation");

        var errorMessages = new ArrayList<String>();
      //  var violations = ex.getConstraintViolations();

       // violations.forEach(violation -> {
         //   var error = String.format("%s: %s", violation.getPropertyPath(),
           //         violation.getMessage());
           // errorMessages.add(error);
        //});

        //if (!StringUtils.isEmptyOrWhitespace(name)) {
            atts.addFlashAttribute("name", name);
       // }

        //if (!StringUtils.isEmptyOrWhitespace(occupation)) {

            atts.addFlashAttribute("occupation", occupation);
        //}

        atts.addFlashAttribute("messages", errorMessages);

        return new RedirectView("/");
    }}
