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
    public static void main(String[] args)
    {
        constructorChaining obj=new constructorChaining("r22ef070","java");
        System.out.println(obj.author+" "+obj.title);
    }
}
