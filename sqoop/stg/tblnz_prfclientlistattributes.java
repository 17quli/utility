// ORM class for table 'tblnz_prfclientlistattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:09:40 NZDT 2020
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

public class tblnz_prfclientlistattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrAccountManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fstrAccountManager = (String)value;
      }
    });
    setters.put("fintHeritageProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fintHeritageProfileNumber = (Integer)value;
      }
    });
    setters.put("fstrSubGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fstrSubGroup = (String)value;
      }
    });
    setters.put("fintVisitMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fintVisitMonth = (Integer)value;
      }
    });
    setters.put("fblneFile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fblneFile = (Integer)value;
      }
    });
    setters.put("fstreFileIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fstreFileIRD = (String)value;
      }
    });
    setters.put("finteFileLocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.finteFileLocation = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_prfclientlistattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_prfclientlistattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_prfclientlistattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_prfclientlistattributes with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrAccountManager;
  public String get_fstrAccountManager() {
    return fstrAccountManager;
  }
  public void set_fstrAccountManager(String fstrAccountManager) {
    this.fstrAccountManager = fstrAccountManager;
  }
  public tblnz_prfclientlistattributes with_fstrAccountManager(String fstrAccountManager) {
    this.fstrAccountManager = fstrAccountManager;
    return this;
  }
  private Integer fintHeritageProfileNumber;
  public Integer get_fintHeritageProfileNumber() {
    return fintHeritageProfileNumber;
  }
  public void set_fintHeritageProfileNumber(Integer fintHeritageProfileNumber) {
    this.fintHeritageProfileNumber = fintHeritageProfileNumber;
  }
  public tblnz_prfclientlistattributes with_fintHeritageProfileNumber(Integer fintHeritageProfileNumber) {
    this.fintHeritageProfileNumber = fintHeritageProfileNumber;
    return this;
  }
  private String fstrSubGroup;
  public String get_fstrSubGroup() {
    return fstrSubGroup;
  }
  public void set_fstrSubGroup(String fstrSubGroup) {
    this.fstrSubGroup = fstrSubGroup;
  }
  public tblnz_prfclientlistattributes with_fstrSubGroup(String fstrSubGroup) {
    this.fstrSubGroup = fstrSubGroup;
    return this;
  }
  private Integer fintVisitMonth;
  public Integer get_fintVisitMonth() {
    return fintVisitMonth;
  }
  public void set_fintVisitMonth(Integer fintVisitMonth) {
    this.fintVisitMonth = fintVisitMonth;
  }
  public tblnz_prfclientlistattributes with_fintVisitMonth(Integer fintVisitMonth) {
    this.fintVisitMonth = fintVisitMonth;
    return this;
  }
  private Integer fblneFile;
  public Integer get_fblneFile() {
    return fblneFile;
  }
  public void set_fblneFile(Integer fblneFile) {
    this.fblneFile = fblneFile;
  }
  public tblnz_prfclientlistattributes with_fblneFile(Integer fblneFile) {
    this.fblneFile = fblneFile;
    return this;
  }
  private String fstreFileIRD;
  public String get_fstreFileIRD() {
    return fstreFileIRD;
  }
  public void set_fstreFileIRD(String fstreFileIRD) {
    this.fstreFileIRD = fstreFileIRD;
  }
  public tblnz_prfclientlistattributes with_fstreFileIRD(String fstreFileIRD) {
    this.fstreFileIRD = fstreFileIRD;
    return this;
  }
  private Integer finteFileLocation;
  public Integer get_finteFileLocation() {
    return finteFileLocation;
  }
  public void set_finteFileLocation(Integer finteFileLocation) {
    this.finteFileLocation = finteFileLocation;
  }
  public tblnz_prfclientlistattributes with_finteFileLocation(Integer finteFileLocation) {
    this.finteFileLocation = finteFileLocation;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_prfclientlistattributes with_fstrWho(String fstrWho) {
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
  public tblnz_prfclientlistattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_prfclientlistattributes)) {
      return false;
    }
    tblnz_prfclientlistattributes that = (tblnz_prfclientlistattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrAccountManager == null ? that.fstrAccountManager == null : this.fstrAccountManager.equals(that.fstrAccountManager));
    equal = equal && (this.fintHeritageProfileNumber == null ? that.fintHeritageProfileNumber == null : this.fintHeritageProfileNumber.equals(that.fintHeritageProfileNumber));
    equal = equal && (this.fstrSubGroup == null ? that.fstrSubGroup == null : this.fstrSubGroup.equals(that.fstrSubGroup));
    equal = equal && (this.fintVisitMonth == null ? that.fintVisitMonth == null : this.fintVisitMonth.equals(that.fintVisitMonth));
    equal = equal && (this.fblneFile == null ? that.fblneFile == null : this.fblneFile.equals(that.fblneFile));
    equal = equal && (this.fstreFileIRD == null ? that.fstreFileIRD == null : this.fstreFileIRD.equals(that.fstreFileIRD));
    equal = equal && (this.finteFileLocation == null ? that.finteFileLocation == null : this.finteFileLocation.equals(that.finteFileLocation));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_prfclientlistattributes)) {
      return false;
    }
    tblnz_prfclientlistattributes that = (tblnz_prfclientlistattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrAccountManager == null ? that.fstrAccountManager == null : this.fstrAccountManager.equals(that.fstrAccountManager));
    equal = equal && (this.fintHeritageProfileNumber == null ? that.fintHeritageProfileNumber == null : this.fintHeritageProfileNumber.equals(that.fintHeritageProfileNumber));
    equal = equal && (this.fstrSubGroup == null ? that.fstrSubGroup == null : this.fstrSubGroup.equals(that.fstrSubGroup));
    equal = equal && (this.fintVisitMonth == null ? that.fintVisitMonth == null : this.fintVisitMonth.equals(that.fintVisitMonth));
    equal = equal && (this.fblneFile == null ? that.fblneFile == null : this.fblneFile.equals(that.fblneFile));
    equal = equal && (this.fstreFileIRD == null ? that.fstreFileIRD == null : this.fstreFileIRD.equals(that.fstreFileIRD));
    equal = equal && (this.finteFileLocation == null ? that.finteFileLocation == null : this.finteFileLocation.equals(that.finteFileLocation));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrAccountManager = JdbcWritableBridge.readString(3, __dbResults);
    this.fintHeritageProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSubGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fintVisitMonth = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblneFile = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstreFileIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.finteFileLocation = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrAccountManager = JdbcWritableBridge.readString(3, __dbResults);
    this.fintHeritageProfileNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSubGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fintVisitMonth = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblneFile = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstreFileIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.finteFileLocation = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountManager, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVisitMonth, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblneFile, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstreFileIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(finteFileLocation, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountManager, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageProfileNumber, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVisitMonth, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblneFile, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstreFileIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(finteFileLocation, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
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
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountManager = null;
    } else {
    this.fstrAccountManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintHeritageProfileNumber = null;
    } else {
    this.fintHeritageProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubGroup = null;
    } else {
    this.fstrSubGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintVisitMonth = null;
    } else {
    this.fintVisitMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblneFile = null;
    } else {
    this.fblneFile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstreFileIRD = null;
    } else {
    this.fstreFileIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.finteFileLocation = null;
    } else {
    this.finteFileLocation = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrAccountManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountManager);
    }
    if (null == this.fintHeritageProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageProfileNumber);
    }
    if (null == this.fstrSubGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubGroup);
    }
    if (null == this.fintVisitMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVisitMonth);
    }
    if (null == this.fblneFile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblneFile);
    }
    if (null == this.fstreFileIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstreFileIRD);
    }
    if (null == this.finteFileLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.finteFileLocation);
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrAccountManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountManager);
    }
    if (null == this.fintHeritageProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageProfileNumber);
    }
    if (null == this.fstrSubGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubGroup);
    }
    if (null == this.fintVisitMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVisitMonth);
    }
    if (null == this.fblneFile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblneFile);
    }
    if (null == this.fstreFileIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstreFileIRD);
    }
    if (null == this.finteFileLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.finteFileLocation);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountManager==null?"\\N":fstrAccountManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageProfileNumber==null?"\\N":"" + fintHeritageProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubGroup==null?"\\N":fstrSubGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVisitMonth==null?"\\N":"" + fintVisitMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblneFile==null?"\\N":"" + fblneFile, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstreFileIRD==null?"\\N":fstreFileIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(finteFileLocation==null?"\\N":"" + finteFileLocation, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountManager==null?"\\N":fstrAccountManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageProfileNumber==null?"\\N":"" + fintHeritageProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubGroup==null?"\\N":fstrSubGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVisitMonth==null?"\\N":"" + fintVisitMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblneFile==null?"\\N":"" + fblneFile, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstreFileIRD==null?"\\N":fstreFileIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(finteFileLocation==null?"\\N":"" + finteFileLocation, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountManager = null; } else {
      this.fstrAccountManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageProfileNumber = null; } else {
      this.fintHeritageProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubGroup = null; } else {
      this.fstrSubGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVisitMonth = null; } else {
      this.fintVisitMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblneFile = null; } else {
      this.fblneFile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstreFileIRD = null; } else {
      this.fstreFileIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.finteFileLocation = null; } else {
      this.finteFileLocation = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountManager = null; } else {
      this.fstrAccountManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageProfileNumber = null; } else {
      this.fintHeritageProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubGroup = null; } else {
      this.fstrSubGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVisitMonth = null; } else {
      this.fintVisitMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblneFile = null; } else {
      this.fblneFile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstreFileIRD = null; } else {
      this.fstreFileIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.finteFileLocation = null; } else {
      this.finteFileLocation = Integer.valueOf(__cur_str);
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
    tblnz_prfclientlistattributes o = (tblnz_prfclientlistattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_prfclientlistattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrAccountManager", this.fstrAccountManager);
    __sqoop$field_map.put("fintHeritageProfileNumber", this.fintHeritageProfileNumber);
    __sqoop$field_map.put("fstrSubGroup", this.fstrSubGroup);
    __sqoop$field_map.put("fintVisitMonth", this.fintVisitMonth);
    __sqoop$field_map.put("fblneFile", this.fblneFile);
    __sqoop$field_map.put("fstreFileIRD", this.fstreFileIRD);
    __sqoop$field_map.put("finteFileLocation", this.finteFileLocation);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrAccountManager", this.fstrAccountManager);
    __sqoop$field_map.put("fintHeritageProfileNumber", this.fintHeritageProfileNumber);
    __sqoop$field_map.put("fstrSubGroup", this.fstrSubGroup);
    __sqoop$field_map.put("fintVisitMonth", this.fintVisitMonth);
    __sqoop$field_map.put("fblneFile", this.fblneFile);
    __sqoop$field_map.put("fstreFileIRD", this.fstreFileIRD);
    __sqoop$field_map.put("finteFileLocation", this.finteFileLocation);
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
