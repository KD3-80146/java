
public class ExceptionLineTooLong extends RuntimeException {
	
	
     String fieldName;
     

	public ExceptionLineTooLong() {
		
	}

	public ExceptionLineTooLong(String fieldName) {
		
		this.fieldName = fieldName;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [fieldName=" + fieldName + "]";
	}
	
	
     
     
}
