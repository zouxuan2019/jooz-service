package edu.nus.joozservice.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "qr_status")
public class QrStatusEntity {

    @Id
    @Column(name = "requestid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer requestID;

    @Column(name = "customerid")
    private Integer customerID;

    @Column(name = "qrcode")
    private String qrCode;

    @Column(name = "qty")
    private BigDecimal qty;

    @Column(name = "expiretime")
    private LocalDate expireTime;

    @Column(name = "promotioncode")
    private String promotionCode;
}
