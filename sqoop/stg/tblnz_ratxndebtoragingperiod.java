// ORM class for table 'tblnz_ratxndebtoragingperiod'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:48:24 NZDT 2020
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

public class tblnz_ratxndebtoragingperiod extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmInitialAgingDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fdtmInitialAgingDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastEvaluated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fdtmLastEvaluated = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngDaysAged", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.flngDaysAged = (Integer)value;
      }
    });
    setters.put("fstrAgingCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fstrAgingCategory = (String)value;
      }
    });
    setters.put("fblnDebtorBalanceExists", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fblnDebtorBalanceExists = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingperiod.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ratxndebtoragingperiod() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_ratxndebtoragingperiod with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_ratxndebtoragingperiod with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmInitialAgingDate;
  public java.sql.Timestamp get_fdtmInitialAgingDate() {
    return fdtmInitialAgingDate;
  }
  public void set_fdtmInitialAgingDate(java.sql.Timestamp fdtmInitialAgingDate) {
    this.fdtmInitialAgingDate = fdtmInitialAgingDate;
  }
  public tblnz_ratxndebtoragingperiod with_fdtmInitialAgingDate(java.sql.Timestamp fdtmInitialAgingDate) {
    this.fdtmInitialAgingDate = fdtmInitialAgingDate;
    return this;
  }
  private java.sql.Timestamp fdtmLastEvaluated;
  public java.sql.Timestamp get_fdtmLastEvaluated() {
    return fdtmLastEvaluated;
  }
  public void set_fdtmLastEvaluated(java.sql.Timestamp fdtmLastEvaluated) {
    this.fdtmLastEvaluated = fdtmLastEvaluated;
  }
  public tblnz_ratxndebtoragingperiod with_fdtmLastEvaluated(java.sql.Timestamp fdtmLastEvaluated) {
    this.fdtmLastEvaluated = fdtmLastEvaluated;
    return this;
  }
  private Integer flngDaysAged;
  public Integer get_flngDaysAged() {
    return flngDaysAged;
  }
  public void set_flngDaysAged(Integer flngDaysAged) {
    this.flngDaysAged = flngDaysAged;
  }
  public tblnz_ratxndebtoragingperiod with_flngDaysAged(Integer flngDaysAged) {
    this.flngDaysAged = flngDaysAged;
    return this;
  }
  private String fstrAgingCategory;
  public String get_fstrAgingCategory() {
    return fstrAgingCategory;
  }
  public void set_fstrAgingCategory(String fstrAgingCategory) {
    this.fstrAgingCategory = fstrAgingCategory;
  }
  public tblnz_ratxndebtoragingperiod with_fstrAgingCategory(String fstrAgingCategory) {
    this.fstrAgingCategory = fstrAgingCategory;
    return this;
  }
  private Integer fblnDebtorBalanceExists;
  public Integer get_fblnDebtorBalanceExists() {
    return fblnDebtorBalanceExists;
  }
  public void set_fblnDebtorBalanceExists(Integer fblnDebtorBalanceExists) {
    this.fblnDebtorBalanceExists = fblnDebtorBalanceExists;
  }
  public tblnz_ratxndebtoragingperiod with_fblnDebtorBalanceExists(Integer fblnDebtorBalanceExists) {
    this.fblnDebtorBalanceExists = fblnDebtorBalanceExists;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ratxndebtoragingperiod with_fstrWho(String fstrWho) {
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
  public tblnz_ratxndebtoragingperiod with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ratxndebtoragingperiod)) {
      return false;
    }
    tblnz_ratxndebtoragingperiod that = (tblnz_ratxndebtoragingperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmInitialAgingDate == null ? that.fdtmInitialAgingDate == null : this.fdtmInitialAgingDate.equals(that.fdtmInitialAgingDate));
    equal = equal && (this.fdtmLastEvaluated == null ? that.fdtmLastEvaluated == null : this.fdtmLastEvaluated.equals(that.fdtmLastEvaluated));
    equal = equal && (this.flngDaysAged == null ? that.flngDaysAged == null : this.flngDaysAged.equals(that.flngDaysAged));
    equal = equal && (this.fstrAgingCategory == null ? that.fstrAgingCategory == null : this.fstrAgingCategory.equals(that.fstrAgingCategory));
    equal = equal && (this.fblnDebtorBalanceExists == null ? that.fblnDebtorBalanceExists == null : this.fblnDebtorBalanceExists.equals(that.fblnDebtorBalanceExists));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ratxndebtoragingperiod)) {
      return false;
    }
    tblnz_ratxndebtoragingperiod that = (tblnz_ratxndebtoragingperiod) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmInitialAgingDate == null ? that.fdtmInitialAgingDate == null : this.fdtmInitialAgingDate.equals(that.fdtmInitialAgingDate));
    equal = equal && (this.fdtmLastEvaluated == null ? that.fdtmLastEvaluated == null : this.fdtmLastEvaluated.equals(that.fdtmLastEvaluated));
    equal = equal && (this.flngDaysAged == null ? that.flngDaysAged == null : this.flngDaysAged.equals(that.flngDaysAged));
    equal = equal && (this.fstrAgingCategory == null ? that.fstrAgingCategory == null : this.fstrAgingCategory.equals(that.fstrAgingCategory));
    equal = equal && (this.fblnDebtorBalanceExists == null ? that.fblnDebtorBalanceExists == null : this.fblnDebtorBalanceExists.equals(that.fblnDebtorBalanceExists));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmInitialAgingDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmLastEvaluated = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.flngDaysAged = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrAgingCategory = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnDebtorBalanceExists = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmInitialAgingDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmLastEvaluated = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.flngDaysAged = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrAgingCategory = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnDebtorBalanceExists = JdbcWritableBridge.readInteger(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInitialAgingDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastEvaluated, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDaysAged, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgingCategory, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDebtorBalanceExists, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInitialAgingDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastEvaluated, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDaysAged, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgingCategory, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDebtorBalanceExists, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
        this.fdtmInitialAgingDate = null;
    } else {
    this.fdtmInitialAgingDate = new Timestamp(__dataIn.readLong());
    this.fdtmInitialAgingDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastEvaluated = null;
    } else {
    this.fdtmLastEvaluated = new Timestamp(__dataIn.readLong());
    this.fdtmLastEvaluated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDaysAged = null;
    } else {
    this.flngDaysAged = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAgingCategory = null;
    } else {
    this.fstrAgingCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDebtorBalanceExists = null;
    } else {
    this.fblnDebtorBalanceExists = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fdtmInitialAgingDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInitialAgingDate.getTime());
    __dataOut.writeInt(this.fdtmInitialAgingDate.getNanos());
    }
    if (null == this.fdtmLastEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastEvaluated.getTime());
    __dataOut.writeInt(this.fdtmLastEvaluated.getNanos());
    }
    if (null == this.flngDaysAged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDaysAged);
    }
    if (null == this.fstrAgingCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgingCategory);
    }
    if (null == this.fblnDebtorBalanceExists) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDebtorBalanceExists);
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
    if (null == this.fdtmInitialAgingDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInitialAgingDate.getTime());
    __dataOut.writeInt(this.fdtmInitialAgingDate.getNanos());
    }
    if (null == this.fdtmLastEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastEvaluated.getTime());
    __dataOut.writeInt(this.fdtmLastEvaluated.getNanos());
    }
    if (null == this.flngDaysAged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDaysAged);
    }
    if (null == this.fstrAgingCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgingCategory);
    }
    if (null == this.fblnDebtorBalanceExists) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDebtorBalanceExists);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInitialAgingDate==null?"\\N":"" + fdtmInitialAgingDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastEvaluated==null?"\\N":"" + fdtmLastEvaluated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDaysAged==null?"\\N":"" + flngDaysAged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgingCategory==null?"\\N":fstrAgingCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDebtorBalanceExists==null?"\\N":"" + fblnDebtorBalanceExists, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInitialAgingDate==null?"\\N":"" + fdtmInitialAgingDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastEvaluated==null?"\\N":"" + fdtmLastEvaluated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDaysAged==null?"\\N":"" + flngDaysAged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgingCategory==null?"\\N":fstrAgingCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDebtorBalanceExists==null?"\\N":"" + fblnDebtorBalanceExists, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInitialAgingDate = null; } else {
      this.fdtmInitialAgingDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastEvaluated = null; } else {
      this.fdtmLastEvaluated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDaysAged = null; } else {
      this.flngDaysAged = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgingCategory = null; } else {
      this.fstrAgingCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDebtorBalanceExists = null; } else {
      this.fblnDebtorBalanceExists = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInitialAgingDate = null; } else {
      this.fdtmInitialAgingDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastEvaluated = null; } else {
      this.fdtmLastEvaluated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDaysAged = null; } else {
      this.flngDaysAged = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgingCategory = null; } else {
      this.fstrAgingCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDebtorBalanceExists = null; } else {
      this.fblnDebtorBalanceExists = Integer.valueOf(__cur_str);
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
    tblnz_ratxndebtoragingperiod o = (tblnz_ratxndebtoragingperiod) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmInitialAgingDate = (o.fdtmInitialAgingDate != null) ? (java.sql.Timestamp) o.fdtmInitialAgingDate.clone() : null;
    o.fdtmLastEvaluated = (o.fdtmLastEvaluated != null) ? (java.sql.Timestamp) o.fdtmLastEvaluated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ratxndebtoragingperiod o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmInitialAgingDate = (o.fdtmInitialAgingDate != null) ? (java.sql.Timestamp) o.fdtmInitialAgingDate.clone() : null;
    o.fdtmLastEvaluated = (o.fdtmLastEvaluated != null) ? (java.sql.Timestamp) o.fdtmLastEvaluated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmInitialAgingDate", this.fdtmInitialAgingDate);
    __sqoop$field_map.put("fdtmLastEvaluated", this.fdtmLastEvaluated);
    __sqoop$field_map.put("flngDaysAged", this.flngDaysAged);
    __sqoop$field_map.put("fstrAgingCategory", this.fstrAgingCategory);
    __sqoop$field_map.put("fblnDebtorBalanceExists", this.fblnDebtorBalanceExists);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmInitialAgingDate", this.fdtmInitialAgingDate);
    __sqoop$field_map.put("fdtmLastEvaluated", this.fdtmLastEvaluated);
    __sqoop$field_map.put("flngDaysAged", this.flngDaysAged);
    __sqoop$field_map.put("fstrAgingCategory", this.fstrAgingCategory);
    __sqoop$field_map.put("fblnDebtorBalanceExists", this.fblnDebtorBalanceExists);
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
