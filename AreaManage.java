# hotelcivil
package com.bjcsi.hotelcivil.bean.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 辖区区划管理表
 */

@Data
@Entity
@Table(name = "t_areaManage")
public class AreaManage {

    @Id
    @GeneratedValue
    private Long id;

    private Long areaPid;            //父ID

    @Column(nullable = false, length = 64)
    private String companyName;     //单位名称

    @Column(nullable = false, length = 32)
    private String companyId;       //单位编号

    @Column(length = 64)
    private String underCompany;    //所属单位

    @Column(nullable = false, length = 64)
    private String companyPerson;   //单位负责人

    @Column(nullable = false, length = 32)
    private String areaId;          //行政区划编号

    @Column(nullable = false, length = 32)
    private String telephone;       //联系电话

    @Column(nullable = false, length = 32)
    private String createTime;      //时间

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<PushUser> pushUsers;

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<PushMsg> pushMsgs;

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<HotelInfo> hotelInfos;

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<PersonCompare> personCompares;

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<Notes> notes;

    @OneToMany(mappedBy = "areaManage", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<WarnSet> warnSets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaPid() {
        return areaPid;
    }

    public void setAreaPid(Long areaPid) {
        this.areaPid = areaPid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUnderCompany() {
        return underCompany;
    }

    public void setUnderCompany(String underCompany) {
        this.underCompany = underCompany;
    }

    public String getCompanyPerson() {
        return companyPerson;
    }

    public void setCompanyPerson(String companyPerson) {
        this.companyPerson = companyPerson;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<PushUser> getPushUsers() {
        return pushUsers;
    }

    public void setPushUsers(List<PushUser> pushUsers) {
        this.pushUsers = pushUsers;
    }

    public List<PushMsg> getPushMsgs() {
        return pushMsgs;
    }

    public void setPushMsgs(List<PushMsg> pushMsgs) {
        this.pushMsgs = pushMsgs;
    }

    public List<HotelInfo> getHotelInfos() {
        return hotelInfos;
    }

    public void setHotelInfos(List<HotelInfo> hotelInfos) {
        this.hotelInfos = hotelInfos;
    }

    public List<PersonCompare> getPersonCompares() {
        return personCompares;
    }

    public void setPersonCompares(List<PersonCompare> personCompares) {
        this.personCompares = personCompares;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public List<WarnSet> getWarnSets() {
        return warnSets;
    }

    public void setWarnSets(List<WarnSet> warnSets) {
        this.warnSets = warnSets;
    }

    @Override
    public String toString() {
        return "AreaManage{" +
                "id=" + id +
                ", areaPid=" + areaPid +
                ", companyName='" + companyName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", underCompany='" + underCompany + '\'' +
                ", companyPerson='" + companyPerson + '\'' +
                ", areaId='" + areaId + '\'' +
                ", telephone='" + telephone + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
