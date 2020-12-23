// ORM class for table 'DSS.RETURN_TYPES'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Dec 06 07:26:25 GMT 2020
// For connector: org.apache.sqoop.manager.OracleManager
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

public class DSS_RETURN_TYPES extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("RETURN_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.RETURN_TYPE = (String)value;
      }
    });
    setters.put("DATE_APPLIED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.DATE_APPLIED = (java.sql.Timestamp)value;
      }
    });
    setters.put("DESCRIPTION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.DESCRIPTION = (String)value;
      }
    });
    setters.put("DATE_CEASED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.DATE_CEASED = (java.sql.Timestamp)value;
      }
    });
    setters.put("TIMESTAMP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.TIMESTAMP = (java.sql.Timestamp)value;
      }
    });
    setters.put("VALIDATED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DSS_RETURN_TYPES.this.VALIDATED = (String)value;
      }
    });
  }
  public DSS_RETURN_TYPES() {
    init0();
  }
  private String RETURN_TYPE;
  public String get_RETURN_TYPE() {
    return RETURN_TYPE;
  }
  public void set_RETURN_TYPE(String RETURN_TYPE) {
    this.RETURN_TYPE = RETURN_TYPE;
  }
  public DSS_RETURN_TYPES with_RETURN_TYPE(String RETURN_TYPE) {
    this.RETURN_TYPE = RETURN_TYPE;
    return this;
  }
  private java.sql.Timestamp DATE_APPLIED;
  public java.sql.Timestamp get_DATE_APPLIED() {
    return DATE_APPLIED;
  }
  public void set_DATE_APPLIED(java.sql.Timestamp DATE_APPLIED) {
    this.DATE_APPLIED = DATE_APPLIED;
  }
  public DSS_RETURN_TYPES with_DATE_APPLIED(java.sql.Timestamp DATE_APPLIED) {
    this.DATE_APPLIED = DATE_APPLIED;
    return this;
  }
  private String DESCRIPTION;
  public String get_DESCRIPTION() {
    return DESCRIPTION;
  }
  public void set_DESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
  }
  public DSS_RETURN_TYPES with_DESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
    return this;
  }
  private java.sql.Timestamp DATE_CEASED;
  public java.sql.Timestamp get_DATE_CEASED() {
    return DATE_CEASED;
  }
  public void set_DATE_CEASED(java.sql.Timestamp DATE_CEASED) {
    this.DATE_CEASED = DATE_CEASED;
  }
  public DSS_RETURN_TYPES with_DATE_CEASED(java.sql.Timestamp DATE_CEASED) {
    this.DATE_CEASED = DATE_CEASED;
    return this;
  }
  private java.sql.Timestamp TIMESTAMP;
  public java.sql.Timestamp get_TIMESTAMP() {
    return TIMESTAMP;
  }
  public void set_TIMESTAMP(java.sql.Timestamp TIMESTAMP) {
    this.TIMESTAMP = TIMESTAMP;
  }
  public DSS_RETURN_TYPES with_TIMESTAMP(java.sql.Timestamp TIMESTAMP) {
    this.TIMESTAMP = TIMESTAMP;
    return this;
  }
  private String VALIDATED;
  public String get_VALIDATED() {
    return VALIDATED;
  }
  public void set_VALIDATED(String VALIDATED) {
    this.VALIDATED = VALIDATED;
  }
  public DSS_RETURN_TYPES with_VALIDATED(String VALIDATED) {
    this.VALIDATED = VALIDATED;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DSS_RETURN_TYPES)) {
      return false;
    }
    DSS_RETURN_TYPES that = (DSS_RETURN_TYPES) o;
    boolean equal = true;
    equal = equal && (this.RETURN_TYPE == null ? that.RETURN_TYPE == null : this.RETURN_TYPE.equals(that.RETURN_TYPE));
    equal = equal && (this.DATE_APPLIED == null ? that.DATE_APPLIED == null : this.DATE_APPLIED.equals(that.DATE_APPLIED));
    equal = equal && (this.DESCRIPTION == null ? that.DESCRIPTION == null : this.DESCRIPTION.equals(that.DESCRIPTION));
    equal = equal && (this.DATE_CEASED == null ? that.DATE_CEASED == null : this.DATE_CEASED.equals(that.DATE_CEASED));
    equal = equal && (this.TIMESTAMP == null ? that.TIMESTAMP == null : this.TIMESTAMP.equals(that.TIMESTAMP));
    equal = equal && (this.VALIDATED == null ? that.VALIDATED == null : this.VALIDATED.equals(that.VALIDATED));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DSS_RETURN_TYPES)) {
      return false;
    }
    DSS_RETURN_TYPES that = (DSS_RETURN_TYPES) o;
    boolean equal = true;
    equal = equal && (this.RETURN_TYPE == null ? that.RETURN_TYPE == null : this.RETURN_TYPE.equals(that.RETURN_TYPE));
    equal = equal && (this.DATE_APPLIED == null ? that.DATE_APPLIED == null : this.DATE_APPLIED.equals(that.DATE_APPLIED));
    equal = equal && (this.DESCRIPTION == null ? that.DESCRIPTION == null : this.DESCRIPTION.equals(that.DESCRIPTION));
    equal = equal && (this.DATE_CEASED == null ? that.DATE_CEASED == null : this.DATE_CEASED.equals(that.DATE_CEASED));
    equal = equal && (this.TIMESTAMP == null ? that.TIMESTAMP == null : this.TIMESTAMP.equals(that.TIMESTAMP));
    equal = equal && (this.VALIDATED == null ? that.VALIDATED == null : this.VALIDATED.equals(that.VALIDATED));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.RETURN_TYPE = JdbcWritableBridge.readString(1, __dbResults);
    this.DATE_APPLIED = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.DESCRIPTION = JdbcWritableBridge.readString(3, __dbResults);
    this.DATE_CEASED = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.TIMESTAMP = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.VALIDATED = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.RETURN_TYPE = JdbcWritableBridge.readString(1, __dbResults);
    this.DATE_APPLIED = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.DESCRIPTION = JdbcWritableBridge.readString(3, __dbResults);
    this.DATE_CEASED = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.TIMESTAMP = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.VALIDATED = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(RETURN_TYPE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATE_APPLIED, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(DESCRIPTION, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATE_CEASED, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TIMESTAMP, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(VALIDATED, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(RETURN_TYPE, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATE_APPLIED, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(DESCRIPTION, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DATE_CEASED, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TIMESTAMP, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(VALIDATED, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.RETURN_TYPE = null;
    } else {
    this.RETURN_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATE_APPLIED = null;
    } else {
    this.DATE_APPLIED = new Timestamp(__dataIn.readLong());
    this.DATE_APPLIED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DESCRIPTION = null;
    } else {
    this.DESCRIPTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATE_CEASED = null;
    } else {
    this.DATE_CEASED = new Timestamp(__dataIn.readLong());
    this.DATE_CEASED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TIMESTAMP = null;
    } else {
    this.TIMESTAMP = new Timestamp(__dataIn.readLong());
    this.TIMESTAMP.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VALIDATED = null;
    } else {
    this.VALIDATED = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.RETURN_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RETURN_TYPE);
    }
    if (null == this.DATE_APPLIED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATE_APPLIED.getTime());
    __dataOut.writeInt(this.DATE_APPLIED.getNanos());
    }
    if (null == this.DESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DESCRIPTION);
    }
    if (null == this.DATE_CEASED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATE_CEASED.getTime());
    __dataOut.writeInt(this.DATE_CEASED.getNanos());
    }
    if (null == this.TIMESTAMP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TIMESTAMP.getTime());
    __dataOut.writeInt(this.TIMESTAMP.getNanos());
    }
    if (null == this.VALIDATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VALIDATED);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.RETURN_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RETURN_TYPE);
    }
    if (null == this.DATE_APPLIED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATE_APPLIED.getTime());
    __dataOut.writeInt(this.DATE_APPLIED.getNanos());
    }
    if (null == this.DESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DESCRIPTION);
    }
    if (null == this.DATE_CEASED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DATE_CEASED.getTime());
    __dataOut.writeInt(this.DATE_CEASED.getNanos());
    }
    if (null == this.TIMESTAMP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TIMESTAMP.getTime());
    __dataOut.writeInt(this.TIMESTAMP.getNanos());
    }
    if (null == this.VALIDATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VALIDATED);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(RETURN_TYPE==null?"null":RETURN_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_APPLIED==null?"null":"" + DATE_APPLIED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DESCRIPTION==null?"null":DESCRIPTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_CEASED==null?"null":"" + DATE_CEASED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP==null?"null":"" + TIMESTAMP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALIDATED==null?"null":VALIDATED, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(RETURN_TYPE==null?"null":RETURN_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_APPLIED==null?"null":"" + DATE_APPLIED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DESCRIPTION==null?"null":DESCRIPTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATE_CEASED==null?"null":"" + DATE_CEASED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIMESTAMP==null?"null":"" + TIMESTAMP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALIDATED==null?"null":VALIDATED, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.RETURN_TYPE = null; } else {
      this.RETURN_TYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATE_APPLIED = null; } else {
      this.DATE_APPLIED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DESCRIPTION = null; } else {
      this.DESCRIPTION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATE_CEASED = null; } else {
      this.DATE_CEASED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TIMESTAMP = null; } else {
      this.TIMESTAMP = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VALIDATED = null; } else {
      this.VALIDATED = __cur_str;
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
    if (__cur_str.equals("null")) { this.RETURN_TYPE = null; } else {
      this.RETURN_TYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATE_APPLIED = null; } else {
      this.DATE_APPLIED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.DESCRIPTION = null; } else {
      this.DESCRIPTION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATE_CEASED = null; } else {
      this.DATE_CEASED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TIMESTAMP = null; } else {
      this.TIMESTAMP = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.VALIDATED = null; } else {
      this.VALIDATED = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    DSS_RETURN_TYPES o = (DSS_RETURN_TYPES) super.clone();
    o.DATE_APPLIED = (o.DATE_APPLIED != null) ? (java.sql.Timestamp) o.DATE_APPLIED.clone() : null;
    o.DATE_CEASED = (o.DATE_CEASED != null) ? (java.sql.Timestamp) o.DATE_CEASED.clone() : null;
    o.TIMESTAMP = (o.TIMESTAMP != null) ? (java.sql.Timestamp) o.TIMESTAMP.clone() : null;
    return o;
  }

  public void clone0(DSS_RETURN_TYPES o) throws CloneNotSupportedException {
    o.DATE_APPLIED = (o.DATE_APPLIED != null) ? (java.sql.Timestamp) o.DATE_APPLIED.clone() : null;
    o.DATE_CEASED = (o.DATE_CEASED != null) ? (java.sql.Timestamp) o.DATE_CEASED.clone() : null;
    o.TIMESTAMP = (o.TIMESTAMP != null) ? (java.sql.Timestamp) o.TIMESTAMP.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("RETURN_TYPE", this.RETURN_TYPE);
    __sqoop$field_map.put("DATE_APPLIED", this.DATE_APPLIED);
    __sqoop$field_map.put("DESCRIPTION", this.DESCRIPTION);
    __sqoop$field_map.put("DATE_CEASED", this.DATE_CEASED);
    __sqoop$field_map.put("TIMESTAMP", this.TIMESTAMP);
    __sqoop$field_map.put("VALIDATED", this.VALIDATED);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("RETURN_TYPE", this.RETURN_TYPE);
    __sqoop$field_map.put("DATE_APPLIED", this.DATE_APPLIED);
    __sqoop$field_map.put("DESCRIPTION", this.DESCRIPTION);
    __sqoop$field_map.put("DATE_CEASED", this.DATE_CEASED);
    __sqoop$field_map.put("TIMESTAMP", this.TIMESTAMP);
    __sqoop$field_map.put("VALIDATED", this.VALIDATED);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
