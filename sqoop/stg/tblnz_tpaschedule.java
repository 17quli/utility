// ORM class for table 'tblnz_tpaschedule'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:02:10 NZDT 2020
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

public class tblnz_tpaschedule extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTPAKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.flngTPAKey = (Integer)value;
      }
    });
    setters.put("flngSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.flngSequence = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fstrName = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmDeleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fdtmDeleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpaschedule.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_tpaschedule() {
    init0();
  }
  private Integer flngTPAKey;
  public Integer get_flngTPAKey() {
    return flngTPAKey;
  }
  public void set_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
  }
  public tblnz_tpaschedule with_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
    return this;
  }
  private Integer flngSequence;
  public Integer get_flngSequence() {
    return flngSequence;
  }
  public void set_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
  }
  public tblnz_tpaschedule with_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_tpaschedule with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblnz_tpaschedule with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_tpaschedule with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_tpaschedule with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.sql.Timestamp fdtmDeleted;
  public java.sql.Timestamp get_fdtmDeleted() {
    return fdtmDeleted;
  }
  public void set_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
  }
  public tblnz_tpaschedule with_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_tpaschedule with_fstrWho(String fstrWho) {
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
  public tblnz_tpaschedule with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpaschedule)) {
      return false;
    }
    tblnz_tpaschedule that = (tblnz_tpaschedule) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpaschedule)) {
      return false;
    }
    tblnz_tpaschedule that = (tblnz_tpaschedule) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTPAKey = null;
    } else {
    this.flngTPAKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSequence = null;
    } else {
    this.flngSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeleted = null;
    } else {
    this.fdtmDeleted = new Timestamp(__dataIn.readLong());
    this.fdtmDeleted.setNanos(__dataIn.readInt());
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_tpaschedule o = (tblnz_tpaschedule) super.clone();
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_tpaschedule o) throws CloneNotSupportedException {
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
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
