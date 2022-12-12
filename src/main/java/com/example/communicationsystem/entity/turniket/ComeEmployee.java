package com.example.communicationsystem.entity.turniket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComeEmployee {

    @Id
    @GeneratedValue
    private UUID id;

    @CreatedBy
    private Date comeDate;

}
