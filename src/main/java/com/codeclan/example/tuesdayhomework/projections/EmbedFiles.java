package com.codeclan.example.tuesdayhomework.projections;

import com.codeclan.example.tuesdayhomework.models.File;
import com.codeclan.example.tuesdayhomework.models.Folder;
import com.codeclan.example.tuesdayhomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFiles", types = Folder.class)
public interface EmbedFiles {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
