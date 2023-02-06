package com.microservices.academy.discovery.core.repository;


import com.microservices.academy.discovery.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}
