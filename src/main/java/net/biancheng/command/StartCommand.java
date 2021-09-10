package net.biancheng.command;

import net.biancheng.util.ServerPortUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * 启动命令类，获取随机端口
 */
public class StartCommand {

    private Logger logger = LoggerFactory.getLogger(StartCommand.class);

    public StartCommand(String[] args){
        boolean isServerPort = false;
        String serverPort = "";
        if (args != null) {
            for (String arg : args){
                if (StringUtils.hasText(arg) && arg.startsWith("--server.port")){
                    isServerPort = true;
                    serverPort = arg;
                    break;
                }
            }
        }

        // 没有指定端口, 则随机生成一个可用的端口
        if (!isServerPort){
            int port = ServerPortUtils.getAvailablePort();
            logger.info("current server.port=" + port);
            System.setProperty("server.port",String.valueOf(port));
        }else {
            logger.info("current server.port=" + serverPort.split("=")[1]);
            System.setProperty("server.port" , serverPort.split("=")[1]);
        }
    }
}
