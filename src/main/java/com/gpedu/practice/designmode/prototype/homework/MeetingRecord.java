package com.gpedu.practice.designmode.prototype.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingRecord {
    private Integer meetingRecordId;

    private String serviceItemCode;

    private Integer meetingType;

    private Date meetingDate;

    private String meetingStar;

    private String meetingTopic;

    private Integer createUserId;

    private Date createTime;

    private Integer updateUserId;

    private Date updateTime;

    private Integer storeId;

    private Integer parentStoreId;

    private Integer valid;

    private String serviceItemName;

    private Set<Integer> staffIds;

    private String staffNames;


}