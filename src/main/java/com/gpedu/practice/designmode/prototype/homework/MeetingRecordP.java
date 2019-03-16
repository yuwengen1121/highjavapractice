package com.gpedu.practice.designmode.prototype.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingRecordP {

    private Integer meetingRecordId;

    private String serviceItemCode;

    private Integer meetingType;

    private Date meetingDate;

    private String meetingStar;

    private String meetingTopic;

    private Set<Integer> staffIds;

}