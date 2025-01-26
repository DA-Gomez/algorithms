public class QuizMagazine {
    private String title;

    //-----------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public QuizMagazine(String newTitle)
    {
        title = newTitle;
    }

    //-----------------------------------------------------------------
    //  Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return title;
    }

    public String getTitle() {
        return title;
    }
    
}
