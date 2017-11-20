import org.junit.Test;

import java.io.File;

/**
 * Created by githu on 2017/11/20.
 */
public class LeanrnFile {
    
    @Test
    public void testFiel(){

        File f =new File("d:/A");
      
        tree(f,0);
        
    }
    //打印出某个文件下的所有子目录、小练习 运用递归
    public static  void tree(File tree,int level){
        File [] files =tree.listFiles();
        String str="";
        for(int j=0;j<level;j++)
         str+="----";
        for(int i=0;i<files.length;i++){
            System.out.println(str+files[i].getName()+"");
            if(files[i].isDirectory()){
                tree(files[i],level+1);
            }
        }
        
        
    }
    
}
