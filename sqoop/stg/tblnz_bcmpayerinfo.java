// ORM class for table 'tblnz_bcmpayerinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:06:41 NZDT 2020
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

public class tblnz_bcmpayerinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("flngRecipientCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngRecipientCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrRecipientCustomerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fstrRecipientCustomerName = (String)value;
      }
    });
    setters.put("fstrPayerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fstrPayerIRD = (String)value;
      }
    });
    setters.put("flngPayerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngPayerCustomerKey = (Integer)value;
      }
    });
    setters.put("flngPayerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngPayerAccountKey = (Integer)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngCertificateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngCertificateKey = (Integer)value;
      }
    });
    setters.put("flngFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.flngFileKey = (Integer)value;
      }
    });
    setters.put("fblnClosePending", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fblnClosePending = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bcmpayerinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_bcmpayerinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_bcmpayerinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_bcmpayerinfo with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private Integer flngRecipientCustomerKey;
  public Integer get_flngRecipientCustomerKey() {
    return flngRecipientCustomerKey;
  }
  public void set_flngRecipientCustomerKey(Integer flngRecipientCustomerKey) {
    this.flngRecipientCustomerKey = flngRecipientCustomerKey;
  }
  public tblnz_bcmpayerinfo with_flngRecipientCustomerKey(Integer flngRecipientCustomerKey) {
    this.flngRecipientCustomerKey = flngRecipientCustomerKey;
    return this;
  }
  private String fstrRecipientCustomerName;
  public String get_fstrRecipientCustomerName() {
    return fstrRecipientCustomerName;
  }
  public void set_fstrRecipientCustomerName(String fstrRecipientCustomerName) {
    this.fstrRecipientCustomerName = fstrRecipientCustomerName;
  }
  public tblnz_bcmpayerinfo with_fstrRecipientCustomerName(String fstrRecipientCustomerName) {
    this.fstrRecipientCustomerName = fstrRecipientCustomerName;
    return this;
  }
  private String fstrPayerIRD;
  public String get_fstrPayerIRD() {
    return fstrPayerIRD;
  }
  public void set_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
  }
  public tblnz_bcmpayerinfo with_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
    return this;
  }
  private Integer flngPayerCustomerKey;
  public Integer get_flngPayerCustomerKey() {
    return flngPayerCustomerKey;
  }
  public void set_flngPayerCustomerKey(Integer flngPayerCustomerKey) {
    this.flngPayerCustomerKey = flngPayerCustomerKey;
  }
  public tblnz_bcmpayerinfo with_flngPayerCustomerKey(Integer flngPayerCustomerKey) {
    this.flngPayerCustomerKey = flngPayerCustomerKey;
    return this;
  }
  private Integer flngPayerAccountKey;
  public Integer get_flngPayerAccountKey() {
    return flngPayerAccountKey;
  }
  public void set_flngPayerAccountKey(Integer flngPayerAccountKey) {
    this.flngPayerAccountKey = flngPayerAccountKey;
  }
  public tblnz_bcmpayerinfo with_flngPayerAccountKey(Integer flngPayerAccountKey) {
    this.flngPayerAccountKey = flngPayerAccountKey;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_bcmpayerinfo with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private Integer flngCertificateKey;
  public Integer get_flngCertificateKey() {
    return flngCertificateKey;
  }
  public void set_flngCertificateKey(Integer flngCertificateKey) {
    this.flngCertificateKey = flngCertificateKey;
  }
  public tblnz_bcmpayerinfo with_flngCertificateKey(Integer flngCertificateKey) {
    this.flngCertificateKey = flngCertificateKey;
    return this;
  }
  private Integer flngFileKey;
  public Integer get_flngFileKey() {
    return flngFileKey;
  }
  public void set_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
  }
  public tblnz_bcmpayerinfo with_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
    return this;
  }
  private Integer fblnClosePending;
  public Integer get_fblnClosePending() {
    return fblnClosePending;
  }
  public void set_fblnClosePending(Integer fblnClosePending) {
    this.fblnClosePending = fblnClosePending;
  }
  public tblnz_bcmpayerinfo with_fblnClosePending(Integer fblnClosePending) {
    this.fblnClosePending = fblnClosePending;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_bcmpayerinfo with_fstrWho(String fstrWho) {
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
  public tblnz_bcmpayerinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_bcmpayerinfo)) {
      return false;
    }
    tblnz_bcmpayerinfo that = (tblnz_bcmpayerinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.flngRecipientCustomerKey == null ? that.flngRecipientCustomerKey == null : this.flngRecipientCustomerKey.equals(that.flngRecipientCustomerKey));
    equal = equal && (this.fstrRecipientCustomerName == null ? that.fstrRecipientCustomerName == null : this.fstrRecipientCustomerName.equals(that.fstrRecipientCustomerName));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.flngPayerCustomerKey == null ? that.flngPayerCustomerKey == null : this.flngPayerCustomerKey.equals(that.flngPayerCustomerKey));
    equal = equal && (this.flngPayerAccountKey == null ? that.flngPayerAccountKey == null : this.flngPayerAccountKey.equals(that.flngPayerAccountKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngCertificateKey == null ? that.flngCertificateKey == null : this.flngCertificateKey.equals(that.flngCertificateKey));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.fblnClosePending == null ? that.fblnClosePending == null : this.fblnClosePending.equals(that.fblnClosePending));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_bcmpayerinfo)) {
      return false;
    }
    tblnz_bcmpayerinfo that = (tblnz_bcmpayerinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.flngRecipientCustomerKey == null ? that.flngRecipientCustomerKey == null : this.flngRecipientCustomerKey.equals(that.flngRecipientCustomerKey));
    equal = equal && (this.fstrRecipientCustomerName == null ? that.fstrRecipientCustomerName == null : this.fstrRecipientCustomerName.equals(that.fstrRecipientCustomerName));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.flngPayerCustomerKey == null ? that.flngPayerCustomerKey == null : this.flngPayerCustomerKey.equals(that.flngPayerCustomerKey));
    equal = equal && (this.flngPayerAccountKey == null ? that.flngPayerAccountKey == null : this.flngPayerAccountKey.equals(that.flngPayerAccountKey));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngCertificateKey == null ? that.flngCertificateKey == null : this.flngCertificateKey.equals(that.flngCertificateKey));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.fblnClosePending == null ? that.fblnClosePending == null : this.fblnClosePending.equals(that.fblnClosePending));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(2, __dbResults);
    this.flngRecipientCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrRecipientCustomerName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.flngPayerCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngPayerAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flngCertificateKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnClosePending = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(2, __dbResults);
    this.flngRecipientCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrRecipientCustomerName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.flngPayerCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngPayerAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flngCertificateKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnClosePending = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeString(fstrRecipientIRD, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRecipientCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCustomerName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificateKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnClosePending, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRecipientCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCustomerName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCertificateKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnClosePending, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
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
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngRecipientCustomerKey = null;
    } else {
    this.flngRecipientCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientCustomerName = null;
    } else {
    this.fstrRecipientCustomerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerIRD = null;
    } else {
    this.fstrPayerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPayerCustomerKey = null;
    } else {
    this.flngPayerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPayerAccountKey = null;
    } else {
    this.flngPayerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCertificateKey = null;
    } else {
    this.flngCertificateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFileKey = null;
    } else {
    this.flngFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnClosePending = null;
    } else {
    this.fblnClosePending = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.flngRecipientCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRecipientCustomerKey);
    }
    if (null == this.fstrRecipientCustomerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCustomerName);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.flngPayerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerCustomerKey);
    }
    if (null == this.flngPayerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerAccountKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateKey);
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.fblnClosePending) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnClosePending);
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
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.flngRecipientCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRecipientCustomerKey);
    }
    if (null == this.fstrRecipientCustomerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCustomerName);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.flngPayerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerCustomerKey);
    }
    if (null == this.flngPayerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerAccountKey);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngCertificateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCertificateKey);
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.fblnClosePending) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnClosePending);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRecipientCustomerKey==null?"\\N":"" + flngRecipientCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCustomerName==null?"\\N":fstrRecipientCustomerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerCustomerKey==null?"\\N":"" + flngPayerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerAccountKey==null?"\\N":"" + flngPayerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateKey==null?"\\N":"" + flngCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnClosePending==null?"\\N":"" + fblnClosePending, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRecipientCustomerKey==null?"\\N":"" + flngRecipientCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCustomerName==null?"\\N":fstrRecipientCustomerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerCustomerKey==null?"\\N":"" + flngPayerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerAccountKey==null?"\\N":"" + flngPayerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCertificateKey==null?"\\N":"" + flngCertificateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnClosePending==null?"\\N":"" + fblnClosePending, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRecipientCustomerKey = null; } else {
      this.flngRecipientCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCustomerName = null; } else {
      this.fstrRecipientCustomerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerCustomerKey = null; } else {
      this.flngPayerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerAccountKey = null; } else {
      this.flngPayerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateKey = null; } else {
      this.flngCertificateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnClosePending = null; } else {
      this.fblnClosePending = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRecipientCustomerKey = null; } else {
      this.flngRecipientCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCustomerName = null; } else {
      this.fstrRecipientCustomerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerCustomerKey = null; } else {
      this.flngPayerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerAccountKey = null; } else {
      this.flngPayerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCertificateKey = null; } else {
      this.flngCertificateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnClosePending = null; } else {
      this.fblnClosePending = Integer.valueOf(__cur_str);
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
    tblnz_bcmpayerinfo o = (tblnz_bcmpayerinfo) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_bcmpayerinfo o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("flngRecipientCustomerKey", this.flngRecipientCustomerKey);
    __sqoop$field_map.put("fstrRecipientCustomerName", this.fstrRecipientCustomerName);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("flngPayerCustomerKey", this.flngPayerCustomerKey);
    __sqoop$field_map.put("flngPayerAccountKey", this.flngPayerAccountKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngCertificateKey", this.flngCertificateKey);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("fblnClosePending", this.fblnClosePending);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("flngRecipientCustomerKey", this.flngRecipientCustomerKey);
    __sqoop$field_map.put("fstrRecipientCustomerName", this.fstrRecipientCustomerName);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("flngPayerCustomerKey", this.flngPayerCustomerKey);
    __sqoop$field_map.put("flngPayerAccountKey", this.flngPayerAccountKey);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngCertificateKey", this.flngCertificateKey);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("fblnClosePending", this.fblnClosePending);
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
