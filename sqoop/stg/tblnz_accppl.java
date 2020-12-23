// ORM class for table 'tblnz_accppl'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:40:03 NZDT 2020
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

public class tblnz_accppl extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCeaseReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fstrCeaseReason = (String)value;
      }
    });
    setters.put("fdtmAppRcptDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fdtmAppRcptDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmChildDueBirthDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fdtmChildDueBirthDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPartnerIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fstrPartnerIRDNumber = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accppl.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accppl() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accppl with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_accppl with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnz_accppl with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblnz_accppl with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private String fstrCeaseReason;
  public String get_fstrCeaseReason() {
    return fstrCeaseReason;
  }
  public void set_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
  }
  public tblnz_accppl with_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
    return this;
  }
  private java.sql.Timestamp fdtmAppRcptDate;
  public java.sql.Timestamp get_fdtmAppRcptDate() {
    return fdtmAppRcptDate;
  }
  public void set_fdtmAppRcptDate(java.sql.Timestamp fdtmAppRcptDate) {
    this.fdtmAppRcptDate = fdtmAppRcptDate;
  }
  public tblnz_accppl with_fdtmAppRcptDate(java.sql.Timestamp fdtmAppRcptDate) {
    this.fdtmAppRcptDate = fdtmAppRcptDate;
    return this;
  }
  private java.sql.Timestamp fdtmChildDueBirthDate;
  public java.sql.Timestamp get_fdtmChildDueBirthDate() {
    return fdtmChildDueBirthDate;
  }
  public void set_fdtmChildDueBirthDate(java.sql.Timestamp fdtmChildDueBirthDate) {
    this.fdtmChildDueBirthDate = fdtmChildDueBirthDate;
  }
  public tblnz_accppl with_fdtmChildDueBirthDate(java.sql.Timestamp fdtmChildDueBirthDate) {
    this.fdtmChildDueBirthDate = fdtmChildDueBirthDate;
    return this;
  }
  private String fstrPartnerIRDNumber;
  public String get_fstrPartnerIRDNumber() {
    return fstrPartnerIRDNumber;
  }
  public void set_fstrPartnerIRDNumber(String fstrPartnerIRDNumber) {
    this.fstrPartnerIRDNumber = fstrPartnerIRDNumber;
  }
  public tblnz_accppl with_fstrPartnerIRDNumber(String fstrPartnerIRDNumber) {
    this.fstrPartnerIRDNumber = fstrPartnerIRDNumber;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accppl with_fstrWho(String fstrWho) {
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
  public tblnz_accppl with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accppl)) {
      return false;
    }
    tblnz_accppl that = (tblnz_accppl) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fdtmAppRcptDate == null ? that.fdtmAppRcptDate == null : this.fdtmAppRcptDate.equals(that.fdtmAppRcptDate));
    equal = equal && (this.fdtmChildDueBirthDate == null ? that.fdtmChildDueBirthDate == null : this.fdtmChildDueBirthDate.equals(that.fdtmChildDueBirthDate));
    equal = equal && (this.fstrPartnerIRDNumber == null ? that.fstrPartnerIRDNumber == null : this.fstrPartnerIRDNumber.equals(that.fstrPartnerIRDNumber));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accppl)) {
      return false;
    }
    tblnz_accppl that = (tblnz_accppl) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fdtmAppRcptDate == null ? that.fdtmAppRcptDate == null : this.fdtmAppRcptDate.equals(that.fdtmAppRcptDate));
    equal = equal && (this.fdtmChildDueBirthDate == null ? that.fdtmChildDueBirthDate == null : this.fdtmChildDueBirthDate.equals(that.fdtmChildDueBirthDate));
    equal = equal && (this.fstrPartnerIRDNumber == null ? that.fstrPartnerIRDNumber == null : this.fstrPartnerIRDNumber.equals(that.fstrPartnerIRDNumber));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmAppRcptDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmChildDueBirthDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrPartnerIRDNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmAppRcptDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmChildDueBirthDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrPartnerIRDNumber = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAppRcptDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChildDueBirthDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRDNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAppRcptDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmChildDueBirthDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRDNumber, 8 + __off, -9, __dbStmt);
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
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCeaseReason = null;
    } else {
    this.fstrCeaseReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAppRcptDate = null;
    } else {
    this.fdtmAppRcptDate = new Timestamp(__dataIn.readLong());
    this.fdtmAppRcptDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmChildDueBirthDate = null;
    } else {
    this.fdtmChildDueBirthDate = new Timestamp(__dataIn.readLong());
    this.fdtmChildDueBirthDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartnerIRDNumber = null;
    } else {
    this.fstrPartnerIRDNumber = Text.readString(__dataIn);
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
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fdtmAppRcptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAppRcptDate.getTime());
    __dataOut.writeInt(this.fdtmAppRcptDate.getNanos());
    }
    if (null == this.fdtmChildDueBirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChildDueBirthDate.getTime());
    __dataOut.writeInt(this.fdtmChildDueBirthDate.getNanos());
    }
    if (null == this.fstrPartnerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRDNumber);
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
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fdtmAppRcptDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAppRcptDate.getTime());
    __dataOut.writeInt(this.fdtmAppRcptDate.getNanos());
    }
    if (null == this.fdtmChildDueBirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmChildDueBirthDate.getTime());
    __dataOut.writeInt(this.fdtmChildDueBirthDate.getNanos());
    }
    if (null == this.fstrPartnerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRDNumber);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAppRcptDate==null?"\\N":"" + fdtmAppRcptDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChildDueBirthDate==null?"\\N":"" + fdtmChildDueBirthDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRDNumber==null?"\\N":fstrPartnerIRDNumber, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAppRcptDate==null?"\\N":"" + fdtmAppRcptDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmChildDueBirthDate==null?"\\N":"" + fdtmChildDueBirthDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRDNumber==null?"\\N":fstrPartnerIRDNumber, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAppRcptDate = null; } else {
      this.fdtmAppRcptDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChildDueBirthDate = null; } else {
      this.fdtmChildDueBirthDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRDNumber = null; } else {
      this.fstrPartnerIRDNumber = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAppRcptDate = null; } else {
      this.fdtmAppRcptDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmChildDueBirthDate = null; } else {
      this.fdtmChildDueBirthDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRDNumber = null; } else {
      this.fstrPartnerIRDNumber = __cur_str;
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
    tblnz_accppl o = (tblnz_accppl) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmAppRcptDate = (o.fdtmAppRcptDate != null) ? (java.sql.Timestamp) o.fdtmAppRcptDate.clone() : null;
    o.fdtmChildDueBirthDate = (o.fdtmChildDueBirthDate != null) ? (java.sql.Timestamp) o.fdtmChildDueBirthDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accppl o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmAppRcptDate = (o.fdtmAppRcptDate != null) ? (java.sql.Timestamp) o.fdtmAppRcptDate.clone() : null;
    o.fdtmChildDueBirthDate = (o.fdtmChildDueBirthDate != null) ? (java.sql.Timestamp) o.fdtmChildDueBirthDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fdtmAppRcptDate", this.fdtmAppRcptDate);
    __sqoop$field_map.put("fdtmChildDueBirthDate", this.fdtmChildDueBirthDate);
    __sqoop$field_map.put("fstrPartnerIRDNumber", this.fstrPartnerIRDNumber);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fdtmAppRcptDate", this.fdtmAppRcptDate);
    __sqoop$field_map.put("fdtmChildDueBirthDate", this.fdtmChildDueBirthDate);
    __sqoop$field_map.put("fstrPartnerIRDNumber", this.fstrPartnerIRDNumber);
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
