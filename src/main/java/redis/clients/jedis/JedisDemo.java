package redis.clients.jedis;

/**
 * @Classname JedisDemo
 * @Description TODO
 * @Author rookie
 * @Date 2023/1/12 10:52
 * @Version 1.0
 */
public class JedisDemo {
    public static void main(String[] args) {
        //创建redis对象 参数一个是linux系统的ip 不是127.0.0.1 端口号是redis 端口号 默认是6379
        Jedis jedis = new Jedis("127.0.0.1", 6379);
//将刚才修改的密码输入 这一步必不可少
//        jedis.auth(“123456”);
//测试ping 命令
        String ping = jedis.ping();
        System.out.println(ping);


    }
}
