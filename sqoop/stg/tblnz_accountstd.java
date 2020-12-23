// ORM class for table 'tblnz_accountstd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:08:50 NZDT 2020
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

public class tblnz_accountstd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnUnpoliced", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fblnUnpoliced = (Integer)value;
      }
    });
    setters.put("fintSMSCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fintSMSCountryCode = (Integer)value;
      }
    });
    setters.put("fstrSMSAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fstrSMSAreaCode = (String)value;
      }
    });
    setters.put("fstrSMSPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fstrSMSPhoneNumber = (String)value;
      }
    });
    setters.put("fblnPublish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fblnPublish = (Integer)value;
      }
    });
    setters.put("fintHeritageLocationNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fintHeritageLocationNumber = (Integer)value;
      }
    });
    setters.put("fdtmReopened", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fdtmReopened = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accountstd.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accountstd() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accountstd with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnUnpoliced;
  public Integer get_fblnUnpoliced() {
    return fblnUnpoliced;
  }
  public void set_fblnUnpoliced(Integer fblnUnpoliced) {
    this.fblnUnpoliced = fblnUnpoliced;
  }
  public tblnz_accountstd with_fblnUnpoliced(Integer fblnUnpoliced) {
    this.fblnUnpoliced = fblnUnpoliced;
    return this;
  }
  private Integer fintSMSCountryCode;
  public Integer get_fintSMSCountryCode() {
    return fintSMSCountryCode;
  }
  public void set_fintSMSCountryCode(Integer fintSMSCountryCode) {
    this.fintSMSCountryCode = fintSMSCountryCode;
  }
  public tblnz_accountstd with_fintSMSCountryCode(Integer fintSMSCountryCode) {
    this.fintSMSCountryCode = fintSMSCountryCode;
    return this;
  }
  private String fstrSMSAreaCode;
  public String get_fstrSMSAreaCode() {
    return fstrSMSAreaCode;
  }
  public void set_fstrSMSAreaCode(String fstrSMSAreaCode) {
    this.fstrSMSAreaCode = fstrSMSAreaCode;
  }
  public tblnz_accountstd with_fstrSMSAreaCode(String fstrSMSAreaCode) {
    this.fstrSMSAreaCode = fstrSMSAreaCode;
    return this;
  }
  private String fstrSMSPhoneNumber;
  public String get_fstrSMSPhoneNumber() {
    return fstrSMSPhoneNumber;
  }
  public void set_fstrSMSPhoneNumber(String fstrSMSPhoneNumber) {
    this.fstrSMSPhoneNumber = fstrSMSPhoneNumber;
  }
  public tblnz_accountstd with_fstrSMSPhoneNumber(String fstrSMSPhoneNumber) {
    this.fstrSMSPhoneNumber = fstrSMSPhoneNumber;
    return this;
  }
  private Integer fblnPublish;
  public Integer get_fblnPublish() {
    return fblnPublish;
  }
  public void set_fblnPublish(Integer fblnPublish) {
    this.fblnPublish = fblnPublish;
  }
  public tblnz_accountstd with_fblnPublish(Integer fblnPublish) {
    this.fblnPublish = fblnPublish;
    return this;
  }
  private Integer fintHeritageLocationNumber;
  public Integer get_fintHeritageLocationNumber() {
    return fintHeritageLocationNumber;
  }
  public void set_fintHeritageLocationNumber(Integer fintHeritageLocationNumber) {
    this.fintHeritageLocationNumber = fintHeritageLocationNumber;
  }
  public tblnz_accountstd with_fintHeritageLocationNumber(Integer fintHeritageLocationNumber) {
    this.fintHeritageLocationNumber = fintHeritageLocationNumber;
    return this;
  }
  private java.sql.Timestamp fdtmReopened;
  public java.sql.Timestamp get_fdtmReopened() {
    return fdtmReopened;
  }
  public void set_fdtmReopened(java.sql.Timestamp fdtmReopened) {
    this.fdtmReopened = fdtmReopened;
  }
  public tblnz_accountstd with_fdtmReopened(java.sql.Timestamp fdtmReopened) {
    this.fdtmReopened = fdtmReopened;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accountstd with_fstrWho(String fstrWho) {
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
  public tblnz_accountstd with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accountstd)) {
      return false;
    }
    tblnz_accountstd that = (tblnz_accountstd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnUnpoliced == null ? that.fblnUnpoliced == null : this.fblnUnpoliced.equals(that.fblnUnpoliced));
    equal = equal && (this.fintSMSCountryCode == null ? that.fintSMSCountryCode == null : this.fintSMSCountryCode.equals(that.fintSMSCountryCode));
    equal = equal && (this.fstrSMSAreaCode == null ? that.fstrSMSAreaCode == null : this.fstrSMSAreaCode.equals(that.fstrSMSAreaCode));
    equal = equal && (this.fstrSMSPhoneNumber == null ? that.fstrSMSPhoneNumber == null : this.fstrSMSPhoneNumber.equals(that.fstrSMSPhoneNumber));
    equal = equal && (this.fblnPublish == null ? that.fblnPublish == null : this.fblnPublish.equals(that.fblnPublish));
    equal = equal && (this.fintHeritageLocationNumber == null ? that.fintHeritageLocationNumber == null : this.fintHeritageLocationNumber.equals(that.fintHeritageLocationNumber));
    equal = equal && (this.fdtmReopened == null ? that.fdtmReopened == null : this.fdtmReopened.equals(that.fdtmReopened));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accountstd)) {
      return false;
    }
    tblnz_accountstd that = (tblnz_accountstd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnUnpoliced == null ? that.fblnUnpoliced == null : this.fblnUnpoliced.equals(that.fblnUnpoliced));
    equal = equal && (this.fintSMSCountryCode == null ? that.fintSMSCountryCode == null : this.fintSMSCountryCode.equals(that.fintSMSCountryCode));
    equal = equal && (this.fstrSMSAreaCode == null ? that.fstrSMSAreaCode == null : this.fstrSMSAreaCode.equals(that.fstrSMSAreaCode));
    equal = equal && (this.fstrSMSPhoneNumber == null ? that.fstrSMSPhoneNumber == null : this.fstrSMSPhoneNumber.equals(that.fstrSMSPhoneNumber));
    equal = equal && (this.fblnPublish == null ? that.fblnPublish == null : this.fblnPublish.equals(that.fblnPublish));
    equal = equal && (this.fintHeritageLocationNumber == null ? that.fintHeritageLocationNumber == null : this.fintHeritageLocationNumber.equals(that.fintHeritageLocationNumber));
    equal = equal && (this.fdtmReopened == null ? that.fdtmReopened == null : this.fdtmReopened.equals(that.fdtmReopened));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnUnpoliced = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintSMSCountryCode = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrSMSAreaCode = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSMSPhoneNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPublish = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintHeritageLocationNumber = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmReopened = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnUnpoliced = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintSMSCountryCode = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrSMSAreaCode = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSMSPhoneNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPublish = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintHeritageLocationNumber = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmReopened = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnpoliced, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSMSCountryCode, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSAreaCode, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSPhoneNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPublish, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageLocationNumber, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReopened, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnpoliced, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSMSCountryCode, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSAreaCode, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSPhoneNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPublish, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageLocationNumber, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReopened, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
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
        this.fblnUnpoliced = null;
    } else {
    this.fblnUnpoliced = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSMSCountryCode = null;
    } else {
    this.fintSMSCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSMSAreaCode = null;
    } else {
    this.fstrSMSAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSMSPhoneNumber = null;
    } else {
    this.fstrSMSPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPublish = null;
    } else {
    this.fblnPublish = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintHeritageLocationNumber = null;
    } else {
    this.fintHeritageLocationNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReopened = null;
    } else {
    this.fdtmReopened = new Timestamp(__dataIn.readLong());
    this.fdtmReopened.setNanos(__dataIn.readInt());
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
    if (null == this.fblnUnpoliced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnpoliced);
    }
    if (null == this.fintSMSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSMSCountryCode);
    }
    if (null == this.fstrSMSAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSAreaCode);
    }
    if (null == this.fstrSMSPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSPhoneNumber);
    }
    if (null == this.fblnPublish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPublish);
    }
    if (null == this.fintHeritageLocationNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageLocationNumber);
    }
    if (null == this.fdtmReopened) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReopened.getTime());
    __dataOut.writeInt(this.fdtmReopened.getNanos());
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
    if (null == this.fblnUnpoliced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnpoliced);
    }
    if (null == this.fintSMSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSMSCountryCode);
    }
    if (null == this.fstrSMSAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSAreaCode);
    }
    if (null == this.fstrSMSPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSPhoneNumber);
    }
    if (null == this.fblnPublish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPublish);
    }
    if (null == this.fintHeritageLocationNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageLocationNumber);
    }
    if (null == this.fdtmReopened) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReopened.getTime());
    __dataOut.writeInt(this.fdtmReopened.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnpoliced==null?"\\N":"" + fblnUnpoliced, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSMSCountryCode==null?"\\N":"" + fintSMSCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSAreaCode==null?"\\N":fstrSMSAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSPhoneNumber==null?"\\N":fstrSMSPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPublish==null?"\\N":"" + fblnPublish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageLocationNumber==null?"\\N":"" + fintHeritageLocationNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReopened==null?"\\N":"" + fdtmReopened, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnpoliced==null?"\\N":"" + fblnUnpoliced, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSMSCountryCode==null?"\\N":"" + fintSMSCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSAreaCode==null?"\\N":fstrSMSAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSPhoneNumber==null?"\\N":fstrSMSPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPublish==null?"\\N":"" + fblnPublish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageLocationNumber==null?"\\N":"" + fintHeritageLocationNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReopened==null?"\\N":"" + fdtmReopened, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnpoliced = null; } else {
      this.fblnUnpoliced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSMSCountryCode = null; } else {
      this.fintSMSCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSAreaCode = null; } else {
      this.fstrSMSAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSPhoneNumber = null; } else {
      this.fstrSMSPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPublish = null; } else {
      this.fblnPublish = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageLocationNumber = null; } else {
      this.fintHeritageLocationNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReopened = null; } else {
      this.fdtmReopened = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnpoliced = null; } else {
      this.fblnUnpoliced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSMSCountryCode = null; } else {
      this.fintSMSCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSAreaCode = null; } else {
      this.fstrSMSAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSPhoneNumber = null; } else {
      this.fstrSMSPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPublish = null; } else {
      this.fblnPublish = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageLocationNumber = null; } else {
      this.fintHeritageLocationNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReopened = null; } else {
      this.fdtmReopened = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_accountstd o = (tblnz_accountstd) super.clone();
    o.fdtmReopened = (o.fdtmReopened != null) ? (java.sql.Timestamp) o.fdtmReopened.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accountstd o) throws CloneNotSupportedException {
    o.fdtmReopened = (o.fdtmReopened != null) ? (java.sql.Timestamp) o.fdtmReopened.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnUnpoliced", this.fblnUnpoliced);
    __sqoop$field_map.put("fintSMSCountryCode", this.fintSMSCountryCode);
    __sqoop$field_map.put("fstrSMSAreaCode", this.fstrSMSAreaCode);
    __sqoop$field_map.put("fstrSMSPhoneNumber", this.fstrSMSPhoneNumber);
    __sqoop$field_map.put("fblnPublish", this.fblnPublish);
    __sqoop$field_map.put("fintHeritageLocationNumber", this.fintHeritageLocationNumber);
    __sqoop$field_map.put("fdtmReopened", this.fdtmReopened);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnUnpoliced", this.fblnUnpoliced);
    __sqoop$field_map.put("fintSMSCountryCode", this.fintSMSCountryCode);
    __sqoop$field_map.put("fstrSMSAreaCode", this.fstrSMSAreaCode);
    __sqoop$field_map.put("fstrSMSPhoneNumber", this.fstrSMSPhoneNumber);
    __sqoop$field_map.put("fblnPublish", this.fblnPublish);
    __sqoop$field_map.put("fintHeritageLocationNumber", this.fintHeritageLocationNumber);
    __sqoop$field_map.put("fdtmReopened", this.fdtmReopened);
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
