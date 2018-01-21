package server;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by 张汉江 on 2018/1/20
 */
public class ExceptionDemo {

    public static  final Logger logger= Logger.getLogger(ExceptionDemo.class);
    public static void main(String[] args){
        logger.debug("ok");
        logger.error("zhangj");
        logger.info("zhangj");
       /* try {
            int a=1/0;
        }catch (Exception e){
            System.out.println("计算出错"+e);
        }*/
        int a=1/1;
        if(a!=1){
            try {
                //throw  new Exception("计算出错");
            } catch (Exception e) {
                logger.info("false"+e);
                e.printStackTrace();
            }
        }
        int b =20;
        System.out.println(b);
    }
}
