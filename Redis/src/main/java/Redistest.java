import redis.clients.jedis.Jedis;

public class Redistest {
    public static void main(String[] args) {
     Jedis jedis = new Jedis();
        System.out.println(jedis.ping());
        jedis.set("testkey", "testvalue");
        System.out.println("Метод для проверки наличия индекса");
        System.out.println(jedis.exists("testkey"));
        System.out.println(jedis.exists("Falsetestkey"));
        System.out.println("Метод добавления словаря");
        System.out.println(jedis.hset("Fild","TestSetKey", "Value"));
        System.out.println(jedis.hset("another","TestSetKey", "testvalue"));
        System.out.println(jedis.hget("TestSetKey", "another"));
    }
}
