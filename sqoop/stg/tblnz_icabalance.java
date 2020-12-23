// ORM class for table 'tblnz_icabalance'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:33:32 NZDT 2020
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

public class tblnz_icabalance extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmLastClosingBalanceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.fdtmLastClosingBalanceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastUpdate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.fdtmLastUpdate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurICABalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.fcurICABalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_icabalance.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_icabalance() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_icabalance with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmLastClosingBalanceDate;
  public java.sql.Timestamp get_fdtmLastClosingBalanceDate() {
    return fdtmLastClosingBalanceDate;
  }
  public void set_fdtmLastClosingBalanceDate(java.sql.Timestamp fdtmLastClosingBalanceDate) {
    this.fdtmLastClosingBalanceDate = fdtmLastClosingBalanceDate;
  }
  public tblnz_icabalance with_fdtmLastClosingBalanceDate(java.sql.Timestamp fdtmLastClosingBalanceDate) {
    this.fdtmLastClosingBalanceDate = fdtmLastClosingBalanceDate;
    return this;
  }
  private java.sql.Timestamp fdtmLastUpdate;
  public java.sql.Timestamp get_fdtmLastUpdate() {
    return fdtmLastUpdate;
  }
  public void set_fdtmLastUpdate(java.sql.Timestamp fdtmLastUpdate) {
    this.fdtmLastUpdate = fdtmLastUpdate;
  }
  public tblnz_icabalance with_fdtmLastUpdate(java.sql.Timestamp fdtmLastUpdate) {
    this.fdtmLastUpdate = fdtmLastUpdate;
    return this;
  }
  private java.math.BigDecimal fcurICABalance;
  public java.math.BigDecimal get_fcurICABalance() {
    return fcurICABalance;
  }
  public void set_fcurICABalance(java.math.BigDecimal fcurICABalance) {
    this.fcurICABalance = fcurICABalance;
  }
  public tblnz_icabalance with_fcurICABalance(java.math.BigDecimal fcurICABalance) {
    this.fcurICABalance = fcurICABalance;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_icabalance with_fstrWho(String fstrWho) {
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
  public tblnz_icabalance with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_icabalance)) {
      return false;
    }
    tblnz_icabalance that = (tblnz_icabalance) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmLastClosingBalanceDate == null ? that.fdtmLastClosingBalanceDate == null : this.fdtmLastClosingBalanceDate.equals(that.fdtmLastClosingBalanceDate));
    equal = equal && (this.fdtmLastUpdate == null ? that.fdtmLastUpdate == null : this.fdtmLastUpdate.equals(that.fdtmLastUpdate));
    equal = equal && (this.fcurICABalance == null ? that.fcurICABalance == null : this.fcurICABalance.equals(that.fcurICABalance));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_icabalance)) {
      return false;
    }
    tblnz_icabalance that = (tblnz_icabalance) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmLastClosingBalanceDate == null ? that.fdtmLastClosingBalanceDate == null : this.fdtmLastClosingBalanceDate.equals(that.fdtmLastClosingBalanceDate));
    equal = equal && (this.fdtmLastUpdate == null ? that.fdtmLastUpdate == null : this.fdtmLastUpdate.equals(that.fdtmLastUpdate));
    equal = equal && (this.fcurICABalance == null ? that.fcurICABalance == null : this.fcurICABalance.equals(that.fcurICABalance));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmLastClosingBalanceDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmLastUpdate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurICABalance = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmLastClosingBalanceDate = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmLastUpdate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurICABalance = JdbcWritableBridge.readBigDecimal(4, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastClosingBalanceDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastUpdate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurICABalance, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastClosingBalanceDate, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastUpdate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurICABalance, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 6 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastClosingBalanceDate = null;
    } else {
    this.fdtmLastClosingBalanceDate = new Timestamp(__dataIn.readLong());
    this.fdtmLastClosingBalanceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastUpdate = null;
    } else {
    this.fdtmLastUpdate = new Timestamp(__dataIn.readLong());
    this.fdtmLastUpdate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurICABalance = null;
    } else {
    this.fcurICABalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmLastClosingBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastClosingBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmLastClosingBalanceDate.getNanos());
    }
    if (null == this.fdtmLastUpdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastUpdate.getTime());
    __dataOut.writeInt(this.fdtmLastUpdate.getNanos());
    }
    if (null == this.fcurICABalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurICABalance, __dataOut);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmLastClosingBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastClosingBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmLastClosingBalanceDate.getNanos());
    }
    if (null == this.fdtmLastUpdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastUpdate.getTime());
    __dataOut.writeInt(this.fdtmLastUpdate.getNanos());
    }
    if (null == this.fcurICABalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurICABalance, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastClosingBalanceDate==null?"\\N":"" + fdtmLastClosingBalanceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastUpdate==null?"\\N":"" + fdtmLastUpdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurICABalance==null?"\\N":fcurICABalance.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastClosingBalanceDate==null?"\\N":"" + fdtmLastClosingBalanceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastUpdate==null?"\\N":"" + fdtmLastUpdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurICABalance==null?"\\N":fcurICABalance.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastClosingBalanceDate = null; } else {
      this.fdtmLastClosingBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastUpdate = null; } else {
      this.fdtmLastUpdate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurICABalance = null; } else {
      this.fcurICABalance = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastClosingBalanceDate = null; } else {
      this.fdtmLastClosingBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastUpdate = null; } else {
      this.fdtmLastUpdate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurICABalance = null; } else {
      this.fcurICABalance = new java.math.BigDecimal(__cur_str);
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
    tblnz_icabalance o = (tblnz_icabalance) super.clone();
    o.fdtmLastClosingBalanceDate = (o.fdtmLastClosingBalanceDate != null) ? (java.sql.Timestamp) o.fdtmLastClosingBalanceDate.clone() : null;
    o.fdtmLastUpdate = (o.fdtmLastUpdate != null) ? (java.sql.Timestamp) o.fdtmLastUpdate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_icabalance o) throws CloneNotSupportedException {
    o.fdtmLastClosingBalanceDate = (o.fdtmLastClosingBalanceDate != null) ? (java.sql.Timestamp) o.fdtmLastClosingBalanceDate.clone() : null;
    o.fdtmLastUpdate = (o.fdtmLastUpdate != null) ? (java.sql.Timestamp) o.fdtmLastUpdate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmLastClosingBalanceDate", this.fdtmLastClosingBalanceDate);
    __sqoop$field_map.put("fdtmLastUpdate", this.fdtmLastUpdate);
    __sqoop$field_map.put("fcurICABalance", this.fcurICABalance);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmLastClosingBalanceDate", this.fdtmLastClosingBalanceDate);
    __sqoop$field_map.put("fdtmLastUpdate", this.fdtmLastUpdate);
    __sqoop$field_map.put("fcurICABalance", this.fcurICABalance);
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
