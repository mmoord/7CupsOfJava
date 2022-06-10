package com.revature.movieapp.order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.movieapp.customer.Customer;
import com.revature.movieapp.customer.CustomerServices;
//import com.revature.movieapp.movie.Movie;
//import com.revature.movieapp.movie.MovieServices;
import com.revature.movieapp.util.interfaces.Authable;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class OrderServlet {
    // @Autowired don't do this, makes charles sad and cry inside
    private final OrderServices orderServices;

    @Autowired // Once again not necessary, but I like it, to mee it's best practice
    public OrderServlet(OrderServices orderServices) {
        this.orderServices = orderServices;
    }

    // TODO: IMPLEMENT ME

}