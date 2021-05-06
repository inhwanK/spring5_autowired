package spring5_autowired.di;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException{

	public DuplicateMemberException(String message) {
		super(message);
		
	}
	
	
}
