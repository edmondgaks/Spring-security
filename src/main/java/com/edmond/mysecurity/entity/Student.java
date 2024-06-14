package com.edmond.mysecurity.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Setter
    @Getter
    @Column(nullable = false, length = 100)
    private String firstName;
    @Setter
    @Getter
    @Column(nullable = false, length = 100)
    private String lastName;
    @Setter
    @Getter
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private UserData created;
    @Setter
    @Getter
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Laptop> laptops;
    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

}
