// ORM class for table 'tblnz_famdisbursement'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:49:54 NZDT 2020
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

public class tblnz_famdisbursement extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFAMDisbursementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.flngFAMDisbursementKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("fdtmEffectFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fdtmEffectFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEffectTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fdtmEffectTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fdtmEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIWTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurIWTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurCTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurMFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurPTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBSTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurBSTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("fdtmProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fdtmProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintRelationshipPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fintRelationshipPeriod = (Integer)value;
      }
    });
    setters.put("fintEntitlementPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fintEntitlementPeriod = (Integer)value;
      }
    });
    setters.put("fblnUrgent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fblnUrgent = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famdisbursement.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famdisbursement() {
    init0();
  }
  private Integer flngFAMDisbursementKey;
  public Integer get_flngFAMDisbursementKey() {
    return flngFAMDisbursementKey;
  }
  public void set_flngFAMDisbursementKey(Integer flngFAMDisbursementKey) {
    this.flngFAMDisbursementKey = flngFAMDisbursementKey;
  }
  public tblnz_famdisbursement with_flngFAMDisbursementKey(Integer flngFAMDisbursementKey) {
    this.flngFAMDisbursementKey = flngFAMDisbursementKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_famdisbursement with_flngVer(Integer flngVer) {
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
  public tblnz_famdisbursement with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famdisbursement with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffectFrom;
  public java.sql.Timestamp get_fdtmEffectFrom() {
    return fdtmEffectFrom;
  }
  public void set_fdtmEffectFrom(java.sql.Timestamp fdtmEffectFrom) {
    this.fdtmEffectFrom = fdtmEffectFrom;
  }
  public tblnz_famdisbursement with_fdtmEffectFrom(java.sql.Timestamp fdtmEffectFrom) {
    this.fdtmEffectFrom = fdtmEffectFrom;
    return this;
  }
  private java.sql.Timestamp fdtmEffectTo;
  public java.sql.Timestamp get_fdtmEffectTo() {
    return fdtmEffectTo;
  }
  public void set_fdtmEffectTo(java.sql.Timestamp fdtmEffectTo) {
    this.fdtmEffectTo = fdtmEffectTo;
  }
  public tblnz_famdisbursement with_fdtmEffectTo(java.sql.Timestamp fdtmEffectTo) {
    this.fdtmEffectTo = fdtmEffectTo;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveDate;
  public java.sql.Timestamp get_fdtmEffectiveDate() {
    return fdtmEffectiveDate;
  }
  public void set_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
  }
  public tblnz_famdisbursement with_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
    return this;
  }
  private java.math.BigDecimal fcurFTC;
  public java.math.BigDecimal get_fcurFTC() {
    return fcurFTC;
  }
  public void set_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
  }
  public tblnz_famdisbursement with_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
    return this;
  }
  private java.math.BigDecimal fcurIWTC;
  public java.math.BigDecimal get_fcurIWTC() {
    return fcurIWTC;
  }
  public void set_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
  }
  public tblnz_famdisbursement with_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
    return this;
  }
  private java.math.BigDecimal fcurCTC;
  public java.math.BigDecimal get_fcurCTC() {
    return fcurCTC;
  }
  public void set_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
  }
  public tblnz_famdisbursement with_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
    return this;
  }
  private java.math.BigDecimal fcurMFTC;
  public java.math.BigDecimal get_fcurMFTC() {
    return fcurMFTC;
  }
  public void set_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
  }
  public tblnz_famdisbursement with_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
    return this;
  }
  private java.math.BigDecimal fcurPTC;
  public java.math.BigDecimal get_fcurPTC() {
    return fcurPTC;
  }
  public void set_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
  }
  public tblnz_famdisbursement with_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
    return this;
  }
  private java.math.BigDecimal fcurBSTC;
  public java.math.BigDecimal get_fcurBSTC() {
    return fcurBSTC;
  }
  public void set_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
  }
  public tblnz_famdisbursement with_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_famdisbursement with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tblnz_famdisbursement with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private java.sql.Timestamp fdtmProcessed;
  public java.sql.Timestamp get_fdtmProcessed() {
    return fdtmProcessed;
  }
  public void set_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
  }
  public tblnz_famdisbursement with_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
    return this;
  }
  private Integer fintRelationshipPeriod;
  public Integer get_fintRelationshipPeriod() {
    return fintRelationshipPeriod;
  }
  public void set_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
  }
  public tblnz_famdisbursement with_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
    return this;
  }
  private Integer fintEntitlementPeriod;
  public Integer get_fintEntitlementPeriod() {
    return fintEntitlementPeriod;
  }
  public void set_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
  }
  public tblnz_famdisbursement with_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
    return this;
  }
  private Integer fblnUrgent;
  public Integer get_fblnUrgent() {
    return fblnUrgent;
  }
  public void set_fblnUrgent(Integer fblnUrgent) {
    this.fblnUrgent = fblnUrgent;
  }
  public tblnz_famdisbursement with_fblnUrgent(Integer fblnUrgent) {
    this.fblnUrgent = fblnUrgent;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_famdisbursement with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_famdisbursement with_fstrWho(String fstrWho) {
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
  public tblnz_famdisbursement with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famdisbursement)) {
      return false;
    }
    tblnz_famdisbursement that = (tblnz_famdisbursement) o;
    boolean equal = true;
    equal = equal && (this.flngFAMDisbursementKey == null ? that.flngFAMDisbursementKey == null : this.flngFAMDisbursementKey.equals(that.flngFAMDisbursementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fdtmEffectFrom == null ? that.fdtmEffectFrom == null : this.fdtmEffectFrom.equals(that.fdtmEffectFrom));
    equal = equal && (this.fdtmEffectTo == null ? that.fdtmEffectTo == null : this.fdtmEffectTo.equals(that.fdtmEffectTo));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fblnUrgent == null ? that.fblnUrgent == null : this.fblnUrgent.equals(that.fblnUrgent));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famdisbursement)) {
      return false;
    }
    tblnz_famdisbursement that = (tblnz_famdisbursement) o;
    boolean equal = true;
    equal = equal && (this.flngFAMDisbursementKey == null ? that.flngFAMDisbursementKey == null : this.flngFAMDisbursementKey.equals(that.flngFAMDisbursementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fdtmEffectFrom == null ? that.fdtmEffectFrom == null : this.fdtmEffectFrom.equals(that.fdtmEffectFrom));
    equal = equal && (this.fdtmEffectTo == null ? that.fdtmEffectTo == null : this.fdtmEffectTo.equals(that.fdtmEffectTo));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fblnUrgent == null ? that.fblnUrgent == null : this.fblnUrgent.equals(that.fblnUrgent));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFAMDisbursementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmEffectFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmEffectTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnUrgent = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFAMDisbursementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmEffectFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmEffectTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnUrgent = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFAMDisbursementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUrgent, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFAMDisbursementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUrgent, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFAMDisbursementKey = null;
    } else {
    this.flngFAMDisbursementKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectFrom = null;
    } else {
    this.fdtmEffectFrom = new Timestamp(__dataIn.readLong());
    this.fdtmEffectFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectTo = null;
    } else {
    this.fdtmEffectTo = new Timestamp(__dataIn.readLong());
    this.fdtmEffectTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveDate = null;
    } else {
    this.fdtmEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFTC = null;
    } else {
    this.fcurFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIWTC = null;
    } else {
    this.fcurIWTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCTC = null;
    } else {
    this.fcurCTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMFTC = null;
    } else {
    this.fcurMFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTC = null;
    } else {
    this.fcurPTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBSTC = null;
    } else {
    this.fcurBSTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessed = null;
    } else {
    this.fdtmProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmProcessed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintRelationshipPeriod = null;
    } else {
    this.fintRelationshipPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintEntitlementPeriod = null;
    } else {
    this.fintEntitlementPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUrgent = null;
    } else {
    this.fblnUrgent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngFAMDisbursementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMDisbursementKey);
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fdtmEffectFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectFrom.getTime());
    __dataOut.writeInt(this.fdtmEffectFrom.getNanos());
    }
    if (null == this.fdtmEffectTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectTo.getTime());
    __dataOut.writeInt(this.fdtmEffectTo.getNanos());
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fblnUrgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUrgent);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngFAMDisbursementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMDisbursementKey);
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fdtmEffectFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectFrom.getTime());
    __dataOut.writeInt(this.fdtmEffectFrom.getNanos());
    }
    if (null == this.fdtmEffectTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectTo.getTime());
    __dataOut.writeInt(this.fdtmEffectTo.getNanos());
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fblnUrgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUrgent);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMDisbursementKey==null?"\\N":"" + flngFAMDisbursementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectFrom==null?"\\N":"" + fdtmEffectFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectTo==null?"\\N":"" + fdtmEffectTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUrgent==null?"\\N":"" + fblnUrgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMDisbursementKey==null?"\\N":"" + flngFAMDisbursementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectFrom==null?"\\N":"" + fdtmEffectFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectTo==null?"\\N":"" + fdtmEffectTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUrgent==null?"\\N":"" + fblnUrgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMDisbursementKey = null; } else {
      this.flngFAMDisbursementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectFrom = null; } else {
      this.fdtmEffectFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectTo = null; } else {
      this.fdtmEffectTo = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUrgent = null; } else {
      this.fblnUrgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMDisbursementKey = null; } else {
      this.flngFAMDisbursementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectFrom = null; } else {
      this.fdtmEffectFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectTo = null; } else {
      this.fdtmEffectTo = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUrgent = null; } else {
      this.fblnUrgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblnz_famdisbursement o = (tblnz_famdisbursement) super.clone();
    o.fdtmEffectFrom = (o.fdtmEffectFrom != null) ? (java.sql.Timestamp) o.fdtmEffectFrom.clone() : null;
    o.fdtmEffectTo = (o.fdtmEffectTo != null) ? (java.sql.Timestamp) o.fdtmEffectTo.clone() : null;
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famdisbursement o) throws CloneNotSupportedException {
    o.fdtmEffectFrom = (o.fdtmEffectFrom != null) ? (java.sql.Timestamp) o.fdtmEffectFrom.clone() : null;
    o.fdtmEffectTo = (o.fdtmEffectTo != null) ? (java.sql.Timestamp) o.fdtmEffectTo.clone() : null;
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFAMDisbursementKey", this.flngFAMDisbursementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fdtmEffectFrom", this.fdtmEffectFrom);
    __sqoop$field_map.put("fdtmEffectTo", this.fdtmEffectTo);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fblnUrgent", this.fblnUrgent);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFAMDisbursementKey", this.flngFAMDisbursementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fdtmEffectFrom", this.fdtmEffectFrom);
    __sqoop$field_map.put("fdtmEffectTo", this.fdtmEffectTo);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fblnUrgent", this.fblnUrgent);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
