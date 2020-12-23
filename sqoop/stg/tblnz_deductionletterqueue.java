// ORM class for table 'tblnz_deductionletterqueue'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:38:50 NZDT 2020
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

public class tblnz_deductionletterqueue extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDeductionQueueKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.flngDeductionQueueKey = (Integer)value;
      }
    });
    setters.put("flngGarnisheeCustKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.flngGarnisheeCustKey = (Integer)value;
      }
    });
    setters.put("flngGarnisheeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.flngGarnisheeKey = (Integer)value;
      }
    });
    setters.put("flngGarnishKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.flngGarnishKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("fstrIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fstrIRD = (String)value;
      }
    });
    setters.put("fstrBehalfIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fstrBehalfIRD = (String)value;
      }
    });
    setters.put("fstrFormattedName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fstrFormattedName = (String)value;
      }
    });
    setters.put("fcurDebt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fcurDebt = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmReIssue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fdtmReIssue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_deductionletterqueue.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_deductionletterqueue() {
    init0();
  }
  private Integer flngDeductionQueueKey;
  public Integer get_flngDeductionQueueKey() {
    return flngDeductionQueueKey;
  }
  public void set_flngDeductionQueueKey(Integer flngDeductionQueueKey) {
    this.flngDeductionQueueKey = flngDeductionQueueKey;
  }
  public tblnz_deductionletterqueue with_flngDeductionQueueKey(Integer flngDeductionQueueKey) {
    this.flngDeductionQueueKey = flngDeductionQueueKey;
    return this;
  }
  private Integer flngGarnisheeCustKey;
  public Integer get_flngGarnisheeCustKey() {
    return flngGarnisheeCustKey;
  }
  public void set_flngGarnisheeCustKey(Integer flngGarnisheeCustKey) {
    this.flngGarnisheeCustKey = flngGarnisheeCustKey;
  }
  public tblnz_deductionletterqueue with_flngGarnisheeCustKey(Integer flngGarnisheeCustKey) {
    this.flngGarnisheeCustKey = flngGarnisheeCustKey;
    return this;
  }
  private Integer flngGarnisheeKey;
  public Integer get_flngGarnisheeKey() {
    return flngGarnisheeKey;
  }
  public void set_flngGarnisheeKey(Integer flngGarnisheeKey) {
    this.flngGarnisheeKey = flngGarnisheeKey;
  }
  public tblnz_deductionletterqueue with_flngGarnisheeKey(Integer flngGarnisheeKey) {
    this.flngGarnisheeKey = flngGarnisheeKey;
    return this;
  }
  private Integer flngGarnishKey;
  public Integer get_flngGarnishKey() {
    return flngGarnishKey;
  }
  public void set_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
  }
  public tblnz_deductionletterqueue with_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblnz_deductionletterqueue with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private String fstrIRD;
  public String get_fstrIRD() {
    return fstrIRD;
  }
  public void set_fstrIRD(String fstrIRD) {
    this.fstrIRD = fstrIRD;
  }
  public tblnz_deductionletterqueue with_fstrIRD(String fstrIRD) {
    this.fstrIRD = fstrIRD;
    return this;
  }
  private String fstrBehalfIRD;
  public String get_fstrBehalfIRD() {
    return fstrBehalfIRD;
  }
  public void set_fstrBehalfIRD(String fstrBehalfIRD) {
    this.fstrBehalfIRD = fstrBehalfIRD;
  }
  public tblnz_deductionletterqueue with_fstrBehalfIRD(String fstrBehalfIRD) {
    this.fstrBehalfIRD = fstrBehalfIRD;
    return this;
  }
  private String fstrFormattedName;
  public String get_fstrFormattedName() {
    return fstrFormattedName;
  }
  public void set_fstrFormattedName(String fstrFormattedName) {
    this.fstrFormattedName = fstrFormattedName;
  }
  public tblnz_deductionletterqueue with_fstrFormattedName(String fstrFormattedName) {
    this.fstrFormattedName = fstrFormattedName;
    return this;
  }
  private java.math.BigDecimal fcurDebt;
  public java.math.BigDecimal get_fcurDebt() {
    return fcurDebt;
  }
  public void set_fcurDebt(java.math.BigDecimal fcurDebt) {
    this.fcurDebt = fcurDebt;
  }
  public tblnz_deductionletterqueue with_fcurDebt(java.math.BigDecimal fcurDebt) {
    this.fcurDebt = fcurDebt;
    return this;
  }
  private java.sql.Timestamp fdtmReIssue;
  public java.sql.Timestamp get_fdtmReIssue() {
    return fdtmReIssue;
  }
  public void set_fdtmReIssue(java.sql.Timestamp fdtmReIssue) {
    this.fdtmReIssue = fdtmReIssue;
  }
  public tblnz_deductionletterqueue with_fdtmReIssue(java.sql.Timestamp fdtmReIssue) {
    this.fdtmReIssue = fdtmReIssue;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_deductionletterqueue with_fstrWho(String fstrWho) {
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
  public tblnz_deductionletterqueue with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_deductionletterqueue)) {
      return false;
    }
    tblnz_deductionletterqueue that = (tblnz_deductionletterqueue) o;
    boolean equal = true;
    equal = equal && (this.flngDeductionQueueKey == null ? that.flngDeductionQueueKey == null : this.flngDeductionQueueKey.equals(that.flngDeductionQueueKey));
    equal = equal && (this.flngGarnisheeCustKey == null ? that.flngGarnisheeCustKey == null : this.flngGarnisheeCustKey.equals(that.flngGarnisheeCustKey));
    equal = equal && (this.flngGarnisheeKey == null ? that.flngGarnisheeKey == null : this.flngGarnisheeKey.equals(that.flngGarnisheeKey));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fstrIRD == null ? that.fstrIRD == null : this.fstrIRD.equals(that.fstrIRD));
    equal = equal && (this.fstrBehalfIRD == null ? that.fstrBehalfIRD == null : this.fstrBehalfIRD.equals(that.fstrBehalfIRD));
    equal = equal && (this.fstrFormattedName == null ? that.fstrFormattedName == null : this.fstrFormattedName.equals(that.fstrFormattedName));
    equal = equal && (this.fcurDebt == null ? that.fcurDebt == null : this.fcurDebt.equals(that.fcurDebt));
    equal = equal && (this.fdtmReIssue == null ? that.fdtmReIssue == null : this.fdtmReIssue.equals(that.fdtmReIssue));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_deductionletterqueue)) {
      return false;
    }
    tblnz_deductionletterqueue that = (tblnz_deductionletterqueue) o;
    boolean equal = true;
    equal = equal && (this.flngDeductionQueueKey == null ? that.flngDeductionQueueKey == null : this.flngDeductionQueueKey.equals(that.flngDeductionQueueKey));
    equal = equal && (this.flngGarnisheeCustKey == null ? that.flngGarnisheeCustKey == null : this.flngGarnisheeCustKey.equals(that.flngGarnisheeCustKey));
    equal = equal && (this.flngGarnisheeKey == null ? that.flngGarnisheeKey == null : this.flngGarnisheeKey.equals(that.flngGarnisheeKey));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fstrIRD == null ? that.fstrIRD == null : this.fstrIRD.equals(that.fstrIRD));
    equal = equal && (this.fstrBehalfIRD == null ? that.fstrBehalfIRD == null : this.fstrBehalfIRD.equals(that.fstrBehalfIRD));
    equal = equal && (this.fstrFormattedName == null ? that.fstrFormattedName == null : this.fstrFormattedName.equals(that.fstrFormattedName));
    equal = equal && (this.fcurDebt == null ? that.fcurDebt == null : this.fcurDebt.equals(that.fcurDebt));
    equal = equal && (this.fdtmReIssue == null ? that.fdtmReIssue == null : this.fdtmReIssue.equals(that.fdtmReIssue));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDeductionQueueKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngGarnisheeCustKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngGarnisheeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBehalfIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormattedName = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurDebt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fdtmReIssue = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDeductionQueueKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngGarnisheeCustKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngGarnisheeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBehalfIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormattedName = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurDebt = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fdtmReIssue = JdbcWritableBridge.readTimestamp(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDeductionQueueKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnisheeCustKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnisheeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBehalfIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReIssue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDeductionQueueKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnisheeCustKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnisheeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBehalfIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebt, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReIssue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDeductionQueueKey = null;
    } else {
    this.flngDeductionQueueKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngGarnisheeCustKey = null;
    } else {
    this.flngGarnisheeCustKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngGarnisheeKey = null;
    } else {
    this.flngGarnisheeKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngGarnishKey = null;
    } else {
    this.flngGarnishKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRD = null;
    } else {
    this.fstrIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBehalfIRD = null;
    } else {
    this.fstrBehalfIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormattedName = null;
    } else {
    this.fstrFormattedName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebt = null;
    } else {
    this.fcurDebt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReIssue = null;
    } else {
    this.fdtmReIssue = new Timestamp(__dataIn.readLong());
    this.fdtmReIssue.setNanos(__dataIn.readInt());
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
    if (null == this.flngDeductionQueueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDeductionQueueKey);
    }
    if (null == this.flngGarnisheeCustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeCustKey);
    }
    if (null == this.flngGarnisheeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeKey);
    }
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fstrIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRD);
    }
    if (null == this.fstrBehalfIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBehalfIRD);
    }
    if (null == this.fstrFormattedName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedName);
    }
    if (null == this.fcurDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebt, __dataOut);
    }
    if (null == this.fdtmReIssue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReIssue.getTime());
    __dataOut.writeInt(this.fdtmReIssue.getNanos());
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
    if (null == this.flngDeductionQueueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDeductionQueueKey);
    }
    if (null == this.flngGarnisheeCustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeCustKey);
    }
    if (null == this.flngGarnisheeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnisheeKey);
    }
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fstrIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRD);
    }
    if (null == this.fstrBehalfIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBehalfIRD);
    }
    if (null == this.fstrFormattedName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedName);
    }
    if (null == this.fcurDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebt, __dataOut);
    }
    if (null == this.fdtmReIssue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReIssue.getTime());
    __dataOut.writeInt(this.fdtmReIssue.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDeductionQueueKey==null?"\\N":"" + flngDeductionQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeCustKey==null?"\\N":"" + flngGarnisheeCustKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeKey==null?"\\N":"" + flngGarnisheeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRD==null?"\\N":fstrIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBehalfIRD==null?"\\N":fstrBehalfIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedName==null?"\\N":fstrFormattedName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebt==null?"\\N":fcurDebt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReIssue==null?"\\N":"" + fdtmReIssue, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDeductionQueueKey==null?"\\N":"" + flngDeductionQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeCustKey==null?"\\N":"" + flngGarnisheeCustKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnisheeKey==null?"\\N":"" + flngGarnisheeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRD==null?"\\N":fstrIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBehalfIRD==null?"\\N":fstrBehalfIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedName==null?"\\N":fstrFormattedName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebt==null?"\\N":fcurDebt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReIssue==null?"\\N":"" + fdtmReIssue, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDeductionQueueKey = null; } else {
      this.flngDeductionQueueKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeCustKey = null; } else {
      this.flngGarnisheeCustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeKey = null; } else {
      this.flngGarnisheeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrBehalfIRD = null; } else {
      this.fstrBehalfIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedName = null; } else {
      this.fstrFormattedName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebt = null; } else {
      this.fcurDebt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReIssue = null; } else {
      this.fdtmReIssue = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDeductionQueueKey = null; } else {
      this.flngDeductionQueueKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeCustKey = null; } else {
      this.flngGarnisheeCustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnisheeKey = null; } else {
      this.flngGarnisheeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrBehalfIRD = null; } else {
      this.fstrBehalfIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedName = null; } else {
      this.fstrFormattedName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebt = null; } else {
      this.fcurDebt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReIssue = null; } else {
      this.fdtmReIssue = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_deductionletterqueue o = (tblnz_deductionletterqueue) super.clone();
    o.fdtmReIssue = (o.fdtmReIssue != null) ? (java.sql.Timestamp) o.fdtmReIssue.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_deductionletterqueue o) throws CloneNotSupportedException {
    o.fdtmReIssue = (o.fdtmReIssue != null) ? (java.sql.Timestamp) o.fdtmReIssue.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDeductionQueueKey", this.flngDeductionQueueKey);
    __sqoop$field_map.put("flngGarnisheeCustKey", this.flngGarnisheeCustKey);
    __sqoop$field_map.put("flngGarnisheeKey", this.flngGarnisheeKey);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fstrIRD", this.fstrIRD);
    __sqoop$field_map.put("fstrBehalfIRD", this.fstrBehalfIRD);
    __sqoop$field_map.put("fstrFormattedName", this.fstrFormattedName);
    __sqoop$field_map.put("fcurDebt", this.fcurDebt);
    __sqoop$field_map.put("fdtmReIssue", this.fdtmReIssue);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDeductionQueueKey", this.flngDeductionQueueKey);
    __sqoop$field_map.put("flngGarnisheeCustKey", this.flngGarnisheeCustKey);
    __sqoop$field_map.put("flngGarnisheeKey", this.flngGarnisheeKey);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fstrIRD", this.fstrIRD);
    __sqoop$field_map.put("fstrBehalfIRD", this.fstrBehalfIRD);
    __sqoop$field_map.put("fstrFormattedName", this.fstrFormattedName);
    __sqoop$field_map.put("fcurDebt", this.fcurDebt);
    __sqoop$field_map.put("fdtmReIssue", this.fdtmReIssue);
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
