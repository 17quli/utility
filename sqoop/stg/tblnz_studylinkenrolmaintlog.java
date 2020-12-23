// ORM class for table 'tblnz_studylinkenrolmaintlog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:55:42 NZDT 2020
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

public class tblnz_studylinkenrolmaintlog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64EnrolLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fi64EnrolLogKey = (Long)value;
      }
    });
    setters.put("fi64ValidateLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fi64ValidateLogKey = (Long)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrCorrelationID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrCorrelationID = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEnrolDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fdtmEnrolDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrAddressLine1 = (String)value;
      }
    });
    setters.put("fstrAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrAddressLine2 = (String)value;
      }
    });
    setters.put("fstrSuburb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrSuburb = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPostCode = (String)value;
      }
    });
    setters.put("fstrAddressAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrAddressAction = (String)value;
      }
    });
    setters.put("fstrPhoneHome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneHome = (String)value;
      }
    });
    setters.put("fstrPhoneHomeAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneHomeAction = (String)value;
      }
    });
    setters.put("fstrPhoneWork", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneWork = (String)value;
      }
    });
    setters.put("fstrPhoneWorkAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneWorkAction = (String)value;
      }
    });
    setters.put("fstrPhoneMobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneMobile = (String)value;
      }
    });
    setters.put("fstrPhoneMobileAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrPhoneMobileAction = (String)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrEmailAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrEmailAction = (String)value;
      }
    });
    setters.put("fstrACPIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPIRDNumber = (String)value;
      }
    });
    setters.put("fdtmACPDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fdtmACPDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrACPFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPFamilyName = (String)value;
      }
    });
    setters.put("fstrACPFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPFirstName = (String)value;
      }
    });
    setters.put("fstrACPMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPMiddleName = (String)value;
      }
    });
    setters.put("fstrACPAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPAddressLine1 = (String)value;
      }
    });
    setters.put("fstrACPAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPAddressLine2 = (String)value;
      }
    });
    setters.put("fstrACPSuburb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPSuburb = (String)value;
      }
    });
    setters.put("fstrACPCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPCity = (String)value;
      }
    });
    setters.put("fstrACPPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPPostCode = (String)value;
      }
    });
    setters.put("fstrACPPhoneHome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPPhoneHome = (String)value;
      }
    });
    setters.put("fstrACPPhoneMobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPPhoneMobile = (String)value;
      }
    });
    setters.put("fstrACPPhoneWork", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPPhoneWork = (String)value;
      }
    });
    setters.put("fstrACPEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrACPEmail = (String)value;
      }
    });
    setters.put("fblnMaintenance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fblnMaintenance = (Integer)value;
      }
    });
    setters.put("fblnNewAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fblnNewAccount = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkenrolmaintlog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_studylinkenrolmaintlog() {
    init0();
  }
  private Long fi64EnrolLogKey;
  public Long get_fi64EnrolLogKey() {
    return fi64EnrolLogKey;
  }
  public void set_fi64EnrolLogKey(Long fi64EnrolLogKey) {
    this.fi64EnrolLogKey = fi64EnrolLogKey;
  }
  public tblnz_studylinkenrolmaintlog with_fi64EnrolLogKey(Long fi64EnrolLogKey) {
    this.fi64EnrolLogKey = fi64EnrolLogKey;
    return this;
  }
  private Long fi64ValidateLogKey;
  public Long get_fi64ValidateLogKey() {
    return fi64ValidateLogKey;
  }
  public void set_fi64ValidateLogKey(Long fi64ValidateLogKey) {
    this.fi64ValidateLogKey = fi64ValidateLogKey;
  }
  public tblnz_studylinkenrolmaintlog with_fi64ValidateLogKey(Long fi64ValidateLogKey) {
    this.fi64ValidateLogKey = fi64ValidateLogKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_studylinkenrolmaintlog with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_studylinkenrolmaintlog with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_studylinkenrolmaintlog with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrCorrelationID;
  public String get_fstrCorrelationID() {
    return fstrCorrelationID;
  }
  public void set_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
  }
  public tblnz_studylinkenrolmaintlog with_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_studylinkenrolmaintlog with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_studylinkenrolmaintlog with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private java.sql.Timestamp fdtmEnrolDate;
  public java.sql.Timestamp get_fdtmEnrolDate() {
    return fdtmEnrolDate;
  }
  public void set_fdtmEnrolDate(java.sql.Timestamp fdtmEnrolDate) {
    this.fdtmEnrolDate = fdtmEnrolDate;
  }
  public tblnz_studylinkenrolmaintlog with_fdtmEnrolDate(java.sql.Timestamp fdtmEnrolDate) {
    this.fdtmEnrolDate = fdtmEnrolDate;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_studylinkenrolmaintlog with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrAddressLine1;
  public String get_fstrAddressLine1() {
    return fstrAddressLine1;
  }
  public void set_fstrAddressLine1(String fstrAddressLine1) {
    this.fstrAddressLine1 = fstrAddressLine1;
  }
  public tblnz_studylinkenrolmaintlog with_fstrAddressLine1(String fstrAddressLine1) {
    this.fstrAddressLine1 = fstrAddressLine1;
    return this;
  }
  private String fstrAddressLine2;
  public String get_fstrAddressLine2() {
    return fstrAddressLine2;
  }
  public void set_fstrAddressLine2(String fstrAddressLine2) {
    this.fstrAddressLine2 = fstrAddressLine2;
  }
  public tblnz_studylinkenrolmaintlog with_fstrAddressLine2(String fstrAddressLine2) {
    this.fstrAddressLine2 = fstrAddressLine2;
    return this;
  }
  private String fstrSuburb;
  public String get_fstrSuburb() {
    return fstrSuburb;
  }
  public void set_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
  }
  public tblnz_studylinkenrolmaintlog with_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblnz_studylinkenrolmaintlog with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrPostCode;
  public String get_fstrPostCode() {
    return fstrPostCode;
  }
  public void set_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
    return this;
  }
  private String fstrAddressAction;
  public String get_fstrAddressAction() {
    return fstrAddressAction;
  }
  public void set_fstrAddressAction(String fstrAddressAction) {
    this.fstrAddressAction = fstrAddressAction;
  }
  public tblnz_studylinkenrolmaintlog with_fstrAddressAction(String fstrAddressAction) {
    this.fstrAddressAction = fstrAddressAction;
    return this;
  }
  private String fstrPhoneHome;
  public String get_fstrPhoneHome() {
    return fstrPhoneHome;
  }
  public void set_fstrPhoneHome(String fstrPhoneHome) {
    this.fstrPhoneHome = fstrPhoneHome;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneHome(String fstrPhoneHome) {
    this.fstrPhoneHome = fstrPhoneHome;
    return this;
  }
  private String fstrPhoneHomeAction;
  public String get_fstrPhoneHomeAction() {
    return fstrPhoneHomeAction;
  }
  public void set_fstrPhoneHomeAction(String fstrPhoneHomeAction) {
    this.fstrPhoneHomeAction = fstrPhoneHomeAction;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneHomeAction(String fstrPhoneHomeAction) {
    this.fstrPhoneHomeAction = fstrPhoneHomeAction;
    return this;
  }
  private String fstrPhoneWork;
  public String get_fstrPhoneWork() {
    return fstrPhoneWork;
  }
  public void set_fstrPhoneWork(String fstrPhoneWork) {
    this.fstrPhoneWork = fstrPhoneWork;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneWork(String fstrPhoneWork) {
    this.fstrPhoneWork = fstrPhoneWork;
    return this;
  }
  private String fstrPhoneWorkAction;
  public String get_fstrPhoneWorkAction() {
    return fstrPhoneWorkAction;
  }
  public void set_fstrPhoneWorkAction(String fstrPhoneWorkAction) {
    this.fstrPhoneWorkAction = fstrPhoneWorkAction;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneWorkAction(String fstrPhoneWorkAction) {
    this.fstrPhoneWorkAction = fstrPhoneWorkAction;
    return this;
  }
  private String fstrPhoneMobile;
  public String get_fstrPhoneMobile() {
    return fstrPhoneMobile;
  }
  public void set_fstrPhoneMobile(String fstrPhoneMobile) {
    this.fstrPhoneMobile = fstrPhoneMobile;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneMobile(String fstrPhoneMobile) {
    this.fstrPhoneMobile = fstrPhoneMobile;
    return this;
  }
  private String fstrPhoneMobileAction;
  public String get_fstrPhoneMobileAction() {
    return fstrPhoneMobileAction;
  }
  public void set_fstrPhoneMobileAction(String fstrPhoneMobileAction) {
    this.fstrPhoneMobileAction = fstrPhoneMobileAction;
  }
  public tblnz_studylinkenrolmaintlog with_fstrPhoneMobileAction(String fstrPhoneMobileAction) {
    this.fstrPhoneMobileAction = fstrPhoneMobileAction;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tblnz_studylinkenrolmaintlog with_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
    return this;
  }
  private String fstrEmailAction;
  public String get_fstrEmailAction() {
    return fstrEmailAction;
  }
  public void set_fstrEmailAction(String fstrEmailAction) {
    this.fstrEmailAction = fstrEmailAction;
  }
  public tblnz_studylinkenrolmaintlog with_fstrEmailAction(String fstrEmailAction) {
    this.fstrEmailAction = fstrEmailAction;
    return this;
  }
  private String fstrACPIRDNumber;
  public String get_fstrACPIRDNumber() {
    return fstrACPIRDNumber;
  }
  public void set_fstrACPIRDNumber(String fstrACPIRDNumber) {
    this.fstrACPIRDNumber = fstrACPIRDNumber;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPIRDNumber(String fstrACPIRDNumber) {
    this.fstrACPIRDNumber = fstrACPIRDNumber;
    return this;
  }
  private java.sql.Timestamp fdtmACPDOB;
  public java.sql.Timestamp get_fdtmACPDOB() {
    return fdtmACPDOB;
  }
  public void set_fdtmACPDOB(java.sql.Timestamp fdtmACPDOB) {
    this.fdtmACPDOB = fdtmACPDOB;
  }
  public tblnz_studylinkenrolmaintlog with_fdtmACPDOB(java.sql.Timestamp fdtmACPDOB) {
    this.fdtmACPDOB = fdtmACPDOB;
    return this;
  }
  private String fstrACPFamilyName;
  public String get_fstrACPFamilyName() {
    return fstrACPFamilyName;
  }
  public void set_fstrACPFamilyName(String fstrACPFamilyName) {
    this.fstrACPFamilyName = fstrACPFamilyName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPFamilyName(String fstrACPFamilyName) {
    this.fstrACPFamilyName = fstrACPFamilyName;
    return this;
  }
  private String fstrACPFirstName;
  public String get_fstrACPFirstName() {
    return fstrACPFirstName;
  }
  public void set_fstrACPFirstName(String fstrACPFirstName) {
    this.fstrACPFirstName = fstrACPFirstName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPFirstName(String fstrACPFirstName) {
    this.fstrACPFirstName = fstrACPFirstName;
    return this;
  }
  private String fstrACPMiddleName;
  public String get_fstrACPMiddleName() {
    return fstrACPMiddleName;
  }
  public void set_fstrACPMiddleName(String fstrACPMiddleName) {
    this.fstrACPMiddleName = fstrACPMiddleName;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPMiddleName(String fstrACPMiddleName) {
    this.fstrACPMiddleName = fstrACPMiddleName;
    return this;
  }
  private String fstrACPAddressLine1;
  public String get_fstrACPAddressLine1() {
    return fstrACPAddressLine1;
  }
  public void set_fstrACPAddressLine1(String fstrACPAddressLine1) {
    this.fstrACPAddressLine1 = fstrACPAddressLine1;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPAddressLine1(String fstrACPAddressLine1) {
    this.fstrACPAddressLine1 = fstrACPAddressLine1;
    return this;
  }
  private String fstrACPAddressLine2;
  public String get_fstrACPAddressLine2() {
    return fstrACPAddressLine2;
  }
  public void set_fstrACPAddressLine2(String fstrACPAddressLine2) {
    this.fstrACPAddressLine2 = fstrACPAddressLine2;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPAddressLine2(String fstrACPAddressLine2) {
    this.fstrACPAddressLine2 = fstrACPAddressLine2;
    return this;
  }
  private String fstrACPSuburb;
  public String get_fstrACPSuburb() {
    return fstrACPSuburb;
  }
  public void set_fstrACPSuburb(String fstrACPSuburb) {
    this.fstrACPSuburb = fstrACPSuburb;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPSuburb(String fstrACPSuburb) {
    this.fstrACPSuburb = fstrACPSuburb;
    return this;
  }
  private String fstrACPCity;
  public String get_fstrACPCity() {
    return fstrACPCity;
  }
  public void set_fstrACPCity(String fstrACPCity) {
    this.fstrACPCity = fstrACPCity;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPCity(String fstrACPCity) {
    this.fstrACPCity = fstrACPCity;
    return this;
  }
  private String fstrACPPostCode;
  public String get_fstrACPPostCode() {
    return fstrACPPostCode;
  }
  public void set_fstrACPPostCode(String fstrACPPostCode) {
    this.fstrACPPostCode = fstrACPPostCode;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPPostCode(String fstrACPPostCode) {
    this.fstrACPPostCode = fstrACPPostCode;
    return this;
  }
  private String fstrACPPhoneHome;
  public String get_fstrACPPhoneHome() {
    return fstrACPPhoneHome;
  }
  public void set_fstrACPPhoneHome(String fstrACPPhoneHome) {
    this.fstrACPPhoneHome = fstrACPPhoneHome;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPPhoneHome(String fstrACPPhoneHome) {
    this.fstrACPPhoneHome = fstrACPPhoneHome;
    return this;
  }
  private String fstrACPPhoneMobile;
  public String get_fstrACPPhoneMobile() {
    return fstrACPPhoneMobile;
  }
  public void set_fstrACPPhoneMobile(String fstrACPPhoneMobile) {
    this.fstrACPPhoneMobile = fstrACPPhoneMobile;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPPhoneMobile(String fstrACPPhoneMobile) {
    this.fstrACPPhoneMobile = fstrACPPhoneMobile;
    return this;
  }
  private String fstrACPPhoneWork;
  public String get_fstrACPPhoneWork() {
    return fstrACPPhoneWork;
  }
  public void set_fstrACPPhoneWork(String fstrACPPhoneWork) {
    this.fstrACPPhoneWork = fstrACPPhoneWork;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPPhoneWork(String fstrACPPhoneWork) {
    this.fstrACPPhoneWork = fstrACPPhoneWork;
    return this;
  }
  private String fstrACPEmail;
  public String get_fstrACPEmail() {
    return fstrACPEmail;
  }
  public void set_fstrACPEmail(String fstrACPEmail) {
    this.fstrACPEmail = fstrACPEmail;
  }
  public tblnz_studylinkenrolmaintlog with_fstrACPEmail(String fstrACPEmail) {
    this.fstrACPEmail = fstrACPEmail;
    return this;
  }
  private Integer fblnMaintenance;
  public Integer get_fblnMaintenance() {
    return fblnMaintenance;
  }
  public void set_fblnMaintenance(Integer fblnMaintenance) {
    this.fblnMaintenance = fblnMaintenance;
  }
  public tblnz_studylinkenrolmaintlog with_fblnMaintenance(Integer fblnMaintenance) {
    this.fblnMaintenance = fblnMaintenance;
    return this;
  }
  private Integer fblnNewAccount;
  public Integer get_fblnNewAccount() {
    return fblnNewAccount;
  }
  public void set_fblnNewAccount(Integer fblnNewAccount) {
    this.fblnNewAccount = fblnNewAccount;
  }
  public tblnz_studylinkenrolmaintlog with_fblnNewAccount(Integer fblnNewAccount) {
    this.fblnNewAccount = fblnNewAccount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_studylinkenrolmaintlog with_fstrWho(String fstrWho) {
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
  public tblnz_studylinkenrolmaintlog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkenrolmaintlog)) {
      return false;
    }
    tblnz_studylinkenrolmaintlog that = (tblnz_studylinkenrolmaintlog) o;
    boolean equal = true;
    equal = equal && (this.fi64EnrolLogKey == null ? that.fi64EnrolLogKey == null : this.fi64EnrolLogKey.equals(that.fi64EnrolLogKey));
    equal = equal && (this.fi64ValidateLogKey == null ? that.fi64ValidateLogKey == null : this.fi64ValidateLogKey.equals(that.fi64ValidateLogKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fdtmEnrolDate == null ? that.fdtmEnrolDate == null : this.fdtmEnrolDate.equals(that.fdtmEnrolDate));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrAddressAction == null ? that.fstrAddressAction == null : this.fstrAddressAction.equals(that.fstrAddressAction));
    equal = equal && (this.fstrPhoneHome == null ? that.fstrPhoneHome == null : this.fstrPhoneHome.equals(that.fstrPhoneHome));
    equal = equal && (this.fstrPhoneHomeAction == null ? that.fstrPhoneHomeAction == null : this.fstrPhoneHomeAction.equals(that.fstrPhoneHomeAction));
    equal = equal && (this.fstrPhoneWork == null ? that.fstrPhoneWork == null : this.fstrPhoneWork.equals(that.fstrPhoneWork));
    equal = equal && (this.fstrPhoneWorkAction == null ? that.fstrPhoneWorkAction == null : this.fstrPhoneWorkAction.equals(that.fstrPhoneWorkAction));
    equal = equal && (this.fstrPhoneMobile == null ? that.fstrPhoneMobile == null : this.fstrPhoneMobile.equals(that.fstrPhoneMobile));
    equal = equal && (this.fstrPhoneMobileAction == null ? that.fstrPhoneMobileAction == null : this.fstrPhoneMobileAction.equals(that.fstrPhoneMobileAction));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailAction == null ? that.fstrEmailAction == null : this.fstrEmailAction.equals(that.fstrEmailAction));
    equal = equal && (this.fstrACPIRDNumber == null ? that.fstrACPIRDNumber == null : this.fstrACPIRDNumber.equals(that.fstrACPIRDNumber));
    equal = equal && (this.fdtmACPDOB == null ? that.fdtmACPDOB == null : this.fdtmACPDOB.equals(that.fdtmACPDOB));
    equal = equal && (this.fstrACPFamilyName == null ? that.fstrACPFamilyName == null : this.fstrACPFamilyName.equals(that.fstrACPFamilyName));
    equal = equal && (this.fstrACPFirstName == null ? that.fstrACPFirstName == null : this.fstrACPFirstName.equals(that.fstrACPFirstName));
    equal = equal && (this.fstrACPMiddleName == null ? that.fstrACPMiddleName == null : this.fstrACPMiddleName.equals(that.fstrACPMiddleName));
    equal = equal && (this.fstrACPAddressLine1 == null ? that.fstrACPAddressLine1 == null : this.fstrACPAddressLine1.equals(that.fstrACPAddressLine1));
    equal = equal && (this.fstrACPAddressLine2 == null ? that.fstrACPAddressLine2 == null : this.fstrACPAddressLine2.equals(that.fstrACPAddressLine2));
    equal = equal && (this.fstrACPSuburb == null ? that.fstrACPSuburb == null : this.fstrACPSuburb.equals(that.fstrACPSuburb));
    equal = equal && (this.fstrACPCity == null ? that.fstrACPCity == null : this.fstrACPCity.equals(that.fstrACPCity));
    equal = equal && (this.fstrACPPostCode == null ? that.fstrACPPostCode == null : this.fstrACPPostCode.equals(that.fstrACPPostCode));
    equal = equal && (this.fstrACPPhoneHome == null ? that.fstrACPPhoneHome == null : this.fstrACPPhoneHome.equals(that.fstrACPPhoneHome));
    equal = equal && (this.fstrACPPhoneMobile == null ? that.fstrACPPhoneMobile == null : this.fstrACPPhoneMobile.equals(that.fstrACPPhoneMobile));
    equal = equal && (this.fstrACPPhoneWork == null ? that.fstrACPPhoneWork == null : this.fstrACPPhoneWork.equals(that.fstrACPPhoneWork));
    equal = equal && (this.fstrACPEmail == null ? that.fstrACPEmail == null : this.fstrACPEmail.equals(that.fstrACPEmail));
    equal = equal && (this.fblnMaintenance == null ? that.fblnMaintenance == null : this.fblnMaintenance.equals(that.fblnMaintenance));
    equal = equal && (this.fblnNewAccount == null ? that.fblnNewAccount == null : this.fblnNewAccount.equals(that.fblnNewAccount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkenrolmaintlog)) {
      return false;
    }
    tblnz_studylinkenrolmaintlog that = (tblnz_studylinkenrolmaintlog) o;
    boolean equal = true;
    equal = equal && (this.fi64EnrolLogKey == null ? that.fi64EnrolLogKey == null : this.fi64EnrolLogKey.equals(that.fi64EnrolLogKey));
    equal = equal && (this.fi64ValidateLogKey == null ? that.fi64ValidateLogKey == null : this.fi64ValidateLogKey.equals(that.fi64ValidateLogKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fdtmEnrolDate == null ? that.fdtmEnrolDate == null : this.fdtmEnrolDate.equals(that.fdtmEnrolDate));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrAddressAction == null ? that.fstrAddressAction == null : this.fstrAddressAction.equals(that.fstrAddressAction));
    equal = equal && (this.fstrPhoneHome == null ? that.fstrPhoneHome == null : this.fstrPhoneHome.equals(that.fstrPhoneHome));
    equal = equal && (this.fstrPhoneHomeAction == null ? that.fstrPhoneHomeAction == null : this.fstrPhoneHomeAction.equals(that.fstrPhoneHomeAction));
    equal = equal && (this.fstrPhoneWork == null ? that.fstrPhoneWork == null : this.fstrPhoneWork.equals(that.fstrPhoneWork));
    equal = equal && (this.fstrPhoneWorkAction == null ? that.fstrPhoneWorkAction == null : this.fstrPhoneWorkAction.equals(that.fstrPhoneWorkAction));
    equal = equal && (this.fstrPhoneMobile == null ? that.fstrPhoneMobile == null : this.fstrPhoneMobile.equals(that.fstrPhoneMobile));
    equal = equal && (this.fstrPhoneMobileAction == null ? that.fstrPhoneMobileAction == null : this.fstrPhoneMobileAction.equals(that.fstrPhoneMobileAction));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailAction == null ? that.fstrEmailAction == null : this.fstrEmailAction.equals(that.fstrEmailAction));
    equal = equal && (this.fstrACPIRDNumber == null ? that.fstrACPIRDNumber == null : this.fstrACPIRDNumber.equals(that.fstrACPIRDNumber));
    equal = equal && (this.fdtmACPDOB == null ? that.fdtmACPDOB == null : this.fdtmACPDOB.equals(that.fdtmACPDOB));
    equal = equal && (this.fstrACPFamilyName == null ? that.fstrACPFamilyName == null : this.fstrACPFamilyName.equals(that.fstrACPFamilyName));
    equal = equal && (this.fstrACPFirstName == null ? that.fstrACPFirstName == null : this.fstrACPFirstName.equals(that.fstrACPFirstName));
    equal = equal && (this.fstrACPMiddleName == null ? that.fstrACPMiddleName == null : this.fstrACPMiddleName.equals(that.fstrACPMiddleName));
    equal = equal && (this.fstrACPAddressLine1 == null ? that.fstrACPAddressLine1 == null : this.fstrACPAddressLine1.equals(that.fstrACPAddressLine1));
    equal = equal && (this.fstrACPAddressLine2 == null ? that.fstrACPAddressLine2 == null : this.fstrACPAddressLine2.equals(that.fstrACPAddressLine2));
    equal = equal && (this.fstrACPSuburb == null ? that.fstrACPSuburb == null : this.fstrACPSuburb.equals(that.fstrACPSuburb));
    equal = equal && (this.fstrACPCity == null ? that.fstrACPCity == null : this.fstrACPCity.equals(that.fstrACPCity));
    equal = equal && (this.fstrACPPostCode == null ? that.fstrACPPostCode == null : this.fstrACPPostCode.equals(that.fstrACPPostCode));
    equal = equal && (this.fstrACPPhoneHome == null ? that.fstrACPPhoneHome == null : this.fstrACPPhoneHome.equals(that.fstrACPPhoneHome));
    equal = equal && (this.fstrACPPhoneMobile == null ? that.fstrACPPhoneMobile == null : this.fstrACPPhoneMobile.equals(that.fstrACPPhoneMobile));
    equal = equal && (this.fstrACPPhoneWork == null ? that.fstrACPPhoneWork == null : this.fstrACPPhoneWork.equals(that.fstrACPPhoneWork));
    equal = equal && (this.fstrACPEmail == null ? that.fstrACPEmail == null : this.fstrACPEmail.equals(that.fstrACPEmail));
    equal = equal && (this.fblnMaintenance == null ? that.fblnMaintenance == null : this.fblnMaintenance.equals(that.fblnMaintenance));
    equal = equal && (this.fblnNewAccount == null ? that.fblnNewAccount == null : this.fblnNewAccount.equals(that.fblnNewAccount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64EnrolLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ValidateLogKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmEnrolDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrAddressAction = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneHome = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPhoneHomeAction = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrPhoneWork = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneWorkAction = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneMobile = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPhoneMobileAction = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrEmailAction = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrACPIRDNumber = JdbcWritableBridge.readString(28, __dbResults);
    this.fdtmACPDOB = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrACPFamilyName = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrACPFirstName = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrACPMiddleName = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrACPAddressLine1 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrACPAddressLine2 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrACPSuburb = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrACPCity = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrACPPostCode = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrACPPhoneHome = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrACPPhoneMobile = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrACPPhoneWork = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrACPEmail = JdbcWritableBridge.readString(41, __dbResults);
    this.fblnMaintenance = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnNewAccount = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(44, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(45, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64EnrolLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ValidateLogKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmEnrolDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrAddressAction = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneHome = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPhoneHomeAction = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrPhoneWork = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneWorkAction = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneMobile = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPhoneMobileAction = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrEmailAction = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrACPIRDNumber = JdbcWritableBridge.readString(28, __dbResults);
    this.fdtmACPDOB = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrACPFamilyName = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrACPFirstName = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrACPMiddleName = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrACPAddressLine1 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrACPAddressLine2 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrACPSuburb = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrACPCity = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrACPPostCode = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrACPPhoneHome = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrACPPhoneMobile = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrACPPhoneWork = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrACPEmail = JdbcWritableBridge.readString(41, __dbResults);
    this.fblnMaintenance = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnNewAccount = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(44, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(45, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64EnrolLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ValidateLogKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnrolDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressAction, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHome, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHomeAction, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWork, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWorkAction, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobile, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobileAction, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAction, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPIRDNumber, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmACPDOB, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPFamilyName, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPFirstName, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPMiddleName, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPAddressLine1, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPAddressLine2, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPSuburb, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPCity, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPostCode, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneHome, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneMobile, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneWork, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPEmail, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMaintenance, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNewAccount, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 45 + __off, 93, __dbStmt);
    return 45;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64EnrolLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ValidateLogKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnrolDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressAction, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHome, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHomeAction, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWork, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWorkAction, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobile, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobileAction, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAction, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPIRDNumber, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmACPDOB, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPFamilyName, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPFirstName, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPMiddleName, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPAddressLine1, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPAddressLine2, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPSuburb, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPCity, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPostCode, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneHome, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneMobile, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPPhoneWork, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrACPEmail, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMaintenance, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNewAccount, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 45 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64EnrolLogKey = null;
    } else {
    this.fi64EnrolLogKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ValidateLogKey = null;
    } else {
    this.fi64ValidateLogKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCorrelationID = null;
    } else {
    this.fstrCorrelationID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEnrolDate = null;
    } else {
    this.fdtmEnrolDate = new Timestamp(__dataIn.readLong());
    this.fdtmEnrolDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressLine1 = null;
    } else {
    this.fstrAddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressLine2 = null;
    } else {
    this.fstrAddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSuburb = null;
    } else {
    this.fstrSuburb = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostCode = null;
    } else {
    this.fstrPostCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressAction = null;
    } else {
    this.fstrAddressAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneHome = null;
    } else {
    this.fstrPhoneHome = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneHomeAction = null;
    } else {
    this.fstrPhoneHomeAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneWork = null;
    } else {
    this.fstrPhoneWork = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneWorkAction = null;
    } else {
    this.fstrPhoneWorkAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneMobile = null;
    } else {
    this.fstrPhoneMobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneMobileAction = null;
    } else {
    this.fstrPhoneMobileAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmail = null;
    } else {
    this.fstrEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailAction = null;
    } else {
    this.fstrEmailAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPIRDNumber = null;
    } else {
    this.fstrACPIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmACPDOB = null;
    } else {
    this.fdtmACPDOB = new Timestamp(__dataIn.readLong());
    this.fdtmACPDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPFamilyName = null;
    } else {
    this.fstrACPFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPFirstName = null;
    } else {
    this.fstrACPFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPMiddleName = null;
    } else {
    this.fstrACPMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPAddressLine1 = null;
    } else {
    this.fstrACPAddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPAddressLine2 = null;
    } else {
    this.fstrACPAddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPSuburb = null;
    } else {
    this.fstrACPSuburb = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPCity = null;
    } else {
    this.fstrACPCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPPostCode = null;
    } else {
    this.fstrACPPostCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPPhoneHome = null;
    } else {
    this.fstrACPPhoneHome = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPPhoneMobile = null;
    } else {
    this.fstrACPPhoneMobile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPPhoneWork = null;
    } else {
    this.fstrACPPhoneWork = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrACPEmail = null;
    } else {
    this.fstrACPEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMaintenance = null;
    } else {
    this.fblnMaintenance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNewAccount = null;
    } else {
    this.fblnNewAccount = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64EnrolLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64EnrolLogKey);
    }
    if (null == this.fi64ValidateLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ValidateLogKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fdtmEnrolDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnrolDate.getTime());
    __dataOut.writeInt(this.fdtmEnrolDate.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine1);
    }
    if (null == this.fstrAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine2);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrAddressAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressAction);
    }
    if (null == this.fstrPhoneHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneHome);
    }
    if (null == this.fstrPhoneHomeAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneHomeAction);
    }
    if (null == this.fstrPhoneWork) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneWork);
    }
    if (null == this.fstrPhoneWorkAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneWorkAction);
    }
    if (null == this.fstrPhoneMobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMobile);
    }
    if (null == this.fstrPhoneMobileAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMobileAction);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrEmailAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailAction);
    }
    if (null == this.fstrACPIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPIRDNumber);
    }
    if (null == this.fdtmACPDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmACPDOB.getTime());
    __dataOut.writeInt(this.fdtmACPDOB.getNanos());
    }
    if (null == this.fstrACPFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPFamilyName);
    }
    if (null == this.fstrACPFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPFirstName);
    }
    if (null == this.fstrACPMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPMiddleName);
    }
    if (null == this.fstrACPAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPAddressLine1);
    }
    if (null == this.fstrACPAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPAddressLine2);
    }
    if (null == this.fstrACPSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPSuburb);
    }
    if (null == this.fstrACPCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPCity);
    }
    if (null == this.fstrACPPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPostCode);
    }
    if (null == this.fstrACPPhoneHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneHome);
    }
    if (null == this.fstrACPPhoneMobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneMobile);
    }
    if (null == this.fstrACPPhoneWork) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneWork);
    }
    if (null == this.fstrACPEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPEmail);
    }
    if (null == this.fblnMaintenance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMaintenance);
    }
    if (null == this.fblnNewAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNewAccount);
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
    if (null == this.fi64EnrolLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64EnrolLogKey);
    }
    if (null == this.fi64ValidateLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ValidateLogKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fdtmEnrolDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnrolDate.getTime());
    __dataOut.writeInt(this.fdtmEnrolDate.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine1);
    }
    if (null == this.fstrAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine2);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrAddressAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressAction);
    }
    if (null == this.fstrPhoneHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneHome);
    }
    if (null == this.fstrPhoneHomeAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneHomeAction);
    }
    if (null == this.fstrPhoneWork) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneWork);
    }
    if (null == this.fstrPhoneWorkAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneWorkAction);
    }
    if (null == this.fstrPhoneMobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMobile);
    }
    if (null == this.fstrPhoneMobileAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMobileAction);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrEmailAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailAction);
    }
    if (null == this.fstrACPIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPIRDNumber);
    }
    if (null == this.fdtmACPDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmACPDOB.getTime());
    __dataOut.writeInt(this.fdtmACPDOB.getNanos());
    }
    if (null == this.fstrACPFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPFamilyName);
    }
    if (null == this.fstrACPFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPFirstName);
    }
    if (null == this.fstrACPMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPMiddleName);
    }
    if (null == this.fstrACPAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPAddressLine1);
    }
    if (null == this.fstrACPAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPAddressLine2);
    }
    if (null == this.fstrACPSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPSuburb);
    }
    if (null == this.fstrACPCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPCity);
    }
    if (null == this.fstrACPPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPostCode);
    }
    if (null == this.fstrACPPhoneHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneHome);
    }
    if (null == this.fstrACPPhoneMobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneMobile);
    }
    if (null == this.fstrACPPhoneWork) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPPhoneWork);
    }
    if (null == this.fstrACPEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrACPEmail);
    }
    if (null == this.fblnMaintenance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMaintenance);
    }
    if (null == this.fblnNewAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNewAccount);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64EnrolLogKey==null?"\\N":"" + fi64EnrolLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ValidateLogKey==null?"\\N":"" + fi64ValidateLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnrolDate==null?"\\N":"" + fdtmEnrolDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine1==null?"\\N":fstrAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine2==null?"\\N":fstrAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressAction==null?"\\N":fstrAddressAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHome==null?"\\N":fstrPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHomeAction==null?"\\N":fstrPhoneHomeAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWork==null?"\\N":fstrPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWorkAction==null?"\\N":fstrPhoneWorkAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobile==null?"\\N":fstrPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobileAction==null?"\\N":fstrPhoneMobileAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAction==null?"\\N":fstrEmailAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPIRDNumber==null?"\\N":fstrACPIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmACPDOB==null?"\\N":"" + fdtmACPDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPFamilyName==null?"\\N":fstrACPFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPFirstName==null?"\\N":fstrACPFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPMiddleName==null?"\\N":fstrACPMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPAddressLine1==null?"\\N":fstrACPAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPAddressLine2==null?"\\N":fstrACPAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPSuburb==null?"\\N":fstrACPSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPCity==null?"\\N":fstrACPCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPostCode==null?"\\N":fstrACPPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneHome==null?"\\N":fstrACPPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneMobile==null?"\\N":fstrACPPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneWork==null?"\\N":fstrACPPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPEmail==null?"\\N":fstrACPEmail, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMaintenance==null?"\\N":"" + fblnMaintenance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNewAccount==null?"\\N":"" + fblnNewAccount, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64EnrolLogKey==null?"\\N":"" + fi64EnrolLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ValidateLogKey==null?"\\N":"" + fi64ValidateLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnrolDate==null?"\\N":"" + fdtmEnrolDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine1==null?"\\N":fstrAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine2==null?"\\N":fstrAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressAction==null?"\\N":fstrAddressAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHome==null?"\\N":fstrPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHomeAction==null?"\\N":fstrPhoneHomeAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWork==null?"\\N":fstrPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWorkAction==null?"\\N":fstrPhoneWorkAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobile==null?"\\N":fstrPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobileAction==null?"\\N":fstrPhoneMobileAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAction==null?"\\N":fstrEmailAction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPIRDNumber==null?"\\N":fstrACPIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmACPDOB==null?"\\N":"" + fdtmACPDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPFamilyName==null?"\\N":fstrACPFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPFirstName==null?"\\N":fstrACPFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPMiddleName==null?"\\N":fstrACPMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPAddressLine1==null?"\\N":fstrACPAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPAddressLine2==null?"\\N":fstrACPAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPSuburb==null?"\\N":fstrACPSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPCity==null?"\\N":fstrACPCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPostCode==null?"\\N":fstrACPPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneHome==null?"\\N":fstrACPPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneMobile==null?"\\N":fstrACPPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPPhoneWork==null?"\\N":fstrACPPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrACPEmail==null?"\\N":fstrACPEmail, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMaintenance==null?"\\N":"" + fblnMaintenance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNewAccount==null?"\\N":"" + fblnNewAccount, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64EnrolLogKey = null; } else {
      this.fi64EnrolLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ValidateLogKey = null; } else {
      this.fi64ValidateLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnrolDate = null; } else {
      this.fdtmEnrolDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine1 = null; } else {
      this.fstrAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine2 = null; } else {
      this.fstrAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuburb = null; } else {
      this.fstrSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressAction = null; } else {
      this.fstrAddressAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneHome = null; } else {
      this.fstrPhoneHome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneHomeAction = null; } else {
      this.fstrPhoneHomeAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneWork = null; } else {
      this.fstrPhoneWork = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneWorkAction = null; } else {
      this.fstrPhoneWorkAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMobile = null; } else {
      this.fstrPhoneMobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMobileAction = null; } else {
      this.fstrPhoneMobileAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailAction = null; } else {
      this.fstrEmailAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPIRDNumber = null; } else {
      this.fstrACPIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmACPDOB = null; } else {
      this.fdtmACPDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPFamilyName = null; } else {
      this.fstrACPFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPFirstName = null; } else {
      this.fstrACPFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPMiddleName = null; } else {
      this.fstrACPMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPAddressLine1 = null; } else {
      this.fstrACPAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPAddressLine2 = null; } else {
      this.fstrACPAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPSuburb = null; } else {
      this.fstrACPSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPCity = null; } else {
      this.fstrACPCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPostCode = null; } else {
      this.fstrACPPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneHome = null; } else {
      this.fstrACPPhoneHome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneMobile = null; } else {
      this.fstrACPPhoneMobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneWork = null; } else {
      this.fstrACPPhoneWork = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPEmail = null; } else {
      this.fstrACPEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMaintenance = null; } else {
      this.fblnMaintenance = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNewAccount = null; } else {
      this.fblnNewAccount = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64EnrolLogKey = null; } else {
      this.fi64EnrolLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ValidateLogKey = null; } else {
      this.fi64ValidateLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnrolDate = null; } else {
      this.fdtmEnrolDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine1 = null; } else {
      this.fstrAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine2 = null; } else {
      this.fstrAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuburb = null; } else {
      this.fstrSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressAction = null; } else {
      this.fstrAddressAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneHome = null; } else {
      this.fstrPhoneHome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneHomeAction = null; } else {
      this.fstrPhoneHomeAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneWork = null; } else {
      this.fstrPhoneWork = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneWorkAction = null; } else {
      this.fstrPhoneWorkAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMobile = null; } else {
      this.fstrPhoneMobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMobileAction = null; } else {
      this.fstrPhoneMobileAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailAction = null; } else {
      this.fstrEmailAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPIRDNumber = null; } else {
      this.fstrACPIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmACPDOB = null; } else {
      this.fdtmACPDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPFamilyName = null; } else {
      this.fstrACPFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPFirstName = null; } else {
      this.fstrACPFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPMiddleName = null; } else {
      this.fstrACPMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPAddressLine1 = null; } else {
      this.fstrACPAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPAddressLine2 = null; } else {
      this.fstrACPAddressLine2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPSuburb = null; } else {
      this.fstrACPSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPCity = null; } else {
      this.fstrACPCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPostCode = null; } else {
      this.fstrACPPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneHome = null; } else {
      this.fstrACPPhoneHome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneMobile = null; } else {
      this.fstrACPPhoneMobile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPPhoneWork = null; } else {
      this.fstrACPPhoneWork = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrACPEmail = null; } else {
      this.fstrACPEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMaintenance = null; } else {
      this.fblnMaintenance = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNewAccount = null; } else {
      this.fblnNewAccount = Integer.valueOf(__cur_str);
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
    tblnz_studylinkenrolmaintlog o = (tblnz_studylinkenrolmaintlog) super.clone();
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmEnrolDate = (o.fdtmEnrolDate != null) ? (java.sql.Timestamp) o.fdtmEnrolDate.clone() : null;
    o.fdtmACPDOB = (o.fdtmACPDOB != null) ? (java.sql.Timestamp) o.fdtmACPDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_studylinkenrolmaintlog o) throws CloneNotSupportedException {
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmEnrolDate = (o.fdtmEnrolDate != null) ? (java.sql.Timestamp) o.fdtmEnrolDate.clone() : null;
    o.fdtmACPDOB = (o.fdtmACPDOB != null) ? (java.sql.Timestamp) o.fdtmACPDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64EnrolLogKey", this.fi64EnrolLogKey);
    __sqoop$field_map.put("fi64ValidateLogKey", this.fi64ValidateLogKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fdtmEnrolDate", this.fdtmEnrolDate);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrAddressAction", this.fstrAddressAction);
    __sqoop$field_map.put("fstrPhoneHome", this.fstrPhoneHome);
    __sqoop$field_map.put("fstrPhoneHomeAction", this.fstrPhoneHomeAction);
    __sqoop$field_map.put("fstrPhoneWork", this.fstrPhoneWork);
    __sqoop$field_map.put("fstrPhoneWorkAction", this.fstrPhoneWorkAction);
    __sqoop$field_map.put("fstrPhoneMobile", this.fstrPhoneMobile);
    __sqoop$field_map.put("fstrPhoneMobileAction", this.fstrPhoneMobileAction);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailAction", this.fstrEmailAction);
    __sqoop$field_map.put("fstrACPIRDNumber", this.fstrACPIRDNumber);
    __sqoop$field_map.put("fdtmACPDOB", this.fdtmACPDOB);
    __sqoop$field_map.put("fstrACPFamilyName", this.fstrACPFamilyName);
    __sqoop$field_map.put("fstrACPFirstName", this.fstrACPFirstName);
    __sqoop$field_map.put("fstrACPMiddleName", this.fstrACPMiddleName);
    __sqoop$field_map.put("fstrACPAddressLine1", this.fstrACPAddressLine1);
    __sqoop$field_map.put("fstrACPAddressLine2", this.fstrACPAddressLine2);
    __sqoop$field_map.put("fstrACPSuburb", this.fstrACPSuburb);
    __sqoop$field_map.put("fstrACPCity", this.fstrACPCity);
    __sqoop$field_map.put("fstrACPPostCode", this.fstrACPPostCode);
    __sqoop$field_map.put("fstrACPPhoneHome", this.fstrACPPhoneHome);
    __sqoop$field_map.put("fstrACPPhoneMobile", this.fstrACPPhoneMobile);
    __sqoop$field_map.put("fstrACPPhoneWork", this.fstrACPPhoneWork);
    __sqoop$field_map.put("fstrACPEmail", this.fstrACPEmail);
    __sqoop$field_map.put("fblnMaintenance", this.fblnMaintenance);
    __sqoop$field_map.put("fblnNewAccount", this.fblnNewAccount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64EnrolLogKey", this.fi64EnrolLogKey);
    __sqoop$field_map.put("fi64ValidateLogKey", this.fi64ValidateLogKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fdtmEnrolDate", this.fdtmEnrolDate);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrAddressAction", this.fstrAddressAction);
    __sqoop$field_map.put("fstrPhoneHome", this.fstrPhoneHome);
    __sqoop$field_map.put("fstrPhoneHomeAction", this.fstrPhoneHomeAction);
    __sqoop$field_map.put("fstrPhoneWork", this.fstrPhoneWork);
    __sqoop$field_map.put("fstrPhoneWorkAction", this.fstrPhoneWorkAction);
    __sqoop$field_map.put("fstrPhoneMobile", this.fstrPhoneMobile);
    __sqoop$field_map.put("fstrPhoneMobileAction", this.fstrPhoneMobileAction);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailAction", this.fstrEmailAction);
    __sqoop$field_map.put("fstrACPIRDNumber", this.fstrACPIRDNumber);
    __sqoop$field_map.put("fdtmACPDOB", this.fdtmACPDOB);
    __sqoop$field_map.put("fstrACPFamilyName", this.fstrACPFamilyName);
    __sqoop$field_map.put("fstrACPFirstName", this.fstrACPFirstName);
    __sqoop$field_map.put("fstrACPMiddleName", this.fstrACPMiddleName);
    __sqoop$field_map.put("fstrACPAddressLine1", this.fstrACPAddressLine1);
    __sqoop$field_map.put("fstrACPAddressLine2", this.fstrACPAddressLine2);
    __sqoop$field_map.put("fstrACPSuburb", this.fstrACPSuburb);
    __sqoop$field_map.put("fstrACPCity", this.fstrACPCity);
    __sqoop$field_map.put("fstrACPPostCode", this.fstrACPPostCode);
    __sqoop$field_map.put("fstrACPPhoneHome", this.fstrACPPhoneHome);
    __sqoop$field_map.put("fstrACPPhoneMobile", this.fstrACPPhoneMobile);
    __sqoop$field_map.put("fstrACPPhoneWork", this.fstrACPPhoneWork);
    __sqoop$field_map.put("fstrACPEmail", this.fstrACPEmail);
    __sqoop$field_map.put("fblnMaintenance", this.fblnMaintenance);
    __sqoop$field_map.put("fblnNewAccount", this.fblnNewAccount);
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
