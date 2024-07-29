/*
public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);
}
}

public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.insert(1,"Java");
        System.out.println(sb);
}
}


public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.replace(1,3,"Java");
        System.out.println(sb);
}
}


public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.delete(1,3);
        System.out.println(sb);
}
}

public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.reverse();
        System.out.println(sb);
}
}


public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
}
}
*/


public class Main2_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
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
