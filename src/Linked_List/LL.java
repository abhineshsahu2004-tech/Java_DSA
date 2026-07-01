package Linked_List;

 class LL {
     Node head;
     Node tail;
     private int size;

     LL(){
         this.size=0;
     }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
     // Add -First
     public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
     }
     // Add last
     public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
     }
     //Print
     public void Print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }
         System.out.println("NULL");
     }
     //Delete-First
     public void deleteFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        head=head.next;
        size--;
     }
     //Delete-Last
     public void deleteLast(){
        if(head==null){
            System.out.println("list is empty ");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node lastSecond=head;
        Node last=head.next;
        while(last.next!=null){
            lastSecond=lastSecond.next;
            last=last.next;
        }
        lastSecond.next=null;
     }
     //Size
     public int getSize(){
         return size;
     }

     static void main(String[] args) {
        LL list=new LL();
        list.addFirst("is");
        list.addFirst("Abhinesh");
        list.addLast("a");
        list.addLast("king");
        list.Print();
        list.deleteFirst();
        list.Print();
        list.deleteLast();
        list.Print();
        System.out.println(list.getSize());
     }
}
