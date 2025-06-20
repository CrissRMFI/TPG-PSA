package com.psa.backend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tfa_support_productos")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_tfa_product")
    @SequenceGenerator(name = "sec_tfa_product", sequenceName = "sec_tfa_product", allocationSize = 1)
    @Column(name = "ID_PRODUCTO", nullable = false, unique = true)
    private Long id;

    @Column(name = "va_prefix", nullable = false)
    private String prefix;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producto", cascade = CascadeType.ALL)
    private List<ProductVersionEntity> versiones;
}
