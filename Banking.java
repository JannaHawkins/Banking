class Banking{
    public static void main(String[] args){
	static int currentBalance = 0;
	Debt[] debts = new Debt[20];

	Debt caseWestern = new Debt("school loan", 210000, 7);

	debts[0] = caseWestern;
	//debts[1] = 100000;//medical/
	//debts[2] = 10000; //Blair?
	//debts[3] = 5000;  //Sara Kim
	//debts[4] = 2000;  //Jeremy
	//debts[5] = 5000;  //midwives
	//debts[6] = 5000;  //Becklers
	//debts[7] = 6300;  //Rubin-Leonards
	//debts[8] = 30000; //Janna school loans

	for (int i = 0; i < debts.length; i++)
	    {System.out.println("Debt number " + i + " is: " + debts[i].interestRate);


		Debt caseWestern = new Debt("school loan", 210000, 7);

		int calculateStudentLoans(debts
		System.out.println("I owe" +  + " $ " + medSchool.gettotalDebt);

		//calculateSmallestDebt(debts);
	
		//System.out.println("Your balance is: " + currentBalance);
		//System.out.println("Your next debt that you are working to pay off is: " + smallestDebt);

		//static int calculateSmallestDebt (debts[]) {
		//int smallestDebt = 0;

		//System.out.println("Smallest debt is: " + smallestDebt);
			      

		//smallestDebt = debts[0];

		//for (int i = 0; i < length.debts; i ++){
		//if (debts[i] < smallestDebt) smallestDebt = debts[i];
		//}

		//return smallestDebt;
	    
		}
	

    }
}
