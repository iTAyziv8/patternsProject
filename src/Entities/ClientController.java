package Entities;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ClientController
{
	private static ClientController singletoneInstance = null;
	public File logger;
	public Configuration configuration;
	/**
	 * private Singletone constructor
	 */
	private ClientController()
	{
		configuration = new Configuration(new JsonConfigurationInput(new File("").getAbsolutePath()+"/src/input.json"));

		try {
			createLogger();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Call this instead of the constructor
	 * 
	 */
	public static ClientController createClientIfNotExist()
	{
		if (singletoneInstance == null)
			singletoneInstance = new ClientController();
		return singletoneInstance;
	}
	
	public void createLogger() throws IOException 
	{
		try 
		{
			logger = new File("logger.txt");
		      if (logger.createNewFile()) 
		      {
		        System.out.println("File created: " + logger.getName());
		      } 
		      else 
		      {
		        System.out.println("File already exists.");
		      }
		 } 
		catch (IOException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		FileWriter fileWriter = new FileWriter(logger);
		fileWriter.write("Name\tFamily Name\tDate\t\tType\t\tRemarks\n");
		fileWriter.close();
	}



}
