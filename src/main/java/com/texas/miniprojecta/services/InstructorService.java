package com.texas.miniprojecta.services;

import com.texas.miniprojecta.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {

    Instructor saveInstructor(Instructor instructor);

    List<Instructor> listAllInstructor();

    Optional<Instructor> getInstructorBy(Long id);

    void deleteInstructor(Long id);

    Instructor updateInstructor(Instructor instructor);
}