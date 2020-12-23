// ORM class for table 'tblcustomerstd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:08:17 NZDT 2020
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

public class tblcustomerstd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGDOCKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerstd.this.FLNGDOCKEY = (Integer)value;
      }
    });
    setters.put("FDTMDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerstd.this.FDTMDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMDOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerstd.this.FDTMDOD = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerstd.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerstd.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcustomerstd() {
    init0();
  }
  private Integer FLNGDOCKEY;
  public Integer get_FLNGDOCKEY() {
    return FLNGDOCKEY;
  }
  public void set_FLNGDOCKEY(Integer FLNGDOCKEY) {
    this.FLNGDOCKEY = FLNGDOCKEY;
  }
  public tblcustomerstd with_FLNGDOCKEY(Integer FLNGDOCKEY) {
    this.FLNGDOCKEY = FLNGDOCKEY;
    return this;
  }
  private java.sql.Timestamp FDTMDOB;
  public java.sql.Timestamp get_FDTMDOB() {
    return FDTMDOB;
  }
  public void set_FDTMDOB(java.sql.Timestamp FDTMDOB) {
    this.FDTMDOB = FDTMDOB;
  }
  public tblcustomerstd with_FDTMDOB(java.sql.Timestamp FDTMDOB) {
    this.FDTMDOB = FDTMDOB;
    return this;
  }
  private java.sql.Timestamp FDTMDOD;
  public java.sql.Timestamp get_FDTMDOD() {
    return FDTMDOD;
  }
  public void set_FDTMDOD(java.sql.Timestamp FDTMDOD) {
    this.FDTMDOD = FDTMDOD;
  }
  public tblcustomerstd with_FDTMDOD(java.sql.Timestamp FDTMDOD) {
    this.FDTMDOD = FDTMDOD;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblcustomerstd with_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
    return this;
  }
  private java.sql.Timestamp FDTMWHEN;
  public java.sql.Timestamp get_FDTMWHEN() {
    return FDTMWHEN;
  }
  public void set_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
  }
  public tblcustomerstd with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomerstd)) {
      return false;
    }
    tblcustomerstd that = (tblcustomerstd) o;
    boolean equal = true;
    equal = equal && (this.FLNGDOCKEY == null ? that.FLNGDOCKEY == null : this.FLNGDOCKEY.equals(that.FLNGDOCKEY));
    equal = equal && (this.FDTMDOB == null ? that.FDTMDOB == null : this.FDTMDOB.equals(that.FDTMDOB));
    equal = equal && (this.FDTMDOD == null ? that.FDTMDOD == null : this.FDTMDOD.equals(that.FDTMDOD));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomerstd)) {
      return false;
    }
    tblcustomerstd that = (tblcustomerstd) o;
    boolean equal = true;
    equal = equal && (this.FLNGDOCKEY == null ? that.FLNGDOCKEY == null : this.FLNGDOCKEY.equals(that.FLNGDOCKEY));
    equal = equal && (this.FDTMDOB == null ? that.FDTMDOB == null : this.FDTMDOB.equals(that.FDTMDOB));
    equal = equal && (this.FDTMDOD == null ? that.FDTMDOD == null : this.FDTMDOD.equals(that.FDTMDOD));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGDOCKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FDTMDOB = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FDTMDOD = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(4, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGDOCKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FDTMDOB = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FDTMDOD = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(4, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGDOCKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDOB, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDOD, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 5 + __off, 93, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGDOCKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDOB, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDOD, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 5 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGDOCKEY = null;
    } else {
    this.FLNGDOCKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMDOB = null;
    } else {
    this.FDTMDOB = new Timestamp(__dataIn.readLong());
    this.FDTMDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMDOD = null;
    } else {
    this.FDTMDOD = new Timestamp(__dataIn.readLong());
    this.FDTMDOD.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRWHO = null;
    } else {
    this.FSTRWHO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMWHEN = null;
    } else {
    this.FDTMWHEN = new Timestamp(__dataIn.readLong());
    this.FDTMWHEN.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGDOCKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDOCKEY);
    }
    if (null == this.FDTMDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDOB.getTime());
    __dataOut.writeInt(this.FDTMDOB.getNanos());
    }
    if (null == this.FDTMDOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDOD.getTime());
    __dataOut.writeInt(this.FDTMDOD.getNanos());
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGDOCKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDOCKEY);
    }
    if (null == this.FDTMDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDOB.getTime());
    __dataOut.writeInt(this.FDTMDOB.getNanos());
    }
    if (null == this.FDTMDOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDOD.getTime());
    __dataOut.writeInt(this.FDTMDOD.getNanos());
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDOCKEY==null?"\\N":"" + FLNGDOCKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDOB==null?"\\N":"" + FDTMDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDOD==null?"\\N":"" + FDTMDOD, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDOCKEY==null?"\\N":"" + FLNGDOCKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDOB==null?"\\N":"" + FDTMDOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDOD==null?"\\N":"" + FDTMDOD, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDOCKEY = null; } else {
      this.FLNGDOCKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDOB = null; } else {
      this.FDTMDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDOD = null; } else {
      this.FDTMDOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDOCKEY = null; } else {
      this.FLNGDOCKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDOB = null; } else {
      this.FDTMDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDOD = null; } else {
      this.FDTMDOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblcustomerstd o = (tblcustomerstd) super.clone();
    o.FDTMDOB = (o.FDTMDOB != null) ? (java.sql.Timestamp) o.FDTMDOB.clone() : null;
    o.FDTMDOD = (o.FDTMDOD != null) ? (java.sql.Timestamp) o.FDTMDOD.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblcustomerstd o) throws CloneNotSupportedException {
    o.FDTMDOB = (o.FDTMDOB != null) ? (java.sql.Timestamp) o.FDTMDOB.clone() : null;
    o.FDTMDOD = (o.FDTMDOD != null) ? (java.sql.Timestamp) o.FDTMDOD.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGDOCKEY", this.FLNGDOCKEY);
    __sqoop$field_map.put("FDTMDOB", this.FDTMDOB);
    __sqoop$field_map.put("FDTMDOD", this.FDTMDOD);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGDOCKEY", this.FLNGDOCKEY);
    __sqoop$field_map.put("FDTMDOB", this.FDTMDOB);
    __sqoop$field_map.put("FDTMDOD", this.FDTMDOD);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
