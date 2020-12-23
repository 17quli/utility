// ORM class for table 'tbltransadjustrequesthdr'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:47:03 NZDT 2020
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

public class tbltransadjustrequesthdr extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRequestKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngRequestKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrAdjustType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrAdjustType = (String)value;
      }
    });
    setters.put("fstrRequestStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrRequestStatus = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("fcurRequestAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fcurRequestAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRequestedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrRequestedBy = (String)value;
      }
    });
    setters.put("fdtmRequested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmRequested = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRejectedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrRejectedBy = (String)value;
      }
    });
    setters.put("fdtmRejected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmRejected = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWithdrawnBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrWithdrawnBy = (String)value;
      }
    });
    setters.put("fdtmWithdrawn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmWithdrawn = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrApprovedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrApprovedBy = (String)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReversedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrReversedBy = (String)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngCRMKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.flngCRMKey = (Integer)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrDescription = (String)value;
      }
    });
    setters.put("fcurOriginalRequest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fcurOriginalRequest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOriginalRequestPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fcurOriginalRequestPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOriginalRequestInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fcurOriginalRequestInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrAdjustReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrAdjustReason = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjustrequesthdr.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbltransadjustrequesthdr() {
    init0();
  }
  private Integer flngRequestKey;
  public Integer get_flngRequestKey() {
    return flngRequestKey;
  }
  public void set_flngRequestKey(Integer flngRequestKey) {
    this.flngRequestKey = flngRequestKey;
  }
  public tbltransadjustrequesthdr with_flngRequestKey(Integer flngRequestKey) {
    this.flngRequestKey = flngRequestKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbltransadjustrequesthdr with_flngVer(Integer flngVer) {
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
  public tbltransadjustrequesthdr with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrAdjustType;
  public String get_fstrAdjustType() {
    return fstrAdjustType;
  }
  public void set_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
  }
  public tbltransadjustrequesthdr with_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
    return this;
  }
  private String fstrRequestStatus;
  public String get_fstrRequestStatus() {
    return fstrRequestStatus;
  }
  public void set_fstrRequestStatus(String fstrRequestStatus) {
    this.fstrRequestStatus = fstrRequestStatus;
  }
  public tbltransadjustrequesthdr with_fstrRequestStatus(String fstrRequestStatus) {
    this.fstrRequestStatus = fstrRequestStatus;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tbltransadjustrequesthdr with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tbltransadjustrequesthdr with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tbltransadjustrequesthdr with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tbltransadjustrequesthdr with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tbltransadjustrequesthdr with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tbltransadjustrequesthdr with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private java.math.BigDecimal fcurRequestAmount;
  public java.math.BigDecimal get_fcurRequestAmount() {
    return fcurRequestAmount;
  }
  public void set_fcurRequestAmount(java.math.BigDecimal fcurRequestAmount) {
    this.fcurRequestAmount = fcurRequestAmount;
  }
  public tbltransadjustrequesthdr with_fcurRequestAmount(java.math.BigDecimal fcurRequestAmount) {
    this.fcurRequestAmount = fcurRequestAmount;
    return this;
  }
  private String fstrRequestedBy;
  public String get_fstrRequestedBy() {
    return fstrRequestedBy;
  }
  public void set_fstrRequestedBy(String fstrRequestedBy) {
    this.fstrRequestedBy = fstrRequestedBy;
  }
  public tbltransadjustrequesthdr with_fstrRequestedBy(String fstrRequestedBy) {
    this.fstrRequestedBy = fstrRequestedBy;
    return this;
  }
  private java.sql.Timestamp fdtmRequested;
  public java.sql.Timestamp get_fdtmRequested() {
    return fdtmRequested;
  }
  public void set_fdtmRequested(java.sql.Timestamp fdtmRequested) {
    this.fdtmRequested = fdtmRequested;
  }
  public tbltransadjustrequesthdr with_fdtmRequested(java.sql.Timestamp fdtmRequested) {
    this.fdtmRequested = fdtmRequested;
    return this;
  }
  private String fstrRejectedBy;
  public String get_fstrRejectedBy() {
    return fstrRejectedBy;
  }
  public void set_fstrRejectedBy(String fstrRejectedBy) {
    this.fstrRejectedBy = fstrRejectedBy;
  }
  public tbltransadjustrequesthdr with_fstrRejectedBy(String fstrRejectedBy) {
    this.fstrRejectedBy = fstrRejectedBy;
    return this;
  }
  private java.sql.Timestamp fdtmRejected;
  public java.sql.Timestamp get_fdtmRejected() {
    return fdtmRejected;
  }
  public void set_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
  }
  public tbltransadjustrequesthdr with_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
    return this;
  }
  private String fstrWithdrawnBy;
  public String get_fstrWithdrawnBy() {
    return fstrWithdrawnBy;
  }
  public void set_fstrWithdrawnBy(String fstrWithdrawnBy) {
    this.fstrWithdrawnBy = fstrWithdrawnBy;
  }
  public tbltransadjustrequesthdr with_fstrWithdrawnBy(String fstrWithdrawnBy) {
    this.fstrWithdrawnBy = fstrWithdrawnBy;
    return this;
  }
  private java.sql.Timestamp fdtmWithdrawn;
  public java.sql.Timestamp get_fdtmWithdrawn() {
    return fdtmWithdrawn;
  }
  public void set_fdtmWithdrawn(java.sql.Timestamp fdtmWithdrawn) {
    this.fdtmWithdrawn = fdtmWithdrawn;
  }
  public tbltransadjustrequesthdr with_fdtmWithdrawn(java.sql.Timestamp fdtmWithdrawn) {
    this.fdtmWithdrawn = fdtmWithdrawn;
    return this;
  }
  private String fstrApprovedBy;
  public String get_fstrApprovedBy() {
    return fstrApprovedBy;
  }
  public void set_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
  }
  public tbltransadjustrequesthdr with_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tbltransadjustrequesthdr with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private String fstrReversedBy;
  public String get_fstrReversedBy() {
    return fstrReversedBy;
  }
  public void set_fstrReversedBy(String fstrReversedBy) {
    this.fstrReversedBy = fstrReversedBy;
  }
  public tbltransadjustrequesthdr with_fstrReversedBy(String fstrReversedBy) {
    this.fstrReversedBy = fstrReversedBy;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tbltransadjustrequesthdr with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private Integer flngCRMKey;
  public Integer get_flngCRMKey() {
    return flngCRMKey;
  }
  public void set_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
  }
  public tbltransadjustrequesthdr with_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tbltransadjustrequesthdr with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private java.math.BigDecimal fcurOriginalRequest;
  public java.math.BigDecimal get_fcurOriginalRequest() {
    return fcurOriginalRequest;
  }
  public void set_fcurOriginalRequest(java.math.BigDecimal fcurOriginalRequest) {
    this.fcurOriginalRequest = fcurOriginalRequest;
  }
  public tbltransadjustrequesthdr with_fcurOriginalRequest(java.math.BigDecimal fcurOriginalRequest) {
    this.fcurOriginalRequest = fcurOriginalRequest;
    return this;
  }
  private java.math.BigDecimal fcurOriginalRequestPenalty;
  public java.math.BigDecimal get_fcurOriginalRequestPenalty() {
    return fcurOriginalRequestPenalty;
  }
  public void set_fcurOriginalRequestPenalty(java.math.BigDecimal fcurOriginalRequestPenalty) {
    this.fcurOriginalRequestPenalty = fcurOriginalRequestPenalty;
  }
  public tbltransadjustrequesthdr with_fcurOriginalRequestPenalty(java.math.BigDecimal fcurOriginalRequestPenalty) {
    this.fcurOriginalRequestPenalty = fcurOriginalRequestPenalty;
    return this;
  }
  private java.math.BigDecimal fcurOriginalRequestInterest;
  public java.math.BigDecimal get_fcurOriginalRequestInterest() {
    return fcurOriginalRequestInterest;
  }
  public void set_fcurOriginalRequestInterest(java.math.BigDecimal fcurOriginalRequestInterest) {
    this.fcurOriginalRequestInterest = fcurOriginalRequestInterest;
  }
  public tbltransadjustrequesthdr with_fcurOriginalRequestInterest(java.math.BigDecimal fcurOriginalRequestInterest) {
    this.fcurOriginalRequestInterest = fcurOriginalRequestInterest;
    return this;
  }
  private String fstrAdjustReason;
  public String get_fstrAdjustReason() {
    return fstrAdjustReason;
  }
  public void set_fstrAdjustReason(String fstrAdjustReason) {
    this.fstrAdjustReason = fstrAdjustReason;
  }
  public tbltransadjustrequesthdr with_fstrAdjustReason(String fstrAdjustReason) {
    this.fstrAdjustReason = fstrAdjustReason;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbltransadjustrequesthdr with_fstrWho(String fstrWho) {
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
  public tbltransadjustrequesthdr with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjustrequesthdr)) {
      return false;
    }
    tbltransadjustrequesthdr that = (tbltransadjustrequesthdr) o;
    boolean equal = true;
    equal = equal && (this.flngRequestKey == null ? that.flngRequestKey == null : this.flngRequestKey.equals(that.flngRequestKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fstrRequestStatus == null ? that.fstrRequestStatus == null : this.fstrRequestStatus.equals(that.fstrRequestStatus));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fcurRequestAmount == null ? that.fcurRequestAmount == null : this.fcurRequestAmount.equals(that.fcurRequestAmount));
    equal = equal && (this.fstrRequestedBy == null ? that.fstrRequestedBy == null : this.fstrRequestedBy.equals(that.fstrRequestedBy));
    equal = equal && (this.fdtmRequested == null ? that.fdtmRequested == null : this.fdtmRequested.equals(that.fdtmRequested));
    equal = equal && (this.fstrRejectedBy == null ? that.fstrRejectedBy == null : this.fstrRejectedBy.equals(that.fstrRejectedBy));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fstrWithdrawnBy == null ? that.fstrWithdrawnBy == null : this.fstrWithdrawnBy.equals(that.fstrWithdrawnBy));
    equal = equal && (this.fdtmWithdrawn == null ? that.fdtmWithdrawn == null : this.fdtmWithdrawn.equals(that.fdtmWithdrawn));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrReversedBy == null ? that.fstrReversedBy == null : this.fstrReversedBy.equals(that.fstrReversedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fcurOriginalRequest == null ? that.fcurOriginalRequest == null : this.fcurOriginalRequest.equals(that.fcurOriginalRequest));
    equal = equal && (this.fcurOriginalRequestPenalty == null ? that.fcurOriginalRequestPenalty == null : this.fcurOriginalRequestPenalty.equals(that.fcurOriginalRequestPenalty));
    equal = equal && (this.fcurOriginalRequestInterest == null ? that.fcurOriginalRequestInterest == null : this.fcurOriginalRequestInterest.equals(that.fcurOriginalRequestInterest));
    equal = equal && (this.fstrAdjustReason == null ? that.fstrAdjustReason == null : this.fstrAdjustReason.equals(that.fstrAdjustReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjustrequesthdr)) {
      return false;
    }
    tbltransadjustrequesthdr that = (tbltransadjustrequesthdr) o;
    boolean equal = true;
    equal = equal && (this.flngRequestKey == null ? that.flngRequestKey == null : this.flngRequestKey.equals(that.flngRequestKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fstrRequestStatus == null ? that.fstrRequestStatus == null : this.fstrRequestStatus.equals(that.fstrRequestStatus));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fcurRequestAmount == null ? that.fcurRequestAmount == null : this.fcurRequestAmount.equals(that.fcurRequestAmount));
    equal = equal && (this.fstrRequestedBy == null ? that.fstrRequestedBy == null : this.fstrRequestedBy.equals(that.fstrRequestedBy));
    equal = equal && (this.fdtmRequested == null ? that.fdtmRequested == null : this.fdtmRequested.equals(that.fdtmRequested));
    equal = equal && (this.fstrRejectedBy == null ? that.fstrRejectedBy == null : this.fstrRejectedBy.equals(that.fstrRejectedBy));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fstrWithdrawnBy == null ? that.fstrWithdrawnBy == null : this.fstrWithdrawnBy.equals(that.fstrWithdrawnBy));
    equal = equal && (this.fdtmWithdrawn == null ? that.fdtmWithdrawn == null : this.fdtmWithdrawn.equals(that.fdtmWithdrawn));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrReversedBy == null ? that.fstrReversedBy == null : this.fstrReversedBy.equals(that.fstrReversedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fcurOriginalRequest == null ? that.fcurOriginalRequest == null : this.fcurOriginalRequest.equals(that.fcurOriginalRequest));
    equal = equal && (this.fcurOriginalRequestPenalty == null ? that.fcurOriginalRequestPenalty == null : this.fcurOriginalRequestPenalty.equals(that.fcurOriginalRequestPenalty));
    equal = equal && (this.fcurOriginalRequestInterest == null ? that.fcurOriginalRequestInterest == null : this.fcurOriginalRequestInterest.equals(that.fcurOriginalRequestInterest));
    equal = equal && (this.fstrAdjustReason == null ? that.fstrAdjustReason == null : this.fstrAdjustReason.equals(that.fstrAdjustReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRequestKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRequestStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurRequestAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fstrRequestedBy = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmRequested = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrRejectedBy = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrWithdrawnBy = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWithdrawn = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrReversedBy = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(24, __dbResults);
    this.fcurOriginalRequest = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurOriginalRequestPenalty = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOriginalRequestInterest = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fstrAdjustReason = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRequestKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRequestStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurRequestAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fstrRequestedBy = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmRequested = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrRejectedBy = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrWithdrawnBy = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWithdrawn = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrReversedBy = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(24, __dbResults);
    this.fcurOriginalRequest = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurOriginalRequestPenalty = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOriginalRequestInterest = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fstrAdjustReason = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRequestKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestedBy, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequested, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedBy, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWithdrawnBy, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWithdrawn, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedBy, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequest, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequestPenalty, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequestInterest, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustReason, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRequestKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestedBy, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequested, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRejectedBy, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWithdrawnBy, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWithdrawn, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedBy, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequest, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequestPenalty, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOriginalRequestInterest, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustReason, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRequestKey = null;
    } else {
    this.flngRequestKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrAdjustType = null;
    } else {
    this.fstrAdjustType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRequestStatus = null;
    } else {
    this.fstrRequestStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRequestAmount = null;
    } else {
    this.fcurRequestAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRequestedBy = null;
    } else {
    this.fstrRequestedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRequested = null;
    } else {
    this.fdtmRequested = new Timestamp(__dataIn.readLong());
    this.fdtmRequested.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRejectedBy = null;
    } else {
    this.fstrRejectedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRejected = null;
    } else {
    this.fdtmRejected = new Timestamp(__dataIn.readLong());
    this.fdtmRejected.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWithdrawnBy = null;
    } else {
    this.fstrWithdrawnBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWithdrawn = null;
    } else {
    this.fdtmWithdrawn = new Timestamp(__dataIn.readLong());
    this.fdtmWithdrawn.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBy = null;
    } else {
    this.fstrApprovedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReversedBy = null;
    } else {
    this.fstrReversedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCRMKey = null;
    } else {
    this.flngCRMKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalRequest = null;
    } else {
    this.fcurOriginalRequest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalRequestPenalty = null;
    } else {
    this.fcurOriginalRequestPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOriginalRequestInterest = null;
    } else {
    this.fcurOriginalRequestInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdjustReason = null;
    } else {
    this.fstrAdjustReason = Text.readString(__dataIn);
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
    if (null == this.flngRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRequestKey);
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
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fstrRequestStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestStatus);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fcurRequestAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestAmount, __dataOut);
    }
    if (null == this.fstrRequestedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestedBy);
    }
    if (null == this.fdtmRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequested.getTime());
    __dataOut.writeInt(this.fdtmRequested.getNanos());
    }
    if (null == this.fstrRejectedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedBy);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fstrWithdrawnBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWithdrawnBy);
    }
    if (null == this.fdtmWithdrawn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWithdrawn.getTime());
    __dataOut.writeInt(this.fdtmWithdrawn.getNanos());
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrReversedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fcurOriginalRequest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequest, __dataOut);
    }
    if (null == this.fcurOriginalRequestPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequestPenalty, __dataOut);
    }
    if (null == this.fcurOriginalRequestInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequestInterest, __dataOut);
    }
    if (null == this.fstrAdjustReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustReason);
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
    if (null == this.flngRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRequestKey);
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
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fstrRequestStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestStatus);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fcurRequestAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestAmount, __dataOut);
    }
    if (null == this.fstrRequestedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestedBy);
    }
    if (null == this.fdtmRequested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequested.getTime());
    __dataOut.writeInt(this.fdtmRequested.getNanos());
    }
    if (null == this.fstrRejectedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRejectedBy);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fstrWithdrawnBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWithdrawnBy);
    }
    if (null == this.fdtmWithdrawn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWithdrawn.getTime());
    __dataOut.writeInt(this.fdtmWithdrawn.getNanos());
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrReversedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fcurOriginalRequest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequest, __dataOut);
    }
    if (null == this.fcurOriginalRequestPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequestPenalty, __dataOut);
    }
    if (null == this.fcurOriginalRequestInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOriginalRequestInterest, __dataOut);
    }
    if (null == this.fstrAdjustReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustReason);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRequestKey==null?"\\N":"" + flngRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestStatus==null?"\\N":fstrRequestStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestAmount==null?"\\N":fcurRequestAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestedBy==null?"\\N":fstrRequestedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequested==null?"\\N":"" + fdtmRequested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedBy==null?"\\N":fstrRejectedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWithdrawnBy==null?"\\N":fstrWithdrawnBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWithdrawn==null?"\\N":"" + fdtmWithdrawn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedBy==null?"\\N":fstrReversedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequest==null?"\\N":fcurOriginalRequest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequestPenalty==null?"\\N":fcurOriginalRequestPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequestInterest==null?"\\N":fcurOriginalRequestInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustReason==null?"\\N":fstrAdjustReason, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRequestKey==null?"\\N":"" + flngRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestStatus==null?"\\N":fstrRequestStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestAmount==null?"\\N":fcurRequestAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestedBy==null?"\\N":fstrRequestedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequested==null?"\\N":"" + fdtmRequested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRejectedBy==null?"\\N":fstrRejectedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWithdrawnBy==null?"\\N":fstrWithdrawnBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWithdrawn==null?"\\N":"" + fdtmWithdrawn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedBy==null?"\\N":fstrReversedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequest==null?"\\N":fcurOriginalRequest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequestPenalty==null?"\\N":fcurOriginalRequestPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOriginalRequestInterest==null?"\\N":fcurOriginalRequestInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustReason==null?"\\N":fstrAdjustReason, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRequestKey = null; } else {
      this.flngRequestKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestStatus = null; } else {
      this.fstrRequestStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestAmount = null; } else {
      this.fcurRequestAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestedBy = null; } else {
      this.fstrRequestedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRejectedBy = null; } else {
      this.fstrRejectedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrWithdrawnBy = null; } else {
      this.fstrWithdrawnBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWithdrawn = null; } else {
      this.fdtmWithdrawn = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequest = null; } else {
      this.fcurOriginalRequest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequestPenalty = null; } else {
      this.fcurOriginalRequestPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequestInterest = null; } else {
      this.fcurOriginalRequestInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustReason = null; } else {
      this.fstrAdjustReason = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRequestKey = null; } else {
      this.flngRequestKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestStatus = null; } else {
      this.fstrRequestStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestAmount = null; } else {
      this.fcurRequestAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestedBy = null; } else {
      this.fstrRequestedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRejectedBy = null; } else {
      this.fstrRejectedBy = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrWithdrawnBy = null; } else {
      this.fstrWithdrawnBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWithdrawn = null; } else {
      this.fdtmWithdrawn = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequest = null; } else {
      this.fcurOriginalRequest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequestPenalty = null; } else {
      this.fcurOriginalRequestPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOriginalRequestInterest = null; } else {
      this.fcurOriginalRequestInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustReason = null; } else {
      this.fstrAdjustReason = __cur_str;
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
    tbltransadjustrequesthdr o = (tbltransadjustrequesthdr) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRequested = (o.fdtmRequested != null) ? (java.sql.Timestamp) o.fdtmRequested.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmWithdrawn = (o.fdtmWithdrawn != null) ? (java.sql.Timestamp) o.fdtmWithdrawn.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbltransadjustrequesthdr o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRequested = (o.fdtmRequested != null) ? (java.sql.Timestamp) o.fdtmRequested.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmWithdrawn = (o.fdtmWithdrawn != null) ? (java.sql.Timestamp) o.fdtmWithdrawn.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRequestKey", this.flngRequestKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fstrRequestStatus", this.fstrRequestStatus);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fcurRequestAmount", this.fcurRequestAmount);
    __sqoop$field_map.put("fstrRequestedBy", this.fstrRequestedBy);
    __sqoop$field_map.put("fdtmRequested", this.fdtmRequested);
    __sqoop$field_map.put("fstrRejectedBy", this.fstrRejectedBy);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fstrWithdrawnBy", this.fstrWithdrawnBy);
    __sqoop$field_map.put("fdtmWithdrawn", this.fdtmWithdrawn);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrReversedBy", this.fstrReversedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fcurOriginalRequest", this.fcurOriginalRequest);
    __sqoop$field_map.put("fcurOriginalRequestPenalty", this.fcurOriginalRequestPenalty);
    __sqoop$field_map.put("fcurOriginalRequestInterest", this.fcurOriginalRequestInterest);
    __sqoop$field_map.put("fstrAdjustReason", this.fstrAdjustReason);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRequestKey", this.flngRequestKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fstrRequestStatus", this.fstrRequestStatus);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fcurRequestAmount", this.fcurRequestAmount);
    __sqoop$field_map.put("fstrRequestedBy", this.fstrRequestedBy);
    __sqoop$field_map.put("fdtmRequested", this.fdtmRequested);
    __sqoop$field_map.put("fstrRejectedBy", this.fstrRejectedBy);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fstrWithdrawnBy", this.fstrWithdrawnBy);
    __sqoop$field_map.put("fdtmWithdrawn", this.fdtmWithdrawn);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrReversedBy", this.fstrReversedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fcurOriginalRequest", this.fcurOriginalRequest);
    __sqoop$field_map.put("fcurOriginalRequestPenalty", this.fcurOriginalRequestPenalty);
    __sqoop$field_map.put("fcurOriginalRequestInterest", this.fcurOriginalRequestInterest);
    __sqoop$field_map.put("fstrAdjustReason", this.fstrAdjustReason);
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
