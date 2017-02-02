package calculate;

public class Handerler {
	
	
	

	public Boolean checkMode(String mode){
		
		try
	    {
	        Integer.parseInt(mode);
	        return false;
	    } catch (NumberFormatException ex)
	    {
	        return  true;
	    }
			
	}

	public boolean checkDouble(String y) {
		// TODO Auto-generated method stub
		try
	    {
			Double.parseDouble(y);
			return false;
	    } catch (Exception ex)
	    {
	    	return  true;
	    }
	}
}
