package entities;

public class Student {
	/*
	 * attributes
	 */
	public String name;
	public double firstQuarterGrade;
	public double secondQuarterGrade;
	public double thirdQuarterGrade;

	/*
	 * methods
	 */
	private double totalGrade() {
		double total = this.firstQuarterGrade + this.secondQuarterGrade + this.thirdQuarterGrade;
		return total;
	}

	private double checkMinimumApprovalPercentage() {
		double approvalPercentage = (100 * 60) / 100;
		return approvalPercentage;
	}

	public void finalSituation() {
		double total = this.totalGrade();
		double approvalPercentage = this.checkMinimumApprovalPercentage();
		double missingPointsForApproval = 0.0;

		if (total >= approvalPercentage) {
			System.out.printf("\nNota final: %.2f%n", total);
			System.out.println("PASS");

		} else {
			System.out.printf("\nNota final: %.2f%n", total);
			System.out.println("FAILED");
			missingPointsForApproval = approvalPercentage - total;
			System.out.printf("MISSING %.2f POINTS%n", missingPointsForApproval);
		}
	}
}
