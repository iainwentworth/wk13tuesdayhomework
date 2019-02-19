package com.codeclan.example.tuesdayhomework.repositories;

import com.codeclan.example.tuesdayhomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
