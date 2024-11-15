package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    //homepage
    @GetMapping
    public String homepage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>HTML</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    //form
    @GetMapping("form")
    public String formPage() {
        return "<html>" +
                "<body>" +
                "<form action='results' method='post'>" +
                "<label>Name:</label></br>" +
                "<input type='text' name='name'>" +
                "</br>" +
                "<label>My favorite language:</label>" +
                "</br>" +
                "<select name='fave1'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<label>My second favorite language:</label>" +
                "</br>" +
                "<select name='fave2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<label>My third favorite language:</label>" +
                "</br>" +
                "<select name='fave3'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("results")
    public String resultsPage(@RequestParam(name="name") String name, @RequestParam(name="fave1") String fave1, @RequestParam(name="fave2") String fave2, @RequestParam(name="fave3") String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name+ "</h1>" +
                "<table>" +
                "<tr><td> 1. " + fave1 +" </td></tr>" +
                "<tr><td> 2. " + fave2 +" </td></tr>" +
                "<tr><td> 3. " + fave3 +" </td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
