package Spring.Question3.myclass;

public interface IBankAccountRepository {
	
	public double getBalance(long accountId);
	
	public double updateBalance(long accountId, double newBalance);
}
