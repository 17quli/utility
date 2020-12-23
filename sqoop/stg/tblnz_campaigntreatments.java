// ORM class for table 'tblnz_campaigntreatments'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:56:55 NZDT 2020
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

public class tblnz_campaigntreatments extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fintTreatment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fintTreatment = (Integer)value;
      }
    });
    setters.put("fstrTreatment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrTreatment = (String)value;
      }
    });
    setters.put("fstrTreatmentDecode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrTreatmentDecode = (String)value;
      }
    });
    setters.put("fstrResult", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrResult = (String)value;
      }
    });
    setters.put("fstrResultListItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrResultListItem = (String)value;
      }
    });
    setters.put("fstrTreatmentNotes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrTreatmentNotes = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_campaigntreatments.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_campaigntreatments() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_campaigntreatments with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_campaigntreatments with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private Integer fintTreatment;
  public Integer get_fintTreatment() {
    return fintTreatment;
  }
  public void set_fintTreatment(Integer fintTreatment) {
    this.fintTreatment = fintTreatment;
  }
  public tblnz_campaigntreatments with_fintTreatment(Integer fintTreatment) {
    this.fintTreatment = fintTreatment;
    return this;
  }
  private String fstrTreatment;
  public String get_fstrTreatment() {
    return fstrTreatment;
  }
  public void set_fstrTreatment(String fstrTreatment) {
    this.fstrTreatment = fstrTreatment;
  }
  public tblnz_campaigntreatments with_fstrTreatment(String fstrTreatment) {
    this.fstrTreatment = fstrTreatment;
    return this;
  }
  private String fstrTreatmentDecode;
  public String get_fstrTreatmentDecode() {
    return fstrTreatmentDecode;
  }
  public void set_fstrTreatmentDecode(String fstrTreatmentDecode) {
    this.fstrTreatmentDecode = fstrTreatmentDecode;
  }
  public tblnz_campaigntreatments with_fstrTreatmentDecode(String fstrTreatmentDecode) {
    this.fstrTreatmentDecode = fstrTreatmentDecode;
    return this;
  }
  private String fstrResult;
  public String get_fstrResult() {
    return fstrResult;
  }
  public void set_fstrResult(String fstrResult) {
    this.fstrResult = fstrResult;
  }
  public tblnz_campaigntreatments with_fstrResult(String fstrResult) {
    this.fstrResult = fstrResult;
    return this;
  }
  private String fstrResultListItem;
  public String get_fstrResultListItem() {
    return fstrResultListItem;
  }
  public void set_fstrResultListItem(String fstrResultListItem) {
    this.fstrResultListItem = fstrResultListItem;
  }
  public tblnz_campaigntreatments with_fstrResultListItem(String fstrResultListItem) {
    this.fstrResultListItem = fstrResultListItem;
    return this;
  }
  private String fstrTreatmentNotes;
  public String get_fstrTreatmentNotes() {
    return fstrTreatmentNotes;
  }
  public void set_fstrTreatmentNotes(String fstrTreatmentNotes) {
    this.fstrTreatmentNotes = fstrTreatmentNotes;
  }
  public tblnz_campaigntreatments with_fstrTreatmentNotes(String fstrTreatmentNotes) {
    this.fstrTreatmentNotes = fstrTreatmentNotes;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_campaigntreatments with_fstrWho(String fstrWho) {
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
  public tblnz_campaigntreatments with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_campaigntreatments)) {
      return false;
    }
    tblnz_campaigntreatments that = (tblnz_campaigntreatments) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fintTreatment == null ? that.fintTreatment == null : this.fintTreatment.equals(that.fintTreatment));
    equal = equal && (this.fstrTreatment == null ? that.fstrTreatment == null : this.fstrTreatment.equals(that.fstrTreatment));
    equal = equal && (this.fstrTreatmentDecode == null ? that.fstrTreatmentDecode == null : this.fstrTreatmentDecode.equals(that.fstrTreatmentDecode));
    equal = equal && (this.fstrResult == null ? that.fstrResult == null : this.fstrResult.equals(that.fstrResult));
    equal = equal && (this.fstrResultListItem == null ? that.fstrResultListItem == null : this.fstrResultListItem.equals(that.fstrResultListItem));
    equal = equal && (this.fstrTreatmentNotes == null ? that.fstrTreatmentNotes == null : this.fstrTreatmentNotes.equals(that.fstrTreatmentNotes));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_campaigntreatments)) {
      return false;
    }
    tblnz_campaigntreatments that = (tblnz_campaigntreatments) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fintTreatment == null ? that.fintTreatment == null : this.fintTreatment.equals(that.fintTreatment));
    equal = equal && (this.fstrTreatment == null ? that.fstrTreatment == null : this.fstrTreatment.equals(that.fstrTreatment));
    equal = equal && (this.fstrTreatmentDecode == null ? that.fstrTreatmentDecode == null : this.fstrTreatmentDecode.equals(that.fstrTreatmentDecode));
    equal = equal && (this.fstrResult == null ? that.fstrResult == null : this.fstrResult.equals(that.fstrResult));
    equal = equal && (this.fstrResultListItem == null ? that.fstrResultListItem == null : this.fstrResultListItem.equals(that.fstrResultListItem));
    equal = equal && (this.fstrTreatmentNotes == null ? that.fstrTreatmentNotes == null : this.fstrTreatmentNotes.equals(that.fstrTreatmentNotes));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintTreatment = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrTreatment = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrTreatmentDecode = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrResult = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrResultListItem = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTreatmentNotes = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintTreatment = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrTreatment = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrTreatmentDecode = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrResult = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrResultListItem = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTreatmentNotes = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTreatment, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatmentDecode, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResult, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResultListItem, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatmentNotes, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTreatment, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatmentDecode, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResult, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResultListItem, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTreatmentNotes, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintTreatment = null;
    } else {
    this.fintTreatment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTreatment = null;
    } else {
    this.fstrTreatment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTreatmentDecode = null;
    } else {
    this.fstrTreatmentDecode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResult = null;
    } else {
    this.fstrResult = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResultListItem = null;
    } else {
    this.fstrResultListItem = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTreatmentNotes = null;
    } else {
    this.fstrTreatmentNotes = Text.readString(__dataIn);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fintTreatment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTreatment);
    }
    if (null == this.fstrTreatment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatment);
    }
    if (null == this.fstrTreatmentDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatmentDecode);
    }
    if (null == this.fstrResult) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResult);
    }
    if (null == this.fstrResultListItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResultListItem);
    }
    if (null == this.fstrTreatmentNotes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatmentNotes);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fintTreatment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTreatment);
    }
    if (null == this.fstrTreatment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatment);
    }
    if (null == this.fstrTreatmentDecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatmentDecode);
    }
    if (null == this.fstrResult) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResult);
    }
    if (null == this.fstrResultListItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResultListItem);
    }
    if (null == this.fstrTreatmentNotes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTreatmentNotes);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTreatment==null?"\\N":"" + fintTreatment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatment==null?"\\N":fstrTreatment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatmentDecode==null?"\\N":fstrTreatmentDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResult==null?"\\N":fstrResult, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResultListItem==null?"\\N":fstrResultListItem, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatmentNotes==null?"\\N":fstrTreatmentNotes, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTreatment==null?"\\N":"" + fintTreatment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatment==null?"\\N":fstrTreatment, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatmentDecode==null?"\\N":fstrTreatmentDecode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResult==null?"\\N":fstrResult, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResultListItem==null?"\\N":fstrResultListItem, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTreatmentNotes==null?"\\N":fstrTreatmentNotes, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTreatment = null; } else {
      this.fintTreatment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatment = null; } else {
      this.fstrTreatment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatmentDecode = null; } else {
      this.fstrTreatmentDecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResult = null; } else {
      this.fstrResult = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResultListItem = null; } else {
      this.fstrResultListItem = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatmentNotes = null; } else {
      this.fstrTreatmentNotes = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTreatment = null; } else {
      this.fintTreatment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatment = null; } else {
      this.fstrTreatment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatmentDecode = null; } else {
      this.fstrTreatmentDecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResult = null; } else {
      this.fstrResult = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResultListItem = null; } else {
      this.fstrResultListItem = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTreatmentNotes = null; } else {
      this.fstrTreatmentNotes = __cur_str;
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
    tblnz_campaigntreatments o = (tblnz_campaigntreatments) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_campaigntreatments o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fintTreatment", this.fintTreatment);
    __sqoop$field_map.put("fstrTreatment", this.fstrTreatment);
    __sqoop$field_map.put("fstrTreatmentDecode", this.fstrTreatmentDecode);
    __sqoop$field_map.put("fstrResult", this.fstrResult);
    __sqoop$field_map.put("fstrResultListItem", this.fstrResultListItem);
    __sqoop$field_map.put("fstrTreatmentNotes", this.fstrTreatmentNotes);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fintTreatment", this.fintTreatment);
    __sqoop$field_map.put("fstrTreatment", this.fstrTreatment);
    __sqoop$field_map.put("fstrTreatmentDecode", this.fstrTreatmentDecode);
    __sqoop$field_map.put("fstrResult", this.fstrResult);
    __sqoop$field_map.put("fstrResultListItem", this.fstrResultListItem);
    __sqoop$field_map.put("fstrTreatmentNotes", this.fstrTreatmentNotes);
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
