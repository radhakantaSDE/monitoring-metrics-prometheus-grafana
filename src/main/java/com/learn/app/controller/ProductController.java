package com.learn.app.controller;

import io.micrometer.core.annotation.Counted;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product/v1/")
@RestController
public class ProductController {

    @Counted("search_by_id_count")
    @GetMapping("search/{id}")
    public String searchProduct(@PathVariable("id") String id) {

        return "product details";
    }
}
