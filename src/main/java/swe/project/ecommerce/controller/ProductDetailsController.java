package swe.project.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import swe.project.ecommerce.mapper.ProductDetailsMapper;
import swe.project.ecommerce.service.ProductDetailsService;

@Controller
public class ProductDetailsController {
    private final ProductDetailsService productDetailsService;
    private final ProductDetailsMapper productDetailsMapper;

    @Autowired
    public ProductDetailsController(
            ProductDetailsService productDetailsService,
            ProductDetailsMapper productDetailsMapper) {

        this.productDetailsService = productDetailsService;
        this.productDetailsMapper = productDetailsMapper;
    }

}
