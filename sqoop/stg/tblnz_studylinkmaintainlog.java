// ORM class for table 'tblnz_studylinkmaintainlog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:39:07 NZDT 2020
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

public class tblnz_studylinkmaintainlog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64MaintainLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fi64MaintainLogKey = (Long)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrCorrelationID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrCorrelationID = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrAddressLine1 = (String)value;
      }
    });
    setters.put("fstrAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrAddressLine2 = (String)value;
      }
    });
    setters.put("fstrSuburb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrSuburb = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPostCode = (String)value;
      }
    });
    setters.put("fstrAddressAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrAddressAction = (String)value;
      }
    });
    setters.put("fblnAddressProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fblnAddressProcessed = (Integer)value;
      }
    });
    setters.put("fstrPhoneHome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneHome = (String)value;
      }
    });
    setters.put("fstrPhoneHomeAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneHomeAction = (String)value;
      }
    });
    setters.put("fblnPhoneHomeProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fblnPhoneHomeProcessed = (Integer)value;
      }
    });
    setters.put("fstrPhoneWork", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneWork = (String)value;
      }
    });
    setters.put("fstrPhoneWorkAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneWorkAction = (String)value;
      }
    });
    setters.put("fblnPhoneWorkProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fblnPhoneWorkProcessed = (Integer)value;
      }
    });
    setters.put("fstrPhoneMobile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneMobile = (String)value;
      }
    });
    setters.put("fstrPhoneMobileAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrPhoneMobileAction = (String)value;
      }
    });
    setters.put("fblnPhoneMobileProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fblnPhoneMobileProcessed = (Integer)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrEmailAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrEmailAction = (String)value;
      }
    });
    setters.put("fblnEmailProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fblnEmailProcessed = (Integer)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fdtmProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkmaintainlog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_studylinkmaintainlog() {
    init0();
  }
  private Long fi64MaintainLogKey;
  public Long get_fi64MaintainLogKey() {
    return fi64MaintainLogKey;
  }
  public void set_fi64MaintainLogKey(Long fi64MaintainLogKey) {
    this.fi64MaintainLogKey = fi64MaintainLogKey;
  }
  public tblnz_studylinkmaintainlog with_fi64MaintainLogKey(Long fi64MaintainLogKey) {
    this.fi64MaintainLogKey = fi64MaintainLogKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_studylinkmaintainlog with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private String fstrCorrelationID;
  public String get_fstrCorrelationID() {
    return fstrCorrelationID;
  }
  public void set_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
  }
  public tblnz_studylinkmaintainlog with_fstrCorrelationID(String fstrCorrelationID) {
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
  public tblnz_studylinkmaintainlog with_fstrIRDNumber(String fstrIRDNumber) {
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
  public tblnz_studylinkmaintainlog with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblnz_studylinkmaintainlog with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tblnz_studylinkmaintainlog with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_studylinkmaintainlog with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_studylinkmaintainlog with_fstrAccountType(String fstrAccountType) {
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
  public tblnz_studylinkmaintainlog with_fstrAddressLine1(String fstrAddressLine1) {
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
  public tblnz_studylinkmaintainlog with_fstrAddressLine2(String fstrAddressLine2) {
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
  public tblnz_studylinkmaintainlog with_fstrSuburb(String fstrSuburb) {
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
  public tblnz_studylinkmaintainlog with_fstrCity(String fstrCity) {
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
  public tblnz_studylinkmaintainlog with_fstrPostCode(String fstrPostCode) {
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
  public tblnz_studylinkmaintainlog with_fstrAddressAction(String fstrAddressAction) {
    this.fstrAddressAction = fstrAddressAction;
    return this;
  }
  private Integer fblnAddressProcessed;
  public Integer get_fblnAddressProcessed() {
    return fblnAddressProcessed;
  }
  public void set_fblnAddressProcessed(Integer fblnAddressProcessed) {
    this.fblnAddressProcessed = fblnAddressProcessed;
  }
  public tblnz_studylinkmaintainlog with_fblnAddressProcessed(Integer fblnAddressProcessed) {
    this.fblnAddressProcessed = fblnAddressProcessed;
    return this;
  }
  private String fstrPhoneHome;
  public String get_fstrPhoneHome() {
    return fstrPhoneHome;
  }
  public void set_fstrPhoneHome(String fstrPhoneHome) {
    this.fstrPhoneHome = fstrPhoneHome;
  }
  public tblnz_studylinkmaintainlog with_fstrPhoneHome(String fstrPhoneHome) {
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
  public tblnz_studylinkmaintainlog with_fstrPhoneHomeAction(String fstrPhoneHomeAction) {
    this.fstrPhoneHomeAction = fstrPhoneHomeAction;
    return this;
  }
  private Integer fblnPhoneHomeProcessed;
  public Integer get_fblnPhoneHomeProcessed() {
    return fblnPhoneHomeProcessed;
  }
  public void set_fblnPhoneHomeProcessed(Integer fblnPhoneHomeProcessed) {
    this.fblnPhoneHomeProcessed = fblnPhoneHomeProcessed;
  }
  public tblnz_studylinkmaintainlog with_fblnPhoneHomeProcessed(Integer fblnPhoneHomeProcessed) {
    this.fblnPhoneHomeProcessed = fblnPhoneHomeProcessed;
    return this;
  }
  private String fstrPhoneWork;
  public String get_fstrPhoneWork() {
    return fstrPhoneWork;
  }
  public void set_fstrPhoneWork(String fstrPhoneWork) {
    this.fstrPhoneWork = fstrPhoneWork;
  }
  public tblnz_studylinkmaintainlog with_fstrPhoneWork(String fstrPhoneWork) {
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
  public tblnz_studylinkmaintainlog with_fstrPhoneWorkAction(String fstrPhoneWorkAction) {
    this.fstrPhoneWorkAction = fstrPhoneWorkAction;
    return this;
  }
  private Integer fblnPhoneWorkProcessed;
  public Integer get_fblnPhoneWorkProcessed() {
    return fblnPhoneWorkProcessed;
  }
  public void set_fblnPhoneWorkProcessed(Integer fblnPhoneWorkProcessed) {
    this.fblnPhoneWorkProcessed = fblnPhoneWorkProcessed;
  }
  public tblnz_studylinkmaintainlog with_fblnPhoneWorkProcessed(Integer fblnPhoneWorkProcessed) {
    this.fblnPhoneWorkProcessed = fblnPhoneWorkProcessed;
    return this;
  }
  private String fstrPhoneMobile;
  public String get_fstrPhoneMobile() {
    return fstrPhoneMobile;
  }
  public void set_fstrPhoneMobile(String fstrPhoneMobile) {
    this.fstrPhoneMobile = fstrPhoneMobile;
  }
  public tblnz_studylinkmaintainlog with_fstrPhoneMobile(String fstrPhoneMobile) {
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
  public tblnz_studylinkmaintainlog with_fstrPhoneMobileAction(String fstrPhoneMobileAction) {
    this.fstrPhoneMobileAction = fstrPhoneMobileAction;
    return this;
  }
  private Integer fblnPhoneMobileProcessed;
  public Integer get_fblnPhoneMobileProcessed() {
    return fblnPhoneMobileProcessed;
  }
  public void set_fblnPhoneMobileProcessed(Integer fblnPhoneMobileProcessed) {
    this.fblnPhoneMobileProcessed = fblnPhoneMobileProcessed;
  }
  public tblnz_studylinkmaintainlog with_fblnPhoneMobileProcessed(Integer fblnPhoneMobileProcessed) {
    this.fblnPhoneMobileProcessed = fblnPhoneMobileProcessed;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tblnz_studylinkmaintainlog with_fstrEmail(String fstrEmail) {
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
  public tblnz_studylinkmaintainlog with_fstrEmailAction(String fstrEmailAction) {
    this.fstrEmailAction = fstrEmailAction;
    return this;
  }
  private Integer fblnEmailProcessed;
  public Integer get_fblnEmailProcessed() {
    return fblnEmailProcessed;
  }
  public void set_fblnEmailProcessed(Integer fblnEmailProcessed) {
    this.fblnEmailProcessed = fblnEmailProcessed;
  }
  public tblnz_studylinkmaintainlog with_fblnEmailProcessed(Integer fblnEmailProcessed) {
    this.fblnEmailProcessed = fblnEmailProcessed;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblnz_studylinkmaintainlog with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private java.sql.Timestamp fdtmProcessed;
  public java.sql.Timestamp get_fdtmProcessed() {
    return fdtmProcessed;
  }
  public void set_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
  }
  public tblnz_studylinkmaintainlog with_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_studylinkmaintainlog with_fstrWho(String fstrWho) {
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
  public tblnz_studylinkmaintainlog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkmaintainlog)) {
      return false;
    }
    tblnz_studylinkmaintainlog that = (tblnz_studylinkmaintainlog) o;
    boolean equal = true;
    equal = equal && (this.fi64MaintainLogKey == null ? that.fi64MaintainLogKey == null : this.fi64MaintainLogKey.equals(that.fi64MaintainLogKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrAddressAction == null ? that.fstrAddressAction == null : this.fstrAddressAction.equals(that.fstrAddressAction));
    equal = equal && (this.fblnAddressProcessed == null ? that.fblnAddressProcessed == null : this.fblnAddressProcessed.equals(that.fblnAddressProcessed));
    equal = equal && (this.fstrPhoneHome == null ? that.fstrPhoneHome == null : this.fstrPhoneHome.equals(that.fstrPhoneHome));
    equal = equal && (this.fstrPhoneHomeAction == null ? that.fstrPhoneHomeAction == null : this.fstrPhoneHomeAction.equals(that.fstrPhoneHomeAction));
    equal = equal && (this.fblnPhoneHomeProcessed == null ? that.fblnPhoneHomeProcessed == null : this.fblnPhoneHomeProcessed.equals(that.fblnPhoneHomeProcessed));
    equal = equal && (this.fstrPhoneWork == null ? that.fstrPhoneWork == null : this.fstrPhoneWork.equals(that.fstrPhoneWork));
    equal = equal && (this.fstrPhoneWorkAction == null ? that.fstrPhoneWorkAction == null : this.fstrPhoneWorkAction.equals(that.fstrPhoneWorkAction));
    equal = equal && (this.fblnPhoneWorkProcessed == null ? that.fblnPhoneWorkProcessed == null : this.fblnPhoneWorkProcessed.equals(that.fblnPhoneWorkProcessed));
    equal = equal && (this.fstrPhoneMobile == null ? that.fstrPhoneMobile == null : this.fstrPhoneMobile.equals(that.fstrPhoneMobile));
    equal = equal && (this.fstrPhoneMobileAction == null ? that.fstrPhoneMobileAction == null : this.fstrPhoneMobileAction.equals(that.fstrPhoneMobileAction));
    equal = equal && (this.fblnPhoneMobileProcessed == null ? that.fblnPhoneMobileProcessed == null : this.fblnPhoneMobileProcessed.equals(that.fblnPhoneMobileProcessed));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailAction == null ? that.fstrEmailAction == null : this.fstrEmailAction.equals(that.fstrEmailAction));
    equal = equal && (this.fblnEmailProcessed == null ? that.fblnEmailProcessed == null : this.fblnEmailProcessed.equals(that.fblnEmailProcessed));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkmaintainlog)) {
      return false;
    }
    tblnz_studylinkmaintainlog that = (tblnz_studylinkmaintainlog) o;
    boolean equal = true;
    equal = equal && (this.fi64MaintainLogKey == null ? that.fi64MaintainLogKey == null : this.fi64MaintainLogKey.equals(that.fi64MaintainLogKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrAddressAction == null ? that.fstrAddressAction == null : this.fstrAddressAction.equals(that.fstrAddressAction));
    equal = equal && (this.fblnAddressProcessed == null ? that.fblnAddressProcessed == null : this.fblnAddressProcessed.equals(that.fblnAddressProcessed));
    equal = equal && (this.fstrPhoneHome == null ? that.fstrPhoneHome == null : this.fstrPhoneHome.equals(that.fstrPhoneHome));
    equal = equal && (this.fstrPhoneHomeAction == null ? that.fstrPhoneHomeAction == null : this.fstrPhoneHomeAction.equals(that.fstrPhoneHomeAction));
    equal = equal && (this.fblnPhoneHomeProcessed == null ? that.fblnPhoneHomeProcessed == null : this.fblnPhoneHomeProcessed.equals(that.fblnPhoneHomeProcessed));
    equal = equal && (this.fstrPhoneWork == null ? that.fstrPhoneWork == null : this.fstrPhoneWork.equals(that.fstrPhoneWork));
    equal = equal && (this.fstrPhoneWorkAction == null ? that.fstrPhoneWorkAction == null : this.fstrPhoneWorkAction.equals(that.fstrPhoneWorkAction));
    equal = equal && (this.fblnPhoneWorkProcessed == null ? that.fblnPhoneWorkProcessed == null : this.fblnPhoneWorkProcessed.equals(that.fblnPhoneWorkProcessed));
    equal = equal && (this.fstrPhoneMobile == null ? that.fstrPhoneMobile == null : this.fstrPhoneMobile.equals(that.fstrPhoneMobile));
    equal = equal && (this.fstrPhoneMobileAction == null ? that.fstrPhoneMobileAction == null : this.fstrPhoneMobileAction.equals(that.fstrPhoneMobileAction));
    equal = equal && (this.fblnPhoneMobileProcessed == null ? that.fblnPhoneMobileProcessed == null : this.fblnPhoneMobileProcessed.equals(that.fblnPhoneMobileProcessed));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailAction == null ? that.fstrEmailAction == null : this.fstrEmailAction.equals(that.fstrEmailAction));
    equal = equal && (this.fblnEmailProcessed == null ? that.fblnEmailProcessed == null : this.fblnEmailProcessed.equals(that.fblnEmailProcessed));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64MaintainLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrAddressAction = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnAddressProcessed = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrPhoneHome = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPhoneHomeAction = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnPhoneHomeProcessed = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrPhoneWork = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPhoneWorkAction = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnPhoneWorkProcessed = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrPhoneMobile = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneMobileAction = JdbcWritableBridge.readString(24, __dbResults);
    this.fblnPhoneMobileProcessed = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrEmailAction = JdbcWritableBridge.readString(27, __dbResults);
    this.fblnEmailProcessed = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(31, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(32, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64MaintainLogKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrAddressAction = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnAddressProcessed = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrPhoneHome = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPhoneHomeAction = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnPhoneHomeProcessed = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrPhoneWork = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPhoneWorkAction = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnPhoneWorkProcessed = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrPhoneMobile = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneMobileAction = JdbcWritableBridge.readString(24, __dbResults);
    this.fblnPhoneMobileProcessed = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrEmailAction = JdbcWritableBridge.readString(27, __dbResults);
    this.fblnEmailProcessed = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(31, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(32, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64MaintainLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressAction, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressProcessed, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHome, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHomeAction, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneHomeProcessed, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWork, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWorkAction, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneWorkProcessed, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobile, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobileAction, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneMobileProcessed, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAction, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEmailProcessed, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 32 + __off, 93, __dbStmt);
    return 32;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64MaintainLogKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressAction, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressProcessed, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHome, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneHomeAction, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneHomeProcessed, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWork, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneWorkAction, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneWorkProcessed, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobile, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMobileAction, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPhoneMobileProcessed, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailAction, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEmailProcessed, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 32 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64MaintainLogKey = null;
    } else {
    this.fi64MaintainLogKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
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
        this.fblnAddressProcessed = null;
    } else {
    this.fblnAddressProcessed = Integer.valueOf(__dataIn.readInt());
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
        this.fblnPhoneHomeProcessed = null;
    } else {
    this.fblnPhoneHomeProcessed = Integer.valueOf(__dataIn.readInt());
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
        this.fblnPhoneWorkProcessed = null;
    } else {
    this.fblnPhoneWorkProcessed = Integer.valueOf(__dataIn.readInt());
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
        this.fblnPhoneMobileProcessed = null;
    } else {
    this.fblnPhoneMobileProcessed = Integer.valueOf(__dataIn.readInt());
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
        this.fblnEmailProcessed = null;
    } else {
    this.fblnEmailProcessed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessed = null;
    } else {
    this.fdtmProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmProcessed.setNanos(__dataIn.readInt());
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
    if (null == this.fi64MaintainLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MaintainLogKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
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
    if (null == this.fblnAddressProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressProcessed);
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
    if (null == this.fblnPhoneHomeProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneHomeProcessed);
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
    if (null == this.fblnPhoneWorkProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneWorkProcessed);
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
    if (null == this.fblnPhoneMobileProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneMobileProcessed);
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
    if (null == this.fblnEmailProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEmailProcessed);
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
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
    if (null == this.fi64MaintainLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MaintainLogKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
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
    if (null == this.fblnAddressProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressProcessed);
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
    if (null == this.fblnPhoneHomeProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneHomeProcessed);
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
    if (null == this.fblnPhoneWorkProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneWorkProcessed);
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
    if (null == this.fblnPhoneMobileProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPhoneMobileProcessed);
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
    if (null == this.fblnEmailProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEmailProcessed);
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MaintainLogKey==null?"\\N":"" + fi64MaintainLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressProcessed==null?"\\N":"" + fblnAddressProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHome==null?"\\N":fstrPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHomeAction==null?"\\N":fstrPhoneHomeAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneHomeProcessed==null?"\\N":"" + fblnPhoneHomeProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWork==null?"\\N":fstrPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWorkAction==null?"\\N":fstrPhoneWorkAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneWorkProcessed==null?"\\N":"" + fblnPhoneWorkProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobile==null?"\\N":fstrPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobileAction==null?"\\N":fstrPhoneMobileAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneMobileProcessed==null?"\\N":"" + fblnPhoneMobileProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAction==null?"\\N":fstrEmailAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEmailProcessed==null?"\\N":"" + fblnEmailProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MaintainLogKey==null?"\\N":"" + fi64MaintainLogKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressProcessed==null?"\\N":"" + fblnAddressProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHome==null?"\\N":fstrPhoneHome, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneHomeAction==null?"\\N":fstrPhoneHomeAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneHomeProcessed==null?"\\N":"" + fblnPhoneHomeProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWork==null?"\\N":fstrPhoneWork, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneWorkAction==null?"\\N":fstrPhoneWorkAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneWorkProcessed==null?"\\N":"" + fblnPhoneWorkProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobile==null?"\\N":fstrPhoneMobile, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMobileAction==null?"\\N":fstrPhoneMobileAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPhoneMobileProcessed==null?"\\N":"" + fblnPhoneMobileProcessed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailAction==null?"\\N":fstrEmailAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEmailProcessed==null?"\\N":"" + fblnEmailProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MaintainLogKey = null; } else {
      this.fi64MaintainLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressProcessed = null; } else {
      this.fblnAddressProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneHomeProcessed = null; } else {
      this.fblnPhoneHomeProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneWorkProcessed = null; } else {
      this.fblnPhoneWorkProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneMobileProcessed = null; } else {
      this.fblnPhoneMobileProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEmailProcessed = null; } else {
      this.fblnEmailProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MaintainLogKey = null; } else {
      this.fi64MaintainLogKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressProcessed = null; } else {
      this.fblnAddressProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneHomeProcessed = null; } else {
      this.fblnPhoneHomeProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneWorkProcessed = null; } else {
      this.fblnPhoneWorkProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPhoneMobileProcessed = null; } else {
      this.fblnPhoneMobileProcessed = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEmailProcessed = null; } else {
      this.fblnEmailProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_studylinkmaintainlog o = (tblnz_studylinkmaintainlog) super.clone();
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_studylinkmaintainlog o) throws CloneNotSupportedException {
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64MaintainLogKey", this.fi64MaintainLogKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrAddressAction", this.fstrAddressAction);
    __sqoop$field_map.put("fblnAddressProcessed", this.fblnAddressProcessed);
    __sqoop$field_map.put("fstrPhoneHome", this.fstrPhoneHome);
    __sqoop$field_map.put("fstrPhoneHomeAction", this.fstrPhoneHomeAction);
    __sqoop$field_map.put("fblnPhoneHomeProcessed", this.fblnPhoneHomeProcessed);
    __sqoop$field_map.put("fstrPhoneWork", this.fstrPhoneWork);
    __sqoop$field_map.put("fstrPhoneWorkAction", this.fstrPhoneWorkAction);
    __sqoop$field_map.put("fblnPhoneWorkProcessed", this.fblnPhoneWorkProcessed);
    __sqoop$field_map.put("fstrPhoneMobile", this.fstrPhoneMobile);
    __sqoop$field_map.put("fstrPhoneMobileAction", this.fstrPhoneMobileAction);
    __sqoop$field_map.put("fblnPhoneMobileProcessed", this.fblnPhoneMobileProcessed);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailAction", this.fstrEmailAction);
    __sqoop$field_map.put("fblnEmailProcessed", this.fblnEmailProcessed);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64MaintainLogKey", this.fi64MaintainLogKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrAddressAction", this.fstrAddressAction);
    __sqoop$field_map.put("fblnAddressProcessed", this.fblnAddressProcessed);
    __sqoop$field_map.put("fstrPhoneHome", this.fstrPhoneHome);
    __sqoop$field_map.put("fstrPhoneHomeAction", this.fstrPhoneHomeAction);
    __sqoop$field_map.put("fblnPhoneHomeProcessed", this.fblnPhoneHomeProcessed);
    __sqoop$field_map.put("fstrPhoneWork", this.fstrPhoneWork);
    __sqoop$field_map.put("fstrPhoneWorkAction", this.fstrPhoneWorkAction);
    __sqoop$field_map.put("fblnPhoneWorkProcessed", this.fblnPhoneWorkProcessed);
    __sqoop$field_map.put("fstrPhoneMobile", this.fstrPhoneMobile);
    __sqoop$field_map.put("fstrPhoneMobileAction", this.fstrPhoneMobileAction);
    __sqoop$field_map.put("fblnPhoneMobileProcessed", this.fblnPhoneMobileProcessed);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailAction", this.fstrEmailAction);
    __sqoop$field_map.put("fblnEmailProcessed", this.fblnEmailProcessed);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
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
