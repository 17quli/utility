// ORM class for table 'tblnz_incomesources'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:09:01 NZDT 2020
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

public class tblnz_incomesources extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fdtmStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomesources.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomesources() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomesources with_fi64IncomeKey(Long fi64IncomeKey) {
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
  public tblnz_incomesources with_flngVer(Integer flngVer) {
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
  public tblnz_incomesources with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_incomesources with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_incomesources with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tblnz_incomesources with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmStop;
  public java.sql.Timestamp get_fdtmStop() {
    return fdtmStop;
  }
  public void set_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
  }
  public tblnz_incomesources with_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_incomesources with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_incomesources with_fblnActive(Integer fblnActive) {
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
  public tblnz_incomesources with_fstrWho(String fstrWho) {
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
  public tblnz_incomesources with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomesources)) {
      return false;
    }
    tblnz_incomesources that = (tblnz_incomesources) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomesources)) {
      return false;
    }
    tblnz_incomesources that = (tblnz_incomesources) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(9, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
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
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStop = null;
    } else {
    this.fdtmStop = new Timestamp(__dataIn.readLong());
    this.fdtmStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_incomesources o = (tblnz_incomesources) super.clone();
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomesources o) throws CloneNotSupportedException {
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
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
