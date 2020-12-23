// ORM class for table 'tblnz_incomebenattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:53:52 NZDT 2020
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

public class tblnz_incomebenattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrBeneficiaryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fstrBeneficiaryName = (String)value;
      }
    });
    setters.put("fdtmBeneficiaryDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fdtmBeneficiaryDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBeneficiaryAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fstrBeneficiaryAddress = (String)value;
      }
    });
    setters.put("fstrBeneficiaryIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fstrBeneficiaryIRD = (String)value;
      }
    });
    setters.put("fblnBeneficiaryIsNonResident", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fblnBeneficiaryIsNonResident = (Integer)value;
      }
    });
    setters.put("fcurBeneficiaryInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryMaoriAuthority", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryMaoriAuthority = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxableIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxableIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnBeneficiaryTrustPayingTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fblnBeneficiaryTrustPayingTax = (Integer)value;
      }
    });
    setters.put("fcurBeneficiaryNonComplying", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryNonComplying = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxOnTaxableInc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxOnTaxableInc = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryOverseasTaxPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryOverseasTaxPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxLessOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxLessOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryAfterImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryAfterImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxLessCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxLessCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTaxNonComplying", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTaxNonComplying = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBeneficiaryTotalTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fcurBeneficiaryTotalTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomebenattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomebenattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomebenattributes with_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_incomebenattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomebenattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrBeneficiaryName;
  public String get_fstrBeneficiaryName() {
    return fstrBeneficiaryName;
  }
  public void set_fstrBeneficiaryName(String fstrBeneficiaryName) {
    this.fstrBeneficiaryName = fstrBeneficiaryName;
  }
  public tblnz_incomebenattributes with_fstrBeneficiaryName(String fstrBeneficiaryName) {
    this.fstrBeneficiaryName = fstrBeneficiaryName;
    return this;
  }
  private java.sql.Timestamp fdtmBeneficiaryDOB;
  public java.sql.Timestamp get_fdtmBeneficiaryDOB() {
    return fdtmBeneficiaryDOB;
  }
  public void set_fdtmBeneficiaryDOB(java.sql.Timestamp fdtmBeneficiaryDOB) {
    this.fdtmBeneficiaryDOB = fdtmBeneficiaryDOB;
  }
  public tblnz_incomebenattributes with_fdtmBeneficiaryDOB(java.sql.Timestamp fdtmBeneficiaryDOB) {
    this.fdtmBeneficiaryDOB = fdtmBeneficiaryDOB;
    return this;
  }
  private String fstrBeneficiaryAddress;
  public String get_fstrBeneficiaryAddress() {
    return fstrBeneficiaryAddress;
  }
  public void set_fstrBeneficiaryAddress(String fstrBeneficiaryAddress) {
    this.fstrBeneficiaryAddress = fstrBeneficiaryAddress;
  }
  public tblnz_incomebenattributes with_fstrBeneficiaryAddress(String fstrBeneficiaryAddress) {
    this.fstrBeneficiaryAddress = fstrBeneficiaryAddress;
    return this;
  }
  private String fstrBeneficiaryIRD;
  public String get_fstrBeneficiaryIRD() {
    return fstrBeneficiaryIRD;
  }
  public void set_fstrBeneficiaryIRD(String fstrBeneficiaryIRD) {
    this.fstrBeneficiaryIRD = fstrBeneficiaryIRD;
  }
  public tblnz_incomebenattributes with_fstrBeneficiaryIRD(String fstrBeneficiaryIRD) {
    this.fstrBeneficiaryIRD = fstrBeneficiaryIRD;
    return this;
  }
  private Integer fblnBeneficiaryIsNonResident;
  public Integer get_fblnBeneficiaryIsNonResident() {
    return fblnBeneficiaryIsNonResident;
  }
  public void set_fblnBeneficiaryIsNonResident(Integer fblnBeneficiaryIsNonResident) {
    this.fblnBeneficiaryIsNonResident = fblnBeneficiaryIsNonResident;
  }
  public tblnz_incomebenattributes with_fblnBeneficiaryIsNonResident(Integer fblnBeneficiaryIsNonResident) {
    this.fblnBeneficiaryIsNonResident = fblnBeneficiaryIsNonResident;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryInterest;
  public java.math.BigDecimal get_fcurBeneficiaryInterest() {
    return fcurBeneficiaryInterest;
  }
  public void set_fcurBeneficiaryInterest(java.math.BigDecimal fcurBeneficiaryInterest) {
    this.fcurBeneficiaryInterest = fcurBeneficiaryInterest;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryInterest(java.math.BigDecimal fcurBeneficiaryInterest) {
    this.fcurBeneficiaryInterest = fcurBeneficiaryInterest;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryDividends;
  public java.math.BigDecimal get_fcurBeneficiaryDividends() {
    return fcurBeneficiaryDividends;
  }
  public void set_fcurBeneficiaryDividends(java.math.BigDecimal fcurBeneficiaryDividends) {
    this.fcurBeneficiaryDividends = fcurBeneficiaryDividends;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryDividends(java.math.BigDecimal fcurBeneficiaryDividends) {
    this.fcurBeneficiaryDividends = fcurBeneficiaryDividends;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryMaoriAuthority;
  public java.math.BigDecimal get_fcurBeneficiaryMaoriAuthority() {
    return fcurBeneficiaryMaoriAuthority;
  }
  public void set_fcurBeneficiaryMaoriAuthority(java.math.BigDecimal fcurBeneficiaryMaoriAuthority) {
    this.fcurBeneficiaryMaoriAuthority = fcurBeneficiaryMaoriAuthority;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryMaoriAuthority(java.math.BigDecimal fcurBeneficiaryMaoriAuthority) {
    this.fcurBeneficiaryMaoriAuthority = fcurBeneficiaryMaoriAuthority;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryOverseas;
  public java.math.BigDecimal get_fcurBeneficiaryOverseas() {
    return fcurBeneficiaryOverseas;
  }
  public void set_fcurBeneficiaryOverseas(java.math.BigDecimal fcurBeneficiaryOverseas) {
    this.fcurBeneficiaryOverseas = fcurBeneficiaryOverseas;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryOverseas(java.math.BigDecimal fcurBeneficiaryOverseas) {
    this.fcurBeneficiaryOverseas = fcurBeneficiaryOverseas;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryOther;
  public java.math.BigDecimal get_fcurBeneficiaryOther() {
    return fcurBeneficiaryOther;
  }
  public void set_fcurBeneficiaryOther(java.math.BigDecimal fcurBeneficiaryOther) {
    this.fcurBeneficiaryOther = fcurBeneficiaryOther;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryOther(java.math.BigDecimal fcurBeneficiaryOther) {
    this.fcurBeneficiaryOther = fcurBeneficiaryOther;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxableIncome;
  public java.math.BigDecimal get_fcurBeneficiaryTaxableIncome() {
    return fcurBeneficiaryTaxableIncome;
  }
  public void set_fcurBeneficiaryTaxableIncome(java.math.BigDecimal fcurBeneficiaryTaxableIncome) {
    this.fcurBeneficiaryTaxableIncome = fcurBeneficiaryTaxableIncome;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxableIncome(java.math.BigDecimal fcurBeneficiaryTaxableIncome) {
    this.fcurBeneficiaryTaxableIncome = fcurBeneficiaryTaxableIncome;
    return this;
  }
  private Integer fblnBeneficiaryTrustPayingTax;
  public Integer get_fblnBeneficiaryTrustPayingTax() {
    return fblnBeneficiaryTrustPayingTax;
  }
  public void set_fblnBeneficiaryTrustPayingTax(Integer fblnBeneficiaryTrustPayingTax) {
    this.fblnBeneficiaryTrustPayingTax = fblnBeneficiaryTrustPayingTax;
  }
  public tblnz_incomebenattributes with_fblnBeneficiaryTrustPayingTax(Integer fblnBeneficiaryTrustPayingTax) {
    this.fblnBeneficiaryTrustPayingTax = fblnBeneficiaryTrustPayingTax;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryNonComplying;
  public java.math.BigDecimal get_fcurBeneficiaryNonComplying() {
    return fcurBeneficiaryNonComplying;
  }
  public void set_fcurBeneficiaryNonComplying(java.math.BigDecimal fcurBeneficiaryNonComplying) {
    this.fcurBeneficiaryNonComplying = fcurBeneficiaryNonComplying;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryNonComplying(java.math.BigDecimal fcurBeneficiaryNonComplying) {
    this.fcurBeneficiaryNonComplying = fcurBeneficiaryNonComplying;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxOnTaxableInc;
  public java.math.BigDecimal get_fcurBeneficiaryTaxOnTaxableInc() {
    return fcurBeneficiaryTaxOnTaxableInc;
  }
  public void set_fcurBeneficiaryTaxOnTaxableInc(java.math.BigDecimal fcurBeneficiaryTaxOnTaxableInc) {
    this.fcurBeneficiaryTaxOnTaxableInc = fcurBeneficiaryTaxOnTaxableInc;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxOnTaxableInc(java.math.BigDecimal fcurBeneficiaryTaxOnTaxableInc) {
    this.fcurBeneficiaryTaxOnTaxableInc = fcurBeneficiaryTaxOnTaxableInc;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryOverseasTaxPaid;
  public java.math.BigDecimal get_fcurBeneficiaryOverseasTaxPaid() {
    return fcurBeneficiaryOverseasTaxPaid;
  }
  public void set_fcurBeneficiaryOverseasTaxPaid(java.math.BigDecimal fcurBeneficiaryOverseasTaxPaid) {
    this.fcurBeneficiaryOverseasTaxPaid = fcurBeneficiaryOverseasTaxPaid;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryOverseasTaxPaid(java.math.BigDecimal fcurBeneficiaryOverseasTaxPaid) {
    this.fcurBeneficiaryOverseasTaxPaid = fcurBeneficiaryOverseasTaxPaid;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxLessOverseas;
  public java.math.BigDecimal get_fcurBeneficiaryTaxLessOverseas() {
    return fcurBeneficiaryTaxLessOverseas;
  }
  public void set_fcurBeneficiaryTaxLessOverseas(java.math.BigDecimal fcurBeneficiaryTaxLessOverseas) {
    this.fcurBeneficiaryTaxLessOverseas = fcurBeneficiaryTaxLessOverseas;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxLessOverseas(java.math.BigDecimal fcurBeneficiaryTaxLessOverseas) {
    this.fcurBeneficiaryTaxLessOverseas = fcurBeneficiaryTaxLessOverseas;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryImputation;
  public java.math.BigDecimal get_fcurBeneficiaryImputation() {
    return fcurBeneficiaryImputation;
  }
  public void set_fcurBeneficiaryImputation(java.math.BigDecimal fcurBeneficiaryImputation) {
    this.fcurBeneficiaryImputation = fcurBeneficiaryImputation;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryImputation(java.math.BigDecimal fcurBeneficiaryImputation) {
    this.fcurBeneficiaryImputation = fcurBeneficiaryImputation;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryAfterImputation;
  public java.math.BigDecimal get_fcurBeneficiaryAfterImputation() {
    return fcurBeneficiaryAfterImputation;
  }
  public void set_fcurBeneficiaryAfterImputation(java.math.BigDecimal fcurBeneficiaryAfterImputation) {
    this.fcurBeneficiaryAfterImputation = fcurBeneficiaryAfterImputation;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryAfterImputation(java.math.BigDecimal fcurBeneficiaryAfterImputation) {
    this.fcurBeneficiaryAfterImputation = fcurBeneficiaryAfterImputation;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxCredits;
  public java.math.BigDecimal get_fcurBeneficiaryTaxCredits() {
    return fcurBeneficiaryTaxCredits;
  }
  public void set_fcurBeneficiaryTaxCredits(java.math.BigDecimal fcurBeneficiaryTaxCredits) {
    this.fcurBeneficiaryTaxCredits = fcurBeneficiaryTaxCredits;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxCredits(java.math.BigDecimal fcurBeneficiaryTaxCredits) {
    this.fcurBeneficiaryTaxCredits = fcurBeneficiaryTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxLessCredits;
  public java.math.BigDecimal get_fcurBeneficiaryTaxLessCredits() {
    return fcurBeneficiaryTaxLessCredits;
  }
  public void set_fcurBeneficiaryTaxLessCredits(java.math.BigDecimal fcurBeneficiaryTaxLessCredits) {
    this.fcurBeneficiaryTaxLessCredits = fcurBeneficiaryTaxLessCredits;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxLessCredits(java.math.BigDecimal fcurBeneficiaryTaxLessCredits) {
    this.fcurBeneficiaryTaxLessCredits = fcurBeneficiaryTaxLessCredits;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTaxNonComplying;
  public java.math.BigDecimal get_fcurBeneficiaryTaxNonComplying() {
    return fcurBeneficiaryTaxNonComplying;
  }
  public void set_fcurBeneficiaryTaxNonComplying(java.math.BigDecimal fcurBeneficiaryTaxNonComplying) {
    this.fcurBeneficiaryTaxNonComplying = fcurBeneficiaryTaxNonComplying;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTaxNonComplying(java.math.BigDecimal fcurBeneficiaryTaxNonComplying) {
    this.fcurBeneficiaryTaxNonComplying = fcurBeneficiaryTaxNonComplying;
    return this;
  }
  private java.math.BigDecimal fcurBeneficiaryTotalTaxPayable;
  public java.math.BigDecimal get_fcurBeneficiaryTotalTaxPayable() {
    return fcurBeneficiaryTotalTaxPayable;
  }
  public void set_fcurBeneficiaryTotalTaxPayable(java.math.BigDecimal fcurBeneficiaryTotalTaxPayable) {
    this.fcurBeneficiaryTotalTaxPayable = fcurBeneficiaryTotalTaxPayable;
  }
  public tblnz_incomebenattributes with_fcurBeneficiaryTotalTaxPayable(java.math.BigDecimal fcurBeneficiaryTotalTaxPayable) {
    this.fcurBeneficiaryTotalTaxPayable = fcurBeneficiaryTotalTaxPayable;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_incomebenattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomebenattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomebenattributes)) {
      return false;
    }
    tblnz_incomebenattributes that = (tblnz_incomebenattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrBeneficiaryName == null ? that.fstrBeneficiaryName == null : this.fstrBeneficiaryName.equals(that.fstrBeneficiaryName));
    equal = equal && (this.fdtmBeneficiaryDOB == null ? that.fdtmBeneficiaryDOB == null : this.fdtmBeneficiaryDOB.equals(that.fdtmBeneficiaryDOB));
    equal = equal && (this.fstrBeneficiaryAddress == null ? that.fstrBeneficiaryAddress == null : this.fstrBeneficiaryAddress.equals(that.fstrBeneficiaryAddress));
    equal = equal && (this.fstrBeneficiaryIRD == null ? that.fstrBeneficiaryIRD == null : this.fstrBeneficiaryIRD.equals(that.fstrBeneficiaryIRD));
    equal = equal && (this.fblnBeneficiaryIsNonResident == null ? that.fblnBeneficiaryIsNonResident == null : this.fblnBeneficiaryIsNonResident.equals(that.fblnBeneficiaryIsNonResident));
    equal = equal && (this.fcurBeneficiaryInterest == null ? that.fcurBeneficiaryInterest == null : this.fcurBeneficiaryInterest.equals(that.fcurBeneficiaryInterest));
    equal = equal && (this.fcurBeneficiaryDividends == null ? that.fcurBeneficiaryDividends == null : this.fcurBeneficiaryDividends.equals(that.fcurBeneficiaryDividends));
    equal = equal && (this.fcurBeneficiaryMaoriAuthority == null ? that.fcurBeneficiaryMaoriAuthority == null : this.fcurBeneficiaryMaoriAuthority.equals(that.fcurBeneficiaryMaoriAuthority));
    equal = equal && (this.fcurBeneficiaryOverseas == null ? that.fcurBeneficiaryOverseas == null : this.fcurBeneficiaryOverseas.equals(that.fcurBeneficiaryOverseas));
    equal = equal && (this.fcurBeneficiaryOther == null ? that.fcurBeneficiaryOther == null : this.fcurBeneficiaryOther.equals(that.fcurBeneficiaryOther));
    equal = equal && (this.fcurBeneficiaryTaxableIncome == null ? that.fcurBeneficiaryTaxableIncome == null : this.fcurBeneficiaryTaxableIncome.equals(that.fcurBeneficiaryTaxableIncome));
    equal = equal && (this.fblnBeneficiaryTrustPayingTax == null ? that.fblnBeneficiaryTrustPayingTax == null : this.fblnBeneficiaryTrustPayingTax.equals(that.fblnBeneficiaryTrustPayingTax));
    equal = equal && (this.fcurBeneficiaryNonComplying == null ? that.fcurBeneficiaryNonComplying == null : this.fcurBeneficiaryNonComplying.equals(that.fcurBeneficiaryNonComplying));
    equal = equal && (this.fcurBeneficiaryTaxOnTaxableInc == null ? that.fcurBeneficiaryTaxOnTaxableInc == null : this.fcurBeneficiaryTaxOnTaxableInc.equals(that.fcurBeneficiaryTaxOnTaxableInc));
    equal = equal && (this.fcurBeneficiaryOverseasTaxPaid == null ? that.fcurBeneficiaryOverseasTaxPaid == null : this.fcurBeneficiaryOverseasTaxPaid.equals(that.fcurBeneficiaryOverseasTaxPaid));
    equal = equal && (this.fcurBeneficiaryTaxLessOverseas == null ? that.fcurBeneficiaryTaxLessOverseas == null : this.fcurBeneficiaryTaxLessOverseas.equals(that.fcurBeneficiaryTaxLessOverseas));
    equal = equal && (this.fcurBeneficiaryImputation == null ? that.fcurBeneficiaryImputation == null : this.fcurBeneficiaryImputation.equals(that.fcurBeneficiaryImputation));
    equal = equal && (this.fcurBeneficiaryAfterImputation == null ? that.fcurBeneficiaryAfterImputation == null : this.fcurBeneficiaryAfterImputation.equals(that.fcurBeneficiaryAfterImputation));
    equal = equal && (this.fcurBeneficiaryTaxCredits == null ? that.fcurBeneficiaryTaxCredits == null : this.fcurBeneficiaryTaxCredits.equals(that.fcurBeneficiaryTaxCredits));
    equal = equal && (this.fcurBeneficiaryTaxLessCredits == null ? that.fcurBeneficiaryTaxLessCredits == null : this.fcurBeneficiaryTaxLessCredits.equals(that.fcurBeneficiaryTaxLessCredits));
    equal = equal && (this.fcurBeneficiaryTaxNonComplying == null ? that.fcurBeneficiaryTaxNonComplying == null : this.fcurBeneficiaryTaxNonComplying.equals(that.fcurBeneficiaryTaxNonComplying));
    equal = equal && (this.fcurBeneficiaryTotalTaxPayable == null ? that.fcurBeneficiaryTotalTaxPayable == null : this.fcurBeneficiaryTotalTaxPayable.equals(that.fcurBeneficiaryTotalTaxPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomebenattributes)) {
      return false;
    }
    tblnz_incomebenattributes that = (tblnz_incomebenattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrBeneficiaryName == null ? that.fstrBeneficiaryName == null : this.fstrBeneficiaryName.equals(that.fstrBeneficiaryName));
    equal = equal && (this.fdtmBeneficiaryDOB == null ? that.fdtmBeneficiaryDOB == null : this.fdtmBeneficiaryDOB.equals(that.fdtmBeneficiaryDOB));
    equal = equal && (this.fstrBeneficiaryAddress == null ? that.fstrBeneficiaryAddress == null : this.fstrBeneficiaryAddress.equals(that.fstrBeneficiaryAddress));
    equal = equal && (this.fstrBeneficiaryIRD == null ? that.fstrBeneficiaryIRD == null : this.fstrBeneficiaryIRD.equals(that.fstrBeneficiaryIRD));
    equal = equal && (this.fblnBeneficiaryIsNonResident == null ? that.fblnBeneficiaryIsNonResident == null : this.fblnBeneficiaryIsNonResident.equals(that.fblnBeneficiaryIsNonResident));
    equal = equal && (this.fcurBeneficiaryInterest == null ? that.fcurBeneficiaryInterest == null : this.fcurBeneficiaryInterest.equals(that.fcurBeneficiaryInterest));
    equal = equal && (this.fcurBeneficiaryDividends == null ? that.fcurBeneficiaryDividends == null : this.fcurBeneficiaryDividends.equals(that.fcurBeneficiaryDividends));
    equal = equal && (this.fcurBeneficiaryMaoriAuthority == null ? that.fcurBeneficiaryMaoriAuthority == null : this.fcurBeneficiaryMaoriAuthority.equals(that.fcurBeneficiaryMaoriAuthority));
    equal = equal && (this.fcurBeneficiaryOverseas == null ? that.fcurBeneficiaryOverseas == null : this.fcurBeneficiaryOverseas.equals(that.fcurBeneficiaryOverseas));
    equal = equal && (this.fcurBeneficiaryOther == null ? that.fcurBeneficiaryOther == null : this.fcurBeneficiaryOther.equals(that.fcurBeneficiaryOther));
    equal = equal && (this.fcurBeneficiaryTaxableIncome == null ? that.fcurBeneficiaryTaxableIncome == null : this.fcurBeneficiaryTaxableIncome.equals(that.fcurBeneficiaryTaxableIncome));
    equal = equal && (this.fblnBeneficiaryTrustPayingTax == null ? that.fblnBeneficiaryTrustPayingTax == null : this.fblnBeneficiaryTrustPayingTax.equals(that.fblnBeneficiaryTrustPayingTax));
    equal = equal && (this.fcurBeneficiaryNonComplying == null ? that.fcurBeneficiaryNonComplying == null : this.fcurBeneficiaryNonComplying.equals(that.fcurBeneficiaryNonComplying));
    equal = equal && (this.fcurBeneficiaryTaxOnTaxableInc == null ? that.fcurBeneficiaryTaxOnTaxableInc == null : this.fcurBeneficiaryTaxOnTaxableInc.equals(that.fcurBeneficiaryTaxOnTaxableInc));
    equal = equal && (this.fcurBeneficiaryOverseasTaxPaid == null ? that.fcurBeneficiaryOverseasTaxPaid == null : this.fcurBeneficiaryOverseasTaxPaid.equals(that.fcurBeneficiaryOverseasTaxPaid));
    equal = equal && (this.fcurBeneficiaryTaxLessOverseas == null ? that.fcurBeneficiaryTaxLessOverseas == null : this.fcurBeneficiaryTaxLessOverseas.equals(that.fcurBeneficiaryTaxLessOverseas));
    equal = equal && (this.fcurBeneficiaryImputation == null ? that.fcurBeneficiaryImputation == null : this.fcurBeneficiaryImputation.equals(that.fcurBeneficiaryImputation));
    equal = equal && (this.fcurBeneficiaryAfterImputation == null ? that.fcurBeneficiaryAfterImputation == null : this.fcurBeneficiaryAfterImputation.equals(that.fcurBeneficiaryAfterImputation));
    equal = equal && (this.fcurBeneficiaryTaxCredits == null ? that.fcurBeneficiaryTaxCredits == null : this.fcurBeneficiaryTaxCredits.equals(that.fcurBeneficiaryTaxCredits));
    equal = equal && (this.fcurBeneficiaryTaxLessCredits == null ? that.fcurBeneficiaryTaxLessCredits == null : this.fcurBeneficiaryTaxLessCredits.equals(that.fcurBeneficiaryTaxLessCredits));
    equal = equal && (this.fcurBeneficiaryTaxNonComplying == null ? that.fcurBeneficiaryTaxNonComplying == null : this.fcurBeneficiaryTaxNonComplying.equals(that.fcurBeneficiaryTaxNonComplying));
    equal = equal && (this.fcurBeneficiaryTotalTaxPayable == null ? that.fcurBeneficiaryTotalTaxPayable == null : this.fcurBeneficiaryTotalTaxPayable.equals(that.fcurBeneficiaryTotalTaxPayable));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrBeneficiaryName = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmBeneficiaryDOB = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrBeneficiaryAddress = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBeneficiaryIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnBeneficiaryIsNonResident = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurBeneficiaryInterest = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurBeneficiaryDividends = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBeneficiaryMaoriAuthority = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurBeneficiaryOverseas = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBeneficiaryOther = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurBeneficiaryTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fblnBeneficiaryTrustPayingTax = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fcurBeneficiaryNonComplying = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurBeneficiaryTaxOnTaxableInc = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurBeneficiaryOverseasTaxPaid = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurBeneficiaryTaxLessOverseas = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurBeneficiaryImputation = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurBeneficiaryAfterImputation = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurBeneficiaryTaxCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurBeneficiaryTaxLessCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBeneficiaryTaxNonComplying = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurBeneficiaryTotalTaxPayable = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrBeneficiaryName = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmBeneficiaryDOB = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrBeneficiaryAddress = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBeneficiaryIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnBeneficiaryIsNonResident = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurBeneficiaryInterest = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurBeneficiaryDividends = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBeneficiaryMaoriAuthority = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurBeneficiaryOverseas = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBeneficiaryOther = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurBeneficiaryTaxableIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fblnBeneficiaryTrustPayingTax = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fcurBeneficiaryNonComplying = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurBeneficiaryTaxOnTaxableInc = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurBeneficiaryOverseasTaxPaid = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurBeneficiaryTaxLessOverseas = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurBeneficiaryImputation = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurBeneficiaryAfterImputation = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurBeneficiaryTaxCredits = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurBeneficiaryTaxLessCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBeneficiaryTaxNonComplying = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurBeneficiaryTotalTaxPayable = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBeneficiaryDOB, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryAddress, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBeneficiaryIsNonResident, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryInterest, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryDividends, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryMaoriAuthority, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOverseas, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOther, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBeneficiaryTrustPayingTax, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryNonComplying, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxOnTaxableInc, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOverseasTaxPaid, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxLessOverseas, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryImputation, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryAfterImputation, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxLessCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxNonComplying, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTotalTaxPayable, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryName, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBeneficiaryDOB, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryAddress, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBeneficiaryIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBeneficiaryIsNonResident, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryInterest, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryDividends, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryMaoriAuthority, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOverseas, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOther, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxableIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBeneficiaryTrustPayingTax, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryNonComplying, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxOnTaxableInc, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryOverseasTaxPaid, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxLessOverseas, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryImputation, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryAfterImputation, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxCredits, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxLessCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTaxNonComplying, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBeneficiaryTotalTaxPayable, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64IncomeKey = null;
    } else {
    this.fi64IncomeKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrBeneficiaryName = null;
    } else {
    this.fstrBeneficiaryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBeneficiaryDOB = null;
    } else {
    this.fdtmBeneficiaryDOB = new Timestamp(__dataIn.readLong());
    this.fdtmBeneficiaryDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBeneficiaryAddress = null;
    } else {
    this.fstrBeneficiaryAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBeneficiaryIRD = null;
    } else {
    this.fstrBeneficiaryIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBeneficiaryIsNonResident = null;
    } else {
    this.fblnBeneficiaryIsNonResident = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryInterest = null;
    } else {
    this.fcurBeneficiaryInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryDividends = null;
    } else {
    this.fcurBeneficiaryDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryMaoriAuthority = null;
    } else {
    this.fcurBeneficiaryMaoriAuthority = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryOverseas = null;
    } else {
    this.fcurBeneficiaryOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryOther = null;
    } else {
    this.fcurBeneficiaryOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxableIncome = null;
    } else {
    this.fcurBeneficiaryTaxableIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBeneficiaryTrustPayingTax = null;
    } else {
    this.fblnBeneficiaryTrustPayingTax = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryNonComplying = null;
    } else {
    this.fcurBeneficiaryNonComplying = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxOnTaxableInc = null;
    } else {
    this.fcurBeneficiaryTaxOnTaxableInc = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryOverseasTaxPaid = null;
    } else {
    this.fcurBeneficiaryOverseasTaxPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxLessOverseas = null;
    } else {
    this.fcurBeneficiaryTaxLessOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryImputation = null;
    } else {
    this.fcurBeneficiaryImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryAfterImputation = null;
    } else {
    this.fcurBeneficiaryAfterImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxCredits = null;
    } else {
    this.fcurBeneficiaryTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxLessCredits = null;
    } else {
    this.fcurBeneficiaryTaxLessCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTaxNonComplying = null;
    } else {
    this.fcurBeneficiaryTaxNonComplying = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBeneficiaryTotalTaxPayable = null;
    } else {
    this.fcurBeneficiaryTotalTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fstrBeneficiaryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryName);
    }
    if (null == this.fdtmBeneficiaryDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBeneficiaryDOB.getTime());
    __dataOut.writeInt(this.fdtmBeneficiaryDOB.getNanos());
    }
    if (null == this.fstrBeneficiaryAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryAddress);
    }
    if (null == this.fstrBeneficiaryIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryIRD);
    }
    if (null == this.fblnBeneficiaryIsNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBeneficiaryIsNonResident);
    }
    if (null == this.fcurBeneficiaryInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryInterest, __dataOut);
    }
    if (null == this.fcurBeneficiaryDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryDividends, __dataOut);
    }
    if (null == this.fcurBeneficiaryMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryMaoriAuthority, __dataOut);
    }
    if (null == this.fcurBeneficiaryOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOverseas, __dataOut);
    }
    if (null == this.fcurBeneficiaryOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOther, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxableIncome, __dataOut);
    }
    if (null == this.fblnBeneficiaryTrustPayingTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBeneficiaryTrustPayingTax);
    }
    if (null == this.fcurBeneficiaryNonComplying) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryNonComplying, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxOnTaxableInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxOnTaxableInc, __dataOut);
    }
    if (null == this.fcurBeneficiaryOverseasTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOverseasTaxPaid, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxLessOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxLessOverseas, __dataOut);
    }
    if (null == this.fcurBeneficiaryImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryImputation, __dataOut);
    }
    if (null == this.fcurBeneficiaryAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryAfterImputation, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxCredits, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxLessCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxLessCredits, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxNonComplying) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxNonComplying, __dataOut);
    }
    if (null == this.fcurBeneficiaryTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTotalTaxPayable, __dataOut);
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fstrBeneficiaryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryName);
    }
    if (null == this.fdtmBeneficiaryDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBeneficiaryDOB.getTime());
    __dataOut.writeInt(this.fdtmBeneficiaryDOB.getNanos());
    }
    if (null == this.fstrBeneficiaryAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryAddress);
    }
    if (null == this.fstrBeneficiaryIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBeneficiaryIRD);
    }
    if (null == this.fblnBeneficiaryIsNonResident) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBeneficiaryIsNonResident);
    }
    if (null == this.fcurBeneficiaryInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryInterest, __dataOut);
    }
    if (null == this.fcurBeneficiaryDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryDividends, __dataOut);
    }
    if (null == this.fcurBeneficiaryMaoriAuthority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryMaoriAuthority, __dataOut);
    }
    if (null == this.fcurBeneficiaryOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOverseas, __dataOut);
    }
    if (null == this.fcurBeneficiaryOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOther, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxableIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxableIncome, __dataOut);
    }
    if (null == this.fblnBeneficiaryTrustPayingTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBeneficiaryTrustPayingTax);
    }
    if (null == this.fcurBeneficiaryNonComplying) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryNonComplying, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxOnTaxableInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxOnTaxableInc, __dataOut);
    }
    if (null == this.fcurBeneficiaryOverseasTaxPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryOverseasTaxPaid, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxLessOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxLessOverseas, __dataOut);
    }
    if (null == this.fcurBeneficiaryImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryImputation, __dataOut);
    }
    if (null == this.fcurBeneficiaryAfterImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryAfterImputation, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxCredits, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxLessCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxLessCredits, __dataOut);
    }
    if (null == this.fcurBeneficiaryTaxNonComplying) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTaxNonComplying, __dataOut);
    }
    if (null == this.fcurBeneficiaryTotalTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBeneficiaryTotalTaxPayable, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryName==null?"\\N":fstrBeneficiaryName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBeneficiaryDOB==null?"\\N":"" + fdtmBeneficiaryDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryAddress==null?"\\N":fstrBeneficiaryAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryIRD==null?"\\N":fstrBeneficiaryIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBeneficiaryIsNonResident==null?"\\N":"" + fblnBeneficiaryIsNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryInterest==null?"\\N":fcurBeneficiaryInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryDividends==null?"\\N":fcurBeneficiaryDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryMaoriAuthority==null?"\\N":fcurBeneficiaryMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOverseas==null?"\\N":fcurBeneficiaryOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOther==null?"\\N":fcurBeneficiaryOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxableIncome==null?"\\N":fcurBeneficiaryTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBeneficiaryTrustPayingTax==null?"\\N":"" + fblnBeneficiaryTrustPayingTax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryNonComplying==null?"\\N":fcurBeneficiaryNonComplying.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxOnTaxableInc==null?"\\N":fcurBeneficiaryTaxOnTaxableInc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOverseasTaxPaid==null?"\\N":fcurBeneficiaryOverseasTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxLessOverseas==null?"\\N":fcurBeneficiaryTaxLessOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryImputation==null?"\\N":fcurBeneficiaryImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryAfterImputation==null?"\\N":fcurBeneficiaryAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxCredits==null?"\\N":fcurBeneficiaryTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxLessCredits==null?"\\N":fcurBeneficiaryTaxLessCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxNonComplying==null?"\\N":fcurBeneficiaryTaxNonComplying.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTotalTaxPayable==null?"\\N":fcurBeneficiaryTotalTaxPayable.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryName==null?"\\N":fstrBeneficiaryName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBeneficiaryDOB==null?"\\N":"" + fdtmBeneficiaryDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryAddress==null?"\\N":fstrBeneficiaryAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBeneficiaryIRD==null?"\\N":fstrBeneficiaryIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBeneficiaryIsNonResident==null?"\\N":"" + fblnBeneficiaryIsNonResident, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryInterest==null?"\\N":fcurBeneficiaryInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryDividends==null?"\\N":fcurBeneficiaryDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryMaoriAuthority==null?"\\N":fcurBeneficiaryMaoriAuthority.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOverseas==null?"\\N":fcurBeneficiaryOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOther==null?"\\N":fcurBeneficiaryOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxableIncome==null?"\\N":fcurBeneficiaryTaxableIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBeneficiaryTrustPayingTax==null?"\\N":"" + fblnBeneficiaryTrustPayingTax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryNonComplying==null?"\\N":fcurBeneficiaryNonComplying.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxOnTaxableInc==null?"\\N":fcurBeneficiaryTaxOnTaxableInc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryOverseasTaxPaid==null?"\\N":fcurBeneficiaryOverseasTaxPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxLessOverseas==null?"\\N":fcurBeneficiaryTaxLessOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryImputation==null?"\\N":fcurBeneficiaryImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryAfterImputation==null?"\\N":fcurBeneficiaryAfterImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxCredits==null?"\\N":fcurBeneficiaryTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxLessCredits==null?"\\N":fcurBeneficiaryTaxLessCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTaxNonComplying==null?"\\N":fcurBeneficiaryTaxNonComplying.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBeneficiaryTotalTaxPayable==null?"\\N":fcurBeneficiaryTotalTaxPayable.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrBeneficiaryName = null; } else {
      this.fstrBeneficiaryName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBeneficiaryDOB = null; } else {
      this.fdtmBeneficiaryDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBeneficiaryAddress = null; } else {
      this.fstrBeneficiaryAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBeneficiaryIRD = null; } else {
      this.fstrBeneficiaryIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBeneficiaryIsNonResident = null; } else {
      this.fblnBeneficiaryIsNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryInterest = null; } else {
      this.fcurBeneficiaryInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryDividends = null; } else {
      this.fcurBeneficiaryDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryMaoriAuthority = null; } else {
      this.fcurBeneficiaryMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOverseas = null; } else {
      this.fcurBeneficiaryOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOther = null; } else {
      this.fcurBeneficiaryOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxableIncome = null; } else {
      this.fcurBeneficiaryTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBeneficiaryTrustPayingTax = null; } else {
      this.fblnBeneficiaryTrustPayingTax = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryNonComplying = null; } else {
      this.fcurBeneficiaryNonComplying = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxOnTaxableInc = null; } else {
      this.fcurBeneficiaryTaxOnTaxableInc = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOverseasTaxPaid = null; } else {
      this.fcurBeneficiaryOverseasTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxLessOverseas = null; } else {
      this.fcurBeneficiaryTaxLessOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryImputation = null; } else {
      this.fcurBeneficiaryImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryAfterImputation = null; } else {
      this.fcurBeneficiaryAfterImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxCredits = null; } else {
      this.fcurBeneficiaryTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxLessCredits = null; } else {
      this.fcurBeneficiaryTaxLessCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxNonComplying = null; } else {
      this.fcurBeneficiaryTaxNonComplying = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTotalTaxPayable = null; } else {
      this.fcurBeneficiaryTotalTaxPayable = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrBeneficiaryName = null; } else {
      this.fstrBeneficiaryName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBeneficiaryDOB = null; } else {
      this.fdtmBeneficiaryDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBeneficiaryAddress = null; } else {
      this.fstrBeneficiaryAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBeneficiaryIRD = null; } else {
      this.fstrBeneficiaryIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBeneficiaryIsNonResident = null; } else {
      this.fblnBeneficiaryIsNonResident = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryInterest = null; } else {
      this.fcurBeneficiaryInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryDividends = null; } else {
      this.fcurBeneficiaryDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryMaoriAuthority = null; } else {
      this.fcurBeneficiaryMaoriAuthority = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOverseas = null; } else {
      this.fcurBeneficiaryOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOther = null; } else {
      this.fcurBeneficiaryOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxableIncome = null; } else {
      this.fcurBeneficiaryTaxableIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBeneficiaryTrustPayingTax = null; } else {
      this.fblnBeneficiaryTrustPayingTax = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryNonComplying = null; } else {
      this.fcurBeneficiaryNonComplying = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxOnTaxableInc = null; } else {
      this.fcurBeneficiaryTaxOnTaxableInc = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryOverseasTaxPaid = null; } else {
      this.fcurBeneficiaryOverseasTaxPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxLessOverseas = null; } else {
      this.fcurBeneficiaryTaxLessOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryImputation = null; } else {
      this.fcurBeneficiaryImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryAfterImputation = null; } else {
      this.fcurBeneficiaryAfterImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxCredits = null; } else {
      this.fcurBeneficiaryTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxLessCredits = null; } else {
      this.fcurBeneficiaryTaxLessCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTaxNonComplying = null; } else {
      this.fcurBeneficiaryTaxNonComplying = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBeneficiaryTotalTaxPayable = null; } else {
      this.fcurBeneficiaryTotalTaxPayable = new java.math.BigDecimal(__cur_str);
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
    tblnz_incomebenattributes o = (tblnz_incomebenattributes) super.clone();
    o.fdtmBeneficiaryDOB = (o.fdtmBeneficiaryDOB != null) ? (java.sql.Timestamp) o.fdtmBeneficiaryDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomebenattributes o) throws CloneNotSupportedException {
    o.fdtmBeneficiaryDOB = (o.fdtmBeneficiaryDOB != null) ? (java.sql.Timestamp) o.fdtmBeneficiaryDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrBeneficiaryName", this.fstrBeneficiaryName);
    __sqoop$field_map.put("fdtmBeneficiaryDOB", this.fdtmBeneficiaryDOB);
    __sqoop$field_map.put("fstrBeneficiaryAddress", this.fstrBeneficiaryAddress);
    __sqoop$field_map.put("fstrBeneficiaryIRD", this.fstrBeneficiaryIRD);
    __sqoop$field_map.put("fblnBeneficiaryIsNonResident", this.fblnBeneficiaryIsNonResident);
    __sqoop$field_map.put("fcurBeneficiaryInterest", this.fcurBeneficiaryInterest);
    __sqoop$field_map.put("fcurBeneficiaryDividends", this.fcurBeneficiaryDividends);
    __sqoop$field_map.put("fcurBeneficiaryMaoriAuthority", this.fcurBeneficiaryMaoriAuthority);
    __sqoop$field_map.put("fcurBeneficiaryOverseas", this.fcurBeneficiaryOverseas);
    __sqoop$field_map.put("fcurBeneficiaryOther", this.fcurBeneficiaryOther);
    __sqoop$field_map.put("fcurBeneficiaryTaxableIncome", this.fcurBeneficiaryTaxableIncome);
    __sqoop$field_map.put("fblnBeneficiaryTrustPayingTax", this.fblnBeneficiaryTrustPayingTax);
    __sqoop$field_map.put("fcurBeneficiaryNonComplying", this.fcurBeneficiaryNonComplying);
    __sqoop$field_map.put("fcurBeneficiaryTaxOnTaxableInc", this.fcurBeneficiaryTaxOnTaxableInc);
    __sqoop$field_map.put("fcurBeneficiaryOverseasTaxPaid", this.fcurBeneficiaryOverseasTaxPaid);
    __sqoop$field_map.put("fcurBeneficiaryTaxLessOverseas", this.fcurBeneficiaryTaxLessOverseas);
    __sqoop$field_map.put("fcurBeneficiaryImputation", this.fcurBeneficiaryImputation);
    __sqoop$field_map.put("fcurBeneficiaryAfterImputation", this.fcurBeneficiaryAfterImputation);
    __sqoop$field_map.put("fcurBeneficiaryTaxCredits", this.fcurBeneficiaryTaxCredits);
    __sqoop$field_map.put("fcurBeneficiaryTaxLessCredits", this.fcurBeneficiaryTaxLessCredits);
    __sqoop$field_map.put("fcurBeneficiaryTaxNonComplying", this.fcurBeneficiaryTaxNonComplying);
    __sqoop$field_map.put("fcurBeneficiaryTotalTaxPayable", this.fcurBeneficiaryTotalTaxPayable);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrBeneficiaryName", this.fstrBeneficiaryName);
    __sqoop$field_map.put("fdtmBeneficiaryDOB", this.fdtmBeneficiaryDOB);
    __sqoop$field_map.put("fstrBeneficiaryAddress", this.fstrBeneficiaryAddress);
    __sqoop$field_map.put("fstrBeneficiaryIRD", this.fstrBeneficiaryIRD);
    __sqoop$field_map.put("fblnBeneficiaryIsNonResident", this.fblnBeneficiaryIsNonResident);
    __sqoop$field_map.put("fcurBeneficiaryInterest", this.fcurBeneficiaryInterest);
    __sqoop$field_map.put("fcurBeneficiaryDividends", this.fcurBeneficiaryDividends);
    __sqoop$field_map.put("fcurBeneficiaryMaoriAuthority", this.fcurBeneficiaryMaoriAuthority);
    __sqoop$field_map.put("fcurBeneficiaryOverseas", this.fcurBeneficiaryOverseas);
    __sqoop$field_map.put("fcurBeneficiaryOther", this.fcurBeneficiaryOther);
    __sqoop$field_map.put("fcurBeneficiaryTaxableIncome", this.fcurBeneficiaryTaxableIncome);
    __sqoop$field_map.put("fblnBeneficiaryTrustPayingTax", this.fblnBeneficiaryTrustPayingTax);
    __sqoop$field_map.put("fcurBeneficiaryNonComplying", this.fcurBeneficiaryNonComplying);
    __sqoop$field_map.put("fcurBeneficiaryTaxOnTaxableInc", this.fcurBeneficiaryTaxOnTaxableInc);
    __sqoop$field_map.put("fcurBeneficiaryOverseasTaxPaid", this.fcurBeneficiaryOverseasTaxPaid);
    __sqoop$field_map.put("fcurBeneficiaryTaxLessOverseas", this.fcurBeneficiaryTaxLessOverseas);
    __sqoop$field_map.put("fcurBeneficiaryImputation", this.fcurBeneficiaryImputation);
    __sqoop$field_map.put("fcurBeneficiaryAfterImputation", this.fcurBeneficiaryAfterImputation);
    __sqoop$field_map.put("fcurBeneficiaryTaxCredits", this.fcurBeneficiaryTaxCredits);
    __sqoop$field_map.put("fcurBeneficiaryTaxLessCredits", this.fcurBeneficiaryTaxLessCredits);
    __sqoop$field_map.put("fcurBeneficiaryTaxNonComplying", this.fcurBeneficiaryTaxNonComplying);
    __sqoop$field_map.put("fcurBeneficiaryTotalTaxPayable", this.fcurBeneficiaryTotalTaxPayable);
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
