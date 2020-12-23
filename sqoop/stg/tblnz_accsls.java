// ORM class for table 'tblnz_accsls'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:51:36 NZDT 2020
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

public class tblnz_accsls extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnOffsetDebt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fblnOffsetDebt = (Integer)value;
      }
    });
    setters.put("fstrDisbursementOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fstrDisbursementOption = (String)value;
      }
    });
    setters.put("fblnOverseasBasedBorrower", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fblnOverseasBasedBorrower = (Integer)value;
      }
    });
    setters.put("fdtmTransactionReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fdtmTransactionReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accsls.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accsls() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accsls with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnOffsetDebt;
  public Integer get_fblnOffsetDebt() {
    return fblnOffsetDebt;
  }
  public void set_fblnOffsetDebt(Integer fblnOffsetDebt) {
    this.fblnOffsetDebt = fblnOffsetDebt;
  }
  public tblnz_accsls with_fblnOffsetDebt(Integer fblnOffsetDebt) {
    this.fblnOffsetDebt = fblnOffsetDebt;
    return this;
  }
  private String fstrDisbursementOption;
  public String get_fstrDisbursementOption() {
    return fstrDisbursementOption;
  }
  public void set_fstrDisbursementOption(String fstrDisbursementOption) {
    this.fstrDisbursementOption = fstrDisbursementOption;
  }
  public tblnz_accsls with_fstrDisbursementOption(String fstrDisbursementOption) {
    this.fstrDisbursementOption = fstrDisbursementOption;
    return this;
  }
  private Integer fblnOverseasBasedBorrower;
  public Integer get_fblnOverseasBasedBorrower() {
    return fblnOverseasBasedBorrower;
  }
  public void set_fblnOverseasBasedBorrower(Integer fblnOverseasBasedBorrower) {
    this.fblnOverseasBasedBorrower = fblnOverseasBasedBorrower;
  }
  public tblnz_accsls with_fblnOverseasBasedBorrower(Integer fblnOverseasBasedBorrower) {
    this.fblnOverseasBasedBorrower = fblnOverseasBasedBorrower;
    return this;
  }
  private java.sql.Timestamp fdtmTransactionReceived;
  public java.sql.Timestamp get_fdtmTransactionReceived() {
    return fdtmTransactionReceived;
  }
  public void set_fdtmTransactionReceived(java.sql.Timestamp fdtmTransactionReceived) {
    this.fdtmTransactionReceived = fdtmTransactionReceived;
  }
  public tblnz_accsls with_fdtmTransactionReceived(java.sql.Timestamp fdtmTransactionReceived) {
    this.fdtmTransactionReceived = fdtmTransactionReceived;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accsls with_fstrWho(String fstrWho) {
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
  public tblnz_accsls with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accsls)) {
      return false;
    }
    tblnz_accsls that = (tblnz_accsls) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnOffsetDebt == null ? that.fblnOffsetDebt == null : this.fblnOffsetDebt.equals(that.fblnOffsetDebt));
    equal = equal && (this.fstrDisbursementOption == null ? that.fstrDisbursementOption == null : this.fstrDisbursementOption.equals(that.fstrDisbursementOption));
    equal = equal && (this.fblnOverseasBasedBorrower == null ? that.fblnOverseasBasedBorrower == null : this.fblnOverseasBasedBorrower.equals(that.fblnOverseasBasedBorrower));
    equal = equal && (this.fdtmTransactionReceived == null ? that.fdtmTransactionReceived == null : this.fdtmTransactionReceived.equals(that.fdtmTransactionReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accsls)) {
      return false;
    }
    tblnz_accsls that = (tblnz_accsls) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnOffsetDebt == null ? that.fblnOffsetDebt == null : this.fblnOffsetDebt.equals(that.fblnOffsetDebt));
    equal = equal && (this.fstrDisbursementOption == null ? that.fstrDisbursementOption == null : this.fstrDisbursementOption.equals(that.fstrDisbursementOption));
    equal = equal && (this.fblnOverseasBasedBorrower == null ? that.fblnOverseasBasedBorrower == null : this.fblnOverseasBasedBorrower.equals(that.fblnOverseasBasedBorrower));
    equal = equal && (this.fdtmTransactionReceived == null ? that.fdtmTransactionReceived == null : this.fdtmTransactionReceived.equals(that.fdtmTransactionReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnOffsetDebt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrDisbursementOption = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnOverseasBasedBorrower = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmTransactionReceived = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnOffsetDebt = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrDisbursementOption = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnOverseasBasedBorrower = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmTransactionReceived = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnOffsetDebt, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDisbursementOption, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasBasedBorrower, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTransactionReceived, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 7 + __off, 93, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOffsetDebt, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDisbursementOption, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverseasBasedBorrower, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTransactionReceived, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 7 + __off, 93, __dbStmt);
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
        this.fblnOffsetDebt = null;
    } else {
    this.fblnOffsetDebt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDisbursementOption = null;
    } else {
    this.fstrDisbursementOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverseasBasedBorrower = null;
    } else {
    this.fblnOverseasBasedBorrower = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmTransactionReceived = null;
    } else {
    this.fdtmTransactionReceived = new Timestamp(__dataIn.readLong());
    this.fdtmTransactionReceived.setNanos(__dataIn.readInt());
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
    if (null == this.fblnOffsetDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOffsetDebt);
    }
    if (null == this.fstrDisbursementOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDisbursementOption);
    }
    if (null == this.fblnOverseasBasedBorrower) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasBasedBorrower);
    }
    if (null == this.fdtmTransactionReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTransactionReceived.getTime());
    __dataOut.writeInt(this.fdtmTransactionReceived.getNanos());
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
    if (null == this.fblnOffsetDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOffsetDebt);
    }
    if (null == this.fstrDisbursementOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDisbursementOption);
    }
    if (null == this.fblnOverseasBasedBorrower) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverseasBasedBorrower);
    }
    if (null == this.fdtmTransactionReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTransactionReceived.getTime());
    __dataOut.writeInt(this.fdtmTransactionReceived.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOffsetDebt==null?"\\N":"" + fblnOffsetDebt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDisbursementOption==null?"\\N":fstrDisbursementOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasBasedBorrower==null?"\\N":"" + fblnOverseasBasedBorrower, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTransactionReceived==null?"\\N":"" + fdtmTransactionReceived, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOffsetDebt==null?"\\N":"" + fblnOffsetDebt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDisbursementOption==null?"\\N":fstrDisbursementOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverseasBasedBorrower==null?"\\N":"" + fblnOverseasBasedBorrower, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTransactionReceived==null?"\\N":"" + fdtmTransactionReceived, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOffsetDebt = null; } else {
      this.fblnOffsetDebt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDisbursementOption = null; } else {
      this.fstrDisbursementOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasBasedBorrower = null; } else {
      this.fblnOverseasBasedBorrower = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTransactionReceived = null; } else {
      this.fdtmTransactionReceived = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOffsetDebt = null; } else {
      this.fblnOffsetDebt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDisbursementOption = null; } else {
      this.fstrDisbursementOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverseasBasedBorrower = null; } else {
      this.fblnOverseasBasedBorrower = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTransactionReceived = null; } else {
      this.fdtmTransactionReceived = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_accsls o = (tblnz_accsls) super.clone();
    o.fdtmTransactionReceived = (o.fdtmTransactionReceived != null) ? (java.sql.Timestamp) o.fdtmTransactionReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accsls o) throws CloneNotSupportedException {
    o.fdtmTransactionReceived = (o.fdtmTransactionReceived != null) ? (java.sql.Timestamp) o.fdtmTransactionReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnOffsetDebt", this.fblnOffsetDebt);
    __sqoop$field_map.put("fstrDisbursementOption", this.fstrDisbursementOption);
    __sqoop$field_map.put("fblnOverseasBasedBorrower", this.fblnOverseasBasedBorrower);
    __sqoop$field_map.put("fdtmTransactionReceived", this.fdtmTransactionReceived);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnOffsetDebt", this.fblnOffsetDebt);
    __sqoop$field_map.put("fstrDisbursementOption", this.fstrDisbursementOption);
    __sqoop$field_map.put("fblnOverseasBasedBorrower", this.fblnOverseasBasedBorrower);
    __sqoop$field_map.put("fdtmTransactionReceived", this.fdtmTransactionReceived);
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
