package com.texas.miniprojecta.services;

import com.texas.miniprojecta.entity.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {

    Enrollment saveEnrollment(Enrollment enrollment);

    List<Enrollment> listAllEnrollment();

    Optional<Enrollment> getEnrollmentBy(Long id);

    void deleteEnrollment(Long id);

    Enrollment updateEnrollment(Enrollment enrollment);
}