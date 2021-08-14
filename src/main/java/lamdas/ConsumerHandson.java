package lamdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Movies
{
    public Movies(String movieName, String result) {
        this.movieName = movieName;
        this.result = result;
    }

    String movieName;
    String result;


}

class Movie
{
    public Movie(String movieName, String heroName, String heroineName) {
        this.movieName = movieName;
        this.heroName = heroName;
        this.heroineName = heroineName;
    }

    String movieName;

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", heroName='" + heroName + '\'' +
                ", heroineName='" + heroineName + '\'' +
                '}';
    }

    String heroName;
    String heroineName;


}
public class ConsumerHandson {

    public static void main(String[] a)
    {
        Consumer<String> c=s->System.out.println(s);
        c.accept("Hello World");

        ArrayList<Movie> al=new ArrayList<>();
        Consumer<Movie> c1=m->{
            System.out.println(
                    "movieName='" + m.movieName + '\'' +
                    ", heroName='" + m.heroName + '\'' +
                    ", heroineName='" + m.heroineName + '\'' );
        };

        Consumer<Movies> c2=m->System.out.println(m.movieName+" Notification send to all");
        Consumer<Movies> c3=m->System.out.println(m.movieName+" is a "+m.result);
        Consumer<Movies> c4=m->System.out.println("Storing "+ m.movieName+" in DataBase");

ArrayList<Movies> al1= new ArrayList<>();

populateMovies(al1);
        System.out.println("###########Before printing the movies from Chained Consumer##############\n");
        for(Movies e:al1)
        {
            c2.andThen(c3).andThen(c4).accept(e);
            System.out.println();
        }
        System.out.println("\n###########printing the movies Done from Chained Consumer##############\n");


        Predicate<Movie> p=m->m.heroineName.equals("Anushka");
        Function<Movie,String> f= m->{
            return m.movieName;
        };
        //print Movie names
        populateMovie(al);
        System.out.println("###########Before printing the movie names##############\n");
        for(Movie e:al)
        {
           if(p.test(e))
           {
               System.out.println(f.apply(e));
               c1.accept(e);
            }

        }
        System.out.println("\n########## Movie names printing was done ######");



    }

    private static void populateMovies(ArrayList<Movies> al1) {
        al1.add(new Movies("Aadi","Super Hit"));
        al1.add(new Movies("Ninnu kori","Hit"));
        al1.add(new Movies("Toli Valapu","Flop"));
    }



    private static void populateMovie(ArrayList<Movie> al) {
        al.add(new Movie("Bahubali","Prabhas","Anushka"));
        al.add(new Movie("Mirapakay","Prabhas","Anushka"));
        al.add(new Movie("Kick","Raviteja","Iliyana"));
        al.add(new Movie("Sindhuram","Brahmaji","Sanghavi"));
    }
}
