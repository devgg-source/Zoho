class LinkedList {
    Node head;
    int k = 0;

    private class Node {
        int pid;
        int time;
        Node next;

        public Node(int pid, int time) {
            this.pid = pid;
            this.time = time;
        }
    }

    Node GetNode(int pid, int time) {
        return new Node(pid, time);
    }

    public void add(int pid, int time) {
        int position = 1;

        /*
         * 4. If the Linked List is empty, then make the new node as head
         */
        if (head == null) {
            head = new Node(pid, time);
            return;
        }

        /*
         * 4. This new node is going to be the last node, so make next of it as null
         */
        if (pid == 3) {
            Node cur3 = head;

            while (cur3.pid != 2 && cur3.pid != 1 && cur3.next != null) {
                position++;
                cur3 = cur3.next;
            }

            if (position == 1) {
                Node newNode = new Node(pid, time);
                newNode.next = head;
                head = newNode;
            } else {

                while (position-- != 0) {
                    System.out.println(position);
                    if (position == 1) {
                        // adding Node at required position
                        Node newNode = GetNode(pid, time);

                        // Making the new Node to point to
                        // the old Node at the same position
                        newNode.next = head.next;

                        // Replacing current with new Node
                        // to the old Node to point to the new Node
                        head.next = newNode;
                        break;
                    }
                    head = head.next;

                }

            }
        }

        else if (pid == 1)

        {
            Node new_node = new Node(pid, time);
            new_node.next = null;

            /* 5. Else traverse till the last node */
            Node last = head;
            while (last.next != null)
                last = last.next;

            /* 6. Change the next of last node */
            last.next = new_node;
            return;
        }

    }// end add

    void print() {
        Node cur = head;
        // System.out.println(k);
        while (cur != null) {
            System.out.println(cur.pid + " " + cur.time);
            cur = cur.next;
        }
    }

    public static void main(String args[]) {
        LinkedList obj = new LinkedList();

        obj.add(1, 10);
        obj.add(3, 30);
        obj.add(3, 80);
        obj.add(1, 40);
        obj.add(3, 17);
        obj.add(3, 10);

        obj.print();

    }
}
