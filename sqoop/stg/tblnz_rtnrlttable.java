// ORM class for table 'tblnz_rtnrlttable'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:26:04 NZDT 2020
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

public class tblnz_rtnrlttable extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrVendorSurname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fstrVendorSurname = (String)value;
      }
    });
    setters.put("fstrVendorFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fstrVendorFirstName = (String)value;
      }
    });
    setters.put("fstrVendorIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fstrVendorIRDNumber = (String)value;
      }
    });
    setters.put("flngVendorAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.flngVendorAccountKey = (Integer)value;
      }
    });
    setters.put("fcurAmountPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fcurAmountPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fcurAmountDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrCertificateOfTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fstrCertificateOfTitle = (String)value;
      }
    });
    setters.put("fblnTenPercent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fblnTenPercent = (Integer)value;
      }
    });
    setters.put("fblnRLWTRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fblnRLWTRate = (Integer)value;
      }
    });
    setters.put("fblnSecurities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fblnSecurities = (Integer)value;
      }
    });
    setters.put("fblnOutstanding", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fblnOutstanding = (Integer)value;
      }
    });
    setters.put("fcurVendorAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fcurVendorAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrlttable.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrlttable() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnrlttable with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_rtnrlttable with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrVendorSurname;
  public String get_fstrVendorSurname() {
    return fstrVendorSurname;
  }
  public void set_fstrVendorSurname(String fstrVendorSurname) {
    this.fstrVendorSurname = fstrVendorSurname;
  }
  public tblnz_rtnrlttable with_fstrVendorSurname(String fstrVendorSurname) {
    this.fstrVendorSurname = fstrVendorSurname;
    return this;
  }
  private String fstrVendorFirstName;
  public String get_fstrVendorFirstName() {
    return fstrVendorFirstName;
  }
  public void set_fstrVendorFirstName(String fstrVendorFirstName) {
    this.fstrVendorFirstName = fstrVendorFirstName;
  }
  public tblnz_rtnrlttable with_fstrVendorFirstName(String fstrVendorFirstName) {
    this.fstrVendorFirstName = fstrVendorFirstName;
    return this;
  }
  private String fstrVendorIRDNumber;
  public String get_fstrVendorIRDNumber() {
    return fstrVendorIRDNumber;
  }
  public void set_fstrVendorIRDNumber(String fstrVendorIRDNumber) {
    this.fstrVendorIRDNumber = fstrVendorIRDNumber;
  }
  public tblnz_rtnrlttable with_fstrVendorIRDNumber(String fstrVendorIRDNumber) {
    this.fstrVendorIRDNumber = fstrVendorIRDNumber;
    return this;
  }
  private Integer flngVendorAccountKey;
  public Integer get_flngVendorAccountKey() {
    return flngVendorAccountKey;
  }
  public void set_flngVendorAccountKey(Integer flngVendorAccountKey) {
    this.flngVendorAccountKey = flngVendorAccountKey;
  }
  public tblnz_rtnrlttable with_flngVendorAccountKey(Integer flngVendorAccountKey) {
    this.flngVendorAccountKey = flngVendorAccountKey;
    return this;
  }
  private java.math.BigDecimal fcurAmountPaid;
  public java.math.BigDecimal get_fcurAmountPaid() {
    return fcurAmountPaid;
  }
  public void set_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
  }
  public tblnz_rtnrlttable with_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
    return this;
  }
  private java.math.BigDecimal fcurAmountDeducted;
  public java.math.BigDecimal get_fcurAmountDeducted() {
    return fcurAmountDeducted;
  }
  public void set_fcurAmountDeducted(java.math.BigDecimal fcurAmountDeducted) {
    this.fcurAmountDeducted = fcurAmountDeducted;
  }
  public tblnz_rtnrlttable with_fcurAmountDeducted(java.math.BigDecimal fcurAmountDeducted) {
    this.fcurAmountDeducted = fcurAmountDeducted;
    return this;
  }
  private String fstrCertificateOfTitle;
  public String get_fstrCertificateOfTitle() {
    return fstrCertificateOfTitle;
  }
  public void set_fstrCertificateOfTitle(String fstrCertificateOfTitle) {
    this.fstrCertificateOfTitle = fstrCertificateOfTitle;
  }
  public tblnz_rtnrlttable with_fstrCertificateOfTitle(String fstrCertificateOfTitle) {
    this.fstrCertificateOfTitle = fstrCertificateOfTitle;
    return this;
  }
  private Integer fblnTenPercent;
  public Integer get_fblnTenPercent() {
    return fblnTenPercent;
  }
  public void set_fblnTenPercent(Integer fblnTenPercent) {
    this.fblnTenPercent = fblnTenPercent;
  }
  public tblnz_rtnrlttable with_fblnTenPercent(Integer fblnTenPercent) {
    this.fblnTenPercent = fblnTenPercent;
    return this;
  }
  private Integer fblnRLWTRate;
  public Integer get_fblnRLWTRate() {
    return fblnRLWTRate;
  }
  public void set_fblnRLWTRate(Integer fblnRLWTRate) {
    this.fblnRLWTRate = fblnRLWTRate;
  }
  public tblnz_rtnrlttable with_fblnRLWTRate(Integer fblnRLWTRate) {
    this.fblnRLWTRate = fblnRLWTRate;
    return this;
  }
  private Integer fblnSecurities;
  public Integer get_fblnSecurities() {
    return fblnSecurities;
  }
  public void set_fblnSecurities(Integer fblnSecurities) {
    this.fblnSecurities = fblnSecurities;
  }
  public tblnz_rtnrlttable with_fblnSecurities(Integer fblnSecurities) {
    this.fblnSecurities = fblnSecurities;
    return this;
  }
  private Integer fblnOutstanding;
  public Integer get_fblnOutstanding() {
    return fblnOutstanding;
  }
  public void set_fblnOutstanding(Integer fblnOutstanding) {
    this.fblnOutstanding = fblnOutstanding;
  }
  public tblnz_rtnrlttable with_fblnOutstanding(Integer fblnOutstanding) {
    this.fblnOutstanding = fblnOutstanding;
    return this;
  }
  private java.math.BigDecimal fcurVendorAmount;
  public java.math.BigDecimal get_fcurVendorAmount() {
    return fcurVendorAmount;
  }
  public void set_fcurVendorAmount(java.math.BigDecimal fcurVendorAmount) {
    this.fcurVendorAmount = fcurVendorAmount;
  }
  public tblnz_rtnrlttable with_fcurVendorAmount(java.math.BigDecimal fcurVendorAmount) {
    this.fcurVendorAmount = fcurVendorAmount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrlttable with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrlttable with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrlttable)) {
      return false;
    }
    tblnz_rtnrlttable that = (tblnz_rtnrlttable) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrVendorSurname == null ? that.fstrVendorSurname == null : this.fstrVendorSurname.equals(that.fstrVendorSurname));
    equal = equal && (this.fstrVendorFirstName == null ? that.fstrVendorFirstName == null : this.fstrVendorFirstName.equals(that.fstrVendorFirstName));
    equal = equal && (this.fstrVendorIRDNumber == null ? that.fstrVendorIRDNumber == null : this.fstrVendorIRDNumber.equals(that.fstrVendorIRDNumber));
    equal = equal && (this.flngVendorAccountKey == null ? that.flngVendorAccountKey == null : this.flngVendorAccountKey.equals(that.flngVendorAccountKey));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fcurAmountDeducted == null ? that.fcurAmountDeducted == null : this.fcurAmountDeducted.equals(that.fcurAmountDeducted));
    equal = equal && (this.fstrCertificateOfTitle == null ? that.fstrCertificateOfTitle == null : this.fstrCertificateOfTitle.equals(that.fstrCertificateOfTitle));
    equal = equal && (this.fblnTenPercent == null ? that.fblnTenPercent == null : this.fblnTenPercent.equals(that.fblnTenPercent));
    equal = equal && (this.fblnRLWTRate == null ? that.fblnRLWTRate == null : this.fblnRLWTRate.equals(that.fblnRLWTRate));
    equal = equal && (this.fblnSecurities == null ? that.fblnSecurities == null : this.fblnSecurities.equals(that.fblnSecurities));
    equal = equal && (this.fblnOutstanding == null ? that.fblnOutstanding == null : this.fblnOutstanding.equals(that.fblnOutstanding));
    equal = equal && (this.fcurVendorAmount == null ? that.fcurVendorAmount == null : this.fcurVendorAmount.equals(that.fcurVendorAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrlttable)) {
      return false;
    }
    tblnz_rtnrlttable that = (tblnz_rtnrlttable) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrVendorSurname == null ? that.fstrVendorSurname == null : this.fstrVendorSurname.equals(that.fstrVendorSurname));
    equal = equal && (this.fstrVendorFirstName == null ? that.fstrVendorFirstName == null : this.fstrVendorFirstName.equals(that.fstrVendorFirstName));
    equal = equal && (this.fstrVendorIRDNumber == null ? that.fstrVendorIRDNumber == null : this.fstrVendorIRDNumber.equals(that.fstrVendorIRDNumber));
    equal = equal && (this.flngVendorAccountKey == null ? that.flngVendorAccountKey == null : this.flngVendorAccountKey.equals(that.flngVendorAccountKey));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fcurAmountDeducted == null ? that.fcurAmountDeducted == null : this.fcurAmountDeducted.equals(that.fcurAmountDeducted));
    equal = equal && (this.fstrCertificateOfTitle == null ? that.fstrCertificateOfTitle == null : this.fstrCertificateOfTitle.equals(that.fstrCertificateOfTitle));
    equal = equal && (this.fblnTenPercent == null ? that.fblnTenPercent == null : this.fblnTenPercent.equals(that.fblnTenPercent));
    equal = equal && (this.fblnRLWTRate == null ? that.fblnRLWTRate == null : this.fblnRLWTRate.equals(that.fblnRLWTRate));
    equal = equal && (this.fblnSecurities == null ? that.fblnSecurities == null : this.fblnSecurities.equals(that.fblnSecurities));
    equal = equal && (this.fblnOutstanding == null ? that.fblnOutstanding == null : this.fblnOutstanding.equals(that.fblnOutstanding));
    equal = equal && (this.fcurVendorAmount == null ? that.fcurVendorAmount == null : this.fcurVendorAmount.equals(that.fcurVendorAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrVendorSurname = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrVendorFirstName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrVendorIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.flngVendorAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAmountDeducted = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrCertificateOfTitle = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnTenPercent = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnRLWTRate = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnSecurities = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnOutstanding = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fcurVendorAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrVendorSurname = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrVendorFirstName = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrVendorIRDNumber = JdbcWritableBridge.readString(5, __dbResults);
    this.flngVendorAccountKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAmountDeducted = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrCertificateOfTitle = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnTenPercent = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnRLWTRate = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnSecurities = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnOutstanding = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fcurVendorAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeString(fstrVendorSurname, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorFirstName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVendorAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountDeducted, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCertificateOfTitle, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTenPercent, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRLWTRate, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurities, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOutstanding, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVendorAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorSurname, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorFirstName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorIRDNumber, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVendorAccountKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountDeducted, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCertificateOfTitle, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTenPercent, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRLWTRate, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSecurities, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOutstanding, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVendorAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
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
        this.fstrVendorSurname = null;
    } else {
    this.fstrVendorSurname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVendorFirstName = null;
    } else {
    this.fstrVendorFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVendorIRDNumber = null;
    } else {
    this.fstrVendorIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngVendorAccountKey = null;
    } else {
    this.flngVendorAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountPaid = null;
    } else {
    this.fcurAmountPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountDeducted = null;
    } else {
    this.fcurAmountDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCertificateOfTitle = null;
    } else {
    this.fstrCertificateOfTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTenPercent = null;
    } else {
    this.fblnTenPercent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRLWTRate = null;
    } else {
    this.fblnRLWTRate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSecurities = null;
    } else {
    this.fblnSecurities = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOutstanding = null;
    } else {
    this.fblnOutstanding = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurVendorAmount = null;
    } else {
    this.fcurVendorAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fstrVendorSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorSurname);
    }
    if (null == this.fstrVendorFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorFirstName);
    }
    if (null == this.fstrVendorIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorIRDNumber);
    }
    if (null == this.flngVendorAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVendorAccountKey);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fcurAmountDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountDeducted, __dataOut);
    }
    if (null == this.fstrCertificateOfTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCertificateOfTitle);
    }
    if (null == this.fblnTenPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTenPercent);
    }
    if (null == this.fblnRLWTRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRLWTRate);
    }
    if (null == this.fblnSecurities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurities);
    }
    if (null == this.fblnOutstanding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOutstanding);
    }
    if (null == this.fcurVendorAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVendorAmount, __dataOut);
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
    if (null == this.fstrVendorSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorSurname);
    }
    if (null == this.fstrVendorFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorFirstName);
    }
    if (null == this.fstrVendorIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorIRDNumber);
    }
    if (null == this.flngVendorAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVendorAccountKey);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fcurAmountDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountDeducted, __dataOut);
    }
    if (null == this.fstrCertificateOfTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCertificateOfTitle);
    }
    if (null == this.fblnTenPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTenPercent);
    }
    if (null == this.fblnRLWTRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRLWTRate);
    }
    if (null == this.fblnSecurities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSecurities);
    }
    if (null == this.fblnOutstanding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOutstanding);
    }
    if (null == this.fcurVendorAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVendorAmount, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorSurname==null?"\\N":fstrVendorSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorFirstName==null?"\\N":fstrVendorFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorIRDNumber==null?"\\N":fstrVendorIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVendorAccountKey==null?"\\N":"" + flngVendorAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountDeducted==null?"\\N":fcurAmountDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCertificateOfTitle==null?"\\N":fstrCertificateOfTitle, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTenPercent==null?"\\N":"" + fblnTenPercent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRLWTRate==null?"\\N":"" + fblnRLWTRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurities==null?"\\N":"" + fblnSecurities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOutstanding==null?"\\N":"" + fblnOutstanding, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVendorAmount==null?"\\N":fcurVendorAmount.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorSurname==null?"\\N":fstrVendorSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorFirstName==null?"\\N":fstrVendorFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorIRDNumber==null?"\\N":fstrVendorIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVendorAccountKey==null?"\\N":"" + flngVendorAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountDeducted==null?"\\N":fcurAmountDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCertificateOfTitle==null?"\\N":fstrCertificateOfTitle, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTenPercent==null?"\\N":"" + fblnTenPercent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRLWTRate==null?"\\N":"" + fblnRLWTRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSecurities==null?"\\N":"" + fblnSecurities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOutstanding==null?"\\N":"" + fblnOutstanding, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVendorAmount==null?"\\N":fcurVendorAmount.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.fstrVendorSurname = null; } else {
      this.fstrVendorSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorFirstName = null; } else {
      this.fstrVendorFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorIRDNumber = null; } else {
      this.fstrVendorIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVendorAccountKey = null; } else {
      this.flngVendorAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountDeducted = null; } else {
      this.fcurAmountDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCertificateOfTitle = null; } else {
      this.fstrCertificateOfTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTenPercent = null; } else {
      this.fblnTenPercent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRLWTRate = null; } else {
      this.fblnRLWTRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurities = null; } else {
      this.fblnSecurities = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOutstanding = null; } else {
      this.fblnOutstanding = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVendorAmount = null; } else {
      this.fcurVendorAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVendorSurname = null; } else {
      this.fstrVendorSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorFirstName = null; } else {
      this.fstrVendorFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVendorIRDNumber = null; } else {
      this.fstrVendorIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVendorAccountKey = null; } else {
      this.flngVendorAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountDeducted = null; } else {
      this.fcurAmountDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCertificateOfTitle = null; } else {
      this.fstrCertificateOfTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTenPercent = null; } else {
      this.fblnTenPercent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRLWTRate = null; } else {
      this.fblnRLWTRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSecurities = null; } else {
      this.fblnSecurities = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOutstanding = null; } else {
      this.fblnOutstanding = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVendorAmount = null; } else {
      this.fcurVendorAmount = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnrlttable o = (tblnz_rtnrlttable) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrlttable o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrVendorSurname", this.fstrVendorSurname);
    __sqoop$field_map.put("fstrVendorFirstName", this.fstrVendorFirstName);
    __sqoop$field_map.put("fstrVendorIRDNumber", this.fstrVendorIRDNumber);
    __sqoop$field_map.put("flngVendorAccountKey", this.flngVendorAccountKey);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fcurAmountDeducted", this.fcurAmountDeducted);
    __sqoop$field_map.put("fstrCertificateOfTitle", this.fstrCertificateOfTitle);
    __sqoop$field_map.put("fblnTenPercent", this.fblnTenPercent);
    __sqoop$field_map.put("fblnRLWTRate", this.fblnRLWTRate);
    __sqoop$field_map.put("fblnSecurities", this.fblnSecurities);
    __sqoop$field_map.put("fblnOutstanding", this.fblnOutstanding);
    __sqoop$field_map.put("fcurVendorAmount", this.fcurVendorAmount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrVendorSurname", this.fstrVendorSurname);
    __sqoop$field_map.put("fstrVendorFirstName", this.fstrVendorFirstName);
    __sqoop$field_map.put("fstrVendorIRDNumber", this.fstrVendorIRDNumber);
    __sqoop$field_map.put("flngVendorAccountKey", this.flngVendorAccountKey);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fcurAmountDeducted", this.fcurAmountDeducted);
    __sqoop$field_map.put("fstrCertificateOfTitle", this.fstrCertificateOfTitle);
    __sqoop$field_map.put("fblnTenPercent", this.fblnTenPercent);
    __sqoop$field_map.put("fblnRLWTRate", this.fblnRLWTRate);
    __sqoop$field_map.put("fblnSecurities", this.fblnSecurities);
    __sqoop$field_map.put("fblnOutstanding", this.fblnOutstanding);
    __sqoop$field_map.put("fcurVendorAmount", this.fcurVendorAmount);
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
