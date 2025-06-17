package com.psa.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tfa_support_productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @Id
    @Column(name = "ID_PRODUCTO", nullable = false)
    private String id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tfa_support_versiones", joinColumns = @JoinColumn(name = "ID_PRODUCTO"))
    @Column(name = "VERSION")
    private List<String> versiones;
}
