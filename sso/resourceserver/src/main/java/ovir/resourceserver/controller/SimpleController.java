package ovir.resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping(value = "/simple", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "hello world !";
    }

    @RequestMapping(value = "/simple", method = RequestMethod.POST)
    @ResponseBody
    public String post() {
        return "hello world !";
    }
}
