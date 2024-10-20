package structure.facade.ex3;

public class FacadeEx3Test {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();
        FileDeleter fileDeleter = new FileDeleter();

        FileSystemFacade fs
                = new FileSystemFacade(fileReader, fileWriter, fileDeleter);

        boolean writeSuccess = fs.writeFile(
                "test.txt", "Hello, Facade Pattern!"
        );
        System.out.println("File write success: " + writeSuccess);

        // Read from file
        String content = fs.readFile("test.txt");
        System.out.println("File content: " + content);

        // Delete file
        boolean deleteSuccess = fs.deleteFile("test.txt");
        System.out.println(
                "File delete success: " + deleteSuccess
        );
    }
}
