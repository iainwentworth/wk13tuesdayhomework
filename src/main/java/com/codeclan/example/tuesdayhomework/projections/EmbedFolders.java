package com.codeclan.example.tuesdayhomework.projections;

import com.codeclan.example.tuesdayhomework.models.Folder;
import com.codeclan.example.tuesdayhomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {
    String getName();
    List<Folder> getFolders();

}
