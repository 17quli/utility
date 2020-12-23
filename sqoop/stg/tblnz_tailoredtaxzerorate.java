// ORM class for table 'tblnz_tailoredtaxzerorate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:10:52 NZDT 2020
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

public class tblnz_tailoredtaxzerorate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fblnCOE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.fblnCOE = (Integer)value;
      }
    });
    setters.put("fblnZeroRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.fblnZeroRate = (Integer)value;
      }
    });
    setters.put("flngEmployerMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.flngEmployerMailItemKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtaxzerorate.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_tailoredtaxzerorate() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_tailoredtaxzerorate with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_tailoredtaxzerorate with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_tailoredtaxzerorate with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer fblnCOE;
  public Integer get_fblnCOE() {
    return fblnCOE;
  }
  public void set_fblnCOE(Integer fblnCOE) {
    this.fblnCOE = fblnCOE;
  }
  public tblnz_tailoredtaxzerorate with_fblnCOE(Integer fblnCOE) {
    this.fblnCOE = fblnCOE;
    return this;
  }
  private Integer fblnZeroRate;
  public Integer get_fblnZeroRate() {
    return fblnZeroRate;
  }
  public void set_fblnZeroRate(Integer fblnZeroRate) {
    this.fblnZeroRate = fblnZeroRate;
  }
  public tblnz_tailoredtaxzerorate with_fblnZeroRate(Integer fblnZeroRate) {
    this.fblnZeroRate = fblnZeroRate;
    return this;
  }
  private Integer flngEmployerMailItemKey;
  public Integer get_flngEmployerMailItemKey() {
    return flngEmployerMailItemKey;
  }
  public void set_flngEmployerMailItemKey(Integer flngEmployerMailItemKey) {
    this.flngEmployerMailItemKey = flngEmployerMailItemKey;
  }
  public tblnz_tailoredtaxzerorate with_flngEmployerMailItemKey(Integer flngEmployerMailItemKey) {
    this.flngEmployerMailItemKey = flngEmployerMailItemKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_tailoredtaxzerorate with_fstrWho(String fstrWho) {
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
  public tblnz_tailoredtaxzerorate with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tailoredtaxzerorate)) {
      return false;
    }
    tblnz_tailoredtaxzerorate that = (tblnz_tailoredtaxzerorate) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnCOE == null ? that.fblnCOE == null : this.fblnCOE.equals(that.fblnCOE));
    equal = equal && (this.fblnZeroRate == null ? that.fblnZeroRate == null : this.fblnZeroRate.equals(that.fblnZeroRate));
    equal = equal && (this.flngEmployerMailItemKey == null ? that.flngEmployerMailItemKey == null : this.flngEmployerMailItemKey.equals(that.flngEmployerMailItemKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tailoredtaxzerorate)) {
      return false;
    }
    tblnz_tailoredtaxzerorate that = (tblnz_tailoredtaxzerorate) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnCOE == null ? that.fblnCOE == null : this.fblnCOE.equals(that.fblnCOE));
    equal = equal && (this.fblnZeroRate == null ? that.fblnZeroRate == null : this.fblnZeroRate.equals(that.fblnZeroRate));
    equal = equal && (this.flngEmployerMailItemKey == null ? that.flngEmployerMailItemKey == null : this.flngEmployerMailItemKey.equals(that.flngEmployerMailItemKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCOE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnZeroRate = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngEmployerMailItemKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCOE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnZeroRate = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngEmployerMailItemKey = JdbcWritableBridge.readInteger(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCOE, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRate, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerMailItemKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCOE, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRate, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerMailItemKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
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
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCOE = null;
    } else {
    this.fblnCOE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnZeroRate = null;
    } else {
    this.fblnZeroRate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerMailItemKey = null;
    } else {
    this.flngEmployerMailItemKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnCOE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCOE);
    }
    if (null == this.fblnZeroRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRate);
    }
    if (null == this.flngEmployerMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerMailItemKey);
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
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnCOE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCOE);
    }
    if (null == this.fblnZeroRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRate);
    }
    if (null == this.flngEmployerMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerMailItemKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCOE==null?"\\N":"" + fblnCOE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRate==null?"\\N":"" + fblnZeroRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerMailItemKey==null?"\\N":"" + flngEmployerMailItemKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCOE==null?"\\N":"" + fblnCOE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRate==null?"\\N":"" + fblnZeroRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerMailItemKey==null?"\\N":"" + flngEmployerMailItemKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCOE = null; } else {
      this.fblnCOE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRate = null; } else {
      this.fblnZeroRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerMailItemKey = null; } else {
      this.flngEmployerMailItemKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCOE = null; } else {
      this.fblnCOE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRate = null; } else {
      this.fblnZeroRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerMailItemKey = null; } else {
      this.flngEmployerMailItemKey = Integer.valueOf(__cur_str);
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
    tblnz_tailoredtaxzerorate o = (tblnz_tailoredtaxzerorate) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_tailoredtaxzerorate o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnCOE", this.fblnCOE);
    __sqoop$field_map.put("fblnZeroRate", this.fblnZeroRate);
    __sqoop$field_map.put("flngEmployerMailItemKey", this.flngEmployerMailItemKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnCOE", this.fblnCOE);
    __sqoop$field_map.put("fblnZeroRate", this.fblnZeroRate);
    __sqoop$field_map.put("flngEmployerMailItemKey", this.flngEmployerMailItemKey);
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
