package edu.nus.joozservice.controller;

import edu.nus.joozservice.dto.PurchaseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @PostMapping("top-up")
    public String topUp(@RequestBody PurchaseDto purchaseDto) {
        return "success";
    }
}
