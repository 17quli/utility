// ORM class for table 'tblnz_rtnreb'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:54:51 NZDT 2020
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

public class tblnz_rtnreb extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurSchoolDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurSchoolDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurReligiousDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurReligiousDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRemainingDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurRemainingDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalReceipt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurTotalReceipt = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCareAndHousePayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurCareAndHousePayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCareAndHouseCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurCareAndHouseCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFinalTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurFinalTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPartnerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fstrPartnerIRD = (String)value;
      }
    });
    setters.put("fstrTransferIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fstrTransferIRD = (String)value;
      }
    });
    setters.put("fcurTransferAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fcurTransferAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnWaitingOnIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fblnWaitingOnIncome = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnreb.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnreb() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnreb with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurSchoolDonations;
  public java.math.BigDecimal get_fcurSchoolDonations() {
    return fcurSchoolDonations;
  }
  public void set_fcurSchoolDonations(java.math.BigDecimal fcurSchoolDonations) {
    this.fcurSchoolDonations = fcurSchoolDonations;
  }
  public tblnz_rtnreb with_fcurSchoolDonations(java.math.BigDecimal fcurSchoolDonations) {
    this.fcurSchoolDonations = fcurSchoolDonations;
    return this;
  }
  private java.math.BigDecimal fcurReligiousDonations;
  public java.math.BigDecimal get_fcurReligiousDonations() {
    return fcurReligiousDonations;
  }
  public void set_fcurReligiousDonations(java.math.BigDecimal fcurReligiousDonations) {
    this.fcurReligiousDonations = fcurReligiousDonations;
  }
  public tblnz_rtnreb with_fcurReligiousDonations(java.math.BigDecimal fcurReligiousDonations) {
    this.fcurReligiousDonations = fcurReligiousDonations;
    return this;
  }
  private java.math.BigDecimal fcurRemainingDonations;
  public java.math.BigDecimal get_fcurRemainingDonations() {
    return fcurRemainingDonations;
  }
  public void set_fcurRemainingDonations(java.math.BigDecimal fcurRemainingDonations) {
    this.fcurRemainingDonations = fcurRemainingDonations;
  }
  public tblnz_rtnreb with_fcurRemainingDonations(java.math.BigDecimal fcurRemainingDonations) {
    this.fcurRemainingDonations = fcurRemainingDonations;
    return this;
  }
  private java.math.BigDecimal fcurTotalReceipt;
  public java.math.BigDecimal get_fcurTotalReceipt() {
    return fcurTotalReceipt;
  }
  public void set_fcurTotalReceipt(java.math.BigDecimal fcurTotalReceipt) {
    this.fcurTotalReceipt = fcurTotalReceipt;
  }
  public tblnz_rtnreb with_fcurTotalReceipt(java.math.BigDecimal fcurTotalReceipt) {
    this.fcurTotalReceipt = fcurTotalReceipt;
    return this;
  }
  private java.math.BigDecimal fcurCareAndHousePayments;
  public java.math.BigDecimal get_fcurCareAndHousePayments() {
    return fcurCareAndHousePayments;
  }
  public void set_fcurCareAndHousePayments(java.math.BigDecimal fcurCareAndHousePayments) {
    this.fcurCareAndHousePayments = fcurCareAndHousePayments;
  }
  public tblnz_rtnreb with_fcurCareAndHousePayments(java.math.BigDecimal fcurCareAndHousePayments) {
    this.fcurCareAndHousePayments = fcurCareAndHousePayments;
    return this;
  }
  private java.math.BigDecimal fcurCareAndHouseCredits;
  public java.math.BigDecimal get_fcurCareAndHouseCredits() {
    return fcurCareAndHouseCredits;
  }
  public void set_fcurCareAndHouseCredits(java.math.BigDecimal fcurCareAndHouseCredits) {
    this.fcurCareAndHouseCredits = fcurCareAndHouseCredits;
  }
  public tblnz_rtnreb with_fcurCareAndHouseCredits(java.math.BigDecimal fcurCareAndHouseCredits) {
    this.fcurCareAndHouseCredits = fcurCareAndHouseCredits;
    return this;
  }
  private java.math.BigDecimal fcurFinalTotal;
  public java.math.BigDecimal get_fcurFinalTotal() {
    return fcurFinalTotal;
  }
  public void set_fcurFinalTotal(java.math.BigDecimal fcurFinalTotal) {
    this.fcurFinalTotal = fcurFinalTotal;
  }
  public tblnz_rtnreb with_fcurFinalTotal(java.math.BigDecimal fcurFinalTotal) {
    this.fcurFinalTotal = fcurFinalTotal;
    return this;
  }
  private String fstrPartnerIRD;
  public String get_fstrPartnerIRD() {
    return fstrPartnerIRD;
  }
  public void set_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
  }
  public tblnz_rtnreb with_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
    return this;
  }
  private String fstrTransferIRD;
  public String get_fstrTransferIRD() {
    return fstrTransferIRD;
  }
  public void set_fstrTransferIRD(String fstrTransferIRD) {
    this.fstrTransferIRD = fstrTransferIRD;
  }
  public tblnz_rtnreb with_fstrTransferIRD(String fstrTransferIRD) {
    this.fstrTransferIRD = fstrTransferIRD;
    return this;
  }
  private java.math.BigDecimal fcurTransferAmount;
  public java.math.BigDecimal get_fcurTransferAmount() {
    return fcurTransferAmount;
  }
  public void set_fcurTransferAmount(java.math.BigDecimal fcurTransferAmount) {
    this.fcurTransferAmount = fcurTransferAmount;
  }
  public tblnz_rtnreb with_fcurTransferAmount(java.math.BigDecimal fcurTransferAmount) {
    this.fcurTransferAmount = fcurTransferAmount;
    return this;
  }
  private Integer fblnWaitingOnIncome;
  public Integer get_fblnWaitingOnIncome() {
    return fblnWaitingOnIncome;
  }
  public void set_fblnWaitingOnIncome(Integer fblnWaitingOnIncome) {
    this.fblnWaitingOnIncome = fblnWaitingOnIncome;
  }
  public tblnz_rtnreb with_fblnWaitingOnIncome(Integer fblnWaitingOnIncome) {
    this.fblnWaitingOnIncome = fblnWaitingOnIncome;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnreb with_fstrWho(String fstrWho) {
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
  public tblnz_rtnreb with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnreb)) {
      return false;
    }
    tblnz_rtnreb that = (tblnz_rtnreb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSchoolDonations == null ? that.fcurSchoolDonations == null : this.fcurSchoolDonations.equals(that.fcurSchoolDonations));
    equal = equal && (this.fcurReligiousDonations == null ? that.fcurReligiousDonations == null : this.fcurReligiousDonations.equals(that.fcurReligiousDonations));
    equal = equal && (this.fcurRemainingDonations == null ? that.fcurRemainingDonations == null : this.fcurRemainingDonations.equals(that.fcurRemainingDonations));
    equal = equal && (this.fcurTotalReceipt == null ? that.fcurTotalReceipt == null : this.fcurTotalReceipt.equals(that.fcurTotalReceipt));
    equal = equal && (this.fcurCareAndHousePayments == null ? that.fcurCareAndHousePayments == null : this.fcurCareAndHousePayments.equals(that.fcurCareAndHousePayments));
    equal = equal && (this.fcurCareAndHouseCredits == null ? that.fcurCareAndHouseCredits == null : this.fcurCareAndHouseCredits.equals(that.fcurCareAndHouseCredits));
    equal = equal && (this.fcurFinalTotal == null ? that.fcurFinalTotal == null : this.fcurFinalTotal.equals(that.fcurFinalTotal));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.fstrTransferIRD == null ? that.fstrTransferIRD == null : this.fstrTransferIRD.equals(that.fstrTransferIRD));
    equal = equal && (this.fcurTransferAmount == null ? that.fcurTransferAmount == null : this.fcurTransferAmount.equals(that.fcurTransferAmount));
    equal = equal && (this.fblnWaitingOnIncome == null ? that.fblnWaitingOnIncome == null : this.fblnWaitingOnIncome.equals(that.fblnWaitingOnIncome));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnreb)) {
      return false;
    }
    tblnz_rtnreb that = (tblnz_rtnreb) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurSchoolDonations == null ? that.fcurSchoolDonations == null : this.fcurSchoolDonations.equals(that.fcurSchoolDonations));
    equal = equal && (this.fcurReligiousDonations == null ? that.fcurReligiousDonations == null : this.fcurReligiousDonations.equals(that.fcurReligiousDonations));
    equal = equal && (this.fcurRemainingDonations == null ? that.fcurRemainingDonations == null : this.fcurRemainingDonations.equals(that.fcurRemainingDonations));
    equal = equal && (this.fcurTotalReceipt == null ? that.fcurTotalReceipt == null : this.fcurTotalReceipt.equals(that.fcurTotalReceipt));
    equal = equal && (this.fcurCareAndHousePayments == null ? that.fcurCareAndHousePayments == null : this.fcurCareAndHousePayments.equals(that.fcurCareAndHousePayments));
    equal = equal && (this.fcurCareAndHouseCredits == null ? that.fcurCareAndHouseCredits == null : this.fcurCareAndHouseCredits.equals(that.fcurCareAndHouseCredits));
    equal = equal && (this.fcurFinalTotal == null ? that.fcurFinalTotal == null : this.fcurFinalTotal.equals(that.fcurFinalTotal));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.fstrTransferIRD == null ? that.fstrTransferIRD == null : this.fstrTransferIRD.equals(that.fstrTransferIRD));
    equal = equal && (this.fcurTransferAmount == null ? that.fcurTransferAmount == null : this.fcurTransferAmount.equals(that.fcurTransferAmount));
    equal = equal && (this.fblnWaitingOnIncome == null ? that.fblnWaitingOnIncome == null : this.fblnWaitingOnIncome.equals(that.fblnWaitingOnIncome));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSchoolDonations = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurReligiousDonations = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRemainingDonations = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalReceipt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurCareAndHousePayments = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurCareAndHouseCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFinalTotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrTransferIRD = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurTransferAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fblnWaitingOnIncome = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurSchoolDonations = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurReligiousDonations = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurRemainingDonations = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurTotalReceipt = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurCareAndHousePayments = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurCareAndHouseCredits = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFinalTotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrTransferIRD = JdbcWritableBridge.readString(10, __dbResults);
    this.fcurTransferAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fblnWaitingOnIncome = JdbcWritableBridge.readInteger(12, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchoolDonations, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReligiousDonations, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingDonations, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalReceipt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCareAndHousePayments, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCareAndHouseCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFinalTotal, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransferIRD, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWaitingOnIncome, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSchoolDonations, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurReligiousDonations, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingDonations, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalReceipt, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCareAndHousePayments, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCareAndHouseCredits, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFinalTotal, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransferIRD, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransferAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWaitingOnIncome, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
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
        this.fcurSchoolDonations = null;
    } else {
    this.fcurSchoolDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurReligiousDonations = null;
    } else {
    this.fcurReligiousDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRemainingDonations = null;
    } else {
    this.fcurRemainingDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalReceipt = null;
    } else {
    this.fcurTotalReceipt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCareAndHousePayments = null;
    } else {
    this.fcurCareAndHousePayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCareAndHouseCredits = null;
    } else {
    this.fcurCareAndHouseCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFinalTotal = null;
    } else {
    this.fcurFinalTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartnerIRD = null;
    } else {
    this.fstrPartnerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransferIRD = null;
    } else {
    this.fstrTransferIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTransferAmount = null;
    } else {
    this.fcurTransferAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWaitingOnIncome = null;
    } else {
    this.fblnWaitingOnIncome = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurSchoolDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchoolDonations, __dataOut);
    }
    if (null == this.fcurReligiousDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReligiousDonations, __dataOut);
    }
    if (null == this.fcurRemainingDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingDonations, __dataOut);
    }
    if (null == this.fcurTotalReceipt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalReceipt, __dataOut);
    }
    if (null == this.fcurCareAndHousePayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCareAndHousePayments, __dataOut);
    }
    if (null == this.fcurCareAndHouseCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCareAndHouseCredits, __dataOut);
    }
    if (null == this.fcurFinalTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFinalTotal, __dataOut);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.fstrTransferIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransferIRD);
    }
    if (null == this.fcurTransferAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferAmount, __dataOut);
    }
    if (null == this.fblnWaitingOnIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWaitingOnIncome);
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
    if (null == this.fcurSchoolDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSchoolDonations, __dataOut);
    }
    if (null == this.fcurReligiousDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurReligiousDonations, __dataOut);
    }
    if (null == this.fcurRemainingDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingDonations, __dataOut);
    }
    if (null == this.fcurTotalReceipt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalReceipt, __dataOut);
    }
    if (null == this.fcurCareAndHousePayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCareAndHousePayments, __dataOut);
    }
    if (null == this.fcurCareAndHouseCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCareAndHouseCredits, __dataOut);
    }
    if (null == this.fcurFinalTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFinalTotal, __dataOut);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.fstrTransferIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransferIRD);
    }
    if (null == this.fcurTransferAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransferAmount, __dataOut);
    }
    if (null == this.fblnWaitingOnIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWaitingOnIncome);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchoolDonations==null?"\\N":fcurSchoolDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReligiousDonations==null?"\\N":fcurReligiousDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingDonations==null?"\\N":fcurRemainingDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalReceipt==null?"\\N":fcurTotalReceipt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCareAndHousePayments==null?"\\N":fcurCareAndHousePayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCareAndHouseCredits==null?"\\N":fcurCareAndHouseCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFinalTotal==null?"\\N":fcurFinalTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransferIRD==null?"\\N":fstrTransferIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferAmount==null?"\\N":fcurTransferAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWaitingOnIncome==null?"\\N":"" + fblnWaitingOnIncome, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSchoolDonations==null?"\\N":fcurSchoolDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurReligiousDonations==null?"\\N":fcurReligiousDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingDonations==null?"\\N":fcurRemainingDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalReceipt==null?"\\N":fcurTotalReceipt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCareAndHousePayments==null?"\\N":fcurCareAndHousePayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCareAndHouseCredits==null?"\\N":fcurCareAndHouseCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFinalTotal==null?"\\N":fcurFinalTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransferIRD==null?"\\N":fstrTransferIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransferAmount==null?"\\N":fcurTransferAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWaitingOnIncome==null?"\\N":"" + fblnWaitingOnIncome, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchoolDonations = null; } else {
      this.fcurSchoolDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReligiousDonations = null; } else {
      this.fcurReligiousDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingDonations = null; } else {
      this.fcurRemainingDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalReceipt = null; } else {
      this.fcurTotalReceipt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCareAndHousePayments = null; } else {
      this.fcurCareAndHousePayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCareAndHouseCredits = null; } else {
      this.fcurCareAndHouseCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFinalTotal = null; } else {
      this.fcurFinalTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransferIRD = null; } else {
      this.fstrTransferIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferAmount = null; } else {
      this.fcurTransferAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWaitingOnIncome = null; } else {
      this.fblnWaitingOnIncome = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSchoolDonations = null; } else {
      this.fcurSchoolDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurReligiousDonations = null; } else {
      this.fcurReligiousDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingDonations = null; } else {
      this.fcurRemainingDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalReceipt = null; } else {
      this.fcurTotalReceipt = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCareAndHousePayments = null; } else {
      this.fcurCareAndHousePayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCareAndHouseCredits = null; } else {
      this.fcurCareAndHouseCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFinalTotal = null; } else {
      this.fcurFinalTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransferIRD = null; } else {
      this.fstrTransferIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransferAmount = null; } else {
      this.fcurTransferAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWaitingOnIncome = null; } else {
      this.fblnWaitingOnIncome = Integer.valueOf(__cur_str);
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
    tblnz_rtnreb o = (tblnz_rtnreb) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnreb o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSchoolDonations", this.fcurSchoolDonations);
    __sqoop$field_map.put("fcurReligiousDonations", this.fcurReligiousDonations);
    __sqoop$field_map.put("fcurRemainingDonations", this.fcurRemainingDonations);
    __sqoop$field_map.put("fcurTotalReceipt", this.fcurTotalReceipt);
    __sqoop$field_map.put("fcurCareAndHousePayments", this.fcurCareAndHousePayments);
    __sqoop$field_map.put("fcurCareAndHouseCredits", this.fcurCareAndHouseCredits);
    __sqoop$field_map.put("fcurFinalTotal", this.fcurFinalTotal);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("fstrTransferIRD", this.fstrTransferIRD);
    __sqoop$field_map.put("fcurTransferAmount", this.fcurTransferAmount);
    __sqoop$field_map.put("fblnWaitingOnIncome", this.fblnWaitingOnIncome);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurSchoolDonations", this.fcurSchoolDonations);
    __sqoop$field_map.put("fcurReligiousDonations", this.fcurReligiousDonations);
    __sqoop$field_map.put("fcurRemainingDonations", this.fcurRemainingDonations);
    __sqoop$field_map.put("fcurTotalReceipt", this.fcurTotalReceipt);
    __sqoop$field_map.put("fcurCareAndHousePayments", this.fcurCareAndHousePayments);
    __sqoop$field_map.put("fcurCareAndHouseCredits", this.fcurCareAndHouseCredits);
    __sqoop$field_map.put("fcurFinalTotal", this.fcurFinalTotal);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("fstrTransferIRD", this.fstrTransferIRD);
    __sqoop$field_map.put("fcurTransferAmount", this.fcurTransferAmount);
    __sqoop$field_map.put("fblnWaitingOnIncome", this.fblnWaitingOnIncome);
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
