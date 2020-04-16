package com.springboot.fileTransfer.resources;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FileCopy {
	
	public static void converToDir(MultipartFile copyFrom, String copyTo) throws IOException {
		         
        //Target directory where files should be copied
        File destinationFolder = new File(copyTo);
 
        //Call Copy function
        copyFolder(copyFrom, destinationFolder);
	}
	 
	private static void copyFolder(MultipartFile myFile, File destinationFolder) throws IOException {
		
		if(!destinationFolder.exists()) {
			destinationFolder.mkdir();
		}
		System.out.println(myFile.getOriginalFilename());
		File destFile = new File(destinationFolder+ "/" + myFile.getOriginalFilename());
		myFile.transferTo(destFile);

    }
	
	public String getErrMessage() {
		return errMessage;
	}
	
	public FileCopy(List<MultipartFile> copyFrom, String copyTo) {
		try {
			for (MultipartFile file : copyFrom) {
				converToDir(file, copyTo);
			}
		} catch(IOException exception) {
			errMessage =  exception.toString(); 
		}
	}
	
	private String errMessage = "";
}