package pl.llasso.entities;

import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@Setter
@ToString
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
