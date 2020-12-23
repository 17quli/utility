// ORM class for table 'tblnz_accincome'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:04:35 NZDT 2020
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

public class tblnz_accincome extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmBalanceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.fdtmBalanceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnSeasonalEmployee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.fblnSeasonalEmployee = (Integer)value;
      }
    });
    setters.put("fstrExemptionReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.fstrExemptionReason = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accincome.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accincome() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accincome with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmBalanceDate;
  public java.sql.Timestamp get_fdtmBalanceDate() {
    return fdtmBalanceDate;
  }
  public void set_fdtmBalanceDate(java.sql.Timestamp fdtmBalanceDate) {
    this.fdtmBalanceDate = fdtmBalanceDate;
  }
  public tblnz_accincome with_fdtmBalanceDate(java.sql.Timestamp fdtmBalanceDate) {
    this.fdtmBalanceDate = fdtmBalanceDate;
    return this;
  }
  private Integer fblnSeasonalEmployee;
  public Integer get_fblnSeasonalEmployee() {
    return fblnSeasonalEmployee;
  }
  public void set_fblnSeasonalEmployee(Integer fblnSeasonalEmployee) {
    this.fblnSeasonalEmployee = fblnSeasonalEmployee;
  }
  public tblnz_accincome with_fblnSeasonalEmployee(Integer fblnSeasonalEmployee) {
    this.fblnSeasonalEmployee = fblnSeasonalEmployee;
    return this;
  }
  private String fstrExemptionReason;
  public String get_fstrExemptionReason() {
    return fstrExemptionReason;
  }
  public void set_fstrExemptionReason(String fstrExemptionReason) {
    this.fstrExemptionReason = fstrExemptionReason;
  }
  public tblnz_accincome with_fstrExemptionReason(String fstrExemptionReason) {
    this.fstrExemptionReason = fstrExemptionReason;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accincome with_fstrWho(String fstrWho) {
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
  public tblnz_accincome with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accincome)) {
      return false;
    }
    tblnz_accincome that = (tblnz_accincome) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmBalanceDate == null ? that.fdtmBalanceDate == null : this.fdtmBalanceDate.equals(that.fdtmBalanceDate));
    equal = equal && (this.fblnSeasonalEmployee == null ? that.fblnSeasonalEmployee == null : this.fblnSeasonalEmployee.equals(that.fblnSeasonalEmployee));
    equal = equal && (this.fstrExemptionReason == null ? that.fstrExemptionReason == null : this.fstrExemptionReason.equals(that.fstrExemptionReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accincome)) {
      return false;
    }
    tblnz_accincome that = (tblnz_accincome) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmBalanceDate == null ? that.fdtmBalanceDate == null : this.fdtmBalanceDate.equals(that.fdtmBalanceDate));
    equal = equal && (this.fblnSeasonalEmployee == null ? that.fblnSeasonalEmployee == null : this.fblnSeasonalEmployee.equals(that.fblnSeasonalEmployee));
    equal = equal && (this.fstrExemptionReason == null ? that.fstrExemptionReason == null : this.fstrExemptionReason.equals(that.fstrExemptionReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmBalanceDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fblnSeasonalEmployee = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExemptionReason = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmBalanceDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fblnSeasonalEmployee = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExemptionReason = JdbcWritableBridge.readString(4, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmBalanceDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSeasonalEmployee, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrExemptionReason, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBalanceDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSeasonalEmployee, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrExemptionReason, 4 + __off, -9, __dbStmt);
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
        this.fdtmBalanceDate = null;
    } else {
    this.fdtmBalanceDate = new Timestamp(__dataIn.readLong());
    this.fdtmBalanceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSeasonalEmployee = null;
    } else {
    this.fblnSeasonalEmployee = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExemptionReason = null;
    } else {
    this.fstrExemptionReason = Text.readString(__dataIn);
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
    if (null == this.fdtmBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmBalanceDate.getNanos());
    }
    if (null == this.fblnSeasonalEmployee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSeasonalEmployee);
    }
    if (null == this.fstrExemptionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExemptionReason);
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
    if (null == this.fdtmBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmBalanceDate.getNanos());
    }
    if (null == this.fblnSeasonalEmployee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSeasonalEmployee);
    }
    if (null == this.fstrExemptionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExemptionReason);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBalanceDate==null?"\\N":"" + fdtmBalanceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSeasonalEmployee==null?"\\N":"" + fblnSeasonalEmployee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExemptionReason==null?"\\N":fstrExemptionReason, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBalanceDate==null?"\\N":"" + fdtmBalanceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSeasonalEmployee==null?"\\N":"" + fblnSeasonalEmployee, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExemptionReason==null?"\\N":fstrExemptionReason, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBalanceDate = null; } else {
      this.fdtmBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSeasonalEmployee = null; } else {
      this.fblnSeasonalEmployee = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExemptionReason = null; } else {
      this.fstrExemptionReason = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBalanceDate = null; } else {
      this.fdtmBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSeasonalEmployee = null; } else {
      this.fblnSeasonalEmployee = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExemptionReason = null; } else {
      this.fstrExemptionReason = __cur_str;
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
    tblnz_accincome o = (tblnz_accincome) super.clone();
    o.fdtmBalanceDate = (o.fdtmBalanceDate != null) ? (java.sql.Timestamp) o.fdtmBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accincome o) throws CloneNotSupportedException {
    o.fdtmBalanceDate = (o.fdtmBalanceDate != null) ? (java.sql.Timestamp) o.fdtmBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmBalanceDate", this.fdtmBalanceDate);
    __sqoop$field_map.put("fblnSeasonalEmployee", this.fblnSeasonalEmployee);
    __sqoop$field_map.put("fstrExemptionReason", this.fstrExemptionReason);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmBalanceDate", this.fdtmBalanceDate);
    __sqoop$field_map.put("fblnSeasonalEmployee", this.fblnSeasonalEmployee);
    __sqoop$field_map.put("fstrExemptionReason", this.fstrExemptionReason);
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
