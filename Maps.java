import java.util.*;

//simple program to understand the concept of hashmaps in java
public class Maps {
    public static void main(String[] args){

        HashMap<String, Integer> empId = new HashMap<>();
        empId.put("Jobin", 12106);
        empId.put("Bala", 23110);
        empId.put("Thathun", 3477);
        //empId.put(key, value);

        System.out.println(empId);
        System.out.println(empId.get("Jobin"));

        System.out.println(empId.containsValue(12106));

        System.out.println(empId.containsKey("Bala"));

        empId.put("Thathun", 34077); //updates the alr existing value of that key, can also use empId.replace
        System.out.println(empId);

        empId.putIfAbsent("Bala", 23110); 
        //if we are unsure if we stored value for a particular key, without overriding it we can use this
        //this will check if any key is there in the hashmap with the current name, if its not there then the key and its value is stored.

        //we can use empId.remove("Key name") to remove any of the value or key.a



    }
    
}
