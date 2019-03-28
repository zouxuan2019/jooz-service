package edu.nus.joozservice.service;

import edu.nus.joozservice.dto.QrDto;
import edu.nus.joozservice.entity.QrStatusEntity;
import edu.nus.joozservice.repository.QrStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class QrService {
    private QrStatusRepository qrStatusRepository;

    public String purchaseQr(QrDto qrDto) {
        qrStatusRepository.findAllByCustomerID( qrDto.getCustomerId() );
        QrStatusEntity savedEntity = qrStatusRepository.save(
                QrStatusEntity.builder()
                        .customerID( qrDto.getCustomerId() )
                        .qty( qrDto.getCreditAmount() )
                        .expireTime( LocalDate.MAX )
                        .qrCode( "qr string" )
                        .build() );
        return savedEntity.getQrCode();
    }
}
