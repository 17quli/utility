// ORM class for table 'tblworkdetailcompleted'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:51:49 NZDT 2020
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

public class tblworkdetailcompleted extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("fstrWorkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrWorkType = (String)value;
      }
    });
    setters.put("fstrWorkCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrWorkCategory = (String)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAssigned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmAssigned = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCompleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmCompleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAborted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmAborted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDueTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmDueTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAvailable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmAvailable = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmExpire", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmExpire = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrOwner = (String)value;
      }
    });
    setters.put("fstrSubscriber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrSubscriber = (String)value;
      }
    });
    setters.put("fstrNote", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrNote = (String)value;
      }
    });
    setters.put("fstrReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrReason = (String)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrSource = (String)value;
      }
    });
    setters.put("fblnHasWorkData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fblnHasWorkData = (Integer)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fblnValid = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fintProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fintProfile = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrStage = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrExternalID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrExternalID = (String)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("fstrIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrIndicator = (String)value;
      }
    });
    setters.put("flngCRMKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.flngCRMKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworkdetailcompleted.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblworkdetailcompleted() {
    init0();
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tblworkdetailcompleted with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private String fstrWorkType;
  public String get_fstrWorkType() {
    return fstrWorkType;
  }
  public void set_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
  }
  public tblworkdetailcompleted with_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
    return this;
  }
  private String fstrWorkCategory;
  public String get_fstrWorkCategory() {
    return fstrWorkCategory;
  }
  public void set_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
  }
  public tblworkdetailcompleted with_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblworkdetailcompleted with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblworkdetailcompleted with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblworkdetailcompleted with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private java.sql.Timestamp fdtmAssigned;
  public java.sql.Timestamp get_fdtmAssigned() {
    return fdtmAssigned;
  }
  public void set_fdtmAssigned(java.sql.Timestamp fdtmAssigned) {
    this.fdtmAssigned = fdtmAssigned;
  }
  public tblworkdetailcompleted with_fdtmAssigned(java.sql.Timestamp fdtmAssigned) {
    this.fdtmAssigned = fdtmAssigned;
    return this;
  }
  private java.sql.Timestamp fdtmCompleted;
  public java.sql.Timestamp get_fdtmCompleted() {
    return fdtmCompleted;
  }
  public void set_fdtmCompleted(java.sql.Timestamp fdtmCompleted) {
    this.fdtmCompleted = fdtmCompleted;
  }
  public tblworkdetailcompleted with_fdtmCompleted(java.sql.Timestamp fdtmCompleted) {
    this.fdtmCompleted = fdtmCompleted;
    return this;
  }
  private java.sql.Timestamp fdtmAborted;
  public java.sql.Timestamp get_fdtmAborted() {
    return fdtmAborted;
  }
  public void set_fdtmAborted(java.sql.Timestamp fdtmAborted) {
    this.fdtmAborted = fdtmAborted;
  }
  public tblworkdetailcompleted with_fdtmAborted(java.sql.Timestamp fdtmAborted) {
    this.fdtmAborted = fdtmAborted;
    return this;
  }
  private java.sql.Timestamp fdtmDue;
  public java.sql.Timestamp get_fdtmDue() {
    return fdtmDue;
  }
  public void set_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
  }
  public tblworkdetailcompleted with_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
    return this;
  }
  private java.sql.Timestamp fdtmDueTime;
  public java.sql.Timestamp get_fdtmDueTime() {
    return fdtmDueTime;
  }
  public void set_fdtmDueTime(java.sql.Timestamp fdtmDueTime) {
    this.fdtmDueTime = fdtmDueTime;
  }
  public tblworkdetailcompleted with_fdtmDueTime(java.sql.Timestamp fdtmDueTime) {
    this.fdtmDueTime = fdtmDueTime;
    return this;
  }
  private java.sql.Timestamp fdtmAvailable;
  public java.sql.Timestamp get_fdtmAvailable() {
    return fdtmAvailable;
  }
  public void set_fdtmAvailable(java.sql.Timestamp fdtmAvailable) {
    this.fdtmAvailable = fdtmAvailable;
  }
  public tblworkdetailcompleted with_fdtmAvailable(java.sql.Timestamp fdtmAvailable) {
    this.fdtmAvailable = fdtmAvailable;
    return this;
  }
  private java.sql.Timestamp fdtmExpire;
  public java.sql.Timestamp get_fdtmExpire() {
    return fdtmExpire;
  }
  public void set_fdtmExpire(java.sql.Timestamp fdtmExpire) {
    this.fdtmExpire = fdtmExpire;
  }
  public tblworkdetailcompleted with_fdtmExpire(java.sql.Timestamp fdtmExpire) {
    this.fdtmExpire = fdtmExpire;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblworkdetailcompleted with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private String fstrSubscriber;
  public String get_fstrSubscriber() {
    return fstrSubscriber;
  }
  public void set_fstrSubscriber(String fstrSubscriber) {
    this.fstrSubscriber = fstrSubscriber;
  }
  public tblworkdetailcompleted with_fstrSubscriber(String fstrSubscriber) {
    this.fstrSubscriber = fstrSubscriber;
    return this;
  }
  private String fstrNote;
  public String get_fstrNote() {
    return fstrNote;
  }
  public void set_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
  }
  public tblworkdetailcompleted with_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
    return this;
  }
  private String fstrReason;
  public String get_fstrReason() {
    return fstrReason;
  }
  public void set_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
  }
  public tblworkdetailcompleted with_fstrReason(String fstrReason) {
    this.fstrReason = fstrReason;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblworkdetailcompleted with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private Integer fblnHasWorkData;
  public Integer get_fblnHasWorkData() {
    return fblnHasWorkData;
  }
  public void set_fblnHasWorkData(Integer fblnHasWorkData) {
    this.fblnHasWorkData = fblnHasWorkData;
  }
  public tblworkdetailcompleted with_fblnHasWorkData(Integer fblnHasWorkData) {
    this.fblnHasWorkData = fblnHasWorkData;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblworkdetailcompleted with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblworkdetailcompleted with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer fintProfile;
  public Integer get_fintProfile() {
    return fintProfile;
  }
  public void set_fintProfile(Integer fintProfile) {
    this.fintProfile = fintProfile;
  }
  public tblworkdetailcompleted with_fintProfile(Integer fintProfile) {
    this.fintProfile = fintProfile;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblworkdetailcompleted with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmPeriod;
  public java.sql.Timestamp get_fdtmPeriod() {
    return fdtmPeriod;
  }
  public void set_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
  }
  public tblworkdetailcompleted with_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblworkdetailcompleted with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblworkdetailcompleted with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblworkdetailcompleted with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private String fstrExternalID;
  public String get_fstrExternalID() {
    return fstrExternalID;
  }
  public void set_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
  }
  public tblworkdetailcompleted with_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblworkdetailcompleted with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblworkdetailcompleted with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private String fstrIndicator;
  public String get_fstrIndicator() {
    return fstrIndicator;
  }
  public void set_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
  }
  public tblworkdetailcompleted with_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
    return this;
  }
  private Integer flngCRMKey;
  public Integer get_flngCRMKey() {
    return flngCRMKey;
  }
  public void set_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
  }
  public tblworkdetailcompleted with_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblworkdetailcompleted with_fstrWho(String fstrWho) {
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
  public tblworkdetailcompleted with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworkdetailcompleted)) {
      return false;
    }
    tblworkdetailcompleted that = (tblworkdetailcompleted) o;
    boolean equal = true;
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmAssigned == null ? that.fdtmAssigned == null : this.fdtmAssigned.equals(that.fdtmAssigned));
    equal = equal && (this.fdtmCompleted == null ? that.fdtmCompleted == null : this.fdtmCompleted.equals(that.fdtmCompleted));
    equal = equal && (this.fdtmAborted == null ? that.fdtmAborted == null : this.fdtmAborted.equals(that.fdtmAborted));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fdtmDueTime == null ? that.fdtmDueTime == null : this.fdtmDueTime.equals(that.fdtmDueTime));
    equal = equal && (this.fdtmAvailable == null ? that.fdtmAvailable == null : this.fdtmAvailable.equals(that.fdtmAvailable));
    equal = equal && (this.fdtmExpire == null ? that.fdtmExpire == null : this.fdtmExpire.equals(that.fdtmExpire));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrSubscriber == null ? that.fstrSubscriber == null : this.fstrSubscriber.equals(that.fstrSubscriber));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fblnHasWorkData == null ? that.fblnHasWorkData == null : this.fblnHasWorkData.equals(that.fblnHasWorkData));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfile == null ? that.fintProfile == null : this.fintProfile.equals(that.fintProfile));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworkdetailcompleted)) {
      return false;
    }
    tblworkdetailcompleted that = (tblworkdetailcompleted) o;
    boolean equal = true;
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmAssigned == null ? that.fdtmAssigned == null : this.fdtmAssigned.equals(that.fdtmAssigned));
    equal = equal && (this.fdtmCompleted == null ? that.fdtmCompleted == null : this.fdtmCompleted.equals(that.fdtmCompleted));
    equal = equal && (this.fdtmAborted == null ? that.fdtmAborted == null : this.fdtmAborted.equals(that.fdtmAborted));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fdtmDueTime == null ? that.fdtmDueTime == null : this.fdtmDueTime.equals(that.fdtmDueTime));
    equal = equal && (this.fdtmAvailable == null ? that.fdtmAvailable == null : this.fdtmAvailable.equals(that.fdtmAvailable));
    equal = equal && (this.fdtmExpire == null ? that.fdtmExpire == null : this.fdtmExpire.equals(that.fdtmExpire));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrSubscriber == null ? that.fstrSubscriber == null : this.fstrSubscriber.equals(that.fstrSubscriber));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.fstrReason == null ? that.fstrReason == null : this.fstrReason.equals(that.fstrReason));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fblnHasWorkData == null ? that.fblnHasWorkData == null : this.fblnHasWorkData.equals(that.fblnHasWorkData));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfile == null ? that.fintProfile == null : this.fintProfile.equals(that.fintProfile));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngWorkKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWorkType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmAssigned = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmCompleted = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmAborted = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmDueTime = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmAvailable = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmExpire = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrSubscriber = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnHasWorkData = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fintProfile = JdbcWritableBridge.readInteger(22, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(28, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrIndicator = JdbcWritableBridge.readString(31, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(33, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngWorkKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWorkType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmAssigned = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmCompleted = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmAborted = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmDueTime = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmAvailable = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmExpire = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrSubscriber = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrReason = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnHasWorkData = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fintProfile = JdbcWritableBridge.readInteger(22, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(28, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrIndicator = JdbcWritableBridge.readString(31, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(33, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(34, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngWorkKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAssigned, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCompleted, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAborted, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDueTime, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAvailable, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpire, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubscriber, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasWorkData, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfile, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIndicator, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 34 + __off, 93, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngWorkKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAssigned, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCompleted, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAborted, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDueTime, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAvailable, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpire, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubscriber, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReason, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasWorkData, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfile, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIndicator, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 34 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkType = null;
    } else {
    this.fstrWorkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkCategory = null;
    } else {
    this.fstrWorkCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAssigned = null;
    } else {
    this.fdtmAssigned = new Timestamp(__dataIn.readLong());
    this.fdtmAssigned.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCompleted = null;
    } else {
    this.fdtmCompleted = new Timestamp(__dataIn.readLong());
    this.fdtmCompleted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAborted = null;
    } else {
    this.fdtmAborted = new Timestamp(__dataIn.readLong());
    this.fdtmAborted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDue = null;
    } else {
    this.fdtmDue = new Timestamp(__dataIn.readLong());
    this.fdtmDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDueTime = null;
    } else {
    this.fdtmDueTime = new Timestamp(__dataIn.readLong());
    this.fdtmDueTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAvailable = null;
    } else {
    this.fdtmAvailable = new Timestamp(__dataIn.readLong());
    this.fdtmAvailable.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExpire = null;
    } else {
    this.fdtmExpire = new Timestamp(__dataIn.readLong());
    this.fdtmExpire.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubscriber = null;
    } else {
    this.fstrSubscriber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNote = null;
    } else {
    this.fstrNote = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReason = null;
    } else {
    this.fstrReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHasWorkData = null;
    } else {
    this.fblnHasWorkData = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfile = null;
    } else {
    this.fintProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPeriod = null;
    } else {
    this.fdtmPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalID = null;
    } else {
    this.fstrExternalID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIndicator = null;
    } else {
    this.fstrIndicator = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCRMKey = null;
    } else {
    this.flngCRMKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmAssigned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAssigned.getTime());
    __dataOut.writeInt(this.fdtmAssigned.getNanos());
    }
    if (null == this.fdtmCompleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCompleted.getTime());
    __dataOut.writeInt(this.fdtmCompleted.getNanos());
    }
    if (null == this.fdtmAborted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAborted.getTime());
    __dataOut.writeInt(this.fdtmAborted.getNanos());
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fdtmDueTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDueTime.getTime());
    __dataOut.writeInt(this.fdtmDueTime.getNanos());
    }
    if (null == this.fdtmAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAvailable.getTime());
    __dataOut.writeInt(this.fdtmAvailable.getNanos());
    }
    if (null == this.fdtmExpire) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpire.getTime());
    __dataOut.writeInt(this.fdtmExpire.getNanos());
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrSubscriber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubscriber);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fblnHasWorkData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasWorkData);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfile);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
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
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmAssigned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAssigned.getTime());
    __dataOut.writeInt(this.fdtmAssigned.getNanos());
    }
    if (null == this.fdtmCompleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCompleted.getTime());
    __dataOut.writeInt(this.fdtmCompleted.getNanos());
    }
    if (null == this.fdtmAborted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAborted.getTime());
    __dataOut.writeInt(this.fdtmAborted.getNanos());
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fdtmDueTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDueTime.getTime());
    __dataOut.writeInt(this.fdtmDueTime.getNanos());
    }
    if (null == this.fdtmAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAvailable.getTime());
    __dataOut.writeInt(this.fdtmAvailable.getNanos());
    }
    if (null == this.fdtmExpire) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpire.getTime());
    __dataOut.writeInt(this.fdtmExpire.getNanos());
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrSubscriber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubscriber);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.fstrReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReason);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fblnHasWorkData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasWorkData);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfile);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAssigned==null?"\\N":"" + fdtmAssigned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCompleted==null?"\\N":"" + fdtmCompleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAborted==null?"\\N":"" + fdtmAborted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDueTime==null?"\\N":"" + fdtmDueTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAvailable==null?"\\N":"" + fdtmAvailable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpire==null?"\\N":"" + fdtmExpire, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubscriber==null?"\\N":fstrSubscriber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasWorkData==null?"\\N":"" + fblnHasWorkData, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfile==null?"\\N":"" + fintProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAssigned==null?"\\N":"" + fdtmAssigned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCompleted==null?"\\N":"" + fdtmCompleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAborted==null?"\\N":"" + fdtmAborted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDueTime==null?"\\N":"" + fdtmDueTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAvailable==null?"\\N":"" + fdtmAvailable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpire==null?"\\N":"" + fdtmExpire, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubscriber==null?"\\N":fstrSubscriber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReason==null?"\\N":fstrReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasWorkData==null?"\\N":"" + fblnHasWorkData, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfile==null?"\\N":"" + fintProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAssigned = null; } else {
      this.fdtmAssigned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCompleted = null; } else {
      this.fdtmCompleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAborted = null; } else {
      this.fdtmAborted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDueTime = null; } else {
      this.fdtmDueTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAvailable = null; } else {
      this.fdtmAvailable = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpire = null; } else {
      this.fdtmExpire = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubscriber = null; } else {
      this.fstrSubscriber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasWorkData = null; } else {
      this.fblnHasWorkData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfile = null; } else {
      this.fintProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAssigned = null; } else {
      this.fdtmAssigned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCompleted = null; } else {
      this.fdtmCompleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAborted = null; } else {
      this.fdtmAborted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDueTime = null; } else {
      this.fdtmDueTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAvailable = null; } else {
      this.fdtmAvailable = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpire = null; } else {
      this.fdtmExpire = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubscriber = null; } else {
      this.fstrSubscriber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReason = null; } else {
      this.fstrReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasWorkData = null; } else {
      this.fblnHasWorkData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfile = null; } else {
      this.fintProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
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
    tblworkdetailcompleted o = (tblworkdetailcompleted) super.clone();
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmAssigned = (o.fdtmAssigned != null) ? (java.sql.Timestamp) o.fdtmAssigned.clone() : null;
    o.fdtmCompleted = (o.fdtmCompleted != null) ? (java.sql.Timestamp) o.fdtmCompleted.clone() : null;
    o.fdtmAborted = (o.fdtmAborted != null) ? (java.sql.Timestamp) o.fdtmAborted.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmDueTime = (o.fdtmDueTime != null) ? (java.sql.Timestamp) o.fdtmDueTime.clone() : null;
    o.fdtmAvailable = (o.fdtmAvailable != null) ? (java.sql.Timestamp) o.fdtmAvailable.clone() : null;
    o.fdtmExpire = (o.fdtmExpire != null) ? (java.sql.Timestamp) o.fdtmExpire.clone() : null;
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblworkdetailcompleted o) throws CloneNotSupportedException {
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmAssigned = (o.fdtmAssigned != null) ? (java.sql.Timestamp) o.fdtmAssigned.clone() : null;
    o.fdtmCompleted = (o.fdtmCompleted != null) ? (java.sql.Timestamp) o.fdtmCompleted.clone() : null;
    o.fdtmAborted = (o.fdtmAborted != null) ? (java.sql.Timestamp) o.fdtmAborted.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmDueTime = (o.fdtmDueTime != null) ? (java.sql.Timestamp) o.fdtmDueTime.clone() : null;
    o.fdtmAvailable = (o.fdtmAvailable != null) ? (java.sql.Timestamp) o.fdtmAvailable.clone() : null;
    o.fdtmExpire = (o.fdtmExpire != null) ? (java.sql.Timestamp) o.fdtmExpire.clone() : null;
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmAssigned", this.fdtmAssigned);
    __sqoop$field_map.put("fdtmCompleted", this.fdtmCompleted);
    __sqoop$field_map.put("fdtmAborted", this.fdtmAborted);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fdtmDueTime", this.fdtmDueTime);
    __sqoop$field_map.put("fdtmAvailable", this.fdtmAvailable);
    __sqoop$field_map.put("fdtmExpire", this.fdtmExpire);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrSubscriber", this.fstrSubscriber);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fblnHasWorkData", this.fblnHasWorkData);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfile", this.fintProfile);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmAssigned", this.fdtmAssigned);
    __sqoop$field_map.put("fdtmCompleted", this.fdtmCompleted);
    __sqoop$field_map.put("fdtmAborted", this.fdtmAborted);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fdtmDueTime", this.fdtmDueTime);
    __sqoop$field_map.put("fdtmAvailable", this.fdtmAvailable);
    __sqoop$field_map.put("fdtmExpire", this.fdtmExpire);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrSubscriber", this.fstrSubscriber);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("fstrReason", this.fstrReason);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fblnHasWorkData", this.fblnHasWorkData);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfile", this.fintProfile);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
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
