import java.util.*;
class TestCollection4{
  public static void main(String[] args) {
    ArrayList<String> a1=new ArrayList<String>();
    a1.add("raju");
    a1.add("vijay");
    a1.add("Ajay");
    ArrayList<String> a12=new ArrayList<String>();

    a12.add("sonooo");
    a12.add("humanat");
    a1.addAll(1,a12); //adding second list in  first lsit

    System.out.println(a1.size());
    for(String itr:a1)
    System.out.println(itr);
    System.out.println(a1.contains("Ajay"));
    System.out.println(a1.isEmpty());
    a1.set(2,"veer");

    for (String itr:a1)
    System.out.println(itr);
    System.out.println(a1.get(3));
    System.out.println(a1.indexOf("vijay"));
    System.out.println(a1.lastIndexOf("vijay"));

  }
}
