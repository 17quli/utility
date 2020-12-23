// ORM class for table 'tblnz_ksb2bpaymentoutbound'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:56:25 NZDT 2020
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

public class tblnz_ksb2bpaymentoutbound extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64KSB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fi64KSB2BKey = (Long)value;
      }
    });
    setters.put("fi64ContributionDetailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fi64ContributionDetailKey = (Long)value;
      }
    });
    setters.put("fstrPaymentID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrPaymentID = (String)value;
      }
    });
    setters.put("fstrPaymentType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrPaymentType = (String)value;
      }
    });
    setters.put("fcurPaymentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fcurPaymentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPaymentLineID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrPaymentLineID = (String)value;
      }
    });
    setters.put("fstrPaymentDocumentNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrPaymentDocumentNumber = (String)value;
      }
    });
    setters.put("fstrPaymentDocumentLineNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrPaymentDocumentLineNumber = (String)value;
      }
    });
    setters.put("fstrEmployerIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrEmployerIRDNumber = (String)value;
      }
    });
    setters.put("fstrEmployerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrEmployerName = (String)value;
      }
    });
    setters.put("fdtmPayDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fdtmPayDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fdtmInterest = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmGVCPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fdtmGVCPeriodEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmVoluntaryPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fdtmVoluntaryPayment = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurEmployerContributionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fcurEmployerContributionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksb2bpaymentoutbound.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksb2bpaymentoutbound() {
    init0();
  }
  private Long fi64KSB2BKey;
  public Long get_fi64KSB2BKey() {
    return fi64KSB2BKey;
  }
  public void set_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
  }
  public tblnz_ksb2bpaymentoutbound with_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
    return this;
  }
  private Long fi64ContributionDetailKey;
  public Long get_fi64ContributionDetailKey() {
    return fi64ContributionDetailKey;
  }
  public void set_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
  }
  public tblnz_ksb2bpaymentoutbound with_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
    return this;
  }
  private String fstrPaymentID;
  public String get_fstrPaymentID() {
    return fstrPaymentID;
  }
  public void set_fstrPaymentID(String fstrPaymentID) {
    this.fstrPaymentID = fstrPaymentID;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrPaymentID(String fstrPaymentID) {
    this.fstrPaymentID = fstrPaymentID;
    return this;
  }
  private String fstrPaymentType;
  public String get_fstrPaymentType() {
    return fstrPaymentType;
  }
  public void set_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrPaymentType(String fstrPaymentType) {
    this.fstrPaymentType = fstrPaymentType;
    return this;
  }
  private java.math.BigDecimal fcurPaymentAmount;
  public java.math.BigDecimal get_fcurPaymentAmount() {
    return fcurPaymentAmount;
  }
  public void set_fcurPaymentAmount(java.math.BigDecimal fcurPaymentAmount) {
    this.fcurPaymentAmount = fcurPaymentAmount;
  }
  public tblnz_ksb2bpaymentoutbound with_fcurPaymentAmount(java.math.BigDecimal fcurPaymentAmount) {
    this.fcurPaymentAmount = fcurPaymentAmount;
    return this;
  }
  private String fstrPaymentLineID;
  public String get_fstrPaymentLineID() {
    return fstrPaymentLineID;
  }
  public void set_fstrPaymentLineID(String fstrPaymentLineID) {
    this.fstrPaymentLineID = fstrPaymentLineID;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrPaymentLineID(String fstrPaymentLineID) {
    this.fstrPaymentLineID = fstrPaymentLineID;
    return this;
  }
  private String fstrPaymentDocumentNumber;
  public String get_fstrPaymentDocumentNumber() {
    return fstrPaymentDocumentNumber;
  }
  public void set_fstrPaymentDocumentNumber(String fstrPaymentDocumentNumber) {
    this.fstrPaymentDocumentNumber = fstrPaymentDocumentNumber;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrPaymentDocumentNumber(String fstrPaymentDocumentNumber) {
    this.fstrPaymentDocumentNumber = fstrPaymentDocumentNumber;
    return this;
  }
  private String fstrPaymentDocumentLineNumber;
  public String get_fstrPaymentDocumentLineNumber() {
    return fstrPaymentDocumentLineNumber;
  }
  public void set_fstrPaymentDocumentLineNumber(String fstrPaymentDocumentLineNumber) {
    this.fstrPaymentDocumentLineNumber = fstrPaymentDocumentLineNumber;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrPaymentDocumentLineNumber(String fstrPaymentDocumentLineNumber) {
    this.fstrPaymentDocumentLineNumber = fstrPaymentDocumentLineNumber;
    return this;
  }
  private String fstrEmployerIRDNumber;
  public String get_fstrEmployerIRDNumber() {
    return fstrEmployerIRDNumber;
  }
  public void set_fstrEmployerIRDNumber(String fstrEmployerIRDNumber) {
    this.fstrEmployerIRDNumber = fstrEmployerIRDNumber;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrEmployerIRDNumber(String fstrEmployerIRDNumber) {
    this.fstrEmployerIRDNumber = fstrEmployerIRDNumber;
    return this;
  }
  private String fstrEmployerName;
  public String get_fstrEmployerName() {
    return fstrEmployerName;
  }
  public void set_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
    return this;
  }
  private java.sql.Timestamp fdtmPayDate;
  public java.sql.Timestamp get_fdtmPayDate() {
    return fdtmPayDate;
  }
  public void set_fdtmPayDate(java.sql.Timestamp fdtmPayDate) {
    this.fdtmPayDate = fdtmPayDate;
  }
  public tblnz_ksb2bpaymentoutbound with_fdtmPayDate(java.sql.Timestamp fdtmPayDate) {
    this.fdtmPayDate = fdtmPayDate;
    return this;
  }
  private java.sql.Timestamp fdtmInterest;
  public java.sql.Timestamp get_fdtmInterest() {
    return fdtmInterest;
  }
  public void set_fdtmInterest(java.sql.Timestamp fdtmInterest) {
    this.fdtmInterest = fdtmInterest;
  }
  public tblnz_ksb2bpaymentoutbound with_fdtmInterest(java.sql.Timestamp fdtmInterest) {
    this.fdtmInterest = fdtmInterest;
    return this;
  }
  private java.sql.Timestamp fdtmGVCPeriodEnd;
  public java.sql.Timestamp get_fdtmGVCPeriodEnd() {
    return fdtmGVCPeriodEnd;
  }
  public void set_fdtmGVCPeriodEnd(java.sql.Timestamp fdtmGVCPeriodEnd) {
    this.fdtmGVCPeriodEnd = fdtmGVCPeriodEnd;
  }
  public tblnz_ksb2bpaymentoutbound with_fdtmGVCPeriodEnd(java.sql.Timestamp fdtmGVCPeriodEnd) {
    this.fdtmGVCPeriodEnd = fdtmGVCPeriodEnd;
    return this;
  }
  private java.sql.Timestamp fdtmVoluntaryPayment;
  public java.sql.Timestamp get_fdtmVoluntaryPayment() {
    return fdtmVoluntaryPayment;
  }
  public void set_fdtmVoluntaryPayment(java.sql.Timestamp fdtmVoluntaryPayment) {
    this.fdtmVoluntaryPayment = fdtmVoluntaryPayment;
  }
  public tblnz_ksb2bpaymentoutbound with_fdtmVoluntaryPayment(java.sql.Timestamp fdtmVoluntaryPayment) {
    this.fdtmVoluntaryPayment = fdtmVoluntaryPayment;
    return this;
  }
  private java.math.BigDecimal fcurEmployerContributionAmount;
  public java.math.BigDecimal get_fcurEmployerContributionAmount() {
    return fcurEmployerContributionAmount;
  }
  public void set_fcurEmployerContributionAmount(java.math.BigDecimal fcurEmployerContributionAmount) {
    this.fcurEmployerContributionAmount = fcurEmployerContributionAmount;
  }
  public tblnz_ksb2bpaymentoutbound with_fcurEmployerContributionAmount(java.math.BigDecimal fcurEmployerContributionAmount) {
    this.fcurEmployerContributionAmount = fcurEmployerContributionAmount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksb2bpaymentoutbound with_fstrWho(String fstrWho) {
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
  public tblnz_ksb2bpaymentoutbound with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bpaymentoutbound)) {
      return false;
    }
    tblnz_ksb2bpaymentoutbound that = (tblnz_ksb2bpaymentoutbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fstrPaymentID == null ? that.fstrPaymentID == null : this.fstrPaymentID.equals(that.fstrPaymentID));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurPaymentAmount == null ? that.fcurPaymentAmount == null : this.fcurPaymentAmount.equals(that.fcurPaymentAmount));
    equal = equal && (this.fstrPaymentLineID == null ? that.fstrPaymentLineID == null : this.fstrPaymentLineID.equals(that.fstrPaymentLineID));
    equal = equal && (this.fstrPaymentDocumentNumber == null ? that.fstrPaymentDocumentNumber == null : this.fstrPaymentDocumentNumber.equals(that.fstrPaymentDocumentNumber));
    equal = equal && (this.fstrPaymentDocumentLineNumber == null ? that.fstrPaymentDocumentLineNumber == null : this.fstrPaymentDocumentLineNumber.equals(that.fstrPaymentDocumentLineNumber));
    equal = equal && (this.fstrEmployerIRDNumber == null ? that.fstrEmployerIRDNumber == null : this.fstrEmployerIRDNumber.equals(that.fstrEmployerIRDNumber));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fdtmPayDate == null ? that.fdtmPayDate == null : this.fdtmPayDate.equals(that.fdtmPayDate));
    equal = equal && (this.fdtmInterest == null ? that.fdtmInterest == null : this.fdtmInterest.equals(that.fdtmInterest));
    equal = equal && (this.fdtmGVCPeriodEnd == null ? that.fdtmGVCPeriodEnd == null : this.fdtmGVCPeriodEnd.equals(that.fdtmGVCPeriodEnd));
    equal = equal && (this.fdtmVoluntaryPayment == null ? that.fdtmVoluntaryPayment == null : this.fdtmVoluntaryPayment.equals(that.fdtmVoluntaryPayment));
    equal = equal && (this.fcurEmployerContributionAmount == null ? that.fcurEmployerContributionAmount == null : this.fcurEmployerContributionAmount.equals(that.fcurEmployerContributionAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksb2bpaymentoutbound)) {
      return false;
    }
    tblnz_ksb2bpaymentoutbound that = (tblnz_ksb2bpaymentoutbound) o;
    boolean equal = true;
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fstrPaymentID == null ? that.fstrPaymentID == null : this.fstrPaymentID.equals(that.fstrPaymentID));
    equal = equal && (this.fstrPaymentType == null ? that.fstrPaymentType == null : this.fstrPaymentType.equals(that.fstrPaymentType));
    equal = equal && (this.fcurPaymentAmount == null ? that.fcurPaymentAmount == null : this.fcurPaymentAmount.equals(that.fcurPaymentAmount));
    equal = equal && (this.fstrPaymentLineID == null ? that.fstrPaymentLineID == null : this.fstrPaymentLineID.equals(that.fstrPaymentLineID));
    equal = equal && (this.fstrPaymentDocumentNumber == null ? that.fstrPaymentDocumentNumber == null : this.fstrPaymentDocumentNumber.equals(that.fstrPaymentDocumentNumber));
    equal = equal && (this.fstrPaymentDocumentLineNumber == null ? that.fstrPaymentDocumentLineNumber == null : this.fstrPaymentDocumentLineNumber.equals(that.fstrPaymentDocumentLineNumber));
    equal = equal && (this.fstrEmployerIRDNumber == null ? that.fstrEmployerIRDNumber == null : this.fstrEmployerIRDNumber.equals(that.fstrEmployerIRDNumber));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fdtmPayDate == null ? that.fdtmPayDate == null : this.fdtmPayDate.equals(that.fdtmPayDate));
    equal = equal && (this.fdtmInterest == null ? that.fdtmInterest == null : this.fdtmInterest.equals(that.fdtmInterest));
    equal = equal && (this.fdtmGVCPeriodEnd == null ? that.fdtmGVCPeriodEnd == null : this.fdtmGVCPeriodEnd.equals(that.fdtmGVCPeriodEnd));
    equal = equal && (this.fdtmVoluntaryPayment == null ? that.fdtmVoluntaryPayment == null : this.fdtmVoluntaryPayment.equals(that.fdtmVoluntaryPayment));
    equal = equal && (this.fcurEmployerContributionAmount == null ? that.fcurEmployerContributionAmount == null : this.fcurEmployerContributionAmount.equals(that.fcurEmployerContributionAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrPaymentID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPaymentAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrPaymentLineID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentDocumentNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentDocumentLineNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployerIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmPayDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmInterest = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmGVCPeriodEnd = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmVoluntaryPayment = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurEmployerContributionAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrPaymentID = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPaymentType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPaymentAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrPaymentLineID = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentDocumentNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentDocumentLineNumber = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployerIRDNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmPayDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmInterest = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmGVCPeriodEnd = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmVoluntaryPayment = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fcurEmployerContributionAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentLineID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentLineNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInterest, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmGVCPeriodEnd, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVoluntaryPayment, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployerContributionAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentID, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaymentAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentLineID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentDocumentLineNumber, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRDNumber, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInterest, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmGVCPeriodEnd, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVoluntaryPayment, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployerContributionAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64KSB2BKey = null;
    } else {
    this.fi64KSB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionDetailKey = null;
    } else {
    this.fi64ContributionDetailKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentID = null;
    } else {
    this.fstrPaymentID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentType = null;
    } else {
    this.fstrPaymentType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPaymentAmount = null;
    } else {
    this.fcurPaymentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentLineID = null;
    } else {
    this.fstrPaymentLineID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentDocumentNumber = null;
    } else {
    this.fstrPaymentDocumentNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentDocumentLineNumber = null;
    } else {
    this.fstrPaymentDocumentLineNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerIRDNumber = null;
    } else {
    this.fstrEmployerIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerName = null;
    } else {
    this.fstrEmployerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDate = null;
    } else {
    this.fdtmPayDate = new Timestamp(__dataIn.readLong());
    this.fdtmPayDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInterest = null;
    } else {
    this.fdtmInterest = new Timestamp(__dataIn.readLong());
    this.fdtmInterest.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmGVCPeriodEnd = null;
    } else {
    this.fdtmGVCPeriodEnd = new Timestamp(__dataIn.readLong());
    this.fdtmGVCPeriodEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVoluntaryPayment = null;
    } else {
    this.fdtmVoluntaryPayment = new Timestamp(__dataIn.readLong());
    this.fdtmVoluntaryPayment.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEmployerContributionAmount = null;
    } else {
    this.fcurEmployerContributionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fstrPaymentID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentID);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmount, __dataOut);
    }
    if (null == this.fstrPaymentLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentLineID);
    }
    if (null == this.fstrPaymentDocumentNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentNumber);
    }
    if (null == this.fstrPaymentDocumentLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentLineNumber);
    }
    if (null == this.fstrEmployerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRDNumber);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fdtmPayDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDate.getTime());
    __dataOut.writeInt(this.fdtmPayDate.getNanos());
    }
    if (null == this.fdtmInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInterest.getTime());
    __dataOut.writeInt(this.fdtmInterest.getNanos());
    }
    if (null == this.fdtmGVCPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmGVCPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmGVCPeriodEnd.getNanos());
    }
    if (null == this.fdtmVoluntaryPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVoluntaryPayment.getTime());
    __dataOut.writeInt(this.fdtmVoluntaryPayment.getNanos());
    }
    if (null == this.fcurEmployerContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployerContributionAmount, __dataOut);
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
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fstrPaymentID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentID);
    }
    if (null == this.fstrPaymentType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentType);
    }
    if (null == this.fcurPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaymentAmount, __dataOut);
    }
    if (null == this.fstrPaymentLineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentLineID);
    }
    if (null == this.fstrPaymentDocumentNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentNumber);
    }
    if (null == this.fstrPaymentDocumentLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentDocumentLineNumber);
    }
    if (null == this.fstrEmployerIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRDNumber);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fdtmPayDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDate.getTime());
    __dataOut.writeInt(this.fdtmPayDate.getNanos());
    }
    if (null == this.fdtmInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInterest.getTime());
    __dataOut.writeInt(this.fdtmInterest.getNanos());
    }
    if (null == this.fdtmGVCPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmGVCPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmGVCPeriodEnd.getNanos());
    }
    if (null == this.fdtmVoluntaryPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVoluntaryPayment.getTime());
    __dataOut.writeInt(this.fdtmVoluntaryPayment.getNanos());
    }
    if (null == this.fcurEmployerContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployerContributionAmount, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentID==null?"\\N":fstrPaymentID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmount==null?"\\N":fcurPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentLineID==null?"\\N":fstrPaymentLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentNumber==null?"\\N":fstrPaymentDocumentNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentLineNumber==null?"\\N":fstrPaymentDocumentLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRDNumber==null?"\\N":fstrEmployerIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDate==null?"\\N":"" + fdtmPayDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInterest==null?"\\N":"" + fdtmInterest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmGVCPeriodEnd==null?"\\N":"" + fdtmGVCPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVoluntaryPayment==null?"\\N":"" + fdtmVoluntaryPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployerContributionAmount==null?"\\N":fcurEmployerContributionAmount.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentID==null?"\\N":fstrPaymentID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentType==null?"\\N":fstrPaymentType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaymentAmount==null?"\\N":fcurPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentLineID==null?"\\N":fstrPaymentLineID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentNumber==null?"\\N":fstrPaymentDocumentNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentDocumentLineNumber==null?"\\N":fstrPaymentDocumentLineNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRDNumber==null?"\\N":fstrEmployerIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDate==null?"\\N":"" + fdtmPayDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInterest==null?"\\N":"" + fdtmInterest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmGVCPeriodEnd==null?"\\N":"" + fdtmGVCPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVoluntaryPayment==null?"\\N":"" + fdtmVoluntaryPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployerContributionAmount==null?"\\N":fcurEmployerContributionAmount.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentID = null; } else {
      this.fstrPaymentID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentType = null; } else {
      this.fstrPaymentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmount = null; } else {
      this.fcurPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentLineID = null; } else {
      this.fstrPaymentLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentNumber = null; } else {
      this.fstrPaymentDocumentNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentLineNumber = null; } else {
      this.fstrPaymentDocumentLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRDNumber = null; } else {
      this.fstrEmployerIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDate = null; } else {
      this.fdtmPayDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInterest = null; } else {
      this.fdtmInterest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmGVCPeriodEnd = null; } else {
      this.fdtmGVCPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVoluntaryPayment = null; } else {
      this.fdtmVoluntaryPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployerContributionAmount = null; } else {
      this.fcurEmployerContributionAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentID = null; } else {
      this.fstrPaymentID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentType = null; } else {
      this.fstrPaymentType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaymentAmount = null; } else {
      this.fcurPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentLineID = null; } else {
      this.fstrPaymentLineID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentNumber = null; } else {
      this.fstrPaymentDocumentNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentDocumentLineNumber = null; } else {
      this.fstrPaymentDocumentLineNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRDNumber = null; } else {
      this.fstrEmployerIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDate = null; } else {
      this.fdtmPayDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInterest = null; } else {
      this.fdtmInterest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmGVCPeriodEnd = null; } else {
      this.fdtmGVCPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVoluntaryPayment = null; } else {
      this.fdtmVoluntaryPayment = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployerContributionAmount = null; } else {
      this.fcurEmployerContributionAmount = new java.math.BigDecimal(__cur_str);
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
    tblnz_ksb2bpaymentoutbound o = (tblnz_ksb2bpaymentoutbound) super.clone();
    o.fdtmPayDate = (o.fdtmPayDate != null) ? (java.sql.Timestamp) o.fdtmPayDate.clone() : null;
    o.fdtmInterest = (o.fdtmInterest != null) ? (java.sql.Timestamp) o.fdtmInterest.clone() : null;
    o.fdtmGVCPeriodEnd = (o.fdtmGVCPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmGVCPeriodEnd.clone() : null;
    o.fdtmVoluntaryPayment = (o.fdtmVoluntaryPayment != null) ? (java.sql.Timestamp) o.fdtmVoluntaryPayment.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksb2bpaymentoutbound o) throws CloneNotSupportedException {
    o.fdtmPayDate = (o.fdtmPayDate != null) ? (java.sql.Timestamp) o.fdtmPayDate.clone() : null;
    o.fdtmInterest = (o.fdtmInterest != null) ? (java.sql.Timestamp) o.fdtmInterest.clone() : null;
    o.fdtmGVCPeriodEnd = (o.fdtmGVCPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmGVCPeriodEnd.clone() : null;
    o.fdtmVoluntaryPayment = (o.fdtmVoluntaryPayment != null) ? (java.sql.Timestamp) o.fdtmVoluntaryPayment.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fstrPaymentID", this.fstrPaymentID);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurPaymentAmount", this.fcurPaymentAmount);
    __sqoop$field_map.put("fstrPaymentLineID", this.fstrPaymentLineID);
    __sqoop$field_map.put("fstrPaymentDocumentNumber", this.fstrPaymentDocumentNumber);
    __sqoop$field_map.put("fstrPaymentDocumentLineNumber", this.fstrPaymentDocumentLineNumber);
    __sqoop$field_map.put("fstrEmployerIRDNumber", this.fstrEmployerIRDNumber);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fdtmPayDate", this.fdtmPayDate);
    __sqoop$field_map.put("fdtmInterest", this.fdtmInterest);
    __sqoop$field_map.put("fdtmGVCPeriodEnd", this.fdtmGVCPeriodEnd);
    __sqoop$field_map.put("fdtmVoluntaryPayment", this.fdtmVoluntaryPayment);
    __sqoop$field_map.put("fcurEmployerContributionAmount", this.fcurEmployerContributionAmount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fstrPaymentID", this.fstrPaymentID);
    __sqoop$field_map.put("fstrPaymentType", this.fstrPaymentType);
    __sqoop$field_map.put("fcurPaymentAmount", this.fcurPaymentAmount);
    __sqoop$field_map.put("fstrPaymentLineID", this.fstrPaymentLineID);
    __sqoop$field_map.put("fstrPaymentDocumentNumber", this.fstrPaymentDocumentNumber);
    __sqoop$field_map.put("fstrPaymentDocumentLineNumber", this.fstrPaymentDocumentLineNumber);
    __sqoop$field_map.put("fstrEmployerIRDNumber", this.fstrEmployerIRDNumber);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fdtmPayDate", this.fdtmPayDate);
    __sqoop$field_map.put("fdtmInterest", this.fdtmInterest);
    __sqoop$field_map.put("fdtmGVCPeriodEnd", this.fdtmGVCPeriodEnd);
    __sqoop$field_map.put("fdtmVoluntaryPayment", this.fdtmVoluntaryPayment);
    __sqoop$field_map.put("fcurEmployerContributionAmount", this.fcurEmployerContributionAmount);
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
