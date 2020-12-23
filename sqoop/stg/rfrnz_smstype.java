// ORM class for table 'rfrnz_smstype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:15:23 NZDT 2020
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

public class rfrnz_smstype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrSMSType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_smstype.this.fstrSMSType = (String)value;
      }
    });
    setters.put("fstrMessageKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_smstype.this.fstrMessageKey = (String)value;
      }
    });
    setters.put("fblnUrgent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_smstype.this.fblnUrgent = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_smstype.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrnz_smstype() {
    init0();
  }
  private String fstrSMSType;
  public String get_fstrSMSType() {
    return fstrSMSType;
  }
  public void set_fstrSMSType(String fstrSMSType) {
    this.fstrSMSType = fstrSMSType;
  }
  public rfrnz_smstype with_fstrSMSType(String fstrSMSType) {
    this.fstrSMSType = fstrSMSType;
    return this;
  }
  private String fstrMessageKey;
  public String get_fstrMessageKey() {
    return fstrMessageKey;
  }
  public void set_fstrMessageKey(String fstrMessageKey) {
    this.fstrMessageKey = fstrMessageKey;
  }
  public rfrnz_smstype with_fstrMessageKey(String fstrMessageKey) {
    this.fstrMessageKey = fstrMessageKey;
    return this;
  }
  private Integer fblnUrgent;
  public Integer get_fblnUrgent() {
    return fblnUrgent;
  }
  public void set_fblnUrgent(Integer fblnUrgent) {
    this.fblnUrgent = fblnUrgent;
  }
  public rfrnz_smstype with_fblnUrgent(Integer fblnUrgent) {
    this.fblnUrgent = fblnUrgent;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrnz_smstype with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_smstype)) {
      return false;
    }
    rfrnz_smstype that = (rfrnz_smstype) o;
    boolean equal = true;
    equal = equal && (this.fstrSMSType == null ? that.fstrSMSType == null : this.fstrSMSType.equals(that.fstrSMSType));
    equal = equal && (this.fstrMessageKey == null ? that.fstrMessageKey == null : this.fstrMessageKey.equals(that.fstrMessageKey));
    equal = equal && (this.fblnUrgent == null ? that.fblnUrgent == null : this.fblnUrgent.equals(that.fblnUrgent));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_smstype)) {
      return false;
    }
    rfrnz_smstype that = (rfrnz_smstype) o;
    boolean equal = true;
    equal = equal && (this.fstrSMSType == null ? that.fstrSMSType == null : this.fstrSMSType.equals(that.fstrSMSType));
    equal = equal && (this.fstrMessageKey == null ? that.fstrMessageKey == null : this.fstrMessageKey.equals(that.fstrMessageKey));
    equal = equal && (this.fblnUrgent == null ? that.fblnUrgent == null : this.fblnUrgent.equals(that.fblnUrgent));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrSMSType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrMessageKey = JdbcWritableBridge.readString(2, __dbResults);
    this.fblnUrgent = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrSMSType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrMessageKey = JdbcWritableBridge.readString(2, __dbResults);
    this.fblnUrgent = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(4, __dbResults);
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
    JdbcWritableBridge.writeString(fstrSMSType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMessageKey, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUrgent, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 4 + __off, -6, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrSMSType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMessageKey, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUrgent, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 4 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrSMSType = null;
    } else {
    this.fstrSMSType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMessageKey = null;
    } else {
    this.fstrMessageKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUrgent = null;
    } else {
    this.fblnUrgent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrSMSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSType);
    }
    if (null == this.fstrMessageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMessageKey);
    }
    if (null == this.fblnUrgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUrgent);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrSMSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSType);
    }
    if (null == this.fstrMessageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMessageKey);
    }
    if (null == this.fblnUrgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUrgent);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSType==null?"\\N":fstrSMSType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMessageKey==null?"\\N":fstrMessageKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUrgent==null?"\\N":"" + fblnUrgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSType==null?"\\N":fstrSMSType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMessageKey==null?"\\N":fstrMessageKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUrgent==null?"\\N":"" + fblnUrgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrSMSType = null; } else {
      this.fstrSMSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMessageKey = null; } else {
      this.fstrMessageKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUrgent = null; } else {
      this.fblnUrgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrSMSType = null; } else {
      this.fstrSMSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMessageKey = null; } else {
      this.fstrMessageKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUrgent = null; } else {
      this.fblnUrgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfrnz_smstype o = (rfrnz_smstype) super.clone();
    return o;
  }

  public void clone0(rfrnz_smstype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrSMSType", this.fstrSMSType);
    __sqoop$field_map.put("fstrMessageKey", this.fstrMessageKey);
    __sqoop$field_map.put("fblnUrgent", this.fblnUrgent);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrSMSType", this.fstrSMSType);
    __sqoop$field_map.put("fstrMessageKey", this.fstrMessageKey);
    __sqoop$field_map.put("fblnUrgent", this.fblnUrgent);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
