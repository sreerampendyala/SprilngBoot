package com.springboot.fileTransfer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.fileTransfer.resources.FileCopy;

@RestController
public class FileTransferController {
	
	@PostMapping("/uploadFile/v1")
	public String getTheFile( @RequestParam("file") List<MultipartFile> storageFile) {		
		file_copy = new FileCopy(storageFile, copyToPath);
		if(file_copy.getErrMessage() != "") return file_copy.getErrMessage();
		return "SuccessfullY uploaded";
	}
	
	private FileCopy file_copy;
	private String copyToPath = "/Users/srirampendyala/Documents/SprintTest/NewFile";
}
