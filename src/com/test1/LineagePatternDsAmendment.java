package com.test1;

public class LineagePatternDsAmendment {
	private Integer patternCodeId;
	private String refName;
	private String amendASyncPatterns;
	private boolean aSyncPatternActive;
	private String aSyncPatternsName;
	private Integer asyncPatternsType;
	private boolean autoApproval;
	private Integer autoApprovalStep;
	private String workflowManagerCreationDate;
	private String modifiedDate;
	private String entityState;

	public LineagePatternDsAmendment() {

	}

	public LineagePatternDsAmendment(Integer patternCodeId, String refName, String amendASyncPatterns,
			boolean aSyncPatternActive, String aSyncPatternsName, Integer asyncPatternsType, boolean autoApproval,
			Integer autoApprovalStep, String workflowManagerCreationDate, String modifiedDate, String entityState) {
		super();
		this.patternCodeId = patternCodeId;
		this.refName = refName;
		this.amendASyncPatterns = amendASyncPatterns;
		this.aSyncPatternActive = aSyncPatternActive;
		this.aSyncPatternsName = aSyncPatternsName;
		this.asyncPatternsType = asyncPatternsType;
		this.autoApproval = autoApproval;
		this.autoApprovalStep = autoApprovalStep;
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

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getAmendASyncPatterns() {
		return amendASyncPatterns;
	}

	public void setAmendASyncPatterns(String amendASyncPatterns) {
		this.amendASyncPatterns = amendASyncPatterns;
	}

	public boolean isaSyncPatternActive() {
		return aSyncPatternActive;
	}

	public void setaSyncPatternActive(boolean aSyncPatternActive) {
		this.aSyncPatternActive = aSyncPatternActive;
	}

	public String getaSyncPatternsName() {
		return aSyncPatternsName;
	}

	public void setaSyncPatternsName(String aSyncPatternsName) {
		this.aSyncPatternsName = aSyncPatternsName;
	}

	public Integer getAsyncPatternsType() {
		return asyncPatternsType;
	}

	public void setAsyncPatternsType(Integer asyncPatternsType) {
		this.asyncPatternsType = asyncPatternsType;
	}

	public boolean isAutoApproval() {
		return autoApproval;
	}

	public void setAutoApproval(boolean autoApproval) {
		this.autoApproval = autoApproval;
	}

	public Integer getAutoApprovalStep() {
		return autoApprovalStep;
	}

	public void setAutoApprovalStep(Integer autoApprovalStep) {
		this.autoApprovalStep = autoApprovalStep;
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
