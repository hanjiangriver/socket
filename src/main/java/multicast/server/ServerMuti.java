package multicast.server;

import sun.applet.Main;
import sun.org.mozilla.javascript.internal.ast.TryStatement;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/**
 * Created by 张汉江 on 2018/1/20
 */
public class ServerMuti {
    public static  void main(String[] args){
        try {
            InetAddress groupname=InetAddress.getByName("224.5.6.7");//组名
            MulticastSocket multicastSocket=new MulticastSocket();
            for(int i=0;i<20;i++){
                String data="hello i am zhanghj";
                byte[] buffer=data.getBytes();
                multicastSocket.send(new DatagramPacket(buffer,buffer.length,groupname,8888));
                TimeUnit.SECONDS.sleep(2);
            }
        }catch (Exception e){

        }

    }


}
