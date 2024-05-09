package structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieRatingSystem {

	public static void main(String[] args) {
		// Movie Object 계속 추가하는 자료구조
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie("범죄도시 4", 5));
		movies.add(new Movie("기생충", 4));
		movies.add(new Movie("올드보이", 5));
		movies.add(new Movie("인생은아름다워", 3));
		
		// System.out.println(movies);
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}
		System.out.println("------------------------");
		// 정렬 코드
		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return Integer.compare(m2.getRating(), m1.getRating());
			}
		});
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).getTitle());
		}
		
		// 어떤 데이터를 정렬 하려면 정렬 알고리즘을 구현해서 기능을 만들어 주면 된다.
		// 버블 정렬, 퀵, ...
		
	} // end of main

} // end of class

class Movie {

	private String title;
	private int rating;

	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Movie [title : " + title + ", rating : " + rating + "]";
	}

}
