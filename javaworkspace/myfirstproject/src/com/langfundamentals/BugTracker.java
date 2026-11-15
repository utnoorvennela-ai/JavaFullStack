package com.langfundamentals;

public class BugTracker {
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	public static void main(String[] args) {
		BugTracker b1 = new BugTracker();
		b1.bugId = 101;
		b1.applicationName = "Banking App";
		b1.bugTitle = "Login Failed";
		b1.severity = "High";
		b1.priority = "Urgent";
		b1.status = "Open";
		b1.assignedDeveloper = "Vennela";
		b1.assignToDeveloper(102, "Lahari");
		b1.displayBugSummary();

	}

	int getBugId() {
		return bugId;
	}

	String getApplicationName() {
		return applicationName;
	}

	String getBugTitle() {
		return bugTitle;
	}

	String getSeverity() {
		return severity;
	}

	String getPriority() {
		return priority;
	}

	String getStatus() {
		return status;
	}

	String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	void assignToDeveloper(int bugid, String developerName) {
		bugId=bugid;
		assignedDeveloper=developerName;
		updateStatus("In Development");
	}

	void updateStatus(String newStatus) {
		status=newStatus;

	}

	void displayBugSummary() {
		System.out.println("Bug Id is:" + getBugId());
		System.out.println("Application Name:" + getApplicationName());
		System.out.println("Bug Title:" + getBugTitle());
		System.out.println("Bug Severity:" + getSeverity());
		System.out.println("Bug Priority:" + getPriority());
		System.out.println("Bug Status:" + getStatus());
		System.out.println("Assigned Developer:" + getAssignedDeveloper());
	}

}
