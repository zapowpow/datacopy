package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;

/**
 * TaskConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taskConfig")
public class TaskConfig{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TASK_CONFIG_ID", unique = true, nullable = false, precision = 20)
	private Long taskConfigId;
	@Column(name = "TASK_CONFIG_NAME", nullable = false, length = 64)
	private String taskConfigName;
	@Column(name = "TASK_INTERVAL", precision = 10)
	private Integer taskInterval;
	@Column(name = "TASK_INTERVAL_OFFSET", precision = 10)
	private Integer taskIntervalOffset;
	@Column(name = "TASK_TIME_LAPSE", nullable = false, length = 64)
	private String taskTimeLapse;
	@Column(name = "ADJUST_TIME", precision = 10)
	private Integer adjustTime;
	@Column(name = "SETTIME_INTERVAL", precision = 10)
	private Integer settimeInterval;
	@Column(name = "SETTIME_LIMIT", precision = 20)
	private Long settimeLimit;
	@Column(name = "MIN_SETTIME_LIMIT", precision = 20)
	private Long minSettimeLimit;

	public Long getTaskConfigId() {
		return taskConfigId;
	}

	public void setTaskConfigId(Long taskConfigId) {
		this.taskConfigId = taskConfigId;
	}

	public String getTaskConfigName() {
		return taskConfigName;
	}

	public void setTaskConfigName(String taskConfigName) {
		this.taskConfigName = taskConfigName;
	}

	public Integer getTaskInterval() {
		return taskInterval;
	}

	public void setTaskInterval(Integer taskInterval) {
		this.taskInterval = taskInterval;
	}

	public Integer getTaskIntervalOffset() {
		return taskIntervalOffset;
	}

	public void setTaskIntervalOffset(Integer taskIntervalOffset) {
		this.taskIntervalOffset = taskIntervalOffset;
	}

	public String getTaskTimeLapse() {
		return taskTimeLapse;
	}

	public void setTaskTimeLapse(String taskTimeLapse) {
		this.taskTimeLapse = taskTimeLapse;
	}

	public Integer getAdjustTime() {
		return adjustTime;
	}

	public void setAdjustTime(Integer adjustTime) {
		this.adjustTime = adjustTime;
	}

	public Integer getSettimeInterval() {
		return settimeInterval;
	}

	public void setSettimeInterval(Integer settimeInterval) {
		this.settimeInterval = settimeInterval;
	}

	public Long getSettimeLimit() {
		return settimeLimit;
	}

	public void setSettimeLimit(Long settimeLimit) {
		this.settimeLimit = settimeLimit;
	}

	public Long getMinSettimeLimit() {
		return minSettimeLimit;
	}

	public void setMinSettimeLimit(Long minSettimeLimit) {
		this.minSettimeLimit = minSettimeLimit;
	}
}