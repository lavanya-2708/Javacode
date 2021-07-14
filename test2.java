public class RemoveJunk {

    public static void main(String[] args) {
        String r="123 raj 678 vika ";
        //regular ecpression : [^a-zA-Z0-9]
        r=r.replaceAll("[^a-zA-Z]","");
        System.out.println(r);


    }
}
