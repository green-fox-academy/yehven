public class exercise02 {
    public static void main(String[] args) {
        BlogPost Post1 = new BlogPost();
        Post1.authorName = "John Doe";
        Post1.title = "Lorem Ipsum";
        Post1.publicationDate = "2000.05.04.";

        BlogPost Post2 = new BlogPost();
        Post2.authorName = "Tim Urban";
        Post2.title = "Wait but why";
        Post2.publicationDate = "2010.10.10.";
        Post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost Post3 = new BlogPost();
        Post3.authorName = "William Turton";
        Post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        Post3.publicationDate = "2017.03.28.";
        Post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        

    }
}
