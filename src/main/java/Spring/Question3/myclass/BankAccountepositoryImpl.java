package Spring.Question3.myclass;

import java.util.List;

public class BankAccountepositoryImpl implements IBankAccountRepository {

	
	List<BankAccount> account;
	
	
	
	public List<BankAccount> getAccount() {
		return account;
	}


	public void setAccount(List<BankAccount> account) {
		this.account = account;
	}


	public BankAccountepositoryImpl(List<BankAccount> account) {

		this.account = account;
	}
	

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}
}
