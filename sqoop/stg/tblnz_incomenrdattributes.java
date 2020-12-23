// ORM class for table 'tblnz_incomenrdattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:25:00 NZDT 2020
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

public class tblnz_incomenrdattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrIncomeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fstrIncomeType = (String)value;
      }
    });
    setters.put("fcurGrossAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurGrossAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurNRWTDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNRWTRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurNRWTRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditRatio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurCreditRatio = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnAUDividend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fblnAUDividend = (Integer)value;
      }
    });
    setters.put("fcurAUExchangeRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurAUExchangeRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurJointAccountPercentage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fcurJointAccountPercentage = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnJointAccountIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fblnJointAccountIndicator = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomenrdattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomenrdattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomenrdattributes with_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_incomenrdattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomenrdattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrIncomeType;
  public String get_fstrIncomeType() {
    return fstrIncomeType;
  }
  public void set_fstrIncomeType(String fstrIncomeType) {
    this.fstrIncomeType = fstrIncomeType;
  }
  public tblnz_incomenrdattributes with_fstrIncomeType(String fstrIncomeType) {
    this.fstrIncomeType = fstrIncomeType;
    return this;
  }
  private java.math.BigDecimal fcurGrossAmount;
  public java.math.BigDecimal get_fcurGrossAmount() {
    return fcurGrossAmount;
  }
  public void set_fcurGrossAmount(java.math.BigDecimal fcurGrossAmount) {
    this.fcurGrossAmount = fcurGrossAmount;
  }
  public tblnz_incomenrdattributes with_fcurGrossAmount(java.math.BigDecimal fcurGrossAmount) {
    this.fcurGrossAmount = fcurGrossAmount;
    return this;
  }
  private java.math.BigDecimal fcurNRWTDeducted;
  public java.math.BigDecimal get_fcurNRWTDeducted() {
    return fcurNRWTDeducted;
  }
  public void set_fcurNRWTDeducted(java.math.BigDecimal fcurNRWTDeducted) {
    this.fcurNRWTDeducted = fcurNRWTDeducted;
  }
  public tblnz_incomenrdattributes with_fcurNRWTDeducted(java.math.BigDecimal fcurNRWTDeducted) {
    this.fcurNRWTDeducted = fcurNRWTDeducted;
    return this;
  }
  private java.math.BigDecimal fcurNRWTRate;
  public java.math.BigDecimal get_fcurNRWTRate() {
    return fcurNRWTRate;
  }
  public void set_fcurNRWTRate(java.math.BigDecimal fcurNRWTRate) {
    this.fcurNRWTRate = fcurNRWTRate;
  }
  public tblnz_incomenrdattributes with_fcurNRWTRate(java.math.BigDecimal fcurNRWTRate) {
    this.fcurNRWTRate = fcurNRWTRate;
    return this;
  }
  private java.math.BigDecimal fcurImputationCredits;
  public java.math.BigDecimal get_fcurImputationCredits() {
    return fcurImputationCredits;
  }
  public void set_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
  }
  public tblnz_incomenrdattributes with_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurCreditRatio;
  public java.math.BigDecimal get_fcurCreditRatio() {
    return fcurCreditRatio;
  }
  public void set_fcurCreditRatio(java.math.BigDecimal fcurCreditRatio) {
    this.fcurCreditRatio = fcurCreditRatio;
  }
  public tblnz_incomenrdattributes with_fcurCreditRatio(java.math.BigDecimal fcurCreditRatio) {
    this.fcurCreditRatio = fcurCreditRatio;
    return this;
  }
  private Integer fblnAUDividend;
  public Integer get_fblnAUDividend() {
    return fblnAUDividend;
  }
  public void set_fblnAUDividend(Integer fblnAUDividend) {
    this.fblnAUDividend = fblnAUDividend;
  }
  public tblnz_incomenrdattributes with_fblnAUDividend(Integer fblnAUDividend) {
    this.fblnAUDividend = fblnAUDividend;
    return this;
  }
  private java.math.BigDecimal fcurAUExchangeRate;
  public java.math.BigDecimal get_fcurAUExchangeRate() {
    return fcurAUExchangeRate;
  }
  public void set_fcurAUExchangeRate(java.math.BigDecimal fcurAUExchangeRate) {
    this.fcurAUExchangeRate = fcurAUExchangeRate;
  }
  public tblnz_incomenrdattributes with_fcurAUExchangeRate(java.math.BigDecimal fcurAUExchangeRate) {
    this.fcurAUExchangeRate = fcurAUExchangeRate;
    return this;
  }
  private java.math.BigDecimal fcurJointAccountPercentage;
  public java.math.BigDecimal get_fcurJointAccountPercentage() {
    return fcurJointAccountPercentage;
  }
  public void set_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
    this.fcurJointAccountPercentage = fcurJointAccountPercentage;
  }
  public tblnz_incomenrdattributes with_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
    this.fcurJointAccountPercentage = fcurJointAccountPercentage;
    return this;
  }
  private Integer fblnJointAccountIndicator;
  public Integer get_fblnJointAccountIndicator() {
    return fblnJointAccountIndicator;
  }
  public void set_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
  }
  public tblnz_incomenrdattributes with_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_incomenrdattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomenrdattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomenrdattributes)) {
      return false;
    }
    tblnz_incomenrdattributes that = (tblnz_incomenrdattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrIncomeType == null ? that.fstrIncomeType == null : this.fstrIncomeType.equals(that.fstrIncomeType));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurNRWTDeducted == null ? that.fcurNRWTDeducted == null : this.fcurNRWTDeducted.equals(that.fcurNRWTDeducted));
    equal = equal && (this.fcurNRWTRate == null ? that.fcurNRWTRate == null : this.fcurNRWTRate.equals(that.fcurNRWTRate));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurCreditRatio == null ? that.fcurCreditRatio == null : this.fcurCreditRatio.equals(that.fcurCreditRatio));
    equal = equal && (this.fblnAUDividend == null ? that.fblnAUDividend == null : this.fblnAUDividend.equals(that.fblnAUDividend));
    equal = equal && (this.fcurAUExchangeRate == null ? that.fcurAUExchangeRate == null : this.fcurAUExchangeRate.equals(that.fcurAUExchangeRate));
    equal = equal && (this.fcurJointAccountPercentage == null ? that.fcurJointAccountPercentage == null : this.fcurJointAccountPercentage.equals(that.fcurJointAccountPercentage));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomenrdattributes)) {
      return false;
    }
    tblnz_incomenrdattributes that = (tblnz_incomenrdattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrIncomeType == null ? that.fstrIncomeType == null : this.fstrIncomeType.equals(that.fstrIncomeType));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurNRWTDeducted == null ? that.fcurNRWTDeducted == null : this.fcurNRWTDeducted.equals(that.fcurNRWTDeducted));
    equal = equal && (this.fcurNRWTRate == null ? that.fcurNRWTRate == null : this.fcurNRWTRate.equals(that.fcurNRWTRate));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurCreditRatio == null ? that.fcurCreditRatio == null : this.fcurCreditRatio.equals(that.fcurCreditRatio));
    equal = equal && (this.fblnAUDividend == null ? that.fblnAUDividend == null : this.fblnAUDividend.equals(that.fblnAUDividend));
    equal = equal && (this.fcurAUExchangeRate == null ? that.fcurAUExchangeRate == null : this.fcurAUExchangeRate.equals(that.fcurAUExchangeRate));
    equal = equal && (this.fcurJointAccountPercentage == null ? that.fcurJointAccountPercentage == null : this.fcurJointAccountPercentage.equals(that.fcurJointAccountPercentage));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrIncomeType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNRWTDeducted = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTRate = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurCreditRatio = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnAUDividend = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurAUExchangeRate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrIncomeType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNRWTDeducted = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurNRWTRate = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurCreditRatio = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnAUDividend = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurAUExchangeRate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncomeType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDeducted, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRate, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditRatio, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAUDividend, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAUExchangeRate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncomeType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTDeducted, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNRWTRate, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditRatio, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAUDividend, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAUExchangeRate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64IncomeKey = null;
    } else {
    this.fi64IncomeKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrIncomeType = null;
    } else {
    this.fstrIncomeType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossAmount = null;
    } else {
    this.fcurGrossAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTDeducted = null;
    } else {
    this.fcurNRWTDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNRWTRate = null;
    } else {
    this.fcurNRWTRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationCredits = null;
    } else {
    this.fcurImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditRatio = null;
    } else {
    this.fcurCreditRatio = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAUDividend = null;
    } else {
    this.fblnAUDividend = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAUExchangeRate = null;
    } else {
    this.fcurAUExchangeRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurJointAccountPercentage = null;
    } else {
    this.fcurJointAccountPercentage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnJointAccountIndicator = null;
    } else {
    this.fblnJointAccountIndicator = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fstrIncomeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncomeType);
    }
    if (null == this.fcurGrossAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossAmount, __dataOut);
    }
    if (null == this.fcurNRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDeducted, __dataOut);
    }
    if (null == this.fcurNRWTRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRate, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurCreditRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditRatio, __dataOut);
    }
    if (null == this.fblnAUDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAUDividend);
    }
    if (null == this.fcurAUExchangeRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAUExchangeRate, __dataOut);
    }
    if (null == this.fcurJointAccountPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurJointAccountPercentage, __dataOut);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fstrIncomeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIncomeType);
    }
    if (null == this.fcurGrossAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossAmount, __dataOut);
    }
    if (null == this.fcurNRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTDeducted, __dataOut);
    }
    if (null == this.fcurNRWTRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNRWTRate, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurCreditRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditRatio, __dataOut);
    }
    if (null == this.fblnAUDividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAUDividend);
    }
    if (null == this.fcurAUExchangeRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAUExchangeRate, __dataOut);
    }
    if (null == this.fcurJointAccountPercentage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurJointAccountPercentage, __dataOut);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncomeType==null?"\\N":fstrIncomeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDeducted==null?"\\N":fcurNRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRate==null?"\\N":fcurNRWTRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditRatio==null?"\\N":fcurCreditRatio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAUDividend==null?"\\N":"" + fblnAUDividend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAUExchangeRate==null?"\\N":fcurAUExchangeRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurJointAccountPercentage==null?"\\N":fcurJointAccountPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncomeType==null?"\\N":fstrIncomeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTDeducted==null?"\\N":fcurNRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNRWTRate==null?"\\N":fcurNRWTRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditRatio==null?"\\N":fcurCreditRatio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAUDividend==null?"\\N":"" + fblnAUDividend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAUExchangeRate==null?"\\N":fcurAUExchangeRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurJointAccountPercentage==null?"\\N":fcurJointAccountPercentage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIncomeType = null; } else {
      this.fstrIncomeType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDeducted = null; } else {
      this.fcurNRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRate = null; } else {
      this.fcurNRWTRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditRatio = null; } else {
      this.fcurCreditRatio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAUDividend = null; } else {
      this.fblnAUDividend = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAUExchangeRate = null; } else {
      this.fcurAUExchangeRate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIncomeType = null; } else {
      this.fstrIncomeType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTDeducted = null; } else {
      this.fcurNRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNRWTRate = null; } else {
      this.fcurNRWTRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditRatio = null; } else {
      this.fcurCreditRatio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAUDividend = null; } else {
      this.fblnAUDividend = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAUExchangeRate = null; } else {
      this.fcurAUExchangeRate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
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
    tblnz_incomenrdattributes o = (tblnz_incomenrdattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomenrdattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrIncomeType", this.fstrIncomeType);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurNRWTDeducted", this.fcurNRWTDeducted);
    __sqoop$field_map.put("fcurNRWTRate", this.fcurNRWTRate);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurCreditRatio", this.fcurCreditRatio);
    __sqoop$field_map.put("fblnAUDividend", this.fblnAUDividend);
    __sqoop$field_map.put("fcurAUExchangeRate", this.fcurAUExchangeRate);
    __sqoop$field_map.put("fcurJointAccountPercentage", this.fcurJointAccountPercentage);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrIncomeType", this.fstrIncomeType);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurNRWTDeducted", this.fcurNRWTDeducted);
    __sqoop$field_map.put("fcurNRWTRate", this.fcurNRWTRate);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurCreditRatio", this.fcurCreditRatio);
    __sqoop$field_map.put("fblnAUDividend", this.fblnAUDividend);
    __sqoop$field_map.put("fcurAUExchangeRate", this.fcurAUExchangeRate);
    __sqoop$field_map.put("fcurJointAccountPercentage", this.fcurJointAccountPercentage);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
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
