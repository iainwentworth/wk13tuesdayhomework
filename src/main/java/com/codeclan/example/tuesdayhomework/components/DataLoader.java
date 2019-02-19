package com.codeclan.example.tuesdayhomework.components;

import com.codeclan.example.tuesdayhomework.models.File;
import com.codeclan.example.tuesdayhomework.models.Folder;
import com.codeclan.example.tuesdayhomework.models.User;
import com.codeclan.example.tuesdayhomework.repositories.FileRepository;
import com.codeclan.example.tuesdayhomework.repositories.FolderRepository;
import com.codeclan.example.tuesdayhomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Iain");
        userRepository.save(user1);

        Folder folder1 = new Folder("High Priority", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Low Priority", user1);
        folderRepository.save(folder2);

        File file1 = new File("Week 1 Work", "pages", 345, folder1);
        fileRepository.save(file1);

        File file2 = new File("Week 2 Work", "pages", 685, folder1);
        fileRepository.save(file2);

        File file3 = new File("Week 3 Work", "pages", 125, folder2);
        fileRepository.save(file3);
    }
}
