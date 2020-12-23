// ORM class for table 'tblnz_rtnrwtp'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:09:12 NZDT 2020
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

public class tblnz_rtnrwtp extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurGrossDistributionIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurGrossDistributionIRD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionIRDMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurDistributionIRDMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurGrossDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurDistributionMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurDividendMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurGrossTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxOnDistributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurTotalTaxOnDistributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditsAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurCreditsAttached = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFDPAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurFDPAttached = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurTotalCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTpayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fcurRWTpayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtp.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrwtp() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnrwtp with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurGrossDistributionIRD;
  public java.math.BigDecimal get_fcurGrossDistributionIRD() {
    return fcurGrossDistributionIRD;
  }
  public void set_fcurGrossDistributionIRD(java.math.BigDecimal fcurGrossDistributionIRD) {
    this.fcurGrossDistributionIRD = fcurGrossDistributionIRD;
  }
  public tblnz_rtnrwtp with_fcurGrossDistributionIRD(java.math.BigDecimal fcurGrossDistributionIRD) {
    this.fcurGrossDistributionIRD = fcurGrossDistributionIRD;
    return this;
  }
  private java.math.BigDecimal fcurDistributionIRDMultiply;
  public java.math.BigDecimal get_fcurDistributionIRDMultiply() {
    return fcurDistributionIRDMultiply;
  }
  public void set_fcurDistributionIRDMultiply(java.math.BigDecimal fcurDistributionIRDMultiply) {
    this.fcurDistributionIRDMultiply = fcurDistributionIRDMultiply;
  }
  public tblnz_rtnrwtp with_fcurDistributionIRDMultiply(java.math.BigDecimal fcurDistributionIRDMultiply) {
    this.fcurDistributionIRDMultiply = fcurDistributionIRDMultiply;
    return this;
  }
  private java.math.BigDecimal fcurGrossDistributions;
  public java.math.BigDecimal get_fcurGrossDistributions() {
    return fcurGrossDistributions;
  }
  public void set_fcurGrossDistributions(java.math.BigDecimal fcurGrossDistributions) {
    this.fcurGrossDistributions = fcurGrossDistributions;
  }
  public tblnz_rtnrwtp with_fcurGrossDistributions(java.math.BigDecimal fcurGrossDistributions) {
    this.fcurGrossDistributions = fcurGrossDistributions;
    return this;
  }
  private java.math.BigDecimal fcurDistributionMultiply;
  public java.math.BigDecimal get_fcurDistributionMultiply() {
    return fcurDistributionMultiply;
  }
  public void set_fcurDistributionMultiply(java.math.BigDecimal fcurDistributionMultiply) {
    this.fcurDistributionMultiply = fcurDistributionMultiply;
  }
  public tblnz_rtnrwtp with_fcurDistributionMultiply(java.math.BigDecimal fcurDistributionMultiply) {
    this.fcurDistributionMultiply = fcurDistributionMultiply;
    return this;
  }
  private java.math.BigDecimal fcurGrossDividends;
  public java.math.BigDecimal get_fcurGrossDividends() {
    return fcurGrossDividends;
  }
  public void set_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
  }
  public tblnz_rtnrwtp with_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurDividendMultiply;
  public java.math.BigDecimal get_fcurDividendMultiply() {
    return fcurDividendMultiply;
  }
  public void set_fcurDividendMultiply(java.math.BigDecimal fcurDividendMultiply) {
    this.fcurDividendMultiply = fcurDividendMultiply;
  }
  public tblnz_rtnrwtp with_fcurDividendMultiply(java.math.BigDecimal fcurDividendMultiply) {
    this.fcurDividendMultiply = fcurDividendMultiply;
    return this;
  }
  private java.math.BigDecimal fcurGrossTotal;
  public java.math.BigDecimal get_fcurGrossTotal() {
    return fcurGrossTotal;
  }
  public void set_fcurGrossTotal(java.math.BigDecimal fcurGrossTotal) {
    this.fcurGrossTotal = fcurGrossTotal;
  }
  public tblnz_rtnrwtp with_fcurGrossTotal(java.math.BigDecimal fcurGrossTotal) {
    this.fcurGrossTotal = fcurGrossTotal;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxOnDistributions;
  public java.math.BigDecimal get_fcurTotalTaxOnDistributions() {
    return fcurTotalTaxOnDistributions;
  }
  public void set_fcurTotalTaxOnDistributions(java.math.BigDecimal fcurTotalTaxOnDistributions) {
    this.fcurTotalTaxOnDistributions = fcurTotalTaxOnDistributions;
  }
  public tblnz_rtnrwtp with_fcurTotalTaxOnDistributions(java.math.BigDecimal fcurTotalTaxOnDistributions) {
    this.fcurTotalTaxOnDistributions = fcurTotalTaxOnDistributions;
    return this;
  }
  private java.math.BigDecimal fcurCreditsAttached;
  public java.math.BigDecimal get_fcurCreditsAttached() {
    return fcurCreditsAttached;
  }
  public void set_fcurCreditsAttached(java.math.BigDecimal fcurCreditsAttached) {
    this.fcurCreditsAttached = fcurCreditsAttached;
  }
  public tblnz_rtnrwtp with_fcurCreditsAttached(java.math.BigDecimal fcurCreditsAttached) {
    this.fcurCreditsAttached = fcurCreditsAttached;
    return this;
  }
  private java.math.BigDecimal fcurFDPAttached;
  public java.math.BigDecimal get_fcurFDPAttached() {
    return fcurFDPAttached;
  }
  public void set_fcurFDPAttached(java.math.BigDecimal fcurFDPAttached) {
    this.fcurFDPAttached = fcurFDPAttached;
  }
  public tblnz_rtnrwtp with_fcurFDPAttached(java.math.BigDecimal fcurFDPAttached) {
    this.fcurFDPAttached = fcurFDPAttached;
    return this;
  }
  private java.math.BigDecimal fcurTotalCredits;
  public java.math.BigDecimal get_fcurTotalCredits() {
    return fcurTotalCredits;
  }
  public void set_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
  }
  public tblnz_rtnrwtp with_fcurTotalCredits(java.math.BigDecimal fcurTotalCredits) {
    this.fcurTotalCredits = fcurTotalCredits;
    return this;
  }
  private java.math.BigDecimal fcurRWTpayable;
  public java.math.BigDecimal get_fcurRWTpayable() {
    return fcurRWTpayable;
  }
  public void set_fcurRWTpayable(java.math.BigDecimal fcurRWTpayable) {
    this.fcurRWTpayable = fcurRWTpayable;
  }
  public tblnz_rtnrwtp with_fcurRWTpayable(java.math.BigDecimal fcurRWTpayable) {
    this.fcurRWTpayable = fcurRWTpayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrwtp with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrwtp with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtp)) {
      return false;
    }
    tblnz_rtnrwtp that = (tblnz_rtnrwtp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossDistributionIRD == null ? that.fcurGrossDistributionIRD == null : this.fcurGrossDistributionIRD.equals(that.fcurGrossDistributionIRD));
    equal = equal && (this.fcurDistributionIRDMultiply == null ? that.fcurDistributionIRDMultiply == null : this.fcurDistributionIRDMultiply.equals(that.fcurDistributionIRDMultiply));
    equal = equal && (this.fcurGrossDistributions == null ? that.fcurGrossDistributions == null : this.fcurGrossDistributions.equals(that.fcurGrossDistributions));
    equal = equal && (this.fcurDistributionMultiply == null ? that.fcurDistributionMultiply == null : this.fcurDistributionMultiply.equals(that.fcurDistributionMultiply));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurDividendMultiply == null ? that.fcurDividendMultiply == null : this.fcurDividendMultiply.equals(that.fcurDividendMultiply));
    equal = equal && (this.fcurGrossTotal == null ? that.fcurGrossTotal == null : this.fcurGrossTotal.equals(that.fcurGrossTotal));
    equal = equal && (this.fcurTotalTaxOnDistributions == null ? that.fcurTotalTaxOnDistributions == null : this.fcurTotalTaxOnDistributions.equals(that.fcurTotalTaxOnDistributions));
    equal = equal && (this.fcurCreditsAttached == null ? that.fcurCreditsAttached == null : this.fcurCreditsAttached.equals(that.fcurCreditsAttached));
    equal = equal && (this.fcurFDPAttached == null ? that.fcurFDPAttached == null : this.fcurFDPAttached.equals(that.fcurFDPAttached));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurRWTpayable == null ? that.fcurRWTpayable == null : this.fcurRWTpayable.equals(that.fcurRWTpayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtp)) {
      return false;
    }
    tblnz_rtnrwtp that = (tblnz_rtnrwtp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurGrossDistributionIRD == null ? that.fcurGrossDistributionIRD == null : this.fcurGrossDistributionIRD.equals(that.fcurGrossDistributionIRD));
    equal = equal && (this.fcurDistributionIRDMultiply == null ? that.fcurDistributionIRDMultiply == null : this.fcurDistributionIRDMultiply.equals(that.fcurDistributionIRDMultiply));
    equal = equal && (this.fcurGrossDistributions == null ? that.fcurGrossDistributions == null : this.fcurGrossDistributions.equals(that.fcurGrossDistributions));
    equal = equal && (this.fcurDistributionMultiply == null ? that.fcurDistributionMultiply == null : this.fcurDistributionMultiply.equals(that.fcurDistributionMultiply));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurDividendMultiply == null ? that.fcurDividendMultiply == null : this.fcurDividendMultiply.equals(that.fcurDividendMultiply));
    equal = equal && (this.fcurGrossTotal == null ? that.fcurGrossTotal == null : this.fcurGrossTotal.equals(that.fcurGrossTotal));
    equal = equal && (this.fcurTotalTaxOnDistributions == null ? that.fcurTotalTaxOnDistributions == null : this.fcurTotalTaxOnDistributions.equals(that.fcurTotalTaxOnDistributions));
    equal = equal && (this.fcurCreditsAttached == null ? that.fcurCreditsAttached == null : this.fcurCreditsAttached.equals(that.fcurCreditsAttached));
    equal = equal && (this.fcurFDPAttached == null ? that.fcurFDPAttached == null : this.fcurFDPAttached.equals(that.fcurFDPAttached));
    equal = equal && (this.fcurTotalCredits == null ? that.fcurTotalCredits == null : this.fcurTotalCredits.equals(that.fcurTotalCredits));
    equal = equal && (this.fcurRWTpayable == null ? that.fcurRWTpayable == null : this.fcurRWTpayable.equals(that.fcurRWTpayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossDistributionIRD = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurDistributionIRDMultiply = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGrossDistributions = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDistributionMultiply = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendMultiply = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurGrossTotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalTaxOnDistributions = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurCreditsAttached = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurFDPAttached = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRWTpayable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurGrossDistributionIRD = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurDistributionIRDMultiply = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGrossDistributions = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurDistributionMultiply = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDividendMultiply = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurGrossTotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalTaxOnDistributions = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurCreditsAttached = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurFDPAttached = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRWTpayable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurGrossDistributionIRD, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionIRDMultiply, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDistributions, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionMultiply, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendMultiply, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossTotal, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxOnDistributions, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsAttached, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPAttached, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTpayable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDistributionIRD, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionIRDMultiply, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDistributions, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionMultiply, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendMultiply, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossTotal, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxOnDistributions, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsAttached, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPAttached, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTpayable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
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
        this.fcurGrossDistributionIRD = null;
    } else {
    this.fcurGrossDistributionIRD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionIRDMultiply = null;
    } else {
    this.fcurDistributionIRDMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossDistributions = null;
    } else {
    this.fcurGrossDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionMultiply = null;
    } else {
    this.fcurDistributionMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossDividends = null;
    } else {
    this.fcurGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendMultiply = null;
    } else {
    this.fcurDividendMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossTotal = null;
    } else {
    this.fcurGrossTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxOnDistributions = null;
    } else {
    this.fcurTotalTaxOnDistributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditsAttached = null;
    } else {
    this.fcurCreditsAttached = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFDPAttached = null;
    } else {
    this.fcurFDPAttached = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalCredits = null;
    } else {
    this.fcurTotalCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTpayable = null;
    } else {
    this.fcurRWTpayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurGrossDistributionIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDistributionIRD, __dataOut);
    }
    if (null == this.fcurDistributionIRDMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionIRDMultiply, __dataOut);
    }
    if (null == this.fcurGrossDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDistributions, __dataOut);
    }
    if (null == this.fcurDistributionMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionMultiply, __dataOut);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurDividendMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendMultiply, __dataOut);
    }
    if (null == this.fcurGrossTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossTotal, __dataOut);
    }
    if (null == this.fcurTotalTaxOnDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxOnDistributions, __dataOut);
    }
    if (null == this.fcurCreditsAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsAttached, __dataOut);
    }
    if (null == this.fcurFDPAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPAttached, __dataOut);
    }
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
    }
    if (null == this.fcurRWTpayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTpayable, __dataOut);
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
    if (null == this.fcurGrossDistributionIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDistributionIRD, __dataOut);
    }
    if (null == this.fcurDistributionIRDMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionIRDMultiply, __dataOut);
    }
    if (null == this.fcurGrossDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDistributions, __dataOut);
    }
    if (null == this.fcurDistributionMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionMultiply, __dataOut);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurDividendMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendMultiply, __dataOut);
    }
    if (null == this.fcurGrossTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossTotal, __dataOut);
    }
    if (null == this.fcurTotalTaxOnDistributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxOnDistributions, __dataOut);
    }
    if (null == this.fcurCreditsAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsAttached, __dataOut);
    }
    if (null == this.fcurFDPAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPAttached, __dataOut);
    }
    if (null == this.fcurTotalCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCredits, __dataOut);
    }
    if (null == this.fcurRWTpayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTpayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDistributionIRD==null?"\\N":fcurGrossDistributionIRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionIRDMultiply==null?"\\N":fcurDistributionIRDMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDistributions==null?"\\N":fcurGrossDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionMultiply==null?"\\N":fcurDistributionMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendMultiply==null?"\\N":fcurDividendMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossTotal==null?"\\N":fcurGrossTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxOnDistributions==null?"\\N":fcurTotalTaxOnDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsAttached==null?"\\N":fcurCreditsAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPAttached==null?"\\N":fcurFDPAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTpayable==null?"\\N":fcurRWTpayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDistributionIRD==null?"\\N":fcurGrossDistributionIRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionIRDMultiply==null?"\\N":fcurDistributionIRDMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDistributions==null?"\\N":fcurGrossDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionMultiply==null?"\\N":fcurDistributionMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendMultiply==null?"\\N":fcurDividendMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossTotal==null?"\\N":fcurGrossTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxOnDistributions==null?"\\N":fcurTotalTaxOnDistributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsAttached==null?"\\N":fcurCreditsAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPAttached==null?"\\N":fcurFDPAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCredits==null?"\\N":fcurTotalCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTpayable==null?"\\N":fcurRWTpayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDistributionIRD = null; } else {
      this.fcurGrossDistributionIRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionIRDMultiply = null; } else {
      this.fcurDistributionIRDMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDistributions = null; } else {
      this.fcurGrossDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionMultiply = null; } else {
      this.fcurDistributionMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendMultiply = null; } else {
      this.fcurDividendMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossTotal = null; } else {
      this.fcurGrossTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxOnDistributions = null; } else {
      this.fcurTotalTaxOnDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsAttached = null; } else {
      this.fcurCreditsAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPAttached = null; } else {
      this.fcurFDPAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTpayable = null; } else {
      this.fcurRWTpayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDistributionIRD = null; } else {
      this.fcurGrossDistributionIRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionIRDMultiply = null; } else {
      this.fcurDistributionIRDMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDistributions = null; } else {
      this.fcurGrossDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionMultiply = null; } else {
      this.fcurDistributionMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendMultiply = null; } else {
      this.fcurDividendMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossTotal = null; } else {
      this.fcurGrossTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxOnDistributions = null; } else {
      this.fcurTotalTaxOnDistributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsAttached = null; } else {
      this.fcurCreditsAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPAttached = null; } else {
      this.fcurFDPAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCredits = null; } else {
      this.fcurTotalCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTpayable = null; } else {
      this.fcurRWTpayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnrwtp o = (tblnz_rtnrwtp) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrwtp o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossDistributionIRD", this.fcurGrossDistributionIRD);
    __sqoop$field_map.put("fcurDistributionIRDMultiply", this.fcurDistributionIRDMultiply);
    __sqoop$field_map.put("fcurGrossDistributions", this.fcurGrossDistributions);
    __sqoop$field_map.put("fcurDistributionMultiply", this.fcurDistributionMultiply);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurDividendMultiply", this.fcurDividendMultiply);
    __sqoop$field_map.put("fcurGrossTotal", this.fcurGrossTotal);
    __sqoop$field_map.put("fcurTotalTaxOnDistributions", this.fcurTotalTaxOnDistributions);
    __sqoop$field_map.put("fcurCreditsAttached", this.fcurCreditsAttached);
    __sqoop$field_map.put("fcurFDPAttached", this.fcurFDPAttached);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurRWTpayable", this.fcurRWTpayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurGrossDistributionIRD", this.fcurGrossDistributionIRD);
    __sqoop$field_map.put("fcurDistributionIRDMultiply", this.fcurDistributionIRDMultiply);
    __sqoop$field_map.put("fcurGrossDistributions", this.fcurGrossDistributions);
    __sqoop$field_map.put("fcurDistributionMultiply", this.fcurDistributionMultiply);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurDividendMultiply", this.fcurDividendMultiply);
    __sqoop$field_map.put("fcurGrossTotal", this.fcurGrossTotal);
    __sqoop$field_map.put("fcurTotalTaxOnDistributions", this.fcurTotalTaxOnDistributions);
    __sqoop$field_map.put("fcurCreditsAttached", this.fcurCreditsAttached);
    __sqoop$field_map.put("fcurFDPAttached", this.fcurFDPAttached);
    __sqoop$field_map.put("fcurTotalCredits", this.fcurTotalCredits);
    __sqoop$field_map.put("fcurRWTpayable", this.fcurRWTpayable);
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
