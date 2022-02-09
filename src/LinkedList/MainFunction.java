package LinkedList;

public class MainFunction {
    public static void main(String[] args) {
        Node o1 = new Node(1,null);
//        o1.data = 1;
//        o1.next = null;

        Node o2 = new Node(2,null);
//        o2.data = 2;
//        o2.next = null;

        o1.next = o2;
        Node head = o1;

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
//        head = o1;
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
