package controller;

import bl.PersonBl;
import bl.impl.PersonBlImpl;
import model.Person;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gh.abdoli on 9/25/2016.
 */
public class RemovePersonController extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("idOfPerson"));
        PersonBl personBl = new PersonBlImpl();
        if (id != null) {
            personBl.removePerson(new Person(id, null, null, null, null, 0, null, 0));
        }
        req.getRequestDispatcher("/getPersons.do").forward(req,res);
    }
}
