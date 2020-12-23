// ORM class for table 'lanlinktype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:52:44 NZDT 2020
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

public class lanlinktype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrLanguage = (String)value;
      }
    });
    setters.put("fstrLinkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrLinkType = (String)value;
      }
    });
    setters.put("fstrDecode1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecode1 = (String)value;
      }
    });
    setters.put("fstrDecode2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecode2 = (String)value;
      }
    });
    setters.put("fstrDecodeReverse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecodeReverse = (String)value;
      }
    });
    setters.put("fstrDecode2Reverse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecode2Reverse = (String)value;
      }
    });
    setters.put("fstrFromDecode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrFromDecode = (String)value;
      }
    });
    setters.put("fstrToDecode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrToDecode = (String)value;
      }
    });
    setters.put("fstrDecodeWeb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecodeWeb = (String)value;
      }
    });
    setters.put("fstrDecodeWebReverse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDecodeWebReverse = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        lanlinktype.this.fstrDescription = (String)value;
      }
    });
  }
  public lanlinktype() {
    init0();
  }
  private String fstrLanguage;
  public String get_fstrLanguage() {
    return fstrLanguage;
  }
  public void set_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
  }
  public lanlinktype with_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
    return this;
  }
  private String fstrLinkType;
  public String get_fstrLinkType() {
    return fstrLinkType;
  }
  public void set_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
  }
  public lanlinktype with_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
    return this;
  }
  private String fstrDecode1;
  public String get_fstrDecode1() {
    return fstrDecode1;
  }
  public void set_fstrDecode1(String fstrDecode1) {
    this.fstrDecode1 = fstrDecode1;
  }
  public lanlinktype with_fstrDecode1(String fstrDecode1) {
    this.fstrDecode1 = fstrDecode1;
    return this;
  }
  private String fstrDecode2;
  public String get_fstrDecode2() {
    return fstrDecode2;
  }
  public void set_fstrDecode2(String fstrDecode2) {
    this.fstrDecode2 = fstrDecode2;
  }
  public lanlinktype with_fstrDecode2(String fstrDecode2) {
    this.fstrDecode2 = fstrDecode2;
    return this;
  }
  private String fstrDecodeReverse;
  public String get_fstrDecodeReverse() {
    return fstrDecodeReverse;
  }
  public void set_fstrDecodeReverse(String fstrDecodeReverse) {
    this.fstrDecodeReverse = fstrDecodeReverse;
  }
  public lanlinktype with_fstrDecodeReverse(String fstrDecodeReverse) {
    this.fstrDecodeReverse = fstrDecodeReverse;
    return this;
  }
  private String fstrDecode2Reverse;
  public String get_fstrDecode2Reverse() {
    return fstrDecode2Reverse;
  }
  public void set_fstrDecode2Reverse(String fstrDecode2Reverse) {
    this.fstrDecode2Reverse = fstrDecode2Reverse;
  }
  public lanlinktype with_fstrDecode2Reverse(String fstrDecode2Reverse) {
    this.fstrDecode2Reverse = fstrDecode2Reverse;
    return this;
  }
  private String fstrFromDecode;
  public String get_fstrFromDecode() {
    return fstrFromDecode;
  }
  public void set_fstrFromDecode(String fstrFromDecode) {
    this.fstrFromDecode = fstrFromDecode;
  }
  public lanlinktype with_fstrFromDecode(String fstrFromDecode) {
    this.fstrFromDecode = fstrFromDecode;
    return this;
  }
  private String fstrToDecode;
  public String get_fstrToDecode() {
    return fstrToDecode;
  }
  public void set_fstrToDecode(String fstrToDecode) {
    this.fstrToDecode = fstrToDecode;
  }
  public lanlinktype with_fstrToDecode(String fstrToDecode) {
    this.fstrToDecode = fstrToDecode;
    return this;
  }
  private String fstrDecodeWeb;
  public String get_fstrDecodeWeb() {
    return fstrDecodeWeb;
  }
  public void set_fstrDecodeWeb(String fstrDecodeWeb) {
    this.fstrDecodeWeb = fstrDecodeWeb;
  }
  public lanlinktype with_fstrDecodeWeb(String fstrDecodeWeb) {
    this.fstrDecodeWeb = fstrDecodeWeb;
    return this;
  }
  private String fstrDecodeWebReverse;
  public String get_fstrDecodeWebReverse() {
    return fstrDecodeWebReverse;
  }
  public void set_fstrDecodeWebReverse(String fstrDecodeWebReverse) {
    this.fstrDecodeWebReverse = fstrDecodeWebReverse;
  }
  public lanlinktype with_fstrDecodeWebReverse(String fstrDecodeWebReverse) {
    this.fstrDecodeWebReverse = fstrDecodeWebReverse;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public lanlinktype with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanlinktype)) {
      return false;
    }
    lanlinktype that = (lanlinktype) o;
    boolean equal = true;
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fstrDecode1 == null ? that.fstrDecode1 == null : this.fstrDecode1.equals(that.fstrDecode1));
    equal = equal && (this.fstrDecode2 == null ? that.fstrDecode2 == null : this.fstrDecode2.equals(that.fstrDecode2));
    equal = equal && (this.fstrDecodeReverse == null ? that.fstrDecodeReverse == null : this.fstrDecodeReverse.equals(that.fstrDecodeReverse));
    equal = equal && (this.fstrDecode2Reverse == null ? that.fstrDecode2Reverse == null : this.fstrDecode2Reverse.equals(that.fstrDecode2Reverse));
    equal = equal && (this.fstrFromDecode == null ? that.fstrFromDecode == null : this.fstrFromDecode.equals(that.fstrFromDecode));
    equal = equal && (this.fstrToDecode == null ? that.fstrToDecode == null : this.fstrToDecode.equals(that.fstrToDecode));
    equal = equal && (this.fstrDecodeWeb == null ? that.fstrDecodeWeb == null : this.fstrDecodeWeb.equals(that.fstrDecodeWeb));
    equal = equal && (this.fstrDecodeWebReverse == null ? that.fstrDecodeWebReverse == null : this.fstrDecodeWebReverse.equals(that.fstrDecodeWebReverse));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof lanlinktype)) {
      return false;
    }
    lanlinktype that = (lanlinktype) o;
    boolean equal = true;
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fstrDecode1 == null ? that.fstrDecode1 == null : this.fstrDecode1.equals(that.fstrDecode1));
    equal = equal && (this.fstrDecode2 == null ? that.fstrDecode2 == null : this.fstrDecode2.equals(that.fstrDecode2));
    equal = equal && (this.fstrDecodeReverse == null ? that.fstrDecodeReverse == null : this.fstrDecodeReverse.equals(that.fstrDecodeReverse));
    equal = equal && (this.fstrDecode2Reverse == null ? that.fstrDecode2Reverse == null : this.fstrDecode2Reverse.equals(that.fstrDecode2Reverse));
    equal = equal && (this.fstrFromDecode == null ? that.fstrFromDecode == null : this.fstrFromDecode.equals(that.fstrFromDecode));
    equal = equal && (this.fstrToDecode == null ? that.fstrToDecode == null : this.fstrToDecode.equals(that.fstrToDecode));
    equal = equal && (this.fstrDecodeWeb == null ? that.fstrDecodeWeb == null : this.fstrDecodeWeb.equals(that.fstrDecodeWeb));
    equal = equal && (this.fstrDecodeWebReverse == null ? that.fstrDecodeWebReverse == null : this.fstrDecodeWebReverse.equals(that.fstrDecodeWebReverse));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrLanguage = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrDecode1 = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrDecode2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDecodeReverse = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrDecode2Reverse = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrFromDecode = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrToDecode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrDecodeWeb = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDecodeWebReverse = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrLanguage = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrDecode1 = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrDecode2 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrDecodeReverse = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrDecode2Reverse = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrFromDecode = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrToDecode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrDecodeWeb = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDecodeWebReverse = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(11, __dbResults);
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
    JdbcWritableBridge.writeString(fstrLanguage, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeReverse, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode2Reverse, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFromDecode, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrToDecode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWebReverse, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 11 + __off, -9, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrLanguage, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode1, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode2, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeReverse, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecode2Reverse, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFromDecode, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrToDecode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWeb, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDecodeWebReverse, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 11 + __off, -9, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrLanguage = null;
    } else {
    this.fstrLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLinkType = null;
    } else {
    this.fstrLinkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecode1 = null;
    } else {
    this.fstrDecode1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecode2 = null;
    } else {
    this.fstrDecode2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecodeReverse = null;
    } else {
    this.fstrDecodeReverse = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecode2Reverse = null;
    } else {
    this.fstrDecode2Reverse = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFromDecode = null;
    } else {
    this.fstrFromDecode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrToDecode = null;
    } else {
    this.fstrToDecode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecodeWeb = null;
    } else {
    this.fstrDecodeWeb = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDecodeWebReverse = null;
    } else {
    this.fstrDecodeWebReverse = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fstrDecode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode1);
    }
    if (null == this.fstrDecode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode2);
    }
    if (null == this.fstrDecodeReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeReverse);
    }
    if (null == this.fstrDecode2Reverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode2Reverse);
    }
    if (null == this.fstrFromDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFromDecode);
    }
    if (null == this.fstrToDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrToDecode);
    }
    if (null == this.fstrDecodeWeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb);
    }
    if (null == this.fstrDecodeWebReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWebReverse);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fstrDecode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode1);
    }
    if (null == this.fstrDecode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode2);
    }
    if (null == this.fstrDecodeReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeReverse);
    }
    if (null == this.fstrDecode2Reverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecode2Reverse);
    }
    if (null == this.fstrFromDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFromDecode);
    }
    if (null == this.fstrToDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrToDecode);
    }
    if (null == this.fstrDecodeWeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWeb);
    }
    if (null == this.fstrDecodeWebReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDecodeWebReverse);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode1==null?"\\N":fstrDecode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode2==null?"\\N":fstrDecode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeReverse==null?"\\N":fstrDecodeReverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode2Reverse==null?"\\N":fstrDecode2Reverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFromDecode==null?"\\N":fstrFromDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrToDecode==null?"\\N":fstrToDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb==null?"\\N":fstrDecodeWeb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWebReverse==null?"\\N":fstrDecodeWebReverse, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode1==null?"\\N":fstrDecode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode2==null?"\\N":fstrDecode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeReverse==null?"\\N":fstrDecodeReverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecode2Reverse==null?"\\N":fstrDecode2Reverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFromDecode==null?"\\N":fstrFromDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrToDecode==null?"\\N":fstrToDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWeb==null?"\\N":fstrDecodeWeb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDecodeWebReverse==null?"\\N":fstrDecodeWebReverse, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrLanguage = null; } else {
      this.fstrLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode1 = null; } else {
      this.fstrDecode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode2 = null; } else {
      this.fstrDecode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecodeReverse = null; } else {
      this.fstrDecodeReverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode2Reverse = null; } else {
      this.fstrDecode2Reverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFromDecode = null; } else {
      this.fstrFromDecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrToDecode = null; } else {
      this.fstrToDecode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDecodeWebReverse = null; } else {
      this.fstrDecodeWebReverse = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrLanguage = null; } else {
      this.fstrLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode1 = null; } else {
      this.fstrDecode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode2 = null; } else {
      this.fstrDecode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecodeReverse = null; } else {
      this.fstrDecodeReverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDecode2Reverse = null; } else {
      this.fstrDecode2Reverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFromDecode = null; } else {
      this.fstrFromDecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrToDecode = null; } else {
      this.fstrToDecode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDecodeWebReverse = null; } else {
      this.fstrDecodeWebReverse = __cur_str;
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
    lanlinktype o = (lanlinktype) super.clone();
    return o;
  }

  public void clone0(lanlinktype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fstrDecode1", this.fstrDecode1);
    __sqoop$field_map.put("fstrDecode2", this.fstrDecode2);
    __sqoop$field_map.put("fstrDecodeReverse", this.fstrDecodeReverse);
    __sqoop$field_map.put("fstrDecode2Reverse", this.fstrDecode2Reverse);
    __sqoop$field_map.put("fstrFromDecode", this.fstrFromDecode);
    __sqoop$field_map.put("fstrToDecode", this.fstrToDecode);
    __sqoop$field_map.put("fstrDecodeWeb", this.fstrDecodeWeb);
    __sqoop$field_map.put("fstrDecodeWebReverse", this.fstrDecodeWebReverse);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fstrDecode1", this.fstrDecode1);
    __sqoop$field_map.put("fstrDecode2", this.fstrDecode2);
    __sqoop$field_map.put("fstrDecodeReverse", this.fstrDecodeReverse);
    __sqoop$field_map.put("fstrDecode2Reverse", this.fstrDecode2Reverse);
    __sqoop$field_map.put("fstrFromDecode", this.fstrFromDecode);
    __sqoop$field_map.put("fstrToDecode", this.fstrToDecode);
    __sqoop$field_map.put("fstrDecodeWeb", this.fstrDecodeWeb);
    __sqoop$field_map.put("fstrDecodeWebReverse", this.fstrDecodeWebReverse);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
