// ORM class for table 'tblnz_studylinkout'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:19:23 NZDT 2020
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

public class tblnz_studylinkout extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64WebServiceGatewayOutKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkout.this.fi64WebServiceGatewayOutKey = (Long)value;
      }
    });
    setters.put("fstrRequestType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkout.this.fstrRequestType = (String)value;
      }
    });
    setters.put("fstrCorrelationID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkout.this.fstrCorrelationID = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkout.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_studylinkout.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_studylinkout() {
    init0();
  }
  private Long fi64WebServiceGatewayOutKey;
  public Long get_fi64WebServiceGatewayOutKey() {
    return fi64WebServiceGatewayOutKey;
  }
  public void set_fi64WebServiceGatewayOutKey(Long fi64WebServiceGatewayOutKey) {
    this.fi64WebServiceGatewayOutKey = fi64WebServiceGatewayOutKey;
  }
  public tblnz_studylinkout with_fi64WebServiceGatewayOutKey(Long fi64WebServiceGatewayOutKey) {
    this.fi64WebServiceGatewayOutKey = fi64WebServiceGatewayOutKey;
    return this;
  }
  private String fstrRequestType;
  public String get_fstrRequestType() {
    return fstrRequestType;
  }
  public void set_fstrRequestType(String fstrRequestType) {
    this.fstrRequestType = fstrRequestType;
  }
  public tblnz_studylinkout with_fstrRequestType(String fstrRequestType) {
    this.fstrRequestType = fstrRequestType;
    return this;
  }
  private String fstrCorrelationID;
  public String get_fstrCorrelationID() {
    return fstrCorrelationID;
  }
  public void set_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
  }
  public tblnz_studylinkout with_fstrCorrelationID(String fstrCorrelationID) {
    this.fstrCorrelationID = fstrCorrelationID;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_studylinkout with_fstrWho(String fstrWho) {
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
  public tblnz_studylinkout with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkout)) {
      return false;
    }
    tblnz_studylinkout that = (tblnz_studylinkout) o;
    boolean equal = true;
    equal = equal && (this.fi64WebServiceGatewayOutKey == null ? that.fi64WebServiceGatewayOutKey == null : this.fi64WebServiceGatewayOutKey.equals(that.fi64WebServiceGatewayOutKey));
    equal = equal && (this.fstrRequestType == null ? that.fstrRequestType == null : this.fstrRequestType.equals(that.fstrRequestType));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_studylinkout)) {
      return false;
    }
    tblnz_studylinkout that = (tblnz_studylinkout) o;
    boolean equal = true;
    equal = equal && (this.fi64WebServiceGatewayOutKey == null ? that.fi64WebServiceGatewayOutKey == null : this.fi64WebServiceGatewayOutKey.equals(that.fi64WebServiceGatewayOutKey));
    equal = equal && (this.fstrRequestType == null ? that.fstrRequestType == null : this.fstrRequestType.equals(that.fstrRequestType));
    equal = equal && (this.fstrCorrelationID == null ? that.fstrCorrelationID == null : this.fstrCorrelationID.equals(that.fstrCorrelationID));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64WebServiceGatewayOutKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrRequestType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64WebServiceGatewayOutKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrRequestType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrCorrelationID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(5, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64WebServiceGatewayOutKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 5 + __off, 93, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64WebServiceGatewayOutKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequestType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrelationID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 5 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64WebServiceGatewayOutKey = null;
    } else {
    this.fi64WebServiceGatewayOutKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRequestType = null;
    } else {
    this.fstrRequestType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCorrelationID = null;
    } else {
    this.fstrCorrelationID = Text.readString(__dataIn);
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
    if (null == this.fi64WebServiceGatewayOutKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64WebServiceGatewayOutKey);
    }
    if (null == this.fstrRequestType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestType);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
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
    if (null == this.fi64WebServiceGatewayOutKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64WebServiceGatewayOutKey);
    }
    if (null == this.fstrRequestType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequestType);
    }
    if (null == this.fstrCorrelationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrelationID);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64WebServiceGatewayOutKey==null?"\\N":"" + fi64WebServiceGatewayOutKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestType==null?"\\N":fstrRequestType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64WebServiceGatewayOutKey==null?"\\N":"" + fi64WebServiceGatewayOutKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequestType==null?"\\N":fstrRequestType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrelationID==null?"\\N":fstrCorrelationID, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64WebServiceGatewayOutKey = null; } else {
      this.fi64WebServiceGatewayOutKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestType = null; } else {
      this.fstrRequestType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64WebServiceGatewayOutKey = null; } else {
      this.fi64WebServiceGatewayOutKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequestType = null; } else {
      this.fstrRequestType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrelationID = null; } else {
      this.fstrCorrelationID = __cur_str;
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
    tblnz_studylinkout o = (tblnz_studylinkout) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_studylinkout o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64WebServiceGatewayOutKey", this.fi64WebServiceGatewayOutKey);
    __sqoop$field_map.put("fstrRequestType", this.fstrRequestType);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64WebServiceGatewayOutKey", this.fi64WebServiceGatewayOutKey);
    __sqoop$field_map.put("fstrRequestType", this.fstrRequestType);
    __sqoop$field_map.put("fstrCorrelationID", this.fstrCorrelationID);
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
