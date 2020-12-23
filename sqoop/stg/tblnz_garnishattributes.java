// ORM class for table 'tblnz_garnishattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:50:58 NZDT 2020
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

public class tblnz_garnishattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnWage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fblnWage = (Integer)value;
      }
    });
    setters.put("fblnAutomatic", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fblnAutomatic = (Integer)value;
      }
    });
    setters.put("fcurExpectedPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fcurExpectedPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPercentOfDebt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fcurPercentOfDebt = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMonthlyIncomeByPercent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fcurMonthlyIncomeByPercent = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMonthlyPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fcurMonthlyPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmFutureIssueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fdtmFutureIssueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fdtmStartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_garnishattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_garnishattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_garnishattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnWage;
  public Integer get_fblnWage() {
    return fblnWage;
  }
  public void set_fblnWage(Integer fblnWage) {
    this.fblnWage = fblnWage;
  }
  public tblnz_garnishattributes with_fblnWage(Integer fblnWage) {
    this.fblnWage = fblnWage;
    return this;
  }
  private Integer fblnAutomatic;
  public Integer get_fblnAutomatic() {
    return fblnAutomatic;
  }
  public void set_fblnAutomatic(Integer fblnAutomatic) {
    this.fblnAutomatic = fblnAutomatic;
  }
  public tblnz_garnishattributes with_fblnAutomatic(Integer fblnAutomatic) {
    this.fblnAutomatic = fblnAutomatic;
    return this;
  }
  private java.math.BigDecimal fcurExpectedPayment;
  public java.math.BigDecimal get_fcurExpectedPayment() {
    return fcurExpectedPayment;
  }
  public void set_fcurExpectedPayment(java.math.BigDecimal fcurExpectedPayment) {
    this.fcurExpectedPayment = fcurExpectedPayment;
  }
  public tblnz_garnishattributes with_fcurExpectedPayment(java.math.BigDecimal fcurExpectedPayment) {
    this.fcurExpectedPayment = fcurExpectedPayment;
    return this;
  }
  private java.math.BigDecimal fcurPercentOfDebt;
  public java.math.BigDecimal get_fcurPercentOfDebt() {
    return fcurPercentOfDebt;
  }
  public void set_fcurPercentOfDebt(java.math.BigDecimal fcurPercentOfDebt) {
    this.fcurPercentOfDebt = fcurPercentOfDebt;
  }
  public tblnz_garnishattributes with_fcurPercentOfDebt(java.math.BigDecimal fcurPercentOfDebt) {
    this.fcurPercentOfDebt = fcurPercentOfDebt;
    return this;
  }
  private java.math.BigDecimal fcurMonthlyIncomeByPercent;
  public java.math.BigDecimal get_fcurMonthlyIncomeByPercent() {
    return fcurMonthlyIncomeByPercent;
  }
  public void set_fcurMonthlyIncomeByPercent(java.math.BigDecimal fcurMonthlyIncomeByPercent) {
    this.fcurMonthlyIncomeByPercent = fcurMonthlyIncomeByPercent;
  }
  public tblnz_garnishattributes with_fcurMonthlyIncomeByPercent(java.math.BigDecimal fcurMonthlyIncomeByPercent) {
    this.fcurMonthlyIncomeByPercent = fcurMonthlyIncomeByPercent;
    return this;
  }
  private java.math.BigDecimal fcurMonthlyPayment;
  public java.math.BigDecimal get_fcurMonthlyPayment() {
    return fcurMonthlyPayment;
  }
  public void set_fcurMonthlyPayment(java.math.BigDecimal fcurMonthlyPayment) {
    this.fcurMonthlyPayment = fcurMonthlyPayment;
  }
  public tblnz_garnishattributes with_fcurMonthlyPayment(java.math.BigDecimal fcurMonthlyPayment) {
    this.fcurMonthlyPayment = fcurMonthlyPayment;
    return this;
  }
  private java.sql.Timestamp fdtmFutureIssueDate;
  public java.sql.Timestamp get_fdtmFutureIssueDate() {
    return fdtmFutureIssueDate;
  }
  public void set_fdtmFutureIssueDate(java.sql.Timestamp fdtmFutureIssueDate) {
    this.fdtmFutureIssueDate = fdtmFutureIssueDate;
  }
  public tblnz_garnishattributes with_fdtmFutureIssueDate(java.sql.Timestamp fdtmFutureIssueDate) {
    this.fdtmFutureIssueDate = fdtmFutureIssueDate;
    return this;
  }
  private java.sql.Timestamp fdtmStartDate;
  public java.sql.Timestamp get_fdtmStartDate() {
    return fdtmStartDate;
  }
  public void set_fdtmStartDate(java.sql.Timestamp fdtmStartDate) {
    this.fdtmStartDate = fdtmStartDate;
  }
  public tblnz_garnishattributes with_fdtmStartDate(java.sql.Timestamp fdtmStartDate) {
    this.fdtmStartDate = fdtmStartDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_garnishattributes with_fstrWho(String fstrWho) {
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
  public tblnz_garnishattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_garnishattributes)) {
      return false;
    }
    tblnz_garnishattributes that = (tblnz_garnishattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnWage == null ? that.fblnWage == null : this.fblnWage.equals(that.fblnWage));
    equal = equal && (this.fblnAutomatic == null ? that.fblnAutomatic == null : this.fblnAutomatic.equals(that.fblnAutomatic));
    equal = equal && (this.fcurExpectedPayment == null ? that.fcurExpectedPayment == null : this.fcurExpectedPayment.equals(that.fcurExpectedPayment));
    equal = equal && (this.fcurPercentOfDebt == null ? that.fcurPercentOfDebt == null : this.fcurPercentOfDebt.equals(that.fcurPercentOfDebt));
    equal = equal && (this.fcurMonthlyIncomeByPercent == null ? that.fcurMonthlyIncomeByPercent == null : this.fcurMonthlyIncomeByPercent.equals(that.fcurMonthlyIncomeByPercent));
    equal = equal && (this.fcurMonthlyPayment == null ? that.fcurMonthlyPayment == null : this.fcurMonthlyPayment.equals(that.fcurMonthlyPayment));
    equal = equal && (this.fdtmFutureIssueDate == null ? that.fdtmFutureIssueDate == null : this.fdtmFutureIssueDate.equals(that.fdtmFutureIssueDate));
    equal = equal && (this.fdtmStartDate == null ? that.fdtmStartDate == null : this.fdtmStartDate.equals(that.fdtmStartDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_garnishattributes)) {
      return false;
    }
    tblnz_garnishattributes that = (tblnz_garnishattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnWage == null ? that.fblnWage == null : this.fblnWage.equals(that.fblnWage));
    equal = equal && (this.fblnAutomatic == null ? that.fblnAutomatic == null : this.fblnAutomatic.equals(that.fblnAutomatic));
    equal = equal && (this.fcurExpectedPayment == null ? that.fcurExpectedPayment == null : this.fcurExpectedPayment.equals(that.fcurExpectedPayment));
    equal = equal && (this.fcurPercentOfDebt == null ? that.fcurPercentOfDebt == null : this.fcurPercentOfDebt.equals(that.fcurPercentOfDebt));
    equal = equal && (this.fcurMonthlyIncomeByPercent == null ? that.fcurMonthlyIncomeByPercent == null : this.fcurMonthlyIncomeByPercent.equals(that.fcurMonthlyIncomeByPercent));
    equal = equal && (this.fcurMonthlyPayment == null ? that.fcurMonthlyPayment == null : this.fcurMonthlyPayment.equals(that.fcurMonthlyPayment));
    equal = equal && (this.fdtmFutureIssueDate == null ? that.fdtmFutureIssueDate == null : this.fdtmFutureIssueDate.equals(that.fdtmFutureIssueDate));
    equal = equal && (this.fdtmStartDate == null ? that.fdtmStartDate == null : this.fdtmStartDate.equals(that.fdtmStartDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnWage = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnAutomatic = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurExpectedPayment = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPercentOfDebt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurMonthlyIncomeByPercent = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMonthlyPayment = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmFutureIssueDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmStartDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnWage = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnAutomatic = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurExpectedPayment = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPercentOfDebt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurMonthlyIncomeByPercent = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMonthlyPayment = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmFutureIssueDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmStartDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnWage, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomatic, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpectedPayment, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPercentOfDebt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMonthlyIncomeByPercent, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMonthlyPayment, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFutureIssueDate, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStartDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWage, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomatic, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExpectedPayment, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPercentOfDebt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMonthlyIncomeByPercent, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMonthlyPayment, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFutureIssueDate, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStartDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
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
        this.fblnWage = null;
    } else {
    this.fblnWage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutomatic = null;
    } else {
    this.fblnAutomatic = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExpectedPayment = null;
    } else {
    this.fcurExpectedPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPercentOfDebt = null;
    } else {
    this.fcurPercentOfDebt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMonthlyIncomeByPercent = null;
    } else {
    this.fcurMonthlyIncomeByPercent = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMonthlyPayment = null;
    } else {
    this.fcurMonthlyPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFutureIssueDate = null;
    } else {
    this.fdtmFutureIssueDate = new Timestamp(__dataIn.readLong());
    this.fdtmFutureIssueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStartDate = null;
    } else {
    this.fdtmStartDate = new Timestamp(__dataIn.readLong());
    this.fdtmStartDate.setNanos(__dataIn.readInt());
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
    if (null == this.fblnWage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWage);
    }
    if (null == this.fblnAutomatic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomatic);
    }
    if (null == this.fcurExpectedPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpectedPayment, __dataOut);
    }
    if (null == this.fcurPercentOfDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPercentOfDebt, __dataOut);
    }
    if (null == this.fcurMonthlyIncomeByPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMonthlyIncomeByPercent, __dataOut);
    }
    if (null == this.fcurMonthlyPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMonthlyPayment, __dataOut);
    }
    if (null == this.fdtmFutureIssueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFutureIssueDate.getTime());
    __dataOut.writeInt(this.fdtmFutureIssueDate.getNanos());
    }
    if (null == this.fdtmStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStartDate.getTime());
    __dataOut.writeInt(this.fdtmStartDate.getNanos());
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
    if (null == this.fblnWage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWage);
    }
    if (null == this.fblnAutomatic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomatic);
    }
    if (null == this.fcurExpectedPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExpectedPayment, __dataOut);
    }
    if (null == this.fcurPercentOfDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPercentOfDebt, __dataOut);
    }
    if (null == this.fcurMonthlyIncomeByPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMonthlyIncomeByPercent, __dataOut);
    }
    if (null == this.fcurMonthlyPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMonthlyPayment, __dataOut);
    }
    if (null == this.fdtmFutureIssueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFutureIssueDate.getTime());
    __dataOut.writeInt(this.fdtmFutureIssueDate.getNanos());
    }
    if (null == this.fdtmStartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStartDate.getTime());
    __dataOut.writeInt(this.fdtmStartDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWage==null?"\\N":"" + fblnWage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomatic==null?"\\N":"" + fblnAutomatic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpectedPayment==null?"\\N":fcurExpectedPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPercentOfDebt==null?"\\N":fcurPercentOfDebt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMonthlyIncomeByPercent==null?"\\N":fcurMonthlyIncomeByPercent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMonthlyPayment==null?"\\N":fcurMonthlyPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFutureIssueDate==null?"\\N":"" + fdtmFutureIssueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStartDate==null?"\\N":"" + fdtmStartDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWage==null?"\\N":"" + fblnWage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomatic==null?"\\N":"" + fblnAutomatic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExpectedPayment==null?"\\N":fcurExpectedPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPercentOfDebt==null?"\\N":fcurPercentOfDebt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMonthlyIncomeByPercent==null?"\\N":fcurMonthlyIncomeByPercent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMonthlyPayment==null?"\\N":fcurMonthlyPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFutureIssueDate==null?"\\N":"" + fdtmFutureIssueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStartDate==null?"\\N":"" + fdtmStartDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWage = null; } else {
      this.fblnWage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomatic = null; } else {
      this.fblnAutomatic = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpectedPayment = null; } else {
      this.fcurExpectedPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPercentOfDebt = null; } else {
      this.fcurPercentOfDebt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMonthlyIncomeByPercent = null; } else {
      this.fcurMonthlyIncomeByPercent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMonthlyPayment = null; } else {
      this.fcurMonthlyPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFutureIssueDate = null; } else {
      this.fdtmFutureIssueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStartDate = null; } else {
      this.fdtmStartDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWage = null; } else {
      this.fblnWage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomatic = null; } else {
      this.fblnAutomatic = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExpectedPayment = null; } else {
      this.fcurExpectedPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPercentOfDebt = null; } else {
      this.fcurPercentOfDebt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMonthlyIncomeByPercent = null; } else {
      this.fcurMonthlyIncomeByPercent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMonthlyPayment = null; } else {
      this.fcurMonthlyPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFutureIssueDate = null; } else {
      this.fdtmFutureIssueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStartDate = null; } else {
      this.fdtmStartDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_garnishattributes o = (tblnz_garnishattributes) super.clone();
    o.fdtmFutureIssueDate = (o.fdtmFutureIssueDate != null) ? (java.sql.Timestamp) o.fdtmFutureIssueDate.clone() : null;
    o.fdtmStartDate = (o.fdtmStartDate != null) ? (java.sql.Timestamp) o.fdtmStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_garnishattributes o) throws CloneNotSupportedException {
    o.fdtmFutureIssueDate = (o.fdtmFutureIssueDate != null) ? (java.sql.Timestamp) o.fdtmFutureIssueDate.clone() : null;
    o.fdtmStartDate = (o.fdtmStartDate != null) ? (java.sql.Timestamp) o.fdtmStartDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnWage", this.fblnWage);
    __sqoop$field_map.put("fblnAutomatic", this.fblnAutomatic);
    __sqoop$field_map.put("fcurExpectedPayment", this.fcurExpectedPayment);
    __sqoop$field_map.put("fcurPercentOfDebt", this.fcurPercentOfDebt);
    __sqoop$field_map.put("fcurMonthlyIncomeByPercent", this.fcurMonthlyIncomeByPercent);
    __sqoop$field_map.put("fcurMonthlyPayment", this.fcurMonthlyPayment);
    __sqoop$field_map.put("fdtmFutureIssueDate", this.fdtmFutureIssueDate);
    __sqoop$field_map.put("fdtmStartDate", this.fdtmStartDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnWage", this.fblnWage);
    __sqoop$field_map.put("fblnAutomatic", this.fblnAutomatic);
    __sqoop$field_map.put("fcurExpectedPayment", this.fcurExpectedPayment);
    __sqoop$field_map.put("fcurPercentOfDebt", this.fcurPercentOfDebt);
    __sqoop$field_map.put("fcurMonthlyIncomeByPercent", this.fcurMonthlyIncomeByPercent);
    __sqoop$field_map.put("fcurMonthlyPayment", this.fcurMonthlyPayment);
    __sqoop$field_map.put("fdtmFutureIssueDate", this.fdtmFutureIssueDate);
    __sqoop$field_map.put("fdtmStartDate", this.fdtmStartDate);
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
