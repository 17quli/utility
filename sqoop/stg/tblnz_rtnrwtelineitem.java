// ORM class for table 'tblnz_rtnrwtelineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:17:44 NZDT 2020
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

public class tblnz_rtnrwtelineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrRecipientIdentifier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientIdentifier = (String)value;
      }
    });
    setters.put("fstrRecipientName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientName = (String)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("fdtmRecipientDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fdtmRecipientDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecipientPhone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientPhone = (String)value;
      }
    });
    setters.put("fstrRecipientEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientEmail = (String)value;
      }
    });
    setters.put("fstrRecipientAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientAddress = (String)value;
      }
    });
    setters.put("fstrRecipientCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientCountry = (String)value;
      }
    });
    setters.put("fstrRecipientCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrRecipientCountryCode = (String)value;
      }
    });
    setters.put("fcurRecipientPercentage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fcurRecipientPercentage = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnJointAccountIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fblnJointAccountIndicator = (Integer)value;
      }
    });
    setters.put("flngJointAccountHolders", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.flngJointAccountHolders = (Integer)value;
      }
    });
    setters.put("fcurGrossAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fcurGrossAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fcurDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOverridePercentages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fblnOverridePercentages = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtelineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrwtelineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnrwtelineitem with_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnrwtelineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnrwtelineitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrRecipientIdentifier;
  public String get_fstrRecipientIdentifier() {
    return fstrRecipientIdentifier;
  }
  public void set_fstrRecipientIdentifier(String fstrRecipientIdentifier) {
    this.fstrRecipientIdentifier = fstrRecipientIdentifier;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientIdentifier(String fstrRecipientIdentifier) {
    this.fstrRecipientIdentifier = fstrRecipientIdentifier;
    return this;
  }
  private String fstrRecipientName;
  public String get_fstrRecipientName() {
    return fstrRecipientName;
  }
  public void set_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private java.sql.Timestamp fdtmRecipientDOB;
  public java.sql.Timestamp get_fdtmRecipientDOB() {
    return fdtmRecipientDOB;
  }
  public void set_fdtmRecipientDOB(java.sql.Timestamp fdtmRecipientDOB) {
    this.fdtmRecipientDOB = fdtmRecipientDOB;
  }
  public tblnz_rtnrwtelineitem with_fdtmRecipientDOB(java.sql.Timestamp fdtmRecipientDOB) {
    this.fdtmRecipientDOB = fdtmRecipientDOB;
    return this;
  }
  private String fstrRecipientPhone;
  public String get_fstrRecipientPhone() {
    return fstrRecipientPhone;
  }
  public void set_fstrRecipientPhone(String fstrRecipientPhone) {
    this.fstrRecipientPhone = fstrRecipientPhone;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientPhone(String fstrRecipientPhone) {
    this.fstrRecipientPhone = fstrRecipientPhone;
    return this;
  }
  private String fstrRecipientEmail;
  public String get_fstrRecipientEmail() {
    return fstrRecipientEmail;
  }
  public void set_fstrRecipientEmail(String fstrRecipientEmail) {
    this.fstrRecipientEmail = fstrRecipientEmail;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientEmail(String fstrRecipientEmail) {
    this.fstrRecipientEmail = fstrRecipientEmail;
    return this;
  }
  private String fstrRecipientAddress;
  public String get_fstrRecipientAddress() {
    return fstrRecipientAddress;
  }
  public void set_fstrRecipientAddress(String fstrRecipientAddress) {
    this.fstrRecipientAddress = fstrRecipientAddress;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientAddress(String fstrRecipientAddress) {
    this.fstrRecipientAddress = fstrRecipientAddress;
    return this;
  }
  private String fstrRecipientCountry;
  public String get_fstrRecipientCountry() {
    return fstrRecipientCountry;
  }
  public void set_fstrRecipientCountry(String fstrRecipientCountry) {
    this.fstrRecipientCountry = fstrRecipientCountry;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientCountry(String fstrRecipientCountry) {
    this.fstrRecipientCountry = fstrRecipientCountry;
    return this;
  }
  private String fstrRecipientCountryCode;
  public String get_fstrRecipientCountryCode() {
    return fstrRecipientCountryCode;
  }
  public void set_fstrRecipientCountryCode(String fstrRecipientCountryCode) {
    this.fstrRecipientCountryCode = fstrRecipientCountryCode;
  }
  public tblnz_rtnrwtelineitem with_fstrRecipientCountryCode(String fstrRecipientCountryCode) {
    this.fstrRecipientCountryCode = fstrRecipientCountryCode;
    return this;
  }
  private java.math.BigDecimal fcurRecipientPercentage;
  public java.math.BigDecimal get_fcurRecipientPercentage() {
    return fcurRecipientPercentage;
  }
  public void set_fcurRecipientPercentage(java.math.BigDecimal fcurRecipientPercentage) {
    this.fcurRecipientPercentage = fcurRecipientPercentage;
  }
  public tblnz_rtnrwtelineitem with_fcurRecipientPercentage(java.math.BigDecimal fcurRecipientPercentage) {
    this.fcurRecipientPercentage = fcurRecipientPercentage;
    return this;
  }
  private Integer fblnJointAccountIndicator;
  public Integer get_fblnJointAccountIndicator() {
    return fblnJointAccountIndicator;
  }
  public void set_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
  }
  public tblnz_rtnrwtelineitem with_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
    return this;
  }
  private Integer flngJointAccountHolders;
  public Integer get_flngJointAccountHolders() {
    return flngJointAccountHolders;
  }
  public void set_flngJointAccountHolders(Integer flngJointAccountHolders) {
    this.flngJointAccountHolders = flngJointAccountHolders;
  }
  public tblnz_rtnrwtelineitem with_flngJointAccountHolders(Integer flngJointAccountHolders) {
    this.flngJointAccountHolders = flngJointAccountHolders;
    return this;
  }
  private java.math.BigDecimal fcurGrossAmount;
  public java.math.BigDecimal get_fcurGrossAmount() {
    return fcurGrossAmount;
  }
  public void set_fcurGrossAmount(java.math.BigDecimal fcurGrossAmount) {
    this.fcurGrossAmount = fcurGrossAmount;
  }
  public tblnz_rtnrwtelineitem with_fcurGrossAmount(java.math.BigDecimal fcurGrossAmount) {
    this.fcurGrossAmount = fcurGrossAmount;
    return this;
  }
  private java.math.BigDecimal fcurDeducted;
  public java.math.BigDecimal get_fcurDeducted() {
    return fcurDeducted;
  }
  public void set_fcurDeducted(java.math.BigDecimal fcurDeducted) {
    this.fcurDeducted = fcurDeducted;
  }
  public tblnz_rtnrwtelineitem with_fcurDeducted(java.math.BigDecimal fcurDeducted) {
    this.fcurDeducted = fcurDeducted;
    return this;
  }
  private Integer fblnOverridePercentages;
  public Integer get_fblnOverridePercentages() {
    return fblnOverridePercentages;
  }
  public void set_fblnOverridePercentages(Integer fblnOverridePercentages) {
    this.fblnOverridePercentages = fblnOverridePercentages;
  }
  public tblnz_rtnrwtelineitem with_fblnOverridePercentages(Integer fblnOverridePercentages) {
    this.fblnOverridePercentages = fblnOverridePercentages;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrwtelineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrwtelineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtelineitem)) {
      return false;
    }
    tblnz_rtnrwtelineitem that = (tblnz_rtnrwtelineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrRecipientIdentifier == null ? that.fstrRecipientIdentifier == null : this.fstrRecipientIdentifier.equals(that.fstrRecipientIdentifier));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fdtmRecipientDOB == null ? that.fdtmRecipientDOB == null : this.fdtmRecipientDOB.equals(that.fdtmRecipientDOB));
    equal = equal && (this.fstrRecipientPhone == null ? that.fstrRecipientPhone == null : this.fstrRecipientPhone.equals(that.fstrRecipientPhone));
    equal = equal && (this.fstrRecipientEmail == null ? that.fstrRecipientEmail == null : this.fstrRecipientEmail.equals(that.fstrRecipientEmail));
    equal = equal && (this.fstrRecipientAddress == null ? that.fstrRecipientAddress == null : this.fstrRecipientAddress.equals(that.fstrRecipientAddress));
    equal = equal && (this.fstrRecipientCountry == null ? that.fstrRecipientCountry == null : this.fstrRecipientCountry.equals(that.fstrRecipientCountry));
    equal = equal && (this.fstrRecipientCountryCode == null ? that.fstrRecipientCountryCode == null : this.fstrRecipientCountryCode.equals(that.fstrRecipientCountryCode));
    equal = equal && (this.fcurRecipientPercentage == null ? that.fcurRecipientPercentage == null : this.fcurRecipientPercentage.equals(that.fcurRecipientPercentage));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.flngJointAccountHolders == null ? that.flngJointAccountHolders == null : this.flngJointAccountHolders.equals(that.flngJointAccountHolders));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurDeducted == null ? that.fcurDeducted == null : this.fcurDeducted.equals(that.fcurDeducted));
    equal = equal && (this.fblnOverridePercentages == null ? that.fblnOverridePercentages == null : this.fblnOverridePercentages.equals(that.fblnOverridePercentages));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtelineitem)) {
      return false;
    }
    tblnz_rtnrwtelineitem that = (tblnz_rtnrwtelineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrRecipientIdentifier == null ? that.fstrRecipientIdentifier == null : this.fstrRecipientIdentifier.equals(that.fstrRecipientIdentifier));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fdtmRecipientDOB == null ? that.fdtmRecipientDOB == null : this.fdtmRecipientDOB.equals(that.fdtmRecipientDOB));
    equal = equal && (this.fstrRecipientPhone == null ? that.fstrRecipientPhone == null : this.fstrRecipientPhone.equals(that.fstrRecipientPhone));
    equal = equal && (this.fstrRecipientEmail == null ? that.fstrRecipientEmail == null : this.fstrRecipientEmail.equals(that.fstrRecipientEmail));
    equal = equal && (this.fstrRecipientAddress == null ? that.fstrRecipientAddress == null : this.fstrRecipientAddress.equals(that.fstrRecipientAddress));
    equal = equal && (this.fstrRecipientCountry == null ? that.fstrRecipientCountry == null : this.fstrRecipientCountry.equals(that.fstrRecipientCountry));
    equal = equal && (this.fstrRecipientCountryCode == null ? that.fstrRecipientCountryCode == null : this.fstrRecipientCountryCode.equals(that.fstrRecipientCountryCode));
    equal = equal && (this.fcurRecipientPercentage == null ? that.fcurRecipientPercentage == null : this.fcurRecipientPercentage.equals(that.fcurRecipientPercentage));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.flngJointAccountHolders == null ? that.flngJointAccountHolders == null : this.flngJointAccountHolders.equals(that.flngJointAccountHolders));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurDeducted == null ? that.fcurDeducted == null : this.fcurDeducted.equals(that.fcurDeducted));
    equal = equal && (this.fblnOverridePercentages == null ? that.fblnOverridePercentages == null : this.fblnOverridePercentages.equals(that.fblnOverridePercentages));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrRecipientIdentifier = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmRecipientDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrRecipientPhone = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientEmail = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrRecipientAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrRecipientCountry = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrRecipientCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurRecipientPercentage = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngJointAccountHolders = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurDeducted = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnOverridePercentages = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrRecipientIdentifier = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmRecipientDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrRecipientPhone = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientEmail = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrRecipientAddress = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrRecipientCountry = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrRecipientCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurRecipientPercentage = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngJointAccountHolders = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurDeducted = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnOverridePercentages = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIdentifier, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRecipientDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientPhone, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientEmail, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountry, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRecipientPercentage, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointAccountHolders, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeducted, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridePercentages, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIdentifier, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRecipientDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientPhone, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientEmail, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountry, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRecipientPercentage, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointAccountHolders, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeducted, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridePercentages, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64LineItemKey = null;
    } else {
    this.fi64LineItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrRecipientIdentifier = null;
    } else {
    this.fstrRecipientIdentifier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientName = null;
    } else {
    this.fstrRecipientName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRecipientDOB = null;
    } else {
    this.fdtmRecipientDOB = new Timestamp(__dataIn.readLong());
    this.fdtmRecipientDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientPhone = null;
    } else {
    this.fstrRecipientPhone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientEmail = null;
    } else {
    this.fstrRecipientEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress = null;
    } else {
    this.fstrRecipientAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientCountry = null;
    } else {
    this.fstrRecipientCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientCountryCode = null;
    } else {
    this.fstrRecipientCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRecipientPercentage = null;
    } else {
    this.fcurRecipientPercentage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnJointAccountIndicator = null;
    } else {
    this.fblnJointAccountIndicator = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJointAccountHolders = null;
    } else {
    this.flngJointAccountHolders = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossAmount = null;
    } else {
    this.fcurGrossAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeducted = null;
    } else {
    this.fcurDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverridePercentages = null;
    } else {
    this.fblnOverridePercentages = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fstrRecipientIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIdentifier);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fdtmRecipientDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRecipientDOB.getTime());
    __dataOut.writeInt(this.fdtmRecipientDOB.getNanos());
    }
    if (null == this.fstrRecipientPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientPhone);
    }
    if (null == this.fstrRecipientEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientEmail);
    }
    if (null == this.fstrRecipientAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress);
    }
    if (null == this.fstrRecipientCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountry);
    }
    if (null == this.fstrRecipientCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountryCode);
    }
    if (null == this.fcurRecipientPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRecipientPercentage, __dataOut);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
    }
    if (null == this.flngJointAccountHolders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointAccountHolders);
    }
    if (null == this.fcurGrossAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossAmount, __dataOut);
    }
    if (null == this.fcurDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeducted, __dataOut);
    }
    if (null == this.fblnOverridePercentages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridePercentages);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fstrRecipientIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIdentifier);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fdtmRecipientDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRecipientDOB.getTime());
    __dataOut.writeInt(this.fdtmRecipientDOB.getNanos());
    }
    if (null == this.fstrRecipientPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientPhone);
    }
    if (null == this.fstrRecipientEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientEmail);
    }
    if (null == this.fstrRecipientAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress);
    }
    if (null == this.fstrRecipientCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountry);
    }
    if (null == this.fstrRecipientCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountryCode);
    }
    if (null == this.fcurRecipientPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRecipientPercentage, __dataOut);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
    }
    if (null == this.flngJointAccountHolders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointAccountHolders);
    }
    if (null == this.fcurGrossAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossAmount, __dataOut);
    }
    if (null == this.fcurDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeducted, __dataOut);
    }
    if (null == this.fblnOverridePercentages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridePercentages);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIdentifier==null?"\\N":fstrRecipientIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRecipientDOB==null?"\\N":"" + fdtmRecipientDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientPhone==null?"\\N":fstrRecipientPhone, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientEmail==null?"\\N":fstrRecipientEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress==null?"\\N":fstrRecipientAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountry==null?"\\N":fstrRecipientCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountryCode==null?"\\N":fstrRecipientCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRecipientPercentage==null?"\\N":fcurRecipientPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointAccountHolders==null?"\\N":"" + flngJointAccountHolders, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeducted==null?"\\N":fcurDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridePercentages==null?"\\N":"" + fblnOverridePercentages, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIdentifier==null?"\\N":fstrRecipientIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRecipientDOB==null?"\\N":"" + fdtmRecipientDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientPhone==null?"\\N":fstrRecipientPhone, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientEmail==null?"\\N":fstrRecipientEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress==null?"\\N":fstrRecipientAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountry==null?"\\N":fstrRecipientCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountryCode==null?"\\N":fstrRecipientCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRecipientPercentage==null?"\\N":fcurRecipientPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointAccountHolders==null?"\\N":"" + flngJointAccountHolders, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeducted==null?"\\N":fcurDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridePercentages==null?"\\N":"" + fblnOverridePercentages, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientIdentifier = null; } else {
      this.fstrRecipientIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRecipientDOB = null; } else {
      this.fdtmRecipientDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientPhone = null; } else {
      this.fstrRecipientPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientEmail = null; } else {
      this.fstrRecipientEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress = null; } else {
      this.fstrRecipientAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountry = null; } else {
      this.fstrRecipientCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountryCode = null; } else {
      this.fstrRecipientCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRecipientPercentage = null; } else {
      this.fcurRecipientPercentage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointAccountHolders = null; } else {
      this.flngJointAccountHolders = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossAmount = null; } else {
      this.fcurGrossAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeducted = null; } else {
      this.fcurDeducted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientIdentifier = null; } else {
      this.fstrRecipientIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRecipientDOB = null; } else {
      this.fdtmRecipientDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientPhone = null; } else {
      this.fstrRecipientPhone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientEmail = null; } else {
      this.fstrRecipientEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress = null; } else {
      this.fstrRecipientAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountry = null; } else {
      this.fstrRecipientCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountryCode = null; } else {
      this.fstrRecipientCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRecipientPercentage = null; } else {
      this.fcurRecipientPercentage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointAccountHolders = null; } else {
      this.flngJointAccountHolders = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossAmount = null; } else {
      this.fcurGrossAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeducted = null; } else {
      this.fcurDeducted = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnrwtelineitem o = (tblnz_rtnrwtelineitem) super.clone();
    o.fdtmRecipientDOB = (o.fdtmRecipientDOB != null) ? (java.sql.Timestamp) o.fdtmRecipientDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrwtelineitem o) throws CloneNotSupportedException {
    o.fdtmRecipientDOB = (o.fdtmRecipientDOB != null) ? (java.sql.Timestamp) o.fdtmRecipientDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrRecipientIdentifier", this.fstrRecipientIdentifier);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fdtmRecipientDOB", this.fdtmRecipientDOB);
    __sqoop$field_map.put("fstrRecipientPhone", this.fstrRecipientPhone);
    __sqoop$field_map.put("fstrRecipientEmail", this.fstrRecipientEmail);
    __sqoop$field_map.put("fstrRecipientAddress", this.fstrRecipientAddress);
    __sqoop$field_map.put("fstrRecipientCountry", this.fstrRecipientCountry);
    __sqoop$field_map.put("fstrRecipientCountryCode", this.fstrRecipientCountryCode);
    __sqoop$field_map.put("fcurRecipientPercentage", this.fcurRecipientPercentage);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
    __sqoop$field_map.put("flngJointAccountHolders", this.flngJointAccountHolders);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurDeducted", this.fcurDeducted);
    __sqoop$field_map.put("fblnOverridePercentages", this.fblnOverridePercentages);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrRecipientIdentifier", this.fstrRecipientIdentifier);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fdtmRecipientDOB", this.fdtmRecipientDOB);
    __sqoop$field_map.put("fstrRecipientPhone", this.fstrRecipientPhone);
    __sqoop$field_map.put("fstrRecipientEmail", this.fstrRecipientEmail);
    __sqoop$field_map.put("fstrRecipientAddress", this.fstrRecipientAddress);
    __sqoop$field_map.put("fstrRecipientCountry", this.fstrRecipientCountry);
    __sqoop$field_map.put("fstrRecipientCountryCode", this.fstrRecipientCountryCode);
    __sqoop$field_map.put("fcurRecipientPercentage", this.fcurRecipientPercentage);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
    __sqoop$field_map.put("flngJointAccountHolders", this.flngJointAccountHolders);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurDeducted", this.fcurDeducted);
    __sqoop$field_map.put("fblnOverridePercentages", this.fblnOverridePercentages);
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
