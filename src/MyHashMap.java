import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap <Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3,"Third");
        dictionarulNostru.put(4,"Forth");
        //dictionarulNostru.replace(3,"Third-replaced");//3, Third-replaced
        System.out.println(dictionarulNostru.replace(3,"Third","Third-replaced"));

        System.out.println(dictionarulNostru.get(3));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.size());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.size());
        System.out.println(dictionarulNostru.entrySet());
        dictionarulNostru.replace(2,"Second-replaced");
        System.out.println(dictionarulNostru.get(2));
        System.out.println(dictionarulNostru.containsValue("Inexistent"));
        System.out.println(dictionarulNostru.containsKey(1111));

        for(int k: dictionarulNostru.keySet()){
            System.out.println(k);
        }

        for (String v: dictionarulNostru.values()){
            System.out.println(v);
        }

        System.out.println(dictionarulNostru.entrySet());

        HashMap <String,Boolean> studenti = new HashMap<>();
        studenti.put("Ionescu Adrian", true);
        studenti.put("Popescu Flavia", false);
        studenti.put("Pop Andrei", false);
        studenti.put("Rus Eugen", true);
        studenti.put("Anton Emilia", true);

        for (String student:studenti.keySet()){
            if(studenti.get(student)) {
                System.out.println(student);
            }
        }



    }
}