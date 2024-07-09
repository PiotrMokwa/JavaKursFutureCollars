package Lesson9.Task1;
public class Main {
    public static void main(String[] args) {
        PeterHashMap petersss = new PeterHashMap("Jeck", "interesting");
        petersss.getMap();
        petersss.put("Ola", "123");
        petersss.getMap();
        System.out.println(" element was added : " + petersss.put("Michael", "7777"));
        petersss.getMap();
        System.out.println(" Is contains key: " + petersss.containsKey("q"));
        System.out.println(" Is contains value: " + petersss.containsValue("123"));
        System.out.println(" Get value: " + petersss.get("Michael"));
        System.out.println(" Deleted value: " + petersss.remove("Michael"));
        petersss.getMap();
    }
}
