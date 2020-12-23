// ORM class for table 'tblteamresource'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:05:51 NZDT 2020
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

public class tblteamresource extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGRESOURCEKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FLNGRESOURCEKEY = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FLNGTEAMKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FLNGTEAMKEY = (Integer)value;
      }
    });
    setters.put("FLNGFOLDERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FLNGFOLDERKEY = (Integer)value;
      }
    });
    setters.put("FSTRUSER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FSTRUSER = (String)value;
      }
    });
    setters.put("FBLNACTIVE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FBLNACTIVE = (Integer)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamresource.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblteamresource() {
    init0();
  }
  private Integer FLNGRESOURCEKEY;
  public Integer get_FLNGRESOURCEKEY() {
    return FLNGRESOURCEKEY;
  }
  public void set_FLNGRESOURCEKEY(Integer FLNGRESOURCEKEY) {
    this.FLNGRESOURCEKEY = FLNGRESOURCEKEY;
  }
  public tblteamresource with_FLNGRESOURCEKEY(Integer FLNGRESOURCEKEY) {
    this.FLNGRESOURCEKEY = FLNGRESOURCEKEY;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tblteamresource with_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
    return this;
  }
  private Integer FLNGVERLAST;
  public Integer get_FLNGVERLAST() {
    return FLNGVERLAST;
  }
  public void set_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
  }
  public tblteamresource with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FLNGTEAMKEY;
  public Integer get_FLNGTEAMKEY() {
    return FLNGTEAMKEY;
  }
  public void set_FLNGTEAMKEY(Integer FLNGTEAMKEY) {
    this.FLNGTEAMKEY = FLNGTEAMKEY;
  }
  public tblteamresource with_FLNGTEAMKEY(Integer FLNGTEAMKEY) {
    this.FLNGTEAMKEY = FLNGTEAMKEY;
    return this;
  }
  private Integer FLNGFOLDERKEY;
  public Integer get_FLNGFOLDERKEY() {
    return FLNGFOLDERKEY;
  }
  public void set_FLNGFOLDERKEY(Integer FLNGFOLDERKEY) {
    this.FLNGFOLDERKEY = FLNGFOLDERKEY;
  }
  public tblteamresource with_FLNGFOLDERKEY(Integer FLNGFOLDERKEY) {
    this.FLNGFOLDERKEY = FLNGFOLDERKEY;
    return this;
  }
  private String FSTRUSER;
  public String get_FSTRUSER() {
    return FSTRUSER;
  }
  public void set_FSTRUSER(String FSTRUSER) {
    this.FSTRUSER = FSTRUSER;
  }
  public tblteamresource with_FSTRUSER(String FSTRUSER) {
    this.FSTRUSER = FSTRUSER;
    return this;
  }
  private Integer FBLNACTIVE;
  public Integer get_FBLNACTIVE() {
    return FBLNACTIVE;
  }
  public void set_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
  }
  public tblteamresource with_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblteamresource with_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
    return this;
  }
  private java.sql.Timestamp FDTMWHEN;
  public java.sql.Timestamp get_FDTMWHEN() {
    return FDTMWHEN;
  }
  public void set_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
  }
  public tblteamresource with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblteamresource)) {
      return false;
    }
    tblteamresource that = (tblteamresource) o;
    boolean equal = true;
    equal = equal && (this.FLNGRESOURCEKEY == null ? that.FLNGRESOURCEKEY == null : this.FLNGRESOURCEKEY.equals(that.FLNGRESOURCEKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGTEAMKEY == null ? that.FLNGTEAMKEY == null : this.FLNGTEAMKEY.equals(that.FLNGTEAMKEY));
    equal = equal && (this.FLNGFOLDERKEY == null ? that.FLNGFOLDERKEY == null : this.FLNGFOLDERKEY.equals(that.FLNGFOLDERKEY));
    equal = equal && (this.FSTRUSER == null ? that.FSTRUSER == null : this.FSTRUSER.equals(that.FSTRUSER));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblteamresource)) {
      return false;
    }
    tblteamresource that = (tblteamresource) o;
    boolean equal = true;
    equal = equal && (this.FLNGRESOURCEKEY == null ? that.FLNGRESOURCEKEY == null : this.FLNGRESOURCEKEY.equals(that.FLNGRESOURCEKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGTEAMKEY == null ? that.FLNGTEAMKEY == null : this.FLNGTEAMKEY.equals(that.FLNGTEAMKEY));
    equal = equal && (this.FLNGFOLDERKEY == null ? that.FLNGFOLDERKEY == null : this.FLNGFOLDERKEY.equals(that.FLNGFOLDERKEY));
    equal = equal && (this.FSTRUSER == null ? that.FSTRUSER == null : this.FSTRUSER.equals(that.FSTRUSER));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGRESOURCEKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGTEAMKEY = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGFOLDERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FSTRUSER = JdbcWritableBridge.readString(6, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(8, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGRESOURCEKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGTEAMKEY = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGFOLDERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FSTRUSER = JdbcWritableBridge.readString(6, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(8, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGRESOURCEKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTEAMKEY, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGFOLDERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRUSER, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGRESOURCEKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTEAMKEY, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGFOLDERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRUSER, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGRESOURCEKEY = null;
    } else {
    this.FLNGRESOURCEKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVER = null;
    } else {
    this.FLNGVER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVERLAST = null;
    } else {
    this.FLNGVERLAST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGTEAMKEY = null;
    } else {
    this.FLNGTEAMKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGFOLDERKEY = null;
    } else {
    this.FLNGFOLDERKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRUSER = null;
    } else {
    this.FSTRUSER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNACTIVE = null;
    } else {
    this.FBLNACTIVE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRWHO = null;
    } else {
    this.FSTRWHO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMWHEN = null;
    } else {
    this.FDTMWHEN = new Timestamp(__dataIn.readLong());
    this.FDTMWHEN.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGRESOURCEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRESOURCEKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGTEAMKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTEAMKEY);
    }
    if (null == this.FLNGFOLDERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGFOLDERKEY);
    }
    if (null == this.FSTRUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRUSER);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGRESOURCEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRESOURCEKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGTEAMKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTEAMKEY);
    }
    if (null == this.FLNGFOLDERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGFOLDERKEY);
    }
    if (null == this.FSTRUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRUSER);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRESOURCEKEY==null?"\\N":"" + FLNGRESOURCEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTEAMKEY==null?"\\N":"" + FLNGTEAMKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGFOLDERKEY==null?"\\N":"" + FLNGFOLDERKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRUSER==null?"\\N":FSTRUSER, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRESOURCEKEY==null?"\\N":"" + FLNGRESOURCEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTEAMKEY==null?"\\N":"" + FLNGTEAMKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGFOLDERKEY==null?"\\N":"" + FLNGFOLDERKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRUSER==null?"\\N":FSTRUSER, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRESOURCEKEY = null; } else {
      this.FLNGRESOURCEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTEAMKEY = null; } else {
      this.FLNGTEAMKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGFOLDERKEY = null; } else {
      this.FLNGFOLDERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRUSER = null; } else {
      this.FSTRUSER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRESOURCEKEY = null; } else {
      this.FLNGRESOURCEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTEAMKEY = null; } else {
      this.FLNGTEAMKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGFOLDERKEY = null; } else {
      this.FLNGFOLDERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRUSER = null; } else {
      this.FSTRUSER = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblteamresource o = (tblteamresource) super.clone();
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblteamresource o) throws CloneNotSupportedException {
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGRESOURCEKEY", this.FLNGRESOURCEKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGTEAMKEY", this.FLNGTEAMKEY);
    __sqoop$field_map.put("FLNGFOLDERKEY", this.FLNGFOLDERKEY);
    __sqoop$field_map.put("FSTRUSER", this.FSTRUSER);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGRESOURCEKEY", this.FLNGRESOURCEKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGTEAMKEY", this.FLNGTEAMKEY);
    __sqoop$field_map.put("FLNGFOLDERKEY", this.FLNGFOLDERKEY);
    __sqoop$field_map.put("FSTRUSER", this.FSTRUSER);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
