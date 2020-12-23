// ORM class for table 'tblnz_rtnjointaccountholders'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:05:50 NZDT 2020
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

public class tblnz_rtnjointaccountholders extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64SubLineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fi64SubLineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("fstrJointAccountIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountIRD = (String)value;
      }
    });
    setters.put("fstrJointAccountName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountName = (String)value;
      }
    });
    setters.put("fdtmJointAccountDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fdtmJointAccountDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrJointAccountPhone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountPhone = (String)value;
      }
    });
    setters.put("fstrJointAccountEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountEmail = (String)value;
      }
    });
    setters.put("fstrJointAccountAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountAddress = (String)value;
      }
    });
    setters.put("fstrJointAccountCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountCountry = (String)value;
      }
    });
    setters.put("fstrJointAccountCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrJointAccountCountryCode = (String)value;
      }
    });
    setters.put("fcurJointAccountPercentage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fcurJointAccountPercentage = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOverridePercentages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fblnOverridePercentages = (Integer)value;
      }
    });
    setters.put("fblnValidIrd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fblnValidIrd = (Integer)value;
      }
    });
    setters.put("fblnInError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fblnInError = (Integer)value;
      }
    });
    setters.put("fdtmDeleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fdtmDeleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnjointaccountholders.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnjointaccountholders() {
    init0();
  }
  private Long fi64SubLineItemKey;
  public Long get_fi64SubLineItemKey() {
    return fi64SubLineItemKey;
  }
  public void set_fi64SubLineItemKey(Long fi64SubLineItemKey) {
    this.fi64SubLineItemKey = fi64SubLineItemKey;
  }
  public tblnz_rtnjointaccountholders with_fi64SubLineItemKey(Long fi64SubLineItemKey) {
    this.fi64SubLineItemKey = fi64SubLineItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnjointaccountholders with_flngVer(Integer flngVer) {
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
  public tblnz_rtnjointaccountholders with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnjointaccountholders with_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
    return this;
  }
  private String fstrJointAccountIRD;
  public String get_fstrJointAccountIRD() {
    return fstrJointAccountIRD;
  }
  public void set_fstrJointAccountIRD(String fstrJointAccountIRD) {
    this.fstrJointAccountIRD = fstrJointAccountIRD;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountIRD(String fstrJointAccountIRD) {
    this.fstrJointAccountIRD = fstrJointAccountIRD;
    return this;
  }
  private String fstrJointAccountName;
  public String get_fstrJointAccountName() {
    return fstrJointAccountName;
  }
  public void set_fstrJointAccountName(String fstrJointAccountName) {
    this.fstrJointAccountName = fstrJointAccountName;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountName(String fstrJointAccountName) {
    this.fstrJointAccountName = fstrJointAccountName;
    return this;
  }
  private java.sql.Timestamp fdtmJointAccountDOB;
  public java.sql.Timestamp get_fdtmJointAccountDOB() {
    return fdtmJointAccountDOB;
  }
  public void set_fdtmJointAccountDOB(java.sql.Timestamp fdtmJointAccountDOB) {
    this.fdtmJointAccountDOB = fdtmJointAccountDOB;
  }
  public tblnz_rtnjointaccountholders with_fdtmJointAccountDOB(java.sql.Timestamp fdtmJointAccountDOB) {
    this.fdtmJointAccountDOB = fdtmJointAccountDOB;
    return this;
  }
  private String fstrJointAccountPhone;
  public String get_fstrJointAccountPhone() {
    return fstrJointAccountPhone;
  }
  public void set_fstrJointAccountPhone(String fstrJointAccountPhone) {
    this.fstrJointAccountPhone = fstrJointAccountPhone;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountPhone(String fstrJointAccountPhone) {
    this.fstrJointAccountPhone = fstrJointAccountPhone;
    return this;
  }
  private String fstrJointAccountEmail;
  public String get_fstrJointAccountEmail() {
    return fstrJointAccountEmail;
  }
  public void set_fstrJointAccountEmail(String fstrJointAccountEmail) {
    this.fstrJointAccountEmail = fstrJointAccountEmail;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountEmail(String fstrJointAccountEmail) {
    this.fstrJointAccountEmail = fstrJointAccountEmail;
    return this;
  }
  private String fstrJointAccountAddress;
  public String get_fstrJointAccountAddress() {
    return fstrJointAccountAddress;
  }
  public void set_fstrJointAccountAddress(String fstrJointAccountAddress) {
    this.fstrJointAccountAddress = fstrJointAccountAddress;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountAddress(String fstrJointAccountAddress) {
    this.fstrJointAccountAddress = fstrJointAccountAddress;
    return this;
  }
  private String fstrJointAccountCountry;
  public String get_fstrJointAccountCountry() {
    return fstrJointAccountCountry;
  }
  public void set_fstrJointAccountCountry(String fstrJointAccountCountry) {
    this.fstrJointAccountCountry = fstrJointAccountCountry;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountCountry(String fstrJointAccountCountry) {
    this.fstrJointAccountCountry = fstrJointAccountCountry;
    return this;
  }
  private String fstrJointAccountCountryCode;
  public String get_fstrJointAccountCountryCode() {
    return fstrJointAccountCountryCode;
  }
  public void set_fstrJointAccountCountryCode(String fstrJointAccountCountryCode) {
    this.fstrJointAccountCountryCode = fstrJointAccountCountryCode;
  }
  public tblnz_rtnjointaccountholders with_fstrJointAccountCountryCode(String fstrJointAccountCountryCode) {
    this.fstrJointAccountCountryCode = fstrJointAccountCountryCode;
    return this;
  }
  private java.math.BigDecimal fcurJointAccountPercentage;
  public java.math.BigDecimal get_fcurJointAccountPercentage() {
    return fcurJointAccountPercentage;
  }
  public void set_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
    this.fcurJointAccountPercentage = fcurJointAccountPercentage;
  }
  public tblnz_rtnjointaccountholders with_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
    this.fcurJointAccountPercentage = fcurJointAccountPercentage;
    return this;
  }
  private Integer fblnOverridePercentages;
  public Integer get_fblnOverridePercentages() {
    return fblnOverridePercentages;
  }
  public void set_fblnOverridePercentages(Integer fblnOverridePercentages) {
    this.fblnOverridePercentages = fblnOverridePercentages;
  }
  public tblnz_rtnjointaccountholders with_fblnOverridePercentages(Integer fblnOverridePercentages) {
    this.fblnOverridePercentages = fblnOverridePercentages;
    return this;
  }
  private Integer fblnValidIrd;
  public Integer get_fblnValidIrd() {
    return fblnValidIrd;
  }
  public void set_fblnValidIrd(Integer fblnValidIrd) {
    this.fblnValidIrd = fblnValidIrd;
  }
  public tblnz_rtnjointaccountholders with_fblnValidIrd(Integer fblnValidIrd) {
    this.fblnValidIrd = fblnValidIrd;
    return this;
  }
  private Integer fblnInError;
  public Integer get_fblnInError() {
    return fblnInError;
  }
  public void set_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
  }
  public tblnz_rtnjointaccountholders with_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
    return this;
  }
  private java.sql.Timestamp fdtmDeleted;
  public java.sql.Timestamp get_fdtmDeleted() {
    return fdtmDeleted;
  }
  public void set_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
  }
  public tblnz_rtnjointaccountholders with_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnjointaccountholders with_fstrWho(String fstrWho) {
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
  public tblnz_rtnjointaccountholders with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnjointaccountholders)) {
      return false;
    }
    tblnz_rtnjointaccountholders that = (tblnz_rtnjointaccountholders) o;
    boolean equal = true;
    equal = equal && (this.fi64SubLineItemKey == null ? that.fi64SubLineItemKey == null : this.fi64SubLineItemKey.equals(that.fi64SubLineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.fstrJointAccountIRD == null ? that.fstrJointAccountIRD == null : this.fstrJointAccountIRD.equals(that.fstrJointAccountIRD));
    equal = equal && (this.fstrJointAccountName == null ? that.fstrJointAccountName == null : this.fstrJointAccountName.equals(that.fstrJointAccountName));
    equal = equal && (this.fdtmJointAccountDOB == null ? that.fdtmJointAccountDOB == null : this.fdtmJointAccountDOB.equals(that.fdtmJointAccountDOB));
    equal = equal && (this.fstrJointAccountPhone == null ? that.fstrJointAccountPhone == null : this.fstrJointAccountPhone.equals(that.fstrJointAccountPhone));
    equal = equal && (this.fstrJointAccountEmail == null ? that.fstrJointAccountEmail == null : this.fstrJointAccountEmail.equals(that.fstrJointAccountEmail));
    equal = equal && (this.fstrJointAccountAddress == null ? that.fstrJointAccountAddress == null : this.fstrJointAccountAddress.equals(that.fstrJointAccountAddress));
    equal = equal && (this.fstrJointAccountCountry == null ? that.fstrJointAccountCountry == null : this.fstrJointAccountCountry.equals(that.fstrJointAccountCountry));
    equal = equal && (this.fstrJointAccountCountryCode == null ? that.fstrJointAccountCountryCode == null : this.fstrJointAccountCountryCode.equals(that.fstrJointAccountCountryCode));
    equal = equal && (this.fcurJointAccountPercentage == null ? that.fcurJointAccountPercentage == null : this.fcurJointAccountPercentage.equals(that.fcurJointAccountPercentage));
    equal = equal && (this.fblnOverridePercentages == null ? that.fblnOverridePercentages == null : this.fblnOverridePercentages.equals(that.fblnOverridePercentages));
    equal = equal && (this.fblnValidIrd == null ? that.fblnValidIrd == null : this.fblnValidIrd.equals(that.fblnValidIrd));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnjointaccountholders)) {
      return false;
    }
    tblnz_rtnjointaccountholders that = (tblnz_rtnjointaccountholders) o;
    boolean equal = true;
    equal = equal && (this.fi64SubLineItemKey == null ? that.fi64SubLineItemKey == null : this.fi64SubLineItemKey.equals(that.fi64SubLineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.fstrJointAccountIRD == null ? that.fstrJointAccountIRD == null : this.fstrJointAccountIRD.equals(that.fstrJointAccountIRD));
    equal = equal && (this.fstrJointAccountName == null ? that.fstrJointAccountName == null : this.fstrJointAccountName.equals(that.fstrJointAccountName));
    equal = equal && (this.fdtmJointAccountDOB == null ? that.fdtmJointAccountDOB == null : this.fdtmJointAccountDOB.equals(that.fdtmJointAccountDOB));
    equal = equal && (this.fstrJointAccountPhone == null ? that.fstrJointAccountPhone == null : this.fstrJointAccountPhone.equals(that.fstrJointAccountPhone));
    equal = equal && (this.fstrJointAccountEmail == null ? that.fstrJointAccountEmail == null : this.fstrJointAccountEmail.equals(that.fstrJointAccountEmail));
    equal = equal && (this.fstrJointAccountAddress == null ? that.fstrJointAccountAddress == null : this.fstrJointAccountAddress.equals(that.fstrJointAccountAddress));
    equal = equal && (this.fstrJointAccountCountry == null ? that.fstrJointAccountCountry == null : this.fstrJointAccountCountry.equals(that.fstrJointAccountCountry));
    equal = equal && (this.fstrJointAccountCountryCode == null ? that.fstrJointAccountCountryCode == null : this.fstrJointAccountCountryCode.equals(that.fstrJointAccountCountryCode));
    equal = equal && (this.fcurJointAccountPercentage == null ? that.fcurJointAccountPercentage == null : this.fcurJointAccountPercentage.equals(that.fcurJointAccountPercentage));
    equal = equal && (this.fblnOverridePercentages == null ? that.fblnOverridePercentages == null : this.fblnOverridePercentages.equals(that.fblnOverridePercentages));
    equal = equal && (this.fblnValidIrd == null ? that.fblnValidIrd == null : this.fblnValidIrd.equals(that.fblnValidIrd));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64SubLineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fi64LineItemKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.fstrJointAccountIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrJointAccountName = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmJointAccountDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrJointAccountPhone = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrJointAccountEmail = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrJointAccountAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrJointAccountCountry = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrJointAccountCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnOverridePercentages = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnValidIrd = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64SubLineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fi64LineItemKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.fstrJointAccountIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrJointAccountName = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmJointAccountDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrJointAccountPhone = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrJointAccountEmail = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrJointAccountAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrJointAccountCountry = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrJointAccountCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnOverridePercentages = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnValidIrd = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64SubLineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64LineItemKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmJointAccountDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountPhone, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountEmail, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountCountry, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridePercentages, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValidIrd, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64SubLineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64LineItemKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmJointAccountDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountPhone, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountEmail, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountCountry, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJointAccountCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridePercentages, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValidIrd, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64SubLineItemKey = null;
    } else {
    this.fi64SubLineItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fi64LineItemKey = null;
    } else {
    this.fi64LineItemKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountIRD = null;
    } else {
    this.fstrJointAccountIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountName = null;
    } else {
    this.fstrJointAccountName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmJointAccountDOB = null;
    } else {
    this.fdtmJointAccountDOB = new Timestamp(__dataIn.readLong());
    this.fdtmJointAccountDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountPhone = null;
    } else {
    this.fstrJointAccountPhone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountEmail = null;
    } else {
    this.fstrJointAccountEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountAddress = null;
    } else {
    this.fstrJointAccountAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountCountry = null;
    } else {
    this.fstrJointAccountCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJointAccountCountryCode = null;
    } else {
    this.fstrJointAccountCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurJointAccountPercentage = null;
    } else {
    this.fcurJointAccountPercentage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverridePercentages = null;
    } else {
    this.fblnOverridePercentages = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValidIrd = null;
    } else {
    this.fblnValidIrd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInError = null;
    } else {
    this.fblnInError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeleted = null;
    } else {
    this.fdtmDeleted = new Timestamp(__dataIn.readLong());
    this.fdtmDeleted.setNanos(__dataIn.readInt());
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
    if (null == this.fi64SubLineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SubLineItemKey);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
    }
    if (null == this.fstrJointAccountIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountIRD);
    }
    if (null == this.fstrJointAccountName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountName);
    }
    if (null == this.fdtmJointAccountDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmJointAccountDOB.getTime());
    __dataOut.writeInt(this.fdtmJointAccountDOB.getNanos());
    }
    if (null == this.fstrJointAccountPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountPhone);
    }
    if (null == this.fstrJointAccountEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountEmail);
    }
    if (null == this.fstrJointAccountAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountAddress);
    }
    if (null == this.fstrJointAccountCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountCountry);
    }
    if (null == this.fstrJointAccountCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountCountryCode);
    }
    if (null == this.fcurJointAccountPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurJointAccountPercentage, __dataOut);
    }
    if (null == this.fblnOverridePercentages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridePercentages);
    }
    if (null == this.fblnValidIrd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValidIrd);
    }
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
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
    if (null == this.fi64SubLineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SubLineItemKey);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
    }
    if (null == this.fstrJointAccountIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountIRD);
    }
    if (null == this.fstrJointAccountName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountName);
    }
    if (null == this.fdtmJointAccountDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmJointAccountDOB.getTime());
    __dataOut.writeInt(this.fdtmJointAccountDOB.getNanos());
    }
    if (null == this.fstrJointAccountPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountPhone);
    }
    if (null == this.fstrJointAccountEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountEmail);
    }
    if (null == this.fstrJointAccountAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountAddress);
    }
    if (null == this.fstrJointAccountCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountCountry);
    }
    if (null == this.fstrJointAccountCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJointAccountCountryCode);
    }
    if (null == this.fcurJointAccountPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurJointAccountPercentage, __dataOut);
    }
    if (null == this.fblnOverridePercentages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridePercentages);
    }
    if (null == this.fblnValidIrd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValidIrd);
    }
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SubLineItemKey==null?"\\N":"" + fi64SubLineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountIRD==null?"\\N":fstrJointAccountIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountName==null?"\\N":fstrJointAccountName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmJointAccountDOB==null?"\\N":"" + fdtmJointAccountDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountPhone==null?"\\N":fstrJointAccountPhone, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountEmail==null?"\\N":fstrJointAccountEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountAddress==null?"\\N":fstrJointAccountAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountCountry==null?"\\N":fstrJointAccountCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountCountryCode==null?"\\N":fstrJointAccountCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurJointAccountPercentage==null?"\\N":fcurJointAccountPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridePercentages==null?"\\N":"" + fblnOverridePercentages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValidIrd==null?"\\N":"" + fblnValidIrd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SubLineItemKey==null?"\\N":"" + fi64SubLineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountIRD==null?"\\N":fstrJointAccountIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountName==null?"\\N":fstrJointAccountName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmJointAccountDOB==null?"\\N":"" + fdtmJointAccountDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountPhone==null?"\\N":fstrJointAccountPhone, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountEmail==null?"\\N":fstrJointAccountEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountAddress==null?"\\N":fstrJointAccountAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountCountry==null?"\\N":fstrJointAccountCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJointAccountCountryCode==null?"\\N":fstrJointAccountCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurJointAccountPercentage==null?"\\N":fcurJointAccountPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridePercentages==null?"\\N":"" + fblnOverridePercentages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValidIrd==null?"\\N":"" + fblnValidIrd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SubLineItemKey = null; } else {
      this.fi64SubLineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountIRD = null; } else {
      this.fstrJointAccountIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountName = null; } else {
      this.fstrJointAccountName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmJointAccountDOB = null; } else {
      this.fdtmJointAccountDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountPhone = null; } else {
      this.fstrJointAccountPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountEmail = null; } else {
      this.fstrJointAccountEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountAddress = null; } else {
      this.fstrJointAccountAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountCountry = null; } else {
      this.fstrJointAccountCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountCountryCode = null; } else {
      this.fstrJointAccountCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurJointAccountPercentage = null; } else {
      this.fcurJointAccountPercentage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverridePercentages = null; } else {
      this.fblnOverridePercentages = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValidIrd = null; } else {
      this.fblnValidIrd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SubLineItemKey = null; } else {
      this.fi64SubLineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountIRD = null; } else {
      this.fstrJointAccountIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountName = null; } else {
      this.fstrJointAccountName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmJointAccountDOB = null; } else {
      this.fdtmJointAccountDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountPhone = null; } else {
      this.fstrJointAccountPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountEmail = null; } else {
      this.fstrJointAccountEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountAddress = null; } else {
      this.fstrJointAccountAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountCountry = null; } else {
      this.fstrJointAccountCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJointAccountCountryCode = null; } else {
      this.fstrJointAccountCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurJointAccountPercentage = null; } else {
      this.fcurJointAccountPercentage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverridePercentages = null; } else {
      this.fblnOverridePercentages = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValidIrd = null; } else {
      this.fblnValidIrd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
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
    tblnz_rtnjointaccountholders o = (tblnz_rtnjointaccountholders) super.clone();
    o.fdtmJointAccountDOB = (o.fdtmJointAccountDOB != null) ? (java.sql.Timestamp) o.fdtmJointAccountDOB.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnjointaccountholders o) throws CloneNotSupportedException {
    o.fdtmJointAccountDOB = (o.fdtmJointAccountDOB != null) ? (java.sql.Timestamp) o.fdtmJointAccountDOB.clone() : null;
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64SubLineItemKey", this.fi64SubLineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("fstrJointAccountIRD", this.fstrJointAccountIRD);
    __sqoop$field_map.put("fstrJointAccountName", this.fstrJointAccountName);
    __sqoop$field_map.put("fdtmJointAccountDOB", this.fdtmJointAccountDOB);
    __sqoop$field_map.put("fstrJointAccountPhone", this.fstrJointAccountPhone);
    __sqoop$field_map.put("fstrJointAccountEmail", this.fstrJointAccountEmail);
    __sqoop$field_map.put("fstrJointAccountAddress", this.fstrJointAccountAddress);
    __sqoop$field_map.put("fstrJointAccountCountry", this.fstrJointAccountCountry);
    __sqoop$field_map.put("fstrJointAccountCountryCode", this.fstrJointAccountCountryCode);
    __sqoop$field_map.put("fcurJointAccountPercentage", this.fcurJointAccountPercentage);
    __sqoop$field_map.put("fblnOverridePercentages", this.fblnOverridePercentages);
    __sqoop$field_map.put("fblnValidIrd", this.fblnValidIrd);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64SubLineItemKey", this.fi64SubLineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("fstrJointAccountIRD", this.fstrJointAccountIRD);
    __sqoop$field_map.put("fstrJointAccountName", this.fstrJointAccountName);
    __sqoop$field_map.put("fdtmJointAccountDOB", this.fdtmJointAccountDOB);
    __sqoop$field_map.put("fstrJointAccountPhone", this.fstrJointAccountPhone);
    __sqoop$field_map.put("fstrJointAccountEmail", this.fstrJointAccountEmail);
    __sqoop$field_map.put("fstrJointAccountAddress", this.fstrJointAccountAddress);
    __sqoop$field_map.put("fstrJointAccountCountry", this.fstrJointAccountCountry);
    __sqoop$field_map.put("fstrJointAccountCountryCode", this.fstrJointAccountCountryCode);
    __sqoop$field_map.put("fcurJointAccountPercentage", this.fcurJointAccountPercentage);
    __sqoop$field_map.put("fblnOverridePercentages", this.fblnOverridePercentages);
    __sqoop$field_map.put("fblnValidIrd", this.fblnValidIrd);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
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
