package client;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by 张汉江 on 2018/1/20
 */
public class ClientDemo {

    public static  void main(String[] args)throws  Exception{
        Socket socket=new Socket("localhost",8888);
        PrintWriter printWriter=new PrintWriter(new OutputStreamWriter
                (socket.getOutputStream()),true);
        printWriter.println("hello world");

        printWriter.close();
        socket.close();

    }
}
