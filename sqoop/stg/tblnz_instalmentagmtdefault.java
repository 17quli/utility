// ORM class for table 'tblnz_instalmentagmtdefault'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:02:43 NZDT 2020
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

public class tblnz_instalmentagmtdefault extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngPaymentPlanKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.flngPaymentPlanKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.flngWorkKey = (Integer)value;
      }
    });
    setters.put("fdtmNextPolice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.fdtmNextPolice = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurDifference", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.fcurDifference = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_instalmentagmtdefault.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_instalmentagmtdefault() {
    init0();
  }
  private Integer flngPaymentPlanKey;
  public Integer get_flngPaymentPlanKey() {
    return flngPaymentPlanKey;
  }
  public void set_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
  }
  public tblnz_instalmentagmtdefault with_flngPaymentPlanKey(Integer flngPaymentPlanKey) {
    this.flngPaymentPlanKey = flngPaymentPlanKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_instalmentagmtdefault with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblnz_instalmentagmtdefault with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngWorkKey;
  public Integer get_flngWorkKey() {
    return flngWorkKey;
  }
  public void set_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
  }
  public tblnz_instalmentagmtdefault with_flngWorkKey(Integer flngWorkKey) {
    this.flngWorkKey = flngWorkKey;
    return this;
  }
  private java.sql.Timestamp fdtmNextPolice;
  public java.sql.Timestamp get_fdtmNextPolice() {
    return fdtmNextPolice;
  }
  public void set_fdtmNextPolice(java.sql.Timestamp fdtmNextPolice) {
    this.fdtmNextPolice = fdtmNextPolice;
  }
  public tblnz_instalmentagmtdefault with_fdtmNextPolice(java.sql.Timestamp fdtmNextPolice) {
    this.fdtmNextPolice = fdtmNextPolice;
    return this;
  }
  private java.math.BigDecimal fcurDifference;
  public java.math.BigDecimal get_fcurDifference() {
    return fcurDifference;
  }
  public void set_fcurDifference(java.math.BigDecimal fcurDifference) {
    this.fcurDifference = fcurDifference;
  }
  public tblnz_instalmentagmtdefault with_fcurDifference(java.math.BigDecimal fcurDifference) {
    this.fcurDifference = fcurDifference;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_instalmentagmtdefault with_fstrWho(String fstrWho) {
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
  public tblnz_instalmentagmtdefault with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_instalmentagmtdefault)) {
      return false;
    }
    tblnz_instalmentagmtdefault that = (tblnz_instalmentagmtdefault) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fdtmNextPolice == null ? that.fdtmNextPolice == null : this.fdtmNextPolice.equals(that.fdtmNextPolice));
    equal = equal && (this.fcurDifference == null ? that.fcurDifference == null : this.fcurDifference.equals(that.fcurDifference));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_instalmentagmtdefault)) {
      return false;
    }
    tblnz_instalmentagmtdefault that = (tblnz_instalmentagmtdefault) o;
    boolean equal = true;
    equal = equal && (this.flngPaymentPlanKey == null ? that.flngPaymentPlanKey == null : this.flngPaymentPlanKey.equals(that.flngPaymentPlanKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngWorkKey == null ? that.flngWorkKey == null : this.flngWorkKey.equals(that.flngWorkKey));
    equal = equal && (this.fdtmNextPolice == null ? that.fdtmNextPolice == null : this.fdtmNextPolice.equals(that.fdtmNextPolice));
    equal = equal && (this.fcurDifference == null ? that.fcurDifference == null : this.fcurDifference.equals(that.fcurDifference));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmNextPolice = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fcurDifference = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngPaymentPlanKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngWorkKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmNextPolice = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fcurDifference = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngPaymentPlanKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextPolice, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDifference, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngPaymentPlanKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWorkKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextPolice, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDifference, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngPaymentPlanKey = null;
    } else {
    this.flngPaymentPlanKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWorkKey = null;
    } else {
    this.flngWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextPolice = null;
    } else {
    this.fdtmNextPolice = new Timestamp(__dataIn.readLong());
    this.fdtmNextPolice.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDifference = null;
    } else {
    this.fcurDifference = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngPaymentPlanKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentPlanKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fdtmNextPolice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextPolice.getTime());
    __dataOut.writeInt(this.fdtmNextPolice.getNanos());
    }
    if (null == this.fcurDifference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDifference, __dataOut);
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
    if (null == this.flngPaymentPlanKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPaymentPlanKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWorkKey);
    }
    if (null == this.fdtmNextPolice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextPolice.getTime());
    __dataOut.writeInt(this.fdtmNextPolice.getNanos());
    }
    if (null == this.fcurDifference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDifference, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentPlanKey==null?"\\N":"" + flngPaymentPlanKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextPolice==null?"\\N":"" + fdtmNextPolice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDifference==null?"\\N":fcurDifference.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngPaymentPlanKey==null?"\\N":"" + flngPaymentPlanKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWorkKey==null?"\\N":"" + flngWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextPolice==null?"\\N":"" + fdtmNextPolice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDifference==null?"\\N":fcurDifference.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentPlanKey = null; } else {
      this.flngPaymentPlanKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextPolice = null; } else {
      this.fdtmNextPolice = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDifference = null; } else {
      this.fcurDifference = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPaymentPlanKey = null; } else {
      this.flngPaymentPlanKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWorkKey = null; } else {
      this.flngWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextPolice = null; } else {
      this.fdtmNextPolice = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDifference = null; } else {
      this.fcurDifference = new java.math.BigDecimal(__cur_str);
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
    tblnz_instalmentagmtdefault o = (tblnz_instalmentagmtdefault) super.clone();
    o.fdtmNextPolice = (o.fdtmNextPolice != null) ? (java.sql.Timestamp) o.fdtmNextPolice.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_instalmentagmtdefault o) throws CloneNotSupportedException {
    o.fdtmNextPolice = (o.fdtmNextPolice != null) ? (java.sql.Timestamp) o.fdtmNextPolice.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fdtmNextPolice", this.fdtmNextPolice);
    __sqoop$field_map.put("fcurDifference", this.fcurDifference);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngPaymentPlanKey", this.flngPaymentPlanKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngWorkKey", this.flngWorkKey);
    __sqoop$field_map.put("fdtmNextPolice", this.fdtmNextPolice);
    __sqoop$field_map.put("fcurDifference", this.fcurDifference);
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
