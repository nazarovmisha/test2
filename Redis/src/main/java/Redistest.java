import redis.clients.jedis.Jedis;

public class Redistest {
    public static void main(String[] args) {
     Jedis jedis = new Jedis();
        System.out.println(jedis.ping());
    }
}
