// ORM class for table 'tblreturntransfer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:46:06 NZDT 2020
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

public class tblreturntransfer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("flngAccountKeyFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.flngAccountKeyFrom = (Integer)value;
      }
    });
    setters.put("flngReturnKeyFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.flngReturnKeyFrom = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriodFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fdtmFilingPeriodFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngAccountKeyTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.flngAccountKeyTo = (Integer)value;
      }
    });
    setters.put("flngReturnKeyTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.flngReturnKeyTo = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriodTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fdtmFilingPeriodTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblreturntransfer.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblreturntransfer() {
    init0();
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblreturntransfer with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tblreturntransfer with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Integer flngAccountKeyFrom;
  public Integer get_flngAccountKeyFrom() {
    return flngAccountKeyFrom;
  }
  public void set_flngAccountKeyFrom(Integer flngAccountKeyFrom) {
    this.flngAccountKeyFrom = flngAccountKeyFrom;
  }
  public tblreturntransfer with_flngAccountKeyFrom(Integer flngAccountKeyFrom) {
    this.flngAccountKeyFrom = flngAccountKeyFrom;
    return this;
  }
  private Integer flngReturnKeyFrom;
  public Integer get_flngReturnKeyFrom() {
    return flngReturnKeyFrom;
  }
  public void set_flngReturnKeyFrom(Integer flngReturnKeyFrom) {
    this.flngReturnKeyFrom = flngReturnKeyFrom;
  }
  public tblreturntransfer with_flngReturnKeyFrom(Integer flngReturnKeyFrom) {
    this.flngReturnKeyFrom = flngReturnKeyFrom;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriodFrom;
  public java.sql.Timestamp get_fdtmFilingPeriodFrom() {
    return fdtmFilingPeriodFrom;
  }
  public void set_fdtmFilingPeriodFrom(java.sql.Timestamp fdtmFilingPeriodFrom) {
    this.fdtmFilingPeriodFrom = fdtmFilingPeriodFrom;
  }
  public tblreturntransfer with_fdtmFilingPeriodFrom(java.sql.Timestamp fdtmFilingPeriodFrom) {
    this.fdtmFilingPeriodFrom = fdtmFilingPeriodFrom;
    return this;
  }
  private Integer flngAccountKeyTo;
  public Integer get_flngAccountKeyTo() {
    return flngAccountKeyTo;
  }
  public void set_flngAccountKeyTo(Integer flngAccountKeyTo) {
    this.flngAccountKeyTo = flngAccountKeyTo;
  }
  public tblreturntransfer with_flngAccountKeyTo(Integer flngAccountKeyTo) {
    this.flngAccountKeyTo = flngAccountKeyTo;
    return this;
  }
  private Integer flngReturnKeyTo;
  public Integer get_flngReturnKeyTo() {
    return flngReturnKeyTo;
  }
  public void set_flngReturnKeyTo(Integer flngReturnKeyTo) {
    this.flngReturnKeyTo = flngReturnKeyTo;
  }
  public tblreturntransfer with_flngReturnKeyTo(Integer flngReturnKeyTo) {
    this.flngReturnKeyTo = flngReturnKeyTo;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriodTo;
  public java.sql.Timestamp get_fdtmFilingPeriodTo() {
    return fdtmFilingPeriodTo;
  }
  public void set_fdtmFilingPeriodTo(java.sql.Timestamp fdtmFilingPeriodTo) {
    this.fdtmFilingPeriodTo = fdtmFilingPeriodTo;
  }
  public tblreturntransfer with_fdtmFilingPeriodTo(java.sql.Timestamp fdtmFilingPeriodTo) {
    this.fdtmFilingPeriodTo = fdtmFilingPeriodTo;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblreturntransfer with_fstrWho(String fstrWho) {
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
  public tblreturntransfer with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblreturntransfer)) {
      return false;
    }
    tblreturntransfer that = (tblreturntransfer) o;
    boolean equal = true;
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.flngAccountKeyFrom == null ? that.flngAccountKeyFrom == null : this.flngAccountKeyFrom.equals(that.flngAccountKeyFrom));
    equal = equal && (this.flngReturnKeyFrom == null ? that.flngReturnKeyFrom == null : this.flngReturnKeyFrom.equals(that.flngReturnKeyFrom));
    equal = equal && (this.fdtmFilingPeriodFrom == null ? that.fdtmFilingPeriodFrom == null : this.fdtmFilingPeriodFrom.equals(that.fdtmFilingPeriodFrom));
    equal = equal && (this.flngAccountKeyTo == null ? that.flngAccountKeyTo == null : this.flngAccountKeyTo.equals(that.flngAccountKeyTo));
    equal = equal && (this.flngReturnKeyTo == null ? that.flngReturnKeyTo == null : this.flngReturnKeyTo.equals(that.flngReturnKeyTo));
    equal = equal && (this.fdtmFilingPeriodTo == null ? that.fdtmFilingPeriodTo == null : this.fdtmFilingPeriodTo.equals(that.fdtmFilingPeriodTo));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblreturntransfer)) {
      return false;
    }
    tblreturntransfer that = (tblreturntransfer) o;
    boolean equal = true;
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.flngAccountKeyFrom == null ? that.flngAccountKeyFrom == null : this.flngAccountKeyFrom.equals(that.flngAccountKeyFrom));
    equal = equal && (this.flngReturnKeyFrom == null ? that.flngReturnKeyFrom == null : this.flngReturnKeyFrom.equals(that.flngReturnKeyFrom));
    equal = equal && (this.fdtmFilingPeriodFrom == null ? that.fdtmFilingPeriodFrom == null : this.fdtmFilingPeriodFrom.equals(that.fdtmFilingPeriodFrom));
    equal = equal && (this.flngAccountKeyTo == null ? that.flngAccountKeyTo == null : this.flngAccountKeyTo.equals(that.flngAccountKeyTo));
    equal = equal && (this.flngReturnKeyTo == null ? that.flngReturnKeyTo == null : this.flngReturnKeyTo.equals(that.flngReturnKeyTo));
    equal = equal && (this.fdtmFilingPeriodTo == null ? that.fdtmFilingPeriodTo == null : this.fdtmFilingPeriodTo.equals(that.fdtmFilingPeriodTo));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrDocType = JdbcWritableBridge.readString(1, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKeyFrom = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngReturnKeyFrom = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriodFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.flngAccountKeyTo = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngReturnKeyTo = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriodTo = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrDocType = JdbcWritableBridge.readString(1, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKeyFrom = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngReturnKeyFrom = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriodFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.flngAccountKeyTo = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngReturnKeyTo = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriodTo = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
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
    JdbcWritableBridge.writeString(fstrDocType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKeyFrom, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKeyFrom, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKeyTo, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKeyTo, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodTo, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrDocType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKeyFrom, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKeyFrom, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKeyTo, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKeyTo, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriodTo, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKeyFrom = null;
    } else {
    this.flngAccountKeyFrom = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnKeyFrom = null;
    } else {
    this.flngReturnKeyFrom = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriodFrom = null;
    } else {
    this.fdtmFilingPeriodFrom = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriodFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKeyTo = null;
    } else {
    this.flngAccountKeyTo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnKeyTo = null;
    } else {
    this.flngReturnKeyTo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriodTo = null;
    } else {
    this.fdtmFilingPeriodTo = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriodTo.setNanos(__dataIn.readInt());
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
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.flngAccountKeyFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKeyFrom);
    }
    if (null == this.flngReturnKeyFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKeyFrom);
    }
    if (null == this.fdtmFilingPeriodFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodFrom.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodFrom.getNanos());
    }
    if (null == this.flngAccountKeyTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKeyTo);
    }
    if (null == this.flngReturnKeyTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKeyTo);
    }
    if (null == this.fdtmFilingPeriodTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodTo.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodTo.getNanos());
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
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.flngAccountKeyFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKeyFrom);
    }
    if (null == this.flngReturnKeyFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKeyFrom);
    }
    if (null == this.fdtmFilingPeriodFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodFrom.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodFrom.getNanos());
    }
    if (null == this.flngAccountKeyTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKeyTo);
    }
    if (null == this.flngReturnKeyTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKeyTo);
    }
    if (null == this.fdtmFilingPeriodTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriodTo.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriodTo.getNanos());
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKeyFrom==null?"\\N":"" + flngAccountKeyFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKeyFrom==null?"\\N":"" + flngReturnKeyFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodFrom==null?"\\N":"" + fdtmFilingPeriodFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKeyTo==null?"\\N":"" + flngAccountKeyTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKeyTo==null?"\\N":"" + flngReturnKeyTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodTo==null?"\\N":"" + fdtmFilingPeriodTo, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKeyFrom==null?"\\N":"" + flngAccountKeyFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKeyFrom==null?"\\N":"" + flngReturnKeyFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodFrom==null?"\\N":"" + fdtmFilingPeriodFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKeyTo==null?"\\N":"" + flngAccountKeyTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKeyTo==null?"\\N":"" + flngReturnKeyTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriodTo==null?"\\N":"" + fdtmFilingPeriodTo, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKeyFrom = null; } else {
      this.flngAccountKeyFrom = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKeyFrom = null; } else {
      this.flngReturnKeyFrom = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodFrom = null; } else {
      this.fdtmFilingPeriodFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKeyTo = null; } else {
      this.flngAccountKeyTo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKeyTo = null; } else {
      this.flngReturnKeyTo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodTo = null; } else {
      this.fdtmFilingPeriodTo = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKeyFrom = null; } else {
      this.flngAccountKeyFrom = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKeyFrom = null; } else {
      this.flngReturnKeyFrom = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodFrom = null; } else {
      this.fdtmFilingPeriodFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKeyTo = null; } else {
      this.flngAccountKeyTo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKeyTo = null; } else {
      this.flngReturnKeyTo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriodTo = null; } else {
      this.fdtmFilingPeriodTo = java.sql.Timestamp.valueOf(__cur_str);
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
    tblreturntransfer o = (tblreturntransfer) super.clone();
    o.fdtmFilingPeriodFrom = (o.fdtmFilingPeriodFrom != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodFrom.clone() : null;
    o.fdtmFilingPeriodTo = (o.fdtmFilingPeriodTo != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblreturntransfer o) throws CloneNotSupportedException {
    o.fdtmFilingPeriodFrom = (o.fdtmFilingPeriodFrom != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodFrom.clone() : null;
    o.fdtmFilingPeriodTo = (o.fdtmFilingPeriodTo != null) ? (java.sql.Timestamp) o.fdtmFilingPeriodTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("flngAccountKeyFrom", this.flngAccountKeyFrom);
    __sqoop$field_map.put("flngReturnKeyFrom", this.flngReturnKeyFrom);
    __sqoop$field_map.put("fdtmFilingPeriodFrom", this.fdtmFilingPeriodFrom);
    __sqoop$field_map.put("flngAccountKeyTo", this.flngAccountKeyTo);
    __sqoop$field_map.put("flngReturnKeyTo", this.flngReturnKeyTo);
    __sqoop$field_map.put("fdtmFilingPeriodTo", this.fdtmFilingPeriodTo);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("flngAccountKeyFrom", this.flngAccountKeyFrom);
    __sqoop$field_map.put("flngReturnKeyFrom", this.flngReturnKeyFrom);
    __sqoop$field_map.put("fdtmFilingPeriodFrom", this.fdtmFilingPeriodFrom);
    __sqoop$field_map.put("flngAccountKeyTo", this.flngAccountKeyTo);
    __sqoop$field_map.put("flngReturnKeyTo", this.flngReturnKeyTo);
    __sqoop$field_map.put("fdtmFilingPeriodTo", this.fdtmFilingPeriodTo);
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
