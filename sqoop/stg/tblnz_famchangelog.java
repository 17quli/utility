// ORM class for table 'tblnz_famchangelog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:41:18 NZDT 2020
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

public class tblnz_famchangelog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ChangeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fi64ChangeKey = (Long)value;
      }
    });
    setters.put("fstrChangeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fstrChangeType = (String)value;
      }
    });
    setters.put("flngLinkedCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.flngLinkedCustomerKey = (Integer)value;
      }
    });
    setters.put("fdtmEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fdtmEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("fintRelationshipPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fintRelationshipPeriod = (Integer)value;
      }
    });
    setters.put("fintEntitlementPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fintEntitlementPeriod = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchangelog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famchangelog() {
    init0();
  }
  private Long fi64ChangeKey;
  public Long get_fi64ChangeKey() {
    return fi64ChangeKey;
  }
  public void set_fi64ChangeKey(Long fi64ChangeKey) {
    this.fi64ChangeKey = fi64ChangeKey;
  }
  public tblnz_famchangelog with_fi64ChangeKey(Long fi64ChangeKey) {
    this.fi64ChangeKey = fi64ChangeKey;
    return this;
  }
  private String fstrChangeType;
  public String get_fstrChangeType() {
    return fstrChangeType;
  }
  public void set_fstrChangeType(String fstrChangeType) {
    this.fstrChangeType = fstrChangeType;
  }
  public tblnz_famchangelog with_fstrChangeType(String fstrChangeType) {
    this.fstrChangeType = fstrChangeType;
    return this;
  }
  private Integer flngLinkedCustomerKey;
  public Integer get_flngLinkedCustomerKey() {
    return flngLinkedCustomerKey;
  }
  public void set_flngLinkedCustomerKey(Integer flngLinkedCustomerKey) {
    this.flngLinkedCustomerKey = flngLinkedCustomerKey;
  }
  public tblnz_famchangelog with_flngLinkedCustomerKey(Integer flngLinkedCustomerKey) {
    this.flngLinkedCustomerKey = flngLinkedCustomerKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveDate;
  public java.sql.Timestamp get_fdtmEffectiveDate() {
    return fdtmEffectiveDate;
  }
  public void set_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
  }
  public tblnz_famchangelog with_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
    return this;
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famchangelog with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private Integer fintRelationshipPeriod;
  public Integer get_fintRelationshipPeriod() {
    return fintRelationshipPeriod;
  }
  public void set_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
  }
  public tblnz_famchangelog with_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
    return this;
  }
  private Integer fintEntitlementPeriod;
  public Integer get_fintEntitlementPeriod() {
    return fintEntitlementPeriod;
  }
  public void set_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
  }
  public tblnz_famchangelog with_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_famchangelog with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_famchangelog with_fstrWho(String fstrWho) {
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
  public tblnz_famchangelog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famchangelog)) {
      return false;
    }
    tblnz_famchangelog that = (tblnz_famchangelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ChangeKey == null ? that.fi64ChangeKey == null : this.fi64ChangeKey.equals(that.fi64ChangeKey));
    equal = equal && (this.fstrChangeType == null ? that.fstrChangeType == null : this.fstrChangeType.equals(that.fstrChangeType));
    equal = equal && (this.flngLinkedCustomerKey == null ? that.flngLinkedCustomerKey == null : this.flngLinkedCustomerKey.equals(that.flngLinkedCustomerKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famchangelog)) {
      return false;
    }
    tblnz_famchangelog that = (tblnz_famchangelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ChangeKey == null ? that.fi64ChangeKey == null : this.fi64ChangeKey.equals(that.fi64ChangeKey));
    equal = equal && (this.fstrChangeType == null ? that.fstrChangeType == null : this.fstrChangeType.equals(that.fstrChangeType));
    equal = equal && (this.flngLinkedCustomerKey == null ? that.flngLinkedCustomerKey == null : this.flngLinkedCustomerKey.equals(that.flngLinkedCustomerKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ChangeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrChangeType = JdbcWritableBridge.readString(2, __dbResults);
    this.flngLinkedCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ChangeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrChangeType = JdbcWritableBridge.readString(2, __dbResults);
    this.flngLinkedCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(8, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ChangeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkedCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ChangeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrChangeType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkedCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 10 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ChangeKey = null;
    } else {
    this.fi64ChangeKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChangeType = null;
    } else {
    this.fstrChangeType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngLinkedCustomerKey = null;
    } else {
    this.flngLinkedCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveDate = null;
    } else {
    this.fdtmEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintRelationshipPeriod = null;
    } else {
    this.fintRelationshipPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintEntitlementPeriod = null;
    } else {
    this.fintEntitlementPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64ChangeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ChangeKey);
    }
    if (null == this.fstrChangeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeType);
    }
    if (null == this.flngLinkedCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkedCustomerKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.fi64ChangeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ChangeKey);
    }
    if (null == this.fstrChangeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChangeType);
    }
    if (null == this.flngLinkedCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkedCustomerKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ChangeKey==null?"\\N":"" + fi64ChangeKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeType==null?"\\N":fstrChangeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkedCustomerKey==null?"\\N":"" + flngLinkedCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ChangeKey==null?"\\N":"" + fi64ChangeKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChangeType==null?"\\N":fstrChangeType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkedCustomerKey==null?"\\N":"" + flngLinkedCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ChangeKey = null; } else {
      this.fi64ChangeKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeType = null; } else {
      this.fstrChangeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkedCustomerKey = null; } else {
      this.flngLinkedCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ChangeKey = null; } else {
      this.fi64ChangeKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChangeType = null; } else {
      this.fstrChangeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkedCustomerKey = null; } else {
      this.flngLinkedCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblnz_famchangelog o = (tblnz_famchangelog) super.clone();
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famchangelog o) throws CloneNotSupportedException {
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ChangeKey", this.fi64ChangeKey);
    __sqoop$field_map.put("fstrChangeType", this.fstrChangeType);
    __sqoop$field_map.put("flngLinkedCustomerKey", this.flngLinkedCustomerKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ChangeKey", this.fi64ChangeKey);
    __sqoop$field_map.put("fstrChangeType", this.fstrChangeType);
    __sqoop$field_map.put("flngLinkedCustomerKey", this.flngLinkedCustomerKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
