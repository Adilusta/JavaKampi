package day4Homework3;

public class ProducerManager implements ProducerService
{
	
	@Override
	public void addProducer(Producer producer) 
	{
		System.out.println("Oyun yapımcısı eklendi "+ producer.getFirstName());
		
	}

	@Override
	public void showInformation(Producer producer) 
	{
		System.out.println("Oyun yapımcısının bilgileri : \n " + producer.getFirstName() +" "+
	producer.getLastName() + " "+producer.getAge());
	
		
	}

	

}
