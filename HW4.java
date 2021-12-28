public class HW4 {
    public static void main(String[] args) {
        String[] words = {"car", "chimp", "street", "star", "port", "park", "bus", "wood", "clock", "dog","chik", "cup"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Bobrov", "123");
        pb.add("Petrov", "456");
        pb.add("Horev", "789");
        pb.add("Ivanov", "111");
        pb.add("Torin", "421");
        pb.add("Dobrin", "234");
        pb.add("Petrov", "445");

        System.out.println(pb.get("Petrov"));
        System.out.println(pb.get("Bobrov"));
        System.out.println(pb.get("Horev"));
    }
}

class Phonebook pb {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }
    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}

