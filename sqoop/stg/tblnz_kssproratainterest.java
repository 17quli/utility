// ORM class for table 'tblnz_kssproratainterest'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:41:49 NZDT 2020
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

public class tblnz_kssproratainterest extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64InterestKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fi64InterestKey = (Long)value;
      }
    });
    setters.put("fi64ContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fi64ContributionKey = (Long)value;
      }
    });
    setters.put("fdtmCalculationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fdtmCalculationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fi64InterestContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fi64InterestContributionKey = (Long)value;
      }
    });
    setters.put("fcurCalculatedInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fcurCalculatedInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestSentToScheme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fcurInterestSentToScheme = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssproratainterest.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_kssproratainterest() {
    init0();
  }
  private Long fi64InterestKey;
  public Long get_fi64InterestKey() {
    return fi64InterestKey;
  }
  public void set_fi64InterestKey(Long fi64InterestKey) {
    this.fi64InterestKey = fi64InterestKey;
  }
  public tblnz_kssproratainterest with_fi64InterestKey(Long fi64InterestKey) {
    this.fi64InterestKey = fi64InterestKey;
    return this;
  }
  private Long fi64ContributionKey;
  public Long get_fi64ContributionKey() {
    return fi64ContributionKey;
  }
  public void set_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
  }
  public tblnz_kssproratainterest with_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
    return this;
  }
  private java.sql.Timestamp fdtmCalculationDate;
  public java.sql.Timestamp get_fdtmCalculationDate() {
    return fdtmCalculationDate;
  }
  public void set_fdtmCalculationDate(java.sql.Timestamp fdtmCalculationDate) {
    this.fdtmCalculationDate = fdtmCalculationDate;
  }
  public tblnz_kssproratainterest with_fdtmCalculationDate(java.sql.Timestamp fdtmCalculationDate) {
    this.fdtmCalculationDate = fdtmCalculationDate;
    return this;
  }
  private Long fi64InterestContributionKey;
  public Long get_fi64InterestContributionKey() {
    return fi64InterestContributionKey;
  }
  public void set_fi64InterestContributionKey(Long fi64InterestContributionKey) {
    this.fi64InterestContributionKey = fi64InterestContributionKey;
  }
  public tblnz_kssproratainterest with_fi64InterestContributionKey(Long fi64InterestContributionKey) {
    this.fi64InterestContributionKey = fi64InterestContributionKey;
    return this;
  }
  private java.math.BigDecimal fcurCalculatedInterest;
  public java.math.BigDecimal get_fcurCalculatedInterest() {
    return fcurCalculatedInterest;
  }
  public void set_fcurCalculatedInterest(java.math.BigDecimal fcurCalculatedInterest) {
    this.fcurCalculatedInterest = fcurCalculatedInterest;
  }
  public tblnz_kssproratainterest with_fcurCalculatedInterest(java.math.BigDecimal fcurCalculatedInterest) {
    this.fcurCalculatedInterest = fcurCalculatedInterest;
    return this;
  }
  private java.math.BigDecimal fcurInterestSentToScheme;
  public java.math.BigDecimal get_fcurInterestSentToScheme() {
    return fcurInterestSentToScheme;
  }
  public void set_fcurInterestSentToScheme(java.math.BigDecimal fcurInterestSentToScheme) {
    this.fcurInterestSentToScheme = fcurInterestSentToScheme;
  }
  public tblnz_kssproratainterest with_fcurInterestSentToScheme(java.math.BigDecimal fcurInterestSentToScheme) {
    this.fcurInterestSentToScheme = fcurInterestSentToScheme;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_kssproratainterest with_fstrWho(String fstrWho) {
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
  public tblnz_kssproratainterest with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssproratainterest)) {
      return false;
    }
    tblnz_kssproratainterest that = (tblnz_kssproratainterest) o;
    boolean equal = true;
    equal = equal && (this.fi64InterestKey == null ? that.fi64InterestKey == null : this.fi64InterestKey.equals(that.fi64InterestKey));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.fdtmCalculationDate == null ? that.fdtmCalculationDate == null : this.fdtmCalculationDate.equals(that.fdtmCalculationDate));
    equal = equal && (this.fi64InterestContributionKey == null ? that.fi64InterestContributionKey == null : this.fi64InterestContributionKey.equals(that.fi64InterestContributionKey));
    equal = equal && (this.fcurCalculatedInterest == null ? that.fcurCalculatedInterest == null : this.fcurCalculatedInterest.equals(that.fcurCalculatedInterest));
    equal = equal && (this.fcurInterestSentToScheme == null ? that.fcurInterestSentToScheme == null : this.fcurInterestSentToScheme.equals(that.fcurInterestSentToScheme));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssproratainterest)) {
      return false;
    }
    tblnz_kssproratainterest that = (tblnz_kssproratainterest) o;
    boolean equal = true;
    equal = equal && (this.fi64InterestKey == null ? that.fi64InterestKey == null : this.fi64InterestKey.equals(that.fi64InterestKey));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.fdtmCalculationDate == null ? that.fdtmCalculationDate == null : this.fdtmCalculationDate.equals(that.fdtmCalculationDate));
    equal = equal && (this.fi64InterestContributionKey == null ? that.fi64InterestContributionKey == null : this.fi64InterestContributionKey.equals(that.fi64InterestContributionKey));
    equal = equal && (this.fcurCalculatedInterest == null ? that.fcurCalculatedInterest == null : this.fcurCalculatedInterest.equals(that.fcurCalculatedInterest));
    equal = equal && (this.fcurInterestSentToScheme == null ? that.fcurInterestSentToScheme == null : this.fcurInterestSentToScheme.equals(that.fcurInterestSentToScheme));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64InterestKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fdtmCalculationDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fi64InterestContributionKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.fcurCalculatedInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurInterestSentToScheme = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64InterestKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fdtmCalculationDate = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fi64InterestContributionKey = JdbcWritableBridge.readLong(4, __dbResults);
    this.fcurCalculatedInterest = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurInterestSentToScheme = JdbcWritableBridge.readBigDecimal(6, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64InterestKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCalculationDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64InterestContributionKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCalculatedInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestSentToScheme, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64InterestKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCalculationDate, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64InterestContributionKey, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCalculatedInterest, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestSentToScheme, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64InterestKey = null;
    } else {
    this.fi64InterestKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionKey = null;
    } else {
    this.fi64ContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCalculationDate = null;
    } else {
    this.fdtmCalculationDate = new Timestamp(__dataIn.readLong());
    this.fdtmCalculationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64InterestContributionKey = null;
    } else {
    this.fi64InterestContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCalculatedInterest = null;
    } else {
    this.fcurCalculatedInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestSentToScheme = null;
    } else {
    this.fcurInterestSentToScheme = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fi64InterestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestKey);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.fdtmCalculationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCalculationDate.getTime());
    __dataOut.writeInt(this.fdtmCalculationDate.getNanos());
    }
    if (null == this.fi64InterestContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestContributionKey);
    }
    if (null == this.fcurCalculatedInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCalculatedInterest, __dataOut);
    }
    if (null == this.fcurInterestSentToScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestSentToScheme, __dataOut);
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
    if (null == this.fi64InterestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestKey);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.fdtmCalculationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCalculationDate.getTime());
    __dataOut.writeInt(this.fdtmCalculationDate.getNanos());
    }
    if (null == this.fi64InterestContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64InterestContributionKey);
    }
    if (null == this.fcurCalculatedInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCalculatedInterest, __dataOut);
    }
    if (null == this.fcurInterestSentToScheme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestSentToScheme, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestKey==null?"\\N":"" + fi64InterestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCalculationDate==null?"\\N":"" + fdtmCalculationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestContributionKey==null?"\\N":"" + fi64InterestContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCalculatedInterest==null?"\\N":fcurCalculatedInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestSentToScheme==null?"\\N":fcurInterestSentToScheme.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestKey==null?"\\N":"" + fi64InterestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCalculationDate==null?"\\N":"" + fdtmCalculationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64InterestContributionKey==null?"\\N":"" + fi64InterestContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCalculatedInterest==null?"\\N":fcurCalculatedInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestSentToScheme==null?"\\N":fcurInterestSentToScheme.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestKey = null; } else {
      this.fi64InterestKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCalculationDate = null; } else {
      this.fdtmCalculationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestContributionKey = null; } else {
      this.fi64InterestContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCalculatedInterest = null; } else {
      this.fcurCalculatedInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestSentToScheme = null; } else {
      this.fcurInterestSentToScheme = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestKey = null; } else {
      this.fi64InterestKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCalculationDate = null; } else {
      this.fdtmCalculationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64InterestContributionKey = null; } else {
      this.fi64InterestContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCalculatedInterest = null; } else {
      this.fcurCalculatedInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestSentToScheme = null; } else {
      this.fcurInterestSentToScheme = new java.math.BigDecimal(__cur_str);
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
    tblnz_kssproratainterest o = (tblnz_kssproratainterest) super.clone();
    o.fdtmCalculationDate = (o.fdtmCalculationDate != null) ? (java.sql.Timestamp) o.fdtmCalculationDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_kssproratainterest o) throws CloneNotSupportedException {
    o.fdtmCalculationDate = (o.fdtmCalculationDate != null) ? (java.sql.Timestamp) o.fdtmCalculationDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64InterestKey", this.fi64InterestKey);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("fdtmCalculationDate", this.fdtmCalculationDate);
    __sqoop$field_map.put("fi64InterestContributionKey", this.fi64InterestContributionKey);
    __sqoop$field_map.put("fcurCalculatedInterest", this.fcurCalculatedInterest);
    __sqoop$field_map.put("fcurInterestSentToScheme", this.fcurInterestSentToScheme);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64InterestKey", this.fi64InterestKey);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("fdtmCalculationDate", this.fdtmCalculationDate);
    __sqoop$field_map.put("fi64InterestContributionKey", this.fi64InterestContributionKey);
    __sqoop$field_map.put("fcurCalculatedInterest", this.fcurCalculatedInterest);
    __sqoop$field_map.put("fcurInterestSentToScheme", this.fcurInterestSentToScheme);
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
