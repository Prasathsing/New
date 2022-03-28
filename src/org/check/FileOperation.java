package org.check;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\prakashprasath\\Desktop\\New folder\\sample.txt");
//	boolean createNewFile = f.createNewFile();
//	boolean exists = f.exists();
//	System.out.println(exists);
//    boolean directory = f.isDirectory();
//    System.out.println(directory);
//    boolean file = f.isFile();
//    System.out.println(file);
//    boolean canRead = f.canRead();
//    System.out.println(canRead);
//    boolean canExecute = f.canExecute();
//    System.out.println(canExecute);
//    boolean canWrite = f.canWrite();
//    System.out.println(canWrite);
//    String name = f.getName();
//    System.out.println(name);
//    File f1=new File("C:\\Users\\prakashprasath\\Pictures");
////    boolean renameTo = f.renameTo(f1);
////    System.out.println(renameTo);
////    String name2 = f1.getName();
////    System.out.println(name2);
//////    boolean delete2 = f.delete();
//////    System.out.println(delete2);
//////    boolean delete = f1.delete();
//////    System.out.println(delete);
//    String[] list = f1.list();
//   for (String string : list) {
//	System.out.println(string);
//}
//   File[] listFiles = f1.listFiles();
//   for (File file2 : listFiles) {
//	
//	   System.out.println(file2);
//}
//	boolean mkdirs = f.mkdirs();
//	System.out.println(mkdirs);
//	boolean file = f.isFile();
//	System.out.println(file);
//	boolean directory = f.isDirectory();
//	System.out.println(directory);
	FileUtils.write(f,"i am prasath");
	FileUtils.write(f,"\n from kumbakonam",true);
List<String> readLines = FileUtils.readLines(f);
System.out.println(readLines);
}
}
