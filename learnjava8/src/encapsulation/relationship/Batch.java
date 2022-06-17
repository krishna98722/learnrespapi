package encapsulation.relationship;

import java.time.LocalDate;

public class Batch {
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchStartDate=" + batchStartDate + ", batchEndDate=" + batchEndDate
				+ ", mentor=" + mentor + "]";
	}
	private String batchId;
	private LocalDate batchStartDate;
	private LocalDate batchEndDate;
	//late initialization 
	private Mentor mentor;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public LocalDate getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(LocalDate batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public LocalDate getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(LocalDate batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	public Batch(String batchId, LocalDate batchStartDate, LocalDate batchEndDate) {
		super();
		this.batchId = batchId;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
	}
	public Batch() {
		super();
	}

	//helper method
	public void createMentorObject() {
		mentor = new Mentor();
	}
//Helper method
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
}
