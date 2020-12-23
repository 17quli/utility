// ORM class for table 'tblmailitememail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:11:00 NZDT 2020
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

public class tblmailitememail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64MailItemEmailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.fi64MailItemEmailKey = (Long)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("flngEmailCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.flngEmailCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrEmailOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.fstrEmailOption = (String)value;
      }
    });
    setters.put("flngEmailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.flngEmailKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitememail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblmailitememail() {
    init0();
  }
  private Long fi64MailItemEmailKey;
  public Long get_fi64MailItemEmailKey() {
    return fi64MailItemEmailKey;
  }
  public void set_fi64MailItemEmailKey(Long fi64MailItemEmailKey) {
    this.fi64MailItemEmailKey = fi64MailItemEmailKey;
  }
  public tblmailitememail with_fi64MailItemEmailKey(Long fi64MailItemEmailKey) {
    this.fi64MailItemEmailKey = fi64MailItemEmailKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblmailitememail with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblmailitememail with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private Integer flngEmailCustomerKey;
  public Integer get_flngEmailCustomerKey() {
    return flngEmailCustomerKey;
  }
  public void set_flngEmailCustomerKey(Integer flngEmailCustomerKey) {
    this.flngEmailCustomerKey = flngEmailCustomerKey;
  }
  public tblmailitememail with_flngEmailCustomerKey(Integer flngEmailCustomerKey) {
    this.flngEmailCustomerKey = flngEmailCustomerKey;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tblmailitememail with_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
    return this;
  }
  private String fstrEmailOption;
  public String get_fstrEmailOption() {
    return fstrEmailOption;
  }
  public void set_fstrEmailOption(String fstrEmailOption) {
    this.fstrEmailOption = fstrEmailOption;
  }
  public tblmailitememail with_fstrEmailOption(String fstrEmailOption) {
    this.fstrEmailOption = fstrEmailOption;
    return this;
  }
  private Integer flngEmailKey;
  public Integer get_flngEmailKey() {
    return flngEmailKey;
  }
  public void set_flngEmailKey(Integer flngEmailKey) {
    this.flngEmailKey = flngEmailKey;
  }
  public tblmailitememail with_flngEmailKey(Integer flngEmailKey) {
    this.flngEmailKey = flngEmailKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblmailitememail with_fstrWho(String fstrWho) {
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
  public tblmailitememail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailitememail)) {
      return false;
    }
    tblmailitememail that = (tblmailitememail) o;
    boolean equal = true;
    equal = equal && (this.fi64MailItemEmailKey == null ? that.fi64MailItemEmailKey == null : this.fi64MailItemEmailKey.equals(that.fi64MailItemEmailKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngEmailCustomerKey == null ? that.flngEmailCustomerKey == null : this.flngEmailCustomerKey.equals(that.flngEmailCustomerKey));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailOption == null ? that.fstrEmailOption == null : this.fstrEmailOption.equals(that.fstrEmailOption));
    equal = equal && (this.flngEmailKey == null ? that.flngEmailKey == null : this.flngEmailKey.equals(that.flngEmailKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailitememail)) {
      return false;
    }
    tblmailitememail that = (tblmailitememail) o;
    boolean equal = true;
    equal = equal && (this.fi64MailItemEmailKey == null ? that.fi64MailItemEmailKey == null : this.fi64MailItemEmailKey.equals(that.fi64MailItemEmailKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngEmailCustomerKey == null ? that.flngEmailCustomerKey == null : this.flngEmailCustomerKey.equals(that.flngEmailCustomerKey));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrEmailOption == null ? that.fstrEmailOption == null : this.fstrEmailOption.equals(that.fstrEmailOption));
    equal = equal && (this.flngEmailKey == null ? that.flngEmailKey == null : this.flngEmailKey.equals(that.flngEmailKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64MailItemEmailKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmailCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrEmailOption = JdbcWritableBridge.readString(6, __dbResults);
    this.flngEmailKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64MailItemEmailKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmailCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrEmailOption = JdbcWritableBridge.readString(6, __dbResults);
    this.flngEmailKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64MailItemEmailKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmailCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailOption, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmailKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64MailItemEmailKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmailCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailOption, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmailKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64MailItemEmailKey = null;
    } else {
    this.fi64MailItemEmailKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailItemKey = null;
    } else {
    this.flngMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmailCustomerKey = null;
    } else {
    this.flngEmailCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmail = null;
    } else {
    this.fstrEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailOption = null;
    } else {
    this.fstrEmailOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmailKey = null;
    } else {
    this.flngEmailKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64MailItemEmailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MailItemEmailKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.flngEmailCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmailCustomerKey);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrEmailOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailOption);
    }
    if (null == this.flngEmailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmailKey);
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
    if (null == this.fi64MailItemEmailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MailItemEmailKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.flngEmailCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmailCustomerKey);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrEmailOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailOption);
    }
    if (null == this.flngEmailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmailKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MailItemEmailKey==null?"\\N":"" + fi64MailItemEmailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmailCustomerKey==null?"\\N":"" + flngEmailCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailOption==null?"\\N":fstrEmailOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmailKey==null?"\\N":"" + flngEmailKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MailItemEmailKey==null?"\\N":"" + fi64MailItemEmailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmailCustomerKey==null?"\\N":"" + flngEmailCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailOption==null?"\\N":fstrEmailOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmailKey==null?"\\N":"" + flngEmailKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MailItemEmailKey = null; } else {
      this.fi64MailItemEmailKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmailCustomerKey = null; } else {
      this.flngEmailCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailOption = null; } else {
      this.fstrEmailOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmailKey = null; } else {
      this.flngEmailKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MailItemEmailKey = null; } else {
      this.fi64MailItemEmailKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmailCustomerKey = null; } else {
      this.flngEmailCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailOption = null; } else {
      this.fstrEmailOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmailKey = null; } else {
      this.flngEmailKey = Integer.valueOf(__cur_str);
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
    tblmailitememail o = (tblmailitememail) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblmailitememail o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64MailItemEmailKey", this.fi64MailItemEmailKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngEmailCustomerKey", this.flngEmailCustomerKey);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailOption", this.fstrEmailOption);
    __sqoop$field_map.put("flngEmailKey", this.flngEmailKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64MailItemEmailKey", this.fi64MailItemEmailKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngEmailCustomerKey", this.flngEmailCustomerKey);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrEmailOption", this.fstrEmailOption);
    __sqoop$field_map.put("flngEmailKey", this.flngEmailKey);
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
