package com.e_chem.parsingprom.Productis;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter @Setter
@ToString
@Entity
@Table(name = "productis")
@AllArgsConstructor
public class Productis {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private String image_link;
    private String availability;
    private String price;
    private String brand;

    public Productis() {
    }
}