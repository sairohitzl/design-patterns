package composite;

public class Text implements File{
    private String name;
    private String type;
    private int size;

    public Text(String name,String type,int size)
    {

        this.name = name;
        this.type = type;
        this.size=size;

    }

    @Override
    public void FileDetails() {
        System.out.println("File name: "+name+" ||  type: "+type+"  || size: "+size+" bytes");
    }
}
