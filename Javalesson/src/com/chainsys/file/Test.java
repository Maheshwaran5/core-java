package com.chainsys.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class Test {

	public static void main(String args[]) throws Exception 
    {
//	creatNewFile();
	//renameFile();
//		appendDataToFile("D:\\FileMethodes\\Mahesh.txt","Hello,Old is Gold");
		//readDataFromFile();
		//delete();
		//copyFile("D:\\FileMethodes\\Mahesh.txt", "D:\\copy", "Mahesh.txt");
		//moveFile("D:\\FileMethodes\\Mahesh.txt","D:\\copy\\move");
		modifyDataInFile();
	
		
    }
	public static void creatNewFile() {
        try {
  
        	File f = new File("D:\\FileMethodes\\CreateFile.txt");
  
          
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
	}
        
        
        public static void renameFile() {
               
                File file = new File("D:\\FileMethodes\\CreateFile.txt");
          
               
                File rename = new File("D:\\FileMethodes\\Mahesh.txt");
          
             
                boolean flag = file.renameTo(rename);
          
             
                if (flag == true) {
                    System.out.println("File Successfully Rename");
                }
           
                else {
                    System.out.println("Operation Failed"); 
                }
                }
        
        
        
        public static void appendDataToFile(String fileName,String str) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

                out.write(str);
                
                out.close();
                System.out.println("Data is Inserted");
            }catch (IOException e) {
                System.out.println("exception occurred" + e);
            }
            }
            
            
            
                public static void readDataFromFile() {

                    try {
                           File myObj = new File("D:\\FileMethodes\\Mahesh.txt");
                           Scanner myReader = new Scanner(myObj);
                           while (myReader.hasNextLine()) {
                             String data = myReader.nextLine();
                             System.out.println("File reading: "+data);
                           }
                           myReader.close();
                         } catch (FileNotFoundException e) {
                           System.out.println("An error occurred.");
                           e.printStackTrace();
                         }
                }
            
                public static void delete() {

                File file = new File("D:\\FileMethodes\\Mahesh.txt");
     
            if (file.delete()) {
                System.out.println("File deleted successfully");
            }
            else {
                System.out.println("Failed to delete the file");
            }
        }
                
                
                
                public static boolean copyFile(String sourcePath,String destFolderPath,  String fileName) {
                    boolean fileMoved = true;

                     try {

                         Files.copy(Paths.get(sourcePath), Paths.get(destFolderPath, fileName),StandardCopyOption.REPLACE_EXISTING);
                         System.out.println("File is copy Successful");

                     } catch (Exception e) {

                         fileMoved = false;
                         System.out.println("Error!!!"+e.getMessage());
                     }

                     return fileMoved;
                    }
                
    

                
                public static boolean moveFile(String oldfolderPath,String newFolderPath) {
                    boolean fileMoved = true;

                     try {

                         Files.move(Paths.get(oldfolderPath), Paths.get(newFolderPath),StandardCopyOption.REPLACE_EXISTING);
                         System.out.println("File is move Successful");

                     } catch (Exception e) {

                         fileMoved = false;
                         System.out.println("Error!!!"+e.getMessage());
                     }

                     return fileMoved;
                    }
                   



public static void modifyDataInFile() throws Exception
{
    
    FileOutputStream file = new FileOutputStream("D:\\copy\\move.txt");
    
    String modify = "Data is modified!!!";
    byte[] b = modify.getBytes();
    file.write(b);
    file.close();
    System.out.println("Modification Complete");
    
    FileInputStream file1 = new FileInputStream("D:\\copy\\move.txt");
    int i;
    while((i=file1.read())!=-1)
    {
    System.out.print((char)i);
    }
    file1.close();
}
}
        
                    
                
                
               
                
                    
                   
                    
                    
            
       

                
   
