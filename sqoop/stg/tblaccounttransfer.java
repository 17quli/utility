// ORM class for table 'tblaccounttransfer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:21:01 NZDT 2020
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

public class tblaccounttransfer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTransferKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngTransferKey = (Integer)value;
      }
    });
    setters.put("flngFromCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngFromCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngToCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngToCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fstrData = (String)value;
      }
    });
    setters.put("flngSourceCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngSourceCrmKey = (Integer)value;
      }
    });
    setters.put("flngTargetCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.flngTargetCrmKey = (Integer)value;
      }
    });
    setters.put("fstrComment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fstrComment = (String)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrFrq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fstrFrq = (String)value;
      }
    });
    setters.put("fintFromProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fintFromProfile = (Integer)value;
      }
    });
    setters.put("fintToProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fintToProfile = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccounttransfer.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblaccounttransfer() {
    init0();
  }
  private Integer flngTransferKey;
  public Integer get_flngTransferKey() {
    return flngTransferKey;
  }
  public void set_flngTransferKey(Integer flngTransferKey) {
    this.flngTransferKey = flngTransferKey;
  }
  public tblaccounttransfer with_flngTransferKey(Integer flngTransferKey) {
    this.flngTransferKey = flngTransferKey;
    return this;
  }
  private Integer flngFromCustomerKey;
  public Integer get_flngFromCustomerKey() {
    return flngFromCustomerKey;
  }
  public void set_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
  }
  public tblaccounttransfer with_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblaccounttransfer with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngToCustomerKey;
  public Integer get_flngToCustomerKey() {
    return flngToCustomerKey;
  }
  public void set_flngToCustomerKey(Integer flngToCustomerKey) {
    this.flngToCustomerKey = flngToCustomerKey;
  }
  public tblaccounttransfer with_flngToCustomerKey(Integer flngToCustomerKey) {
    this.flngToCustomerKey = flngToCustomerKey;
    return this;
  }
  private String fstrData;
  public String get_fstrData() {
    return fstrData;
  }
  public void set_fstrData(String fstrData) {
    this.fstrData = fstrData;
  }
  public tblaccounttransfer with_fstrData(String fstrData) {
    this.fstrData = fstrData;
    return this;
  }
  private Integer flngSourceCrmKey;
  public Integer get_flngSourceCrmKey() {
    return flngSourceCrmKey;
  }
  public void set_flngSourceCrmKey(Integer flngSourceCrmKey) {
    this.flngSourceCrmKey = flngSourceCrmKey;
  }
  public tblaccounttransfer with_flngSourceCrmKey(Integer flngSourceCrmKey) {
    this.flngSourceCrmKey = flngSourceCrmKey;
    return this;
  }
  private Integer flngTargetCrmKey;
  public Integer get_flngTargetCrmKey() {
    return flngTargetCrmKey;
  }
  public void set_flngTargetCrmKey(Integer flngTargetCrmKey) {
    this.flngTargetCrmKey = flngTargetCrmKey;
  }
  public tblaccounttransfer with_flngTargetCrmKey(Integer flngTargetCrmKey) {
    this.flngTargetCrmKey = flngTargetCrmKey;
    return this;
  }
  private String fstrComment;
  public String get_fstrComment() {
    return fstrComment;
  }
  public void set_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
  }
  public tblaccounttransfer with_fstrComment(String fstrComment) {
    this.fstrComment = fstrComment;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblaccounttransfer with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private String fstrFrq;
  public String get_fstrFrq() {
    return fstrFrq;
  }
  public void set_fstrFrq(String fstrFrq) {
    this.fstrFrq = fstrFrq;
  }
  public tblaccounttransfer with_fstrFrq(String fstrFrq) {
    this.fstrFrq = fstrFrq;
    return this;
  }
  private Integer fintFromProfile;
  public Integer get_fintFromProfile() {
    return fintFromProfile;
  }
  public void set_fintFromProfile(Integer fintFromProfile) {
    this.fintFromProfile = fintFromProfile;
  }
  public tblaccounttransfer with_fintFromProfile(Integer fintFromProfile) {
    this.fintFromProfile = fintFromProfile;
    return this;
  }
  private Integer fintToProfile;
  public Integer get_fintToProfile() {
    return fintToProfile;
  }
  public void set_fintToProfile(Integer fintToProfile) {
    this.fintToProfile = fintToProfile;
  }
  public tblaccounttransfer with_fintToProfile(Integer fintToProfile) {
    this.fintToProfile = fintToProfile;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblaccounttransfer with_fstrWho(String fstrWho) {
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
  public tblaccounttransfer with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaccounttransfer)) {
      return false;
    }
    tblaccounttransfer that = (tblaccounttransfer) o;
    boolean equal = true;
    equal = equal && (this.flngTransferKey == null ? that.flngTransferKey == null : this.flngTransferKey.equals(that.flngTransferKey));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngToCustomerKey == null ? that.flngToCustomerKey == null : this.flngToCustomerKey.equals(that.flngToCustomerKey));
    equal = equal && (this.fstrData == null ? that.fstrData == null : this.fstrData.equals(that.fstrData));
    equal = equal && (this.flngSourceCrmKey == null ? that.flngSourceCrmKey == null : this.flngSourceCrmKey.equals(that.flngSourceCrmKey));
    equal = equal && (this.flngTargetCrmKey == null ? that.flngTargetCrmKey == null : this.flngTargetCrmKey.equals(that.flngTargetCrmKey));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fstrFrq == null ? that.fstrFrq == null : this.fstrFrq.equals(that.fstrFrq));
    equal = equal && (this.fintFromProfile == null ? that.fintFromProfile == null : this.fintFromProfile.equals(that.fintFromProfile));
    equal = equal && (this.fintToProfile == null ? that.fintToProfile == null : this.fintToProfile.equals(that.fintToProfile));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaccounttransfer)) {
      return false;
    }
    tblaccounttransfer that = (tblaccounttransfer) o;
    boolean equal = true;
    equal = equal && (this.flngTransferKey == null ? that.flngTransferKey == null : this.flngTransferKey.equals(that.flngTransferKey));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngToCustomerKey == null ? that.flngToCustomerKey == null : this.flngToCustomerKey.equals(that.flngToCustomerKey));
    equal = equal && (this.fstrData == null ? that.fstrData == null : this.fstrData.equals(that.fstrData));
    equal = equal && (this.flngSourceCrmKey == null ? that.flngSourceCrmKey == null : this.flngSourceCrmKey.equals(that.flngSourceCrmKey));
    equal = equal && (this.flngTargetCrmKey == null ? that.flngTargetCrmKey == null : this.flngTargetCrmKey.equals(that.flngTargetCrmKey));
    equal = equal && (this.fstrComment == null ? that.fstrComment == null : this.fstrComment.equals(that.fstrComment));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fstrFrq == null ? that.fstrFrq == null : this.fstrFrq.equals(that.fstrFrq));
    equal = equal && (this.fintFromProfile == null ? that.fintFromProfile == null : this.fintFromProfile.equals(that.fintFromProfile));
    equal = equal && (this.fintToProfile == null ? that.fintToProfile == null : this.fintToProfile.equals(that.fintToProfile));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTransferKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngToCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrData = JdbcWritableBridge.readString(5, __dbResults);
    this.flngSourceCrmKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTargetCrmKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fstrFrq = JdbcWritableBridge.readString(10, __dbResults);
    this.fintFromProfile = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fintToProfile = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTransferKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngToCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrData = JdbcWritableBridge.readString(5, __dbResults);
    this.flngSourceCrmKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTargetCrmKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrComment = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fstrFrq = JdbcWritableBridge.readString(10, __dbResults);
    this.fintFromProfile = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fintToProfile = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTransferKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrData, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceCrmKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTargetCrmKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrq, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFromProfile, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintToProfile, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTransferKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngToCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrData, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceCrmKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTargetCrmKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrComment, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrFrq, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFromProfile, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintToProfile, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTransferKey = null;
    } else {
    this.flngTransferKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFromCustomerKey = null;
    } else {
    this.flngFromCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngToCustomerKey = null;
    } else {
    this.flngToCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrData = null;
    } else {
    this.fstrData = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceCrmKey = null;
    } else {
    this.flngSourceCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTargetCrmKey = null;
    } else {
    this.flngTargetCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrComment = null;
    } else {
    this.fstrComment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFrq = null;
    } else {
    this.fstrFrq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintFromProfile = null;
    } else {
    this.fintFromProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintToProfile = null;
    } else {
    this.fintToProfile = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngTransferKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransferKey);
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngToCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToCustomerKey);
    }
    if (null == this.fstrData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrData);
    }
    if (null == this.flngSourceCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceCrmKey);
    }
    if (null == this.flngTargetCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTargetCrmKey);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fstrFrq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrq);
    }
    if (null == this.fintFromProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFromProfile);
    }
    if (null == this.fintToProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintToProfile);
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
    if (null == this.flngTransferKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransferKey);
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngToCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngToCustomerKey);
    }
    if (null == this.fstrData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrData);
    }
    if (null == this.flngSourceCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceCrmKey);
    }
    if (null == this.flngTargetCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTargetCrmKey);
    }
    if (null == this.fstrComment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrComment);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fstrFrq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFrq);
    }
    if (null == this.fintFromProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFromProfile);
    }
    if (null == this.fintToProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintToProfile);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransferKey==null?"\\N":"" + flngTransferKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToCustomerKey==null?"\\N":"" + flngToCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrData==null?"\\N":fstrData, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceCrmKey==null?"\\N":"" + flngSourceCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTargetCrmKey==null?"\\N":"" + flngTargetCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrq==null?"\\N":fstrFrq, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFromProfile==null?"\\N":"" + fintFromProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintToProfile==null?"\\N":"" + fintToProfile, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransferKey==null?"\\N":"" + flngTransferKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngToCustomerKey==null?"\\N":"" + flngToCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrData==null?"\\N":fstrData, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceCrmKey==null?"\\N":"" + flngSourceCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTargetCrmKey==null?"\\N":"" + flngTargetCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrComment==null?"\\N":fstrComment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFrq==null?"\\N":fstrFrq, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFromProfile==null?"\\N":"" + fintFromProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintToProfile==null?"\\N":"" + fintToProfile, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransferKey = null; } else {
      this.flngTransferKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToCustomerKey = null; } else {
      this.flngToCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrData = null; } else {
      this.fstrData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceCrmKey = null; } else {
      this.flngSourceCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTargetCrmKey = null; } else {
      this.flngTargetCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrq = null; } else {
      this.fstrFrq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFromProfile = null; } else {
      this.fintFromProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintToProfile = null; } else {
      this.fintToProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransferKey = null; } else {
      this.flngTransferKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngToCustomerKey = null; } else {
      this.flngToCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrData = null; } else {
      this.fstrData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceCrmKey = null; } else {
      this.flngSourceCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTargetCrmKey = null; } else {
      this.flngTargetCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrComment = null; } else {
      this.fstrComment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFrq = null; } else {
      this.fstrFrq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFromProfile = null; } else {
      this.fintFromProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintToProfile = null; } else {
      this.fintToProfile = Integer.valueOf(__cur_str);
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
    tblaccounttransfer o = (tblaccounttransfer) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblaccounttransfer o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTransferKey", this.flngTransferKey);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngToCustomerKey", this.flngToCustomerKey);
    __sqoop$field_map.put("fstrData", this.fstrData);
    __sqoop$field_map.put("flngSourceCrmKey", this.flngSourceCrmKey);
    __sqoop$field_map.put("flngTargetCrmKey", this.flngTargetCrmKey);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fstrFrq", this.fstrFrq);
    __sqoop$field_map.put("fintFromProfile", this.fintFromProfile);
    __sqoop$field_map.put("fintToProfile", this.fintToProfile);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTransferKey", this.flngTransferKey);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngToCustomerKey", this.flngToCustomerKey);
    __sqoop$field_map.put("fstrData", this.fstrData);
    __sqoop$field_map.put("flngSourceCrmKey", this.flngSourceCrmKey);
    __sqoop$field_map.put("flngTargetCrmKey", this.flngTargetCrmKey);
    __sqoop$field_map.put("fstrComment", this.fstrComment);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fstrFrq", this.fstrFrq);
    __sqoop$field_map.put("fintFromProfile", this.fintFromProfile);
    __sqoop$field_map.put("fintToProfile", this.fintToProfile);
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
