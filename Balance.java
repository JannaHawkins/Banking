class Balance{
    
    
    Income paycheck1 = new Income(400,"hotdog stand");
    Expense grocery1 = new Expense(200, "CostCo");
     
    //later add an incomesArray here and populate it with income objects
    //add an array here and populate it with expense objects
    
 
    
    public static void main(String[] args){

	int countIncome = 0;
	int totalIncome = 400;  //manually entered for now
	int countExpense = 0;
	int totalExpense = 200;  //manually entered for now

	//later add a for loop and go over all incomes in incomesArray and call .getAmount on each object, update countIncome and totalIncome


	//add a for loop and go over all expenses and call .getAmount on each object, update countExpense and totalExpense
	
 	
	int currentBalance = getTotal(totalIncome, totalExpense);
	System.out.println("Current balance is: " + currentBalance);
       
    }
    static int getTotal(int totalIncome, int totalExpense){
	return totalIncome - totalExpense;
    }
   
}
