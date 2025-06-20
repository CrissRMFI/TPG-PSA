package com.psa.backend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tfa_support_versiones")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductVersionEntity {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_tfa_version_product")
    @SequenceGenerator(name = "sec_tfa_version_product", sequenceName = "sec_tfa_version_product", allocationSize = 1)
    @Column(name = "nmsec_id_version", nullable = false, unique = true)
    private Long id;

    @Column(name = "va_version", nullable = false)
    private String version;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "version", cascade = CascadeType.ALL)
    List<TicketEntity> tickets;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private ProductEntity producto;
}
