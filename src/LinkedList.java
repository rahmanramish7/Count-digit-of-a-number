public class LinkedList {

        public static class Node
        {
            int data;
            Node next;

            public Node(int data)
            {
                this.data=data;
                this.next = null;



            }

        }

        public static Node head;
        public static Node tail;
        public static int size;


        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {

                head = tail = newNode;
                return;
            }
            //step - 1 = create a new node
            newNode.next = head;
            head = newNode;
        }

        public void AddLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static void PrintList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        public void add(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;


        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("Linked List Is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.println("LL is empty");
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;


        }

        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            //key not found
            return -1;
        }

        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            head = prev;
        }

        public void deleteNthfromEnd(int n) {
            //calculate from size
            int sz = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                sz++;
            }
            if (n == sz)  // if n ko hi delete krna hai means gead ko hi delte krna hai
            {
                head = head.next;
                return;
            }
            int i = 1;
            int iToFind = sz - n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;

            }
            prev.next = prev.next.next;
            return;


        }

        public Node findMiddleNode(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;        //+1
                fast = fast.next.next;  //+2
            }
            return slow;

        }

        public boolean checkPalindrome() {
            if (head == null & head.next == null) {
                return true;
            }
            //step -1 find mid
            Node midnode = findMiddleNode(head);
// step 2 - reverse 2nd half
            Node prev = null;
            Node curr = midnode;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // right mid ka head prev hai standard
            Node left = head;   // left mid ka head head hai

// check if left half and right half is equal
            while(right !=null)

            {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;

            }

            return true;
        }



        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.AddLast(2);
            ll.AddLast(1);
//        ll.PrintList();
//        ll.add(2, 9);
//        ll.PrintList();
//        System.out.println(ll.size);
//      // ll.removeFirst();
//       ll.PrintList();
//        System.out.println(ll.size);
//        //ll.removeFirst();
//        System.out.println(ll.itrSearch(4));
            ll.PrintList();
//        ll.reverse();
//        ll.PrintList();
            ll.deleteNthfromEnd(3);
            ll.PrintList();
            System.out.println(ll.checkPalindrome());
        }
    }


