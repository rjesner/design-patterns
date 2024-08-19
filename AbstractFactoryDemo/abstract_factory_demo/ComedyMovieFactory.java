package abstract_factory_demo;

class ComedyMovieFactory implements IMovieFactory
{
    public ITollywoodMovie GetTollywoodMovie()
    {
        return new TollywoodComedyMovie();
    }
    public IBollywoodMovie GetBollywoodMovie()
    {
        return new BollywoodComedyMovie();
    }
}