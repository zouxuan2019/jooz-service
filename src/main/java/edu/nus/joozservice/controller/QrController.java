package edu.nus.joozservice.controller;

import edu.nus.joozservice.dto.QrDto;
import edu.nus.joozservice.service.QrService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/qr")
@AllArgsConstructor
public class QrController {

    private QrService qrService;

    @PostMapping("purchaseQr")
    public String purchaseQr(@RequestBody QrDto qrDto) {
        return qrService.purchaseQr( qrDto );

    }
}
