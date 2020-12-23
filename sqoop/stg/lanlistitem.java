// ORM class for table 'lanlistitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:44:28 NZDT 2020
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

public class lanlistitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FSTRLANGUAGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRLANGUAGE = (String)value;
      }
    });
    setters.put("FSTRFIELD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRFIELD = (String)value;
      }
    });
    setters.put("FSTRLISTITEM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRLISTITEM = (String)value;
      }
    });
    setters.put("FSTRDECODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRDECODE1 = (String)value;
      }
    });
    setters.put("FSTRDECODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRDECODE2 = (String)value;
      }
    });
    setters.put("FSTRDESCRIPTION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlistitem.this.FSTRDESCRIPTION = (String)value;
      }
    });
  }
  public lanlistitem() {
    init0();
  }
  private String FSTRLANGUAGE;
  public String get_FSTRLANGUAGE() {
    return FSTRLANGUAGE;
  }
  public void set_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
  }
  public lanlistitem with_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
    return this;
  }
  private String FSTRFIELD;
  public String get_FSTRFIELD() {
    return FSTRFIELD;
  }
  public void set_FSTRFIELD(String FSTRFIELD) {
    this.FSTRFIELD = FSTRFIELD;
  }
  public lanlistitem with_FSTRFIELD(String FSTRFIELD) {
    this.FSTRFIELD = FSTRFIELD;
    return this;
  }
  private String FSTRLISTITEM;
  public String get_FSTRLISTITEM() {
    return FSTRLISTITEM;
  }
  public void set_FSTRLISTITEM(String FSTRLISTITEM) {
    this.FSTRLISTITEM = FSTRLISTITEM;
  }
  public lanlistitem with_FSTRLISTITEM(String FSTRLISTITEM) {
    this.FSTRLISTITEM = FSTRLISTITEM;
    return this;
  }
  private String FSTRDECODE1;
  public String get_FSTRDECODE1() {
    return FSTRDECODE1;
  }
  public void set_FSTRDECODE1(String FSTRDECODE1) {
    this.FSTRDECODE1 = FSTRDECODE1;
  }
  public lanlistitem with_FSTRDECODE1(String FSTRDECODE1) {
    this.FSTRDECODE1 = FSTRDECODE1;
    return this;
  }
  private String FSTRDECODE2;
  public String get_FSTRDECODE2() {
    return FSTRDECODE2;
  }
  public void set_FSTRDECODE2(String FSTRDECODE2) {
    this.FSTRDECODE2 = FSTRDECODE2;
  }
  public lanlistitem with_FSTRDECODE2(String FSTRDECODE2) {
    this.FSTRDECODE2 = FSTRDECODE2;
    return this;
  }
  private String FSTRDESCRIPTION;
  public String get_FSTRDESCRIPTION() {
    return FSTRDESCRIPTION;
  }
  public void set_FSTRDESCRIPTION(String FSTRDESCRIPTION) {
    this.FSTRDESCRIPTION = FSTRDESCRIPTION;
  }
  public lanlistitem with_FSTRDESCRIPTION(String FSTRDESCRIPTION) {
    this.FSTRDESCRIPTION = FSTRDESCRIPTION;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanlistitem)) {
      return false;
    }
    lanlistitem that = (lanlistitem) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRFIELD == null ? that.FSTRFIELD == null : this.FSTRFIELD.equals(that.FSTRFIELD));
    equal = equal && (this.FSTRLISTITEM == null ? that.FSTRLISTITEM == null : this.FSTRLISTITEM.equals(that.FSTRLISTITEM));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.FSTRDESCRIPTION == null ? that.FSTRDESCRIPTION == null : this.FSTRDESCRIPTION.equals(that.FSTRDESCRIPTION));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanlistitem)) {
      return false;
    }
    lanlistitem that = (lanlistitem) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRFIELD == null ? that.FSTRFIELD == null : this.FSTRFIELD.equals(that.FSTRFIELD));
    equal = equal && (this.FSTRLISTITEM == null ? that.FSTRLISTITEM == null : this.FSTRLISTITEM.equals(that.FSTRLISTITEM));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.FSTRDESCRIPTION == null ? that.FSTRDESCRIPTION == null : this.FSTRDESCRIPTION.equals(that.FSTRDESCRIPTION));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRFIELD = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRLISTITEM = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRDESCRIPTION = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRFIELD = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRLISTITEM = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRDESCRIPTION = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeString(FSTRLANGUAGE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRFIELD, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRLISTITEM, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDESCRIPTION, 6 + __off, -9, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FSTRLANGUAGE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRFIELD, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRLISTITEM, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDESCRIPTION, 6 + __off, -9, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FSTRLANGUAGE = null;
    } else {
    this.FSTRLANGUAGE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRFIELD = null;
    } else {
    this.FSTRFIELD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRLISTITEM = null;
    } else {
    this.FSTRLISTITEM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDECODE1 = null;
    } else {
    this.FSTRDECODE1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDECODE2 = null;
    } else {
    this.FSTRDECODE2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDESCRIPTION = null;
    } else {
    this.FSTRDESCRIPTION = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRLANGUAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLANGUAGE);
    }
    if (null == this.FSTRFIELD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRFIELD);
    }
    if (null == this.FSTRLISTITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLISTITEM);
    }
    if (null == this.FSTRDECODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDECODE1);
    }
    if (null == this.FSTRDECODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDECODE2);
    }
    if (null == this.FSTRDESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDESCRIPTION);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRLANGUAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLANGUAGE);
    }
    if (null == this.FSTRFIELD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRFIELD);
    }
    if (null == this.FSTRLISTITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLISTITEM);
    }
    if (null == this.FSTRDECODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDECODE1);
    }
    if (null == this.FSTRDECODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDECODE2);
    }
    if (null == this.FSTRDESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDESCRIPTION);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRLANGUAGE==null?"\\N":FSTRLANGUAGE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRFIELD==null?"\\N":FSTRFIELD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRLISTITEM==null?"\\N":FSTRLISTITEM, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDESCRIPTION==null?"\\N":FSTRDESCRIPTION, " ", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRLANGUAGE==null?"\\N":FSTRLANGUAGE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRFIELD==null?"\\N":FSTRFIELD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRLISTITEM==null?"\\N":FSTRLISTITEM, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDESCRIPTION==null?"\\N":FSTRDESCRIPTION, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.FSTRLANGUAGE = null; } else {
      this.FSTRLANGUAGE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRFIELD = null; } else {
      this.FSTRFIELD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRLISTITEM = null; } else {
      this.FSTRLISTITEM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDECODE1 = null; } else {
      this.FSTRDECODE1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDECODE2 = null; } else {
      this.FSTRDECODE2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDESCRIPTION = null; } else {
      this.FSTRDESCRIPTION = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRLANGUAGE = null; } else {
      this.FSTRLANGUAGE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRFIELD = null; } else {
      this.FSTRFIELD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRLISTITEM = null; } else {
      this.FSTRLISTITEM = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDECODE1 = null; } else {
      this.FSTRDECODE1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDECODE2 = null; } else {
      this.FSTRDECODE2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDESCRIPTION = null; } else {
      this.FSTRDESCRIPTION = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    lanlistitem o = (lanlistitem) super.clone();
    return o;
  }

  public void clone0(lanlistitem o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRFIELD", this.FSTRFIELD);
    __sqoop$field_map.put("FSTRLISTITEM", this.FSTRLISTITEM);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("FSTRDESCRIPTION", this.FSTRDESCRIPTION);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRFIELD", this.FSTRFIELD);
    __sqoop$field_map.put("FSTRLISTITEM", this.FSTRLISTITEM);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("FSTRDESCRIPTION", this.FSTRDESCRIPTION);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
