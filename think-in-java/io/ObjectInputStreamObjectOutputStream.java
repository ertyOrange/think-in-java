package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
 
public class ObjectInputStreamObjectOutputStream
{  
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fop = new FileOutputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
        /*
         * ObjectOutputStream(OutputStream out) 
         * Creates an ObjectOutputStream that writes to the specified OutputStream. 
        */
        ObjectOutputStream oos = new ObjectOutputStream(fop);
        
        ArrayList<People> peopleList = new ArrayList<People>();
        peopleList.add(new People(1,"zhang"));
        peopleList.add(new People(2,"li"));
        peopleList.add(new People(3,"zhao"));
//        People p = new People(1,"zhang");
//        /*
//         * writeObject(Object obj) 
//         * Write the specified object to the ObjectOutputStream.
//        */
//        oos.writeObject(p);
//        p = new People(2,"li");
//        oos.writeObject(p);
//        p = new People(3,"zhao");
        oos.writeObject(peopleList);
        //д����������
        oos.close();
        //�ر������
        FileInputStream fis=new FileInputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
        /*
         * ObjectInputStream(InputStream in) 
         * Creates an ObjectInputStream that reads from the specified InputStream.  
        */
        ObjectInputStream ois = new ObjectInputStream(fis);
        try 
        {
//            while(true)
//            {
//                /*
//                 * readObject() 
//                 * Read an object from the ObjectInputStream. 
//                */
//                People p2=(People)ois.readObject();
//                System.out.println(p2);
//            }
        	
        	  ArrayList<People> p2=(ArrayList<People>)ois.readObject();
              for(People p: p2){
            	  System.out.println(p);
              }
        	 // System.out.println(p2);
        		
            //û�а취�ж��ļ��ж��������,����,ֻ��ͨ��EOFException�쳣���ж�
            //������д���ʱ������еĶ��󶼷ŵ�һ��ArrayLis��,�����Ͳ���Ҫ�ж���
        } 
        catch (ClassNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(EOFException e)
        {
            System.out.println("��ȡ����");
        }
    } 
}

class People implements Serializable
{
    //����ʵ��Serializable�ӿ�
    int id;
    String name;
    People(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
  
    public String toString()
    {
        return "id:"+id+" name:"+name;
    }
 
}
