package leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


@Controller
public class GreetingController {

    @Autowired
    StudentJdbcRepository repository;

    // Grab all existing student records
    @RequestMapping("/")
    public String homePage(Map<String, Object> model) {
       // model.addAttribute("appName", "Code Wiz");
        List<Student> students = repository.findAll();
        model.put("studentslist", students);
        model.put("message", "We're creating a leader board for our Code Wizzes and you get to be the programmer!");
        return "home";
    }

    @RequestMapping("/addstudent")
    public String addStudent() {
        return "addStudent";
    }

    // Write code to delete student

    // Write code to update student

    // Write to create new student
}
