package composite;

import java.util.ArrayList;
import java.util.List;

public class Root implements FileDirectory{

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

    @Override
    public void FileDirectoryDetails() {

    }
}
