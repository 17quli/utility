// ORM class for table 'tblnz_casfeedback'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:48:27 NZDT 2020
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

public class tblnz_casfeedback extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrCustomerSegment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrCustomerSegment = (String)value;
      }
    });
    setters.put("fstrFeedback", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrFeedback = (String)value;
      }
    });
    setters.put("fstrRecommendation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrRecommendation = (String)value;
      }
    });
    setters.put("fstrProductNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrProductNumber = (String)value;
      }
    });
    setters.put("fstrCaseSubType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrCaseSubType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfeedback.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_casfeedback() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_casfeedback with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrCustomerSegment;
  public String get_fstrCustomerSegment() {
    return fstrCustomerSegment;
  }
  public void set_fstrCustomerSegment(String fstrCustomerSegment) {
    this.fstrCustomerSegment = fstrCustomerSegment;
  }
  public tblnz_casfeedback with_fstrCustomerSegment(String fstrCustomerSegment) {
    this.fstrCustomerSegment = fstrCustomerSegment;
    return this;
  }
  private String fstrFeedback;
  public String get_fstrFeedback() {
    return fstrFeedback;
  }
  public void set_fstrFeedback(String fstrFeedback) {
    this.fstrFeedback = fstrFeedback;
  }
  public tblnz_casfeedback with_fstrFeedback(String fstrFeedback) {
    this.fstrFeedback = fstrFeedback;
    return this;
  }
  private String fstrRecommendation;
  public String get_fstrRecommendation() {
    return fstrRecommendation;
  }
  public void set_fstrRecommendation(String fstrRecommendation) {
    this.fstrRecommendation = fstrRecommendation;
  }
  public tblnz_casfeedback with_fstrRecommendation(String fstrRecommendation) {
    this.fstrRecommendation = fstrRecommendation;
    return this;
  }
  private String fstrProductNumber;
  public String get_fstrProductNumber() {
    return fstrProductNumber;
  }
  public void set_fstrProductNumber(String fstrProductNumber) {
    this.fstrProductNumber = fstrProductNumber;
  }
  public tblnz_casfeedback with_fstrProductNumber(String fstrProductNumber) {
    this.fstrProductNumber = fstrProductNumber;
    return this;
  }
  private String fstrCaseSubType;
  public String get_fstrCaseSubType() {
    return fstrCaseSubType;
  }
  public void set_fstrCaseSubType(String fstrCaseSubType) {
    this.fstrCaseSubType = fstrCaseSubType;
  }
  public tblnz_casfeedback with_fstrCaseSubType(String fstrCaseSubType) {
    this.fstrCaseSubType = fstrCaseSubType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_casfeedback with_fstrWho(String fstrWho) {
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
  public tblnz_casfeedback with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casfeedback)) {
      return false;
    }
    tblnz_casfeedback that = (tblnz_casfeedback) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCustomerSegment == null ? that.fstrCustomerSegment == null : this.fstrCustomerSegment.equals(that.fstrCustomerSegment));
    equal = equal && (this.fstrFeedback == null ? that.fstrFeedback == null : this.fstrFeedback.equals(that.fstrFeedback));
    equal = equal && (this.fstrRecommendation == null ? that.fstrRecommendation == null : this.fstrRecommendation.equals(that.fstrRecommendation));
    equal = equal && (this.fstrProductNumber == null ? that.fstrProductNumber == null : this.fstrProductNumber.equals(that.fstrProductNumber));
    equal = equal && (this.fstrCaseSubType == null ? that.fstrCaseSubType == null : this.fstrCaseSubType.equals(that.fstrCaseSubType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casfeedback)) {
      return false;
    }
    tblnz_casfeedback that = (tblnz_casfeedback) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCustomerSegment == null ? that.fstrCustomerSegment == null : this.fstrCustomerSegment.equals(that.fstrCustomerSegment));
    equal = equal && (this.fstrFeedback == null ? that.fstrFeedback == null : this.fstrFeedback.equals(that.fstrFeedback));
    equal = equal && (this.fstrRecommendation == null ? that.fstrRecommendation == null : this.fstrRecommendation.equals(that.fstrRecommendation));
    equal = equal && (this.fstrProductNumber == null ? that.fstrProductNumber == null : this.fstrProductNumber.equals(that.fstrProductNumber));
    equal = equal && (this.fstrCaseSubType == null ? that.fstrCaseSubType == null : this.fstrCaseSubType.equals(that.fstrCaseSubType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCustomerSegment = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrFeedback = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrRecommendation = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrProductNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrCaseSubType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCustomerSegment = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrFeedback = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrRecommendation = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrProductNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrCaseSubType = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(fstrCustomerSegment, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFeedback, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecommendation, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProductNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseSubType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerSegment, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFeedback, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecommendation, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrProductNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCaseSubType, 6 + __off, -9, __dbStmt);
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
        this.fstrCustomerSegment = null;
    } else {
    this.fstrCustomerSegment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFeedback = null;
    } else {
    this.fstrFeedback = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecommendation = null;
    } else {
    this.fstrRecommendation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProductNumber = null;
    } else {
    this.fstrProductNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCaseSubType = null;
    } else {
    this.fstrCaseSubType = Text.readString(__dataIn);
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
    if (null == this.fstrCustomerSegment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSegment);
    }
    if (null == this.fstrFeedback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFeedback);
    }
    if (null == this.fstrRecommendation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecommendation);
    }
    if (null == this.fstrProductNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProductNumber);
    }
    if (null == this.fstrCaseSubType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseSubType);
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
    if (null == this.fstrCustomerSegment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerSegment);
    }
    if (null == this.fstrFeedback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFeedback);
    }
    if (null == this.fstrRecommendation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecommendation);
    }
    if (null == this.fstrProductNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProductNumber);
    }
    if (null == this.fstrCaseSubType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCaseSubType);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSegment==null?"\\N":fstrCustomerSegment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFeedback==null?"\\N":fstrFeedback, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecommendation==null?"\\N":fstrRecommendation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProductNumber==null?"\\N":fstrProductNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseSubType==null?"\\N":fstrCaseSubType, " ", delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerSegment==null?"\\N":fstrCustomerSegment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFeedback==null?"\\N":fstrFeedback, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecommendation==null?"\\N":fstrRecommendation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProductNumber==null?"\\N":fstrProductNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCaseSubType==null?"\\N":fstrCaseSubType, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrCustomerSegment = null; } else {
      this.fstrCustomerSegment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFeedback = null; } else {
      this.fstrFeedback = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecommendation = null; } else {
      this.fstrRecommendation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProductNumber = null; } else {
      this.fstrProductNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseSubType = null; } else {
      this.fstrCaseSubType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCustomerSegment = null; } else {
      this.fstrCustomerSegment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFeedback = null; } else {
      this.fstrFeedback = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecommendation = null; } else {
      this.fstrRecommendation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProductNumber = null; } else {
      this.fstrProductNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCaseSubType = null; } else {
      this.fstrCaseSubType = __cur_str;
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
    tblnz_casfeedback o = (tblnz_casfeedback) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_casfeedback o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCustomerSegment", this.fstrCustomerSegment);
    __sqoop$field_map.put("fstrFeedback", this.fstrFeedback);
    __sqoop$field_map.put("fstrRecommendation", this.fstrRecommendation);
    __sqoop$field_map.put("fstrProductNumber", this.fstrProductNumber);
    __sqoop$field_map.put("fstrCaseSubType", this.fstrCaseSubType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCustomerSegment", this.fstrCustomerSegment);
    __sqoop$field_map.put("fstrFeedback", this.fstrFeedback);
    __sqoop$field_map.put("fstrRecommendation", this.fstrRecommendation);
    __sqoop$field_map.put("fstrProductNumber", this.fstrProductNumber);
    __sqoop$field_map.put("fstrCaseSubType", this.fstrCaseSubType);
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
