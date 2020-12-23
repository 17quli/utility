// ORM class for table 'tblnz_cassecurityincident'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:34:38 NZDT 2020
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

public class tblnz_cassecurityincident extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrIncidentType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrIncidentType = (String)value;
      }
    });
    setters.put("fdtmIncidentDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fdtmIncidentDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrHowReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrHowReceived = (String)value;
      }
    });
    setters.put("fstrIncidentLocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrIncidentLocation = (String)value;
      }
    });
    setters.put("fstrOfficeLocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrOfficeLocation = (String)value;
      }
    });
    setters.put("fblnOfficeClosure", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnOfficeClosure = (Integer)value;
      }
    });
    setters.put("fstrReportedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrReportedBy = (String)value;
      }
    });
    setters.put("fstrUserPhone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrUserPhone = (String)value;
      }
    });
    setters.put("fblnDamage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnDamage = (Integer)value;
      }
    });
    setters.put("fstrTeamLeader", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrTeamLeader = (String)value;
      }
    });
    setters.put("fstrTeamLeaderPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrTeamLeaderPhoneNumber = (String)value;
      }
    });
    setters.put("fstrTarget", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrTarget = (String)value;
      }
    });
    setters.put("fstrBusinessGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrBusinessGroup = (String)value;
      }
    });
    setters.put("fblnWitnesses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnWitnesses = (Integer)value;
      }
    });
    setters.put("fstrIncidentDetails", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrIncidentDetails = (String)value;
      }
    });
    setters.put("fstrDamageDetails", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrDamageDetails = (String)value;
      }
    });
    setters.put("fstrWitnessDetails", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrWitnessDetails = (String)value;
      }
    });
    setters.put("fblnManagerNotified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnManagerNotified = (Integer)value;
      }
    });
    setters.put("fblnFacilitiesManagementNotifi", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnFacilitiesManagementNotifi = (Integer)value;
      }
    });
    setters.put("fblnHealthAndSafety", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnHealthAndSafety = (Integer)value;
      }
    });
    setters.put("fblnPoliceNotified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnPoliceNotified = (Integer)value;
      }
    });
    setters.put("fdtmPoliceNotifiedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fdtmPoliceNotifiedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPoliceReportReference", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrPoliceReportReference = (String)value;
      }
    });
    setters.put("fstrPoliceActions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrPoliceActions = (String)value;
      }
    });
    setters.put("fblnStaffDebriefed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnStaffDebriefed = (Integer)value;
      }
    });
    setters.put("fblnLetterIssued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnLetterIssued = (Integer)value;
      }
    });
    setters.put("fblnTrespassNotice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnTrespassNotice = (Integer)value;
      }
    });
    setters.put("fblnOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnOther = (Integer)value;
      }
    });
    setters.put("fblnCorporateCommsNotified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnCorporateCommsNotified = (Integer)value;
      }
    });
    setters.put("fblnAlertNotification", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnAlertNotification = (Integer)value;
      }
    });
    setters.put("fstrCorpSecurityComment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrCorpSecurityComment = (String)value;
      }
    });
    setters.put("fblnThirdPartyContacted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnThirdPartyContacted = (Integer)value;
      }
    });
    setters.put("fblnSecurityRequested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fblnSecurityRequested = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_cassecurityincident.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_cassecurityincident() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_cassecurityincident with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrIncidentType;
  public String get_fstrIncidentType() {
    return fstrIncidentType;
  }
  public void set_fstrIncidentType(String fstrIncidentType) {
    this.fstrIncidentType = fstrIncidentType;
  }
  public tblnz_cassecurityincident with_fstrIncidentType(String fstrIncidentType) {
    this.fstrIncidentType = fstrIncidentType;
    return this;
  }
  private java.sql.Timestamp fdtmIncidentDate;
  public java.sql.Timestamp get_fdtmIncidentDate() {
    return fdtmIncidentDate;
  }
  public void set_fdtmIncidentDate(java.sql.Timestamp fdtmIncidentDate) {
    this.fdtmIncidentDate = fdtmIncidentDate;
  }
  public tblnz_cassecurityincident with_fdtmIncidentDate(java.sql.Timestamp fdtmIncidentDate) {
    this.fdtmIncidentDate = fdtmIncidentDate;
    return this;
  }
  private String fstrHowReceived;
  public String get_fstrHowReceived() {
    return fstrHowReceived;
  }
  public void set_fstrHowReceived(String fstrHowReceived) {
    this.fstrHowReceived = fstrHowReceived;
  }
  public tblnz_cassecurityincident with_fstrHowReceived(String fstrHowReceived) {
    this.fstrHowReceived = fstrHowReceived;
    return this;
  }
  private String fstrIncidentLocation;
  public String get_fstrIncidentLocation() {
    return fstrIncidentLocation;
  }
  public void set_fstrIncidentLocation(String fstrIncidentLocation) {
    this.fstrIncidentLocation = fstrIncidentLocation;
  }
  public tblnz_cassecurityincident with_fstrIncidentLocation(String fstrIncidentLocation) {
    this.fstrIncidentLocation = fstrIncidentLocation;
    return this;
  }
  private String fstrOfficeLocation;
  public String get_fstrOfficeLocation() {
    return fstrOfficeLocation;
  }
  public void set_fstrOfficeLocation(String fstrOfficeLocation) {
    this.fstrOfficeLocation = fstrOfficeLocation;
  }
  public tblnz_cassecurityincident with_fstrOfficeLocation(String fstrOfficeLocation) {
    this.fstrOfficeLocation = fstrOfficeLocation;
    return this;
  }
  private Integer fblnOfficeClosure;
  public Integer get_fblnOfficeClosure() {
    return fblnOfficeClosure;
  }
  public void set_fblnOfficeClosure(Integer fblnOfficeClosure) {
    this.fblnOfficeClosure = fblnOfficeClosure;
  }
  public tblnz_cassecurityincident with_fblnOfficeClosure(Integer fblnOfficeClosure) {
    this.fblnOfficeClosure = fblnOfficeClosure;
    return this;
  }
  private String fstrReportedBy;
  public String get_fstrReportedBy() {
    return fstrReportedBy;
  }
  public void set_fstrReportedBy(String fstrReportedBy) {
    this.fstrReportedBy = fstrReportedBy;
  }
  public tblnz_cassecurityincident with_fstrReportedBy(String fstrReportedBy) {
    this.fstrReportedBy = fstrReportedBy;
    return this;
  }
  private String fstrUserPhone;
  public String get_fstrUserPhone() {
    return fstrUserPhone;
  }
  public void set_fstrUserPhone(String fstrUserPhone) {
    this.fstrUserPhone = fstrUserPhone;
  }
  public tblnz_cassecurityincident with_fstrUserPhone(String fstrUserPhone) {
    this.fstrUserPhone = fstrUserPhone;
    return this;
  }
  private Integer fblnDamage;
  public Integer get_fblnDamage() {
    return fblnDamage;
  }
  public void set_fblnDamage(Integer fblnDamage) {
    this.fblnDamage = fblnDamage;
  }
  public tblnz_cassecurityincident with_fblnDamage(Integer fblnDamage) {
    this.fblnDamage = fblnDamage;
    return this;
  }
  private String fstrTeamLeader;
  public String get_fstrTeamLeader() {
    return fstrTeamLeader;
  }
  public void set_fstrTeamLeader(String fstrTeamLeader) {
    this.fstrTeamLeader = fstrTeamLeader;
  }
  public tblnz_cassecurityincident with_fstrTeamLeader(String fstrTeamLeader) {
    this.fstrTeamLeader = fstrTeamLeader;
    return this;
  }
  private String fstrTeamLeaderPhoneNumber;
  public String get_fstrTeamLeaderPhoneNumber() {
    return fstrTeamLeaderPhoneNumber;
  }
  public void set_fstrTeamLeaderPhoneNumber(String fstrTeamLeaderPhoneNumber) {
    this.fstrTeamLeaderPhoneNumber = fstrTeamLeaderPhoneNumber;
  }
  public tblnz_cassecurityincident with_fstrTeamLeaderPhoneNumber(String fstrTeamLeaderPhoneNumber) {
    this.fstrTeamLeaderPhoneNumber = fstrTeamLeaderPhoneNumber;
    return this;
  }
  private String fstrTarget;
  public String get_fstrTarget() {
    return fstrTarget;
  }
  public void set_fstrTarget(String fstrTarget) {
    this.fstrTarget = fstrTarget;
  }
  public tblnz_cassecurityincident with_fstrTarget(String fstrTarget) {
    this.fstrTarget = fstrTarget;
    return this;
  }
  private String fstrBusinessGroup;
  public String get_fstrBusinessGroup() {
    return fstrBusinessGroup;
  }
  public void set_fstrBusinessGroup(String fstrBusinessGroup) {
    this.fstrBusinessGroup = fstrBusinessGroup;
  }
  public tblnz_cassecurityincident with_fstrBusinessGroup(String fstrBusinessGroup) {
    this.fstrBusinessGroup = fstrBusinessGroup;
    return this;
  }
  private Integer fblnWitnesses;
  public Integer get_fblnWitnesses() {
    return fblnWitnesses;
  }
  public void set_fblnWitnesses(Integer fblnWitnesses) {
    this.fblnWitnesses = fblnWitnesses;
  }
  public tblnz_cassecurityincident with_fblnWitnesses(Integer fblnWitnesses) {
    this.fblnWitnesses = fblnWitnesses;
    return this;
  }
  private String fstrIncidentDetails;
  public String get_fstrIncidentDetails() {
    return fstrIncidentDetails;
  }
  public void set_fstrIncidentDetails(String fstrIncidentDetails) {
    this.fstrIncidentDetails = fstrIncidentDetails;
  }
  public tblnz_cassecurityincident with_fstrIncidentDetails(String fstrIncidentDetails) {
    this.fstrIncidentDetails = fstrIncidentDetails;
    return this;
  }
  private String fstrDamageDetails;
  public String get_fstrDamageDetails() {
    return fstrDamageDetails;
  }
  public void set_fstrDamageDetails(String fstrDamageDetails) {
    this.fstrDamageDetails = fstrDamageDetails;
  }
  public tblnz_cassecurityincident with_fstrDamageDetails(String fstrDamageDetails) {
    this.fstrDamageDetails = fstrDamageDetails;
    return this;
  }
  private String fstrWitnessDetails;
  public String get_fstrWitnessDetails() {
    return fstrWitnessDetails;
  }
  public void set_fstrWitnessDetails(String fstrWitnessDetails) {
    this.fstrWitnessDetails = fstrWitnessDetails;
  }
  public tblnz_cassecurityincident with_fstrWitnessDetails(String fstrWitnessDetails) {
    this.fstrWitnessDetails = fstrWitnessDetails;
    return this;
  }
  private Integer fblnManagerNotified;
  public Integer get_fblnManagerNotified() {
    return fblnManagerNotified;
  }
  public void set_fblnManagerNotified(Integer fblnManagerNotified) {
    this.fblnManagerNotified = fblnManagerNotified;
  }
  public tblnz_cassecurityincident with_fblnManagerNotified(Integer fblnManagerNotified) {
    this.fblnManagerNotified = fblnManagerNotified;
    return this;
  }
  private Integer fblnFacilitiesManagementNotifi;
  public Integer get_fblnFacilitiesManagementNotifi() {
    return fblnFacilitiesManagementNotifi;
  }
  public void set_fblnFacilitiesManagementNotifi(Integer fblnFacilitiesManagementNotifi) {
    this.fblnFacilitiesManagementNotifi = fblnFacilitiesManagementNotifi;
  }
  public tblnz_cassecurityincident with_fblnFacilitiesManagementNotifi(Integer fblnFacilitiesManagementNotifi) {
    this.fblnFacilitiesManagementNotifi = fblnFacilitiesManagementNotifi;
    return this;
  }
  private Integer fblnHealthAndSafety;
  public Integer get_fblnHealthAndSafety() {
    return fblnHealthAndSafety;
  }
  public void set_fblnHealthAndSafety(Integer fblnHealthAndSafety) {
    this.fblnHealthAndSafety = fblnHealthAndSafety;
  }
  public tblnz_cassecurityincident with_fblnHealthAndSafety(Integer fblnHealthAndSafety) {
    this.fblnHealthAndSafety = fblnHealthAndSafety;
    return this;
  }
  private Integer fblnPoliceNotified;
  public Integer get_fblnPoliceNotified() {
    return fblnPoliceNotified;
  }
  public void set_fblnPoliceNotified(Integer fblnPoliceNotified) {
    this.fblnPoliceNotified = fblnPoliceNotified;
  }
  public tblnz_cassecurityincident with_fblnPoliceNotified(Integer fblnPoliceNotified) {
    this.fblnPoliceNotified = fblnPoliceNotified;
    return this;
  }
  private java.sql.Timestamp fdtmPoliceNotifiedDate;
  public java.sql.Timestamp get_fdtmPoliceNotifiedDate() {
    return fdtmPoliceNotifiedDate;
  }
  public void set_fdtmPoliceNotifiedDate(java.sql.Timestamp fdtmPoliceNotifiedDate) {
    this.fdtmPoliceNotifiedDate = fdtmPoliceNotifiedDate;
  }
  public tblnz_cassecurityincident with_fdtmPoliceNotifiedDate(java.sql.Timestamp fdtmPoliceNotifiedDate) {
    this.fdtmPoliceNotifiedDate = fdtmPoliceNotifiedDate;
    return this;
  }
  private String fstrPoliceReportReference;
  public String get_fstrPoliceReportReference() {
    return fstrPoliceReportReference;
  }
  public void set_fstrPoliceReportReference(String fstrPoliceReportReference) {
    this.fstrPoliceReportReference = fstrPoliceReportReference;
  }
  public tblnz_cassecurityincident with_fstrPoliceReportReference(String fstrPoliceReportReference) {
    this.fstrPoliceReportReference = fstrPoliceReportReference;
    return this;
  }
  private String fstrPoliceActions;
  public String get_fstrPoliceActions() {
    return fstrPoliceActions;
  }
  public void set_fstrPoliceActions(String fstrPoliceActions) {
    this.fstrPoliceActions = fstrPoliceActions;
  }
  public tblnz_cassecurityincident with_fstrPoliceActions(String fstrPoliceActions) {
    this.fstrPoliceActions = fstrPoliceActions;
    return this;
  }
  private Integer fblnStaffDebriefed;
  public Integer get_fblnStaffDebriefed() {
    return fblnStaffDebriefed;
  }
  public void set_fblnStaffDebriefed(Integer fblnStaffDebriefed) {
    this.fblnStaffDebriefed = fblnStaffDebriefed;
  }
  public tblnz_cassecurityincident with_fblnStaffDebriefed(Integer fblnStaffDebriefed) {
    this.fblnStaffDebriefed = fblnStaffDebriefed;
    return this;
  }
  private Integer fblnLetterIssued;
  public Integer get_fblnLetterIssued() {
    return fblnLetterIssued;
  }
  public void set_fblnLetterIssued(Integer fblnLetterIssued) {
    this.fblnLetterIssued = fblnLetterIssued;
  }
  public tblnz_cassecurityincident with_fblnLetterIssued(Integer fblnLetterIssued) {
    this.fblnLetterIssued = fblnLetterIssued;
    return this;
  }
  private Integer fblnTrespassNotice;
  public Integer get_fblnTrespassNotice() {
    return fblnTrespassNotice;
  }
  public void set_fblnTrespassNotice(Integer fblnTrespassNotice) {
    this.fblnTrespassNotice = fblnTrespassNotice;
  }
  public tblnz_cassecurityincident with_fblnTrespassNotice(Integer fblnTrespassNotice) {
    this.fblnTrespassNotice = fblnTrespassNotice;
    return this;
  }
  private Integer fblnOther;
  public Integer get_fblnOther() {
    return fblnOther;
  }
  public void set_fblnOther(Integer fblnOther) {
    this.fblnOther = fblnOther;
  }
  public tblnz_cassecurityincident with_fblnOther(Integer fblnOther) {
    this.fblnOther = fblnOther;
    return this;
  }
  private Integer fblnCorporateCommsNotified;
  public Integer get_fblnCorporateCommsNotified() {
    return fblnCorporateCommsNotified;
  }
  public void set_fblnCorporateCommsNotified(Integer fblnCorporateCommsNotified) {
    this.fblnCorporateCommsNotified = fblnCorporateCommsNotified;
  }
  public tblnz_cassecurityincident with_fblnCorporateCommsNotified(Integer fblnCorporateCommsNotified) {
    this.fblnCorporateCommsNotified = fblnCorporateCommsNotified;
    return this;
  }
  private Integer fblnAlertNotification;
  public Integer get_fblnAlertNotification() {
    return fblnAlertNotification;
  }
  public void set_fblnAlertNotification(Integer fblnAlertNotification) {
    this.fblnAlertNotification = fblnAlertNotification;
  }
  public tblnz_cassecurityincident with_fblnAlertNotification(Integer fblnAlertNotification) {
    this.fblnAlertNotification = fblnAlertNotification;
    return this;
  }
  private String fstrCorpSecurityComment;
  public String get_fstrCorpSecurityComment() {
    return fstrCorpSecurityComment;
  }
  public void set_fstrCorpSecurityComment(String fstrCorpSecurityComment) {
    this.fstrCorpSecurityComment = fstrCorpSecurityComment;
  }
  public tblnz_cassecurityincident with_fstrCorpSecurityComment(String fstrCorpSecurityComment) {
    this.fstrCorpSecurityComment = fstrCorpSecurityComment;
    return this;
  }
  private Integer fblnThirdPartyContacted;
  public Integer get_fblnThirdPartyContacted() {
    return fblnThirdPartyContacted;
  }
  public void set_fblnThirdPartyContacted(Integer fblnThirdPartyContacted) {
    this.fblnThirdPartyContacted = fblnThirdPartyContacted;
  }
  public tblnz_cassecurityincident with_fblnThirdPartyContacted(Integer fblnThirdPartyContacted) {
    this.fblnThirdPartyContacted = fblnThirdPartyContacted;
    return this;
  }
  private Integer fblnSecurityRequested;
  public Integer get_fblnSecurityRequested() {
    return fblnSecurityRequested;
  }
  public void set_fblnSecurityRequested(Integer fblnSecurityRequested) {
    this.fblnSecurityRequested = fblnSecurityRequested;
  }
  public tblnz_cassecurityincident with_fblnSecurityRequested(Integer fblnSecurityRequested) {
    this.fblnSecurityRequested = fblnSecurityRequested;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_cassecurityincident with_fstrWho(String fstrWho) {
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
  public tblnz_cassecurityincident with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassecurityincident)) {
      return false;
    }
    tblnz_cassecurityincident that = (tblnz_cassecurityincident) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIncidentType == null ? that.fstrIncidentType == null : this.fstrIncidentType.equals(that.fstrIncidentType));
    equal = equal && (this.fdtmIncidentDate == null ? that.fdtmIncidentDate == null : this.fdtmIncidentDate.equals(that.fdtmIncidentDate));
    equal = equal && (this.fstrHowReceived == null ? that.fstrHowReceived == null : this.fstrHowReceived.equals(that.fstrHowReceived));
    equal = equal && (this.fstrIncidentLocation == null ? that.fstrIncidentLocation == null : this.fstrIncidentLocation.equals(that.fstrIncidentLocation));
    equal = equal && (this.fstrOfficeLocation == null ? that.fstrOfficeLocation == null : this.fstrOfficeLocation.equals(that.fstrOfficeLocation));
    equal = equal && (this.fblnOfficeClosure == null ? that.fblnOfficeClosure == null : this.fblnOfficeClosure.equals(that.fblnOfficeClosure));
    equal = equal && (this.fstrReportedBy == null ? that.fstrReportedBy == null : this.fstrReportedBy.equals(that.fstrReportedBy));
    equal = equal && (this.fstrUserPhone == null ? that.fstrUserPhone == null : this.fstrUserPhone.equals(that.fstrUserPhone));
    equal = equal && (this.fblnDamage == null ? that.fblnDamage == null : this.fblnDamage.equals(that.fblnDamage));
    equal = equal && (this.fstrTeamLeader == null ? that.fstrTeamLeader == null : this.fstrTeamLeader.equals(that.fstrTeamLeader));
    equal = equal && (this.fstrTeamLeaderPhoneNumber == null ? that.fstrTeamLeaderPhoneNumber == null : this.fstrTeamLeaderPhoneNumber.equals(that.fstrTeamLeaderPhoneNumber));
    equal = equal && (this.fstrTarget == null ? that.fstrTarget == null : this.fstrTarget.equals(that.fstrTarget));
    equal = equal && (this.fstrBusinessGroup == null ? that.fstrBusinessGroup == null : this.fstrBusinessGroup.equals(that.fstrBusinessGroup));
    equal = equal && (this.fblnWitnesses == null ? that.fblnWitnesses == null : this.fblnWitnesses.equals(that.fblnWitnesses));
    equal = equal && (this.fstrIncidentDetails == null ? that.fstrIncidentDetails == null : this.fstrIncidentDetails.equals(that.fstrIncidentDetails));
    equal = equal && (this.fstrDamageDetails == null ? that.fstrDamageDetails == null : this.fstrDamageDetails.equals(that.fstrDamageDetails));
    equal = equal && (this.fstrWitnessDetails == null ? that.fstrWitnessDetails == null : this.fstrWitnessDetails.equals(that.fstrWitnessDetails));
    equal = equal && (this.fblnManagerNotified == null ? that.fblnManagerNotified == null : this.fblnManagerNotified.equals(that.fblnManagerNotified));
    equal = equal && (this.fblnFacilitiesManagementNotifi == null ? that.fblnFacilitiesManagementNotifi == null : this.fblnFacilitiesManagementNotifi.equals(that.fblnFacilitiesManagementNotifi));
    equal = equal && (this.fblnHealthAndSafety == null ? that.fblnHealthAndSafety == null : this.fblnHealthAndSafety.equals(that.fblnHealthAndSafety));
    equal = equal && (this.fblnPoliceNotified == null ? that.fblnPoliceNotified == null : this.fblnPoliceNotified.equals(that.fblnPoliceNotified));
    equal = equal && (this.fdtmPoliceNotifiedDate == null ? that.fdtmPoliceNotifiedDate == null : this.fdtmPoliceNotifiedDate.equals(that.fdtmPoliceNotifiedDate));
    equal = equal && (this.fstrPoliceReportReference == null ? that.fstrPoliceReportReference == null : this.fstrPoliceReportReference.equals(that.fstrPoliceReportReference));
    equal = equal && (this.fstrPoliceActions == null ? that.fstrPoliceActions == null : this.fstrPoliceActions.equals(that.fstrPoliceActions));
    equal = equal && (this.fblnStaffDebriefed == null ? that.fblnStaffDebriefed == null : this.fblnStaffDebriefed.equals(that.fblnStaffDebriefed));
    equal = equal && (this.fblnLetterIssued == null ? that.fblnLetterIssued == null : this.fblnLetterIssued.equals(that.fblnLetterIssued));
    equal = equal && (this.fblnTrespassNotice == null ? that.fblnTrespassNotice == null : this.fblnTrespassNotice.equals(that.fblnTrespassNotice));
    equal = equal && (this.fblnOther == null ? that.fblnOther == null : this.fblnOther.equals(that.fblnOther));
    equal = equal && (this.fblnCorporateCommsNotified == null ? that.fblnCorporateCommsNotified == null : this.fblnCorporateCommsNotified.equals(that.fblnCorporateCommsNotified));
    equal = equal && (this.fblnAlertNotification == null ? that.fblnAlertNotification == null : this.fblnAlertNotification.equals(that.fblnAlertNotification));
    equal = equal && (this.fstrCorpSecurityComment == null ? that.fstrCorpSecurityComment == null : this.fstrCorpSecurityComment.equals(that.fstrCorpSecurityComment));
    equal = equal && (this.fblnThirdPartyContacted == null ? that.fblnThirdPartyContacted == null : this.fblnThirdPartyContacted.equals(that.fblnThirdPartyContacted));
    equal = equal && (this.fblnSecurityRequested == null ? that.fblnSecurityRequested == null : this.fblnSecurityRequested.equals(that.fblnSecurityRequested));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_cassecurityincident)) {
      return false;
    }
    tblnz_cassecurityincident that = (tblnz_cassecurityincident) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIncidentType == null ? that.fstrIncidentType == null : this.fstrIncidentType.equals(that.fstrIncidentType));
    equal = equal && (this.fdtmIncidentDate == null ? that.fdtmIncidentDate == null : this.fdtmIncidentDate.equals(that.fdtmIncidentDate));
    equal = equal && (this.fstrHowReceived == null ? that.fstrHowReceived == null : this.fstrHowReceived.equals(that.fstrHowReceived));
    equal = equal && (this.fstrIncidentLocation == null ? that.fstrIncidentLocation == null : this.fstrIncidentLocation.equals(that.fstrIncidentLocation));
    equal = equal && (this.fstrOfficeLocation == null ? that.fstrOfficeLocation == null : this.fstrOfficeLocation.equals(that.fstrOfficeLocation));
    equal = equal && (this.fblnOfficeClosure == null ? that.fblnOfficeClosure == null : this.fblnOfficeClosure.equals(that.fblnOfficeClosure));
    equal = equal && (this.fstrReportedBy == null ? that.fstrReportedBy == null : this.fstrReportedBy.equals(that.fstrReportedBy));
    equal = equal && (this.fstrUserPhone == null ? that.fstrUserPhone == null : this.fstrUserPhone.equals(that.fstrUserPhone));
    equal = equal && (this.fblnDamage == null ? that.fblnDamage == null : this.fblnDamage.equals(that.fblnDamage));
    equal = equal && (this.fstrTeamLeader == null ? that.fstrTeamLeader == null : this.fstrTeamLeader.equals(that.fstrTeamLeader));
    equal = equal && (this.fstrTeamLeaderPhoneNumber == null ? that.fstrTeamLeaderPhoneNumber == null : this.fstrTeamLeaderPhoneNumber.equals(that.fstrTeamLeaderPhoneNumber));
    equal = equal && (this.fstrTarget == null ? that.fstrTarget == null : this.fstrTarget.equals(that.fstrTarget));
    equal = equal && (this.fstrBusinessGroup == null ? that.fstrBusinessGroup == null : this.fstrBusinessGroup.equals(that.fstrBusinessGroup));
    equal = equal && (this.fblnWitnesses == null ? that.fblnWitnesses == null : this.fblnWitnesses.equals(that.fblnWitnesses));
    equal = equal && (this.fstrIncidentDetails == null ? that.fstrIncidentDetails == null : this.fstrIncidentDetails.equals(that.fstrIncidentDetails));
    equal = equal && (this.fstrDamageDetails == null ? that.fstrDamageDetails == null : this.fstrDamageDetails.equals(that.fstrDamageDetails));
    equal = equal && (this.fstrWitnessDetails == null ? that.fstrWitnessDetails == null : this.fstrWitnessDetails.equals(that.fstrWitnessDetails));
    equal = equal && (this.fblnManagerNotified == null ? that.fblnManagerNotified == null : this.fblnManagerNotified.equals(that.fblnManagerNotified));
    equal = equal && (this.fblnFacilitiesManagementNotifi == null ? that.fblnFacilitiesManagementNotifi == null : this.fblnFacilitiesManagementNotifi.equals(that.fblnFacilitiesManagementNotifi));
    equal = equal && (this.fblnHealthAndSafety == null ? that.fblnHealthAndSafety == null : this.fblnHealthAndSafety.equals(that.fblnHealthAndSafety));
    equal = equal && (this.fblnPoliceNotified == null ? that.fblnPoliceNotified == null : this.fblnPoliceNotified.equals(that.fblnPoliceNotified));
    equal = equal && (this.fdtmPoliceNotifiedDate == null ? that.fdtmPoliceNotifiedDate == null : this.fdtmPoliceNotifiedDate.equals(that.fdtmPoliceNotifiedDate));
    equal = equal && (this.fstrPoliceReportReference == null ? that.fstrPoliceReportReference == null : this.fstrPoliceReportReference.equals(that.fstrPoliceReportReference));
    equal = equal && (this.fstrPoliceActions == null ? that.fstrPoliceActions == null : this.fstrPoliceActions.equals(that.fstrPoliceActions));
    equal = equal && (this.fblnStaffDebriefed == null ? that.fblnStaffDebriefed == null : this.fblnStaffDebriefed.equals(that.fblnStaffDebriefed));
    equal = equal && (this.fblnLetterIssued == null ? that.fblnLetterIssued == null : this.fblnLetterIssued.equals(that.fblnLetterIssued));
    equal = equal && (this.fblnTrespassNotice == null ? that.fblnTrespassNotice == null : this.fblnTrespassNotice.equals(that.fblnTrespassNotice));
    equal = equal && (this.fblnOther == null ? that.fblnOther == null : this.fblnOther.equals(that.fblnOther));
    equal = equal && (this.fblnCorporateCommsNotified == null ? that.fblnCorporateCommsNotified == null : this.fblnCorporateCommsNotified.equals(that.fblnCorporateCommsNotified));
    equal = equal && (this.fblnAlertNotification == null ? that.fblnAlertNotification == null : this.fblnAlertNotification.equals(that.fblnAlertNotification));
    equal = equal && (this.fstrCorpSecurityComment == null ? that.fstrCorpSecurityComment == null : this.fstrCorpSecurityComment.equals(that.fstrCorpSecurityComment));
    equal = equal && (this.fblnThirdPartyContacted == null ? that.fblnThirdPartyContacted == null : this.fblnThirdPartyContacted.equals(that.fblnThirdPartyContacted));
    equal = equal && (this.fblnSecurityRequested == null ? that.fblnSecurityRequested == null : this.fblnSecurityRequested.equals(that.fblnSecurityRequested));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrIncidentType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmIncidentDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrHowReceived = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIncidentLocation = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOfficeLocation = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnOfficeClosure = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrReportedBy = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrUserPhone = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnDamage = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrTeamLeader = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrTeamLeaderPhoneNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrTarget = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrBusinessGroup = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnWitnesses = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrIncidentDetails = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrDamageDetails = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWitnessDetails = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnManagerNotified = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnFacilitiesManagementNotifi = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnHealthAndSafety = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPoliceNotified = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmPoliceNotifiedDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPoliceReportReference = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPoliceActions = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnStaffDebriefed = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnLetterIssued = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnTrespassNotice = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnOther = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnCorporateCommsNotified = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnAlertNotification = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrCorpSecurityComment = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnThirdPartyContacted = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnSecurityRequested = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(35, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(36, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrIncidentType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmIncidentDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrHowReceived = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIncidentLocation = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOfficeLocation = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnOfficeClosure = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrReportedBy = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrUserPhone = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnDamage = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrTeamLeader = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrTeamLeaderPhoneNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrTarget = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrBusinessGroup = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnWitnesses = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrIncidentDetails = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrDamageDetails = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWitnessDetails = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnManagerNotified = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnFacilitiesManagementNotifi = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnHealthAndSafety = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPoliceNotified = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmPoliceNotifiedDate = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPoliceReportReference = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPoliceActions = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnStaffDebriefed = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnLetterIssued = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnTrespassNotice = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnOther = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnCorporateCommsNotified = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnAlertNotification = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrCorpSecurityComment = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnThirdPartyContacted = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fblnSecurityRequested = JdbcWritableBridge.readInteger(34, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(35, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(36, __dbResults);
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
    JdbcWritableBridge.writeString(fstrIncidentType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncidentDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrHowReceived, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncidentLocation, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOfficeLocation, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOfficeClosure, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrReportedBy, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUserPhone, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDamage, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrTeamLeader, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTeamLeaderPhoneNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTarget, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBusinessGroup, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWitnesses, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncidentDetails, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDamageDetails, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWitnessDetails, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManagerNotified, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFacilitiesManagementNotifi, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHealthAndSafety, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPoliceNotified, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPoliceNotifiedDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoliceReportReference, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoliceActions, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStaffDebriefed, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLetterIssued, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTrespassNotice, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOther, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorporateCommsNotified, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlertNotification, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorpSecurityComment, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnThirdPartyContacted, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurityRequested, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 36 + __off, 93, __dbStmt);
    return 36;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncidentType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncidentDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrHowReceived, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncidentLocation, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOfficeLocation, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOfficeClosure, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrReportedBy, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUserPhone, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDamage, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrTeamLeader, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTeamLeaderPhoneNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTarget, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBusinessGroup, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWitnesses, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncidentDetails, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDamageDetails, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWitnessDetails, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManagerNotified, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFacilitiesManagementNotifi, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHealthAndSafety, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPoliceNotified, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPoliceNotifiedDate, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoliceReportReference, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPoliceActions, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStaffDebriefed, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLetterIssued, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTrespassNotice, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOther, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorporateCommsNotified, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlertNotification, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorpSecurityComment, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnThirdPartyContacted, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurityRequested, 34 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 36 + __off, 93, __dbStmt);
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
        this.fstrIncidentType = null;
    } else {
    this.fstrIncidentType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIncidentDate = null;
    } else {
    this.fdtmIncidentDate = new Timestamp(__dataIn.readLong());
    this.fdtmIncidentDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHowReceived = null;
    } else {
    this.fstrHowReceived = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIncidentLocation = null;
    } else {
    this.fstrIncidentLocation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOfficeLocation = null;
    } else {
    this.fstrOfficeLocation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOfficeClosure = null;
    } else {
    this.fblnOfficeClosure = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReportedBy = null;
    } else {
    this.fstrReportedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUserPhone = null;
    } else {
    this.fstrUserPhone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDamage = null;
    } else {
    this.fblnDamage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTeamLeader = null;
    } else {
    this.fstrTeamLeader = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTeamLeaderPhoneNumber = null;
    } else {
    this.fstrTeamLeaderPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTarget = null;
    } else {
    this.fstrTarget = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBusinessGroup = null;
    } else {
    this.fstrBusinessGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWitnesses = null;
    } else {
    this.fblnWitnesses = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIncidentDetails = null;
    } else {
    this.fstrIncidentDetails = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDamageDetails = null;
    } else {
    this.fstrDamageDetails = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWitnessDetails = null;
    } else {
    this.fstrWitnessDetails = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManagerNotified = null;
    } else {
    this.fblnManagerNotified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFacilitiesManagementNotifi = null;
    } else {
    this.fblnFacilitiesManagementNotifi = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHealthAndSafety = null;
    } else {
    this.fblnHealthAndSafety = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPoliceNotified = null;
    } else {
    this.fblnPoliceNotified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPoliceNotifiedDate = null;
    } else {
    this.fdtmPoliceNotifiedDate = new Timestamp(__dataIn.readLong());
    this.fdtmPoliceNotifiedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPoliceReportReference = null;
    } else {
    this.fstrPoliceReportReference = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPoliceActions = null;
    } else {
    this.fstrPoliceActions = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnStaffDebriefed = null;
    } else {
    this.fblnStaffDebriefed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLetterIssued = null;
    } else {
    this.fblnLetterIssued = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTrespassNotice = null;
    } else {
    this.fblnTrespassNotice = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOther = null;
    } else {
    this.fblnOther = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCorporateCommsNotified = null;
    } else {
    this.fblnCorporateCommsNotified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlertNotification = null;
    } else {
    this.fblnAlertNotification = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCorpSecurityComment = null;
    } else {
    this.fstrCorpSecurityComment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnThirdPartyContacted = null;
    } else {
    this.fblnThirdPartyContacted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSecurityRequested = null;
    } else {
    this.fblnSecurityRequested = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrIncidentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentType);
    }
    if (null == this.fdtmIncidentDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncidentDate.getTime());
    __dataOut.writeInt(this.fdtmIncidentDate.getNanos());
    }
    if (null == this.fstrHowReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHowReceived);
    }
    if (null == this.fstrIncidentLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentLocation);
    }
    if (null == this.fstrOfficeLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOfficeLocation);
    }
    if (null == this.fblnOfficeClosure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOfficeClosure);
    }
    if (null == this.fstrReportedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReportedBy);
    }
    if (null == this.fstrUserPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUserPhone);
    }
    if (null == this.fblnDamage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDamage);
    }
    if (null == this.fstrTeamLeader) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTeamLeader);
    }
    if (null == this.fstrTeamLeaderPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTeamLeaderPhoneNumber);
    }
    if (null == this.fstrTarget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTarget);
    }
    if (null == this.fstrBusinessGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBusinessGroup);
    }
    if (null == this.fblnWitnesses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWitnesses);
    }
    if (null == this.fstrIncidentDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentDetails);
    }
    if (null == this.fstrDamageDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDamageDetails);
    }
    if (null == this.fstrWitnessDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWitnessDetails);
    }
    if (null == this.fblnManagerNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManagerNotified);
    }
    if (null == this.fblnFacilitiesManagementNotifi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFacilitiesManagementNotifi);
    }
    if (null == this.fblnHealthAndSafety) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHealthAndSafety);
    }
    if (null == this.fblnPoliceNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPoliceNotified);
    }
    if (null == this.fdtmPoliceNotifiedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPoliceNotifiedDate.getTime());
    __dataOut.writeInt(this.fdtmPoliceNotifiedDate.getNanos());
    }
    if (null == this.fstrPoliceReportReference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoliceReportReference);
    }
    if (null == this.fstrPoliceActions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoliceActions);
    }
    if (null == this.fblnStaffDebriefed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStaffDebriefed);
    }
    if (null == this.fblnLetterIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLetterIssued);
    }
    if (null == this.fblnTrespassNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTrespassNotice);
    }
    if (null == this.fblnOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOther);
    }
    if (null == this.fblnCorporateCommsNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorporateCommsNotified);
    }
    if (null == this.fblnAlertNotification) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlertNotification);
    }
    if (null == this.fstrCorpSecurityComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorpSecurityComment);
    }
    if (null == this.fblnThirdPartyContacted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnThirdPartyContacted);
    }
    if (null == this.fblnSecurityRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurityRequested);
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
    if (null == this.fstrIncidentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentType);
    }
    if (null == this.fdtmIncidentDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncidentDate.getTime());
    __dataOut.writeInt(this.fdtmIncidentDate.getNanos());
    }
    if (null == this.fstrHowReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHowReceived);
    }
    if (null == this.fstrIncidentLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentLocation);
    }
    if (null == this.fstrOfficeLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOfficeLocation);
    }
    if (null == this.fblnOfficeClosure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOfficeClosure);
    }
    if (null == this.fstrReportedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReportedBy);
    }
    if (null == this.fstrUserPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUserPhone);
    }
    if (null == this.fblnDamage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDamage);
    }
    if (null == this.fstrTeamLeader) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTeamLeader);
    }
    if (null == this.fstrTeamLeaderPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTeamLeaderPhoneNumber);
    }
    if (null == this.fstrTarget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTarget);
    }
    if (null == this.fstrBusinessGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBusinessGroup);
    }
    if (null == this.fblnWitnesses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWitnesses);
    }
    if (null == this.fstrIncidentDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncidentDetails);
    }
    if (null == this.fstrDamageDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDamageDetails);
    }
    if (null == this.fstrWitnessDetails) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWitnessDetails);
    }
    if (null == this.fblnManagerNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManagerNotified);
    }
    if (null == this.fblnFacilitiesManagementNotifi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFacilitiesManagementNotifi);
    }
    if (null == this.fblnHealthAndSafety) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHealthAndSafety);
    }
    if (null == this.fblnPoliceNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPoliceNotified);
    }
    if (null == this.fdtmPoliceNotifiedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPoliceNotifiedDate.getTime());
    __dataOut.writeInt(this.fdtmPoliceNotifiedDate.getNanos());
    }
    if (null == this.fstrPoliceReportReference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoliceReportReference);
    }
    if (null == this.fstrPoliceActions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPoliceActions);
    }
    if (null == this.fblnStaffDebriefed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStaffDebriefed);
    }
    if (null == this.fblnLetterIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLetterIssued);
    }
    if (null == this.fblnTrespassNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTrespassNotice);
    }
    if (null == this.fblnOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOther);
    }
    if (null == this.fblnCorporateCommsNotified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorporateCommsNotified);
    }
    if (null == this.fblnAlertNotification) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlertNotification);
    }
    if (null == this.fstrCorpSecurityComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorpSecurityComment);
    }
    if (null == this.fblnThirdPartyContacted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnThirdPartyContacted);
    }
    if (null == this.fblnSecurityRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurityRequested);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentType==null?"\\N":fstrIncidentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncidentDate==null?"\\N":"" + fdtmIncidentDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHowReceived==null?"\\N":fstrHowReceived, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentLocation==null?"\\N":fstrIncidentLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOfficeLocation==null?"\\N":fstrOfficeLocation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOfficeClosure==null?"\\N":"" + fblnOfficeClosure, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReportedBy==null?"\\N":fstrReportedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUserPhone==null?"\\N":fstrUserPhone, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDamage==null?"\\N":"" + fblnDamage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTeamLeader==null?"\\N":fstrTeamLeader, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTeamLeaderPhoneNumber==null?"\\N":fstrTeamLeaderPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTarget==null?"\\N":fstrTarget, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBusinessGroup==null?"\\N":fstrBusinessGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWitnesses==null?"\\N":"" + fblnWitnesses, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentDetails==null?"\\N":fstrIncidentDetails, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDamageDetails==null?"\\N":fstrDamageDetails, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWitnessDetails==null?"\\N":fstrWitnessDetails, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManagerNotified==null?"\\N":"" + fblnManagerNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFacilitiesManagementNotifi==null?"\\N":"" + fblnFacilitiesManagementNotifi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHealthAndSafety==null?"\\N":"" + fblnHealthAndSafety, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPoliceNotified==null?"\\N":"" + fblnPoliceNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPoliceNotifiedDate==null?"\\N":"" + fdtmPoliceNotifiedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoliceReportReference==null?"\\N":fstrPoliceReportReference, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoliceActions==null?"\\N":fstrPoliceActions, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStaffDebriefed==null?"\\N":"" + fblnStaffDebriefed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLetterIssued==null?"\\N":"" + fblnLetterIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTrespassNotice==null?"\\N":"" + fblnTrespassNotice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOther==null?"\\N":"" + fblnOther, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorporateCommsNotified==null?"\\N":"" + fblnCorporateCommsNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlertNotification==null?"\\N":"" + fblnAlertNotification, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorpSecurityComment==null?"\\N":fstrCorpSecurityComment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnThirdPartyContacted==null?"\\N":"" + fblnThirdPartyContacted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurityRequested==null?"\\N":"" + fblnSecurityRequested, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentType==null?"\\N":fstrIncidentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncidentDate==null?"\\N":"" + fdtmIncidentDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHowReceived==null?"\\N":fstrHowReceived, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentLocation==null?"\\N":fstrIncidentLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOfficeLocation==null?"\\N":fstrOfficeLocation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOfficeClosure==null?"\\N":"" + fblnOfficeClosure, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReportedBy==null?"\\N":fstrReportedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUserPhone==null?"\\N":fstrUserPhone, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDamage==null?"\\N":"" + fblnDamage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTeamLeader==null?"\\N":fstrTeamLeader, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTeamLeaderPhoneNumber==null?"\\N":fstrTeamLeaderPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTarget==null?"\\N":fstrTarget, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBusinessGroup==null?"\\N":fstrBusinessGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWitnesses==null?"\\N":"" + fblnWitnesses, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncidentDetails==null?"\\N":fstrIncidentDetails, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDamageDetails==null?"\\N":fstrDamageDetails, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWitnessDetails==null?"\\N":fstrWitnessDetails, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManagerNotified==null?"\\N":"" + fblnManagerNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFacilitiesManagementNotifi==null?"\\N":"" + fblnFacilitiesManagementNotifi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHealthAndSafety==null?"\\N":"" + fblnHealthAndSafety, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPoliceNotified==null?"\\N":"" + fblnPoliceNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPoliceNotifiedDate==null?"\\N":"" + fdtmPoliceNotifiedDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoliceReportReference==null?"\\N":fstrPoliceReportReference, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPoliceActions==null?"\\N":fstrPoliceActions, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStaffDebriefed==null?"\\N":"" + fblnStaffDebriefed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLetterIssued==null?"\\N":"" + fblnLetterIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTrespassNotice==null?"\\N":"" + fblnTrespassNotice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOther==null?"\\N":"" + fblnOther, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorporateCommsNotified==null?"\\N":"" + fblnCorporateCommsNotified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlertNotification==null?"\\N":"" + fblnAlertNotification, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorpSecurityComment==null?"\\N":fstrCorpSecurityComment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnThirdPartyContacted==null?"\\N":"" + fblnThirdPartyContacted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurityRequested==null?"\\N":"" + fblnSecurityRequested, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrIncidentType = null; } else {
      this.fstrIncidentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncidentDate = null; } else {
      this.fdtmIncidentDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHowReceived = null; } else {
      this.fstrHowReceived = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIncidentLocation = null; } else {
      this.fstrIncidentLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOfficeLocation = null; } else {
      this.fstrOfficeLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOfficeClosure = null; } else {
      this.fblnOfficeClosure = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReportedBy = null; } else {
      this.fstrReportedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUserPhone = null; } else {
      this.fstrUserPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDamage = null; } else {
      this.fblnDamage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTeamLeader = null; } else {
      this.fstrTeamLeader = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTeamLeaderPhoneNumber = null; } else {
      this.fstrTeamLeaderPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTarget = null; } else {
      this.fstrTarget = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBusinessGroup = null; } else {
      this.fstrBusinessGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWitnesses = null; } else {
      this.fblnWitnesses = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIncidentDetails = null; } else {
      this.fstrIncidentDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDamageDetails = null; } else {
      this.fstrDamageDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWitnessDetails = null; } else {
      this.fstrWitnessDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManagerNotified = null; } else {
      this.fblnManagerNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFacilitiesManagementNotifi = null; } else {
      this.fblnFacilitiesManagementNotifi = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHealthAndSafety = null; } else {
      this.fblnHealthAndSafety = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPoliceNotified = null; } else {
      this.fblnPoliceNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPoliceNotifiedDate = null; } else {
      this.fdtmPoliceNotifiedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoliceReportReference = null; } else {
      this.fstrPoliceReportReference = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoliceActions = null; } else {
      this.fstrPoliceActions = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStaffDebriefed = null; } else {
      this.fblnStaffDebriefed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLetterIssued = null; } else {
      this.fblnLetterIssued = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTrespassNotice = null; } else {
      this.fblnTrespassNotice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOther = null; } else {
      this.fblnOther = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorporateCommsNotified = null; } else {
      this.fblnCorporateCommsNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlertNotification = null; } else {
      this.fblnAlertNotification = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorpSecurityComment = null; } else {
      this.fstrCorpSecurityComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnThirdPartyContacted = null; } else {
      this.fblnThirdPartyContacted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurityRequested = null; } else {
      this.fblnSecurityRequested = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIncidentType = null; } else {
      this.fstrIncidentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncidentDate = null; } else {
      this.fdtmIncidentDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHowReceived = null; } else {
      this.fstrHowReceived = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIncidentLocation = null; } else {
      this.fstrIncidentLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOfficeLocation = null; } else {
      this.fstrOfficeLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOfficeClosure = null; } else {
      this.fblnOfficeClosure = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReportedBy = null; } else {
      this.fstrReportedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUserPhone = null; } else {
      this.fstrUserPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDamage = null; } else {
      this.fblnDamage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTeamLeader = null; } else {
      this.fstrTeamLeader = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTeamLeaderPhoneNumber = null; } else {
      this.fstrTeamLeaderPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTarget = null; } else {
      this.fstrTarget = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBusinessGroup = null; } else {
      this.fstrBusinessGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWitnesses = null; } else {
      this.fblnWitnesses = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIncidentDetails = null; } else {
      this.fstrIncidentDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDamageDetails = null; } else {
      this.fstrDamageDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWitnessDetails = null; } else {
      this.fstrWitnessDetails = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManagerNotified = null; } else {
      this.fblnManagerNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFacilitiesManagementNotifi = null; } else {
      this.fblnFacilitiesManagementNotifi = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHealthAndSafety = null; } else {
      this.fblnHealthAndSafety = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPoliceNotified = null; } else {
      this.fblnPoliceNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPoliceNotifiedDate = null; } else {
      this.fdtmPoliceNotifiedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoliceReportReference = null; } else {
      this.fstrPoliceReportReference = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPoliceActions = null; } else {
      this.fstrPoliceActions = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStaffDebriefed = null; } else {
      this.fblnStaffDebriefed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLetterIssued = null; } else {
      this.fblnLetterIssued = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTrespassNotice = null; } else {
      this.fblnTrespassNotice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOther = null; } else {
      this.fblnOther = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorporateCommsNotified = null; } else {
      this.fblnCorporateCommsNotified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlertNotification = null; } else {
      this.fblnAlertNotification = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorpSecurityComment = null; } else {
      this.fstrCorpSecurityComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnThirdPartyContacted = null; } else {
      this.fblnThirdPartyContacted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurityRequested = null; } else {
      this.fblnSecurityRequested = Integer.valueOf(__cur_str);
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
    tblnz_cassecurityincident o = (tblnz_cassecurityincident) super.clone();
    o.fdtmIncidentDate = (o.fdtmIncidentDate != null) ? (java.sql.Timestamp) o.fdtmIncidentDate.clone() : null;
    o.fdtmPoliceNotifiedDate = (o.fdtmPoliceNotifiedDate != null) ? (java.sql.Timestamp) o.fdtmPoliceNotifiedDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_cassecurityincident o) throws CloneNotSupportedException {
    o.fdtmIncidentDate = (o.fdtmIncidentDate != null) ? (java.sql.Timestamp) o.fdtmIncidentDate.clone() : null;
    o.fdtmPoliceNotifiedDate = (o.fdtmPoliceNotifiedDate != null) ? (java.sql.Timestamp) o.fdtmPoliceNotifiedDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIncidentType", this.fstrIncidentType);
    __sqoop$field_map.put("fdtmIncidentDate", this.fdtmIncidentDate);
    __sqoop$field_map.put("fstrHowReceived", this.fstrHowReceived);
    __sqoop$field_map.put("fstrIncidentLocation", this.fstrIncidentLocation);
    __sqoop$field_map.put("fstrOfficeLocation", this.fstrOfficeLocation);
    __sqoop$field_map.put("fblnOfficeClosure", this.fblnOfficeClosure);
    __sqoop$field_map.put("fstrReportedBy", this.fstrReportedBy);
    __sqoop$field_map.put("fstrUserPhone", this.fstrUserPhone);
    __sqoop$field_map.put("fblnDamage", this.fblnDamage);
    __sqoop$field_map.put("fstrTeamLeader", this.fstrTeamLeader);
    __sqoop$field_map.put("fstrTeamLeaderPhoneNumber", this.fstrTeamLeaderPhoneNumber);
    __sqoop$field_map.put("fstrTarget", this.fstrTarget);
    __sqoop$field_map.put("fstrBusinessGroup", this.fstrBusinessGroup);
    __sqoop$field_map.put("fblnWitnesses", this.fblnWitnesses);
    __sqoop$field_map.put("fstrIncidentDetails", this.fstrIncidentDetails);
    __sqoop$field_map.put("fstrDamageDetails", this.fstrDamageDetails);
    __sqoop$field_map.put("fstrWitnessDetails", this.fstrWitnessDetails);
    __sqoop$field_map.put("fblnManagerNotified", this.fblnManagerNotified);
    __sqoop$field_map.put("fblnFacilitiesManagementNotifi", this.fblnFacilitiesManagementNotifi);
    __sqoop$field_map.put("fblnHealthAndSafety", this.fblnHealthAndSafety);
    __sqoop$field_map.put("fblnPoliceNotified", this.fblnPoliceNotified);
    __sqoop$field_map.put("fdtmPoliceNotifiedDate", this.fdtmPoliceNotifiedDate);
    __sqoop$field_map.put("fstrPoliceReportReference", this.fstrPoliceReportReference);
    __sqoop$field_map.put("fstrPoliceActions", this.fstrPoliceActions);
    __sqoop$field_map.put("fblnStaffDebriefed", this.fblnStaffDebriefed);
    __sqoop$field_map.put("fblnLetterIssued", this.fblnLetterIssued);
    __sqoop$field_map.put("fblnTrespassNotice", this.fblnTrespassNotice);
    __sqoop$field_map.put("fblnOther", this.fblnOther);
    __sqoop$field_map.put("fblnCorporateCommsNotified", this.fblnCorporateCommsNotified);
    __sqoop$field_map.put("fblnAlertNotification", this.fblnAlertNotification);
    __sqoop$field_map.put("fstrCorpSecurityComment", this.fstrCorpSecurityComment);
    __sqoop$field_map.put("fblnThirdPartyContacted", this.fblnThirdPartyContacted);
    __sqoop$field_map.put("fblnSecurityRequested", this.fblnSecurityRequested);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIncidentType", this.fstrIncidentType);
    __sqoop$field_map.put("fdtmIncidentDate", this.fdtmIncidentDate);
    __sqoop$field_map.put("fstrHowReceived", this.fstrHowReceived);
    __sqoop$field_map.put("fstrIncidentLocation", this.fstrIncidentLocation);
    __sqoop$field_map.put("fstrOfficeLocation", this.fstrOfficeLocation);
    __sqoop$field_map.put("fblnOfficeClosure", this.fblnOfficeClosure);
    __sqoop$field_map.put("fstrReportedBy", this.fstrReportedBy);
    __sqoop$field_map.put("fstrUserPhone", this.fstrUserPhone);
    __sqoop$field_map.put("fblnDamage", this.fblnDamage);
    __sqoop$field_map.put("fstrTeamLeader", this.fstrTeamLeader);
    __sqoop$field_map.put("fstrTeamLeaderPhoneNumber", this.fstrTeamLeaderPhoneNumber);
    __sqoop$field_map.put("fstrTarget", this.fstrTarget);
    __sqoop$field_map.put("fstrBusinessGroup", this.fstrBusinessGroup);
    __sqoop$field_map.put("fblnWitnesses", this.fblnWitnesses);
    __sqoop$field_map.put("fstrIncidentDetails", this.fstrIncidentDetails);
    __sqoop$field_map.put("fstrDamageDetails", this.fstrDamageDetails);
    __sqoop$field_map.put("fstrWitnessDetails", this.fstrWitnessDetails);
    __sqoop$field_map.put("fblnManagerNotified", this.fblnManagerNotified);
    __sqoop$field_map.put("fblnFacilitiesManagementNotifi", this.fblnFacilitiesManagementNotifi);
    __sqoop$field_map.put("fblnHealthAndSafety", this.fblnHealthAndSafety);
    __sqoop$field_map.put("fblnPoliceNotified", this.fblnPoliceNotified);
    __sqoop$field_map.put("fdtmPoliceNotifiedDate", this.fdtmPoliceNotifiedDate);
    __sqoop$field_map.put("fstrPoliceReportReference", this.fstrPoliceReportReference);
    __sqoop$field_map.put("fstrPoliceActions", this.fstrPoliceActions);
    __sqoop$field_map.put("fblnStaffDebriefed", this.fblnStaffDebriefed);
    __sqoop$field_map.put("fblnLetterIssued", this.fblnLetterIssued);
    __sqoop$field_map.put("fblnTrespassNotice", this.fblnTrespassNotice);
    __sqoop$field_map.put("fblnOther", this.fblnOther);
    __sqoop$field_map.put("fblnCorporateCommsNotified", this.fblnCorporateCommsNotified);
    __sqoop$field_map.put("fblnAlertNotification", this.fblnAlertNotification);
    __sqoop$field_map.put("fstrCorpSecurityComment", this.fstrCorpSecurityComment);
    __sqoop$field_map.put("fblnThirdPartyContacted", this.fblnThirdPartyContacted);
    __sqoop$field_map.put("fblnSecurityRequested", this.fblnSecurityRequested);
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
