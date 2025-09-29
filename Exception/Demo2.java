package Exception;

public class Demo2 
{
  public static void main(String args[])
  {
	  try
	  {
		  int waterLevel=15;
		  if(waterLevel<=20) 
		throw new WaterLevelReductionException("Fill the water !");
	  }
	  catch(WaterLevelReductionException e)
	  {
		  e.printStackTrace();
	  }
  }
}
