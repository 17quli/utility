// ORM class for table 'tblnz_intcollectpayments'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:44:18 NZDT 2020
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

public class tblnz_intcollectpayments extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fdtmPaymentDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fdtmPaymentDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurPaymentAmountNZD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fcurPaymentAmountNZD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPaymentAmountOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fcurPaymentAmountOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblCurrencyRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fdblCurrencyRate = (Double)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectpayments.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_intcollectpayments() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_intcollectpayments with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_intcollectpayments with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private java.sql.Timestamp fdtmPaymentDate;
  public java.sql.Timestamp get_fdtmPaymentDate() {
    return fdtmPaymentDate;
  }
  public void set_fdtmPaymentDate(java.sql.Timestamp fdtmPaymentDate) {
    this.fdtmPaymentDate = fdtmPaymentDate;
  }
  public tblnz_intcollectpayments with_fdtmPaymentDate(java.sql.Timestamp fdtmPaymentDate) {
    this.fdtmPaymentDate = fdtmPaymentDate;
    return this;
  }
  private java.math.BigDecimal fcurPaymentAmountNZD;
  public java.math.BigDecimal get_fcurPaymentAmountNZD() {
    return fcurPaymentAmountNZD;
  }
  public void set_fcurPaymentAmountNZD(java.math.BigDecimal fcurPaymentAmountNZD) {
    this.fcurPaymentAmountNZD = fcurPaymentAmountNZD;
  }
  public tblnz_intcollectpayments with_fcurPaymentAmountNZD(java.math.BigDecimal fcurPaymentAmountNZD) {
    this.fcurPaymentAmountNZD = fcurPaymentAmountNZD;
    return this;
  }
  private java.math.BigDecimal fcurPaymentAmountOther;
  public java.math.BigDecimal get_fcurPaymentAmountOther() {
    return fcurPaymentAmountOther;
  }
  public void set_fcurPaymentAmountOther(java.math.BigDecimal fcurPaymentAmountOther) {
    this.fcurPaymentAmountOther = fcurPaymentAmountOther;
  }
  public tblnz_intcollectpayments with_fcurPaymentAmountOther(java.math.BigDecimal fcurPaymentAmountOther) {
    this.fcurPaymentAmountOther = fcurPaymentAmountOther;
    return this;
  }
  private Double fdblCurrencyRate;
  public Double get_fdblCurrencyRate() {
    return fdblCurrencyRate;
  }
  public void set_fdblCurrencyRate(Double fdblCurrencyRate) {
    this.fdblCurrencyRate = fdblCurrencyRate;
  }
  public tblnz_intcollectpayments with_fdblCurrencyRate(Double fdblCurrencyRate) {
    this.fdblCurrencyRate = fdblCurrencyRate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_intcollectpayments with_fstrWho(String fstrWho) {
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
  public tblnz_intcollectpayments with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_intcollectpayments)) {
      return false;
    }
    tblnz_intcollectpayments that = (tblnz_intcollectpayments) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmPaymentDate == null ? that.fdtmPaymentDate == null : this.fdtmPaymentDate.equals(that.fdtmPaymentDate));
    equal = equal && (this.fcurPaymentAmountNZD == null ? that.fcurPaymentAmountNZD == null : this.fcurPaymentAmountNZD.equals(that.fcurPaymentAmountNZD));
    equal = equal && (this.fcurPaymentAmountOther == null ? that.fcurPaymentAmountOther == null : this.fcurPaymentAmountOther.equals(that.fcurPaymentAmountOther));
    equal = equal && (this.fdblCurrencyRate == null ? that.fdblCurrencyRate == null : this.fdblCurrencyRate.equals(that.fdblCurrencyRate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_intcollectpayments)) {
      return false;
    }
    tblnz_intcollectpayments that = (tblnz_intcollectpayments) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmPaymentDate == null ? that.fdtmPaymentDate == null : this.fdtmPaymentDate.equals(that.fdtmPaymentDate));
    equal = equal && (this.fcurPaymentAmountNZD == null ? that.fcurPaymentAmountNZD == null : this.fcurPaymentAmountNZD.equals(that.fcurPaymentAmountNZD));
    equal = equal && (this.fcurPaymentAmountOther == null ? that.fcurPaymentAmountOther == null : this.fcurPaymentAmountOther.equals(that.fcurPaymentAmountOther));
    equal = equal && (this.fdblCurrencyRate == null ? that.fdblCurrencyRate == null : this.fdblCurrencyRate.equals(that.fdblCurrencyRate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmPaymentDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurPaymentAmountNZD = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPaymentAmountOther = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdblCurrencyRate = JdbcWritableBridge.readDouble(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmPaymentDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fcurPaymentAmountNZD = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPaymentAmountOther = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fdblCurrencyRate = JdbcWritableBridge.readDouble(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmountNZD, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmountOther, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblCurrencyRate, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmountNZD, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmountOther, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblCurrencyRate, 6 + __off, 8, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaymentDate = null;
    } else {
    this.fdtmPaymentDate = new Timestamp(__dataIn.readLong());
    this.fdtmPaymentDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPaymentAmountNZD = null;
    } else {
    this.fcurPaymentAmountNZD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPaymentAmountOther = null;
    } else {
    this.fcurPaymentAmountOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblCurrencyRate = null;
    } else {
    this.fdblCurrencyRate = Double.valueOf(__dataIn.readDouble());
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
    if (null == this.fdtmPaymentDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDate.getTime());
    __dataOut.writeInt(this.fdtmPaymentDate.getNanos());
    }
    if (null == this.fcurPaymentAmountNZD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmountNZD, __dataOut);
    }
    if (null == this.fcurPaymentAmountOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmountOther, __dataOut);
    }
    if (null == this.fdblCurrencyRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblCurrencyRate);
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
    if (null == this.fdtmPaymentDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentDate.getTime());
    __dataOut.writeInt(this.fdtmPaymentDate.getNanos());
    }
    if (null == this.fcurPaymentAmountNZD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmountNZD, __dataOut);
    }
    if (null == this.fcurPaymentAmountOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmountOther, __dataOut);
    }
    if (null == this.fdblCurrencyRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblCurrencyRate);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDate==null?"\\N":"" + fdtmPaymentDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmountNZD==null?"\\N":fcurPaymentAmountNZD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmountOther==null?"\\N":fcurPaymentAmountOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblCurrencyRate==null?"\\N":"" + fdblCurrencyRate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentDate==null?"\\N":"" + fdtmPaymentDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmountNZD==null?"\\N":fcurPaymentAmountNZD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmountOther==null?"\\N":fcurPaymentAmountOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblCurrencyRate==null?"\\N":"" + fdblCurrencyRate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDate = null; } else {
      this.fdtmPaymentDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmountNZD = null; } else {
      this.fcurPaymentAmountNZD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmountOther = null; } else {
      this.fcurPaymentAmountOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblCurrencyRate = null; } else {
      this.fdblCurrencyRate = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentDate = null; } else {
      this.fdtmPaymentDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmountNZD = null; } else {
      this.fcurPaymentAmountNZD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmountOther = null; } else {
      this.fcurPaymentAmountOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblCurrencyRate = null; } else {
      this.fdblCurrencyRate = Double.valueOf(__cur_str);
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
    tblnz_intcollectpayments o = (tblnz_intcollectpayments) super.clone();
    o.fdtmPaymentDate = (o.fdtmPaymentDate != null) ? (java.sql.Timestamp) o.fdtmPaymentDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_intcollectpayments o) throws CloneNotSupportedException {
    o.fdtmPaymentDate = (o.fdtmPaymentDate != null) ? (java.sql.Timestamp) o.fdtmPaymentDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmPaymentDate", this.fdtmPaymentDate);
    __sqoop$field_map.put("fcurPaymentAmountNZD", this.fcurPaymentAmountNZD);
    __sqoop$field_map.put("fcurPaymentAmountOther", this.fcurPaymentAmountOther);
    __sqoop$field_map.put("fdblCurrencyRate", this.fdblCurrencyRate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmPaymentDate", this.fdtmPaymentDate);
    __sqoop$field_map.put("fcurPaymentAmountNZD", this.fcurPaymentAmountNZD);
    __sqoop$field_map.put("fcurPaymentAmountOther", this.fcurPaymentAmountOther);
    __sqoop$field_map.put("fdblCurrencyRate", this.fdblCurrencyRate);
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
