package com.codeclan.example.tuesdayhomework.repositories;

import com.codeclan.example.tuesdayhomework.models.Folder;
import com.codeclan.example.tuesdayhomework.projections.EmbedFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
