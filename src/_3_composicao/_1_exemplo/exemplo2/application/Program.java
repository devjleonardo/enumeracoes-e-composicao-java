package _3_composicao._1_exemplo.exemplo2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import _3_composicao._1_exemplo.exemplo2.entities.Comment;
import _3_composicao._1_exemplo.exemplo2.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(
				simpleDateFormat.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		Comment comment1 = new Comment("Have a nice trip");
		post1.addComment(comment1);
		
		Comment comment2 = new Comment("Wow that's awesome");
		post1.addComment(comment2);
		
		Post post2 = new Post(
				simpleDateFormat.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		
		Comment comment3 = new Comment("Good night");
		post2.addComment(comment3);
		
		Comment comment4 = new Comment("May the Force be with you");
		post2.addComment(comment4);
		
		System.out.println(post1);
		
		System.out.println(post2);
	}
	
}
