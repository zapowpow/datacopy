package com.lzp.mysql.source.pbsSource.entity;


import javax.persistence.*;


@Entity
@Table(name = "termdevice")
public class Termdevice{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TERMDEVICE_ID", unique = true, nullable = false, precision = 20)
	private Long termdeviceId;
	@Column(name = "TERMDEVICE_NAME", nullable = false, length = 64)
	private String termdeviceName;
	@Column(name = "TASK_TYPE", precision = 20)
	private Long taskType;
	@Column(name = "ADDRESS", precision = 10)
	private Integer address;
	@Column(name = "USER_NAME1", nullable = false, length = 64)
	private String userName1;
	@Column(name = "PASSWORD1", nullable = false, length = 64)
	private String password1;
	@Column(name = "USER_NAME2", nullable = false, length = 64)
	private String userName2;
	@Column(name = "PASSWORD2", nullable = false, length = 64)
	private String password2;
	@Column(name = "TERMINAL_ID", nullable = false, precision = 20)
	private Long terminalId;
	@Column(name = "DATA_VALID_TIME", nullable = false, precision = 20)
	private Long dataValidTime;
	@Column(name = "BUFFER_NO", precision = 10)
	private Integer bufferNo;
	@Column(name = "MIN_COLLECTOR_INTERVAL", precision = 10)
	private Integer minCollectorInterval;
	@Column(name = "DEVICE_TYPE", precision = 10)
	private Integer deviceType;
	@Column(name = "STATUS", precision = 20)
	private Long status;
	@Column(name = "COMM_TIME_TAG", precision = 20)
	private Long commTimeTag;
	@Column(name = "EVENT_SAMPLE_TIME", precision = 20)
	private Long eventSampleTime;

	public Long getTermdeviceId() {
		return termdeviceId;
	}

	public void setTermdeviceId(Long termdeviceId) {
		this.termdeviceId = termdeviceId;
	}

	public String getTermdeviceName() {
		return termdeviceName;
	}

	public void setTermdeviceName(String termdeviceName) {
		this.termdeviceName = termdeviceName;
	}

	public Long getTaskType() {
		return taskType;
	}

	public void setTaskType(Long taskType) {
		this.taskType = taskType;
	}

	public Integer getAddress() {
		return address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public String getUserName1() {
		return userName1;
	}

	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getUserName2() {
		return userName2;
	}

	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public Long getDataValidTime() {
		return dataValidTime;
	}

	public void setDataValidTime(Long dataValidTime) {
		this.dataValidTime = dataValidTime;
	}

	public Integer getBufferNo() {
		return bufferNo;
	}

	public void setBufferNo(Integer bufferNo) {
		this.bufferNo = bufferNo;
	}

	public Integer getMinCollectorInterval() {
		return minCollectorInterval;
	}

	public void setMinCollectorInterval(Integer minCollectorInterval) {
		this.minCollectorInterval = minCollectorInterval;
	}

	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getCommTimeTag() {
		return commTimeTag;
	}

	public void setCommTimeTag(Long commTimeTag) {
		this.commTimeTag = commTimeTag;
	}

	public Long getEventSampleTime() {
		return eventSampleTime;
	}

	public void setEventSampleTime(Long eventSampleTime) {
		this.eventSampleTime = eventSampleTime;
	}
}