// ORM class for table 'tblnz_slsworldwideincome'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:04:08 NZDT 2020
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

public class tblnz_slsworldwideincome extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurWorldwideIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fcurWorldwideIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnZeroFiling", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fblnZeroFiling = (Integer)value;
      }
    });
    setters.put("fdtmDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fdtmDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slsworldwideincome.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_slsworldwideincome() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_slsworldwideincome with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_slsworldwideincome with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_slsworldwideincome with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.math.BigDecimal fcurWorldwideIncome;
  public java.math.BigDecimal get_fcurWorldwideIncome() {
    return fcurWorldwideIncome;
  }
  public void set_fcurWorldwideIncome(java.math.BigDecimal fcurWorldwideIncome) {
    this.fcurWorldwideIncome = fcurWorldwideIncome;
  }
  public tblnz_slsworldwideincome with_fcurWorldwideIncome(java.math.BigDecimal fcurWorldwideIncome) {
    this.fcurWorldwideIncome = fcurWorldwideIncome;
    return this;
  }
  private Integer fblnZeroFiling;
  public Integer get_fblnZeroFiling() {
    return fblnZeroFiling;
  }
  public void set_fblnZeroFiling(Integer fblnZeroFiling) {
    this.fblnZeroFiling = fblnZeroFiling;
  }
  public tblnz_slsworldwideincome with_fblnZeroFiling(Integer fblnZeroFiling) {
    this.fblnZeroFiling = fblnZeroFiling;
    return this;
  }
  private java.sql.Timestamp fdtmDue;
  public java.sql.Timestamp get_fdtmDue() {
    return fdtmDue;
  }
  public void set_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
  }
  public tblnz_slsworldwideincome with_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblnz_slsworldwideincome with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_slsworldwideincome with_fstrWho(String fstrWho) {
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
  public tblnz_slsworldwideincome with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_slsworldwideincome)) {
      return false;
    }
    tblnz_slsworldwideincome that = (tblnz_slsworldwideincome) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fcurWorldwideIncome == null ? that.fcurWorldwideIncome == null : this.fcurWorldwideIncome.equals(that.fcurWorldwideIncome));
    equal = equal && (this.fblnZeroFiling == null ? that.fblnZeroFiling == null : this.fblnZeroFiling.equals(that.fblnZeroFiling));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_slsworldwideincome)) {
      return false;
    }
    tblnz_slsworldwideincome that = (tblnz_slsworldwideincome) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fcurWorldwideIncome == null ? that.fcurWorldwideIncome == null : this.fcurWorldwideIncome.equals(that.fcurWorldwideIncome));
    equal = equal && (this.fblnZeroFiling == null ? that.fblnZeroFiling == null : this.fblnZeroFiling.equals(that.fblnZeroFiling));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurWorldwideIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fblnZeroFiling = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurWorldwideIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fblnZeroFiling = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWorldwideIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroFiling, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWorldwideIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroFiling, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
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
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWorldwideIncome = null;
    } else {
    this.fcurWorldwideIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnZeroFiling = null;
    } else {
    this.fblnZeroFiling = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDue = null;
    } else {
    this.fdtmDue = new Timestamp(__dataIn.readLong());
    this.fdtmDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fcurWorldwideIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWorldwideIncome, __dataOut);
    }
    if (null == this.fblnZeroFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroFiling);
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fcurWorldwideIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWorldwideIncome, __dataOut);
    }
    if (null == this.fblnZeroFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroFiling);
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWorldwideIncome==null?"\\N":fcurWorldwideIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroFiling==null?"\\N":"" + fblnZeroFiling, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWorldwideIncome==null?"\\N":fcurWorldwideIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroFiling==null?"\\N":"" + fblnZeroFiling, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWorldwideIncome = null; } else {
      this.fcurWorldwideIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroFiling = null; } else {
      this.fblnZeroFiling = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWorldwideIncome = null; } else {
      this.fcurWorldwideIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroFiling = null; } else {
      this.fblnZeroFiling = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_slsworldwideincome o = (tblnz_slsworldwideincome) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_slsworldwideincome o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fcurWorldwideIncome", this.fcurWorldwideIncome);
    __sqoop$field_map.put("fblnZeroFiling", this.fblnZeroFiling);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fcurWorldwideIncome", this.fcurWorldwideIncome);
    __sqoop$field_map.put("fblnZeroFiling", this.fblnZeroFiling);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
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
