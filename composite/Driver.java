package composite;

public class Driver {
    public static void main(String[] args) {
        Root root = new Root();
        NewFolder newFolder = new NewFolder("images",4000);
        newFolder.addFile(new Image("it","jpg",200));
        newFolder.addFile(new Image("demo.png","jpg",169));
        root.addFolder(newFolder);
        newFolder.displayFiles();
        root.displayFolders();
        root.addFile(new Text("exec","txt",198));
        root.displayFiles();
    }
}
