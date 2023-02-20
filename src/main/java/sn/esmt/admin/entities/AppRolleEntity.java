package sn.esmt.admin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "approlles")

public class AppRolleEntity {
    @Id// JPA ID est clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pour permettre à la clé primaire d'étre auto-increment
    private int id;
    @Column(length = 150, nullable = false)//fastName à comme taille 150 et ne peut pas etre nul
    private String name;
}