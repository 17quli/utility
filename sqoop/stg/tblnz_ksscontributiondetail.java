// ORM class for table 'tblnz_ksscontributiondetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:44:31 NZDT 2020
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

public class tblnz_ksscontributiondetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ContributionDetailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fi64ContributionDetailKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fstrType = (String)value;
      }
    });
    setters.put("fi64ContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fi64ContributionKey = (Long)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnInterestCalculated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fblnInterestCalculated = (Integer)value;
      }
    });
    setters.put("fi64InterestContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fi64InterestContributionKey = (Long)value;
      }
    });
    setters.put("fdtmEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmSent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmSent = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fstrStatus = (String)value;
      }
    });
    setters.put("fdtmStatusDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmStatusDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmHoldTill", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmHoldTill = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmFinal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmFinal = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnPending", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fblnPending = (Integer)value;
      }
    });
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("fstrLegacyReferenceNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fstrLegacyReferenceNumber = (String)value;
      }
    });
    setters.put("fstrLegacyLineNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fstrLegacyLineNumber = (String)value;
      }
    });
    setters.put("fblnSmallBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fblnSmallBalance = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributiondetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksscontributiondetail() {
    init0();
  }
  private Long fi64ContributionDetailKey;
  public Long get_fi64ContributionDetailKey() {
    return fi64ContributionDetailKey;
  }
  public void set_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
  }
  public tblnz_ksscontributiondetail with_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_ksscontributiondetail with_flngVer(Integer flngVer) {
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
  public tblnz_ksscontributiondetail with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrType;
  public String get_fstrType() {
    return fstrType;
  }
  public void set_fstrType(String fstrType) {
    this.fstrType = fstrType;
  }
  public tblnz_ksscontributiondetail with_fstrType(String fstrType) {
    this.fstrType = fstrType;
    return this;
  }
  private Long fi64ContributionKey;
  public Long get_fi64ContributionKey() {
    return fi64ContributionKey;
  }
  public void set_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
  }
  public tblnz_ksscontributiondetail with_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_ksscontributiondetail with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblnz_ksscontributiondetail with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private Integer fblnInterestCalculated;
  public Integer get_fblnInterestCalculated() {
    return fblnInterestCalculated;
  }
  public void set_fblnInterestCalculated(Integer fblnInterestCalculated) {
    this.fblnInterestCalculated = fblnInterestCalculated;
  }
  public tblnz_ksscontributiondetail with_fblnInterestCalculated(Integer fblnInterestCalculated) {
    this.fblnInterestCalculated = fblnInterestCalculated;
    return this;
  }
  private Long fi64InterestContributionKey;
  public Long get_fi64InterestContributionKey() {
    return fi64InterestContributionKey;
  }
  public void set_fi64InterestContributionKey(Long fi64InterestContributionKey) {
    this.fi64InterestContributionKey = fi64InterestContributionKey;
  }
  public tblnz_ksscontributiondetail with_fi64InterestContributionKey(Long fi64InterestContributionKey) {
    this.fi64InterestContributionKey = fi64InterestContributionKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveDate;
  public java.sql.Timestamp get_fdtmEffectiveDate() {
    return fdtmEffectiveDate;
  }
  public void set_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
  }
  public tblnz_ksscontributiondetail with_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
    return this;
  }
  private java.sql.Timestamp fdtmSent;
  public java.sql.Timestamp get_fdtmSent() {
    return fdtmSent;
  }
  public void set_fdtmSent(java.sql.Timestamp fdtmSent) {
    this.fdtmSent = fdtmSent;
  }
  public tblnz_ksscontributiondetail with_fdtmSent(java.sql.Timestamp fdtmSent) {
    this.fdtmSent = fdtmSent;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblnz_ksscontributiondetail with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblnz_ksscontributiondetail with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private java.sql.Timestamp fdtmStatusDate;
  public java.sql.Timestamp get_fdtmStatusDate() {
    return fdtmStatusDate;
  }
  public void set_fdtmStatusDate(java.sql.Timestamp fdtmStatusDate) {
    this.fdtmStatusDate = fdtmStatusDate;
  }
  public tblnz_ksscontributiondetail with_fdtmStatusDate(java.sql.Timestamp fdtmStatusDate) {
    this.fdtmStatusDate = fdtmStatusDate;
    return this;
  }
  private java.sql.Timestamp fdtmHoldTill;
  public java.sql.Timestamp get_fdtmHoldTill() {
    return fdtmHoldTill;
  }
  public void set_fdtmHoldTill(java.sql.Timestamp fdtmHoldTill) {
    this.fdtmHoldTill = fdtmHoldTill;
  }
  public tblnz_ksscontributiondetail with_fdtmHoldTill(java.sql.Timestamp fdtmHoldTill) {
    this.fdtmHoldTill = fdtmHoldTill;
    return this;
  }
  private java.sql.Timestamp fdtmFinal;
  public java.sql.Timestamp get_fdtmFinal() {
    return fdtmFinal;
  }
  public void set_fdtmFinal(java.sql.Timestamp fdtmFinal) {
    this.fdtmFinal = fdtmFinal;
  }
  public tblnz_ksscontributiondetail with_fdtmFinal(java.sql.Timestamp fdtmFinal) {
    this.fdtmFinal = fdtmFinal;
    return this;
  }
  private Integer fblnPending;
  public Integer get_fblnPending() {
    return fblnPending;
  }
  public void set_fblnPending(Integer fblnPending) {
    this.fblnPending = fblnPending;
  }
  public tblnz_ksscontributiondetail with_fblnPending(Integer fblnPending) {
    this.fblnPending = fblnPending;
    return this;
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tblnz_ksscontributiondetail with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private String fstrLegacyReferenceNumber;
  public String get_fstrLegacyReferenceNumber() {
    return fstrLegacyReferenceNumber;
  }
  public void set_fstrLegacyReferenceNumber(String fstrLegacyReferenceNumber) {
    this.fstrLegacyReferenceNumber = fstrLegacyReferenceNumber;
  }
  public tblnz_ksscontributiondetail with_fstrLegacyReferenceNumber(String fstrLegacyReferenceNumber) {
    this.fstrLegacyReferenceNumber = fstrLegacyReferenceNumber;
    return this;
  }
  private String fstrLegacyLineNumber;
  public String get_fstrLegacyLineNumber() {
    return fstrLegacyLineNumber;
  }
  public void set_fstrLegacyLineNumber(String fstrLegacyLineNumber) {
    this.fstrLegacyLineNumber = fstrLegacyLineNumber;
  }
  public tblnz_ksscontributiondetail with_fstrLegacyLineNumber(String fstrLegacyLineNumber) {
    this.fstrLegacyLineNumber = fstrLegacyLineNumber;
    return this;
  }
  private Integer fblnSmallBalance;
  public Integer get_fblnSmallBalance() {
    return fblnSmallBalance;
  }
  public void set_fblnSmallBalance(Integer fblnSmallBalance) {
    this.fblnSmallBalance = fblnSmallBalance;
  }
  public tblnz_ksscontributiondetail with_fblnSmallBalance(Integer fblnSmallBalance) {
    this.fblnSmallBalance = fblnSmallBalance;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksscontributiondetail with_fstrWho(String fstrWho) {
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
  public tblnz_ksscontributiondetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontributiondetail)) {
      return false;
    }
    tblnz_ksscontributiondetail that = (tblnz_ksscontributiondetail) o;
    boolean equal = true;
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fblnInterestCalculated == null ? that.fblnInterestCalculated == null : this.fblnInterestCalculated.equals(that.fblnInterestCalculated));
    equal = equal && (this.fi64InterestContributionKey == null ? that.fi64InterestContributionKey == null : this.fi64InterestContributionKey.equals(that.fi64InterestContributionKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fdtmSent == null ? that.fdtmSent == null : this.fdtmSent.equals(that.fdtmSent));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fdtmStatusDate == null ? that.fdtmStatusDate == null : this.fdtmStatusDate.equals(that.fdtmStatusDate));
    equal = equal && (this.fdtmHoldTill == null ? that.fdtmHoldTill == null : this.fdtmHoldTill.equals(that.fdtmHoldTill));
    equal = equal && (this.fdtmFinal == null ? that.fdtmFinal == null : this.fdtmFinal.equals(that.fdtmFinal));
    equal = equal && (this.fblnPending == null ? that.fblnPending == null : this.fblnPending.equals(that.fblnPending));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fstrLegacyReferenceNumber == null ? that.fstrLegacyReferenceNumber == null : this.fstrLegacyReferenceNumber.equals(that.fstrLegacyReferenceNumber));
    equal = equal && (this.fstrLegacyLineNumber == null ? that.fstrLegacyLineNumber == null : this.fstrLegacyLineNumber.equals(that.fstrLegacyLineNumber));
    equal = equal && (this.fblnSmallBalance == null ? that.fblnSmallBalance == null : this.fblnSmallBalance.equals(that.fblnSmallBalance));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontributiondetail)) {
      return false;
    }
    tblnz_ksscontributiondetail that = (tblnz_ksscontributiondetail) o;
    boolean equal = true;
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fblnInterestCalculated == null ? that.fblnInterestCalculated == null : this.fblnInterestCalculated.equals(that.fblnInterestCalculated));
    equal = equal && (this.fi64InterestContributionKey == null ? that.fi64InterestContributionKey == null : this.fi64InterestContributionKey.equals(that.fi64InterestContributionKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fdtmSent == null ? that.fdtmSent == null : this.fdtmSent.equals(that.fdtmSent));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fdtmStatusDate == null ? that.fdtmStatusDate == null : this.fdtmStatusDate.equals(that.fdtmStatusDate));
    equal = equal && (this.fdtmHoldTill == null ? that.fdtmHoldTill == null : this.fdtmHoldTill.equals(that.fdtmHoldTill));
    equal = equal && (this.fdtmFinal == null ? that.fdtmFinal == null : this.fdtmFinal.equals(that.fdtmFinal));
    equal = equal && (this.fblnPending == null ? that.fblnPending == null : this.fblnPending.equals(that.fblnPending));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fstrLegacyReferenceNumber == null ? that.fstrLegacyReferenceNumber == null : this.fstrLegacyReferenceNumber.equals(that.fstrLegacyReferenceNumber));
    equal = equal && (this.fstrLegacyLineNumber == null ? that.fstrLegacyLineNumber == null : this.fstrLegacyLineNumber.equals(that.fstrLegacyLineNumber));
    equal = equal && (this.fblnSmallBalance == null ? that.fblnSmallBalance == null : this.fblnSmallBalance.equals(that.fblnSmallBalance));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(4, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fblnInterestCalculated = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fi64InterestContributionKey = JdbcWritableBridge.readLong(9, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmSent = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmStatusDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmHoldTill = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmFinal = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnPending = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrLegacyReferenceNumber = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrLegacyLineNumber = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnSmallBalance = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(4, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fblnInterestCalculated = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fi64InterestContributionKey = JdbcWritableBridge.readLong(9, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmSent = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmStatusDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmHoldTill = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmFinal = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnPending = JdbcWritableBridge.readInteger(17, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrLegacyReferenceNumber = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrLegacyLineNumber = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnSmallBalance = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInterestCalculated, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64InterestContributionKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSent, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatusDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldTill, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinal, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPending, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegacyReferenceNumber, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegacyLineNumber, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSmallBalance, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInterestCalculated, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64InterestContributionKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSent, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStatusDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldTill, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinal, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPending, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegacyReferenceNumber, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLegacyLineNumber, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSmallBalance, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionDetailKey = null;
    } else {
    this.fi64ContributionDetailKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrType = null;
    } else {
    this.fstrType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionKey = null;
    } else {
    this.fi64ContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInterestCalculated = null;
    } else {
    this.fblnInterestCalculated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64InterestContributionKey = null;
    } else {
    this.fi64InterestContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveDate = null;
    } else {
    this.fdtmEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSent = null;
    } else {
    this.fdtmSent = new Timestamp(__dataIn.readLong());
    this.fdtmSent.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStatusDate = null;
    } else {
    this.fdtmStatusDate = new Timestamp(__dataIn.readLong());
    this.fdtmStatusDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmHoldTill = null;
    } else {
    this.fdtmHoldTill = new Timestamp(__dataIn.readLong());
    this.fdtmHoldTill.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFinal = null;
    } else {
    this.fdtmFinal = new Timestamp(__dataIn.readLong());
    this.fdtmFinal.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPending = null;
    } else {
    this.fblnPending = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLegacyReferenceNumber = null;
    } else {
    this.fstrLegacyReferenceNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLegacyLineNumber = null;
    } else {
    this.fstrLegacyLineNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSmallBalance = null;
    } else {
    this.fblnSmallBalance = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
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
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fblnInterestCalculated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInterestCalculated);
    }
    if (null == this.fi64InterestContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestContributionKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fdtmSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSent.getTime());
    __dataOut.writeInt(this.fdtmSent.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fdtmStatusDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatusDate.getTime());
    __dataOut.writeInt(this.fdtmStatusDate.getNanos());
    }
    if (null == this.fdtmHoldTill) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldTill.getTime());
    __dataOut.writeInt(this.fdtmHoldTill.getNanos());
    }
    if (null == this.fdtmFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinal.getTime());
    __dataOut.writeInt(this.fdtmFinal.getNanos());
    }
    if (null == this.fblnPending) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPending);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fstrLegacyReferenceNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegacyReferenceNumber);
    }
    if (null == this.fstrLegacyLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegacyLineNumber);
    }
    if (null == this.fblnSmallBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSmallBalance);
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
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
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
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fblnInterestCalculated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInterestCalculated);
    }
    if (null == this.fi64InterestContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestContributionKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fdtmSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSent.getTime());
    __dataOut.writeInt(this.fdtmSent.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
    }
    if (null == this.fdtmStatusDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStatusDate.getTime());
    __dataOut.writeInt(this.fdtmStatusDate.getNanos());
    }
    if (null == this.fdtmHoldTill) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldTill.getTime());
    __dataOut.writeInt(this.fdtmHoldTill.getNanos());
    }
    if (null == this.fdtmFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinal.getTime());
    __dataOut.writeInt(this.fdtmFinal.getNanos());
    }
    if (null == this.fblnPending) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPending);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fstrLegacyReferenceNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegacyReferenceNumber);
    }
    if (null == this.fstrLegacyLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLegacyLineNumber);
    }
    if (null == this.fblnSmallBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSmallBalance);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInterestCalculated==null?"\\N":"" + fblnInterestCalculated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestContributionKey==null?"\\N":"" + fi64InterestContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSent==null?"\\N":"" + fdtmSent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatusDate==null?"\\N":"" + fdtmStatusDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldTill==null?"\\N":"" + fdtmHoldTill, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinal==null?"\\N":"" + fdtmFinal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPending==null?"\\N":"" + fblnPending, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegacyReferenceNumber==null?"\\N":fstrLegacyReferenceNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegacyLineNumber==null?"\\N":fstrLegacyLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSmallBalance==null?"\\N":"" + fblnSmallBalance, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInterestCalculated==null?"\\N":"" + fblnInterestCalculated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestContributionKey==null?"\\N":"" + fi64InterestContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSent==null?"\\N":"" + fdtmSent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStatusDate==null?"\\N":"" + fdtmStatusDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldTill==null?"\\N":"" + fdtmHoldTill, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinal==null?"\\N":"" + fdtmFinal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPending==null?"\\N":"" + fblnPending, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegacyReferenceNumber==null?"\\N":fstrLegacyReferenceNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLegacyLineNumber==null?"\\N":fstrLegacyLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSmallBalance==null?"\\N":"" + fblnSmallBalance, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInterestCalculated = null; } else {
      this.fblnInterestCalculated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestContributionKey = null; } else {
      this.fi64InterestContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSent = null; } else {
      this.fdtmSent = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldTill = null; } else {
      this.fdtmHoldTill = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinal = null; } else {
      this.fdtmFinal = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPending = null; } else {
      this.fblnPending = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegacyReferenceNumber = null; } else {
      this.fstrLegacyReferenceNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegacyLineNumber = null; } else {
      this.fstrLegacyLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSmallBalance = null; } else {
      this.fblnSmallBalance = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInterestCalculated = null; } else {
      this.fblnInterestCalculated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestContributionKey = null; } else {
      this.fi64InterestContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSent = null; } else {
      this.fdtmSent = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldTill = null; } else {
      this.fdtmHoldTill = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinal = null; } else {
      this.fdtmFinal = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPending = null; } else {
      this.fblnPending = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegacyReferenceNumber = null; } else {
      this.fstrLegacyReferenceNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLegacyLineNumber = null; } else {
      this.fstrLegacyLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSmallBalance = null; } else {
      this.fblnSmallBalance = Integer.valueOf(__cur_str);
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
    tblnz_ksscontributiondetail o = (tblnz_ksscontributiondetail) super.clone();
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmSent = (o.fdtmSent != null) ? (java.sql.Timestamp) o.fdtmSent.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmStatusDate = (o.fdtmStatusDate != null) ? (java.sql.Timestamp) o.fdtmStatusDate.clone() : null;
    o.fdtmHoldTill = (o.fdtmHoldTill != null) ? (java.sql.Timestamp) o.fdtmHoldTill.clone() : null;
    o.fdtmFinal = (o.fdtmFinal != null) ? (java.sql.Timestamp) o.fdtmFinal.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksscontributiondetail o) throws CloneNotSupportedException {
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmSent = (o.fdtmSent != null) ? (java.sql.Timestamp) o.fdtmSent.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmStatusDate = (o.fdtmStatusDate != null) ? (java.sql.Timestamp) o.fdtmStatusDate.clone() : null;
    o.fdtmHoldTill = (o.fdtmHoldTill != null) ? (java.sql.Timestamp) o.fdtmHoldTill.clone() : null;
    o.fdtmFinal = (o.fdtmFinal != null) ? (java.sql.Timestamp) o.fdtmFinal.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fblnInterestCalculated", this.fblnInterestCalculated);
    __sqoop$field_map.put("fi64InterestContributionKey", this.fi64InterestContributionKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fdtmSent", this.fdtmSent);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fdtmStatusDate", this.fdtmStatusDate);
    __sqoop$field_map.put("fdtmHoldTill", this.fdtmHoldTill);
    __sqoop$field_map.put("fdtmFinal", this.fdtmFinal);
    __sqoop$field_map.put("fblnPending", this.fblnPending);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fstrLegacyReferenceNumber", this.fstrLegacyReferenceNumber);
    __sqoop$field_map.put("fstrLegacyLineNumber", this.fstrLegacyLineNumber);
    __sqoop$field_map.put("fblnSmallBalance", this.fblnSmallBalance);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fblnInterestCalculated", this.fblnInterestCalculated);
    __sqoop$field_map.put("fi64InterestContributionKey", this.fi64InterestContributionKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fdtmSent", this.fdtmSent);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fdtmStatusDate", this.fdtmStatusDate);
    __sqoop$field_map.put("fdtmHoldTill", this.fdtmHoldTill);
    __sqoop$field_map.put("fdtmFinal", this.fdtmFinal);
    __sqoop$field_map.put("fblnPending", this.fblnPending);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fstrLegacyReferenceNumber", this.fstrLegacyReferenceNumber);
    __sqoop$field_map.put("fstrLegacyLineNumber", this.fstrLegacyLineNumber);
    __sqoop$field_map.put("fblnSmallBalance", this.fblnSmallBalance);
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
