// ORM class for table 'tblnz_rtnlodgement'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:38:45 NZDT 2020
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

public class tblnz_rtnlodgement extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngLogKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.flngLogKey = (Integer)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrDLN = (String)value;
      }
    });
    setters.put("fstrIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrIRD = (String)value;
      }
    });
    setters.put("fstrForm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrForm = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fstrStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrStatus = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnlodgement.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnlodgement() {
    init0();
  }
  private Integer flngLogKey;
  public Integer get_flngLogKey() {
    return flngLogKey;
  }
  public void set_flngLogKey(Integer flngLogKey) {
    this.flngLogKey = flngLogKey;
  }
  public tblnz_rtnlodgement with_flngLogKey(Integer flngLogKey) {
    this.flngLogKey = flngLogKey;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_rtnlodgement with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private String fstrIRD;
  public String get_fstrIRD() {
    return fstrIRD;
  }
  public void set_fstrIRD(String fstrIRD) {
    this.fstrIRD = fstrIRD;
  }
  public tblnz_rtnlodgement with_fstrIRD(String fstrIRD) {
    this.fstrIRD = fstrIRD;
    return this;
  }
  private String fstrForm;
  public String get_fstrForm() {
    return fstrForm;
  }
  public void set_fstrForm(String fstrForm) {
    this.fstrForm = fstrForm;
  }
  public tblnz_rtnlodgement with_fstrForm(String fstrForm) {
    this.fstrForm = fstrForm;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_rtnlodgement with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtnlodgement with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblnz_rtnlodgement with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblnz_rtnlodgement with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tblnz_rtnlodgement with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private String fstrStatus;
  public String get_fstrStatus() {
    return fstrStatus;
  }
  public void set_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
  }
  public tblnz_rtnlodgement with_fstrStatus(String fstrStatus) {
    this.fstrStatus = fstrStatus;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnlodgement with_fstrWho(String fstrWho) {
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
  public tblnz_rtnlodgement with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnlodgement)) {
      return false;
    }
    tblnz_rtnlodgement that = (tblnz_rtnlodgement) o;
    boolean equal = true;
    equal = equal && (this.flngLogKey == null ? that.flngLogKey == null : this.flngLogKey.equals(that.flngLogKey));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fstrIRD == null ? that.fstrIRD == null : this.fstrIRD.equals(that.fstrIRD));
    equal = equal && (this.fstrForm == null ? that.fstrForm == null : this.fstrForm.equals(that.fstrForm));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnlodgement)) {
      return false;
    }
    tblnz_rtnlodgement that = (tblnz_rtnlodgement) o;
    boolean equal = true;
    equal = equal && (this.flngLogKey == null ? that.flngLogKey == null : this.flngLogKey.equals(that.flngLogKey));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fstrIRD == null ? that.fstrIRD == null : this.fstrIRD.equals(that.fstrIRD));
    equal = equal && (this.fstrForm == null ? that.fstrForm == null : this.fstrForm.equals(that.fstrForm));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrStatus == null ? that.fstrStatus == null : this.fstrStatus.equals(that.fstrStatus));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngLogKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrIRD = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrForm = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngLogKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrIRD = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrForm = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrStatus = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngLogKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRD, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrForm, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngLogKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRD, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrForm, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStatus, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngLogKey = null;
    } else {
    this.flngLogKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRD = null;
    } else {
    this.fstrIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrForm = null;
    } else {
    this.fstrForm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStatus = null;
    } else {
    this.fstrStatus = Text.readString(__dataIn);
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
    if (null == this.flngLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLogKey);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fstrIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRD);
    }
    if (null == this.fstrForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrForm);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
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
    if (null == this.flngLogKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLogKey);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fstrIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRD);
    }
    if (null == this.fstrForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrForm);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStatus);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLogKey==null?"\\N":"" + flngLogKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRD==null?"\\N":fstrIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrForm==null?"\\N":fstrForm, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLogKey==null?"\\N":"" + flngLogKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRD==null?"\\N":fstrIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrForm==null?"\\N":fstrForm, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStatus==null?"\\N":fstrStatus, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLogKey = null; } else {
      this.flngLogKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRD = null; } else {
      this.fstrIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrForm = null; } else {
      this.fstrForm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLogKey = null; } else {
      this.flngLogKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRD = null; } else {
      this.fstrIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrForm = null; } else {
      this.fstrForm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStatus = null; } else {
      this.fstrStatus = __cur_str;
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
    tblnz_rtnlodgement o = (tblnz_rtnlodgement) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnlodgement o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngLogKey", this.flngLogKey);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fstrIRD", this.fstrIRD);
    __sqoop$field_map.put("fstrForm", this.fstrForm);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngLogKey", this.flngLogKey);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fstrIRD", this.fstrIRD);
    __sqoop$field_map.put("fstrForm", this.fstrForm);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrStatus", this.fstrStatus);
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
