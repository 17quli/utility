// ORM class for table 'lanclosereason'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:41:47 NZDT 2020
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

public class lanclosereason extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FSTRLANGUAGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanclosereason.this.FSTRLANGUAGE = (String)value;
      }
    });
    setters.put("FSTRREASON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanclosereason.this.FSTRREASON = (String)value;
      }
    });
    setters.put("FSTRDECODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanclosereason.this.FSTRDECODE1 = (String)value;
      }
    });
    setters.put("FSTRDECODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanclosereason.this.FSTRDECODE2 = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanclosereason.this.fstrDescription = (String)value;
      }
    });
  }
  public lanclosereason() {
    init0();
  }
  private String FSTRLANGUAGE;
  public String get_FSTRLANGUAGE() {
    return FSTRLANGUAGE;
  }
  public void set_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
  }
  public lanclosereason with_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
    return this;
  }
  private String FSTRREASON;
  public String get_FSTRREASON() {
    return FSTRREASON;
  }
  public void set_FSTRREASON(String FSTRREASON) {
    this.FSTRREASON = FSTRREASON;
  }
  public lanclosereason with_FSTRREASON(String FSTRREASON) {
    this.FSTRREASON = FSTRREASON;
    return this;
  }
  private String FSTRDECODE1;
  public String get_FSTRDECODE1() {
    return FSTRDECODE1;
  }
  public void set_FSTRDECODE1(String FSTRDECODE1) {
    this.FSTRDECODE1 = FSTRDECODE1;
  }
  public lanclosereason with_FSTRDECODE1(String FSTRDECODE1) {
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
  public lanclosereason with_FSTRDECODE2(String FSTRDECODE2) {
    this.FSTRDECODE2 = FSTRDECODE2;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public lanclosereason with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanclosereason)) {
      return false;
    }
    lanclosereason that = (lanclosereason) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRREASON == null ? that.FSTRREASON == null : this.FSTRREASON.equals(that.FSTRREASON));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanclosereason)) {
      return false;
    }
    lanclosereason that = (lanclosereason) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRREASON == null ? that.FSTRREASON == null : this.FSTRREASON.equals(that.FSTRREASON));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRREASON = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRREASON = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeString(FSTRREASON, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 5 + __off, -9, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FSTRLANGUAGE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRREASON, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 5 + __off, -9, __dbStmt);
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
        this.FSTRREASON = null;
    } else {
    this.FSTRREASON = Text.readString(__dataIn);
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
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRLANGUAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLANGUAGE);
    }
    if (null == this.FSTRREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRREASON);
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
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRLANGUAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRLANGUAGE);
    }
    if (null == this.FSTRREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRREASON);
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
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRREASON==null?"\\N":FSTRREASON, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRREASON==null?"\\N":FSTRREASON, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.FSTRREASON = null; } else {
      this.FSTRREASON = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRREASON = null; } else {
      this.FSTRREASON = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    lanclosereason o = (lanclosereason) super.clone();
    return o;
  }

  public void clone0(lanclosereason o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRREASON", this.FSTRREASON);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRREASON", this.FSTRREASON);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
