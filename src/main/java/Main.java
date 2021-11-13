import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Сортировка точек по x и y с использованием ArrayList
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            points.add(new Point(Math.random(), Math.random()));
        }

        Collections.sort(points);
        for (Point p : points) {
            System.out.println(p);
        }
        System.out.println("\n");

        Collections.sort(points, Point.compareByX);
        for (Point p : points) {
            System.out.println(p);
        }
        System.out.println("\n");

        Collections.sort(points, Point.compareByY);
        for (Point p : points) {
            System.out.println(p);
        }
        System.out.println("\n");


        //Методы ArrayList
        points.get(1);
        points.remove(2);
        points.contains(0.23);
        points.size();
        points.isEmpty();


        //Методы Map
        Map<Integer, String> countries = new HashMap<>();
        countries.put(1, "Italy");
        countries.put(2, "France");
        countries.put(3, "Germany");
        countries.put(4, "Spain");


        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        Iterator<Map.Entry<Integer, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        countries.remove(2);
        countries.containsKey(3);
        countries.containsValue("Spain");
        System.out.println(countries.size());


        List<Integer> keys = new ArrayList<>(countries.keySet());
        for (int i : keys) {
            System.out.println(i);
        }

        List<String> values = new ArrayList<>(countries.values());
        for (String s : values) {
            System.out.println(s);
        }

        //Методы Set
        Set<String> names = new HashSet<>();

        names.add("Иван");
        names.add("Петр");
        names.add("Мария");
        names.add("Елена");

        names.remove("Петр");
        names.contains("Елена");
        names.size();
        names.isEmpty();

        Set<String> names2 = new HashSet<>();
        names2.add("Алексей");
        names2.add("Виктор");

        names.addAll(names2);
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
