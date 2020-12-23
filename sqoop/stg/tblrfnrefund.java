// ORM class for table 'tblrfnrefund'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:34:55 NZDT 2020
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

public class tblrfnrefund extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRefundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngRefundKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngBatchKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngBatchKey = (Integer)value;
      }
    });
    setters.put("fstrRefundId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRefundId = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrOwner = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngTrusteeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngTrusteeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngTrusteeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngTrusteeAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRefundType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRefundType = (String)value;
      }
    });
    setters.put("fstrApprovalLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrApprovalLevel = (String)value;
      }
    });
    setters.put("fcurRange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fcurRange = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRefundStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRefundStage = (String)value;
      }
    });
    setters.put("fdtmStageDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmStageDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRefundStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRefundStatus = (String)value;
      }
    });
    setters.put("fdtmStatusDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmStatusDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStatusChangedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrStatusChangedBy = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrRefundChannel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRefundChannel = (String)value;
      }
    });
    setters.put("fdtmRequested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmRequested = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrCreatedBy = (String)value;
      }
    });
    setters.put("fblnSystemCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fblnSystemCreated = (Integer)value;
      }
    });
    setters.put("fcurRequestedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fcurRequestedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmVerified = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrVerifiedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrVerifiedBy = (String)value;
      }
    });
    setters.put("fdtmExternalInterceptSent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmExternalInterceptSent = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrApprovedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrApprovedBy = (String)value;
      }
    });
    setters.put("fblnAutoApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fblnAutoApproved = (Integer)value;
      }
    });
    setters.put("fcurPostedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fcurPostedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMinimumAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fcurMinimumAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmRejected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmRejected = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRejectedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRejectedBy = (String)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReversedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrReversedBy = (String)value;
      }
    });
    setters.put("fdtmReleased", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmReleased = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReleasedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrReleasedBy = (String)value;
      }
    });
    setters.put("fdtmFileCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmFileCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmIssued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmIssued = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCheckNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrCheckNumber = (String)value;
      }
    });
    setters.put("fdtmReturned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmReturned = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPaperIssued", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmPaperIssued = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReconciled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmReconciled = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmRedeemed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmRedeemed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmUnclaimedProperty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmUnclaimedProperty = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBankAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrBankAccountType = (String)value;
      }
    });
    setters.put("flngBankAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngBankAccountKey = (Integer)value;
      }
    });
    setters.put("flngBankAccountVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngBankAccountVerLast = (Integer)value;
      }
    });
    setters.put("flngBankAccountRefundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngBankAccountRefundKey = (Integer)value;
      }
    });
    setters.put("fstrRoutingTransit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrRoutingTransit = (String)value;
      }
    });
    setters.put("fstrAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrAccountNumber = (String)value;
      }
    });
    setters.put("flngSourceRefundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngSourceRefundKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrExternalId = (String)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrScheduleNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrScheduleNumber = (String)value;
      }
    });
    setters.put("fdtmAvailable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmAvailable = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefund.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblrfnrefund() {
    init0();
  }
  private Integer flngRefundKey;
  public Integer get_flngRefundKey() {
    return flngRefundKey;
  }
  public void set_flngRefundKey(Integer flngRefundKey) {
    this.flngRefundKey = flngRefundKey;
  }
  public tblrfnrefund with_flngRefundKey(Integer flngRefundKey) {
    this.flngRefundKey = flngRefundKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblrfnrefund with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblrfnrefund with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngBatchKey;
  public Integer get_flngBatchKey() {
    return flngBatchKey;
  }
  public void set_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
  }
  public tblrfnrefund with_flngBatchKey(Integer flngBatchKey) {
    this.flngBatchKey = flngBatchKey;
    return this;
  }
  private String fstrRefundId;
  public String get_fstrRefundId() {
    return fstrRefundId;
  }
  public void set_fstrRefundId(String fstrRefundId) {
    this.fstrRefundId = fstrRefundId;
  }
  public tblrfnrefund with_fstrRefundId(String fstrRefundId) {
    this.fstrRefundId = fstrRefundId;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblrfnrefund with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblrfnrefund with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngTrusteeCustomerKey;
  public Integer get_flngTrusteeCustomerKey() {
    return flngTrusteeCustomerKey;
  }
  public void set_flngTrusteeCustomerKey(Integer flngTrusteeCustomerKey) {
    this.flngTrusteeCustomerKey = flngTrusteeCustomerKey;
  }
  public tblrfnrefund with_flngTrusteeCustomerKey(Integer flngTrusteeCustomerKey) {
    this.flngTrusteeCustomerKey = flngTrusteeCustomerKey;
    return this;
  }
  private Integer flngTrusteeAccountKey;
  public Integer get_flngTrusteeAccountKey() {
    return flngTrusteeAccountKey;
  }
  public void set_flngTrusteeAccountKey(Integer flngTrusteeAccountKey) {
    this.flngTrusteeAccountKey = flngTrusteeAccountKey;
  }
  public tblrfnrefund with_flngTrusteeAccountKey(Integer flngTrusteeAccountKey) {
    this.flngTrusteeAccountKey = flngTrusteeAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblrfnrefund with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrRefundType;
  public String get_fstrRefundType() {
    return fstrRefundType;
  }
  public void set_fstrRefundType(String fstrRefundType) {
    this.fstrRefundType = fstrRefundType;
  }
  public tblrfnrefund with_fstrRefundType(String fstrRefundType) {
    this.fstrRefundType = fstrRefundType;
    return this;
  }
  private String fstrApprovalLevel;
  public String get_fstrApprovalLevel() {
    return fstrApprovalLevel;
  }
  public void set_fstrApprovalLevel(String fstrApprovalLevel) {
    this.fstrApprovalLevel = fstrApprovalLevel;
  }
  public tblrfnrefund with_fstrApprovalLevel(String fstrApprovalLevel) {
    this.fstrApprovalLevel = fstrApprovalLevel;
    return this;
  }
  private java.math.BigDecimal fcurRange;
  public java.math.BigDecimal get_fcurRange() {
    return fcurRange;
  }
  public void set_fcurRange(java.math.BigDecimal fcurRange) {
    this.fcurRange = fcurRange;
  }
  public tblrfnrefund with_fcurRange(java.math.BigDecimal fcurRange) {
    this.fcurRange = fcurRange;
    return this;
  }
  private String fstrRefundStage;
  public String get_fstrRefundStage() {
    return fstrRefundStage;
  }
  public void set_fstrRefundStage(String fstrRefundStage) {
    this.fstrRefundStage = fstrRefundStage;
  }
  public tblrfnrefund with_fstrRefundStage(String fstrRefundStage) {
    this.fstrRefundStage = fstrRefundStage;
    return this;
  }
  private java.sql.Timestamp fdtmStageDate;
  public java.sql.Timestamp get_fdtmStageDate() {
    return fdtmStageDate;
  }
  public void set_fdtmStageDate(java.sql.Timestamp fdtmStageDate) {
    this.fdtmStageDate = fdtmStageDate;
  }
  public tblrfnrefund with_fdtmStageDate(java.sql.Timestamp fdtmStageDate) {
    this.fdtmStageDate = fdtmStageDate;
    return this;
  }
  private String fstrRefundStatus;
  public String get_fstrRefundStatus() {
    return fstrRefundStatus;
  }
  public void set_fstrRefundStatus(String fstrRefundStatus) {
    this.fstrRefundStatus = fstrRefundStatus;
  }
  public tblrfnrefund with_fstrRefundStatus(String fstrRefundStatus) {
    this.fstrRefundStatus = fstrRefundStatus;
    return this;
  }
  private java.sql.Timestamp fdtmStatusDate;
  public java.sql.Timestamp get_fdtmStatusDate() {
    return fdtmStatusDate;
  }
  public void set_fdtmStatusDate(java.sql.Timestamp fdtmStatusDate) {
    this.fdtmStatusDate = fdtmStatusDate;
  }
  public tblrfnrefund with_fdtmStatusDate(java.sql.Timestamp fdtmStatusDate) {
    this.fdtmStatusDate = fdtmStatusDate;
    return this;
  }
  private String fstrStatusChangedBy;
  public String get_fstrStatusChangedBy() {
    return fstrStatusChangedBy;
  }
  public void set_fstrStatusChangedBy(String fstrStatusChangedBy) {
    this.fstrStatusChangedBy = fstrStatusChangedBy;
  }
  public tblrfnrefund with_fstrStatusChangedBy(String fstrStatusChangedBy) {
    this.fstrStatusChangedBy = fstrStatusChangedBy;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblrfnrefund with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrRefundChannel;
  public String get_fstrRefundChannel() {
    return fstrRefundChannel;
  }
  public void set_fstrRefundChannel(String fstrRefundChannel) {
    this.fstrRefundChannel = fstrRefundChannel;
  }
  public tblrfnrefund with_fstrRefundChannel(String fstrRefundChannel) {
    this.fstrRefundChannel = fstrRefundChannel;
    return this;
  }
  private java.sql.Timestamp fdtmRequested;
  public java.sql.Timestamp get_fdtmRequested() {
    return fdtmRequested;
  }
  public void set_fdtmRequested(java.sql.Timestamp fdtmRequested) {
    this.fdtmRequested = fdtmRequested;
  }
  public tblrfnrefund with_fdtmRequested(java.sql.Timestamp fdtmRequested) {
    this.fdtmRequested = fdtmRequested;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblrfnrefund with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrCreatedBy;
  public String get_fstrCreatedBy() {
    return fstrCreatedBy;
  }
  public void set_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
  }
  public tblrfnrefund with_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
    return this;
  }
  private Integer fblnSystemCreated;
  public Integer get_fblnSystemCreated() {
    return fblnSystemCreated;
  }
  public void set_fblnSystemCreated(Integer fblnSystemCreated) {
    this.fblnSystemCreated = fblnSystemCreated;
  }
  public tblrfnrefund with_fblnSystemCreated(Integer fblnSystemCreated) {
    this.fblnSystemCreated = fblnSystemCreated;
    return this;
  }
  private java.math.BigDecimal fcurRequestedAmount;
  public java.math.BigDecimal get_fcurRequestedAmount() {
    return fcurRequestedAmount;
  }
  public void set_fcurRequestedAmount(java.math.BigDecimal fcurRequestedAmount) {
    this.fcurRequestedAmount = fcurRequestedAmount;
  }
  public tblrfnrefund with_fcurRequestedAmount(java.math.BigDecimal fcurRequestedAmount) {
    this.fcurRequestedAmount = fcurRequestedAmount;
    return this;
  }
  private java.sql.Timestamp fdtmVerified;
  public java.sql.Timestamp get_fdtmVerified() {
    return fdtmVerified;
  }
  public void set_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
  }
  public tblrfnrefund with_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
    return this;
  }
  private String fstrVerifiedBy;
  public String get_fstrVerifiedBy() {
    return fstrVerifiedBy;
  }
  public void set_fstrVerifiedBy(String fstrVerifiedBy) {
    this.fstrVerifiedBy = fstrVerifiedBy;
  }
  public tblrfnrefund with_fstrVerifiedBy(String fstrVerifiedBy) {
    this.fstrVerifiedBy = fstrVerifiedBy;
    return this;
  }
  private java.sql.Timestamp fdtmExternalInterceptSent;
  public java.sql.Timestamp get_fdtmExternalInterceptSent() {
    return fdtmExternalInterceptSent;
  }
  public void set_fdtmExternalInterceptSent(java.sql.Timestamp fdtmExternalInterceptSent) {
    this.fdtmExternalInterceptSent = fdtmExternalInterceptSent;
  }
  public tblrfnrefund with_fdtmExternalInterceptSent(java.sql.Timestamp fdtmExternalInterceptSent) {
    this.fdtmExternalInterceptSent = fdtmExternalInterceptSent;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tblrfnrefund with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private String fstrApprovedBy;
  public String get_fstrApprovedBy() {
    return fstrApprovedBy;
  }
  public void set_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
  }
  public tblrfnrefund with_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
    return this;
  }
  private Integer fblnAutoApproved;
  public Integer get_fblnAutoApproved() {
    return fblnAutoApproved;
  }
  public void set_fblnAutoApproved(Integer fblnAutoApproved) {
    this.fblnAutoApproved = fblnAutoApproved;
  }
  public tblrfnrefund with_fblnAutoApproved(Integer fblnAutoApproved) {
    this.fblnAutoApproved = fblnAutoApproved;
    return this;
  }
  private java.math.BigDecimal fcurPostedAmount;
  public java.math.BigDecimal get_fcurPostedAmount() {
    return fcurPostedAmount;
  }
  public void set_fcurPostedAmount(java.math.BigDecimal fcurPostedAmount) {
    this.fcurPostedAmount = fcurPostedAmount;
  }
  public tblrfnrefund with_fcurPostedAmount(java.math.BigDecimal fcurPostedAmount) {
    this.fcurPostedAmount = fcurPostedAmount;
    return this;
  }
  private java.math.BigDecimal fcurMinimumAmount;
  public java.math.BigDecimal get_fcurMinimumAmount() {
    return fcurMinimumAmount;
  }
  public void set_fcurMinimumAmount(java.math.BigDecimal fcurMinimumAmount) {
    this.fcurMinimumAmount = fcurMinimumAmount;
  }
  public tblrfnrefund with_fcurMinimumAmount(java.math.BigDecimal fcurMinimumAmount) {
    this.fcurMinimumAmount = fcurMinimumAmount;
    return this;
  }
  private java.sql.Timestamp fdtmRejected;
  public java.sql.Timestamp get_fdtmRejected() {
    return fdtmRejected;
  }
  public void set_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
  }
  public tblrfnrefund with_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
    return this;
  }
  private String fstrRejectedBy;
  public String get_fstrRejectedBy() {
    return fstrRejectedBy;
  }
  public void set_fstrRejectedBy(String fstrRejectedBy) {
    this.fstrRejectedBy = fstrRejectedBy;
  }
  public tblrfnrefund with_fstrRejectedBy(String fstrRejectedBy) {
    this.fstrRejectedBy = fstrRejectedBy;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblrfnrefund with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrReversedBy;
  public String get_fstrReversedBy() {
    return fstrReversedBy;
  }
  public void set_fstrReversedBy(String fstrReversedBy) {
    this.fstrReversedBy = fstrReversedBy;
  }
  public tblrfnrefund with_fstrReversedBy(String fstrReversedBy) {
    this.fstrReversedBy = fstrReversedBy;
    return this;
  }
  private java.sql.Timestamp fdtmReleased;
  public java.sql.Timestamp get_fdtmReleased() {
    return fdtmReleased;
  }
  public void set_fdtmReleased(java.sql.Timestamp fdtmReleased) {
    this.fdtmReleased = fdtmReleased;
  }
  public tblrfnrefund with_fdtmReleased(java.sql.Timestamp fdtmReleased) {
    this.fdtmReleased = fdtmReleased;
    return this;
  }
  private String fstrReleasedBy;
  public String get_fstrReleasedBy() {
    return fstrReleasedBy;
  }
  public void set_fstrReleasedBy(String fstrReleasedBy) {
    this.fstrReleasedBy = fstrReleasedBy;
  }
  public tblrfnrefund with_fstrReleasedBy(String fstrReleasedBy) {
    this.fstrReleasedBy = fstrReleasedBy;
    return this;
  }
  private java.sql.Timestamp fdtmFileCreated;
  public java.sql.Timestamp get_fdtmFileCreated() {
    return fdtmFileCreated;
  }
  public void set_fdtmFileCreated(java.sql.Timestamp fdtmFileCreated) {
    this.fdtmFileCreated = fdtmFileCreated;
  }
  public tblrfnrefund with_fdtmFileCreated(java.sql.Timestamp fdtmFileCreated) {
    this.fdtmFileCreated = fdtmFileCreated;
    return this;
  }
  private java.sql.Timestamp fdtmIssued;
  public java.sql.Timestamp get_fdtmIssued() {
    return fdtmIssued;
  }
  public void set_fdtmIssued(java.sql.Timestamp fdtmIssued) {
    this.fdtmIssued = fdtmIssued;
  }
  public tblrfnrefund with_fdtmIssued(java.sql.Timestamp fdtmIssued) {
    this.fdtmIssued = fdtmIssued;
    return this;
  }
  private String fstrCheckNumber;
  public String get_fstrCheckNumber() {
    return fstrCheckNumber;
  }
  public void set_fstrCheckNumber(String fstrCheckNumber) {
    this.fstrCheckNumber = fstrCheckNumber;
  }
  public tblrfnrefund with_fstrCheckNumber(String fstrCheckNumber) {
    this.fstrCheckNumber = fstrCheckNumber;
    return this;
  }
  private java.sql.Timestamp fdtmReturned;
  public java.sql.Timestamp get_fdtmReturned() {
    return fdtmReturned;
  }
  public void set_fdtmReturned(java.sql.Timestamp fdtmReturned) {
    this.fdtmReturned = fdtmReturned;
  }
  public tblrfnrefund with_fdtmReturned(java.sql.Timestamp fdtmReturned) {
    this.fdtmReturned = fdtmReturned;
    return this;
  }
  private java.sql.Timestamp fdtmPaperIssued;
  public java.sql.Timestamp get_fdtmPaperIssued() {
    return fdtmPaperIssued;
  }
  public void set_fdtmPaperIssued(java.sql.Timestamp fdtmPaperIssued) {
    this.fdtmPaperIssued = fdtmPaperIssued;
  }
  public tblrfnrefund with_fdtmPaperIssued(java.sql.Timestamp fdtmPaperIssued) {
    this.fdtmPaperIssued = fdtmPaperIssued;
    return this;
  }
  private java.sql.Timestamp fdtmReconciled;
  public java.sql.Timestamp get_fdtmReconciled() {
    return fdtmReconciled;
  }
  public void set_fdtmReconciled(java.sql.Timestamp fdtmReconciled) {
    this.fdtmReconciled = fdtmReconciled;
  }
  public tblrfnrefund with_fdtmReconciled(java.sql.Timestamp fdtmReconciled) {
    this.fdtmReconciled = fdtmReconciled;
    return this;
  }
  private java.sql.Timestamp fdtmRedeemed;
  public java.sql.Timestamp get_fdtmRedeemed() {
    return fdtmRedeemed;
  }
  public void set_fdtmRedeemed(java.sql.Timestamp fdtmRedeemed) {
    this.fdtmRedeemed = fdtmRedeemed;
  }
  public tblrfnrefund with_fdtmRedeemed(java.sql.Timestamp fdtmRedeemed) {
    this.fdtmRedeemed = fdtmRedeemed;
    return this;
  }
  private java.sql.Timestamp fdtmUnclaimedProperty;
  public java.sql.Timestamp get_fdtmUnclaimedProperty() {
    return fdtmUnclaimedProperty;
  }
  public void set_fdtmUnclaimedProperty(java.sql.Timestamp fdtmUnclaimedProperty) {
    this.fdtmUnclaimedProperty = fdtmUnclaimedProperty;
  }
  public tblrfnrefund with_fdtmUnclaimedProperty(java.sql.Timestamp fdtmUnclaimedProperty) {
    this.fdtmUnclaimedProperty = fdtmUnclaimedProperty;
    return this;
  }
  private String fstrBankAccountType;
  public String get_fstrBankAccountType() {
    return fstrBankAccountType;
  }
  public void set_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
  }
  public tblrfnrefund with_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
    return this;
  }
  private Integer flngBankAccountKey;
  public Integer get_flngBankAccountKey() {
    return flngBankAccountKey;
  }
  public void set_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
  }
  public tblrfnrefund with_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
    return this;
  }
  private Integer flngBankAccountVerLast;
  public Integer get_flngBankAccountVerLast() {
    return flngBankAccountVerLast;
  }
  public void set_flngBankAccountVerLast(Integer flngBankAccountVerLast) {
    this.flngBankAccountVerLast = flngBankAccountVerLast;
  }
  public tblrfnrefund with_flngBankAccountVerLast(Integer flngBankAccountVerLast) {
    this.flngBankAccountVerLast = flngBankAccountVerLast;
    return this;
  }
  private Integer flngBankAccountRefundKey;
  public Integer get_flngBankAccountRefundKey() {
    return flngBankAccountRefundKey;
  }
  public void set_flngBankAccountRefundKey(Integer flngBankAccountRefundKey) {
    this.flngBankAccountRefundKey = flngBankAccountRefundKey;
  }
  public tblrfnrefund with_flngBankAccountRefundKey(Integer flngBankAccountRefundKey) {
    this.flngBankAccountRefundKey = flngBankAccountRefundKey;
    return this;
  }
  private String fstrRoutingTransit;
  public String get_fstrRoutingTransit() {
    return fstrRoutingTransit;
  }
  public void set_fstrRoutingTransit(String fstrRoutingTransit) {
    this.fstrRoutingTransit = fstrRoutingTransit;
  }
  public tblrfnrefund with_fstrRoutingTransit(String fstrRoutingTransit) {
    this.fstrRoutingTransit = fstrRoutingTransit;
    return this;
  }
  private String fstrAccountNumber;
  public String get_fstrAccountNumber() {
    return fstrAccountNumber;
  }
  public void set_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
  }
  public tblrfnrefund with_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
    return this;
  }
  private Integer flngSourceRefundKey;
  public Integer get_flngSourceRefundKey() {
    return flngSourceRefundKey;
  }
  public void set_flngSourceRefundKey(Integer flngSourceRefundKey) {
    this.flngSourceRefundKey = flngSourceRefundKey;
  }
  public tblrfnrefund with_flngSourceRefundKey(Integer flngSourceRefundKey) {
    this.flngSourceRefundKey = flngSourceRefundKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblrfnrefund with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblrfnrefund with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblrfnrefund with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private String fstrScheduleNumber;
  public String get_fstrScheduleNumber() {
    return fstrScheduleNumber;
  }
  public void set_fstrScheduleNumber(String fstrScheduleNumber) {
    this.fstrScheduleNumber = fstrScheduleNumber;
  }
  public tblrfnrefund with_fstrScheduleNumber(String fstrScheduleNumber) {
    this.fstrScheduleNumber = fstrScheduleNumber;
    return this;
  }
  private java.sql.Timestamp fdtmAvailable;
  public java.sql.Timestamp get_fdtmAvailable() {
    return fdtmAvailable;
  }
  public void set_fdtmAvailable(java.sql.Timestamp fdtmAvailable) {
    this.fdtmAvailable = fdtmAvailable;
  }
  public tblrfnrefund with_fdtmAvailable(java.sql.Timestamp fdtmAvailable) {
    this.fdtmAvailable = fdtmAvailable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblrfnrefund with_fstrWho(String fstrWho) {
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
  public tblrfnrefund with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrfnrefund)) {
      return false;
    }
    tblrfnrefund that = (tblrfnrefund) o;
    boolean equal = true;
    equal = equal && (this.flngRefundKey == null ? that.flngRefundKey == null : this.flngRefundKey.equals(that.flngRefundKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fstrRefundId == null ? that.fstrRefundId == null : this.fstrRefundId.equals(that.fstrRefundId));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngTrusteeCustomerKey == null ? that.flngTrusteeCustomerKey == null : this.flngTrusteeCustomerKey.equals(that.flngTrusteeCustomerKey));
    equal = equal && (this.flngTrusteeAccountKey == null ? that.flngTrusteeAccountKey == null : this.flngTrusteeAccountKey.equals(that.flngTrusteeAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrRefundType == null ? that.fstrRefundType == null : this.fstrRefundType.equals(that.fstrRefundType));
    equal = equal && (this.fstrApprovalLevel == null ? that.fstrApprovalLevel == null : this.fstrApprovalLevel.equals(that.fstrApprovalLevel));
    equal = equal && (this.fcurRange == null ? that.fcurRange == null : this.fcurRange.equals(that.fcurRange));
    equal = equal && (this.fstrRefundStage == null ? that.fstrRefundStage == null : this.fstrRefundStage.equals(that.fstrRefundStage));
    equal = equal && (this.fdtmStageDate == null ? that.fdtmStageDate == null : this.fdtmStageDate.equals(that.fdtmStageDate));
    equal = equal && (this.fstrRefundStatus == null ? that.fstrRefundStatus == null : this.fstrRefundStatus.equals(that.fstrRefundStatus));
    equal = equal && (this.fdtmStatusDate == null ? that.fdtmStatusDate == null : this.fdtmStatusDate.equals(that.fdtmStatusDate));
    equal = equal && (this.fstrStatusChangedBy == null ? that.fstrStatusChangedBy == null : this.fstrStatusChangedBy.equals(that.fstrStatusChangedBy));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrRefundChannel == null ? that.fstrRefundChannel == null : this.fstrRefundChannel.equals(that.fstrRefundChannel));
    equal = equal && (this.fdtmRequested == null ? that.fdtmRequested == null : this.fdtmRequested.equals(that.fdtmRequested));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fblnSystemCreated == null ? that.fblnSystemCreated == null : this.fblnSystemCreated.equals(that.fblnSystemCreated));
    equal = equal && (this.fcurRequestedAmount == null ? that.fcurRequestedAmount == null : this.fcurRequestedAmount.equals(that.fcurRequestedAmount));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrVerifiedBy == null ? that.fstrVerifiedBy == null : this.fstrVerifiedBy.equals(that.fstrVerifiedBy));
    equal = equal && (this.fdtmExternalInterceptSent == null ? that.fdtmExternalInterceptSent == null : this.fdtmExternalInterceptSent.equals(that.fdtmExternalInterceptSent));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fblnAutoApproved == null ? that.fblnAutoApproved == null : this.fblnAutoApproved.equals(that.fblnAutoApproved));
    equal = equal && (this.fcurPostedAmount == null ? that.fcurPostedAmount == null : this.fcurPostedAmount.equals(that.fcurPostedAmount));
    equal = equal && (this.fcurMinimumAmount == null ? that.fcurMinimumAmount == null : this.fcurMinimumAmount.equals(that.fcurMinimumAmount));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fstrRejectedBy == null ? that.fstrRejectedBy == null : this.fstrRejectedBy.equals(that.fstrRejectedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversedBy == null ? that.fstrReversedBy == null : this.fstrReversedBy.equals(that.fstrReversedBy));
    equal = equal && (this.fdtmReleased == null ? that.fdtmReleased == null : this.fdtmReleased.equals(that.fdtmReleased));
    equal = equal && (this.fstrReleasedBy == null ? that.fstrReleasedBy == null : this.fstrReleasedBy.equals(that.fstrReleasedBy));
    equal = equal && (this.fdtmFileCreated == null ? that.fdtmFileCreated == null : this.fdtmFileCreated.equals(that.fdtmFileCreated));
    equal = equal && (this.fdtmIssued == null ? that.fdtmIssued == null : this.fdtmIssued.equals(that.fdtmIssued));
    equal = equal && (this.fstrCheckNumber == null ? that.fstrCheckNumber == null : this.fstrCheckNumber.equals(that.fstrCheckNumber));
    equal = equal && (this.fdtmReturned == null ? that.fdtmReturned == null : this.fdtmReturned.equals(that.fdtmReturned));
    equal = equal && (this.fdtmPaperIssued == null ? that.fdtmPaperIssued == null : this.fdtmPaperIssued.equals(that.fdtmPaperIssued));
    equal = equal && (this.fdtmReconciled == null ? that.fdtmReconciled == null : this.fdtmReconciled.equals(that.fdtmReconciled));
    equal = equal && (this.fdtmRedeemed == null ? that.fdtmRedeemed == null : this.fdtmRedeemed.equals(that.fdtmRedeemed));
    equal = equal && (this.fdtmUnclaimedProperty == null ? that.fdtmUnclaimedProperty == null : this.fdtmUnclaimedProperty.equals(that.fdtmUnclaimedProperty));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.flngBankAccountVerLast == null ? that.flngBankAccountVerLast == null : this.flngBankAccountVerLast.equals(that.flngBankAccountVerLast));
    equal = equal && (this.flngBankAccountRefundKey == null ? that.flngBankAccountRefundKey == null : this.flngBankAccountRefundKey.equals(that.flngBankAccountRefundKey));
    equal = equal && (this.fstrRoutingTransit == null ? that.fstrRoutingTransit == null : this.fstrRoutingTransit.equals(that.fstrRoutingTransit));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.flngSourceRefundKey == null ? that.flngSourceRefundKey == null : this.flngSourceRefundKey.equals(that.flngSourceRefundKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fstrScheduleNumber == null ? that.fstrScheduleNumber == null : this.fstrScheduleNumber.equals(that.fstrScheduleNumber));
    equal = equal && (this.fdtmAvailable == null ? that.fdtmAvailable == null : this.fdtmAvailable.equals(that.fdtmAvailable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrfnrefund)) {
      return false;
    }
    tblrfnrefund that = (tblrfnrefund) o;
    boolean equal = true;
    equal = equal && (this.flngRefundKey == null ? that.flngRefundKey == null : this.flngRefundKey.equals(that.flngRefundKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngBatchKey == null ? that.flngBatchKey == null : this.flngBatchKey.equals(that.flngBatchKey));
    equal = equal && (this.fstrRefundId == null ? that.fstrRefundId == null : this.fstrRefundId.equals(that.fstrRefundId));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngTrusteeCustomerKey == null ? that.flngTrusteeCustomerKey == null : this.flngTrusteeCustomerKey.equals(that.flngTrusteeCustomerKey));
    equal = equal && (this.flngTrusteeAccountKey == null ? that.flngTrusteeAccountKey == null : this.flngTrusteeAccountKey.equals(that.flngTrusteeAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrRefundType == null ? that.fstrRefundType == null : this.fstrRefundType.equals(that.fstrRefundType));
    equal = equal && (this.fstrApprovalLevel == null ? that.fstrApprovalLevel == null : this.fstrApprovalLevel.equals(that.fstrApprovalLevel));
    equal = equal && (this.fcurRange == null ? that.fcurRange == null : this.fcurRange.equals(that.fcurRange));
    equal = equal && (this.fstrRefundStage == null ? that.fstrRefundStage == null : this.fstrRefundStage.equals(that.fstrRefundStage));
    equal = equal && (this.fdtmStageDate == null ? that.fdtmStageDate == null : this.fdtmStageDate.equals(that.fdtmStageDate));
    equal = equal && (this.fstrRefundStatus == null ? that.fstrRefundStatus == null : this.fstrRefundStatus.equals(that.fstrRefundStatus));
    equal = equal && (this.fdtmStatusDate == null ? that.fdtmStatusDate == null : this.fdtmStatusDate.equals(that.fdtmStatusDate));
    equal = equal && (this.fstrStatusChangedBy == null ? that.fstrStatusChangedBy == null : this.fstrStatusChangedBy.equals(that.fstrStatusChangedBy));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrRefundChannel == null ? that.fstrRefundChannel == null : this.fstrRefundChannel.equals(that.fstrRefundChannel));
    equal = equal && (this.fdtmRequested == null ? that.fdtmRequested == null : this.fdtmRequested.equals(that.fdtmRequested));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fblnSystemCreated == null ? that.fblnSystemCreated == null : this.fblnSystemCreated.equals(that.fblnSystemCreated));
    equal = equal && (this.fcurRequestedAmount == null ? that.fcurRequestedAmount == null : this.fcurRequestedAmount.equals(that.fcurRequestedAmount));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrVerifiedBy == null ? that.fstrVerifiedBy == null : this.fstrVerifiedBy.equals(that.fstrVerifiedBy));
    equal = equal && (this.fdtmExternalInterceptSent == null ? that.fdtmExternalInterceptSent == null : this.fdtmExternalInterceptSent.equals(that.fdtmExternalInterceptSent));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fblnAutoApproved == null ? that.fblnAutoApproved == null : this.fblnAutoApproved.equals(that.fblnAutoApproved));
    equal = equal && (this.fcurPostedAmount == null ? that.fcurPostedAmount == null : this.fcurPostedAmount.equals(that.fcurPostedAmount));
    equal = equal && (this.fcurMinimumAmount == null ? that.fcurMinimumAmount == null : this.fcurMinimumAmount.equals(that.fcurMinimumAmount));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fstrRejectedBy == null ? that.fstrRejectedBy == null : this.fstrRejectedBy.equals(that.fstrRejectedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversedBy == null ? that.fstrReversedBy == null : this.fstrReversedBy.equals(that.fstrReversedBy));
    equal = equal && (this.fdtmReleased == null ? that.fdtmReleased == null : this.fdtmReleased.equals(that.fdtmReleased));
    equal = equal && (this.fstrReleasedBy == null ? that.fstrReleasedBy == null : this.fstrReleasedBy.equals(that.fstrReleasedBy));
    equal = equal && (this.fdtmFileCreated == null ? that.fdtmFileCreated == null : this.fdtmFileCreated.equals(that.fdtmFileCreated));
    equal = equal && (this.fdtmIssued == null ? that.fdtmIssued == null : this.fdtmIssued.equals(that.fdtmIssued));
    equal = equal && (this.fstrCheckNumber == null ? that.fstrCheckNumber == null : this.fstrCheckNumber.equals(that.fstrCheckNumber));
    equal = equal && (this.fdtmReturned == null ? that.fdtmReturned == null : this.fdtmReturned.equals(that.fdtmReturned));
    equal = equal && (this.fdtmPaperIssued == null ? that.fdtmPaperIssued == null : this.fdtmPaperIssued.equals(that.fdtmPaperIssued));
    equal = equal && (this.fdtmReconciled == null ? that.fdtmReconciled == null : this.fdtmReconciled.equals(that.fdtmReconciled));
    equal = equal && (this.fdtmRedeemed == null ? that.fdtmRedeemed == null : this.fdtmRedeemed.equals(that.fdtmRedeemed));
    equal = equal && (this.fdtmUnclaimedProperty == null ? that.fdtmUnclaimedProperty == null : this.fdtmUnclaimedProperty.equals(that.fdtmUnclaimedProperty));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.flngBankAccountVerLast == null ? that.flngBankAccountVerLast == null : this.flngBankAccountVerLast.equals(that.flngBankAccountVerLast));
    equal = equal && (this.flngBankAccountRefundKey == null ? that.flngBankAccountRefundKey == null : this.flngBankAccountRefundKey.equals(that.flngBankAccountRefundKey));
    equal = equal && (this.fstrRoutingTransit == null ? that.fstrRoutingTransit == null : this.fstrRoutingTransit.equals(that.fstrRoutingTransit));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.flngSourceRefundKey == null ? that.flngSourceRefundKey == null : this.flngSourceRefundKey.equals(that.flngSourceRefundKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fstrScheduleNumber == null ? that.fstrScheduleNumber == null : this.fstrScheduleNumber.equals(that.fstrScheduleNumber));
    equal = equal && (this.fdtmAvailable == null ? that.fdtmAvailable == null : this.fdtmAvailable.equals(that.fdtmAvailable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRefundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrRefundId = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngTrusteeCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngTrusteeAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrRefundType = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrApprovalLevel = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurRange = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrRefundStage = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmStageDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrRefundStatus = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmStatusDate = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrStatusChangedBy = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRefundChannel = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmRequested = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(23, __dbResults);
    this.fblnSystemCreated = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fcurRequestedAmount = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrVerifiedBy = JdbcWritableBridge.readString(27, __dbResults);
    this.fdtmExternalInterceptSent = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(30, __dbResults);
    this.fblnAutoApproved = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fcurPostedAmount = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurMinimumAmount = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fstrRejectedBy = JdbcWritableBridge.readString(35, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.fstrReversedBy = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmReleased = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrReleasedBy = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmFileCreated = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.fdtmIssued = JdbcWritableBridge.readTimestamp(41, __dbResults);
    this.fstrCheckNumber = JdbcWritableBridge.readString(42, __dbResults);
    this.fdtmReturned = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fdtmPaperIssued = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.fdtmReconciled = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.fdtmRedeemed = JdbcWritableBridge.readTimestamp(46, __dbResults);
    this.fdtmUnclaimedProperty = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(48, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(49, __dbResults);
    this.flngBankAccountVerLast = JdbcWritableBridge.readInteger(50, __dbResults);
    this.flngBankAccountRefundKey = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrRoutingTransit = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(53, __dbResults);
    this.flngSourceRefundKey = JdbcWritableBridge.readInteger(54, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(56, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.fstrScheduleNumber = JdbcWritableBridge.readString(58, __dbResults);
    this.fdtmAvailable = JdbcWritableBridge.readTimestamp(59, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(60, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(61, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRefundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngBatchKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrRefundId = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngTrusteeCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngTrusteeAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrRefundType = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrApprovalLevel = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurRange = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrRefundStage = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmStageDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrRefundStatus = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmStatusDate = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrStatusChangedBy = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrRefundChannel = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmRequested = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(23, __dbResults);
    this.fblnSystemCreated = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fcurRequestedAmount = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrVerifiedBy = JdbcWritableBridge.readString(27, __dbResults);
    this.fdtmExternalInterceptSent = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(30, __dbResults);
    this.fblnAutoApproved = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fcurPostedAmount = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurMinimumAmount = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fstrRejectedBy = JdbcWritableBridge.readString(35, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.fstrReversedBy = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmReleased = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrReleasedBy = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmFileCreated = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.fdtmIssued = JdbcWritableBridge.readTimestamp(41, __dbResults);
    this.fstrCheckNumber = JdbcWritableBridge.readString(42, __dbResults);
    this.fdtmReturned = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fdtmPaperIssued = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.fdtmReconciled = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.fdtmRedeemed = JdbcWritableBridge.readTimestamp(46, __dbResults);
    this.fdtmUnclaimedProperty = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(48, __dbResults);
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(49, __dbResults);
    this.flngBankAccountVerLast = JdbcWritableBridge.readInteger(50, __dbResults);
    this.flngBankAccountRefundKey = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrRoutingTransit = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(53, __dbResults);
    this.flngSourceRefundKey = JdbcWritableBridge.readInteger(54, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(55, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(56, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(57, __dbResults);
    this.fstrScheduleNumber = JdbcWritableBridge.readString(58, __dbResults);
    this.fdtmAvailable = JdbcWritableBridge.readTimestamp(59, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(60, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(61, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRefundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundId, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTrusteeCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTrusteeAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovalLevel, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRange, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundStage, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStageDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundStatus, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatusDate, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatusChangedBy, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundChannel, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequested, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSystemCreated, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestedAmount, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifiedBy, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExternalInterceptSent, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoApproved, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostedAmount, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMinimumAmount, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedBy, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedBy, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReleased, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReleasedBy, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFileCreated, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssued, 41 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCheckNumber, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturned, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaperIssued, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReconciled, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRedeemed, 46 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUnclaimedProperty, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 49 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountVerLast, 50 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountRefundKey, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRoutingTransit, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceRefundKey, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 55 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrScheduleNumber, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAvailable, 59 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 61 + __off, 93, __dbStmt);
    return 61;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRefundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBatchKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundId, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTrusteeCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTrusteeAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovalLevel, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRange, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundStage, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStageDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundStatus, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatusDate, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatusChangedBy, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundChannel, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequested, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSystemCreated, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestedAmount, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifiedBy, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExternalInterceptSent, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoApproved, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostedAmount, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMinimumAmount, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedBy, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedBy, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReleased, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReleasedBy, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFileCreated, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssued, 41 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCheckNumber, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReturned, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaperIssued, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReconciled, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRedeemed, 46 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUnclaimedProperty, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 49 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountVerLast, 50 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBankAccountRefundKey, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRoutingTransit, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceRefundKey, 54 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 55 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 57 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrScheduleNumber, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAvailable, 59 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 61 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRefundKey = null;
    } else {
    this.flngRefundKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBatchKey = null;
    } else {
    this.flngBatchKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundId = null;
    } else {
    this.fstrRefundId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTrusteeCustomerKey = null;
    } else {
    this.flngTrusteeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTrusteeAccountKey = null;
    } else {
    this.flngTrusteeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundType = null;
    } else {
    this.fstrRefundType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovalLevel = null;
    } else {
    this.fstrApprovalLevel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRange = null;
    } else {
    this.fcurRange = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundStage = null;
    } else {
    this.fstrRefundStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStageDate = null;
    } else {
    this.fdtmStageDate = new Timestamp(__dataIn.readLong());
    this.fdtmStageDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundStatus = null;
    } else {
    this.fstrRefundStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStatusDate = null;
    } else {
    this.fdtmStatusDate = new Timestamp(__dataIn.readLong());
    this.fdtmStatusDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatusChangedBy = null;
    } else {
    this.fstrStatusChangedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundChannel = null;
    } else {
    this.fstrRefundChannel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRequested = null;
    } else {
    this.fdtmRequested = new Timestamp(__dataIn.readLong());
    this.fdtmRequested.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedBy = null;
    } else {
    this.fstrCreatedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSystemCreated = null;
    } else {
    this.fblnSystemCreated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRequestedAmount = null;
    } else {
    this.fcurRequestedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVerified = null;
    } else {
    this.fdtmVerified = new Timestamp(__dataIn.readLong());
    this.fdtmVerified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVerifiedBy = null;
    } else {
    this.fstrVerifiedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExternalInterceptSent = null;
    } else {
    this.fdtmExternalInterceptSent = new Timestamp(__dataIn.readLong());
    this.fdtmExternalInterceptSent.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBy = null;
    } else {
    this.fstrApprovedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutoApproved = null;
    } else {
    this.fblnAutoApproved = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostedAmount = null;
    } else {
    this.fcurPostedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMinimumAmount = null;
    } else {
    this.fcurMinimumAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRejected = null;
    } else {
    this.fdtmRejected = new Timestamp(__dataIn.readLong());
    this.fdtmRejected.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRejectedBy = null;
    } else {
    this.fstrRejectedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReversedBy = null;
    } else {
    this.fstrReversedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReleased = null;
    } else {
    this.fdtmReleased = new Timestamp(__dataIn.readLong());
    this.fdtmReleased.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReleasedBy = null;
    } else {
    this.fstrReleasedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFileCreated = null;
    } else {
    this.fdtmFileCreated = new Timestamp(__dataIn.readLong());
    this.fdtmFileCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIssued = null;
    } else {
    this.fdtmIssued = new Timestamp(__dataIn.readLong());
    this.fdtmIssued.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCheckNumber = null;
    } else {
    this.fstrCheckNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReturned = null;
    } else {
    this.fdtmReturned = new Timestamp(__dataIn.readLong());
    this.fdtmReturned.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaperIssued = null;
    } else {
    this.fdtmPaperIssued = new Timestamp(__dataIn.readLong());
    this.fdtmPaperIssued.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReconciled = null;
    } else {
    this.fdtmReconciled = new Timestamp(__dataIn.readLong());
    this.fdtmReconciled.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRedeemed = null;
    } else {
    this.fdtmRedeemed = new Timestamp(__dataIn.readLong());
    this.fdtmRedeemed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmUnclaimedProperty = null;
    } else {
    this.fdtmUnclaimedProperty = new Timestamp(__dataIn.readLong());
    this.fdtmUnclaimedProperty.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountType = null;
    } else {
    this.fstrBankAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountKey = null;
    } else {
    this.flngBankAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountVerLast = null;
    } else {
    this.flngBankAccountVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountRefundKey = null;
    } else {
    this.flngBankAccountRefundKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRoutingTransit = null;
    } else {
    this.fstrRoutingTransit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountNumber = null;
    } else {
    this.fstrAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceRefundKey = null;
    } else {
    this.flngSourceRefundKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrScheduleNumber = null;
    } else {
    this.fstrScheduleNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAvailable = null;
    } else {
    this.fdtmAvailable = new Timestamp(__dataIn.readLong());
    this.fdtmAvailable.setNanos(__dataIn.readInt());
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
    if (null == this.flngRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fstrRefundId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundId);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngTrusteeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTrusteeCustomerKey);
    }
    if (null == this.flngTrusteeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTrusteeAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrRefundType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundType);
    }
    if (null == this.fstrApprovalLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovalLevel);
    }
    if (null == this.fcurRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRange, __dataOut);
    }
    if (null == this.fstrRefundStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundStage);
    }
    if (null == this.fdtmStageDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStageDate.getTime());
    __dataOut.writeInt(this.fdtmStageDate.getNanos());
    }
    if (null == this.fstrRefundStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundStatus);
    }
    if (null == this.fdtmStatusDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatusDate.getTime());
    __dataOut.writeInt(this.fdtmStatusDate.getNanos());
    }
    if (null == this.fstrStatusChangedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatusChangedBy);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrRefundChannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundChannel);
    }
    if (null == this.fdtmRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequested.getTime());
    __dataOut.writeInt(this.fdtmRequested.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fblnSystemCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSystemCreated);
    }
    if (null == this.fcurRequestedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestedAmount, __dataOut);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrVerifiedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifiedBy);
    }
    if (null == this.fdtmExternalInterceptSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExternalInterceptSent.getTime());
    __dataOut.writeInt(this.fdtmExternalInterceptSent.getNanos());
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fblnAutoApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoApproved);
    }
    if (null == this.fcurPostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostedAmount, __dataOut);
    }
    if (null == this.fcurMinimumAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMinimumAmount, __dataOut);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fstrRejectedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedBy);
    }
    if (null == this.fdtmReleased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReleased.getTime());
    __dataOut.writeInt(this.fdtmReleased.getNanos());
    }
    if (null == this.fstrReleasedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReleasedBy);
    }
    if (null == this.fdtmFileCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFileCreated.getTime());
    __dataOut.writeInt(this.fdtmFileCreated.getNanos());
    }
    if (null == this.fdtmIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssued.getTime());
    __dataOut.writeInt(this.fdtmIssued.getNanos());
    }
    if (null == this.fstrCheckNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCheckNumber);
    }
    if (null == this.fdtmReturned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturned.getTime());
    __dataOut.writeInt(this.fdtmReturned.getNanos());
    }
    if (null == this.fdtmPaperIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaperIssued.getTime());
    __dataOut.writeInt(this.fdtmPaperIssued.getNanos());
    }
    if (null == this.fdtmReconciled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReconciled.getTime());
    __dataOut.writeInt(this.fdtmReconciled.getNanos());
    }
    if (null == this.fdtmRedeemed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRedeemed.getTime());
    __dataOut.writeInt(this.fdtmRedeemed.getNanos());
    }
    if (null == this.fdtmUnclaimedProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUnclaimedProperty.getTime());
    __dataOut.writeInt(this.fdtmUnclaimedProperty.getNanos());
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.flngBankAccountVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountVerLast);
    }
    if (null == this.flngBankAccountRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountRefundKey);
    }
    if (null == this.fstrRoutingTransit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRoutingTransit);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.flngSourceRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceRefundKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fstrScheduleNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrScheduleNumber);
    }
    if (null == this.fdtmAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAvailable.getTime());
    __dataOut.writeInt(this.fdtmAvailable.getNanos());
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
    if (null == this.flngRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBatchKey);
    }
    if (null == this.fstrRefundId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundId);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngTrusteeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTrusteeCustomerKey);
    }
    if (null == this.flngTrusteeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTrusteeAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrRefundType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundType);
    }
    if (null == this.fstrApprovalLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovalLevel);
    }
    if (null == this.fcurRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRange, __dataOut);
    }
    if (null == this.fstrRefundStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundStage);
    }
    if (null == this.fdtmStageDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStageDate.getTime());
    __dataOut.writeInt(this.fdtmStageDate.getNanos());
    }
    if (null == this.fstrRefundStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundStatus);
    }
    if (null == this.fdtmStatusDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatusDate.getTime());
    __dataOut.writeInt(this.fdtmStatusDate.getNanos());
    }
    if (null == this.fstrStatusChangedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatusChangedBy);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrRefundChannel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundChannel);
    }
    if (null == this.fdtmRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequested.getTime());
    __dataOut.writeInt(this.fdtmRequested.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fblnSystemCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSystemCreated);
    }
    if (null == this.fcurRequestedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestedAmount, __dataOut);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrVerifiedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifiedBy);
    }
    if (null == this.fdtmExternalInterceptSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExternalInterceptSent.getTime());
    __dataOut.writeInt(this.fdtmExternalInterceptSent.getNanos());
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fblnAutoApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoApproved);
    }
    if (null == this.fcurPostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostedAmount, __dataOut);
    }
    if (null == this.fcurMinimumAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMinimumAmount, __dataOut);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fstrRejectedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedBy);
    }
    if (null == this.fdtmReleased) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReleased.getTime());
    __dataOut.writeInt(this.fdtmReleased.getNanos());
    }
    if (null == this.fstrReleasedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReleasedBy);
    }
    if (null == this.fdtmFileCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFileCreated.getTime());
    __dataOut.writeInt(this.fdtmFileCreated.getNanos());
    }
    if (null == this.fdtmIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssued.getTime());
    __dataOut.writeInt(this.fdtmIssued.getNanos());
    }
    if (null == this.fstrCheckNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCheckNumber);
    }
    if (null == this.fdtmReturned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReturned.getTime());
    __dataOut.writeInt(this.fdtmReturned.getNanos());
    }
    if (null == this.fdtmPaperIssued) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaperIssued.getTime());
    __dataOut.writeInt(this.fdtmPaperIssued.getNanos());
    }
    if (null == this.fdtmReconciled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReconciled.getTime());
    __dataOut.writeInt(this.fdtmReconciled.getNanos());
    }
    if (null == this.fdtmRedeemed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRedeemed.getTime());
    __dataOut.writeInt(this.fdtmRedeemed.getNanos());
    }
    if (null == this.fdtmUnclaimedProperty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUnclaimedProperty.getTime());
    __dataOut.writeInt(this.fdtmUnclaimedProperty.getNanos());
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.flngBankAccountVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountVerLast);
    }
    if (null == this.flngBankAccountRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountRefundKey);
    }
    if (null == this.fstrRoutingTransit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRoutingTransit);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.flngSourceRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceRefundKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fstrScheduleNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrScheduleNumber);
    }
    if (null == this.fdtmAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAvailable.getTime());
    __dataOut.writeInt(this.fdtmAvailable.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundKey==null?"\\N":"" + flngRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundId==null?"\\N":fstrRefundId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTrusteeCustomerKey==null?"\\N":"" + flngTrusteeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTrusteeAccountKey==null?"\\N":"" + flngTrusteeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundType==null?"\\N":fstrRefundType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovalLevel==null?"\\N":fstrApprovalLevel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRange==null?"\\N":fcurRange.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundStage==null?"\\N":fstrRefundStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStageDate==null?"\\N":"" + fdtmStageDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundStatus==null?"\\N":fstrRefundStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatusDate==null?"\\N":"" + fdtmStatusDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatusChangedBy==null?"\\N":fstrStatusChangedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundChannel==null?"\\N":fstrRefundChannel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequested==null?"\\N":"" + fdtmRequested, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSystemCreated==null?"\\N":"" + fblnSystemCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestedAmount==null?"\\N":fcurRequestedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifiedBy==null?"\\N":fstrVerifiedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExternalInterceptSent==null?"\\N":"" + fdtmExternalInterceptSent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoApproved==null?"\\N":"" + fblnAutoApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostedAmount==null?"\\N":fcurPostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMinimumAmount==null?"\\N":fcurMinimumAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedBy==null?"\\N":fstrRejectedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedBy==null?"\\N":fstrReversedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReleased==null?"\\N":"" + fdtmReleased, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReleasedBy==null?"\\N":fstrReleasedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFileCreated==null?"\\N":"" + fdtmFileCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssued==null?"\\N":"" + fdtmIssued, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCheckNumber==null?"\\N":fstrCheckNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturned==null?"\\N":"" + fdtmReturned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaperIssued==null?"\\N":"" + fdtmPaperIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReconciled==null?"\\N":"" + fdtmReconciled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRedeemed==null?"\\N":"" + fdtmRedeemed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUnclaimedProperty==null?"\\N":"" + fdtmUnclaimedProperty, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountVerLast==null?"\\N":"" + flngBankAccountVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountRefundKey==null?"\\N":"" + flngBankAccountRefundKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRoutingTransit==null?"\\N":fstrRoutingTransit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceRefundKey==null?"\\N":"" + flngSourceRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrScheduleNumber==null?"\\N":fstrScheduleNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAvailable==null?"\\N":"" + fdtmAvailable, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundKey==null?"\\N":"" + flngRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBatchKey==null?"\\N":"" + flngBatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundId==null?"\\N":fstrRefundId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTrusteeCustomerKey==null?"\\N":"" + flngTrusteeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTrusteeAccountKey==null?"\\N":"" + flngTrusteeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundType==null?"\\N":fstrRefundType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovalLevel==null?"\\N":fstrApprovalLevel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRange==null?"\\N":fcurRange.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundStage==null?"\\N":fstrRefundStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStageDate==null?"\\N":"" + fdtmStageDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundStatus==null?"\\N":fstrRefundStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatusDate==null?"\\N":"" + fdtmStatusDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatusChangedBy==null?"\\N":fstrStatusChangedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundChannel==null?"\\N":fstrRefundChannel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequested==null?"\\N":"" + fdtmRequested, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSystemCreated==null?"\\N":"" + fblnSystemCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestedAmount==null?"\\N":fcurRequestedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifiedBy==null?"\\N":fstrVerifiedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExternalInterceptSent==null?"\\N":"" + fdtmExternalInterceptSent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoApproved==null?"\\N":"" + fblnAutoApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostedAmount==null?"\\N":fcurPostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMinimumAmount==null?"\\N":fcurMinimumAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedBy==null?"\\N":fstrRejectedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedBy==null?"\\N":fstrReversedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReleased==null?"\\N":"" + fdtmReleased, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReleasedBy==null?"\\N":fstrReleasedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFileCreated==null?"\\N":"" + fdtmFileCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssued==null?"\\N":"" + fdtmIssued, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCheckNumber==null?"\\N":fstrCheckNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReturned==null?"\\N":"" + fdtmReturned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaperIssued==null?"\\N":"" + fdtmPaperIssued, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReconciled==null?"\\N":"" + fdtmReconciled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRedeemed==null?"\\N":"" + fdtmRedeemed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUnclaimedProperty==null?"\\N":"" + fdtmUnclaimedProperty, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountVerLast==null?"\\N":"" + flngBankAccountVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountRefundKey==null?"\\N":"" + flngBankAccountRefundKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRoutingTransit==null?"\\N":fstrRoutingTransit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceRefundKey==null?"\\N":"" + flngSourceRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrScheduleNumber==null?"\\N":fstrScheduleNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAvailable==null?"\\N":"" + fdtmAvailable, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundKey = null; } else {
      this.flngRefundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundId = null; } else {
      this.fstrRefundId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTrusteeCustomerKey = null; } else {
      this.flngTrusteeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTrusteeAccountKey = null; } else {
      this.flngTrusteeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundType = null; } else {
      this.fstrRefundType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovalLevel = null; } else {
      this.fstrApprovalLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRange = null; } else {
      this.fcurRange = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundStage = null; } else {
      this.fstrRefundStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStageDate = null; } else {
      this.fdtmStageDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundStatus = null; } else {
      this.fstrRefundStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatusDate = null; } else {
      this.fdtmStatusDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatusChangedBy = null; } else {
      this.fstrStatusChangedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRefundChannel = null; } else {
      this.fstrRefundChannel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequested = null; } else {
      this.fdtmRequested = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSystemCreated = null; } else {
      this.fblnSystemCreated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestedAmount = null; } else {
      this.fcurRequestedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifiedBy = null; } else {
      this.fstrVerifiedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExternalInterceptSent = null; } else {
      this.fdtmExternalInterceptSent = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoApproved = null; } else {
      this.fblnAutoApproved = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostedAmount = null; } else {
      this.fcurPostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMinimumAmount = null; } else {
      this.fcurMinimumAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRejected = null; } else {
      this.fdtmRejected = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectedBy = null; } else {
      this.fstrRejectedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedBy = null; } else {
      this.fstrReversedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReleased = null; } else {
      this.fdtmReleased = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReleasedBy = null; } else {
      this.fstrReleasedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFileCreated = null; } else {
      this.fdtmFileCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssued = null; } else {
      this.fdtmIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCheckNumber = null; } else {
      this.fstrCheckNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturned = null; } else {
      this.fdtmReturned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaperIssued = null; } else {
      this.fdtmPaperIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReconciled = null; } else {
      this.fdtmReconciled = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRedeemed = null; } else {
      this.fdtmRedeemed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUnclaimedProperty = null; } else {
      this.fdtmUnclaimedProperty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountVerLast = null; } else {
      this.flngBankAccountVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountRefundKey = null; } else {
      this.flngBankAccountRefundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRoutingTransit = null; } else {
      this.fstrRoutingTransit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceRefundKey = null; } else {
      this.flngSourceRefundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrScheduleNumber = null; } else {
      this.fstrScheduleNumber = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundKey = null; } else {
      this.flngRefundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBatchKey = null; } else {
      this.flngBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundId = null; } else {
      this.fstrRefundId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTrusteeCustomerKey = null; } else {
      this.flngTrusteeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTrusteeAccountKey = null; } else {
      this.flngTrusteeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundType = null; } else {
      this.fstrRefundType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovalLevel = null; } else {
      this.fstrApprovalLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRange = null; } else {
      this.fcurRange = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundStage = null; } else {
      this.fstrRefundStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStageDate = null; } else {
      this.fdtmStageDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundStatus = null; } else {
      this.fstrRefundStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStatusDate = null; } else {
      this.fdtmStatusDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatusChangedBy = null; } else {
      this.fstrStatusChangedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRefundChannel = null; } else {
      this.fstrRefundChannel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequested = null; } else {
      this.fdtmRequested = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSystemCreated = null; } else {
      this.fblnSystemCreated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestedAmount = null; } else {
      this.fcurRequestedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifiedBy = null; } else {
      this.fstrVerifiedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExternalInterceptSent = null; } else {
      this.fdtmExternalInterceptSent = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoApproved = null; } else {
      this.fblnAutoApproved = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostedAmount = null; } else {
      this.fcurPostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMinimumAmount = null; } else {
      this.fcurMinimumAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRejected = null; } else {
      this.fdtmRejected = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRejectedBy = null; } else {
      this.fstrRejectedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedBy = null; } else {
      this.fstrReversedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReleased = null; } else {
      this.fdtmReleased = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReleasedBy = null; } else {
      this.fstrReleasedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFileCreated = null; } else {
      this.fdtmFileCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssued = null; } else {
      this.fdtmIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCheckNumber = null; } else {
      this.fstrCheckNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReturned = null; } else {
      this.fdtmReturned = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaperIssued = null; } else {
      this.fdtmPaperIssued = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReconciled = null; } else {
      this.fdtmReconciled = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRedeemed = null; } else {
      this.fdtmRedeemed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUnclaimedProperty = null; } else {
      this.fdtmUnclaimedProperty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountVerLast = null; } else {
      this.flngBankAccountVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountRefundKey = null; } else {
      this.flngBankAccountRefundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRoutingTransit = null; } else {
      this.fstrRoutingTransit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceRefundKey = null; } else {
      this.flngSourceRefundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrScheduleNumber = null; } else {
      this.fstrScheduleNumber = __cur_str;
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
    tblrfnrefund o = (tblrfnrefund) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmStageDate = (o.fdtmStageDate != null) ? (java.sql.Timestamp) o.fdtmStageDate.clone() : null;
    o.fdtmStatusDate = (o.fdtmStatusDate != null) ? (java.sql.Timestamp) o.fdtmStatusDate.clone() : null;
    o.fdtmRequested = (o.fdtmRequested != null) ? (java.sql.Timestamp) o.fdtmRequested.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmExternalInterceptSent = (o.fdtmExternalInterceptSent != null) ? (java.sql.Timestamp) o.fdtmExternalInterceptSent.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmReleased = (o.fdtmReleased != null) ? (java.sql.Timestamp) o.fdtmReleased.clone() : null;
    o.fdtmFileCreated = (o.fdtmFileCreated != null) ? (java.sql.Timestamp) o.fdtmFileCreated.clone() : null;
    o.fdtmIssued = (o.fdtmIssued != null) ? (java.sql.Timestamp) o.fdtmIssued.clone() : null;
    o.fdtmReturned = (o.fdtmReturned != null) ? (java.sql.Timestamp) o.fdtmReturned.clone() : null;
    o.fdtmPaperIssued = (o.fdtmPaperIssued != null) ? (java.sql.Timestamp) o.fdtmPaperIssued.clone() : null;
    o.fdtmReconciled = (o.fdtmReconciled != null) ? (java.sql.Timestamp) o.fdtmReconciled.clone() : null;
    o.fdtmRedeemed = (o.fdtmRedeemed != null) ? (java.sql.Timestamp) o.fdtmRedeemed.clone() : null;
    o.fdtmUnclaimedProperty = (o.fdtmUnclaimedProperty != null) ? (java.sql.Timestamp) o.fdtmUnclaimedProperty.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmAvailable = (o.fdtmAvailable != null) ? (java.sql.Timestamp) o.fdtmAvailable.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblrfnrefund o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmStageDate = (o.fdtmStageDate != null) ? (java.sql.Timestamp) o.fdtmStageDate.clone() : null;
    o.fdtmStatusDate = (o.fdtmStatusDate != null) ? (java.sql.Timestamp) o.fdtmStatusDate.clone() : null;
    o.fdtmRequested = (o.fdtmRequested != null) ? (java.sql.Timestamp) o.fdtmRequested.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmExternalInterceptSent = (o.fdtmExternalInterceptSent != null) ? (java.sql.Timestamp) o.fdtmExternalInterceptSent.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmReleased = (o.fdtmReleased != null) ? (java.sql.Timestamp) o.fdtmReleased.clone() : null;
    o.fdtmFileCreated = (o.fdtmFileCreated != null) ? (java.sql.Timestamp) o.fdtmFileCreated.clone() : null;
    o.fdtmIssued = (o.fdtmIssued != null) ? (java.sql.Timestamp) o.fdtmIssued.clone() : null;
    o.fdtmReturned = (o.fdtmReturned != null) ? (java.sql.Timestamp) o.fdtmReturned.clone() : null;
    o.fdtmPaperIssued = (o.fdtmPaperIssued != null) ? (java.sql.Timestamp) o.fdtmPaperIssued.clone() : null;
    o.fdtmReconciled = (o.fdtmReconciled != null) ? (java.sql.Timestamp) o.fdtmReconciled.clone() : null;
    o.fdtmRedeemed = (o.fdtmRedeemed != null) ? (java.sql.Timestamp) o.fdtmRedeemed.clone() : null;
    o.fdtmUnclaimedProperty = (o.fdtmUnclaimedProperty != null) ? (java.sql.Timestamp) o.fdtmUnclaimedProperty.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmAvailable = (o.fdtmAvailable != null) ? (java.sql.Timestamp) o.fdtmAvailable.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRefundKey", this.flngRefundKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fstrRefundId", this.fstrRefundId);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngTrusteeCustomerKey", this.flngTrusteeCustomerKey);
    __sqoop$field_map.put("flngTrusteeAccountKey", this.flngTrusteeAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrRefundType", this.fstrRefundType);
    __sqoop$field_map.put("fstrApprovalLevel", this.fstrApprovalLevel);
    __sqoop$field_map.put("fcurRange", this.fcurRange);
    __sqoop$field_map.put("fstrRefundStage", this.fstrRefundStage);
    __sqoop$field_map.put("fdtmStageDate", this.fdtmStageDate);
    __sqoop$field_map.put("fstrRefundStatus", this.fstrRefundStatus);
    __sqoop$field_map.put("fdtmStatusDate", this.fdtmStatusDate);
    __sqoop$field_map.put("fstrStatusChangedBy", this.fstrStatusChangedBy);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrRefundChannel", this.fstrRefundChannel);
    __sqoop$field_map.put("fdtmRequested", this.fdtmRequested);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fblnSystemCreated", this.fblnSystemCreated);
    __sqoop$field_map.put("fcurRequestedAmount", this.fcurRequestedAmount);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrVerifiedBy", this.fstrVerifiedBy);
    __sqoop$field_map.put("fdtmExternalInterceptSent", this.fdtmExternalInterceptSent);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fblnAutoApproved", this.fblnAutoApproved);
    __sqoop$field_map.put("fcurPostedAmount", this.fcurPostedAmount);
    __sqoop$field_map.put("fcurMinimumAmount", this.fcurMinimumAmount);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fstrRejectedBy", this.fstrRejectedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversedBy", this.fstrReversedBy);
    __sqoop$field_map.put("fdtmReleased", this.fdtmReleased);
    __sqoop$field_map.put("fstrReleasedBy", this.fstrReleasedBy);
    __sqoop$field_map.put("fdtmFileCreated", this.fdtmFileCreated);
    __sqoop$field_map.put("fdtmIssued", this.fdtmIssued);
    __sqoop$field_map.put("fstrCheckNumber", this.fstrCheckNumber);
    __sqoop$field_map.put("fdtmReturned", this.fdtmReturned);
    __sqoop$field_map.put("fdtmPaperIssued", this.fdtmPaperIssued);
    __sqoop$field_map.put("fdtmReconciled", this.fdtmReconciled);
    __sqoop$field_map.put("fdtmRedeemed", this.fdtmRedeemed);
    __sqoop$field_map.put("fdtmUnclaimedProperty", this.fdtmUnclaimedProperty);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("flngBankAccountVerLast", this.flngBankAccountVerLast);
    __sqoop$field_map.put("flngBankAccountRefundKey", this.flngBankAccountRefundKey);
    __sqoop$field_map.put("fstrRoutingTransit", this.fstrRoutingTransit);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("flngSourceRefundKey", this.flngSourceRefundKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fstrScheduleNumber", this.fstrScheduleNumber);
    __sqoop$field_map.put("fdtmAvailable", this.fdtmAvailable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRefundKey", this.flngRefundKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngBatchKey", this.flngBatchKey);
    __sqoop$field_map.put("fstrRefundId", this.fstrRefundId);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngTrusteeCustomerKey", this.flngTrusteeCustomerKey);
    __sqoop$field_map.put("flngTrusteeAccountKey", this.flngTrusteeAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrRefundType", this.fstrRefundType);
    __sqoop$field_map.put("fstrApprovalLevel", this.fstrApprovalLevel);
    __sqoop$field_map.put("fcurRange", this.fcurRange);
    __sqoop$field_map.put("fstrRefundStage", this.fstrRefundStage);
    __sqoop$field_map.put("fdtmStageDate", this.fdtmStageDate);
    __sqoop$field_map.put("fstrRefundStatus", this.fstrRefundStatus);
    __sqoop$field_map.put("fdtmStatusDate", this.fdtmStatusDate);
    __sqoop$field_map.put("fstrStatusChangedBy", this.fstrStatusChangedBy);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrRefundChannel", this.fstrRefundChannel);
    __sqoop$field_map.put("fdtmRequested", this.fdtmRequested);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fblnSystemCreated", this.fblnSystemCreated);
    __sqoop$field_map.put("fcurRequestedAmount", this.fcurRequestedAmount);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrVerifiedBy", this.fstrVerifiedBy);
    __sqoop$field_map.put("fdtmExternalInterceptSent", this.fdtmExternalInterceptSent);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fblnAutoApproved", this.fblnAutoApproved);
    __sqoop$field_map.put("fcurPostedAmount", this.fcurPostedAmount);
    __sqoop$field_map.put("fcurMinimumAmount", this.fcurMinimumAmount);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fstrRejectedBy", this.fstrRejectedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversedBy", this.fstrReversedBy);
    __sqoop$field_map.put("fdtmReleased", this.fdtmReleased);
    __sqoop$field_map.put("fstrReleasedBy", this.fstrReleasedBy);
    __sqoop$field_map.put("fdtmFileCreated", this.fdtmFileCreated);
    __sqoop$field_map.put("fdtmIssued", this.fdtmIssued);
    __sqoop$field_map.put("fstrCheckNumber", this.fstrCheckNumber);
    __sqoop$field_map.put("fdtmReturned", this.fdtmReturned);
    __sqoop$field_map.put("fdtmPaperIssued", this.fdtmPaperIssued);
    __sqoop$field_map.put("fdtmReconciled", this.fdtmReconciled);
    __sqoop$field_map.put("fdtmRedeemed", this.fdtmRedeemed);
    __sqoop$field_map.put("fdtmUnclaimedProperty", this.fdtmUnclaimedProperty);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("flngBankAccountVerLast", this.flngBankAccountVerLast);
    __sqoop$field_map.put("flngBankAccountRefundKey", this.flngBankAccountRefundKey);
    __sqoop$field_map.put("fstrRoutingTransit", this.fstrRoutingTransit);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("flngSourceRefundKey", this.flngSourceRefundKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fstrScheduleNumber", this.fstrScheduleNumber);
    __sqoop$field_map.put("fdtmAvailable", this.fdtmAvailable);
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
