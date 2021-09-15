package net.biancheng.util;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 网络工具类
 */
public class NetUtils {

    public static boolean isLocalPortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1",port);
        }catch (Exception e){

        }
        return flag;
    }

    public static boolean isPortUsing(String host ,int port) throws UnknownHostException {
        boolean flag = false;
        InetAddress inetAddress = InetAddress.getByName(host);
        try{
            Socket socket = new Socket(inetAddress ,port);
            flag = true;
        }catch (Exception e){

        }
        return flag;
    }
}
