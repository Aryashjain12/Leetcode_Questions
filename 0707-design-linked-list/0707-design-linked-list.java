class Node{
    int val ; 
    Node next;

    public Node(int val){
        this.val = val;
    }
    public Node(){
    }
}

class MyLinkedList {
    
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
         head = null;
         tail = null;
         size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        int a = 0 ;
        Node temp = new Node();
        temp = head;
        while(a<index){
            temp = temp.next;
            a++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
        temp.next = head;
        temp.val = val;
        head = temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        size++;
        Node temp = new Node(val);
        if(tail==null){
            head=tail=temp;
        }else{
        tail.next = temp;
        tail = temp;
        }
    }
    
    public void addAtIndex(int index, int val) {
        int x=1;
        Node temp = new Node();
        if(index<0) index=0;
        if(index>size) return;

        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }

        temp = head;
        while(x<index){
            temp = temp.next;
            x++;
        }
        Node a = new Node(val);
        a.next = temp.next;
        temp.next = a;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size || index<0){
            return;
        }
        if(index==0){
            head = head.next;
            size--;

            if(size==0){
                tail=null;
            }
            return;
        }


        int a = 1 ;
        Node temp = new Node();
        temp = head;
        while(a<index){
            temp = temp.next;
            a++;
        }
        Node deleted = temp.next;
        temp.next = deleted.next;
        if(deleted == tail){
            tail = temp;
        }
        size--;
}}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */