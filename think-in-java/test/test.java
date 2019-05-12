/**
 * 
 */
/**
 * @author yy263
 *
 */
package test;

//import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class test {
public static void main(String[] args) throws Exception  {
    Charset charset = Charset.forName("utf8");
    System.out.println(charset.name()+"--"+charset.canEncode());
    //����һ���������ַ��ı������ַ����ı����ǲ��ɱ��
    Set<String> set = charset.aliases();
    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

    System.out.println("----------����----------------");
    ByteBuffer buffer = charset.encode("sdf");
    System.out.println(buffer);

    System.out.println("������ʣ���Ԫ����--"+buffer.remaining());
    while(buffer.hasRemaining()) {
        System.out.println((char)buffer.get());
    }
    System.out.println("������ʣ���Ԫ����--"+buffer.remaining());
    System.out.println("----------����----------------");
    //��ջ����������������ûָ�����������˱�ǣ������Ƕ���
    buffer.flip();
    
    System.out.println("----------test---------------");   
    String name = "I am ��ɽ"; 
    byte[] utf8 = name.getBytes("GBK");
    String string = new String(utf8, "GBK");
     
    Charset charset2 = Charset.forName("UTF-16"); 
    ByteBuffer byteBuffer = charset2.encode(string);
    CharBuffer charBuffer = charset2.decode(byteBuffer);
    System.out.println(byteBuffer);
    System.out.println(charBuffer);
    
    System.out.println("----------test------------end---");  
    System.getProperties().list(System.out);
}}
