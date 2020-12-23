// ORM class for table 'tblnz_indicatortaxprepprofile'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:50:50 NZDT 2020
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

public class tblnz_indicatortaxprepprofile extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fintProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fintProfileNumber = (Integer)value;
      }
    });
    setters.put("fstrAgentAssociation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fstrAgentAssociation = (String)value;
      }
    });
    setters.put("fstrAccountMgr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fstrAccountMgr = (String)value;
      }
    });
    setters.put("fstrExtensionOfTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fstrExtensionOfTime = (String)value;
      }
    });
    setters.put("fdtmEOTWithdrawalDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fdtmEOTWithdrawalDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_indicatortaxprepprofile.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_indicatortaxprepprofile() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_indicatortaxprepprofile with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_indicatortaxprepprofile with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_indicatortaxprepprofile with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private Integer fintProfileNumber;
  public Integer get_fintProfileNumber() {
    return fintProfileNumber;
  }
  public void set_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
  }
  public tblnz_indicatortaxprepprofile with_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
    return this;
  }
  private String fstrAgentAssociation;
  public String get_fstrAgentAssociation() {
    return fstrAgentAssociation;
  }
  public void set_fstrAgentAssociation(String fstrAgentAssociation) {
    this.fstrAgentAssociation = fstrAgentAssociation;
  }
  public tblnz_indicatortaxprepprofile with_fstrAgentAssociation(String fstrAgentAssociation) {
    this.fstrAgentAssociation = fstrAgentAssociation;
    return this;
  }
  private String fstrAccountMgr;
  public String get_fstrAccountMgr() {
    return fstrAccountMgr;
  }
  public void set_fstrAccountMgr(String fstrAccountMgr) {
    this.fstrAccountMgr = fstrAccountMgr;
  }
  public tblnz_indicatortaxprepprofile with_fstrAccountMgr(String fstrAccountMgr) {
    this.fstrAccountMgr = fstrAccountMgr;
    return this;
  }
  private String fstrExtensionOfTime;
  public String get_fstrExtensionOfTime() {
    return fstrExtensionOfTime;
  }
  public void set_fstrExtensionOfTime(String fstrExtensionOfTime) {
    this.fstrExtensionOfTime = fstrExtensionOfTime;
  }
  public tblnz_indicatortaxprepprofile with_fstrExtensionOfTime(String fstrExtensionOfTime) {
    this.fstrExtensionOfTime = fstrExtensionOfTime;
    return this;
  }
  private java.sql.Timestamp fdtmEOTWithdrawalDate;
  public java.sql.Timestamp get_fdtmEOTWithdrawalDate() {
    return fdtmEOTWithdrawalDate;
  }
  public void set_fdtmEOTWithdrawalDate(java.sql.Timestamp fdtmEOTWithdrawalDate) {
    this.fdtmEOTWithdrawalDate = fdtmEOTWithdrawalDate;
  }
  public tblnz_indicatortaxprepprofile with_fdtmEOTWithdrawalDate(java.sql.Timestamp fdtmEOTWithdrawalDate) {
    this.fdtmEOTWithdrawalDate = fdtmEOTWithdrawalDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_indicatortaxprepprofile with_fstrWho(String fstrWho) {
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
  public tblnz_indicatortaxprepprofile with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_indicatortaxprepprofile)) {
      return false;
    }
    tblnz_indicatortaxprepprofile that = (tblnz_indicatortaxprepprofile) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fstrAgentAssociation == null ? that.fstrAgentAssociation == null : this.fstrAgentAssociation.equals(that.fstrAgentAssociation));
    equal = equal && (this.fstrAccountMgr == null ? that.fstrAccountMgr == null : this.fstrAccountMgr.equals(that.fstrAccountMgr));
    equal = equal && (this.fstrExtensionOfTime == null ? that.fstrExtensionOfTime == null : this.fstrExtensionOfTime.equals(that.fstrExtensionOfTime));
    equal = equal && (this.fdtmEOTWithdrawalDate == null ? that.fdtmEOTWithdrawalDate == null : this.fdtmEOTWithdrawalDate.equals(that.fdtmEOTWithdrawalDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_indicatortaxprepprofile)) {
      return false;
    }
    tblnz_indicatortaxprepprofile that = (tblnz_indicatortaxprepprofile) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fstrAgentAssociation == null ? that.fstrAgentAssociation == null : this.fstrAgentAssociation.equals(that.fstrAgentAssociation));
    equal = equal && (this.fstrAccountMgr == null ? that.fstrAccountMgr == null : this.fstrAccountMgr.equals(that.fstrAccountMgr));
    equal = equal && (this.fstrExtensionOfTime == null ? that.fstrExtensionOfTime == null : this.fstrExtensionOfTime.equals(that.fstrExtensionOfTime));
    equal = equal && (this.fdtmEOTWithdrawalDate == null ? that.fdtmEOTWithdrawalDate == null : this.fdtmEOTWithdrawalDate.equals(that.fdtmEOTWithdrawalDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAgentAssociation = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAccountMgr = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrExtensionOfTime = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmEOTWithdrawalDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAgentAssociation = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAccountMgr = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrExtensionOfTime = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmEOTWithdrawalDate = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeString(fstrIRDNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgentAssociation, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountMgr, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtensionOfTime, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEOTWithdrawalDate, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgentAssociation, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountMgr, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtensionOfTime, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEOTWithdrawalDate, 8 + __off, 93, __dbStmt);
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
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfileNumber = null;
    } else {
    this.fintProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAgentAssociation = null;
    } else {
    this.fstrAgentAssociation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountMgr = null;
    } else {
    this.fstrAccountMgr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtensionOfTime = null;
    } else {
    this.fstrExtensionOfTime = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEOTWithdrawalDate = null;
    } else {
    this.fdtmEOTWithdrawalDate = new Timestamp(__dataIn.readLong());
    this.fdtmEOTWithdrawalDate.setNanos(__dataIn.readInt());
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fstrAgentAssociation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgentAssociation);
    }
    if (null == this.fstrAccountMgr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountMgr);
    }
    if (null == this.fstrExtensionOfTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtensionOfTime);
    }
    if (null == this.fdtmEOTWithdrawalDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEOTWithdrawalDate.getTime());
    __dataOut.writeInt(this.fdtmEOTWithdrawalDate.getNanos());
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
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fstrAgentAssociation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgentAssociation);
    }
    if (null == this.fstrAccountMgr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountMgr);
    }
    if (null == this.fstrExtensionOfTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtensionOfTime);
    }
    if (null == this.fdtmEOTWithdrawalDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEOTWithdrawalDate.getTime());
    __dataOut.writeInt(this.fdtmEOTWithdrawalDate.getNanos());
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgentAssociation==null?"\\N":fstrAgentAssociation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountMgr==null?"\\N":fstrAccountMgr, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtensionOfTime==null?"\\N":fstrExtensionOfTime, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEOTWithdrawalDate==null?"\\N":"" + fdtmEOTWithdrawalDate, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgentAssociation==null?"\\N":fstrAgentAssociation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountMgr==null?"\\N":fstrAccountMgr, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtensionOfTime==null?"\\N":fstrExtensionOfTime, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEOTWithdrawalDate==null?"\\N":"" + fdtmEOTWithdrawalDate, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgentAssociation = null; } else {
      this.fstrAgentAssociation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountMgr = null; } else {
      this.fstrAccountMgr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtensionOfTime = null; } else {
      this.fstrExtensionOfTime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEOTWithdrawalDate = null; } else {
      this.fdtmEOTWithdrawalDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgentAssociation = null; } else {
      this.fstrAgentAssociation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountMgr = null; } else {
      this.fstrAccountMgr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtensionOfTime = null; } else {
      this.fstrExtensionOfTime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEOTWithdrawalDate = null; } else {
      this.fdtmEOTWithdrawalDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_indicatortaxprepprofile o = (tblnz_indicatortaxprepprofile) super.clone();
    o.fdtmEOTWithdrawalDate = (o.fdtmEOTWithdrawalDate != null) ? (java.sql.Timestamp) o.fdtmEOTWithdrawalDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_indicatortaxprepprofile o) throws CloneNotSupportedException {
    o.fdtmEOTWithdrawalDate = (o.fdtmEOTWithdrawalDate != null) ? (java.sql.Timestamp) o.fdtmEOTWithdrawalDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fstrAgentAssociation", this.fstrAgentAssociation);
    __sqoop$field_map.put("fstrAccountMgr", this.fstrAccountMgr);
    __sqoop$field_map.put("fstrExtensionOfTime", this.fstrExtensionOfTime);
    __sqoop$field_map.put("fdtmEOTWithdrawalDate", this.fdtmEOTWithdrawalDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fstrAgentAssociation", this.fstrAgentAssociation);
    __sqoop$field_map.put("fstrAccountMgr", this.fstrAccountMgr);
    __sqoop$field_map.put("fstrExtensionOfTime", this.fstrExtensionOfTime);
    __sqoop$field_map.put("fdtmEOTWithdrawalDate", this.fdtmEOTWithdrawalDate);
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
