package com.fyodork.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee/")
public class MyController {

    @RequestMapping("/")
    public String showFirstView()
    { return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model)
    {
        Employee emp=new Employee();
        emp.setName("Ivan");
        emp.setSurname("Pupkin");
        emp.setSalary(750);
        //model.addAttribute("employee",new Employee());
        model.addAttribute("employee",emp);
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp)
    {
        String name=emp.getName();
        String surname=emp.getSurname();
        int salary=emp.getSalary();
        name="Mr."+name;
        surname="Dr."+surname;
        salary=salary*10;
        emp.setName(name);
        emp.setSurname(surname);
        emp.setSalary(salary);


        return "show-emp-details-view";
    }


}
