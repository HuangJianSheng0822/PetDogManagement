package com.controller;

import com.pojo.Cust;
import com.pojo.Dog;
import com.service.CustService;
import com.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.UUID;

@Controller
public class CustController {
    @Autowired
    private CustService custService;
    @ResponseBody
    @RequestMapping(value = "/getCustList",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String getCustList( @RequestParam("limit") String limit, @RequestParam("page") String page){
        return Json.setJson (custService.getCustList ("0","15"));
    }

    
    @RequestMapping(value = "/addCust",method = RequestMethod.POST)
    public String addCust( Cust cust, HttpServletRequest request, HttpServletResponse response ){
        cust.setId (UUID.randomUUID ().toString ().replaceAll ("-",""));
        custService.addCust (cust);
        return "redirect:/page/cust.jsp";
    }

    @RequestMapping(value = "/delCust",method = RequestMethod.POST)
    public String delDog(@RequestParam("id") String id){
        custService.delCust (id);
        return "redirect:/page/cust.jsp";
    }

    @RequestMapping(value = "/updateCust",method = RequestMethod.POST)
    public String updateCust(Cust cust){
        custService.updateCust (cust);
        return "redirect:/page/cust.jsp";
    }
}
