// ORM class for table 'tblnz_casadjustattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:23:17 NZDT 2020
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

public class tblnz_casadjustattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrAdjustType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fstrAdjustType = (String)value;
      }
    });
    setters.put("fcurSTARTAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurSTARTAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFIRSTAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurFIRSTAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurTotalAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSTARTTotalArrears", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurSTARTTotalArrears = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFIRSTTotalArrears", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurFIRSTTotalArrears = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalArrears", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fcurTotalArrears = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrRecommendation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fstrRecommendation = (String)value;
      }
    });
    setters.put("fblnLossOrImptCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fblnLossOrImptCredits = (Integer)value;
      }
    });
    setters.put("fblnIRInitiated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fblnIRInitiated = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casadjustattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_casadjustattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_casadjustattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrAdjustType;
  public String get_fstrAdjustType() {
    return fstrAdjustType;
  }
  public void set_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
  }
  public tblnz_casadjustattributes with_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
    return this;
  }
  private java.math.BigDecimal fcurSTARTAmount;
  public java.math.BigDecimal get_fcurSTARTAmount() {
    return fcurSTARTAmount;
  }
  public void set_fcurSTARTAmount(java.math.BigDecimal fcurSTARTAmount) {
    this.fcurSTARTAmount = fcurSTARTAmount;
  }
  public tblnz_casadjustattributes with_fcurSTARTAmount(java.math.BigDecimal fcurSTARTAmount) {
    this.fcurSTARTAmount = fcurSTARTAmount;
    return this;
  }
  private java.math.BigDecimal fcurFIRSTAmount;
  public java.math.BigDecimal get_fcurFIRSTAmount() {
    return fcurFIRSTAmount;
  }
  public void set_fcurFIRSTAmount(java.math.BigDecimal fcurFIRSTAmount) {
    this.fcurFIRSTAmount = fcurFIRSTAmount;
  }
  public tblnz_casadjustattributes with_fcurFIRSTAmount(java.math.BigDecimal fcurFIRSTAmount) {
    this.fcurFIRSTAmount = fcurFIRSTAmount;
    return this;
  }
  private java.math.BigDecimal fcurTotalAmount;
  public java.math.BigDecimal get_fcurTotalAmount() {
    return fcurTotalAmount;
  }
  public void set_fcurTotalAmount(java.math.BigDecimal fcurTotalAmount) {
    this.fcurTotalAmount = fcurTotalAmount;
  }
  public tblnz_casadjustattributes with_fcurTotalAmount(java.math.BigDecimal fcurTotalAmount) {
    this.fcurTotalAmount = fcurTotalAmount;
    return this;
  }
  private java.math.BigDecimal fcurSTARTTotalArrears;
  public java.math.BigDecimal get_fcurSTARTTotalArrears() {
    return fcurSTARTTotalArrears;
  }
  public void set_fcurSTARTTotalArrears(java.math.BigDecimal fcurSTARTTotalArrears) {
    this.fcurSTARTTotalArrears = fcurSTARTTotalArrears;
  }
  public tblnz_casadjustattributes with_fcurSTARTTotalArrears(java.math.BigDecimal fcurSTARTTotalArrears) {
    this.fcurSTARTTotalArrears = fcurSTARTTotalArrears;
    return this;
  }
  private java.math.BigDecimal fcurFIRSTTotalArrears;
  public java.math.BigDecimal get_fcurFIRSTTotalArrears() {
    return fcurFIRSTTotalArrears;
  }
  public void set_fcurFIRSTTotalArrears(java.math.BigDecimal fcurFIRSTTotalArrears) {
    this.fcurFIRSTTotalArrears = fcurFIRSTTotalArrears;
  }
  public tblnz_casadjustattributes with_fcurFIRSTTotalArrears(java.math.BigDecimal fcurFIRSTTotalArrears) {
    this.fcurFIRSTTotalArrears = fcurFIRSTTotalArrears;
    return this;
  }
  private java.math.BigDecimal fcurTotalArrears;
  public java.math.BigDecimal get_fcurTotalArrears() {
    return fcurTotalArrears;
  }
  public void set_fcurTotalArrears(java.math.BigDecimal fcurTotalArrears) {
    this.fcurTotalArrears = fcurTotalArrears;
  }
  public tblnz_casadjustattributes with_fcurTotalArrears(java.math.BigDecimal fcurTotalArrears) {
    this.fcurTotalArrears = fcurTotalArrears;
    return this;
  }
  private String fstrRecommendation;
  public String get_fstrRecommendation() {
    return fstrRecommendation;
  }
  public void set_fstrRecommendation(String fstrRecommendation) {
    this.fstrRecommendation = fstrRecommendation;
  }
  public tblnz_casadjustattributes with_fstrRecommendation(String fstrRecommendation) {
    this.fstrRecommendation = fstrRecommendation;
    return this;
  }
  private Integer fblnLossOrImptCredits;
  public Integer get_fblnLossOrImptCredits() {
    return fblnLossOrImptCredits;
  }
  public void set_fblnLossOrImptCredits(Integer fblnLossOrImptCredits) {
    this.fblnLossOrImptCredits = fblnLossOrImptCredits;
  }
  public tblnz_casadjustattributes with_fblnLossOrImptCredits(Integer fblnLossOrImptCredits) {
    this.fblnLossOrImptCredits = fblnLossOrImptCredits;
    return this;
  }
  private Integer fblnIRInitiated;
  public Integer get_fblnIRInitiated() {
    return fblnIRInitiated;
  }
  public void set_fblnIRInitiated(Integer fblnIRInitiated) {
    this.fblnIRInitiated = fblnIRInitiated;
  }
  public tblnz_casadjustattributes with_fblnIRInitiated(Integer fblnIRInitiated) {
    this.fblnIRInitiated = fblnIRInitiated;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_casadjustattributes with_fstrWho(String fstrWho) {
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
  public tblnz_casadjustattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casadjustattributes)) {
      return false;
    }
    tblnz_casadjustattributes that = (tblnz_casadjustattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fcurSTARTAmount == null ? that.fcurSTARTAmount == null : this.fcurSTARTAmount.equals(that.fcurSTARTAmount));
    equal = equal && (this.fcurFIRSTAmount == null ? that.fcurFIRSTAmount == null : this.fcurFIRSTAmount.equals(that.fcurFIRSTAmount));
    equal = equal && (this.fcurTotalAmount == null ? that.fcurTotalAmount == null : this.fcurTotalAmount.equals(that.fcurTotalAmount));
    equal = equal && (this.fcurSTARTTotalArrears == null ? that.fcurSTARTTotalArrears == null : this.fcurSTARTTotalArrears.equals(that.fcurSTARTTotalArrears));
    equal = equal && (this.fcurFIRSTTotalArrears == null ? that.fcurFIRSTTotalArrears == null : this.fcurFIRSTTotalArrears.equals(that.fcurFIRSTTotalArrears));
    equal = equal && (this.fcurTotalArrears == null ? that.fcurTotalArrears == null : this.fcurTotalArrears.equals(that.fcurTotalArrears));
    equal = equal && (this.fstrRecommendation == null ? that.fstrRecommendation == null : this.fstrRecommendation.equals(that.fstrRecommendation));
    equal = equal && (this.fblnLossOrImptCredits == null ? that.fblnLossOrImptCredits == null : this.fblnLossOrImptCredits.equals(that.fblnLossOrImptCredits));
    equal = equal && (this.fblnIRInitiated == null ? that.fblnIRInitiated == null : this.fblnIRInitiated.equals(that.fblnIRInitiated));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casadjustattributes)) {
      return false;
    }
    tblnz_casadjustattributes that = (tblnz_casadjustattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fcurSTARTAmount == null ? that.fcurSTARTAmount == null : this.fcurSTARTAmount.equals(that.fcurSTARTAmount));
    equal = equal && (this.fcurFIRSTAmount == null ? that.fcurFIRSTAmount == null : this.fcurFIRSTAmount.equals(that.fcurFIRSTAmount));
    equal = equal && (this.fcurTotalAmount == null ? that.fcurTotalAmount == null : this.fcurTotalAmount.equals(that.fcurTotalAmount));
    equal = equal && (this.fcurSTARTTotalArrears == null ? that.fcurSTARTTotalArrears == null : this.fcurSTARTTotalArrears.equals(that.fcurSTARTTotalArrears));
    equal = equal && (this.fcurFIRSTTotalArrears == null ? that.fcurFIRSTTotalArrears == null : this.fcurFIRSTTotalArrears.equals(that.fcurFIRSTTotalArrears));
    equal = equal && (this.fcurTotalArrears == null ? that.fcurTotalArrears == null : this.fcurTotalArrears.equals(that.fcurTotalArrears));
    equal = equal && (this.fstrRecommendation == null ? that.fstrRecommendation == null : this.fstrRecommendation.equals(that.fstrRecommendation));
    equal = equal && (this.fblnLossOrImptCredits == null ? that.fblnLossOrImptCredits == null : this.fblnLossOrImptCredits.equals(that.fblnLossOrImptCredits));
    equal = equal && (this.fblnIRInitiated == null ? that.fblnIRInitiated == null : this.fblnIRInitiated.equals(that.fblnIRInitiated));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(2, __dbResults);
    this.fcurSTARTAmount = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurFIRSTAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurSTARTTotalArrears = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFIRSTTotalArrears = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalArrears = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrRecommendation = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnLossOrImptCredits = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnIRInitiated = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(2, __dbResults);
    this.fcurSTARTAmount = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurFIRSTAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurSTARTTotalArrears = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFIRSTTotalArrears = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurTotalArrears = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrRecommendation = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnLossOrImptCredits = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnIRInitiated = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSTARTAmount, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFIRSTAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSTARTTotalArrears, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFIRSTTotalArrears, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalArrears, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecommendation, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLossOrImptCredits, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIRInitiated, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSTARTAmount, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFIRSTAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSTARTTotalArrears, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFIRSTTotalArrears, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalArrears, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecommendation, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLossOrImptCredits, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIRInitiated, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdjustType = null;
    } else {
    this.fstrAdjustType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSTARTAmount = null;
    } else {
    this.fcurSTARTAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFIRSTAmount = null;
    } else {
    this.fcurFIRSTAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAmount = null;
    } else {
    this.fcurTotalAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSTARTTotalArrears = null;
    } else {
    this.fcurSTARTTotalArrears = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFIRSTTotalArrears = null;
    } else {
    this.fcurFIRSTTotalArrears = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalArrears = null;
    } else {
    this.fcurTotalArrears = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecommendation = null;
    } else {
    this.fstrRecommendation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLossOrImptCredits = null;
    } else {
    this.fblnLossOrImptCredits = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIRInitiated = null;
    } else {
    this.fblnIRInitiated = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fcurSTARTAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSTARTAmount, __dataOut);
    }
    if (null == this.fcurFIRSTAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFIRSTAmount, __dataOut);
    }
    if (null == this.fcurTotalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmount, __dataOut);
    }
    if (null == this.fcurSTARTTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSTARTTotalArrears, __dataOut);
    }
    if (null == this.fcurFIRSTTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFIRSTTotalArrears, __dataOut);
    }
    if (null == this.fcurTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalArrears, __dataOut);
    }
    if (null == this.fstrRecommendation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecommendation);
    }
    if (null == this.fblnLossOrImptCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLossOrImptCredits);
    }
    if (null == this.fblnIRInitiated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIRInitiated);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fcurSTARTAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSTARTAmount, __dataOut);
    }
    if (null == this.fcurFIRSTAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFIRSTAmount, __dataOut);
    }
    if (null == this.fcurTotalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmount, __dataOut);
    }
    if (null == this.fcurSTARTTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSTARTTotalArrears, __dataOut);
    }
    if (null == this.fcurFIRSTTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFIRSTTotalArrears, __dataOut);
    }
    if (null == this.fcurTotalArrears) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalArrears, __dataOut);
    }
    if (null == this.fstrRecommendation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecommendation);
    }
    if (null == this.fblnLossOrImptCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLossOrImptCredits);
    }
    if (null == this.fblnIRInitiated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIRInitiated);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSTARTAmount==null?"\\N":fcurSTARTAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFIRSTAmount==null?"\\N":fcurFIRSTAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmount==null?"\\N":fcurTotalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSTARTTotalArrears==null?"\\N":fcurSTARTTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFIRSTTotalArrears==null?"\\N":fcurFIRSTTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalArrears==null?"\\N":fcurTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecommendation==null?"\\N":fstrRecommendation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLossOrImptCredits==null?"\\N":"" + fblnLossOrImptCredits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIRInitiated==null?"\\N":"" + fblnIRInitiated, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSTARTAmount==null?"\\N":fcurSTARTAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFIRSTAmount==null?"\\N":fcurFIRSTAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmount==null?"\\N":fcurTotalAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSTARTTotalArrears==null?"\\N":fcurSTARTTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFIRSTTotalArrears==null?"\\N":fcurFIRSTTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalArrears==null?"\\N":fcurTotalArrears.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecommendation==null?"\\N":fstrRecommendation, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLossOrImptCredits==null?"\\N":"" + fblnLossOrImptCredits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIRInitiated==null?"\\N":"" + fblnIRInitiated, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSTARTAmount = null; } else {
      this.fcurSTARTAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFIRSTAmount = null; } else {
      this.fcurFIRSTAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmount = null; } else {
      this.fcurTotalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSTARTTotalArrears = null; } else {
      this.fcurSTARTTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFIRSTTotalArrears = null; } else {
      this.fcurFIRSTTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalArrears = null; } else {
      this.fcurTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecommendation = null; } else {
      this.fstrRecommendation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLossOrImptCredits = null; } else {
      this.fblnLossOrImptCredits = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIRInitiated = null; } else {
      this.fblnIRInitiated = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSTARTAmount = null; } else {
      this.fcurSTARTAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFIRSTAmount = null; } else {
      this.fcurFIRSTAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmount = null; } else {
      this.fcurTotalAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSTARTTotalArrears = null; } else {
      this.fcurSTARTTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFIRSTTotalArrears = null; } else {
      this.fcurFIRSTTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalArrears = null; } else {
      this.fcurTotalArrears = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecommendation = null; } else {
      this.fstrRecommendation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLossOrImptCredits = null; } else {
      this.fblnLossOrImptCredits = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIRInitiated = null; } else {
      this.fblnIRInitiated = Integer.valueOf(__cur_str);
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
    tblnz_casadjustattributes o = (tblnz_casadjustattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_casadjustattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fcurSTARTAmount", this.fcurSTARTAmount);
    __sqoop$field_map.put("fcurFIRSTAmount", this.fcurFIRSTAmount);
    __sqoop$field_map.put("fcurTotalAmount", this.fcurTotalAmount);
    __sqoop$field_map.put("fcurSTARTTotalArrears", this.fcurSTARTTotalArrears);
    __sqoop$field_map.put("fcurFIRSTTotalArrears", this.fcurFIRSTTotalArrears);
    __sqoop$field_map.put("fcurTotalArrears", this.fcurTotalArrears);
    __sqoop$field_map.put("fstrRecommendation", this.fstrRecommendation);
    __sqoop$field_map.put("fblnLossOrImptCredits", this.fblnLossOrImptCredits);
    __sqoop$field_map.put("fblnIRInitiated", this.fblnIRInitiated);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fcurSTARTAmount", this.fcurSTARTAmount);
    __sqoop$field_map.put("fcurFIRSTAmount", this.fcurFIRSTAmount);
    __sqoop$field_map.put("fcurTotalAmount", this.fcurTotalAmount);
    __sqoop$field_map.put("fcurSTARTTotalArrears", this.fcurSTARTTotalArrears);
    __sqoop$field_map.put("fcurFIRSTTotalArrears", this.fcurFIRSTTotalArrears);
    __sqoop$field_map.put("fcurTotalArrears", this.fcurTotalArrears);
    __sqoop$field_map.put("fstrRecommendation", this.fstrRecommendation);
    __sqoop$field_map.put("fblnLossOrImptCredits", this.fblnLossOrImptCredits);
    __sqoop$field_map.put("fblnIRInitiated", this.fblnIRInitiated);
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
