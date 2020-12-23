// ORM class for table 'tblnz_cassafeworkplan'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:18:26 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tblnz_cassafeworkplan extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrPlanPreparedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrPlanPreparedBy = (String)value;
      }
    });
    setters.put("fstrPlanReviewedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrPlanReviewedBy = (String)value;
      }
    });
    setters.put("fdtmPreparedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fdtmPreparedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReviewedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fdtmReviewedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBehaviour", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrBehaviour = (String)value;
      }
    });
    setters.put("fblnInPersonMeeting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnInPersonMeeting = (Integer)value;
      }
    });
    setters.put("fblnViaPhoneOrLetter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnViaPhoneOrLetter = (Integer)value;
      }
    });
    setters.put("fstrMeetingPlace", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrMeetingPlace = (String)value;
      }
    });
    setters.put("fstrWhoAttendsTheMeeting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrWhoAttendsTheMeeting = (String)value;
      }
    });
    setters.put("fdtmMeetingDateTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fdtmMeetingDateTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnMobileCoverage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnMobileCoverage = (Integer)value;
      }
    });
    setters.put("fblnCustomerConcers", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnCustomerConcers = (Integer)value;
      }
    });
    setters.put("fblnTwoIRStaff", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnTwoIRStaff = (Integer)value;
      }
    });
    setters.put("fblnOtherBookingCancelled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnOtherBookingCancelled = (Integer)value;
      }
    });
    setters.put("fblnDuressTeam", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnDuressTeam = (Integer)value;
      }
    });
    setters.put("fblnSecurityGuard", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnSecurityGuard = (Integer)value;
      }
    });
    setters.put("fblnFurtherIncidents", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnFurtherIncidents = (Integer)value;
      }
    });
    setters.put("fblnCurrentCstRisk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fblnCurrentCstRisk = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassafeworkplan.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_cassafeworkplan() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_cassafeworkplan with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrPlanPreparedBy;
  public String get_fstrPlanPreparedBy() {
    return fstrPlanPreparedBy;
  }
  public void set_fstrPlanPreparedBy(String fstrPlanPreparedBy) {
    this.fstrPlanPreparedBy = fstrPlanPreparedBy;
  }
  public tblnz_cassafeworkplan with_fstrPlanPreparedBy(String fstrPlanPreparedBy) {
    this.fstrPlanPreparedBy = fstrPlanPreparedBy;
    return this;
  }
  private String fstrPlanReviewedBy;
  public String get_fstrPlanReviewedBy() {
    return fstrPlanReviewedBy;
  }
  public void set_fstrPlanReviewedBy(String fstrPlanReviewedBy) {
    this.fstrPlanReviewedBy = fstrPlanReviewedBy;
  }
  public tblnz_cassafeworkplan with_fstrPlanReviewedBy(String fstrPlanReviewedBy) {
    this.fstrPlanReviewedBy = fstrPlanReviewedBy;
    return this;
  }
  private java.sql.Timestamp fdtmPreparedDate;
  public java.sql.Timestamp get_fdtmPreparedDate() {
    return fdtmPreparedDate;
  }
  public void set_fdtmPreparedDate(java.sql.Timestamp fdtmPreparedDate) {
    this.fdtmPreparedDate = fdtmPreparedDate;
  }
  public tblnz_cassafeworkplan with_fdtmPreparedDate(java.sql.Timestamp fdtmPreparedDate) {
    this.fdtmPreparedDate = fdtmPreparedDate;
    return this;
  }
  private java.sql.Timestamp fdtmReviewedDate;
  public java.sql.Timestamp get_fdtmReviewedDate() {
    return fdtmReviewedDate;
  }
  public void set_fdtmReviewedDate(java.sql.Timestamp fdtmReviewedDate) {
    this.fdtmReviewedDate = fdtmReviewedDate;
  }
  public tblnz_cassafeworkplan with_fdtmReviewedDate(java.sql.Timestamp fdtmReviewedDate) {
    this.fdtmReviewedDate = fdtmReviewedDate;
    return this;
  }
  private String fstrBehaviour;
  public String get_fstrBehaviour() {
    return fstrBehaviour;
  }
  public void set_fstrBehaviour(String fstrBehaviour) {
    this.fstrBehaviour = fstrBehaviour;
  }
  public tblnz_cassafeworkplan with_fstrBehaviour(String fstrBehaviour) {
    this.fstrBehaviour = fstrBehaviour;
    return this;
  }
  private Integer fblnInPersonMeeting;
  public Integer get_fblnInPersonMeeting() {
    return fblnInPersonMeeting;
  }
  public void set_fblnInPersonMeeting(Integer fblnInPersonMeeting) {
    this.fblnInPersonMeeting = fblnInPersonMeeting;
  }
  public tblnz_cassafeworkplan with_fblnInPersonMeeting(Integer fblnInPersonMeeting) {
    this.fblnInPersonMeeting = fblnInPersonMeeting;
    return this;
  }
  private Integer fblnViaPhoneOrLetter;
  public Integer get_fblnViaPhoneOrLetter() {
    return fblnViaPhoneOrLetter;
  }
  public void set_fblnViaPhoneOrLetter(Integer fblnViaPhoneOrLetter) {
    this.fblnViaPhoneOrLetter = fblnViaPhoneOrLetter;
  }
  public tblnz_cassafeworkplan with_fblnViaPhoneOrLetter(Integer fblnViaPhoneOrLetter) {
    this.fblnViaPhoneOrLetter = fblnViaPhoneOrLetter;
    return this;
  }
  private String fstrMeetingPlace;
  public String get_fstrMeetingPlace() {
    return fstrMeetingPlace;
  }
  public void set_fstrMeetingPlace(String fstrMeetingPlace) {
    this.fstrMeetingPlace = fstrMeetingPlace;
  }
  public tblnz_cassafeworkplan with_fstrMeetingPlace(String fstrMeetingPlace) {
    this.fstrMeetingPlace = fstrMeetingPlace;
    return this;
  }
  private String fstrWhoAttendsTheMeeting;
  public String get_fstrWhoAttendsTheMeeting() {
    return fstrWhoAttendsTheMeeting;
  }
  public void set_fstrWhoAttendsTheMeeting(String fstrWhoAttendsTheMeeting) {
    this.fstrWhoAttendsTheMeeting = fstrWhoAttendsTheMeeting;
  }
  public tblnz_cassafeworkplan with_fstrWhoAttendsTheMeeting(String fstrWhoAttendsTheMeeting) {
    this.fstrWhoAttendsTheMeeting = fstrWhoAttendsTheMeeting;
    return this;
  }
  private java.sql.Timestamp fdtmMeetingDateTime;
  public java.sql.Timestamp get_fdtmMeetingDateTime() {
    return fdtmMeetingDateTime;
  }
  public void set_fdtmMeetingDateTime(java.sql.Timestamp fdtmMeetingDateTime) {
    this.fdtmMeetingDateTime = fdtmMeetingDateTime;
  }
  public tblnz_cassafeworkplan with_fdtmMeetingDateTime(java.sql.Timestamp fdtmMeetingDateTime) {
    this.fdtmMeetingDateTime = fdtmMeetingDateTime;
    return this;
  }
  private Integer fblnMobileCoverage;
  public Integer get_fblnMobileCoverage() {
    return fblnMobileCoverage;
  }
  public void set_fblnMobileCoverage(Integer fblnMobileCoverage) {
    this.fblnMobileCoverage = fblnMobileCoverage;
  }
  public tblnz_cassafeworkplan with_fblnMobileCoverage(Integer fblnMobileCoverage) {
    this.fblnMobileCoverage = fblnMobileCoverage;
    return this;
  }
  private Integer fblnCustomerConcers;
  public Integer get_fblnCustomerConcers() {
    return fblnCustomerConcers;
  }
  public void set_fblnCustomerConcers(Integer fblnCustomerConcers) {
    this.fblnCustomerConcers = fblnCustomerConcers;
  }
  public tblnz_cassafeworkplan with_fblnCustomerConcers(Integer fblnCustomerConcers) {
    this.fblnCustomerConcers = fblnCustomerConcers;
    return this;
  }
  private Integer fblnTwoIRStaff;
  public Integer get_fblnTwoIRStaff() {
    return fblnTwoIRStaff;
  }
  public void set_fblnTwoIRStaff(Integer fblnTwoIRStaff) {
    this.fblnTwoIRStaff = fblnTwoIRStaff;
  }
  public tblnz_cassafeworkplan with_fblnTwoIRStaff(Integer fblnTwoIRStaff) {
    this.fblnTwoIRStaff = fblnTwoIRStaff;
    return this;
  }
  private Integer fblnOtherBookingCancelled;
  public Integer get_fblnOtherBookingCancelled() {
    return fblnOtherBookingCancelled;
  }
  public void set_fblnOtherBookingCancelled(Integer fblnOtherBookingCancelled) {
    this.fblnOtherBookingCancelled = fblnOtherBookingCancelled;
  }
  public tblnz_cassafeworkplan with_fblnOtherBookingCancelled(Integer fblnOtherBookingCancelled) {
    this.fblnOtherBookingCancelled = fblnOtherBookingCancelled;
    return this;
  }
  private Integer fblnDuressTeam;
  public Integer get_fblnDuressTeam() {
    return fblnDuressTeam;
  }
  public void set_fblnDuressTeam(Integer fblnDuressTeam) {
    this.fblnDuressTeam = fblnDuressTeam;
  }
  public tblnz_cassafeworkplan with_fblnDuressTeam(Integer fblnDuressTeam) {
    this.fblnDuressTeam = fblnDuressTeam;
    return this;
  }
  private Integer fblnSecurityGuard;
  public Integer get_fblnSecurityGuard() {
    return fblnSecurityGuard;
  }
  public void set_fblnSecurityGuard(Integer fblnSecurityGuard) {
    this.fblnSecurityGuard = fblnSecurityGuard;
  }
  public tblnz_cassafeworkplan with_fblnSecurityGuard(Integer fblnSecurityGuard) {
    this.fblnSecurityGuard = fblnSecurityGuard;
    return this;
  }
  private Integer fblnFurtherIncidents;
  public Integer get_fblnFurtherIncidents() {
    return fblnFurtherIncidents;
  }
  public void set_fblnFurtherIncidents(Integer fblnFurtherIncidents) {
    this.fblnFurtherIncidents = fblnFurtherIncidents;
  }
  public tblnz_cassafeworkplan with_fblnFurtherIncidents(Integer fblnFurtherIncidents) {
    this.fblnFurtherIncidents = fblnFurtherIncidents;
    return this;
  }
  private Integer fblnCurrentCstRisk;
  public Integer get_fblnCurrentCstRisk() {
    return fblnCurrentCstRisk;
  }
  public void set_fblnCurrentCstRisk(Integer fblnCurrentCstRisk) {
    this.fblnCurrentCstRisk = fblnCurrentCstRisk;
  }
  public tblnz_cassafeworkplan with_fblnCurrentCstRisk(Integer fblnCurrentCstRisk) {
    this.fblnCurrentCstRisk = fblnCurrentCstRisk;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_cassafeworkplan with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblnz_cassafeworkplan with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassafeworkplan)) {
      return false;
    }
    tblnz_cassafeworkplan that = (tblnz_cassafeworkplan) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrPlanPreparedBy == null ? that.fstrPlanPreparedBy == null : this.fstrPlanPreparedBy.equals(that.fstrPlanPreparedBy));
    equal = equal && (this.fstrPlanReviewedBy == null ? that.fstrPlanReviewedBy == null : this.fstrPlanReviewedBy.equals(that.fstrPlanReviewedBy));
    equal = equal && (this.fdtmPreparedDate == null ? that.fdtmPreparedDate == null : this.fdtmPreparedDate.equals(that.fdtmPreparedDate));
    equal = equal && (this.fdtmReviewedDate == null ? that.fdtmReviewedDate == null : this.fdtmReviewedDate.equals(that.fdtmReviewedDate));
    equal = equal && (this.fstrBehaviour == null ? that.fstrBehaviour == null : this.fstrBehaviour.equals(that.fstrBehaviour));
    equal = equal && (this.fblnInPersonMeeting == null ? that.fblnInPersonMeeting == null : this.fblnInPersonMeeting.equals(that.fblnInPersonMeeting));
    equal = equal && (this.fblnViaPhoneOrLetter == null ? that.fblnViaPhoneOrLetter == null : this.fblnViaPhoneOrLetter.equals(that.fblnViaPhoneOrLetter));
    equal = equal && (this.fstrMeetingPlace == null ? that.fstrMeetingPlace == null : this.fstrMeetingPlace.equals(that.fstrMeetingPlace));
    equal = equal && (this.fstrWhoAttendsTheMeeting == null ? that.fstrWhoAttendsTheMeeting == null : this.fstrWhoAttendsTheMeeting.equals(that.fstrWhoAttendsTheMeeting));
    equal = equal && (this.fdtmMeetingDateTime == null ? that.fdtmMeetingDateTime == null : this.fdtmMeetingDateTime.equals(that.fdtmMeetingDateTime));
    equal = equal && (this.fblnMobileCoverage == null ? that.fblnMobileCoverage == null : this.fblnMobileCoverage.equals(that.fblnMobileCoverage));
    equal = equal && (this.fblnCustomerConcers == null ? that.fblnCustomerConcers == null : this.fblnCustomerConcers.equals(that.fblnCustomerConcers));
    equal = equal && (this.fblnTwoIRStaff == null ? that.fblnTwoIRStaff == null : this.fblnTwoIRStaff.equals(that.fblnTwoIRStaff));
    equal = equal && (this.fblnOtherBookingCancelled == null ? that.fblnOtherBookingCancelled == null : this.fblnOtherBookingCancelled.equals(that.fblnOtherBookingCancelled));
    equal = equal && (this.fblnDuressTeam == null ? that.fblnDuressTeam == null : this.fblnDuressTeam.equals(that.fblnDuressTeam));
    equal = equal && (this.fblnSecurityGuard == null ? that.fblnSecurityGuard == null : this.fblnSecurityGuard.equals(that.fblnSecurityGuard));
    equal = equal && (this.fblnFurtherIncidents == null ? that.fblnFurtherIncidents == null : this.fblnFurtherIncidents.equals(that.fblnFurtherIncidents));
    equal = equal && (this.fblnCurrentCstRisk == null ? that.fblnCurrentCstRisk == null : this.fblnCurrentCstRisk.equals(that.fblnCurrentCstRisk));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassafeworkplan)) {
      return false;
    }
    tblnz_cassafeworkplan that = (tblnz_cassafeworkplan) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrPlanPreparedBy == null ? that.fstrPlanPreparedBy == null : this.fstrPlanPreparedBy.equals(that.fstrPlanPreparedBy));
    equal = equal && (this.fstrPlanReviewedBy == null ? that.fstrPlanReviewedBy == null : this.fstrPlanReviewedBy.equals(that.fstrPlanReviewedBy));
    equal = equal && (this.fdtmPreparedDate == null ? that.fdtmPreparedDate == null : this.fdtmPreparedDate.equals(that.fdtmPreparedDate));
    equal = equal && (this.fdtmReviewedDate == null ? that.fdtmReviewedDate == null : this.fdtmReviewedDate.equals(that.fdtmReviewedDate));
    equal = equal && (this.fstrBehaviour == null ? that.fstrBehaviour == null : this.fstrBehaviour.equals(that.fstrBehaviour));
    equal = equal && (this.fblnInPersonMeeting == null ? that.fblnInPersonMeeting == null : this.fblnInPersonMeeting.equals(that.fblnInPersonMeeting));
    equal = equal && (this.fblnViaPhoneOrLetter == null ? that.fblnViaPhoneOrLetter == null : this.fblnViaPhoneOrLetter.equals(that.fblnViaPhoneOrLetter));
    equal = equal && (this.fstrMeetingPlace == null ? that.fstrMeetingPlace == null : this.fstrMeetingPlace.equals(that.fstrMeetingPlace));
    equal = equal && (this.fstrWhoAttendsTheMeeting == null ? that.fstrWhoAttendsTheMeeting == null : this.fstrWhoAttendsTheMeeting.equals(that.fstrWhoAttendsTheMeeting));
    equal = equal && (this.fdtmMeetingDateTime == null ? that.fdtmMeetingDateTime == null : this.fdtmMeetingDateTime.equals(that.fdtmMeetingDateTime));
    equal = equal && (this.fblnMobileCoverage == null ? that.fblnMobileCoverage == null : this.fblnMobileCoverage.equals(that.fblnMobileCoverage));
    equal = equal && (this.fblnCustomerConcers == null ? that.fblnCustomerConcers == null : this.fblnCustomerConcers.equals(that.fblnCustomerConcers));
    equal = equal && (this.fblnTwoIRStaff == null ? that.fblnTwoIRStaff == null : this.fblnTwoIRStaff.equals(that.fblnTwoIRStaff));
    equal = equal && (this.fblnOtherBookingCancelled == null ? that.fblnOtherBookingCancelled == null : this.fblnOtherBookingCancelled.equals(that.fblnOtherBookingCancelled));
    equal = equal && (this.fblnDuressTeam == null ? that.fblnDuressTeam == null : this.fblnDuressTeam.equals(that.fblnDuressTeam));
    equal = equal && (this.fblnSecurityGuard == null ? that.fblnSecurityGuard == null : this.fblnSecurityGuard.equals(that.fblnSecurityGuard));
    equal = equal && (this.fblnFurtherIncidents == null ? that.fblnFurtherIncidents == null : this.fblnFurtherIncidents.equals(that.fblnFurtherIncidents));
    equal = equal && (this.fblnCurrentCstRisk == null ? that.fblnCurrentCstRisk == null : this.fblnCurrentCstRisk.equals(that.fblnCurrentCstRisk));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrPlanPreparedBy = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrPlanReviewedBy = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmPreparedDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmReviewedDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrBehaviour = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnInPersonMeeting = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnViaPhoneOrLetter = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrMeetingPlace = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrWhoAttendsTheMeeting = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmMeetingDateTime = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnMobileCoverage = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnCustomerConcers = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnTwoIRStaff = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnOtherBookingCancelled = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnDuressTeam = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnSecurityGuard = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnFurtherIncidents = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCurrentCstRisk = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrPlanPreparedBy = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrPlanReviewedBy = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmPreparedDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmReviewedDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrBehaviour = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnInPersonMeeting = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnViaPhoneOrLetter = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrMeetingPlace = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrWhoAttendsTheMeeting = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmMeetingDateTime = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnMobileCoverage = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnCustomerConcers = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnTwoIRStaff = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnOtherBookingCancelled = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnDuressTeam = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnSecurityGuard = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnFurtherIncidents = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCurrentCstRisk = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPlanPreparedBy, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPlanReviewedBy, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPreparedDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReviewedDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBehaviour, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInPersonMeeting, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnViaPhoneOrLetter, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrMeetingPlace, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWhoAttendsTheMeeting, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMeetingDateTime, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileCoverage, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerConcers, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTwoIRStaff, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOtherBookingCancelled, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuressTeam, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurityGuard, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFurtherIncidents, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCurrentCstRisk, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPlanPreparedBy, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPlanReviewedBy, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPreparedDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReviewedDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBehaviour, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInPersonMeeting, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnViaPhoneOrLetter, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrMeetingPlace, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWhoAttendsTheMeeting, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMeetingDateTime, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileCoverage, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerConcers, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTwoIRStaff, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOtherBookingCancelled, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuressTeam, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurityGuard, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFurtherIncidents, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCurrentCstRisk, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPlanPreparedBy = null;
    } else {
    this.fstrPlanPreparedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPlanReviewedBy = null;
    } else {
    this.fstrPlanReviewedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPreparedDate = null;
    } else {
    this.fdtmPreparedDate = new Timestamp(__dataIn.readLong());
    this.fdtmPreparedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReviewedDate = null;
    } else {
    this.fdtmReviewedDate = new Timestamp(__dataIn.readLong());
    this.fdtmReviewedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBehaviour = null;
    } else {
    this.fstrBehaviour = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInPersonMeeting = null;
    } else {
    this.fblnInPersonMeeting = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnViaPhoneOrLetter = null;
    } else {
    this.fblnViaPhoneOrLetter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMeetingPlace = null;
    } else {
    this.fstrMeetingPlace = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWhoAttendsTheMeeting = null;
    } else {
    this.fstrWhoAttendsTheMeeting = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmMeetingDateTime = null;
    } else {
    this.fdtmMeetingDateTime = new Timestamp(__dataIn.readLong());
    this.fdtmMeetingDateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMobileCoverage = null;
    } else {
    this.fblnMobileCoverage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCustomerConcers = null;
    } else {
    this.fblnCustomerConcers = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTwoIRStaff = null;
    } else {
    this.fblnTwoIRStaff = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOtherBookingCancelled = null;
    } else {
    this.fblnOtherBookingCancelled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDuressTeam = null;
    } else {
    this.fblnDuressTeam = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSecurityGuard = null;
    } else {
    this.fblnSecurityGuard = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFurtherIncidents = null;
    } else {
    this.fblnFurtherIncidents = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCurrentCstRisk = null;
    } else {
    this.fblnCurrentCstRisk = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrPlanPreparedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPlanPreparedBy);
    }
    if (null == this.fstrPlanReviewedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPlanReviewedBy);
    }
    if (null == this.fdtmPreparedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPreparedDate.getTime());
    __dataOut.writeInt(this.fdtmPreparedDate.getNanos());
    }
    if (null == this.fdtmReviewedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReviewedDate.getTime());
    __dataOut.writeInt(this.fdtmReviewedDate.getNanos());
    }
    if (null == this.fstrBehaviour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBehaviour);
    }
    if (null == this.fblnInPersonMeeting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInPersonMeeting);
    }
    if (null == this.fblnViaPhoneOrLetter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnViaPhoneOrLetter);
    }
    if (null == this.fstrMeetingPlace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMeetingPlace);
    }
    if (null == this.fstrWhoAttendsTheMeeting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWhoAttendsTheMeeting);
    }
    if (null == this.fdtmMeetingDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMeetingDateTime.getTime());
    __dataOut.writeInt(this.fdtmMeetingDateTime.getNanos());
    }
    if (null == this.fblnMobileCoverage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileCoverage);
    }
    if (null == this.fblnCustomerConcers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerConcers);
    }
    if (null == this.fblnTwoIRStaff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTwoIRStaff);
    }
    if (null == this.fblnOtherBookingCancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOtherBookingCancelled);
    }
    if (null == this.fblnDuressTeam) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuressTeam);
    }
    if (null == this.fblnSecurityGuard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurityGuard);
    }
    if (null == this.fblnFurtherIncidents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFurtherIncidents);
    }
    if (null == this.fblnCurrentCstRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCurrentCstRisk);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrPlanPreparedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPlanPreparedBy);
    }
    if (null == this.fstrPlanReviewedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPlanReviewedBy);
    }
    if (null == this.fdtmPreparedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPreparedDate.getTime());
    __dataOut.writeInt(this.fdtmPreparedDate.getNanos());
    }
    if (null == this.fdtmReviewedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReviewedDate.getTime());
    __dataOut.writeInt(this.fdtmReviewedDate.getNanos());
    }
    if (null == this.fstrBehaviour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBehaviour);
    }
    if (null == this.fblnInPersonMeeting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInPersonMeeting);
    }
    if (null == this.fblnViaPhoneOrLetter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnViaPhoneOrLetter);
    }
    if (null == this.fstrMeetingPlace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMeetingPlace);
    }
    if (null == this.fstrWhoAttendsTheMeeting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWhoAttendsTheMeeting);
    }
    if (null == this.fdtmMeetingDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMeetingDateTime.getTime());
    __dataOut.writeInt(this.fdtmMeetingDateTime.getNanos());
    }
    if (null == this.fblnMobileCoverage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileCoverage);
    }
    if (null == this.fblnCustomerConcers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerConcers);
    }
    if (null == this.fblnTwoIRStaff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTwoIRStaff);
    }
    if (null == this.fblnOtherBookingCancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOtherBookingCancelled);
    }
    if (null == this.fblnDuressTeam) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuressTeam);
    }
    if (null == this.fblnSecurityGuard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurityGuard);
    }
    if (null == this.fblnFurtherIncidents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFurtherIncidents);
    }
    if (null == this.fblnCurrentCstRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCurrentCstRisk);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPlanPreparedBy==null?"\\N":fstrPlanPreparedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPlanReviewedBy==null?"\\N":fstrPlanReviewedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPreparedDate==null?"\\N":"" + fdtmPreparedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReviewedDate==null?"\\N":"" + fdtmReviewedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBehaviour==null?"\\N":fstrBehaviour, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInPersonMeeting==null?"\\N":"" + fblnInPersonMeeting, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnViaPhoneOrLetter==null?"\\N":"" + fblnViaPhoneOrLetter, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMeetingPlace==null?"\\N":fstrMeetingPlace, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWhoAttendsTheMeeting==null?"\\N":fstrWhoAttendsTheMeeting, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMeetingDateTime==null?"\\N":"" + fdtmMeetingDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileCoverage==null?"\\N":"" + fblnMobileCoverage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerConcers==null?"\\N":"" + fblnCustomerConcers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTwoIRStaff==null?"\\N":"" + fblnTwoIRStaff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOtherBookingCancelled==null?"\\N":"" + fblnOtherBookingCancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuressTeam==null?"\\N":"" + fblnDuressTeam, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurityGuard==null?"\\N":"" + fblnSecurityGuard, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFurtherIncidents==null?"\\N":"" + fblnFurtherIncidents, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCurrentCstRisk==null?"\\N":"" + fblnCurrentCstRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPlanPreparedBy==null?"\\N":fstrPlanPreparedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPlanReviewedBy==null?"\\N":fstrPlanReviewedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPreparedDate==null?"\\N":"" + fdtmPreparedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReviewedDate==null?"\\N":"" + fdtmReviewedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBehaviour==null?"\\N":fstrBehaviour, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInPersonMeeting==null?"\\N":"" + fblnInPersonMeeting, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnViaPhoneOrLetter==null?"\\N":"" + fblnViaPhoneOrLetter, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMeetingPlace==null?"\\N":fstrMeetingPlace, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWhoAttendsTheMeeting==null?"\\N":fstrWhoAttendsTheMeeting, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMeetingDateTime==null?"\\N":"" + fdtmMeetingDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileCoverage==null?"\\N":"" + fblnMobileCoverage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerConcers==null?"\\N":"" + fblnCustomerConcers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTwoIRStaff==null?"\\N":"" + fblnTwoIRStaff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOtherBookingCancelled==null?"\\N":"" + fblnOtherBookingCancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuressTeam==null?"\\N":"" + fblnDuressTeam, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurityGuard==null?"\\N":"" + fblnSecurityGuard, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFurtherIncidents==null?"\\N":"" + fblnFurtherIncidents, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCurrentCstRisk==null?"\\N":"" + fblnCurrentCstRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPlanPreparedBy = null; } else {
      this.fstrPlanPreparedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPlanReviewedBy = null; } else {
      this.fstrPlanReviewedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPreparedDate = null; } else {
      this.fdtmPreparedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReviewedDate = null; } else {
      this.fdtmReviewedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBehaviour = null; } else {
      this.fstrBehaviour = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInPersonMeeting = null; } else {
      this.fblnInPersonMeeting = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnViaPhoneOrLetter = null; } else {
      this.fblnViaPhoneOrLetter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMeetingPlace = null; } else {
      this.fstrMeetingPlace = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWhoAttendsTheMeeting = null; } else {
      this.fstrWhoAttendsTheMeeting = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMeetingDateTime = null; } else {
      this.fdtmMeetingDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileCoverage = null; } else {
      this.fblnMobileCoverage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerConcers = null; } else {
      this.fblnCustomerConcers = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTwoIRStaff = null; } else {
      this.fblnTwoIRStaff = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOtherBookingCancelled = null; } else {
      this.fblnOtherBookingCancelled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuressTeam = null; } else {
      this.fblnDuressTeam = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurityGuard = null; } else {
      this.fblnSecurityGuard = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFurtherIncidents = null; } else {
      this.fblnFurtherIncidents = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCurrentCstRisk = null; } else {
      this.fblnCurrentCstRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPlanPreparedBy = null; } else {
      this.fstrPlanPreparedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPlanReviewedBy = null; } else {
      this.fstrPlanReviewedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPreparedDate = null; } else {
      this.fdtmPreparedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReviewedDate = null; } else {
      this.fdtmReviewedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBehaviour = null; } else {
      this.fstrBehaviour = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInPersonMeeting = null; } else {
      this.fblnInPersonMeeting = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnViaPhoneOrLetter = null; } else {
      this.fblnViaPhoneOrLetter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMeetingPlace = null; } else {
      this.fstrMeetingPlace = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWhoAttendsTheMeeting = null; } else {
      this.fstrWhoAttendsTheMeeting = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMeetingDateTime = null; } else {
      this.fdtmMeetingDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileCoverage = null; } else {
      this.fblnMobileCoverage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerConcers = null; } else {
      this.fblnCustomerConcers = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTwoIRStaff = null; } else {
      this.fblnTwoIRStaff = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOtherBookingCancelled = null; } else {
      this.fblnOtherBookingCancelled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuressTeam = null; } else {
      this.fblnDuressTeam = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurityGuard = null; } else {
      this.fblnSecurityGuard = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFurtherIncidents = null; } else {
      this.fblnFurtherIncidents = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCurrentCstRisk = null; } else {
      this.fblnCurrentCstRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_cassafeworkplan o = (tblnz_cassafeworkplan) super.clone();
    o.fdtmPreparedDate = (o.fdtmPreparedDate != null) ? (java.sql.Timestamp) o.fdtmPreparedDate.clone() : null;
    o.fdtmReviewedDate = (o.fdtmReviewedDate != null) ? (java.sql.Timestamp) o.fdtmReviewedDate.clone() : null;
    o.fdtmMeetingDateTime = (o.fdtmMeetingDateTime != null) ? (java.sql.Timestamp) o.fdtmMeetingDateTime.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_cassafeworkplan o) throws CloneNotSupportedException {
    o.fdtmPreparedDate = (o.fdtmPreparedDate != null) ? (java.sql.Timestamp) o.fdtmPreparedDate.clone() : null;
    o.fdtmReviewedDate = (o.fdtmReviewedDate != null) ? (java.sql.Timestamp) o.fdtmReviewedDate.clone() : null;
    o.fdtmMeetingDateTime = (o.fdtmMeetingDateTime != null) ? (java.sql.Timestamp) o.fdtmMeetingDateTime.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrPlanPreparedBy", this.fstrPlanPreparedBy);
    __sqoop$field_map.put("fstrPlanReviewedBy", this.fstrPlanReviewedBy);
    __sqoop$field_map.put("fdtmPreparedDate", this.fdtmPreparedDate);
    __sqoop$field_map.put("fdtmReviewedDate", this.fdtmReviewedDate);
    __sqoop$field_map.put("fstrBehaviour", this.fstrBehaviour);
    __sqoop$field_map.put("fblnInPersonMeeting", this.fblnInPersonMeeting);
    __sqoop$field_map.put("fblnViaPhoneOrLetter", this.fblnViaPhoneOrLetter);
    __sqoop$field_map.put("fstrMeetingPlace", this.fstrMeetingPlace);
    __sqoop$field_map.put("fstrWhoAttendsTheMeeting", this.fstrWhoAttendsTheMeeting);
    __sqoop$field_map.put("fdtmMeetingDateTime", this.fdtmMeetingDateTime);
    __sqoop$field_map.put("fblnMobileCoverage", this.fblnMobileCoverage);
    __sqoop$field_map.put("fblnCustomerConcers", this.fblnCustomerConcers);
    __sqoop$field_map.put("fblnTwoIRStaff", this.fblnTwoIRStaff);
    __sqoop$field_map.put("fblnOtherBookingCancelled", this.fblnOtherBookingCancelled);
    __sqoop$field_map.put("fblnDuressTeam", this.fblnDuressTeam);
    __sqoop$field_map.put("fblnSecurityGuard", this.fblnSecurityGuard);
    __sqoop$field_map.put("fblnFurtherIncidents", this.fblnFurtherIncidents);
    __sqoop$field_map.put("fblnCurrentCstRisk", this.fblnCurrentCstRisk);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrPlanPreparedBy", this.fstrPlanPreparedBy);
    __sqoop$field_map.put("fstrPlanReviewedBy", this.fstrPlanReviewedBy);
    __sqoop$field_map.put("fdtmPreparedDate", this.fdtmPreparedDate);
    __sqoop$field_map.put("fdtmReviewedDate", this.fdtmReviewedDate);
    __sqoop$field_map.put("fstrBehaviour", this.fstrBehaviour);
    __sqoop$field_map.put("fblnInPersonMeeting", this.fblnInPersonMeeting);
    __sqoop$field_map.put("fblnViaPhoneOrLetter", this.fblnViaPhoneOrLetter);
    __sqoop$field_map.put("fstrMeetingPlace", this.fstrMeetingPlace);
    __sqoop$field_map.put("fstrWhoAttendsTheMeeting", this.fstrWhoAttendsTheMeeting);
    __sqoop$field_map.put("fdtmMeetingDateTime", this.fdtmMeetingDateTime);
    __sqoop$field_map.put("fblnMobileCoverage", this.fblnMobileCoverage);
    __sqoop$field_map.put("fblnCustomerConcers", this.fblnCustomerConcers);
    __sqoop$field_map.put("fblnTwoIRStaff", this.fblnTwoIRStaff);
    __sqoop$field_map.put("fblnOtherBookingCancelled", this.fblnOtherBookingCancelled);
    __sqoop$field_map.put("fblnDuressTeam", this.fblnDuressTeam);
    __sqoop$field_map.put("fblnSecurityGuard", this.fblnSecurityGuard);
    __sqoop$field_map.put("fblnFurtherIncidents", this.fblnFurtherIncidents);
    __sqoop$field_map.put("fblnCurrentCstRisk", this.fblnCurrentCstRisk);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
