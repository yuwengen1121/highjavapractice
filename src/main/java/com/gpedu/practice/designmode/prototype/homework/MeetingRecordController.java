
package com.gpedu.practice.designmode.prototype.homework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author : Heavin
 * @Des : 会议考勤记录
 * @Date :  9:14  2018/11/13
 */
//利用原型模式，重构一段业务代码
//重构前，业务层需要的对象，是new出来，一个一个设置的
//重构后。利用 BeanUtils.copyProperties 复制来自全端传来的对象属性。这里要注意的是BeanUtils.copyProperties是浅克隆，
//引用型属性处理需要特别注意，因为克隆的是引用类型的地址。


@RestController
@RequestMapping(value = "/meeting")
public class MeetingRecordController  {

  //  @Autowired
  //  private MeetingService meetingService;


    @RequestMapping(value = "/addMeetingRecord", method = RequestMethod.POST)
    public Object addMeetingRecord(@RequestBody MeetingRecordP meetingRecordP) {

        if (StringUtils.isEmpty(meetingRecordP.getServiceItemCode())) {
            throw new RuntimeException("服务项目不能为空");
        }
        if (null == meetingRecordP.getMeetingType()) {
            throw new RuntimeException("会议类型不能为空");
        }
        if (StringUtils.isEmpty(meetingRecordP.getMeetingStar())) {
            throw new RuntimeException("会议星级不能为空");
        }
        if (StringUtils.isEmpty(meetingRecordP.getMeetingTopic())) {
            throw new RuntimeException("会议主题不能为空");
        }
        if (null == meetingRecordP.getMeetingDate()) {
            throw new RuntimeException("会议时间不能为空");
        }
        if (meetingRecordP.getMeetingTopic().length() > 500) {
            throw new RuntimeException("会议主题不能超过500字");
        }
        //重构前
        MeetingRecord meetingRecordInsert = new MeetingRecord();
        meetingRecordInsert.setServiceItemCode(meetingRecordP.getServiceItemCode());
        meetingRecordInsert.setMeetingType(meetingRecordP.getMeetingType());
        meetingRecordInsert.setMeetingDate(meetingRecordP.getMeetingDate());
        meetingRecordInsert.setMeetingStar(meetingRecordP.getMeetingStar());
        meetingRecordInsert.setMeetingTopic(meetingRecordP.getMeetingTopic());
        meetingRecordInsert.setStaffIds(meetingRecordP.getStaffIds());


        //重构后
        MeetingRecord meetingRecord = new MeetingRecord();
        BeanUtils.copyProperties(meetingRecordP, meetingRecord);

     //   int result = meetingService.createMeetingRecord(meetingRecord);
        return "success";

    }




}

