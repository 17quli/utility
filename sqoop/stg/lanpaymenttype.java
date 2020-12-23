// ORM class for table 'lanpaymenttype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:18:49 NZDT 2020
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

public class lanpaymenttype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FSTRLANGUAGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.FSTRLANGUAGE = (String)value;
      }
    });
    setters.put("FSTRPAYMENTTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.FSTRPAYMENTTYPE = (String)value;
      }
    });
    setters.put("FSTRDECODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.FSTRDECODE1 = (String)value;
      }
    });
    setters.put("FSTRDECODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.FSTRDECODE2 = (String)value;
      }
    });
    setters.put("fstrDecodeWeb1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.fstrDecodeWeb1 = (String)value;
      }
    });
    setters.put("fstrDecodeWeb2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.fstrDecodeWeb2 = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanpaymenttype.this.fstrDescription = (String)value;
      }
    });
  }
  public lanpaymenttype() {
    init0();
  }
  private String FSTRLANGUAGE;
  public String get_FSTRLANGUAGE() {
    return FSTRLANGUAGE;
  }
  public void set_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
  }
  public lanpaymenttype with_FSTRLANGUAGE(String FSTRLANGUAGE) {
    this.FSTRLANGUAGE = FSTRLANGUAGE;
    return this;
  }
  private String FSTRPAYMENTTYPE;
  public String get_FSTRPAYMENTTYPE() {
    return FSTRPAYMENTTYPE;
  }
  public void set_FSTRPAYMENTTYPE(String FSTRPAYMENTTYPE) {
    this.FSTRPAYMENTTYPE = FSTRPAYMENTTYPE;
  }
  public lanpaymenttype with_FSTRPAYMENTTYPE(String FSTRPAYMENTTYPE) {
    this.FSTRPAYMENTTYPE = FSTRPAYMENTTYPE;
    return this;
  }
  private String FSTRDECODE1;
  public String get_FSTRDECODE1() {
    return FSTRDECODE1;
  }
  public void set_FSTRDECODE1(String FSTRDECODE1) {
    this.FSTRDECODE1 = FSTRDECODE1;
  }
  public lanpaymenttype with_FSTRDECODE1(String FSTRDECODE1) {
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
  public lanpaymenttype with_FSTRDECODE2(String FSTRDECODE2) {
    this.FSTRDECODE2 = FSTRDECODE2;
    return this;
  }
  private String fstrDecodeWeb1;
  public String get_fstrDecodeWeb1() {
    return fstrDecodeWeb1;
  }
  public void set_fstrDecodeWeb1(String fstrDecodeWeb1) {
    this.fstrDecodeWeb1 = fstrDecodeWeb1;
  }
  public lanpaymenttype with_fstrDecodeWeb1(String fstrDecodeWeb1) {
    this.fstrDecodeWeb1 = fstrDecodeWeb1;
    return this;
  }
  private String fstrDecodeWeb2;
  public String get_fstrDecodeWeb2() {
    return fstrDecodeWeb2;
  }
  public void set_fstrDecodeWeb2(String fstrDecodeWeb2) {
    this.fstrDecodeWeb2 = fstrDecodeWeb2;
  }
  public lanpaymenttype with_fstrDecodeWeb2(String fstrDecodeWeb2) {
    this.fstrDecodeWeb2 = fstrDecodeWeb2;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public lanpaymenttype with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanpaymenttype)) {
      return false;
    }
    lanpaymenttype that = (lanpaymenttype) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRPAYMENTTYPE == null ? that.FSTRPAYMENTTYPE == null : this.FSTRPAYMENTTYPE.equals(that.FSTRPAYMENTTYPE));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDecodeWeb1 == null ? that.fstrDecodeWeb1 == null : this.fstrDecodeWeb1.equals(that.fstrDecodeWeb1));
    equal = equal && (this.fstrDecodeWeb2 == null ? that.fstrDecodeWeb2 == null : this.fstrDecodeWeb2.equals(that.fstrDecodeWeb2));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanpaymenttype)) {
      return false;
    }
    lanpaymenttype that = (lanpaymenttype) o;
    boolean equal = true;
    equal = equal && (this.FSTRLANGUAGE == null ? that.FSTRLANGUAGE == null : this.FSTRLANGUAGE.equals(that.FSTRLANGUAGE));
    equal = equal && (this.FSTRPAYMENTTYPE == null ? that.FSTRPAYMENTTYPE == null : this.FSTRPAYMENTTYPE.equals(that.FSTRPAYMENTTYPE));
    equal = equal && (this.FSTRDECODE1 == null ? that.FSTRDECODE1 == null : this.FSTRDECODE1.equals(that.FSTRDECODE1));
    equal = equal && (this.FSTRDECODE2 == null ? that.FSTRDECODE2 == null : this.FSTRDECODE2.equals(that.FSTRDECODE2));
    equal = equal && (this.fstrDecodeWeb1 == null ? that.fstrDecodeWeb1 == null : this.fstrDecodeWeb1.equals(that.fstrDecodeWeb1));
    equal = equal && (this.fstrDecodeWeb2 == null ? that.fstrDecodeWeb2 == null : this.fstrDecodeWeb2.equals(that.fstrDecodeWeb2));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRPAYMENTTYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDecodeWeb1 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrDecodeWeb2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FSTRLANGUAGE = JdbcWritableBridge.readString(1, __dbResults);
    this.FSTRPAYMENTTYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDECODE1 = JdbcWritableBridge.readString(3, __dbResults);
    this.FSTRDECODE2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDecodeWeb1 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrDecodeWeb2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeString(FSTRPAYMENTTYPE, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb1, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 7 + __off, -9, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FSTRLANGUAGE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRPAYMENTTYPE, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDECODE2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb1, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 7 + __off, -9, __dbStmt);
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
        this.FSTRPAYMENTTYPE = null;
    } else {
    this.FSTRPAYMENTTYPE = Text.readString(__dataIn);
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
        this.fstrDecodeWeb1 = null;
    } else {
    this.fstrDecodeWeb1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecodeWeb2 = null;
    } else {
    this.fstrDecodeWeb2 = Text.readString(__dataIn);
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
    if (null == this.FSTRPAYMENTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRPAYMENTTYPE);
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
    if (null == this.fstrDecodeWeb1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb1);
    }
    if (null == this.fstrDecodeWeb2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb2);
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
    if (null == this.FSTRPAYMENTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRPAYMENTTYPE);
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
    if (null == this.fstrDecodeWeb1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb1);
    }
    if (null == this.fstrDecodeWeb2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb2);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRPAYMENTTYPE==null?"\\N":FSTRPAYMENTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb1==null?"\\N":fstrDecodeWeb1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb2==null?"\\N":fstrDecodeWeb2, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRPAYMENTTYPE==null?"\\N":FSTRPAYMENTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE1==null?"\\N":FSTRDECODE1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDECODE2==null?"\\N":FSTRDECODE2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb1==null?"\\N":fstrDecodeWeb1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb2==null?"\\N":fstrDecodeWeb2, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.FSTRPAYMENTTYPE = null; } else {
      this.FSTRPAYMENTTYPE = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDecodeWeb1 = null; } else {
      this.fstrDecodeWeb1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecodeWeb2 = null; } else {
      this.fstrDecodeWeb2 = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRPAYMENTTYPE = null; } else {
      this.FSTRPAYMENTTYPE = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDecodeWeb1 = null; } else {
      this.fstrDecodeWeb1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecodeWeb2 = null; } else {
      this.fstrDecodeWeb2 = __cur_str;
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
    lanpaymenttype o = (lanpaymenttype) super.clone();
    return o;
  }

  public void clone0(lanpaymenttype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRPAYMENTTYPE", this.FSTRPAYMENTTYPE);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDecodeWeb1", this.fstrDecodeWeb1);
    __sqoop$field_map.put("fstrDecodeWeb2", this.fstrDecodeWeb2);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FSTRLANGUAGE", this.FSTRLANGUAGE);
    __sqoop$field_map.put("FSTRPAYMENTTYPE", this.FSTRPAYMENTTYPE);
    __sqoop$field_map.put("FSTRDECODE1", this.FSTRDECODE1);
    __sqoop$field_map.put("FSTRDECODE2", this.FSTRDECODE2);
    __sqoop$field_map.put("fstrDecodeWeb1", this.fstrDecodeWeb1);
    __sqoop$field_map.put("fstrDecodeWeb2", this.fstrDecodeWeb2);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
