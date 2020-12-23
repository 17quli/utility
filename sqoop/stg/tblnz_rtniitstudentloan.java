// ORM class for table 'tblnz_rtniitstudentloan'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:13:02 NZDT 2020
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

public class tblnz_rtniitstudentloan extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurSLThreshold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLThreshold = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLURT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLURT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLAdjNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLAdjNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLLiableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLLiableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLAssessment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLAssessment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLInterimAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fcurSLInterimAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fbln215Indicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fbln215Indicator = (Integer)value;
      }
    });
    setters.put("fblnManualOverride", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fblnManualOverride = (Integer)value;
      }
    });
    setters.put("fintForwardDateNotice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fintForwardDateNotice = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitstudentloan.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniitstudentloan() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniitstudentloan with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurSLThreshold;
  public java.math.BigDecimal get_fcurSLThreshold() {
    return fcurSLThreshold;
  }
  public void set_fcurSLThreshold(java.math.BigDecimal fcurSLThreshold) {
    this.fcurSLThreshold = fcurSLThreshold;
  }
  public tblnz_rtniitstudentloan with_fcurSLThreshold(java.math.BigDecimal fcurSLThreshold) {
    this.fcurSLThreshold = fcurSLThreshold;
    return this;
  }
  private java.math.BigDecimal fcurSLURT;
  public java.math.BigDecimal get_fcurSLURT() {
    return fcurSLURT;
  }
  public void set_fcurSLURT(java.math.BigDecimal fcurSLURT) {
    this.fcurSLURT = fcurSLURT;
  }
  public tblnz_rtniitstudentloan with_fcurSLURT(java.math.BigDecimal fcurSLURT) {
    this.fcurSLURT = fcurSLURT;
    return this;
  }
  private java.math.BigDecimal fcurSLAdjNetIncome;
  public java.math.BigDecimal get_fcurSLAdjNetIncome() {
    return fcurSLAdjNetIncome;
  }
  public void set_fcurSLAdjNetIncome(java.math.BigDecimal fcurSLAdjNetIncome) {
    this.fcurSLAdjNetIncome = fcurSLAdjNetIncome;
  }
  public tblnz_rtniitstudentloan with_fcurSLAdjNetIncome(java.math.BigDecimal fcurSLAdjNetIncome) {
    this.fcurSLAdjNetIncome = fcurSLAdjNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurSLLiableIncome;
  public java.math.BigDecimal get_fcurSLLiableIncome() {
    return fcurSLLiableIncome;
  }
  public void set_fcurSLLiableIncome(java.math.BigDecimal fcurSLLiableIncome) {
    this.fcurSLLiableIncome = fcurSLLiableIncome;
  }
  public tblnz_rtniitstudentloan with_fcurSLLiableIncome(java.math.BigDecimal fcurSLLiableIncome) {
    this.fcurSLLiableIncome = fcurSLLiableIncome;
    return this;
  }
  private java.math.BigDecimal fcurSLAssessment;
  public java.math.BigDecimal get_fcurSLAssessment() {
    return fcurSLAssessment;
  }
  public void set_fcurSLAssessment(java.math.BigDecimal fcurSLAssessment) {
    this.fcurSLAssessment = fcurSLAssessment;
  }
  public tblnz_rtniitstudentloan with_fcurSLAssessment(java.math.BigDecimal fcurSLAssessment) {
    this.fcurSLAssessment = fcurSLAssessment;
    return this;
  }
  private java.math.BigDecimal fcurSLInterimAmount;
  public java.math.BigDecimal get_fcurSLInterimAmount() {
    return fcurSLInterimAmount;
  }
  public void set_fcurSLInterimAmount(java.math.BigDecimal fcurSLInterimAmount) {
    this.fcurSLInterimAmount = fcurSLInterimAmount;
  }
  public tblnz_rtniitstudentloan with_fcurSLInterimAmount(java.math.BigDecimal fcurSLInterimAmount) {
    this.fcurSLInterimAmount = fcurSLInterimAmount;
    return this;
  }
  private Integer fbln215Indicator;
  public Integer get_fbln215Indicator() {
    return fbln215Indicator;
  }
  public void set_fbln215Indicator(Integer fbln215Indicator) {
    this.fbln215Indicator = fbln215Indicator;
  }
  public tblnz_rtniitstudentloan with_fbln215Indicator(Integer fbln215Indicator) {
    this.fbln215Indicator = fbln215Indicator;
    return this;
  }
  private Integer fblnManualOverride;
  public Integer get_fblnManualOverride() {
    return fblnManualOverride;
  }
  public void set_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
  }
  public tblnz_rtniitstudentloan with_fblnManualOverride(Integer fblnManualOverride) {
    this.fblnManualOverride = fblnManualOverride;
    return this;
  }
  private Integer fintForwardDateNotice;
  public Integer get_fintForwardDateNotice() {
    return fintForwardDateNotice;
  }
  public void set_fintForwardDateNotice(Integer fintForwardDateNotice) {
    this.fintForwardDateNotice = fintForwardDateNotice;
  }
  public tblnz_rtniitstudentloan with_fintForwardDateNotice(Integer fintForwardDateNotice) {
    this.fintForwardDateNotice = fintForwardDateNotice;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniitstudentloan with_fstrWho(String fstrWho) {
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
  public tblnz_rtniitstudentloan with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitstudentloan)) {
      return false;
    }
    tblnz_rtniitstudentloan that = (tblnz_rtniitstudentloan) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSLThreshold == null ? that.fcurSLThreshold == null : this.fcurSLThreshold.equals(that.fcurSLThreshold));
    equal = equal && (this.fcurSLURT == null ? that.fcurSLURT == null : this.fcurSLURT.equals(that.fcurSLURT));
    equal = equal && (this.fcurSLAdjNetIncome == null ? that.fcurSLAdjNetIncome == null : this.fcurSLAdjNetIncome.equals(that.fcurSLAdjNetIncome));
    equal = equal && (this.fcurSLLiableIncome == null ? that.fcurSLLiableIncome == null : this.fcurSLLiableIncome.equals(that.fcurSLLiableIncome));
    equal = equal && (this.fcurSLAssessment == null ? that.fcurSLAssessment == null : this.fcurSLAssessment.equals(that.fcurSLAssessment));
    equal = equal && (this.fcurSLInterimAmount == null ? that.fcurSLInterimAmount == null : this.fcurSLInterimAmount.equals(that.fcurSLInterimAmount));
    equal = equal && (this.fbln215Indicator == null ? that.fbln215Indicator == null : this.fbln215Indicator.equals(that.fbln215Indicator));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fintForwardDateNotice == null ? that.fintForwardDateNotice == null : this.fintForwardDateNotice.equals(that.fintForwardDateNotice));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitstudentloan)) {
      return false;
    }
    tblnz_rtniitstudentloan that = (tblnz_rtniitstudentloan) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSLThreshold == null ? that.fcurSLThreshold == null : this.fcurSLThreshold.equals(that.fcurSLThreshold));
    equal = equal && (this.fcurSLURT == null ? that.fcurSLURT == null : this.fcurSLURT.equals(that.fcurSLURT));
    equal = equal && (this.fcurSLAdjNetIncome == null ? that.fcurSLAdjNetIncome == null : this.fcurSLAdjNetIncome.equals(that.fcurSLAdjNetIncome));
    equal = equal && (this.fcurSLLiableIncome == null ? that.fcurSLLiableIncome == null : this.fcurSLLiableIncome.equals(that.fcurSLLiableIncome));
    equal = equal && (this.fcurSLAssessment == null ? that.fcurSLAssessment == null : this.fcurSLAssessment.equals(that.fcurSLAssessment));
    equal = equal && (this.fcurSLInterimAmount == null ? that.fcurSLInterimAmount == null : this.fcurSLInterimAmount.equals(that.fcurSLInterimAmount));
    equal = equal && (this.fbln215Indicator == null ? that.fbln215Indicator == null : this.fbln215Indicator.equals(that.fbln215Indicator));
    equal = equal && (this.fblnManualOverride == null ? that.fblnManualOverride == null : this.fblnManualOverride.equals(that.fblnManualOverride));
    equal = equal && (this.fintForwardDateNotice == null ? that.fintForwardDateNotice == null : this.fintForwardDateNotice.equals(that.fintForwardDateNotice));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSLThreshold = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurSLURT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurSLAdjNetIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurSLLiableIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurSLAssessment = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurSLInterimAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fbln215Indicator = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintForwardDateNotice = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSLThreshold = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurSLURT = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurSLAdjNetIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurSLLiableIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurSLAssessment = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurSLInterimAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fbln215Indicator = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnManualOverride = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintForwardDateNotice = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLThreshold, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLURT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAdjNetIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLLiableIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAssessment, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLInterimAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fbln215Indicator, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintForwardDateNotice, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLThreshold, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLURT, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAdjNetIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLLiableIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLAssessment, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLInterimAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fbln215Indicator, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualOverride, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintForwardDateNotice, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
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
        this.fcurSLThreshold = null;
    } else {
    this.fcurSLThreshold = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLURT = null;
    } else {
    this.fcurSLURT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLAdjNetIncome = null;
    } else {
    this.fcurSLAdjNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLLiableIncome = null;
    } else {
    this.fcurSLLiableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLAssessment = null;
    } else {
    this.fcurSLAssessment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLInterimAmount = null;
    } else {
    this.fcurSLInterimAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fbln215Indicator = null;
    } else {
    this.fbln215Indicator = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManualOverride = null;
    } else {
    this.fblnManualOverride = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintForwardDateNotice = null;
    } else {
    this.fintForwardDateNotice = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurSLThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLThreshold, __dataOut);
    }
    if (null == this.fcurSLURT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLURT, __dataOut);
    }
    if (null == this.fcurSLAdjNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAdjNetIncome, __dataOut);
    }
    if (null == this.fcurSLLiableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLLiableIncome, __dataOut);
    }
    if (null == this.fcurSLAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAssessment, __dataOut);
    }
    if (null == this.fcurSLInterimAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLInterimAmount, __dataOut);
    }
    if (null == this.fbln215Indicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fbln215Indicator);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fintForwardDateNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintForwardDateNotice);
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
    if (null == this.fcurSLThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLThreshold, __dataOut);
    }
    if (null == this.fcurSLURT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLURT, __dataOut);
    }
    if (null == this.fcurSLAdjNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAdjNetIncome, __dataOut);
    }
    if (null == this.fcurSLLiableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLLiableIncome, __dataOut);
    }
    if (null == this.fcurSLAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLAssessment, __dataOut);
    }
    if (null == this.fcurSLInterimAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLInterimAmount, __dataOut);
    }
    if (null == this.fbln215Indicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fbln215Indicator);
    }
    if (null == this.fblnManualOverride) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualOverride);
    }
    if (null == this.fintForwardDateNotice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintForwardDateNotice);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLThreshold==null?"\\N":fcurSLThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLURT==null?"\\N":fcurSLURT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAdjNetIncome==null?"\\N":fcurSLAdjNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLLiableIncome==null?"\\N":fcurSLLiableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAssessment==null?"\\N":fcurSLAssessment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLInterimAmount==null?"\\N":fcurSLInterimAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fbln215Indicator==null?"\\N":"" + fbln215Indicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintForwardDateNotice==null?"\\N":"" + fintForwardDateNotice, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLThreshold==null?"\\N":fcurSLThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLURT==null?"\\N":fcurSLURT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAdjNetIncome==null?"\\N":fcurSLAdjNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLLiableIncome==null?"\\N":fcurSLLiableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLAssessment==null?"\\N":fcurSLAssessment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLInterimAmount==null?"\\N":fcurSLInterimAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fbln215Indicator==null?"\\N":"" + fbln215Indicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualOverride==null?"\\N":"" + fblnManualOverride, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintForwardDateNotice==null?"\\N":"" + fintForwardDateNotice, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLThreshold = null; } else {
      this.fcurSLThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLURT = null; } else {
      this.fcurSLURT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAdjNetIncome = null; } else {
      this.fcurSLAdjNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLLiableIncome = null; } else {
      this.fcurSLLiableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAssessment = null; } else {
      this.fcurSLAssessment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLInterimAmount = null; } else {
      this.fcurSLInterimAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fbln215Indicator = null; } else {
      this.fbln215Indicator = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualOverride = null; } else {
      this.fblnManualOverride = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintForwardDateNotice = null; } else {
      this.fintForwardDateNotice = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLThreshold = null; } else {
      this.fcurSLThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLURT = null; } else {
      this.fcurSLURT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAdjNetIncome = null; } else {
      this.fcurSLAdjNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLLiableIncome = null; } else {
      this.fcurSLLiableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLAssessment = null; } else {
      this.fcurSLAssessment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLInterimAmount = null; } else {
      this.fcurSLInterimAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fbln215Indicator = null; } else {
      this.fbln215Indicator = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualOverride = null; } else {
      this.fblnManualOverride = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintForwardDateNotice = null; } else {
      this.fintForwardDateNotice = Integer.valueOf(__cur_str);
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
    tblnz_rtniitstudentloan o = (tblnz_rtniitstudentloan) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniitstudentloan o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSLThreshold", this.fcurSLThreshold);
    __sqoop$field_map.put("fcurSLURT", this.fcurSLURT);
    __sqoop$field_map.put("fcurSLAdjNetIncome", this.fcurSLAdjNetIncome);
    __sqoop$field_map.put("fcurSLLiableIncome", this.fcurSLLiableIncome);
    __sqoop$field_map.put("fcurSLAssessment", this.fcurSLAssessment);
    __sqoop$field_map.put("fcurSLInterimAmount", this.fcurSLInterimAmount);
    __sqoop$field_map.put("fbln215Indicator", this.fbln215Indicator);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fintForwardDateNotice", this.fintForwardDateNotice);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSLThreshold", this.fcurSLThreshold);
    __sqoop$field_map.put("fcurSLURT", this.fcurSLURT);
    __sqoop$field_map.put("fcurSLAdjNetIncome", this.fcurSLAdjNetIncome);
    __sqoop$field_map.put("fcurSLLiableIncome", this.fcurSLLiableIncome);
    __sqoop$field_map.put("fcurSLAssessment", this.fcurSLAssessment);
    __sqoop$field_map.put("fcurSLInterimAmount", this.fcurSLInterimAmount);
    __sqoop$field_map.put("fbln215Indicator", this.fbln215Indicator);
    __sqoop$field_map.put("fblnManualOverride", this.fblnManualOverride);
    __sqoop$field_map.put("fintForwardDateNotice", this.fintForwardDateNotice);
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
