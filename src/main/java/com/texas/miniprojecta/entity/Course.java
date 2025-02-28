package com.texas.miniprojecta.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "course")

public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")

    private long id;
    private String courseName;
    private String description;
    private Integer credit;

    @ManyToOne
    private Department departmentId;

    @OneToMany(cascade = CascadeType.ALL,  orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "enrollment_id")
    private List<Enrollment> enrollments;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "classes_id")
    private List<Classes> classes;
}