package cor;

public class CORMain {
	 public static void main(String[] args) {
	        ChainCreator chainCreator = new ChainCreator();
	        Managers manager = chainCreator.createChain();
	        manager.approveSalary(5000);
	        manager.approveSalary(15000);
	        manager.approveSalary(45000);
	        manager.approveSalary(5000000);
	    }
}

/*
Mike has approved the salary at level 1, for salary amount 5000
Bill has approved the salary at level 2, for salary amount 15000
Ayush has approved the salary at level 3, for salary amount 45000
Cannot make the offer to candidate
*/