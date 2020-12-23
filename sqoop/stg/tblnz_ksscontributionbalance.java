// ORM class for table 'tblnz_ksscontributionbalance'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:40:26 NZDT 2020
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

public class tblnz_ksscontributionbalance extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrContributionType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fstrContributionType = (String)value;
      }
    });
    setters.put("fintYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fintYear = (Integer)value;
      }
    });
    setters.put("fcurContributionBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fcurContributionBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmMinContributionDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fdtmMinContributionDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmNextEval", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fdtmNextEval = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontributionbalance.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksscontributionbalance() {
    init0();
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_ksscontributionbalance with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_ksscontributionbalance with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private String fstrContributionType;
  public String get_fstrContributionType() {
    return fstrContributionType;
  }
  public void set_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
  }
  public tblnz_ksscontributionbalance with_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
    return this;
  }
  private Integer fintYear;
  public Integer get_fintYear() {
    return fintYear;
  }
  public void set_fintYear(Integer fintYear) {
    this.fintYear = fintYear;
  }
  public tblnz_ksscontributionbalance with_fintYear(Integer fintYear) {
    this.fintYear = fintYear;
    return this;
  }
  private java.math.BigDecimal fcurContributionBalance;
  public java.math.BigDecimal get_fcurContributionBalance() {
    return fcurContributionBalance;
  }
  public void set_fcurContributionBalance(java.math.BigDecimal fcurContributionBalance) {
    this.fcurContributionBalance = fcurContributionBalance;
  }
  public tblnz_ksscontributionbalance with_fcurContributionBalance(java.math.BigDecimal fcurContributionBalance) {
    this.fcurContributionBalance = fcurContributionBalance;
    return this;
  }
  private java.sql.Timestamp fdtmMinContributionDate;
  public java.sql.Timestamp get_fdtmMinContributionDate() {
    return fdtmMinContributionDate;
  }
  public void set_fdtmMinContributionDate(java.sql.Timestamp fdtmMinContributionDate) {
    this.fdtmMinContributionDate = fdtmMinContributionDate;
  }
  public tblnz_ksscontributionbalance with_fdtmMinContributionDate(java.sql.Timestamp fdtmMinContributionDate) {
    this.fdtmMinContributionDate = fdtmMinContributionDate;
    return this;
  }
  private java.sql.Timestamp fdtmNextEval;
  public java.sql.Timestamp get_fdtmNextEval() {
    return fdtmNextEval;
  }
  public void set_fdtmNextEval(java.sql.Timestamp fdtmNextEval) {
    this.fdtmNextEval = fdtmNextEval;
  }
  public tblnz_ksscontributionbalance with_fdtmNextEval(java.sql.Timestamp fdtmNextEval) {
    this.fdtmNextEval = fdtmNextEval;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksscontributionbalance with_fstrWho(String fstrWho) {
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
  public tblnz_ksscontributionbalance with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontributionbalance)) {
      return false;
    }
    tblnz_ksscontributionbalance that = (tblnz_ksscontributionbalance) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fintYear == null ? that.fintYear == null : this.fintYear.equals(that.fintYear));
    equal = equal && (this.fcurContributionBalance == null ? that.fcurContributionBalance == null : this.fcurContributionBalance.equals(that.fcurContributionBalance));
    equal = equal && (this.fdtmMinContributionDate == null ? that.fdtmMinContributionDate == null : this.fdtmMinContributionDate.equals(that.fdtmMinContributionDate));
    equal = equal && (this.fdtmNextEval == null ? that.fdtmNextEval == null : this.fdtmNextEval.equals(that.fdtmNextEval));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontributionbalance)) {
      return false;
    }
    tblnz_ksscontributionbalance that = (tblnz_ksscontributionbalance) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fintYear == null ? that.fintYear == null : this.fintYear.equals(that.fintYear));
    equal = equal && (this.fcurContributionBalance == null ? that.fcurContributionBalance == null : this.fcurContributionBalance.equals(that.fcurContributionBalance));
    equal = equal && (this.fdtmMinContributionDate == null ? that.fdtmMinContributionDate == null : this.fdtmMinContributionDate.equals(that.fdtmMinContributionDate));
    equal = equal && (this.fdtmNextEval == null ? that.fdtmNextEval == null : this.fdtmNextEval.equals(that.fdtmNextEval));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(3, __dbResults);
    this.fintYear = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurContributionBalance = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdtmMinContributionDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmNextEval = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(3, __dbResults);
    this.fintYear = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurContributionBalance = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdtmMinContributionDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmNextEval = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintYear, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionBalance, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMinContributionDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextEval, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintYear, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionBalance, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMinContributionDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextEval, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContributionType = null;
    } else {
    this.fstrContributionType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintYear = null;
    } else {
    this.fintYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurContributionBalance = null;
    } else {
    this.fcurContributionBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmMinContributionDate = null;
    } else {
    this.fdtmMinContributionDate = new Timestamp(__dataIn.readLong());
    this.fdtmMinContributionDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextEval = null;
    } else {
    this.fdtmNextEval = new Timestamp(__dataIn.readLong());
    this.fdtmNextEval.setNanos(__dataIn.readInt());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fintYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintYear);
    }
    if (null == this.fcurContributionBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionBalance, __dataOut);
    }
    if (null == this.fdtmMinContributionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMinContributionDate.getTime());
    __dataOut.writeInt(this.fdtmMinContributionDate.getNanos());
    }
    if (null == this.fdtmNextEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextEval.getTime());
    __dataOut.writeInt(this.fdtmNextEval.getNanos());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fintYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintYear);
    }
    if (null == this.fcurContributionBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionBalance, __dataOut);
    }
    if (null == this.fdtmMinContributionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMinContributionDate.getTime());
    __dataOut.writeInt(this.fdtmMinContributionDate.getNanos());
    }
    if (null == this.fdtmNextEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextEval.getTime());
    __dataOut.writeInt(this.fdtmNextEval.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintYear==null?"\\N":"" + fintYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionBalance==null?"\\N":fcurContributionBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMinContributionDate==null?"\\N":"" + fdtmMinContributionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextEval==null?"\\N":"" + fdtmNextEval, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintYear==null?"\\N":"" + fintYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionBalance==null?"\\N":fcurContributionBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMinContributionDate==null?"\\N":"" + fdtmMinContributionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextEval==null?"\\N":"" + fdtmNextEval, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionBalance = null; } else {
      this.fcurContributionBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMinContributionDate = null; } else {
      this.fdtmMinContributionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextEval = null; } else {
      this.fdtmNextEval = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionBalance = null; } else {
      this.fcurContributionBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMinContributionDate = null; } else {
      this.fdtmMinContributionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextEval = null; } else {
      this.fdtmNextEval = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_ksscontributionbalance o = (tblnz_ksscontributionbalance) super.clone();
    o.fdtmMinContributionDate = (o.fdtmMinContributionDate != null) ? (java.sql.Timestamp) o.fdtmMinContributionDate.clone() : null;
    o.fdtmNextEval = (o.fdtmNextEval != null) ? (java.sql.Timestamp) o.fdtmNextEval.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksscontributionbalance o) throws CloneNotSupportedException {
    o.fdtmMinContributionDate = (o.fdtmMinContributionDate != null) ? (java.sql.Timestamp) o.fdtmMinContributionDate.clone() : null;
    o.fdtmNextEval = (o.fdtmNextEval != null) ? (java.sql.Timestamp) o.fdtmNextEval.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fintYear", this.fintYear);
    __sqoop$field_map.put("fcurContributionBalance", this.fcurContributionBalance);
    __sqoop$field_map.put("fdtmMinContributionDate", this.fdtmMinContributionDate);
    __sqoop$field_map.put("fdtmNextEval", this.fdtmNextEval);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fintYear", this.fintYear);
    __sqoop$field_map.put("fcurContributionBalance", this.fcurContributionBalance);
    __sqoop$field_map.put("fdtmMinContributionDate", this.fdtmMinContributionDate);
    __sqoop$field_map.put("fdtmNextEval", this.fdtmNextEval);
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
