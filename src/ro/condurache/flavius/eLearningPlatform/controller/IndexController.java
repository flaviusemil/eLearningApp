package ro.condurache.flavius.eLearningPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Orion on 5/29/2017.
 *
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelMap model = new ModelMap();
        model.put("name", "Flavius");

        return new ModelAndView("index", "model", model);
    }

}
