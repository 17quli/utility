// ORM class for table 'tblrecovery'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:07:58 NZDT 2020
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

public class tblrecovery extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRecoveryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.flngRecoveryKey = (Integer)value;
      }
    });
    setters.put("fstrRecoveryGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.fstrRecoveryGroup = (String)value;
      }
    });
    setters.put("flngParentKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.flngParentKey = (Integer)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("fdtmBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.fdtmBegin = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.fdtmEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrecovery.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblrecovery() {
    init0();
  }
  private Integer flngRecoveryKey;
  public Integer get_flngRecoveryKey() {
    return flngRecoveryKey;
  }
  public void set_flngRecoveryKey(Integer flngRecoveryKey) {
    this.flngRecoveryKey = flngRecoveryKey;
  }
  public tblrecovery with_flngRecoveryKey(Integer flngRecoveryKey) {
    this.flngRecoveryKey = flngRecoveryKey;
    return this;
  }
  private String fstrRecoveryGroup;
  public String get_fstrRecoveryGroup() {
    return fstrRecoveryGroup;
  }
  public void set_fstrRecoveryGroup(String fstrRecoveryGroup) {
    this.fstrRecoveryGroup = fstrRecoveryGroup;
  }
  public tblrecovery with_fstrRecoveryGroup(String fstrRecoveryGroup) {
    this.fstrRecoveryGroup = fstrRecoveryGroup;
    return this;
  }
  private Integer flngParentKey;
  public Integer get_flngParentKey() {
    return flngParentKey;
  }
  public void set_flngParentKey(Integer flngParentKey) {
    this.flngParentKey = flngParentKey;
  }
  public tblrecovery with_flngParentKey(Integer flngParentKey) {
    this.flngParentKey = flngParentKey;
    return this;
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tblrecovery with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private java.sql.Timestamp fdtmBegin;
  public java.sql.Timestamp get_fdtmBegin() {
    return fdtmBegin;
  }
  public void set_fdtmBegin(java.sql.Timestamp fdtmBegin) {
    this.fdtmBegin = fdtmBegin;
  }
  public tblrecovery with_fdtmBegin(java.sql.Timestamp fdtmBegin) {
    this.fdtmBegin = fdtmBegin;
    return this;
  }
  private java.sql.Timestamp fdtmEnd;
  public java.sql.Timestamp get_fdtmEnd() {
    return fdtmEnd;
  }
  public void set_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
  }
  public tblrecovery with_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblrecovery with_fstrWho(String fstrWho) {
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
  public tblrecovery with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrecovery)) {
      return false;
    }
    tblrecovery that = (tblrecovery) o;
    boolean equal = true;
    equal = equal && (this.flngRecoveryKey == null ? that.flngRecoveryKey == null : this.flngRecoveryKey.equals(that.flngRecoveryKey));
    equal = equal && (this.fstrRecoveryGroup == null ? that.fstrRecoveryGroup == null : this.fstrRecoveryGroup.equals(that.fstrRecoveryGroup));
    equal = equal && (this.flngParentKey == null ? that.flngParentKey == null : this.flngParentKey.equals(that.flngParentKey));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmBegin == null ? that.fdtmBegin == null : this.fdtmBegin.equals(that.fdtmBegin));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrecovery)) {
      return false;
    }
    tblrecovery that = (tblrecovery) o;
    boolean equal = true;
    equal = equal && (this.flngRecoveryKey == null ? that.flngRecoveryKey == null : this.flngRecoveryKey.equals(that.flngRecoveryKey));
    equal = equal && (this.fstrRecoveryGroup == null ? that.fstrRecoveryGroup == null : this.fstrRecoveryGroup.equals(that.fstrRecoveryGroup));
    equal = equal && (this.flngParentKey == null ? that.flngParentKey == null : this.flngParentKey.equals(that.flngParentKey));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmBegin == null ? that.fdtmBegin == null : this.fdtmBegin.equals(that.fdtmBegin));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRecoveryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecoveryGroup = JdbcWritableBridge.readString(2, __dbResults);
    this.flngParentKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmBegin = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRecoveryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecoveryGroup = JdbcWritableBridge.readString(2, __dbResults);
    this.flngParentKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmBegin = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeString(fstrRecoveryGroup, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBegin, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRecoveryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecoveryGroup, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBegin, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
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
        this.fstrRecoveryGroup = null;
    } else {
    this.fstrRecoveryGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngParentKey = null;
    } else {
    this.flngParentKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBegin = null;
    } else {
    this.fdtmBegin = new Timestamp(__dataIn.readLong());
    this.fdtmBegin.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEnd = null;
    } else {
    this.fdtmEnd = new Timestamp(__dataIn.readLong());
    this.fdtmEnd.setNanos(__dataIn.readInt());
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
    if (null == this.fstrRecoveryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryGroup);
    }
    if (null == this.flngParentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentKey);
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBegin.getTime());
    __dataOut.writeInt(this.fdtmBegin.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
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
    if (null == this.fstrRecoveryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryGroup);
    }
    if (null == this.flngParentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentKey);
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBegin.getTime());
    __dataOut.writeInt(this.fdtmBegin.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryGroup==null?"\\N":fstrRecoveryGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentKey==null?"\\N":"" + flngParentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBegin==null?"\\N":"" + fdtmBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryGroup==null?"\\N":fstrRecoveryGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentKey==null?"\\N":"" + flngParentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBegin==null?"\\N":"" + fdtmBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrRecoveryGroup = null; } else {
      this.fstrRecoveryGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentKey = null; } else {
      this.flngParentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBegin = null; } else {
      this.fdtmBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecoveryGroup = null; } else {
      this.fstrRecoveryGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentKey = null; } else {
      this.flngParentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBegin = null; } else {
      this.fdtmBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    tblrecovery o = (tblrecovery) super.clone();
    o.fdtmBegin = (o.fdtmBegin != null) ? (java.sql.Timestamp) o.fdtmBegin.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblrecovery o) throws CloneNotSupportedException {
    o.fdtmBegin = (o.fdtmBegin != null) ? (java.sql.Timestamp) o.fdtmBegin.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRecoveryKey", this.flngRecoveryKey);
    __sqoop$field_map.put("fstrRecoveryGroup", this.fstrRecoveryGroup);
    __sqoop$field_map.put("flngParentKey", this.flngParentKey);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmBegin", this.fdtmBegin);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRecoveryKey", this.flngRecoveryKey);
    __sqoop$field_map.put("fstrRecoveryGroup", this.fstrRecoveryGroup);
    __sqoop$field_map.put("flngParentKey", this.flngParentKey);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmBegin", this.fdtmBegin);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
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
