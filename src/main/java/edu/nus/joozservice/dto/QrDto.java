package edu.nus.joozservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class QrDto {
    private Integer customerId;
    private BigDecimal creditAmount;
    private String qrString;
}
