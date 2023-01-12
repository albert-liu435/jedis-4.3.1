package redis.clients.jedis;

import java.net.Socket;

import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * socket工厂类，用于创建redis的socket连接
 * JedisSocketFactory: responsible for creating socket connections
 * from the within the Jedis client, the default socket factory will
 * create TCP sockets with the recommended configuration.
 * <p>
 * You can use a custom JedisSocketFactory for many use cases, such as:
 * - a custom address resolver
 * - a unix domain socket
 * - a custom configuration for you TCP sockets
 */
public interface JedisSocketFactory {
    /**
     * 创建socket连接
     *
     * @return
     * @throws JedisConnectionException
     */
    Socket createSocket() throws JedisConnectionException;
}
