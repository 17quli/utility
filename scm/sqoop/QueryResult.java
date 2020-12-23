// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 05 02:14:33 GMT 2020
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
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

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("TABLE_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TABLE_NAME = (String)value;
      }
    });
    setters.put("COLUMN_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COLUMN_NAME = (String)value;
      }
    });
    setters.put("DATA_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATA_TYPE = (String)value;
      }
    });
    setters.put("DATA_LENGTH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATA_LENGTH = (java.math.BigDecimal)value;
      }
    });
    setters.put("DATA_PRECISION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATA_PRECISION = (java.math.BigDecimal)value;
      }
    });
    setters.put("DATA_SCALE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DATA_SCALE = (java.math.BigDecimal)value;
      }
    });
    setters.put("COLUMN_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COLUMN_ID = (java.math.BigDecimal)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String TABLE_NAME;
  public String get_TABLE_NAME() {
    return TABLE_NAME;
  }
  public void set_TABLE_NAME(String TABLE_NAME) {
    this.TABLE_NAME = TABLE_NAME;
  }
  public QueryResult with_TABLE_NAME(String TABLE_NAME) {
    this.TABLE_NAME = TABLE_NAME;
    return this;
  }
  private String COLUMN_NAME;
  public String get_COLUMN_NAME() {
    return COLUMN_NAME;
  }
  public void set_COLUMN_NAME(String COLUMN_NAME) {
    this.COLUMN_NAME = COLUMN_NAME;
  }
  public QueryResult with_COLUMN_NAME(String COLUMN_NAME) {
    this.COLUMN_NAME = COLUMN_NAME;
    return this;
  }
  private String DATA_TYPE;
  public String get_DATA_TYPE() {
    return DATA_TYPE;
  }
  public void set_DATA_TYPE(String DATA_TYPE) {
    this.DATA_TYPE = DATA_TYPE;
  }
  public QueryResult with_DATA_TYPE(String DATA_TYPE) {
    this.DATA_TYPE = DATA_TYPE;
    return this;
  }
  private java.math.BigDecimal DATA_LENGTH;
  public java.math.BigDecimal get_DATA_LENGTH() {
    return DATA_LENGTH;
  }
  public void set_DATA_LENGTH(java.math.BigDecimal DATA_LENGTH) {
    this.DATA_LENGTH = DATA_LENGTH;
  }
  public QueryResult with_DATA_LENGTH(java.math.BigDecimal DATA_LENGTH) {
    this.DATA_LENGTH = DATA_LENGTH;
    return this;
  }
  private java.math.BigDecimal DATA_PRECISION;
  public java.math.BigDecimal get_DATA_PRECISION() {
    return DATA_PRECISION;
  }
  public void set_DATA_PRECISION(java.math.BigDecimal DATA_PRECISION) {
    this.DATA_PRECISION = DATA_PRECISION;
  }
  public QueryResult with_DATA_PRECISION(java.math.BigDecimal DATA_PRECISION) {
    this.DATA_PRECISION = DATA_PRECISION;
    return this;
  }
  private java.math.BigDecimal DATA_SCALE;
  public java.math.BigDecimal get_DATA_SCALE() {
    return DATA_SCALE;
  }
  public void set_DATA_SCALE(java.math.BigDecimal DATA_SCALE) {
    this.DATA_SCALE = DATA_SCALE;
  }
  public QueryResult with_DATA_SCALE(java.math.BigDecimal DATA_SCALE) {
    this.DATA_SCALE = DATA_SCALE;
    return this;
  }
  private java.math.BigDecimal COLUMN_ID;
  public java.math.BigDecimal get_COLUMN_ID() {
    return COLUMN_ID;
  }
  public void set_COLUMN_ID(java.math.BigDecimal COLUMN_ID) {
    this.COLUMN_ID = COLUMN_ID;
  }
  public QueryResult with_COLUMN_ID(java.math.BigDecimal COLUMN_ID) {
    this.COLUMN_ID = COLUMN_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.TABLE_NAME == null ? that.TABLE_NAME == null : this.TABLE_NAME.equals(that.TABLE_NAME));
    equal = equal && (this.COLUMN_NAME == null ? that.COLUMN_NAME == null : this.COLUMN_NAME.equals(that.COLUMN_NAME));
    equal = equal && (this.DATA_TYPE == null ? that.DATA_TYPE == null : this.DATA_TYPE.equals(that.DATA_TYPE));
    equal = equal && (this.DATA_LENGTH == null ? that.DATA_LENGTH == null : this.DATA_LENGTH.equals(that.DATA_LENGTH));
    equal = equal && (this.DATA_PRECISION == null ? that.DATA_PRECISION == null : this.DATA_PRECISION.equals(that.DATA_PRECISION));
    equal = equal && (this.DATA_SCALE == null ? that.DATA_SCALE == null : this.DATA_SCALE.equals(that.DATA_SCALE));
    equal = equal && (this.COLUMN_ID == null ? that.COLUMN_ID == null : this.COLUMN_ID.equals(that.COLUMN_ID));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.TABLE_NAME == null ? that.TABLE_NAME == null : this.TABLE_NAME.equals(that.TABLE_NAME));
    equal = equal && (this.COLUMN_NAME == null ? that.COLUMN_NAME == null : this.COLUMN_NAME.equals(that.COLUMN_NAME));
    equal = equal && (this.DATA_TYPE == null ? that.DATA_TYPE == null : this.DATA_TYPE.equals(that.DATA_TYPE));
    equal = equal && (this.DATA_LENGTH == null ? that.DATA_LENGTH == null : this.DATA_LENGTH.equals(that.DATA_LENGTH));
    equal = equal && (this.DATA_PRECISION == null ? that.DATA_PRECISION == null : this.DATA_PRECISION.equals(that.DATA_PRECISION));
    equal = equal && (this.DATA_SCALE == null ? that.DATA_SCALE == null : this.DATA_SCALE.equals(that.DATA_SCALE));
    equal = equal && (this.COLUMN_ID == null ? that.COLUMN_ID == null : this.COLUMN_ID.equals(that.COLUMN_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.TABLE_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.COLUMN_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.DATA_TYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.DATA_LENGTH = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DATA_PRECISION = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DATA_SCALE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.COLUMN_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.TABLE_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.COLUMN_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.DATA_TYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.DATA_LENGTH = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.DATA_PRECISION = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.DATA_SCALE = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.COLUMN_ID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
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
    JdbcWritableBridge.writeString(TABLE_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COLUMN_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATA_TYPE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_LENGTH, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_PRECISION, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_SCALE, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COLUMN_ID, 7 + __off, 2, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(TABLE_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COLUMN_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DATA_TYPE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_LENGTH, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_PRECISION, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DATA_SCALE, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COLUMN_ID, 7 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.TABLE_NAME = null;
    } else {
    this.TABLE_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COLUMN_NAME = null;
    } else {
    this.COLUMN_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_TYPE = null;
    } else {
    this.DATA_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_LENGTH = null;
    } else {
    this.DATA_LENGTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_PRECISION = null;
    } else {
    this.DATA_PRECISION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_SCALE = null;
    } else {
    this.DATA_SCALE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COLUMN_ID = null;
    } else {
    this.COLUMN_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.TABLE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_NAME);
    }
    if (null == this.COLUMN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COLUMN_NAME);
    }
    if (null == this.DATA_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_TYPE);
    }
    if (null == this.DATA_LENGTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_LENGTH, __dataOut);
    }
    if (null == this.DATA_PRECISION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_PRECISION, __dataOut);
    }
    if (null == this.DATA_SCALE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_SCALE, __dataOut);
    }
    if (null == this.COLUMN_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COLUMN_ID, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.TABLE_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TABLE_NAME);
    }
    if (null == this.COLUMN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COLUMN_NAME);
    }
    if (null == this.DATA_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DATA_TYPE);
    }
    if (null == this.DATA_LENGTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_LENGTH, __dataOut);
    }
    if (null == this.DATA_PRECISION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_PRECISION, __dataOut);
    }
    if (null == this.DATA_SCALE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DATA_SCALE, __dataOut);
    }
    if (null == this.COLUMN_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COLUMN_ID, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(TABLE_NAME==null?"null":TABLE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_NAME==null?"null":COLUMN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_TYPE==null?"null":DATA_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_LENGTH==null?"null":DATA_LENGTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_PRECISION==null?"null":DATA_PRECISION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SCALE==null?"null":DATA_SCALE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_ID==null?"null":COLUMN_ID.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(TABLE_NAME==null?"null":TABLE_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_NAME==null?"null":COLUMN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_TYPE==null?"null":DATA_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_LENGTH==null?"null":DATA_LENGTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_PRECISION==null?"null":DATA_PRECISION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_SCALE==null?"null":DATA_SCALE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COLUMN_ID==null?"null":COLUMN_ID.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_NAME = null; } else {
      this.TABLE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COLUMN_NAME = null; } else {
      this.COLUMN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATA_TYPE = null; } else {
      this.DATA_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_LENGTH = null; } else {
      this.DATA_LENGTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_PRECISION = null; } else {
      this.DATA_PRECISION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_SCALE = null; } else {
      this.DATA_SCALE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COLUMN_ID = null; } else {
      this.COLUMN_ID = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TABLE_NAME = null; } else {
      this.TABLE_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COLUMN_NAME = null; } else {
      this.COLUMN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DATA_TYPE = null; } else {
      this.DATA_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_LENGTH = null; } else {
      this.DATA_LENGTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_PRECISION = null; } else {
      this.DATA_PRECISION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_SCALE = null; } else {
      this.DATA_SCALE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COLUMN_ID = null; } else {
      this.COLUMN_ID = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("TABLE_NAME", this.TABLE_NAME);
    __sqoop$field_map.put("COLUMN_NAME", this.COLUMN_NAME);
    __sqoop$field_map.put("DATA_TYPE", this.DATA_TYPE);
    __sqoop$field_map.put("DATA_LENGTH", this.DATA_LENGTH);
    __sqoop$field_map.put("DATA_PRECISION", this.DATA_PRECISION);
    __sqoop$field_map.put("DATA_SCALE", this.DATA_SCALE);
    __sqoop$field_map.put("COLUMN_ID", this.COLUMN_ID);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("TABLE_NAME", this.TABLE_NAME);
    __sqoop$field_map.put("COLUMN_NAME", this.COLUMN_NAME);
    __sqoop$field_map.put("DATA_TYPE", this.DATA_TYPE);
    __sqoop$field_map.put("DATA_LENGTH", this.DATA_LENGTH);
    __sqoop$field_map.put("DATA_PRECISION", this.DATA_PRECISION);
    __sqoop$field_map.put("DATA_SCALE", this.DATA_SCALE);
    __sqoop$field_map.put("COLUMN_ID", this.COLUMN_ID);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
