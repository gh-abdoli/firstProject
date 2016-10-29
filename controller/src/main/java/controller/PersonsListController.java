package controller;

import bl.PersonBl;
import bl.impl.PersonBlImpl;
import com.google.gson.Gson;
import model.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by gh.abdoli on 9/25/2016.
 */
public class PersonsListController extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PersonBl personBl = new PersonBlImpl();
        List<Person> personsList = personBl.getPersons();
        PrintWriter out = response.getWriter();
        if(personsList != null && personsList.size() != 0) {
            out.println(new Gson().toJson(personsList));
        }
        out.close();

    }
}
