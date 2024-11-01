package com.example.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Compte {
    @Id // Utilisez l'import correct de jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

    // Constructeur personnalisé
    public Compte(Object o, double v, Date date, TypeCompte typeCompte) {
        // Implémentation si nécessaire
    }

    // Getters et setters générés automatiquement par Lombok (@Data)
}
