package multicast.client;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by 张汉江 on 2018/1/20
 */
public class ClientMuti1 {
    public static  void main(String[] args){
        try {
            InetAddress group=InetAddress.getByName("224.5.6.7");
            MulticastSocket multicastSocket=new MulticastSocket(8888);
            multicastSocket.joinGroup(group);//把它加到组里面
            byte[] buf=new byte[128];
            while(true){
                DatagramPacket datagramPacket=new DatagramPacket(buf,buf.length);
                multicastSocket.receive(datagramPacket);
                String data=new String(datagramPacket.getData());
                System.out.println(data);
            }
        }catch (Exception e){

        }

    }

}
