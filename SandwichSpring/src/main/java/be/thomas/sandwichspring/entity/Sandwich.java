package be.thomas.sandwichspring.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Sandwich {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sandwich_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String desc;
    @Column(nullable = false)
    private double price;

}