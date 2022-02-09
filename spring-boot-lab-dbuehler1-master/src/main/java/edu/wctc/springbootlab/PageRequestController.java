package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageRequestController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String showHomePage() {return "index";}

    @RequestMapping(value = "/product-detail", method = {RequestMethod.GET, RequestMethod.POST})
    public String showProductDetails() {return "catalog/product-detail";}

    @RequestMapping(value = "/cart", method = {RequestMethod.GET})
    public String showCart() {return "orders/cart";}

    @RequestMapping(value = "/place-order", method = {RequestMethod.POST})
    public String placeOrder() {return "redirect:/";}

    @RequestMapping(value = "/search", method = {RequestMethod.GET, RequestMethod.POST})
    public String search() {return "redirect:http://www.google.com";}


}
