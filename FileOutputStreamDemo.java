package com.sgtesting.iodemo;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test1.txt",true);
            String str="Java is a programming language,";
            str+=" It is used for Application Development.";

            byte b[]=str.getBytes();
            fout.write(b);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
