package sec2;

public class AccountEx {
	public static void main(String[] args) {
		Account acc1 = new Account();
		//acc1.setBalance(0);
		acc1.setAccount("356-0374-7000-43");
		acc1.setOwner("김태엽");
		acc1.runDeposit(150000);
		acc1.runWithdraw(90000);
		System.out.println("잔액조회 : "+acc1.runBlance());
		acc1.runDeposit(200000);
		acc1.printAccount();
	}
}