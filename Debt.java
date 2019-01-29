class Debt extends Expense{
    String type;
    int amount;
    int interestRate;
    
   
    Debt(String type, int amount, int interestRate){
	this.type = type;
	this.amount = amount;
	this.interestRate = interestRate;
    }    
}
