package this_keyword;
public class instanceVariable
{
    String id;//instance variable
    instanceVariable(String id)//local parameter
    {
        this.id=id;//this.id references the instance variable
        System.out.println(this.id);
    }
    public static void main(String[] args)
    {
        new instanceVariable("r22ef070");//call the constructor
    }
}