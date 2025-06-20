package this_keyword;

public class constructorChaining {
    String title,author;
    //Constructor with one parameter calls consturctor with more number of parameteres
    // constructorChaining(String author)
    // {
    //     this.author=author;
    // }

    constructorChaining(String author)
    {
        this(author,"unknown");//calling two parameter constructor
    }
    constructorChaining(String author,String title)
    {
        this.author=author;
        this.title=title;
    }
}
