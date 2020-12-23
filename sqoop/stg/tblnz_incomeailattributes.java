// ORM class for table 'tblnz_incomeailattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:46:55 NZDT 2020
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

public class tblnz_incomeailattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fcurAILRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fcurAILRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrIncomeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fstrIncomeType = (String)value;
      }
    });
    setters.put("fcurGrossAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fcurGrossAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestZeroRated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fcurInterestZeroRated = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAILDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fcurAILDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurJointAccountPercentage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fcurJointAccountPercentage = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnJointAccountIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fblnJointAccountIndicator = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeailattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomeailattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomeailattributes with_fi64IncomeKey(Long fi64IncomeKey) {
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
  public tblnz_incomeailattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomeailattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.math.BigDecimal fcurAILRate;
  public java.math.BigDecimal get_fcurAILRate() {
    return fcurAILRate;
  }
  public void set_fcurAILRate(java.math.BigDecimal fcurAILRate) {
    this.fcurAILRate = fcurAILRate;
  }
  public tblnz_incomeailattributes with_fcurAILRate(java.math.BigDecimal fcurAILRate) {
    this.fcurAILRate = fcurAILRate;
    return this;
  }
  private String fstrIncomeType;
  public String get_fstrIncomeType() {
    return fstrIncomeType;
  }
  public void set_fstrIncomeType(String fstrIncomeType) {
    this.fstrIncomeType = fstrIncomeType;
  }
  public tblnz_incomeailattributes with_fstrIncomeType(String fstrIncomeType) {
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
  public tblnz_incomeailattributes with_fcurGrossAmount(java.math.BigDecimal fcurGrossAmount) {
    this.fcurGrossAmount = fcurGrossAmount;
    return this;
  }
  private java.math.BigDecimal fcurInterestZeroRated;
  public java.math.BigDecimal get_fcurInterestZeroRated() {
    return fcurInterestZeroRated;
  }
  public void set_fcurInterestZeroRated(java.math.BigDecimal fcurInterestZeroRated) {
    this.fcurInterestZeroRated = fcurInterestZeroRated;
  }
  public tblnz_incomeailattributes with_fcurInterestZeroRated(java.math.BigDecimal fcurInterestZeroRated) {
    this.fcurInterestZeroRated = fcurInterestZeroRated;
    return this;
  }
  private java.math.BigDecimal fcurAILDeducted;
  public java.math.BigDecimal get_fcurAILDeducted() {
    return fcurAILDeducted;
  }
  public void set_fcurAILDeducted(java.math.BigDecimal fcurAILDeducted) {
    this.fcurAILDeducted = fcurAILDeducted;
  }
  public tblnz_incomeailattributes with_fcurAILDeducted(java.math.BigDecimal fcurAILDeducted) {
    this.fcurAILDeducted = fcurAILDeducted;
    return this;
  }
  private java.math.BigDecimal fcurJointAccountPercentage;
  public java.math.BigDecimal get_fcurJointAccountPercentage() {
    return fcurJointAccountPercentage;
  }
  public void set_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
    this.fcurJointAccountPercentage = fcurJointAccountPercentage;
  }
  public tblnz_incomeailattributes with_fcurJointAccountPercentage(java.math.BigDecimal fcurJointAccountPercentage) {
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
  public tblnz_incomeailattributes with_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
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
  public tblnz_incomeailattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomeailattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomeailattributes)) {
      return false;
    }
    tblnz_incomeailattributes that = (tblnz_incomeailattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAILRate == null ? that.fcurAILRate == null : this.fcurAILRate.equals(that.fcurAILRate));
    equal = equal && (this.fstrIncomeType == null ? that.fstrIncomeType == null : this.fstrIncomeType.equals(that.fstrIncomeType));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurInterestZeroRated == null ? that.fcurInterestZeroRated == null : this.fcurInterestZeroRated.equals(that.fcurInterestZeroRated));
    equal = equal && (this.fcurAILDeducted == null ? that.fcurAILDeducted == null : this.fcurAILDeducted.equals(that.fcurAILDeducted));
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
    if (!(o instanceof tblnz_incomeailattributes)) {
      return false;
    }
    tblnz_incomeailattributes that = (tblnz_incomeailattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAILRate == null ? that.fcurAILRate == null : this.fcurAILRate.equals(that.fcurAILRate));
    equal = equal && (this.fstrIncomeType == null ? that.fstrIncomeType == null : this.fstrIncomeType.equals(that.fstrIncomeType));
    equal = equal && (this.fcurGrossAmount == null ? that.fcurGrossAmount == null : this.fcurGrossAmount.equals(that.fcurGrossAmount));
    equal = equal && (this.fcurInterestZeroRated == null ? that.fcurInterestZeroRated == null : this.fcurInterestZeroRated.equals(that.fcurInterestZeroRated));
    equal = equal && (this.fcurAILDeducted == null ? that.fcurAILDeducted == null : this.fcurAILDeducted.equals(that.fcurAILDeducted));
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
    this.fcurAILRate = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fstrIncomeType = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurInterestZeroRated = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAILDeducted = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurAILRate = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fstrIncomeType = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurGrossAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurInterestZeroRated = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAILDeducted = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurJointAccountPercentage = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurAILRate, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncomeType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestZeroRated, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAILDeducted, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAILRate, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrIncomeType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestZeroRated, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAILDeducted, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurJointAccountPercentage, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
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
        this.fcurAILRate = null;
    } else {
    this.fcurAILRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurInterestZeroRated = null;
    } else {
    this.fcurInterestZeroRated = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAILDeducted = null;
    } else {
    this.fcurAILDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurAILRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAILRate, __dataOut);
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
    if (null == this.fcurInterestZeroRated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestZeroRated, __dataOut);
    }
    if (null == this.fcurAILDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAILDeducted, __dataOut);
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
    if (null == this.fcurAILRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAILRate, __dataOut);
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
    if (null == this.fcurInterestZeroRated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestZeroRated, __dataOut);
    }
    if (null == this.fcurAILDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAILDeducted, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAILRate==null?"\\N":fcurAILRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncomeType==null?"\\N":fstrIncomeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestZeroRated==null?"\\N":fcurInterestZeroRated.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAILDeducted==null?"\\N":fcurAILDeducted.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAILRate==null?"\\N":fcurAILRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIncomeType==null?"\\N":fstrIncomeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossAmount==null?"\\N":fcurGrossAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestZeroRated==null?"\\N":fcurInterestZeroRated.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAILDeducted==null?"\\N":fcurAILDeducted.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAILRate = null; } else {
      this.fcurAILRate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestZeroRated = null; } else {
      this.fcurInterestZeroRated = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAILDeducted = null; } else {
      this.fcurAILDeducted = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAILRate = null; } else {
      this.fcurAILRate = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestZeroRated = null; } else {
      this.fcurInterestZeroRated = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAILDeducted = null; } else {
      this.fcurAILDeducted = new java.math.BigDecimal(__cur_str);
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
    tblnz_incomeailattributes o = (tblnz_incomeailattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomeailattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurAILRate", this.fcurAILRate);
    __sqoop$field_map.put("fstrIncomeType", this.fstrIncomeType);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurInterestZeroRated", this.fcurInterestZeroRated);
    __sqoop$field_map.put("fcurAILDeducted", this.fcurAILDeducted);
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
    __sqoop$field_map.put("fcurAILRate", this.fcurAILRate);
    __sqoop$field_map.put("fstrIncomeType", this.fstrIncomeType);
    __sqoop$field_map.put("fcurGrossAmount", this.fcurGrossAmount);
    __sqoop$field_map.put("fcurInterestZeroRated", this.fcurInterestZeroRated);
    __sqoop$field_map.put("fcurAILDeducted", this.fcurAILDeducted);
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
