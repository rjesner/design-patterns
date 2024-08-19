package abstract_factory_demo;

class ActionMovieFactory implements IMovieFactory
{
    public ITollywoodMovie GetTollywoodMovie()
    {
        return new TollywoodActionMovie();
    }
    public IBollywoodMovie GetBollywoodMovie()
    {
        return new BollywoodActionMovie();
    }
}