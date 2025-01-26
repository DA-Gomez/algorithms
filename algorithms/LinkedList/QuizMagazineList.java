public class QuizMagazineList {
    private MagazineNode list;

    public QuizMagazineList() {
        list = null;
    }

    public void add(QuizMagazine mag) {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (list == null)
            list = node;
        else {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    public void remove(String title) {
        if (list == null) {
            System.out.println("The list is empty.");
            return;
        }

        // Edge case 1: The node to be removed is the first node
        if (list.magazine.getTitle().equals(title)) {
        	list = list.next;
        	return;
        }

        MagazineNode current = list;

        // Find the node before the one to be removed
        while (current.next != null && !current.next.magazine.getTitle().equals(title)) {
            current = current.next;
        }

        // Edge case 2: The node with the given title does not exist
        if (current.next == null) return;

        // Remove the node
        current.next = current.next.next;
    }

    public void reverse() {
        reverse(list);        
    }

    private MagazineNode reverse(MagazineNode head) {
        if (head == null) return head;
        if (head.next == null) return head;

        MagazineNode current = reverse(head.next);
        MagazineNode temp = current;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return current;
    }

    public String toString() {
        String result = "";

        MagazineNode current = list;

        while (current != null) {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    private class MagazineNode {
        public QuizMagazine magazine;
        public MagazineNode next;

        public MagazineNode(QuizMagazine mag) {
            magazine = mag;
            next = null;
        }
    }
    
}
