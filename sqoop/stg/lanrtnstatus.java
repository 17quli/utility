// ORM class for table 'lanrtnstatus'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:17:23 NZDT 2020
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

public class lanrtnstatus extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FSTRLANGUAGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FSTRLANGUAGE = (String)value;
      }
    });
    setters.put("FSTRSTATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FSTRSTATUS = (String)value;
      }
    });
    setters.put("FSTRMODULE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FSTRMODULE = (String)value;
      }
    });
    setters.put("FINTOCCURENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FINTOCCURENCE = (Integer)value;
      }
    });
    setters.put("FSTRDECODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FSTRDECODE1 = (String)value;
      }
    });
    setters.put("FSTRDECODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.FSTRDECODE2 = (String)value;
      }
    });
    setters.put("fstrDecodeWeb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.fstrDecodeWeb = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanrtnstatus.this.fstrDescription = (String)value;
      }
    });
  }
  public lanrtnstatus() {
    init0();
  }
  private String FSTRLANGUAGE;
  public String get_FSTRLANGUAGE() {
    return FSTRLANGUAGE;
  }
  public void set_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
  }
  public lanrtnstatus with_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
    return this;
  }
  private String FSTRSTATUS;
  public String get_FSTRSTATUS() {
    return FSTRSTATUS;
  }
  public void set_FSTRSTATUS(String FSTRSTATUS) {
    this.FSTRSTATUS = FSTRSTATUS;
  }
  public lanrtnstatus with_FSTRSTATUS(String FSTRSTATUS) {
    this.FSTRSTATUS = FSTRSTATUS;
    return this;
  }
  private String FSTRMODULE;
  public String get_FSTRMODULE() {
    return FSTRMODULE;
  }
  public void set_FSTRMODULE(String FSTRMODULE) {
    this.FSTRMODULE = FSTRMODULE;
  }
  public lanrtnstatus with_FSTRMODULE(String FSTRMODULE) {
    this.FSTRMODULE = FSTRMODULE;
    return this;
  }
  private Integer FINTOCCURENCE;
  public Integer get_FINTOCCURENCE() {
    return FINTOCCURENCE;
  }
  public void set_FINTOCCURENCE(Integer FINTOCCURENCE) {
    this.FINTOCCURENCE = FINTOCCURENCE;
  }
  public lanrtnstatus with_FINTOCCURENCE(Integer FINTOCCURENCE) {
    this.FINTOCCURENCE = FINTOCCURENCE;
    return this;
  }
  private String FSTRDECODE1;
  public String get_FSTRDECODE1() {
    return FSTRDECODE1;
  }
  public void set_FSTRDECODE1(String FSTRDECODE1) {
    this.FSTRDECODE1 = FSTRDECODE1;
  }
  public lanrtnstatus with_FSTRDECODE1(String FSTRDECODE1) {
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
  public lanrtnstatus with_FSTRDECODE2(String FSTRDECODE2) {
    this.FSTRDECODE2 = FSTRDECODE2;
    return this;
  }
  private String fstrDecodeWeb;
  public String get_fstrDecodeWeb() {
    return fstrDecodeWeb;
  }
  public void set_fstrDecodeWeb(String fstrDecodeWeb) {
    this.fstrDecodeWeb = fstrDecodeWeb;
  }
  public lanrtnstatus with_fstrDecodeWeb(String fstrDecodeWeb) {
    this.fstrDecodeWeb = fstrDecodeWeb;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public lanrtnstatus with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanrtnstatus)) {
      return false;
    }
    lanrtnstatus that = (lanrtnstatus) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRSTATUS == null ? that.FSTRSTATUS == null : this.FSTRSTATUS.equals(that.FSTRSTATUS));
    equal = equal && (this.FSTRMODULE == null ? that.FSTRMODULE == null : this.FSTRMODULE.equals(that.FSTRMODULE));
    equal = equal && (this.FINTOCCURENCE == null ? that.FINTOCCURENCE == null : this.FINTOCCURENCE.equals(that.FINTOCCURENCE));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDecodeWeb == null ? that.fstrDecodeWeb == null : this.fstrDecodeWeb.equals(that.fstrDecodeWeb));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanrtnstatus)) {
      return false;
    }
    lanrtnstatus that = (lanrtnstatus) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRSTATUS == null ? that.FSTRSTATUS == null : this.FSTRSTATUS.equals(that.FSTRSTATUS));
    equal = equal && (this.FSTRMODULE == null ? that.FSTRMODULE == null : this.FSTRMODULE.equals(that.FSTRMODULE));
    equal = equal && (this.FINTOCCURENCE == null ? that.FINTOCCURENCE == null : this.FINTOCCURENCE.equals(that.FINTOCCURENCE));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDecodeWeb == null ? that.fstrDecodeWeb == null : this.fstrDecodeWeb.equals(that.fstrDecodeWeb));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRSTATUS = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRMODULE = JdbcWritableBridge.readString(3, __dbResults);
    this.FINTOCCURENCE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDecodeWeb = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRSTATUS = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRMODULE = JdbcWritableBridge.readString(3, __dbResults);
    this.FINTOCCURENCE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDecodeWeb = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeString(FSTRSTATUS, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRMODULE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTOCCURENCE, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 8 + __off, -9, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FSTRLANGUAGE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRSTATUS, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRMODULE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTOCCURENCE, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 8 + __off, -9, __dbStmt);
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
        this.FSTRSTATUS = null;
    } else {
    this.FSTRSTATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRMODULE = null;
    } else {
    this.FSTRMODULE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FINTOCCURENCE = null;
    } else {
    this.FINTOCCURENCE = Integer.valueOf(__dataIn.readInt());
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
        this.fstrDecodeWeb = null;
    } else {
    this.fstrDecodeWeb = Text.readString(__dataIn);
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
    if (null == this.FSTRSTATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSTATUS);
    }
    if (null == this.FSTRMODULE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRMODULE);
    }
    if (null == this.FINTOCCURENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTOCCURENCE);
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
    if (null == this.fstrDecodeWeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb);
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
    if (null == this.FSTRSTATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSTATUS);
    }
    if (null == this.FSTRMODULE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRMODULE);
    }
    if (null == this.FINTOCCURENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTOCCURENCE);
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
    if (null == this.fstrDecodeWeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSTATUS==null?"\\N":FSTRSTATUS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRMODULE==null?"\\N":FSTRMODULE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTOCCURENCE==null?"\\N":"" + FINTOCCURENCE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb==null?"\\N":fstrDecodeWeb, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSTATUS==null?"\\N":FSTRSTATUS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRMODULE==null?"\\N":FSTRMODULE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTOCCURENCE==null?"\\N":"" + FINTOCCURENCE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb==null?"\\N":fstrDecodeWeb, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.FSTRSTATUS = null; } else {
      this.FSTRSTATUS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRMODULE = null; } else {
      this.FSTRMODULE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTOCCURENCE = null; } else {
      this.FINTOCCURENCE = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDecodeWeb = null; } else {
      this.fstrDecodeWeb = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRSTATUS = null; } else {
      this.FSTRSTATUS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRMODULE = null; } else {
      this.FSTRMODULE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTOCCURENCE = null; } else {
      this.FINTOCCURENCE = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDecodeWeb = null; } else {
      this.fstrDecodeWeb = __cur_str;
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
    lanrtnstatus o = (lanrtnstatus) super.clone();
    return o;
  }

  public void clone0(lanrtnstatus o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRSTATUS", this.FSTRSTATUS);
    __sqoop$field_map.put("FSTRMODULE", this.FSTRMODULE);
    __sqoop$field_map.put("FINTOCCURENCE", this.FINTOCCURENCE);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDecodeWeb", this.fstrDecodeWeb);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRSTATUS", this.FSTRSTATUS);
    __sqoop$field_map.put("FSTRMODULE", this.FSTRMODULE);
    __sqoop$field_map.put("FINTOCCURENCE", this.FINTOCCURENCE);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDecodeWeb", this.fstrDecodeWeb);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
