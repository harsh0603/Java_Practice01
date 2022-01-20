import java.io.File;

// public class File_Class {
//     public static void main(String[] args) throws Exception {
//         File f = new File("C:/Users/dell/Dropbox/PC/Desktop/new");
//         System.out.println(f.isDirectory()); //this is find is there any directory
//         File list[] = f.listFiles();
//         for(File x:list){
//             System.out.print(x.getName()+" ");
//             System.out.println(x.getPath());
//         }
//     }
// }






// Delete the file from the file class







public class File_Class {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\DeleteIt.txt");
        if(file.delete()){
            System.out.println("deleted the file successfuly");
        }else{
            System.out.println("not deleted successfuly");
        }
        
    }
}
