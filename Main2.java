/*
public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);
}
}


public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1,"Java");
        System.out.println(sb);
}
}


public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.replace(1,3,"Java");
        System.out.println(sb);
}
}


public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.delete(1,3);
        System.out.println(sb);
}
}


public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.reverse();
        System.out.println(sb);
}
}


public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
}
}
*/

public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
}
}
