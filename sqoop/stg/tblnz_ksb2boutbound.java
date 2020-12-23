// ORM class for table 'tblnz_ksb2boutbound'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:21:55 NZDT 2020
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

public class tblnz_ksb2boutbound extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64KSB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fi64KSB2BKey = (Long)value;
      }
    });
    setters.put("fi64BinaryDataKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fi64BinaryDataKey = (Long)value;
      }
    });
    setters.put("fstrBatchID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrBatchID = (String)value;
      }
    });
    setters.put("fstrB2BType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrB2BType = (String)value;
      }
    });
    setters.put("fstrB2BMessageType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrB2BMessageType = (String)value;
      }
    });
    setters.put("fstrRecordID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrRecordID = (String)value;
      }
    });
    setters.put("fstrAPI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrAPI = (String)value;
      }
    });
    setters.put("flngSchemeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.flngSchemeAccountKey = (Integer)value;
      }
    });
    setters.put("fstrSchemeIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrSchemeIRDNumber = (String)value;
      }
    });
    setters.put("fstrSchemeID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrSchemeID = (String)value;
      }
    });
    setters.put("fstrTradingPartner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrTradingPartner = (String)value;
      }
    });
    setters.put("flngMemberAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.flngMemberAccountKey = (Integer)value;
      }
    });
    setters.put("flngMemberCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.flngMemberCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrMemberIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrMemberIRDNumber = (String)value;
      }
    });
    setters.put("fi64SourceKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fi64SourceKey = (Long)value;
      }
    });
    setters.put("fstrExternalID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrExternalID = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrManuallyAddedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrManuallyAddedBy = (String)value;
      }
    });
    setters.put("fdtmQueued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fdtmQueued = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProcess", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fdtmProcess = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDeletedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrDeletedBy = (String)value;
      }
    });
    setters.put("fdtmDeleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fdtmDeleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnManual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fblnManual = (Integer)value;
      }
    });
    setters.put("fblnFileCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fblnFileCreated = (Integer)value;
      }
    });
    setters.put("fi64KSB2BLinkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fi64KSB2BLinkKey = (Long)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2boutbound.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksb2boutbound() {
    init0();
  }
  private Long fi64KSB2BKey;
  public Long get_fi64KSB2BKey() {
    return fi64KSB2BKey;
  }
  public void set_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
  }
  public tblnz_ksb2boutbound with_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
    return this;
  }
  private Long fi64BinaryDataKey;
  public Long get_fi64BinaryDataKey() {
    return fi64BinaryDataKey;
  }
  public void set_fi64BinaryDataKey(Long fi64BinaryDataKey) {
    this.fi64BinaryDataKey = fi64BinaryDataKey;
  }
  public tblnz_ksb2boutbound with_fi64BinaryDataKey(Long fi64BinaryDataKey) {
    this.fi64BinaryDataKey = fi64BinaryDataKey;
    return this;
  }
  private String fstrBatchID;
  public String get_fstrBatchID() {
    return fstrBatchID;
  }
  public void set_fstrBatchID(String fstrBatchID) {
    this.fstrBatchID = fstrBatchID;
  }
  public tblnz_ksb2boutbound with_fstrBatchID(String fstrBatchID) {
    this.fstrBatchID = fstrBatchID;
    return this;
  }
  private String fstrB2BType;
  public String get_fstrB2BType() {
    return fstrB2BType;
  }
  public void set_fstrB2BType(String fstrB2BType) {
    this.fstrB2BType = fstrB2BType;
  }
  public tblnz_ksb2boutbound with_fstrB2BType(String fstrB2BType) {
    this.fstrB2BType = fstrB2BType;
    return this;
  }
  private String fstrB2BMessageType;
  public String get_fstrB2BMessageType() {
    return fstrB2BMessageType;
  }
  public void set_fstrB2BMessageType(String fstrB2BMessageType) {
    this.fstrB2BMessageType = fstrB2BMessageType;
  }
  public tblnz_ksb2boutbound with_fstrB2BMessageType(String fstrB2BMessageType) {
    this.fstrB2BMessageType = fstrB2BMessageType;
    return this;
  }
  private String fstrRecordID;
  public String get_fstrRecordID() {
    return fstrRecordID;
  }
  public void set_fstrRecordID(String fstrRecordID) {
    this.fstrRecordID = fstrRecordID;
  }
  public tblnz_ksb2boutbound with_fstrRecordID(String fstrRecordID) {
    this.fstrRecordID = fstrRecordID;
    return this;
  }
  private String fstrAPI;
  public String get_fstrAPI() {
    return fstrAPI;
  }
  public void set_fstrAPI(String fstrAPI) {
    this.fstrAPI = fstrAPI;
  }
  public tblnz_ksb2boutbound with_fstrAPI(String fstrAPI) {
    this.fstrAPI = fstrAPI;
    return this;
  }
  private Integer flngSchemeAccountKey;
  public Integer get_flngSchemeAccountKey() {
    return flngSchemeAccountKey;
  }
  public void set_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
  }
  public tblnz_ksb2boutbound with_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
    return this;
  }
  private String fstrSchemeIRDNumber;
  public String get_fstrSchemeIRDNumber() {
    return fstrSchemeIRDNumber;
  }
  public void set_fstrSchemeIRDNumber(String fstrSchemeIRDNumber) {
    this.fstrSchemeIRDNumber = fstrSchemeIRDNumber;
  }
  public tblnz_ksb2boutbound with_fstrSchemeIRDNumber(String fstrSchemeIRDNumber) {
    this.fstrSchemeIRDNumber = fstrSchemeIRDNumber;
    return this;
  }
  private String fstrSchemeID;
  public String get_fstrSchemeID() {
    return fstrSchemeID;
  }
  public void set_fstrSchemeID(String fstrSchemeID) {
    this.fstrSchemeID = fstrSchemeID;
  }
  public tblnz_ksb2boutbound with_fstrSchemeID(String fstrSchemeID) {
    this.fstrSchemeID = fstrSchemeID;
    return this;
  }
  private String fstrTradingPartner;
  public String get_fstrTradingPartner() {
    return fstrTradingPartner;
  }
  public void set_fstrTradingPartner(String fstrTradingPartner) {
    this.fstrTradingPartner = fstrTradingPartner;
  }
  public tblnz_ksb2boutbound with_fstrTradingPartner(String fstrTradingPartner) {
    this.fstrTradingPartner = fstrTradingPartner;
    return this;
  }
  private Integer flngMemberAccountKey;
  public Integer get_flngMemberAccountKey() {
    return flngMemberAccountKey;
  }
  public void set_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
  }
  public tblnz_ksb2boutbound with_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
    return this;
  }
  private Integer flngMemberCustomerKey;
  public Integer get_flngMemberCustomerKey() {
    return flngMemberCustomerKey;
  }
  public void set_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
  }
  public tblnz_ksb2boutbound with_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
    return this;
  }
  private String fstrMemberIRDNumber;
  public String get_fstrMemberIRDNumber() {
    return fstrMemberIRDNumber;
  }
  public void set_fstrMemberIRDNumber(String fstrMemberIRDNumber) {
    this.fstrMemberIRDNumber = fstrMemberIRDNumber;
  }
  public tblnz_ksb2boutbound with_fstrMemberIRDNumber(String fstrMemberIRDNumber) {
    this.fstrMemberIRDNumber = fstrMemberIRDNumber;
    return this;
  }
  private Long fi64SourceKey;
  public Long get_fi64SourceKey() {
    return fi64SourceKey;
  }
  public void set_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
  }
  public tblnz_ksb2boutbound with_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
    return this;
  }
  private String fstrExternalID;
  public String get_fstrExternalID() {
    return fstrExternalID;
  }
  public void set_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
  }
  public tblnz_ksb2boutbound with_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_ksb2boutbound with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private String fstrManuallyAddedBy;
  public String get_fstrManuallyAddedBy() {
    return fstrManuallyAddedBy;
  }
  public void set_fstrManuallyAddedBy(String fstrManuallyAddedBy) {
    this.fstrManuallyAddedBy = fstrManuallyAddedBy;
  }
  public tblnz_ksb2boutbound with_fstrManuallyAddedBy(String fstrManuallyAddedBy) {
    this.fstrManuallyAddedBy = fstrManuallyAddedBy;
    return this;
  }
  private java.sql.Timestamp fdtmQueued;
  public java.sql.Timestamp get_fdtmQueued() {
    return fdtmQueued;
  }
  public void set_fdtmQueued(java.sql.Timestamp fdtmQueued) {
    this.fdtmQueued = fdtmQueued;
  }
  public tblnz_ksb2boutbound with_fdtmQueued(java.sql.Timestamp fdtmQueued) {
    this.fdtmQueued = fdtmQueued;
    return this;
  }
  private java.sql.Timestamp fdtmProcess;
  public java.sql.Timestamp get_fdtmProcess() {
    return fdtmProcess;
  }
  public void set_fdtmProcess(java.sql.Timestamp fdtmProcess) {
    this.fdtmProcess = fdtmProcess;
  }
  public tblnz_ksb2boutbound with_fdtmProcess(java.sql.Timestamp fdtmProcess) {
    this.fdtmProcess = fdtmProcess;
    return this;
  }
  private String fstrDeletedBy;
  public String get_fstrDeletedBy() {
    return fstrDeletedBy;
  }
  public void set_fstrDeletedBy(String fstrDeletedBy) {
    this.fstrDeletedBy = fstrDeletedBy;
  }
  public tblnz_ksb2boutbound with_fstrDeletedBy(String fstrDeletedBy) {
    this.fstrDeletedBy = fstrDeletedBy;
    return this;
  }
  private java.sql.Timestamp fdtmDeleted;
  public java.sql.Timestamp get_fdtmDeleted() {
    return fdtmDeleted;
  }
  public void set_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
  }
  public tblnz_ksb2boutbound with_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
    return this;
  }
  private Integer fblnManual;
  public Integer get_fblnManual() {
    return fblnManual;
  }
  public void set_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
  }
  public tblnz_ksb2boutbound with_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
    return this;
  }
  private Integer fblnFileCreated;
  public Integer get_fblnFileCreated() {
    return fblnFileCreated;
  }
  public void set_fblnFileCreated(Integer fblnFileCreated) {
    this.fblnFileCreated = fblnFileCreated;
  }
  public tblnz_ksb2boutbound with_fblnFileCreated(Integer fblnFileCreated) {
    this.fblnFileCreated = fblnFileCreated;
    return this;
  }
  private Long fi64KSB2BLinkKey;
  public Long get_fi64KSB2BLinkKey() {
    return fi64KSB2BLinkKey;
  }
  public void set_fi64KSB2BLinkKey(Long fi64KSB2BLinkKey) {
    this.fi64KSB2BLinkKey = fi64KSB2BLinkKey;
  }
  public tblnz_ksb2boutbound with_fi64KSB2BLinkKey(Long fi64KSB2BLinkKey) {
    this.fi64KSB2BLinkKey = fi64KSB2BLinkKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksb2boutbound with_fstrWho(String fstrWho) {
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
  public tblnz_ksb2boutbound with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2boutbound)) {
      return false;
    }
    tblnz_ksb2boutbound that = (tblnz_ksb2boutbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64BinaryDataKey == null ? that.fi64BinaryDataKey == null : this.fi64BinaryDataKey.equals(that.fi64BinaryDataKey));
    equal = equal && (this.fstrBatchID == null ? that.fstrBatchID == null : this.fstrBatchID.equals(that.fstrBatchID));
    equal = equal && (this.fstrB2BType == null ? that.fstrB2BType == null : this.fstrB2BType.equals(that.fstrB2BType));
    equal = equal && (this.fstrB2BMessageType == null ? that.fstrB2BMessageType == null : this.fstrB2BMessageType.equals(that.fstrB2BMessageType));
    equal = equal && (this.fstrRecordID == null ? that.fstrRecordID == null : this.fstrRecordID.equals(that.fstrRecordID));
    equal = equal && (this.fstrAPI == null ? that.fstrAPI == null : this.fstrAPI.equals(that.fstrAPI));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fstrSchemeIRDNumber == null ? that.fstrSchemeIRDNumber == null : this.fstrSchemeIRDNumber.equals(that.fstrSchemeIRDNumber));
    equal = equal && (this.fstrSchemeID == null ? that.fstrSchemeID == null : this.fstrSchemeID.equals(that.fstrSchemeID));
    equal = equal && (this.fstrTradingPartner == null ? that.fstrTradingPartner == null : this.fstrTradingPartner.equals(that.fstrTradingPartner));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.fstrMemberIRDNumber == null ? that.fstrMemberIRDNumber == null : this.fstrMemberIRDNumber.equals(that.fstrMemberIRDNumber));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrManuallyAddedBy == null ? that.fstrManuallyAddedBy == null : this.fstrManuallyAddedBy.equals(that.fstrManuallyAddedBy));
    equal = equal && (this.fdtmQueued == null ? that.fdtmQueued == null : this.fdtmQueued.equals(that.fdtmQueued));
    equal = equal && (this.fdtmProcess == null ? that.fdtmProcess == null : this.fdtmProcess.equals(that.fdtmProcess));
    equal = equal && (this.fstrDeletedBy == null ? that.fstrDeletedBy == null : this.fstrDeletedBy.equals(that.fstrDeletedBy));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fblnFileCreated == null ? that.fblnFileCreated == null : this.fblnFileCreated.equals(that.fblnFileCreated));
    equal = equal && (this.fi64KSB2BLinkKey == null ? that.fi64KSB2BLinkKey == null : this.fi64KSB2BLinkKey.equals(that.fi64KSB2BLinkKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2boutbound)) {
      return false;
    }
    tblnz_ksb2boutbound that = (tblnz_ksb2boutbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64BinaryDataKey == null ? that.fi64BinaryDataKey == null : this.fi64BinaryDataKey.equals(that.fi64BinaryDataKey));
    equal = equal && (this.fstrBatchID == null ? that.fstrBatchID == null : this.fstrBatchID.equals(that.fstrBatchID));
    equal = equal && (this.fstrB2BType == null ? that.fstrB2BType == null : this.fstrB2BType.equals(that.fstrB2BType));
    equal = equal && (this.fstrB2BMessageType == null ? that.fstrB2BMessageType == null : this.fstrB2BMessageType.equals(that.fstrB2BMessageType));
    equal = equal && (this.fstrRecordID == null ? that.fstrRecordID == null : this.fstrRecordID.equals(that.fstrRecordID));
    equal = equal && (this.fstrAPI == null ? that.fstrAPI == null : this.fstrAPI.equals(that.fstrAPI));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fstrSchemeIRDNumber == null ? that.fstrSchemeIRDNumber == null : this.fstrSchemeIRDNumber.equals(that.fstrSchemeIRDNumber));
    equal = equal && (this.fstrSchemeID == null ? that.fstrSchemeID == null : this.fstrSchemeID.equals(that.fstrSchemeID));
    equal = equal && (this.fstrTradingPartner == null ? that.fstrTradingPartner == null : this.fstrTradingPartner.equals(that.fstrTradingPartner));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.fstrMemberIRDNumber == null ? that.fstrMemberIRDNumber == null : this.fstrMemberIRDNumber.equals(that.fstrMemberIRDNumber));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrManuallyAddedBy == null ? that.fstrManuallyAddedBy == null : this.fstrManuallyAddedBy.equals(that.fstrManuallyAddedBy));
    equal = equal && (this.fdtmQueued == null ? that.fdtmQueued == null : this.fdtmQueued.equals(that.fdtmQueued));
    equal = equal && (this.fdtmProcess == null ? that.fdtmProcess == null : this.fdtmProcess.equals(that.fdtmProcess));
    equal = equal && (this.fstrDeletedBy == null ? that.fstrDeletedBy == null : this.fstrDeletedBy.equals(that.fstrDeletedBy));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fblnFileCreated == null ? that.fblnFileCreated == null : this.fblnFileCreated.equals(that.fblnFileCreated));
    equal = equal && (this.fi64KSB2BLinkKey == null ? that.fi64KSB2BLinkKey == null : this.fi64KSB2BLinkKey.equals(that.fi64KSB2BLinkKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64BinaryDataKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrBatchID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrB2BType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrB2BMessageType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecordID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAPI = JdbcWritableBridge.readString(7, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrSchemeIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrSchemeID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTradingPartner = JdbcWritableBridge.readString(11, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrMemberIRDNumber = JdbcWritableBridge.readString(14, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(15, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(16, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrManuallyAddedBy = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmQueued = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmProcess = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrDeletedBy = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnFileCreated = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fi64KSB2BLinkKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64BinaryDataKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrBatchID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrB2BType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrB2BMessageType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecordID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAPI = JdbcWritableBridge.readString(7, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrSchemeIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrSchemeID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTradingPartner = JdbcWritableBridge.readString(11, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrMemberIRDNumber = JdbcWritableBridge.readString(14, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(15, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(16, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrManuallyAddedBy = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmQueued = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmProcess = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrDeletedBy = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnFileCreated = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fi64KSB2BLinkKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BinaryDataKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBatchID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BMessageType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAPI, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTradingPartner, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRDNumber, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrManuallyAddedBy, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmQueued, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcess, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDeletedBy, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFileCreated, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSB2BLinkKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BinaryDataKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBatchID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BMessageType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAPI, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTradingPartner, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRDNumber, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrManuallyAddedBy, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmQueued, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcess, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDeletedBy, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFileCreated, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSB2BLinkKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64KSB2BKey = null;
    } else {
    this.fi64KSB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64BinaryDataKey = null;
    } else {
    this.fi64BinaryDataKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBatchID = null;
    } else {
    this.fstrBatchID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrB2BType = null;
    } else {
    this.fstrB2BType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrB2BMessageType = null;
    } else {
    this.fstrB2BMessageType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecordID = null;
    } else {
    this.fstrRecordID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAPI = null;
    } else {
    this.fstrAPI = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSchemeAccountKey = null;
    } else {
    this.flngSchemeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSchemeIRDNumber = null;
    } else {
    this.fstrSchemeIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSchemeID = null;
    } else {
    this.fstrSchemeID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTradingPartner = null;
    } else {
    this.fstrTradingPartner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngMemberAccountKey = null;
    } else {
    this.flngMemberAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMemberCustomerKey = null;
    } else {
    this.flngMemberCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberIRDNumber = null;
    } else {
    this.fstrMemberIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64SourceKey = null;
    } else {
    this.fi64SourceKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalID = null;
    } else {
    this.fstrExternalID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManuallyAddedBy = null;
    } else {
    this.fstrManuallyAddedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmQueued = null;
    } else {
    this.fdtmQueued = new Timestamp(__dataIn.readLong());
    this.fdtmQueued.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcess = null;
    } else {
    this.fdtmProcess = new Timestamp(__dataIn.readLong());
    this.fdtmProcess.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDeletedBy = null;
    } else {
    this.fstrDeletedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeleted = null;
    } else {
    this.fdtmDeleted = new Timestamp(__dataIn.readLong());
    this.fdtmDeleted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManual = null;
    } else {
    this.fblnManual = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFileCreated = null;
    } else {
    this.fblnFileCreated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64KSB2BLinkKey = null;
    } else {
    this.fi64KSB2BLinkKey = Long.valueOf(__dataIn.readLong());
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64BinaryDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BinaryDataKey);
    }
    if (null == this.fstrBatchID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBatchID);
    }
    if (null == this.fstrB2BType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BType);
    }
    if (null == this.fstrB2BMessageType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BMessageType);
    }
    if (null == this.fstrRecordID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordID);
    }
    if (null == this.fstrAPI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAPI);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
    }
    if (null == this.fstrSchemeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeIRDNumber);
    }
    if (null == this.fstrSchemeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeID);
    }
    if (null == this.fstrTradingPartner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTradingPartner);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.fstrMemberIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRDNumber);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrManuallyAddedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManuallyAddedBy);
    }
    if (null == this.fdtmQueued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmQueued.getTime());
    __dataOut.writeInt(this.fdtmQueued.getNanos());
    }
    if (null == this.fdtmProcess) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcess.getTime());
    __dataOut.writeInt(this.fdtmProcess.getNanos());
    }
    if (null == this.fstrDeletedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDeletedBy);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fblnFileCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFileCreated);
    }
    if (null == this.fi64KSB2BLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BLinkKey);
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64BinaryDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BinaryDataKey);
    }
    if (null == this.fstrBatchID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBatchID);
    }
    if (null == this.fstrB2BType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BType);
    }
    if (null == this.fstrB2BMessageType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BMessageType);
    }
    if (null == this.fstrRecordID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordID);
    }
    if (null == this.fstrAPI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAPI);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
    }
    if (null == this.fstrSchemeIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeIRDNumber);
    }
    if (null == this.fstrSchemeID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeID);
    }
    if (null == this.fstrTradingPartner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTradingPartner);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.fstrMemberIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRDNumber);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrManuallyAddedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManuallyAddedBy);
    }
    if (null == this.fdtmQueued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmQueued.getTime());
    __dataOut.writeInt(this.fdtmQueued.getNanos());
    }
    if (null == this.fdtmProcess) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcess.getTime());
    __dataOut.writeInt(this.fdtmProcess.getNanos());
    }
    if (null == this.fstrDeletedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDeletedBy);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fblnFileCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFileCreated);
    }
    if (null == this.fi64KSB2BLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BLinkKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BinaryDataKey==null?"\\N":"" + fi64BinaryDataKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBatchID==null?"\\N":fstrBatchID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BType==null?"\\N":fstrB2BType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BMessageType==null?"\\N":fstrB2BMessageType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordID==null?"\\N":fstrRecordID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAPI==null?"\\N":fstrAPI, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeIRDNumber==null?"\\N":fstrSchemeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeID==null?"\\N":fstrSchemeID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTradingPartner==null?"\\N":fstrTradingPartner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRDNumber==null?"\\N":fstrMemberIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManuallyAddedBy==null?"\\N":fstrManuallyAddedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmQueued==null?"\\N":"" + fdtmQueued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcess==null?"\\N":"" + fdtmProcess, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDeletedBy==null?"\\N":fstrDeletedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFileCreated==null?"\\N":"" + fblnFileCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BLinkKey==null?"\\N":"" + fi64KSB2BLinkKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BinaryDataKey==null?"\\N":"" + fi64BinaryDataKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBatchID==null?"\\N":fstrBatchID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BType==null?"\\N":fstrB2BType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BMessageType==null?"\\N":fstrB2BMessageType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordID==null?"\\N":fstrRecordID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAPI==null?"\\N":fstrAPI, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeIRDNumber==null?"\\N":fstrSchemeIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeID==null?"\\N":fstrSchemeID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTradingPartner==null?"\\N":fstrTradingPartner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRDNumber==null?"\\N":fstrMemberIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManuallyAddedBy==null?"\\N":fstrManuallyAddedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmQueued==null?"\\N":"" + fdtmQueued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcess==null?"\\N":"" + fdtmProcess, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDeletedBy==null?"\\N":fstrDeletedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFileCreated==null?"\\N":"" + fblnFileCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BLinkKey==null?"\\N":"" + fi64KSB2BLinkKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BinaryDataKey = null; } else {
      this.fi64BinaryDataKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBatchID = null; } else {
      this.fstrBatchID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BType = null; } else {
      this.fstrB2BType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BMessageType = null; } else {
      this.fstrB2BMessageType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordID = null; } else {
      this.fstrRecordID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAPI = null; } else {
      this.fstrAPI = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeIRDNumber = null; } else {
      this.fstrSchemeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeID = null; } else {
      this.fstrSchemeID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTradingPartner = null; } else {
      this.fstrTradingPartner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRDNumber = null; } else {
      this.fstrMemberIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManuallyAddedBy = null; } else {
      this.fstrManuallyAddedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmQueued = null; } else {
      this.fdtmQueued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcess = null; } else {
      this.fdtmProcess = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDeletedBy = null; } else {
      this.fstrDeletedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFileCreated = null; } else {
      this.fblnFileCreated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BLinkKey = null; } else {
      this.fi64KSB2BLinkKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BinaryDataKey = null; } else {
      this.fi64BinaryDataKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBatchID = null; } else {
      this.fstrBatchID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BType = null; } else {
      this.fstrB2BType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BMessageType = null; } else {
      this.fstrB2BMessageType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordID = null; } else {
      this.fstrRecordID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAPI = null; } else {
      this.fstrAPI = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeIRDNumber = null; } else {
      this.fstrSchemeIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeID = null; } else {
      this.fstrSchemeID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTradingPartner = null; } else {
      this.fstrTradingPartner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRDNumber = null; } else {
      this.fstrMemberIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManuallyAddedBy = null; } else {
      this.fstrManuallyAddedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmQueued = null; } else {
      this.fdtmQueued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcess = null; } else {
      this.fdtmProcess = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDeletedBy = null; } else {
      this.fstrDeletedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFileCreated = null; } else {
      this.fblnFileCreated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BLinkKey = null; } else {
      this.fi64KSB2BLinkKey = Long.valueOf(__cur_str);
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
    tblnz_ksb2boutbound o = (tblnz_ksb2boutbound) super.clone();
    o.fdtmQueued = (o.fdtmQueued != null) ? (java.sql.Timestamp) o.fdtmQueued.clone() : null;
    o.fdtmProcess = (o.fdtmProcess != null) ? (java.sql.Timestamp) o.fdtmProcess.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksb2boutbound o) throws CloneNotSupportedException {
    o.fdtmQueued = (o.fdtmQueued != null) ? (java.sql.Timestamp) o.fdtmQueued.clone() : null;
    o.fdtmProcess = (o.fdtmProcess != null) ? (java.sql.Timestamp) o.fdtmProcess.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64BinaryDataKey", this.fi64BinaryDataKey);
    __sqoop$field_map.put("fstrBatchID", this.fstrBatchID);
    __sqoop$field_map.put("fstrB2BType", this.fstrB2BType);
    __sqoop$field_map.put("fstrB2BMessageType", this.fstrB2BMessageType);
    __sqoop$field_map.put("fstrRecordID", this.fstrRecordID);
    __sqoop$field_map.put("fstrAPI", this.fstrAPI);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fstrSchemeIRDNumber", this.fstrSchemeIRDNumber);
    __sqoop$field_map.put("fstrSchemeID", this.fstrSchemeID);
    __sqoop$field_map.put("fstrTradingPartner", this.fstrTradingPartner);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("fstrMemberIRDNumber", this.fstrMemberIRDNumber);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrManuallyAddedBy", this.fstrManuallyAddedBy);
    __sqoop$field_map.put("fdtmQueued", this.fdtmQueued);
    __sqoop$field_map.put("fdtmProcess", this.fdtmProcess);
    __sqoop$field_map.put("fstrDeletedBy", this.fstrDeletedBy);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fblnFileCreated", this.fblnFileCreated);
    __sqoop$field_map.put("fi64KSB2BLinkKey", this.fi64KSB2BLinkKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64BinaryDataKey", this.fi64BinaryDataKey);
    __sqoop$field_map.put("fstrBatchID", this.fstrBatchID);
    __sqoop$field_map.put("fstrB2BType", this.fstrB2BType);
    __sqoop$field_map.put("fstrB2BMessageType", this.fstrB2BMessageType);
    __sqoop$field_map.put("fstrRecordID", this.fstrRecordID);
    __sqoop$field_map.put("fstrAPI", this.fstrAPI);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fstrSchemeIRDNumber", this.fstrSchemeIRDNumber);
    __sqoop$field_map.put("fstrSchemeID", this.fstrSchemeID);
    __sqoop$field_map.put("fstrTradingPartner", this.fstrTradingPartner);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("fstrMemberIRDNumber", this.fstrMemberIRDNumber);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrManuallyAddedBy", this.fstrManuallyAddedBy);
    __sqoop$field_map.put("fdtmQueued", this.fdtmQueued);
    __sqoop$field_map.put("fdtmProcess", this.fdtmProcess);
    __sqoop$field_map.put("fstrDeletedBy", this.fstrDeletedBy);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fblnFileCreated", this.fblnFileCreated);
    __sqoop$field_map.put("fi64KSB2BLinkKey", this.fi64KSB2BLinkKey);
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
