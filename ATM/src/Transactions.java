public class Transactions {
	private int cardNo;
	private double balance;
	public int position=0,count=0;
	String [] historyArray=new String[5];
	public Transactions ()
	{
		cardNo=1010;
		balance=0;
			
	}
	public boolean validation(String num)
	{
		int num1;
		num1=Integer.parseInt(num);
		if(num1==this.cardNo)
			return true;
		else return false;
	}
	public int withdrawal(String num3)
	{
		double amount;
		int flag=0;
		amount=Double.parseDouble(num3);
		if(amount>3000)
			flag=1;
		else if(amount<0)
			flag=1;
		else if(amount<=balance)
			{
			balance-=amount;
			if(this.count>4) 
			{
				for(int i=0;i<4;i++)
				{
					historyArray[i]=historyArray[i+1];
				}
				historyArray[4]="Withdrawal: "+Double.toString(amount);
				this.count=4;
			}
			else historyArray[this.count]="Withdrawal: "+Double.toString(amount);
			
		this.count++;
		this.position=this.count;
			
			}
		else flag=1;
		return flag; }
		
	public int deposit(String num2)
	{
		double amount;
		int flag=0;
		amount=Double.parseDouble(num2);
		if(amount<0)
			flag=1;
		else { 
			balance+=amount;
		if(this.count>4) 
		{
			for(int i=0;i<4;i++)
			{
				historyArray[i]=historyArray[i+1];
			}
			historyArray[4]="Deposit: "+Double.toString(amount);
			this.count=4;
		}
		else historyArray[this.count]="Deposit: "+Double.toString(amount); 
		this.count++;
		this.position=this.count;}
		return flag;
	}
	public double getBalance()
	{
		if(this.count>4) 
		{
			for(int i=0;i<4;i++)
			{
				historyArray[i]=historyArray[i+1];
			}
			historyArray[4]="Viewed Current Balance: "+Double.toString(balance);
			this.count=4;
		}
		else historyArray[this.count]="Viewed Current Balance: "+Double.toString(balance);
		this.count++;
		this.position=this.count;
		return balance;
	}
	public String previousTransaction()
	{
		this.position--;
		if(this.position<0)
			return "No prior transactions";
		else if(historyArray[this.position]==null)
			return "No prior transactions";		
		else return historyArray[this.position];
	}
	public String nextTransaction()
	{
		this.position++; 
		if(this.position>4)
			return "No further transactions";
		else if(historyArray[this.position]==null)
			return "No further transactions";		
		else return historyArray[this.position];
	}
}

