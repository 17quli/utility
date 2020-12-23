// ORM class for table 'tblrecoveryamount'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:02:21 NZDT 2020
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

public class tblrecoveryamount extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRecoveryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.flngRecoveryKey = (Integer)value;
      }
    });
    setters.put("flngOffsetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.flngOffsetKey = (Integer)value;
      }
    });
    setters.put("flngDataKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.flngDataKey = (Integer)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmDateTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fdtmDateTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fdtmDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintDay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fintDay = (Integer)value;
      }
    });
    setters.put("fintMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fintMonth = (Integer)value;
      }
    });
    setters.put("fintQuarter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fintQuarter = (Integer)value;
      }
    });
    setters.put("fintYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fintYear = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecoveryamount.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblrecoveryamount() {
    init0();
  }
  private Integer flngRecoveryKey;
  public Integer get_flngRecoveryKey() {
    return flngRecoveryKey;
  }
  public void set_flngRecoveryKey(Integer flngRecoveryKey) {
    this.flngRecoveryKey = flngRecoveryKey;
  }
  public tblrecoveryamount with_flngRecoveryKey(Integer flngRecoveryKey) {
    this.flngRecoveryKey = flngRecoveryKey;
    return this;
  }
  private Integer flngOffsetKey;
  public Integer get_flngOffsetKey() {
    return flngOffsetKey;
  }
  public void set_flngOffsetKey(Integer flngOffsetKey) {
    this.flngOffsetKey = flngOffsetKey;
  }
  public tblrecoveryamount with_flngOffsetKey(Integer flngOffsetKey) {
    this.flngOffsetKey = flngOffsetKey;
    return this;
  }
  private Integer flngDataKey;
  public Integer get_flngDataKey() {
    return flngDataKey;
  }
  public void set_flngDataKey(Integer flngDataKey) {
    this.flngDataKey = flngDataKey;
  }
  public tblrecoveryamount with_flngDataKey(Integer flngDataKey) {
    this.flngDataKey = flngDataKey;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblrecoveryamount with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.sql.Timestamp fdtmDateTime;
  public java.sql.Timestamp get_fdtmDateTime() {
    return fdtmDateTime;
  }
  public void set_fdtmDateTime(java.sql.Timestamp fdtmDateTime) {
    this.fdtmDateTime = fdtmDateTime;
  }
  public tblrecoveryamount with_fdtmDateTime(java.sql.Timestamp fdtmDateTime) {
    this.fdtmDateTime = fdtmDateTime;
    return this;
  }
  private java.sql.Timestamp fdtmDate;
  public java.sql.Timestamp get_fdtmDate() {
    return fdtmDate;
  }
  public void set_fdtmDate(java.sql.Timestamp fdtmDate) {
    this.fdtmDate = fdtmDate;
  }
  public tblrecoveryamount with_fdtmDate(java.sql.Timestamp fdtmDate) {
    this.fdtmDate = fdtmDate;
    return this;
  }
  private Integer fintDay;
  public Integer get_fintDay() {
    return fintDay;
  }
  public void set_fintDay(Integer fintDay) {
    this.fintDay = fintDay;
  }
  public tblrecoveryamount with_fintDay(Integer fintDay) {
    this.fintDay = fintDay;
    return this;
  }
  private Integer fintMonth;
  public Integer get_fintMonth() {
    return fintMonth;
  }
  public void set_fintMonth(Integer fintMonth) {
    this.fintMonth = fintMonth;
  }
  public tblrecoveryamount with_fintMonth(Integer fintMonth) {
    this.fintMonth = fintMonth;
    return this;
  }
  private Integer fintQuarter;
  public Integer get_fintQuarter() {
    return fintQuarter;
  }
  public void set_fintQuarter(Integer fintQuarter) {
    this.fintQuarter = fintQuarter;
  }
  public tblrecoveryamount with_fintQuarter(Integer fintQuarter) {
    this.fintQuarter = fintQuarter;
    return this;
  }
  private Integer fintYear;
  public Integer get_fintYear() {
    return fintYear;
  }
  public void set_fintYear(Integer fintYear) {
    this.fintYear = fintYear;
  }
  public tblrecoveryamount with_fintYear(Integer fintYear) {
    this.fintYear = fintYear;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblrecoveryamount with_fstrWho(String fstrWho) {
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
  public tblrecoveryamount with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrecoveryamount)) {
      return false;
    }
    tblrecoveryamount that = (tblrecoveryamount) o;
    boolean equal = true;
    equal = equal && (this.flngRecoveryKey == null ? that.flngRecoveryKey == null : this.flngRecoveryKey.equals(that.flngRecoveryKey));
    equal = equal && (this.flngOffsetKey == null ? that.flngOffsetKey == null : this.flngOffsetKey.equals(that.flngOffsetKey));
    equal = equal && (this.flngDataKey == null ? that.flngDataKey == null : this.flngDataKey.equals(that.flngDataKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmDateTime == null ? that.fdtmDateTime == null : this.fdtmDateTime.equals(that.fdtmDateTime));
    equal = equal && (this.fdtmDate == null ? that.fdtmDate == null : this.fdtmDate.equals(that.fdtmDate));
    equal = equal && (this.fintDay == null ? that.fintDay == null : this.fintDay.equals(that.fintDay));
    equal = equal && (this.fintMonth == null ? that.fintMonth == null : this.fintMonth.equals(that.fintMonth));
    equal = equal && (this.fintQuarter == null ? that.fintQuarter == null : this.fintQuarter.equals(that.fintQuarter));
    equal = equal && (this.fintYear == null ? that.fintYear == null : this.fintYear.equals(that.fintYear));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrecoveryamount)) {
      return false;
    }
    tblrecoveryamount that = (tblrecoveryamount) o;
    boolean equal = true;
    equal = equal && (this.flngRecoveryKey == null ? that.flngRecoveryKey == null : this.flngRecoveryKey.equals(that.flngRecoveryKey));
    equal = equal && (this.flngOffsetKey == null ? that.flngOffsetKey == null : this.flngOffsetKey.equals(that.flngOffsetKey));
    equal = equal && (this.flngDataKey == null ? that.flngDataKey == null : this.flngDataKey.equals(that.flngDataKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmDateTime == null ? that.fdtmDateTime == null : this.fdtmDateTime.equals(that.fdtmDateTime));
    equal = equal && (this.fdtmDate == null ? that.fdtmDate == null : this.fdtmDate.equals(that.fdtmDate));
    equal = equal && (this.fintDay == null ? that.fintDay == null : this.fintDay.equals(that.fintDay));
    equal = equal && (this.fintMonth == null ? that.fintMonth == null : this.fintMonth.equals(that.fintMonth));
    equal = equal && (this.fintQuarter == null ? that.fintQuarter == null : this.fintQuarter.equals(that.fintQuarter));
    equal = equal && (this.fintYear == null ? that.fintYear == null : this.fintYear.equals(that.fintYear));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRecoveryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngOffsetKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngDataKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fdtmDateTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fintDay = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintMonth = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintQuarter = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintYear = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRecoveryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngOffsetKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngDataKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fdtmDateTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fintDay = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintMonth = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintQuarter = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintYear = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRecoveryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOffsetKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDataKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDay, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMonth, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintQuarter, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintYear, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRecoveryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOffsetKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDataKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDay, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMonth, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintQuarter, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintYear, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRecoveryKey = null;
    } else {
    this.flngRecoveryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngOffsetKey = null;
    } else {
    this.flngOffsetKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDataKey = null;
    } else {
    this.flngDataKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateTime = null;
    } else {
    this.fdtmDateTime = new Timestamp(__dataIn.readLong());
    this.fdtmDateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDate = null;
    } else {
    this.fdtmDate = new Timestamp(__dataIn.readLong());
    this.fdtmDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintDay = null;
    } else {
    this.fintDay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintMonth = null;
    } else {
    this.fintMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintQuarter = null;
    } else {
    this.fintQuarter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintYear = null;
    } else {
    this.fintYear = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngRecoveryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRecoveryKey);
    }
    if (null == this.flngOffsetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOffsetKey);
    }
    if (null == this.flngDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDataKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTime.getTime());
    __dataOut.writeInt(this.fdtmDateTime.getNanos());
    }
    if (null == this.fdtmDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDate.getTime());
    __dataOut.writeInt(this.fdtmDate.getNanos());
    }
    if (null == this.fintDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDay);
    }
    if (null == this.fintMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMonth);
    }
    if (null == this.fintQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintQuarter);
    }
    if (null == this.fintYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintYear);
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
    if (null == this.flngRecoveryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRecoveryKey);
    }
    if (null == this.flngOffsetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOffsetKey);
    }
    if (null == this.flngDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDataKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTime.getTime());
    __dataOut.writeInt(this.fdtmDateTime.getNanos());
    }
    if (null == this.fdtmDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDate.getTime());
    __dataOut.writeInt(this.fdtmDate.getNanos());
    }
    if (null == this.fintDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDay);
    }
    if (null == this.fintMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMonth);
    }
    if (null == this.fintQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintQuarter);
    }
    if (null == this.fintYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintYear);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRecoveryKey==null?"\\N":"" + flngRecoveryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOffsetKey==null?"\\N":"" + flngOffsetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDataKey==null?"\\N":"" + flngDataKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTime==null?"\\N":"" + fdtmDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDate==null?"\\N":"" + fdtmDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDay==null?"\\N":"" + fintDay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMonth==null?"\\N":"" + fintMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintQuarter==null?"\\N":"" + fintQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintYear==null?"\\N":"" + fintYear, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRecoveryKey==null?"\\N":"" + flngRecoveryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOffsetKey==null?"\\N":"" + flngOffsetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDataKey==null?"\\N":"" + flngDataKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTime==null?"\\N":"" + fdtmDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDate==null?"\\N":"" + fdtmDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDay==null?"\\N":"" + fintDay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMonth==null?"\\N":"" + fintMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintQuarter==null?"\\N":"" + fintQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintYear==null?"\\N":"" + fintYear, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRecoveryKey = null; } else {
      this.flngRecoveryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOffsetKey = null; } else {
      this.flngOffsetKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDataKey = null; } else {
      this.flngDataKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTime = null; } else {
      this.fdtmDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDate = null; } else {
      this.fdtmDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDay = null; } else {
      this.fintDay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMonth = null; } else {
      this.fintMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintQuarter = null; } else {
      this.fintQuarter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintYear = null; } else {
      this.fintYear = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRecoveryKey = null; } else {
      this.flngRecoveryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOffsetKey = null; } else {
      this.flngOffsetKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDataKey = null; } else {
      this.flngDataKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTime = null; } else {
      this.fdtmDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDate = null; } else {
      this.fdtmDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDay = null; } else {
      this.fintDay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMonth = null; } else {
      this.fintMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintQuarter = null; } else {
      this.fintQuarter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintYear = null; } else {
      this.fintYear = Integer.valueOf(__cur_str);
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
    tblrecoveryamount o = (tblrecoveryamount) super.clone();
    o.fdtmDateTime = (o.fdtmDateTime != null) ? (java.sql.Timestamp) o.fdtmDateTime.clone() : null;
    o.fdtmDate = (o.fdtmDate != null) ? (java.sql.Timestamp) o.fdtmDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblrecoveryamount o) throws CloneNotSupportedException {
    o.fdtmDateTime = (o.fdtmDateTime != null) ? (java.sql.Timestamp) o.fdtmDateTime.clone() : null;
    o.fdtmDate = (o.fdtmDate != null) ? (java.sql.Timestamp) o.fdtmDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRecoveryKey", this.flngRecoveryKey);
    __sqoop$field_map.put("flngOffsetKey", this.flngOffsetKey);
    __sqoop$field_map.put("flngDataKey", this.flngDataKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmDateTime", this.fdtmDateTime);
    __sqoop$field_map.put("fdtmDate", this.fdtmDate);
    __sqoop$field_map.put("fintDay", this.fintDay);
    __sqoop$field_map.put("fintMonth", this.fintMonth);
    __sqoop$field_map.put("fintQuarter", this.fintQuarter);
    __sqoop$field_map.put("fintYear", this.fintYear);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRecoveryKey", this.flngRecoveryKey);
    __sqoop$field_map.put("flngOffsetKey", this.flngOffsetKey);
    __sqoop$field_map.put("flngDataKey", this.flngDataKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmDateTime", this.fdtmDateTime);
    __sqoop$field_map.put("fdtmDate", this.fdtmDate);
    __sqoop$field_map.put("fintDay", this.fintDay);
    __sqoop$field_map.put("fintMonth", this.fintMonth);
    __sqoop$field_map.put("fintQuarter", this.fintQuarter);
    __sqoop$field_map.put("fintYear", this.fintYear);
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
