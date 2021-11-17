package composite;

import java.util.ArrayList;
import java.util.List;

public class NewFolder implements FileDirectory {

    private List<FileDirectory> directoryList = new ArrayList<>();

    private List<File> fileList = new ArrayList<>();

    public void addFolder(FileDirectory folder){
        directoryList.add(folder);
    }

    public void deleteFolder(FileDirectory folder){
        directoryList.remove(folder);
    }

    public void displayFolders(){
        for(FileDirectory fileDirectory: directoryList){
            fileDirectory.FileDirectoryDetails();
        }
    }

    public void addFile(File file){
        fileList.add(file);
    }

    public void deleteFile(File file){
        fileList.remove(file);
    }

    public void displayFiles(){
        for(File file: fileList){
            file.FileDetails();
        }
    }



    private String name;
    private int size;

    public NewFolder(String name,int size){
        this.name=name;
        this.size=size;

    }



    @Override
    public void FileDirectoryDetails() {
        System.out.println("name of folder/directory: "+name+" || size of folder/directory: "+size);
    }
}
