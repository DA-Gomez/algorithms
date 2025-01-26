public class QuizMagazineRack {
    public static void main(String[] args) {
        QuizMagazineList rack = new QuizMagazineList();

        rack.add(new QuizMagazine("1"));
        rack.add(new QuizMagazine("2"));
        rack.add(new QuizMagazine("3"));
        rack.add(new QuizMagazine("4"));
        rack.add(new QuizMagazine("5"));

        // System.out.println("Original list:");
        // System.out.println(rack);

        // // Test edge case: Remove a magazine from the beginning
        // rack.remove("5");
        // System.out.println("remove 5");
        // System.out.println(rack);

        // // Test edge case: Remove a magazine from the middle
        // rack.remove("4");
        // System.out.println("remove 4");
        // System.out.println(rack);

        // Test edge case: Try to remove a magazine that doesn't exist
        // rack.remove("Nonexistent Magazine");
        // System.out.println("After attempting to remove 'Nonexistent Magazine':");
        // System.out.println(rack);

        // // Test edge case: Try to remove from an empty list
        // rack.remove("House and Garden");
        // rack.remove("Woodworking Today");
        // System.out.println("After removing all magazines:");
        // rack.remove("Another Nonexistent Magazine");

        rack.reverse();
        System.out.println(rack);
        
    }
    
}
