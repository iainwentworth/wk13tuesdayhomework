package com.codeclan.example.tuesdayhomework.repositories;

import com.codeclan.example.tuesdayhomework.models.User;
import com.codeclan.example.tuesdayhomework.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
