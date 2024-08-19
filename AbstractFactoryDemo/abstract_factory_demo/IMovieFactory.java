package abstract_factory_demo;

public interface IMovieFactory
{
    ITollywoodMovie GetTollywoodMovie();
    IBollywoodMovie GetBollywoodMovie();
}