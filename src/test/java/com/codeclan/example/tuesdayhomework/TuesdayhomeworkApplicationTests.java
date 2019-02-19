package com.codeclan.example.tuesdayhomework;

import com.codeclan.example.tuesdayhomework.models.File;
import com.codeclan.example.tuesdayhomework.models.Folder;
import com.codeclan.example.tuesdayhomework.models.User;
import com.codeclan.example.tuesdayhomework.repositories.FileRepository;
import com.codeclan.example.tuesdayhomework.repositories.FolderRepository;
import com.codeclan.example.tuesdayhomework.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TuesdayhomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createAUserAndSave() {

		User user1 = new User("Iain");
		userRepository.save(user1);
	}

	@Test
	public void createAUserAndFoldersAndSave() {

		User user2 = new User("John");
		userRepository.save(user2);

		Folder folder1 = new Folder("High Priority", user2);
		folderRepository.save(folder1);

		Folder folder2 = new Folder("Low Priority", user2);
		folderRepository.save(folder2);
	}

	@Test
	public void createAUserAndAFolderAndFilesAndSave() {

		User user3 = new User("Katie");
		userRepository.save(user3);

		Folder folder3 = new Folder("Mediium Priority", user3);
		folderRepository.save(folder3);

		File file1 = new File("Week 1 Work", "pages", 345, folder3);
		fileRepository.save(file1);

		File file2 = new File("Week 2 Work", "pages", 685, folder3);
		fileRepository.save(file2);

		File file3 = new File("Week 3 Work", "pages", 125, folder3);
		fileRepository.save(file3);
	}
}
