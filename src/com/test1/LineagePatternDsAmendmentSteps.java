package com.test1;

public class LineagePatternDsAmendmentSteps {
	private Integer patternCodeId;
	private String paramsOfWorkflowManager;
	private String workflowManagerStatus;
	private String workflowManagerApproved;
	private String pendingOn;
	private String grpName;
	private String grpCategory;
	private String startAction;
	private String endAction;
	private String startTime;
	private String endTime;
	private String workflowManagerCreationDate;
	private String modifiedDate;
	private String entityState;

	public LineagePatternDsAmendmentSteps() {

	}

	public LineagePatternDsAmendmentSteps(Integer patternCodeId, String paramsOfWorkflowManager,
			String workflowManagerStatus, String workflowManagerApproved, String pendingOn, String grpName,
			String grpCategory, String startAction, String endAction, String startTime, String endTime,
			String workflowManagerCreationDate, String modifiedDate, String entityState) {
		super();
		this.patternCodeId = patternCodeId;
		this.paramsOfWorkflowManager = paramsOfWorkflowManager;
		this.workflowManagerStatus = workflowManagerStatus;
		this.workflowManagerApproved = workflowManagerApproved;
		this.pendingOn = pendingOn;
		this.grpName = grpName;
		this.grpCategory = grpCategory;
		this.startAction = startAction;
		this.endAction = endAction;
		this.startTime = startTime;
		this.endTime = endTime;
		this.workflowManagerCreationDate = workflowManagerCreationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getPatternCodeId() {
		return patternCodeId;
	}

	public void setPatternCodeId(Integer patternCodeId) {
		this.patternCodeId = patternCodeId;
	}

	public String getParamsOfWorkflowManager() {
		return paramsOfWorkflowManager;
	}

	public void setParamsOfWorkflowManager(String paramsOfWorkflowManager) {
		this.paramsOfWorkflowManager = paramsOfWorkflowManager;
	}

	public String getWorkflowManagerStatus() {
		return workflowManagerStatus;
	}

	public void setWorkflowManagerStatus(String workflowManagerStatus) {
		this.workflowManagerStatus = workflowManagerStatus;
	}

	public String getWorkflowManagerApproved() {
		return workflowManagerApproved;
	}

	public void setWorkflowManagerApproved(String workflowManagerApproved) {
		this.workflowManagerApproved = workflowManagerApproved;
	}

	public String getPendingOn() {
		return pendingOn;
	}

	public void setPendingOn(String pendingOn) {
		this.pendingOn = pendingOn;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getGrpCategory() {
		return grpCategory;
	}

	public void setGrpCategory(String grpCategory) {
		this.grpCategory = grpCategory;
	}

	public String getStartAction() {
		return startAction;
	}

	public void setStartAction(String startAction) {
		this.startAction = startAction;
	}

	public String getEndAction() {
		return endAction;
	}

	public void setEndAction(String endAction) {
		this.endAction = endAction;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getWorkflowManagerCreationDate() {
		return workflowManagerCreationDate;
	}

	public void setWorkflowManagerCreationDate(String workflowManagerCreationDate) {
		this.workflowManagerCreationDate = workflowManagerCreationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
