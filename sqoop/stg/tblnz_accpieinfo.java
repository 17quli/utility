// ORM class for table 'tblnz_accpieinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:10:11 NZDT 2020
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

public class tblnz_accpieinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrPIEType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fstrPIEType = (String)value;
      }
    });
    setters.put("fstrFilingOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fstrFilingOption = (String)value;
      }
    });
    setters.put("fstrAttributionPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fstrAttributionPeriod = (String)value;
      }
    });
    setters.put("fstrFDRCalcPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fstrFDRCalcPeriod = (String)value;
      }
    });
    setters.put("fblnFilingReqExemption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fblnFilingReqExemption = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpieinfo.this.fblnConverted = (Integer)value;
      }
    });
  }
  public tblnz_accpieinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accpieinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrPIEType;
  public String get_fstrPIEType() {
    return fstrPIEType;
  }
  public void set_fstrPIEType(String fstrPIEType) {
    this.fstrPIEType = fstrPIEType;
  }
  public tblnz_accpieinfo with_fstrPIEType(String fstrPIEType) {
    this.fstrPIEType = fstrPIEType;
    return this;
  }
  private String fstrFilingOption;
  public String get_fstrFilingOption() {
    return fstrFilingOption;
  }
  public void set_fstrFilingOption(String fstrFilingOption) {
    this.fstrFilingOption = fstrFilingOption;
  }
  public tblnz_accpieinfo with_fstrFilingOption(String fstrFilingOption) {
    this.fstrFilingOption = fstrFilingOption;
    return this;
  }
  private String fstrAttributionPeriod;
  public String get_fstrAttributionPeriod() {
    return fstrAttributionPeriod;
  }
  public void set_fstrAttributionPeriod(String fstrAttributionPeriod) {
    this.fstrAttributionPeriod = fstrAttributionPeriod;
  }
  public tblnz_accpieinfo with_fstrAttributionPeriod(String fstrAttributionPeriod) {
    this.fstrAttributionPeriod = fstrAttributionPeriod;
    return this;
  }
  private String fstrFDRCalcPeriod;
  public String get_fstrFDRCalcPeriod() {
    return fstrFDRCalcPeriod;
  }
  public void set_fstrFDRCalcPeriod(String fstrFDRCalcPeriod) {
    this.fstrFDRCalcPeriod = fstrFDRCalcPeriod;
  }
  public tblnz_accpieinfo with_fstrFDRCalcPeriod(String fstrFDRCalcPeriod) {
    this.fstrFDRCalcPeriod = fstrFDRCalcPeriod;
    return this;
  }
  private Integer fblnFilingReqExemption;
  public Integer get_fblnFilingReqExemption() {
    return fblnFilingReqExemption;
  }
  public void set_fblnFilingReqExemption(Integer fblnFilingReqExemption) {
    this.fblnFilingReqExemption = fblnFilingReqExemption;
  }
  public tblnz_accpieinfo with_fblnFilingReqExemption(Integer fblnFilingReqExemption) {
    this.fblnFilingReqExemption = fblnFilingReqExemption;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accpieinfo with_fstrWho(String fstrWho) {
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
  public tblnz_accpieinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private Integer fblnConverted;
  public Integer get_fblnConverted() {
    return fblnConverted;
  }
  public void set_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
  }
  public tblnz_accpieinfo with_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accpieinfo)) {
      return false;
    }
    tblnz_accpieinfo that = (tblnz_accpieinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrPIEType == null ? that.fstrPIEType == null : this.fstrPIEType.equals(that.fstrPIEType));
    equal = equal && (this.fstrFilingOption == null ? that.fstrFilingOption == null : this.fstrFilingOption.equals(that.fstrFilingOption));
    equal = equal && (this.fstrAttributionPeriod == null ? that.fstrAttributionPeriod == null : this.fstrAttributionPeriod.equals(that.fstrAttributionPeriod));
    equal = equal && (this.fstrFDRCalcPeriod == null ? that.fstrFDRCalcPeriod == null : this.fstrFDRCalcPeriod.equals(that.fstrFDRCalcPeriod));
    equal = equal && (this.fblnFilingReqExemption == null ? that.fblnFilingReqExemption == null : this.fblnFilingReqExemption.equals(that.fblnFilingReqExemption));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accpieinfo)) {
      return false;
    }
    tblnz_accpieinfo that = (tblnz_accpieinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrPIEType == null ? that.fstrPIEType == null : this.fstrPIEType.equals(that.fstrPIEType));
    equal = equal && (this.fstrFilingOption == null ? that.fstrFilingOption == null : this.fstrFilingOption.equals(that.fstrFilingOption));
    equal = equal && (this.fstrAttributionPeriod == null ? that.fstrAttributionPeriod == null : this.fstrAttributionPeriod.equals(that.fstrAttributionPeriod));
    equal = equal && (this.fstrFDRCalcPeriod == null ? that.fstrFDRCalcPeriod == null : this.fstrFDRCalcPeriod.equals(that.fstrFDRCalcPeriod));
    equal = equal && (this.fblnFilingReqExemption == null ? that.fblnFilingReqExemption == null : this.fblnFilingReqExemption.equals(that.fblnFilingReqExemption));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrPIEType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrFilingOption = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAttributionPeriod = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFDRCalcPeriod = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnFilingReqExemption = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrPIEType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrFilingOption = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAttributionPeriod = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFDRCalcPeriod = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnFilingReqExemption = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(9, __dbResults);
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
    JdbcWritableBridge.writeString(fstrPIEType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingOption, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttributionPeriod, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFDRCalcPeriod, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFilingReqExemption, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 9 + __off, -6, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIEType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingOption, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttributionPeriod, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFDRCalcPeriod, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFilingReqExemption, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 9 + __off, -6, __dbStmt);
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
        this.fstrPIEType = null;
    } else {
    this.fstrPIEType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingOption = null;
    } else {
    this.fstrFilingOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttributionPeriod = null;
    } else {
    this.fstrAttributionPeriod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFDRCalcPeriod = null;
    } else {
    this.fstrFDRCalcPeriod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFilingReqExemption = null;
    } else {
    this.fblnFilingReqExemption = Integer.valueOf(__dataIn.readInt());
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
    if (__dataIn.readBoolean()) { 
        this.fblnConverted = null;
    } else {
    this.fblnConverted = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrPIEType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEType);
    }
    if (null == this.fstrFilingOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingOption);
    }
    if (null == this.fstrAttributionPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttributionPeriod);
    }
    if (null == this.fstrFDRCalcPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFDRCalcPeriod);
    }
    if (null == this.fblnFilingReqExemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFilingReqExemption);
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
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrPIEType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIEType);
    }
    if (null == this.fstrFilingOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingOption);
    }
    if (null == this.fstrAttributionPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttributionPeriod);
    }
    if (null == this.fstrFDRCalcPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFDRCalcPeriod);
    }
    if (null == this.fblnFilingReqExemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFilingReqExemption);
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
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEType==null?"\\N":fstrPIEType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingOption==null?"\\N":fstrFilingOption, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttributionPeriod==null?"\\N":fstrAttributionPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFDRCalcPeriod==null?"\\N":fstrFDRCalcPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFilingReqExemption==null?"\\N":"" + fblnFilingReqExemption, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIEType==null?"\\N":fstrPIEType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingOption==null?"\\N":fstrFilingOption, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttributionPeriod==null?"\\N":fstrAttributionPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFDRCalcPeriod==null?"\\N":fstrFDRCalcPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFilingReqExemption==null?"\\N":"" + fblnFilingReqExemption, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrPIEType = null; } else {
      this.fstrPIEType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingOption = null; } else {
      this.fstrFilingOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttributionPeriod = null; } else {
      this.fstrAttributionPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFDRCalcPeriod = null; } else {
      this.fstrFDRCalcPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFilingReqExemption = null; } else {
      this.fblnFilingReqExemption = Integer.valueOf(__cur_str);
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPIEType = null; } else {
      this.fstrPIEType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingOption = null; } else {
      this.fstrFilingOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttributionPeriod = null; } else {
      this.fstrAttributionPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFDRCalcPeriod = null; } else {
      this.fstrFDRCalcPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFilingReqExemption = null; } else {
      this.fblnFilingReqExemption = Integer.valueOf(__cur_str);
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_accpieinfo o = (tblnz_accpieinfo) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accpieinfo o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrPIEType", this.fstrPIEType);
    __sqoop$field_map.put("fstrFilingOption", this.fstrFilingOption);
    __sqoop$field_map.put("fstrAttributionPeriod", this.fstrAttributionPeriod);
    __sqoop$field_map.put("fstrFDRCalcPeriod", this.fstrFDRCalcPeriod);
    __sqoop$field_map.put("fblnFilingReqExemption", this.fblnFilingReqExemption);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrPIEType", this.fstrPIEType);
    __sqoop$field_map.put("fstrFilingOption", this.fstrFilingOption);
    __sqoop$field_map.put("fstrAttributionPeriod", this.fstrAttributionPeriod);
    __sqoop$field_map.put("fstrFDRCalcPeriod", this.fstrFDRCalcPeriod);
    __sqoop$field_map.put("fblnFilingReqExemption", this.fblnFilingReqExemption);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
