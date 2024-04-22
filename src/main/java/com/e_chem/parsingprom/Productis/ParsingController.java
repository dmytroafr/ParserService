package com.e_chem.parsingprom.Productis;

import com.e_chem.parsingprom.elements.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.List;

@RestController
@RequestMapping("/parsing")
@AllArgsConstructor
public class ParsingController {

    private final ParsingProductService productService;

    @GetMapping
    public String parsingProm () throws MalformedURLException {

        List<Item> items = productService.setUp();
        productService.saveInDb(items);
        return "OK";
    }
}
