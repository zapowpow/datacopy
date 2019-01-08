package com.lzp.mysql.source.tmrSource.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lzp.mysql.source.unit.DateTimeSerializer;
import com.lzp.mysql.source.unit.TimestampDeserializer;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "ertus")
public class Ertus{
    private Long ertuId;
    private String ertuName;
    private Long acquiredId;
    private Short ertuType;
    private String address;
    private String userName;
    private String password;
    private Long manufactureId;
    private Long modelId;
    private Long storeCap;
    private Long status;
    private Short isInUse;
    private Long protocolId;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class1TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class2TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class3TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class4TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class5TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class6TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class7TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class8TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class9TimeTag;
    @JsonSerialize(using = DateTimeSerializer.class)
	@JsonDeserialize(using = TimestampDeserializer.class)
	private Timestamp class10TimeTag;

    @Id
    @Column(
        name = "ERTU_ID",
        unique = true,
        nullable = false
    )
    public Long getErtuId() {
        return this.ertuId;
    }

    public void setErtuId(Long ertuId) {
        this.ertuId = ertuId;
    }

    @Column(
        name = "ERTU_NAME",
        nullable = false,
        length = 64
    )
    public String getErtuName() {
        return this.ertuName;
    }

    public void setErtuName(String ertuName) {
        this.ertuName = ertuName;
    }

    @Column(
        name = "ACQUIRED_ID",
        nullable = false
    )
    public Long getAcquiredId() {
        return this.acquiredId;
    }

    public void setAcquiredId(Long acquiredId) {
        this.acquiredId = acquiredId;
    }

    @Column(
        name = "ERTU_TYPE"
    )
    public Short getErtuType() {
        return this.ertuType;
    }

    public void setErtuType(Short ertuType) {
        this.ertuType = ertuType;
    }

    @Column(
        name = "ADDRESS",
        length = 32
    )
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(
        name = "USER_NAME",
        length = 64
    )
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(
        name = "PASSWORD",
        length = 64
    )
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(
        name = "MANUFACTURE_ID"
    )
    public Long getManufactureId() {
        return this.manufactureId;
    }

    public void setManufactureId(Long manufactureId) {
        this.manufactureId = manufactureId;
    }

    @Column(
        name = "MODEL_ID"
    )
    public Long getModelId() {
        return this.modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    @Column(
        name = "STORE_CAP"
    )
    public Long getStoreCap() {
        return this.storeCap;
    }

    public void setStoreCap(Long storeCap) {
        this.storeCap = storeCap;
    }

    @Column(
        name = "STATUS"
    )
    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Column(
        name = "IS_IN_USE"
    )
    public Short getIsInUse() {
        return this.isInUse;
    }

    public void setIsInUse(Short isInUse) {
        this.isInUse = isInUse;
    }

    @Column(
        name = "PROTOCOL_ID"
    )
    public Long getProtocolId() {
        return this.protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    @Column(
        name = "CLASS1_TIME_TAG"
    )
    public Timestamp getClass1TimeTag() {
        return this.class1TimeTag;
    }

    public void setClass1TimeTag(Timestamp class1TimeTag) {
        this.class1TimeTag = class1TimeTag;
    }

    @Column(
        name = "CLASS2_TIME_TAG"
    )
    public Timestamp getClass2TimeTag() {
        return this.class2TimeTag;
    }

    public void setClass2TimeTag(Timestamp class2TimeTag) {
        this.class2TimeTag = class2TimeTag;
    }

    @Column(
        name = "CLASS3_TIME_TAG"
    )
    public Timestamp getClass3TimeTag() {
        return this.class3TimeTag;
    }

    public void setClass3TimeTag(Timestamp class3TimeTag) {
        this.class3TimeTag = class3TimeTag;
    }

    @Column(
        name = "CLASS4_TIME_TAG"
    )
    public Timestamp getClass4TimeTag() {
        return this.class4TimeTag;
    }

    public void setClass4TimeTag(Timestamp class4TimeTag) {
        this.class4TimeTag = class4TimeTag;
    }

    @Column(
        name = "CLASS5_TIME_TAG"
    )
    public Timestamp getClass5TimeTag() {
        return this.class5TimeTag;
    }

    public void setClass5TimeTag(Timestamp class5TimeTag) {
        this.class5TimeTag = class5TimeTag;
    }

    @Column(
        name = "CLASS6_TIME_TAG"
    )
    public Timestamp getClass6TimeTag() {
        return this.class6TimeTag;
    }

    public void setClass6TimeTag(Timestamp class6TimeTag) {
        this.class6TimeTag = class6TimeTag;
    }

    @Column(
        name = "CLASS7_TIME_TAG"
    )
    public Timestamp getClass7TimeTag() {
        return this.class7TimeTag;
    }

    public void setClass7TimeTag(Timestamp class7TimeTag) {
        this.class7TimeTag = class7TimeTag;
    }

    @Column(
        name = "CLASS8_TIME_TAG"
    )
    public Timestamp getClass8TimeTag() {
        return this.class8TimeTag;
    }

    public void setClass8TimeTag(Timestamp class8TimeTag) {
        this.class8TimeTag = class8TimeTag;
    }

    @Column(
        name = "CLASS9_TIME_TAG"
    )
    public Timestamp getClass9TimeTag() {
        return this.class9TimeTag;
    }

    public void setClass9TimeTag(Timestamp class9TimeTag) {
        this.class9TimeTag = class9TimeTag;
    }

    @Column(
        name = "CLASS10_TIME_TAG"
    )
    public Timestamp getClass10TimeTag() {
        return this.class10TimeTag;
    }

    public void setClass10TimeTag(Timestamp class10TimeTag) {
        this.class10TimeTag = class10TimeTag;
    }
}