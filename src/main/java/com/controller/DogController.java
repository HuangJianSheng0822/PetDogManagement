package com.controller;

import com.pojo.Dog;
import com.service.DogService;
import com.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class DogController {

    @Autowired
    private DogService dogService;

    @ResponseBody
    @RequestMapping(value = "/getDogList",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String getDogList( @RequestParam("limit") String limit, @RequestParam("page") String page){
        return Json.setJson (dogService.getDogList ("0","15"));
    }

    @RequestMapping(value = "/addDog",method = RequestMethod.POST)
    public String addDog( Dog dog, HttpServletRequest request,HttpServletResponse response ){
       dogService.addDog (dog);
        return "redirect:/page/dog.jsp";
    }

    @RequestMapping(value = "/delDog",method = RequestMethod.POST)
    public String delDog(@RequestParam("dogId") String dogId){
        dogService.delDog (dogId);
        return "redirect:/page/dog.jsp";
    }

    @RequestMapping(value = "/updateDog",method = RequestMethod.POST)
    public String updateDog(Dog dog){
        dogService.updateDog (dog);
        return "redirect:/page/dog.jsp";
    }
}
