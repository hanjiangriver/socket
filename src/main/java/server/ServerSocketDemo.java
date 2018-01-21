package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 张汉江 on 2018/1/20
 */
public class ServerSocketDemo {
    public  static void main(String[] args)throws  Exception{
        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(8888);

            Socket socket=serverSocket.accept();
            BufferedReader bufferedReader=new BufferedReader
                    (new InputStreamReader(socket.getInputStream()));


            System.out.println(bufferedReader.readLine());
        }catch (Exception e){

        }finally {
            if(serverSocket!=null){
                serverSocket.close();
            }

        }
    }
}
