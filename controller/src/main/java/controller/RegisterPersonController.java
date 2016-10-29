package controller;

import bl.PersonBl;
import bl.impl.PersonBlImpl;
import model.Person;
import util.Position;
import util.Wage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gh.abdoli on 9/25/2016.
 */
public class RegisterPersonController extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Position position = null;
        Long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("name").toString();
        String family = req.getParameter("family").toString();
        Date dateOfBird = new Date(req.getParameter("dateOfBird"));
        Integer experienceYear = Integer.parseInt(req.getParameter("experienceYear"));
        Integer year = Integer.parseInt(req.getParameter("year"));

        Wage wage = new Wage(Double.parseDouble(req.getParameter("wage")));

        switch (req.getParameter("position")) {
            case "ریس":
                position = Position.MANAGER;
                break;
            case "لیدر تیم":
                position = Position.LEADER;
                break;
            case "مدیر بخش":
                position = Position.DEPARTMENT_HEAD;
                break;
            case "کارمند":
                position = Position.EMPLOYEE;
                break;
        }
        PersonBl personBl = new PersonBlImpl();
        if((id != null || id != 0) && (name != null) && (family != null) && (year != null || year > 0)) {
            personBl.registerPerson(new Person(id, position, name, family, dateOfBird, experienceYear, wage, year));
        }
        res.sendRedirect("/index.jsp");
    }

}
