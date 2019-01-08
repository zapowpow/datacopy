package com.lzp.mysql.source.pbsSource.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;


/**
 * TmnlRun entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Entity
@Table(name = "tmnl_run", schema = "AMR")
public class TmnlRun{

    private Long id;
    private String mrid;
    private Long localId;
    private String aliasName;
    private String name;
    private String localName;
    private String pathName;
    private String description;

    private Short psrType;
    /**
     * 一个PSR可能引用其他系统资源
     */
    private String refId;
    /**
     * 与其他系统关联
     */
    private Long other1Id;
    /**
     * 与其他系统关联
     */
    private Long other2Id;

    /**
     * 与其他系统关联
     */
    private String other3Id;
    /**
     * 与其他系统关联
     */
    private String other4Id;
    /**
     * @return the psrType
     */

    private String assetNo;
	private Short type;
	private String terminalAddr;
	private String terminalTypeCode;
	private String collMode;
	private String protocolCode;
	private String commPassword;
	private Timestamp runDate;
	private String statusCode;
	private String freezeMode;
	private Integer freezeCycleNum;
	private Short psLineLen;
	private String workPs;
	private String speakerFlag;
	private Short sendUpMode;
	private Long stId;
	private Long taskId;
	private String cisTmnlId;
	private Long acquireInterval;
	private Long initialDelay;
	private Short safeArea;
	private Short manualFlag;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * A Model Authority issues mRIDs. Given that each Model Authority has a
     * unique id and this id is part of the mRID, then the mRID is globally
     * unique.
     */
    @Column(name = "MRID", length = 20)
    public String getMrid() {
        return this.mrid;
    }

    public void setMrid(String mrid) {
        this.mrid = mrid;
    }

    /**
     * @return the localId
     */
    @Column(name = "LOCAL_ID")
    public Long getLocalId() {
        return localId;
    }

    /**
     * @param localId
     *            the localId to set
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    /**
     * The aliasName is free text human readable name of the object alternative
     * to IdentifiedObject.name. It may be non unique and may not correlate to a
     * naming hierarchy.
     */
    @Column(name = "ALIAS_NAME", length = 32)
    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * The name is a free text human readable name of the object. It may be non
     * unique and may not correlate to a naming hierarchy.
     */
    @Column(name = "NAME", length = 64)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The localName is a human readable name of the object. It is only used
     * with objects organized in a naming hierarchy. The simplest naming
     * hierarchy has just one parent (the root) giving a flat naming hierarchy.
     * However, the naming hierarchy usually has several levels, e.g.
     * Substation, VoltageLevel, Equipment etc. Children of the same parent have
     * names that are unique among them. If the uniqueness requirement cannot be
     * met IdentifiedObject.localName shall not be used, use
     * IdentifiedObject.name instead.
     */
    @Column(name = "LOCAL_NAME", length = 64)
    public String getLocalName() {
        return this.localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    /**
     * The pathname is a system unique name composed from all IdentifiedObject.
     * localNames in a naming hierarchy path from the object to the root.
     */
    @Column(name = "PATH_NAME", length = 256)
    public String getPathName() {
        return this.pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    /**
     * The description is a free human readable text describing or naming the
     * object. It may be non unique and may not correlate to a naming hierarchy.
     */
    @Column(name = "DESCRIPTION", length = 256)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "PSR_TYPE")
    public Short getPsrType() {
        return psrType;
    }

    /**
     * @param psrType
     *            the psrType to set
     */
    public void setPsrType(Short psrType) {
        this.psrType = psrType;
    }

    @Column(name = "REF_ID", length = 32)
    public String getRefId() {
        return this.refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    @Column(name = "other1_id")
    public Long getOther1Id() {
        return this.other1Id;
    }

    public void setOther1Id(Long other1Id) {
        this.other1Id = other1Id;
    }

    @Column(name = "other2_id")
    public Long getOther2Id() {
        return this.other2Id;
    }

    public void setOther2Id(Long other2Id) {
        this.other2Id = other2Id;
    }

    @Column(name = "other3_id", length = 64)
    public String getOther3Id() {
        return this.other3Id;
    }

    public void setOther3Id(String other3Id) {
        this.other3Id = other3Id;
    }

    @Column(name = "other4_id", length = 64)
    public String getOther4Id() {
        return this.other4Id;
    }

    public void setOther4Id(String other4Id) {
        this.other4Id = other4Id;
    }


    @Column(name = "ASSET_NO", length = 32)
    public String getAssetNo() {
        return assetNo;
    }
    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

	@Column(name = "TYPE")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "TERMINAL_ADDR", length = 32)
	public String getTerminalAddr() {
		return this.terminalAddr;
	}

	public void setTerminalAddr(String terminalAddr) {
		this.terminalAddr = terminalAddr;
	}

	@Column(name = "TERMINAL_TYPE_CODE", length = 8)
	public String getTerminalTypeCode() {
		return this.terminalTypeCode;
	}

	public void setTerminalTypeCode(String terminalTypeCode) {
		this.terminalTypeCode = terminalTypeCode;
	}

	@Column(name = "COLL_MODE", length = 8)
	public String getCollMode() {
		return this.collMode;
	}

	public void setCollMode(String collMode) {
		this.collMode = collMode;
	}

	@Column(name = "PROTOCOL_CODE", length = 8)
	public String getProtocolCode() {
		return this.protocolCode;
	}

	public void setProtocolCode(String protocolCode) {
		this.protocolCode = protocolCode;
	}

	@Column(name = "COMM_PASSWORD", length = 16)
	public String getCommPassword() {
		return this.commPassword;
	}

	public void setCommPassword(String commPassword) {
		this.commPassword = commPassword;
	}

	@Column(name = "RUN_DATE", length = 19)
	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	@Column(name = "STATUS_CODE", length = 8)
	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Column(name = "FREEZE_MODE", length = 8)
	public String getFreezeMode() {
		return this.freezeMode;
	}

	public void setFreezeMode(String freezeMode) {
		this.freezeMode = freezeMode;
	}

	@Column(name = "FREEZE_CYCLE_NUM")
	public Integer getFreezeCycleNum() {
		return this.freezeCycleNum;
	}

	public void setFreezeCycleNum(Integer freezeCycleNum) {
		this.freezeCycleNum = freezeCycleNum;
	}

	@Column(name = "PS_LINE_LEN")
	public Short getPsLineLen() {
		return this.psLineLen;
	}

	public void setPsLineLen(Short psLineLen) {
		this.psLineLen = psLineLen;
	}

	@Column(name = "WORK_PS", length = 256)
	public String getWorkPs() {
		return this.workPs;
	}

	public void setWorkPs(String workPs) {
		this.workPs = workPs;
	}

	@Column(name = "SPEAKER_FLAG", length = 8)
	public String getSpeakerFlag() {
		return this.speakerFlag;
	}

	public void setSpeakerFlag(String speakerFlag) {
		this.speakerFlag = speakerFlag;
	}

	@Column(name = "SEND_UP_MODE")
	public Short getSendUpMode() {
		return this.sendUpMode;
	}

	public void setSendUpMode(Short sendUpMode) {
		this.sendUpMode = sendUpMode;
	}

	@Column(name = "ST_ID")
	public Long getStId() {
		return this.stId;
	}

	public void setStId(Long stId) {
		this.stId = stId;
	}

	@Column(name = "TASK_ID")
	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Column(name = "ACQUIRE_INTERVAL")
	public Long getAcquireInterval() {
		return this.acquireInterval;
	}

	public void setAcquireInterval(Long acquireInterval) {
		this.acquireInterval = acquireInterval;
	}

	@Column(name = "INITIAL_DELAY")
	public Long getInitialDelay() {
		return this.initialDelay;
	}

	public void setInitialDelay(Long initialDelay) {
		this.initialDelay = initialDelay;
	}

	/**
	 * @return the cisTmnlId
	 */
	@Column(name = "CIS_TMNL_ID", length = 64)
	public String getCisTmnlId() {
		return cisTmnlId;
	}

	/**
	 * @param cisTmnlId
	 *            the cisTmnlId to set
	 */
	public void setCisTmnlId(String cisTmnlId) {
		this.cisTmnlId = cisTmnlId;
	}

	@Column(name = "SAFE_AREA")
	public Short getSafeArea() {
		return safeArea;
	}

	public void setSafeArea(Short safeArea) {
		this.safeArea = safeArea;
	}

	/**
	 * @return the manualFlag
	 */
	@Column(name = "MANUAL_FLAG")
	public Short getManualFlag() {
		return manualFlag;
	}

	/**
	 * @param manualFlag
	 *            the manualFlag to set
	 */
	public void setManualFlag(Short manualFlag) {
		this.manualFlag = manualFlag;
	}

}