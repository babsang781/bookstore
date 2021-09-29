public class Book {

    private String name;
    private String writer;
    private String translator;
    private String publisher;
    private int year;
    private String genre;
    
    public books( String name, String writer, String translator, String publisher, int year, String genre){
        this.name = name;
        this.writer = writer;
        this.translator = writer;
        this.publisher = publisher;
        this.year = year;
        this.genre = genre;
    }
    
    public void updateInfo(int i, String info){
        switch(i) {
		case 1:
			setName(info);
			break;
		
		case 2:
			setWtiter(info);
			break;

		case 3:
			setTranslator(info);
			break;			
			
		case 4:
			setPublisher(info);
			break;
			
		case 5:
			setYear(Integer.parseInt(info));
			break;
		
		case 6:
			setGenre(info);
			break;
		}
	}
		
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getWriter() {
        return writer;
    } 
    
    public void setWriter(String writer) {
    	this.writer = writer;
    }	    
    
    public String getTranslator() {
    	return translator;
    }    
    
    public void setTranslator(String translator) {
    	this.translator = translator;
    }

    public String getPublisher() {
    	return publisher;
    }

    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }

    public int getYear() {
    	return year;
    }

    public void setYear(int year) {
    	this.year = year;
    
    public String getGenre() {
    	return genre;
    }

    public void setGenre(String genre) {
    	this.genre = genre;
    }
		
}
	
