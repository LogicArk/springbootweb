package net.biancheng.util;

import java.util.Random;
import java.net.Socket;

/**
 * 服务端口工具类
 */
public class ServerPortUtils {

    public static int getAvailablePort(){
        int max = 65536;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max)%(max-min+1) + min;
        boolean useing = NetUtils.isLocalPortUsing(port);
        if (useing){
            return  getAvailablePort();
        }else{
            return port;
        }
    }
}
