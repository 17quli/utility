// ORM class for table 'tblnz_famprotectedftc'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:28:40 NZDT 2020
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

public class tblnz_famprotectedftc extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fintRelationshipPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fintRelationshipPeriod = (Integer)value;
      }
    });
    setters.put("fintMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fintMonth = (Integer)value;
      }
    });
    setters.put("fcurBenefitPCG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurBenefitPCG = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBenefitPTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurBenefitPTR = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSalaryPCG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurSalaryPCG = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSalaryPTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurSalaryPTR = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChildSupportPCG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurChildSupportPCG = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChildSupportPTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurChildSupportPTR = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalMonthlyIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fcurTotalMonthlyIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnProtected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fblnProtected = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famprotectedftc.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famprotectedftc() {
    init0();
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famprotectedftc with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_famprotectedftc with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblnz_famprotectedftc with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer fintRelationshipPeriod;
  public Integer get_fintRelationshipPeriod() {
    return fintRelationshipPeriod;
  }
  public void set_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
  }
  public tblnz_famprotectedftc with_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
    return this;
  }
  private Integer fintMonth;
  public Integer get_fintMonth() {
    return fintMonth;
  }
  public void set_fintMonth(Integer fintMonth) {
    this.fintMonth = fintMonth;
  }
  public tblnz_famprotectedftc with_fintMonth(Integer fintMonth) {
    this.fintMonth = fintMonth;
    return this;
  }
  private java.math.BigDecimal fcurBenefitPCG;
  public java.math.BigDecimal get_fcurBenefitPCG() {
    return fcurBenefitPCG;
  }
  public void set_fcurBenefitPCG(java.math.BigDecimal fcurBenefitPCG) {
    this.fcurBenefitPCG = fcurBenefitPCG;
  }
  public tblnz_famprotectedftc with_fcurBenefitPCG(java.math.BigDecimal fcurBenefitPCG) {
    this.fcurBenefitPCG = fcurBenefitPCG;
    return this;
  }
  private java.math.BigDecimal fcurBenefitPTR;
  public java.math.BigDecimal get_fcurBenefitPTR() {
    return fcurBenefitPTR;
  }
  public void set_fcurBenefitPTR(java.math.BigDecimal fcurBenefitPTR) {
    this.fcurBenefitPTR = fcurBenefitPTR;
  }
  public tblnz_famprotectedftc with_fcurBenefitPTR(java.math.BigDecimal fcurBenefitPTR) {
    this.fcurBenefitPTR = fcurBenefitPTR;
    return this;
  }
  private java.math.BigDecimal fcurSalaryPCG;
  public java.math.BigDecimal get_fcurSalaryPCG() {
    return fcurSalaryPCG;
  }
  public void set_fcurSalaryPCG(java.math.BigDecimal fcurSalaryPCG) {
    this.fcurSalaryPCG = fcurSalaryPCG;
  }
  public tblnz_famprotectedftc with_fcurSalaryPCG(java.math.BigDecimal fcurSalaryPCG) {
    this.fcurSalaryPCG = fcurSalaryPCG;
    return this;
  }
  private java.math.BigDecimal fcurSalaryPTR;
  public java.math.BigDecimal get_fcurSalaryPTR() {
    return fcurSalaryPTR;
  }
  public void set_fcurSalaryPTR(java.math.BigDecimal fcurSalaryPTR) {
    this.fcurSalaryPTR = fcurSalaryPTR;
  }
  public tblnz_famprotectedftc with_fcurSalaryPTR(java.math.BigDecimal fcurSalaryPTR) {
    this.fcurSalaryPTR = fcurSalaryPTR;
    return this;
  }
  private java.math.BigDecimal fcurChildSupportPCG;
  public java.math.BigDecimal get_fcurChildSupportPCG() {
    return fcurChildSupportPCG;
  }
  public void set_fcurChildSupportPCG(java.math.BigDecimal fcurChildSupportPCG) {
    this.fcurChildSupportPCG = fcurChildSupportPCG;
  }
  public tblnz_famprotectedftc with_fcurChildSupportPCG(java.math.BigDecimal fcurChildSupportPCG) {
    this.fcurChildSupportPCG = fcurChildSupportPCG;
    return this;
  }
  private java.math.BigDecimal fcurChildSupportPTR;
  public java.math.BigDecimal get_fcurChildSupportPTR() {
    return fcurChildSupportPTR;
  }
  public void set_fcurChildSupportPTR(java.math.BigDecimal fcurChildSupportPTR) {
    this.fcurChildSupportPTR = fcurChildSupportPTR;
  }
  public tblnz_famprotectedftc with_fcurChildSupportPTR(java.math.BigDecimal fcurChildSupportPTR) {
    this.fcurChildSupportPTR = fcurChildSupportPTR;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_famprotectedftc with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalMonthlyIncome;
  public java.math.BigDecimal get_fcurTotalMonthlyIncome() {
    return fcurTotalMonthlyIncome;
  }
  public void set_fcurTotalMonthlyIncome(java.math.BigDecimal fcurTotalMonthlyIncome) {
    this.fcurTotalMonthlyIncome = fcurTotalMonthlyIncome;
  }
  public tblnz_famprotectedftc with_fcurTotalMonthlyIncome(java.math.BigDecimal fcurTotalMonthlyIncome) {
    this.fcurTotalMonthlyIncome = fcurTotalMonthlyIncome;
    return this;
  }
  private Integer fblnProtected;
  public Integer get_fblnProtected() {
    return fblnProtected;
  }
  public void set_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
  }
  public tblnz_famprotectedftc with_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_famprotectedftc with_fblnActive(Integer fblnActive) {
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
  public tblnz_famprotectedftc with_fstrWho(String fstrWho) {
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
  public tblnz_famprotectedftc with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famprotectedftc)) {
      return false;
    }
    tblnz_famprotectedftc that = (tblnz_famprotectedftc) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintMonth == null ? that.fintMonth == null : this.fintMonth.equals(that.fintMonth));
    equal = equal && (this.fcurBenefitPCG == null ? that.fcurBenefitPCG == null : this.fcurBenefitPCG.equals(that.fcurBenefitPCG));
    equal = equal && (this.fcurBenefitPTR == null ? that.fcurBenefitPTR == null : this.fcurBenefitPTR.equals(that.fcurBenefitPTR));
    equal = equal && (this.fcurSalaryPCG == null ? that.fcurSalaryPCG == null : this.fcurSalaryPCG.equals(that.fcurSalaryPCG));
    equal = equal && (this.fcurSalaryPTR == null ? that.fcurSalaryPTR == null : this.fcurSalaryPTR.equals(that.fcurSalaryPTR));
    equal = equal && (this.fcurChildSupportPCG == null ? that.fcurChildSupportPCG == null : this.fcurChildSupportPCG.equals(that.fcurChildSupportPCG));
    equal = equal && (this.fcurChildSupportPTR == null ? that.fcurChildSupportPTR == null : this.fcurChildSupportPTR.equals(that.fcurChildSupportPTR));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalMonthlyIncome == null ? that.fcurTotalMonthlyIncome == null : this.fcurTotalMonthlyIncome.equals(that.fcurTotalMonthlyIncome));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famprotectedftc)) {
      return false;
    }
    tblnz_famprotectedftc that = (tblnz_famprotectedftc) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintMonth == null ? that.fintMonth == null : this.fintMonth.equals(that.fintMonth));
    equal = equal && (this.fcurBenefitPCG == null ? that.fcurBenefitPCG == null : this.fcurBenefitPCG.equals(that.fcurBenefitPCG));
    equal = equal && (this.fcurBenefitPTR == null ? that.fcurBenefitPTR == null : this.fcurBenefitPTR.equals(that.fcurBenefitPTR));
    equal = equal && (this.fcurSalaryPCG == null ? that.fcurSalaryPCG == null : this.fcurSalaryPCG.equals(that.fcurSalaryPCG));
    equal = equal && (this.fcurSalaryPTR == null ? that.fcurSalaryPTR == null : this.fcurSalaryPTR.equals(that.fcurSalaryPTR));
    equal = equal && (this.fcurChildSupportPCG == null ? that.fcurChildSupportPCG == null : this.fcurChildSupportPCG.equals(that.fcurChildSupportPCG));
    equal = equal && (this.fcurChildSupportPTR == null ? that.fcurChildSupportPTR == null : this.fcurChildSupportPTR.equals(that.fcurChildSupportPTR));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalMonthlyIncome == null ? that.fcurTotalMonthlyIncome == null : this.fcurTotalMonthlyIncome.equals(that.fcurTotalMonthlyIncome));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintMonth = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurBenefitPCG = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBenefitPTR = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurSalaryPCG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurSalaryPTR = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurChildSupportPCG = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurChildSupportPTR = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalMonthlyIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintMonth = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurBenefitPCG = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBenefitPTR = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurSalaryPCG = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurSalaryPTR = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurChildSupportPCG = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurChildSupportPTR = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalMonthlyIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMonth, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitPCG, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitPTR, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalaryPCG, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalaryPTR, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupportPCG, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupportPTR, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMonthlyIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMonth, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitPCG, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBenefitPTR, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalaryPCG, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalaryPTR, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupportPCG, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupportPTR, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalMonthlyIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintRelationshipPeriod = null;
    } else {
    this.fintRelationshipPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintMonth = null;
    } else {
    this.fintMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBenefitPCG = null;
    } else {
    this.fcurBenefitPCG = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBenefitPTR = null;
    } else {
    this.fcurBenefitPTR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSalaryPCG = null;
    } else {
    this.fcurSalaryPCG = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSalaryPTR = null;
    } else {
    this.fcurSalaryPTR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChildSupportPCG = null;
    } else {
    this.fcurChildSupportPCG = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChildSupportPTR = null;
    } else {
    this.fcurChildSupportPTR = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalMonthlyIncome = null;
    } else {
    this.fcurTotalMonthlyIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProtected = null;
    } else {
    this.fblnProtected = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMonth);
    }
    if (null == this.fcurBenefitPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitPCG, __dataOut);
    }
    if (null == this.fcurBenefitPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitPTR, __dataOut);
    }
    if (null == this.fcurSalaryPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalaryPCG, __dataOut);
    }
    if (null == this.fcurSalaryPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalaryPTR, __dataOut);
    }
    if (null == this.fcurChildSupportPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupportPCG, __dataOut);
    }
    if (null == this.fcurChildSupportPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupportPTR, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalMonthlyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMonthlyIncome, __dataOut);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMonth);
    }
    if (null == this.fcurBenefitPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitPCG, __dataOut);
    }
    if (null == this.fcurBenefitPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBenefitPTR, __dataOut);
    }
    if (null == this.fcurSalaryPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalaryPCG, __dataOut);
    }
    if (null == this.fcurSalaryPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalaryPTR, __dataOut);
    }
    if (null == this.fcurChildSupportPCG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupportPCG, __dataOut);
    }
    if (null == this.fcurChildSupportPTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupportPTR, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalMonthlyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalMonthlyIncome, __dataOut);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMonth==null?"\\N":"" + fintMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitPCG==null?"\\N":fcurBenefitPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitPTR==null?"\\N":fcurBenefitPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalaryPCG==null?"\\N":fcurSalaryPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalaryPTR==null?"\\N":fcurSalaryPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupportPCG==null?"\\N":fcurChildSupportPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupportPTR==null?"\\N":fcurChildSupportPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMonthlyIncome==null?"\\N":fcurTotalMonthlyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMonth==null?"\\N":"" + fintMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitPCG==null?"\\N":fcurBenefitPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBenefitPTR==null?"\\N":fcurBenefitPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalaryPCG==null?"\\N":fcurSalaryPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalaryPTR==null?"\\N":fcurSalaryPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupportPCG==null?"\\N":fcurChildSupportPCG.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupportPTR==null?"\\N":fcurChildSupportPTR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalMonthlyIncome==null?"\\N":fcurTotalMonthlyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMonth = null; } else {
      this.fintMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitPCG = null; } else {
      this.fcurBenefitPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitPTR = null; } else {
      this.fcurBenefitPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalaryPCG = null; } else {
      this.fcurSalaryPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalaryPTR = null; } else {
      this.fcurSalaryPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupportPCG = null; } else {
      this.fcurChildSupportPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupportPTR = null; } else {
      this.fcurChildSupportPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncome = null; } else {
      this.fcurOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMonthlyIncome = null; } else {
      this.fcurTotalMonthlyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMonth = null; } else {
      this.fintMonth = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitPCG = null; } else {
      this.fcurBenefitPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBenefitPTR = null; } else {
      this.fcurBenefitPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalaryPCG = null; } else {
      this.fcurSalaryPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalaryPTR = null; } else {
      this.fcurSalaryPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupportPCG = null; } else {
      this.fcurChildSupportPCG = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupportPTR = null; } else {
      this.fcurChildSupportPTR = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherIncome = null; } else {
      this.fcurOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalMonthlyIncome = null; } else {
      this.fcurTotalMonthlyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
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
    tblnz_famprotectedftc o = (tblnz_famprotectedftc) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famprotectedftc o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintMonth", this.fintMonth);
    __sqoop$field_map.put("fcurBenefitPCG", this.fcurBenefitPCG);
    __sqoop$field_map.put("fcurBenefitPTR", this.fcurBenefitPTR);
    __sqoop$field_map.put("fcurSalaryPCG", this.fcurSalaryPCG);
    __sqoop$field_map.put("fcurSalaryPTR", this.fcurSalaryPTR);
    __sqoop$field_map.put("fcurChildSupportPCG", this.fcurChildSupportPCG);
    __sqoop$field_map.put("fcurChildSupportPTR", this.fcurChildSupportPTR);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalMonthlyIncome", this.fcurTotalMonthlyIncome);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintMonth", this.fintMonth);
    __sqoop$field_map.put("fcurBenefitPCG", this.fcurBenefitPCG);
    __sqoop$field_map.put("fcurBenefitPTR", this.fcurBenefitPTR);
    __sqoop$field_map.put("fcurSalaryPCG", this.fcurSalaryPCG);
    __sqoop$field_map.put("fcurSalaryPTR", this.fcurSalaryPTR);
    __sqoop$field_map.put("fcurChildSupportPCG", this.fcurChildSupportPCG);
    __sqoop$field_map.put("fcurChildSupportPTR", this.fcurChildSupportPTR);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalMonthlyIncome", this.fcurTotalMonthlyIncome);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
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
