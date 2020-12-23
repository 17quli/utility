// ORM class for table 'tblnz_caspapercorrespondence'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:13:57 NZDT 2020
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

public class tblnz_caspapercorrespondence extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDockey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.flngDockey = (Integer)value;
      }
    });
    setters.put("fstrWorkCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fstrWorkCategory = (String)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fstrDLN = (String)value;
      }
    });
    setters.put("fdtmLodgementDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fdtmLodgementDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnImageSplit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fblnImageSplit = (Integer)value;
      }
    });
    setters.put("fstrwho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fstrwho = (String)value;
      }
    });
    setters.put("fdtmwhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caspapercorrespondence.this.fdtmwhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_caspapercorrespondence() {
    init0();
  }
  private Integer flngDockey;
  public Integer get_flngDockey() {
    return flngDockey;
  }
  public void set_flngDockey(Integer flngDockey) {
    this.flngDockey = flngDockey;
  }
  public tblnz_caspapercorrespondence with_flngDockey(Integer flngDockey) {
    this.flngDockey = flngDockey;
    return this;
  }
  private String fstrWorkCategory;
  public String get_fstrWorkCategory() {
    return fstrWorkCategory;
  }
  public void set_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
  }
  public tblnz_caspapercorrespondence with_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_caspapercorrespondence with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private java.sql.Timestamp fdtmLodgementDate;
  public java.sql.Timestamp get_fdtmLodgementDate() {
    return fdtmLodgementDate;
  }
  public void set_fdtmLodgementDate(java.sql.Timestamp fdtmLodgementDate) {
    this.fdtmLodgementDate = fdtmLodgementDate;
  }
  public tblnz_caspapercorrespondence with_fdtmLodgementDate(java.sql.Timestamp fdtmLodgementDate) {
    this.fdtmLodgementDate = fdtmLodgementDate;
    return this;
  }
  private Integer fblnImageSplit;
  public Integer get_fblnImageSplit() {
    return fblnImageSplit;
  }
  public void set_fblnImageSplit(Integer fblnImageSplit) {
    this.fblnImageSplit = fblnImageSplit;
  }
  public tblnz_caspapercorrespondence with_fblnImageSplit(Integer fblnImageSplit) {
    this.fblnImageSplit = fblnImageSplit;
    return this;
  }
  private String fstrwho;
  public String get_fstrwho() {
    return fstrwho;
  }
  public void set_fstrwho(String fstrwho) {
    this.fstrwho = fstrwho;
  }
  public tblnz_caspapercorrespondence with_fstrwho(String fstrwho) {
    this.fstrwho = fstrwho;
    return this;
  }
  private java.sql.Timestamp fdtmwhen;
  public java.sql.Timestamp get_fdtmwhen() {
    return fdtmwhen;
  }
  public void set_fdtmwhen(java.sql.Timestamp fdtmwhen) {
    this.fdtmwhen = fdtmwhen;
  }
  public tblnz_caspapercorrespondence with_fdtmwhen(java.sql.Timestamp fdtmwhen) {
    this.fdtmwhen = fdtmwhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_caspapercorrespondence)) {
      return false;
    }
    tblnz_caspapercorrespondence that = (tblnz_caspapercorrespondence) o;
    boolean equal = true;
    equal = equal && (this.flngDockey == null ? that.flngDockey == null : this.flngDockey.equals(that.flngDockey));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmLodgementDate == null ? that.fdtmLodgementDate == null : this.fdtmLodgementDate.equals(that.fdtmLodgementDate));
    equal = equal && (this.fblnImageSplit == null ? that.fblnImageSplit == null : this.fblnImageSplit.equals(that.fblnImageSplit));
    equal = equal && (this.fstrwho == null ? that.fstrwho == null : this.fstrwho.equals(that.fstrwho));
    equal = equal && (this.fdtmwhen == null ? that.fdtmwhen == null : this.fdtmwhen.equals(that.fdtmwhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_caspapercorrespondence)) {
      return false;
    }
    tblnz_caspapercorrespondence that = (tblnz_caspapercorrespondence) o;
    boolean equal = true;
    equal = equal && (this.flngDockey == null ? that.flngDockey == null : this.flngDockey.equals(that.flngDockey));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmLodgementDate == null ? that.fdtmLodgementDate == null : this.fdtmLodgementDate.equals(that.fdtmLodgementDate));
    equal = equal && (this.fblnImageSplit == null ? that.fblnImageSplit == null : this.fblnImageSplit.equals(that.fblnImageSplit));
    equal = equal && (this.fstrwho == null ? that.fstrwho == null : this.fstrwho.equals(that.fstrwho));
    equal = equal && (this.fdtmwhen == null ? that.fdtmwhen == null : this.fdtmwhen.equals(that.fdtmwhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDockey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmLodgementDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fblnImageSplit = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrwho = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmwhen = JdbcWritableBridge.readTimestamp(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDockey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmLodgementDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fblnImageSplit = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrwho = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmwhen = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDockey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLodgementDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImageSplit, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrwho, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmwhen, 7 + __off, 93, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDockey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLodgementDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImageSplit, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrwho, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmwhen, 7 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDockey = null;
    } else {
    this.flngDockey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkCategory = null;
    } else {
    this.fstrWorkCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLodgementDate = null;
    } else {
    this.fdtmLodgementDate = new Timestamp(__dataIn.readLong());
    this.fdtmLodgementDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnImageSplit = null;
    } else {
    this.fblnImageSplit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrwho = null;
    } else {
    this.fstrwho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmwhen = null;
    } else {
    this.fdtmwhen = new Timestamp(__dataIn.readLong());
    this.fdtmwhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDockey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDockey);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmLodgementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLodgementDate.getTime());
    __dataOut.writeInt(this.fdtmLodgementDate.getNanos());
    }
    if (null == this.fblnImageSplit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImageSplit);
    }
    if (null == this.fstrwho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrwho);
    }
    if (null == this.fdtmwhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmwhen.getTime());
    __dataOut.writeInt(this.fdtmwhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDockey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDockey);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmLodgementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLodgementDate.getTime());
    __dataOut.writeInt(this.fdtmLodgementDate.getNanos());
    }
    if (null == this.fblnImageSplit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImageSplit);
    }
    if (null == this.fstrwho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrwho);
    }
    if (null == this.fdtmwhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmwhen.getTime());
    __dataOut.writeInt(this.fdtmwhen.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDockey==null?"\\N":"" + flngDockey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLodgementDate==null?"\\N":"" + fdtmLodgementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImageSplit==null?"\\N":"" + fblnImageSplit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrwho==null?"\\N":fstrwho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmwhen==null?"\\N":"" + fdtmwhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDockey==null?"\\N":"" + flngDockey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLodgementDate==null?"\\N":"" + fdtmLodgementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImageSplit==null?"\\N":"" + fblnImageSplit, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrwho==null?"\\N":fstrwho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmwhen==null?"\\N":"" + fdtmwhen, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDockey = null; } else {
      this.flngDockey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLodgementDate = null; } else {
      this.fdtmLodgementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImageSplit = null; } else {
      this.fblnImageSplit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrwho = null; } else {
      this.fstrwho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmwhen = null; } else {
      this.fdtmwhen = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDockey = null; } else {
      this.flngDockey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLodgementDate = null; } else {
      this.fdtmLodgementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImageSplit = null; } else {
      this.fblnImageSplit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrwho = null; } else {
      this.fstrwho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmwhen = null; } else {
      this.fdtmwhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_caspapercorrespondence o = (tblnz_caspapercorrespondence) super.clone();
    o.fdtmLodgementDate = (o.fdtmLodgementDate != null) ? (java.sql.Timestamp) o.fdtmLodgementDate.clone() : null;
    o.fdtmwhen = (o.fdtmwhen != null) ? (java.sql.Timestamp) o.fdtmwhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_caspapercorrespondence o) throws CloneNotSupportedException {
    o.fdtmLodgementDate = (o.fdtmLodgementDate != null) ? (java.sql.Timestamp) o.fdtmLodgementDate.clone() : null;
    o.fdtmwhen = (o.fdtmwhen != null) ? (java.sql.Timestamp) o.fdtmwhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDockey", this.flngDockey);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmLodgementDate", this.fdtmLodgementDate);
    __sqoop$field_map.put("fblnImageSplit", this.fblnImageSplit);
    __sqoop$field_map.put("fstrwho", this.fstrwho);
    __sqoop$field_map.put("fdtmwhen", this.fdtmwhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDockey", this.flngDockey);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmLodgementDate", this.fdtmLodgementDate);
    __sqoop$field_map.put("fblnImageSplit", this.fblnImageSplit);
    __sqoop$field_map.put("fstrwho", this.fstrwho);
    __sqoop$field_map.put("fdtmwhen", this.fdtmwhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
