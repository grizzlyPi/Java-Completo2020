package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class StringBuilder {

	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 	
		
	Date firstPostDate = sdf.parse("21/06/2018 13:05:44");
	String firstPostTitle = "Traveling to New Zeeland";
	String firstPostContent = "I'm going to visit this wonderful country!";
	Integer firstPostLikes = 12;
	
	Post firstPost = new Post(firstPostDate, firstPostTitle, firstPostContent, firstPostLikes);
	
	Comment firstComment = new Comment("Have a nice trip");
	firstPost.addComment(firstComment);
	
	Comment secondComment = new Comment("Wow that's awesome!");
	firstPost.addComment(secondComment);
	
	System.out.println(firstPost.getTitle());
	System.out.println(firstPost.getLikes() + " Likes - " + sdf.format(firstPost.getMoment()));
	System.out.println(firstPost.getContent());
	System.out.println("Comments:");
	System.out.println(firstPost.getComment().get(0).getText());
	System.out.println(firstPost.getComment().get(1).getText());
	System.out.println();
	
	Date secondPostDate = sdf.parse("28/07/2018 23:14:19");
	String secondPostTitle = "Good night guys";
	String secondPostContent = "See you tomorrow";
	Integer secondPostLikes = 5;
	
	Post secondPost = new Post(secondPostDate, secondPostTitle, secondPostContent, secondPostLikes);
	
	Comment thirdComment = new Comment("Good night");
	secondPost.addComment(thirdComment);
	
	Comment fourthComment = new Comment("May the Force be with you");
	secondPost.addComment(fourthComment);
	
	System.out.println(secondPost.getTitle());
	System.out.println(secondPost.getLikes() + " Likes - " + sdf.format(secondPost.getMoment()));
	System.out.println(secondPost.getContent());
	System.out.println("Comments:");
	System.out.println(secondPost.getComment().get(0).getText());
	System.out.println(secondPost.getComment().get(1).getText());

	}
}
