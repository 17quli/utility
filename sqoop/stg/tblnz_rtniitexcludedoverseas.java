// ORM class for table 'tblnz_rtniitexcludedoverseas'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:47:47 NZDT 2020
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

public class tblnz_rtniitexcludedoverseas extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fdtmExcludedOverseasStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.fdtmExcludedOverseasStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmExcludedOverseasEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.fdtmExcludedOverseasEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitexcludedoverseas.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniitexcludedoverseas() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniitexcludedoverseas with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_rtniitexcludedoverseas with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private java.sql.Timestamp fdtmExcludedOverseasStart;
  public java.sql.Timestamp get_fdtmExcludedOverseasStart() {
    return fdtmExcludedOverseasStart;
  }
  public void set_fdtmExcludedOverseasStart(java.sql.Timestamp fdtmExcludedOverseasStart) {
    this.fdtmExcludedOverseasStart = fdtmExcludedOverseasStart;
  }
  public tblnz_rtniitexcludedoverseas with_fdtmExcludedOverseasStart(java.sql.Timestamp fdtmExcludedOverseasStart) {
    this.fdtmExcludedOverseasStart = fdtmExcludedOverseasStart;
    return this;
  }
  private java.sql.Timestamp fdtmExcludedOverseasEnd;
  public java.sql.Timestamp get_fdtmExcludedOverseasEnd() {
    return fdtmExcludedOverseasEnd;
  }
  public void set_fdtmExcludedOverseasEnd(java.sql.Timestamp fdtmExcludedOverseasEnd) {
    this.fdtmExcludedOverseasEnd = fdtmExcludedOverseasEnd;
  }
  public tblnz_rtniitexcludedoverseas with_fdtmExcludedOverseasEnd(java.sql.Timestamp fdtmExcludedOverseasEnd) {
    this.fdtmExcludedOverseasEnd = fdtmExcludedOverseasEnd;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniitexcludedoverseas with_fstrWho(String fstrWho) {
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
  public tblnz_rtniitexcludedoverseas with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitexcludedoverseas)) {
      return false;
    }
    tblnz_rtniitexcludedoverseas that = (tblnz_rtniitexcludedoverseas) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmExcludedOverseasStart == null ? that.fdtmExcludedOverseasStart == null : this.fdtmExcludedOverseasStart.equals(that.fdtmExcludedOverseasStart));
    equal = equal && (this.fdtmExcludedOverseasEnd == null ? that.fdtmExcludedOverseasEnd == null : this.fdtmExcludedOverseasEnd.equals(that.fdtmExcludedOverseasEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitexcludedoverseas)) {
      return false;
    }
    tblnz_rtniitexcludedoverseas that = (tblnz_rtniitexcludedoverseas) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmExcludedOverseasStart == null ? that.fdtmExcludedOverseasStart == null : this.fdtmExcludedOverseasStart.equals(that.fdtmExcludedOverseasStart));
    equal = equal && (this.fdtmExcludedOverseasEnd == null ? that.fdtmExcludedOverseasEnd == null : this.fdtmExcludedOverseasEnd.equals(that.fdtmExcludedOverseasEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmExcludedOverseasStart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmExcludedOverseasEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmExcludedOverseasStart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmExcludedOverseasEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcludedOverseasStart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcludedOverseasEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcludedOverseasStart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExcludedOverseasEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 6 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExcludedOverseasStart = null;
    } else {
    this.fdtmExcludedOverseasStart = new Timestamp(__dataIn.readLong());
    this.fdtmExcludedOverseasStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExcludedOverseasEnd = null;
    } else {
    this.fdtmExcludedOverseasEnd = new Timestamp(__dataIn.readLong());
    this.fdtmExcludedOverseasEnd.setNanos(__dataIn.readInt());
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fdtmExcludedOverseasStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcludedOverseasStart.getTime());
    __dataOut.writeInt(this.fdtmExcludedOverseasStart.getNanos());
    }
    if (null == this.fdtmExcludedOverseasEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcludedOverseasEnd.getTime());
    __dataOut.writeInt(this.fdtmExcludedOverseasEnd.getNanos());
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fdtmExcludedOverseasStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcludedOverseasStart.getTime());
    __dataOut.writeInt(this.fdtmExcludedOverseasStart.getNanos());
    }
    if (null == this.fdtmExcludedOverseasEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExcludedOverseasEnd.getTime());
    __dataOut.writeInt(this.fdtmExcludedOverseasEnd.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcludedOverseasStart==null?"\\N":"" + fdtmExcludedOverseasStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcludedOverseasEnd==null?"\\N":"" + fdtmExcludedOverseasEnd, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcludedOverseasStart==null?"\\N":"" + fdtmExcludedOverseasStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExcludedOverseasEnd==null?"\\N":"" + fdtmExcludedOverseasEnd, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcludedOverseasStart = null; } else {
      this.fdtmExcludedOverseasStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcludedOverseasEnd = null; } else {
      this.fdtmExcludedOverseasEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcludedOverseasStart = null; } else {
      this.fdtmExcludedOverseasStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExcludedOverseasEnd = null; } else {
      this.fdtmExcludedOverseasEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_rtniitexcludedoverseas o = (tblnz_rtniitexcludedoverseas) super.clone();
    o.fdtmExcludedOverseasStart = (o.fdtmExcludedOverseasStart != null) ? (java.sql.Timestamp) o.fdtmExcludedOverseasStart.clone() : null;
    o.fdtmExcludedOverseasEnd = (o.fdtmExcludedOverseasEnd != null) ? (java.sql.Timestamp) o.fdtmExcludedOverseasEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniitexcludedoverseas o) throws CloneNotSupportedException {
    o.fdtmExcludedOverseasStart = (o.fdtmExcludedOverseasStart != null) ? (java.sql.Timestamp) o.fdtmExcludedOverseasStart.clone() : null;
    o.fdtmExcludedOverseasEnd = (o.fdtmExcludedOverseasEnd != null) ? (java.sql.Timestamp) o.fdtmExcludedOverseasEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmExcludedOverseasStart", this.fdtmExcludedOverseasStart);
    __sqoop$field_map.put("fdtmExcludedOverseasEnd", this.fdtmExcludedOverseasEnd);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmExcludedOverseasStart", this.fdtmExcludedOverseasStart);
    __sqoop$field_map.put("fdtmExcludedOverseasEnd", this.fdtmExcludedOverseasEnd);
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
