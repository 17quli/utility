// ORM class for table 'tblnz_incomepsoattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:33:57 NZDT 2020
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

public class tblnz_incomepsoattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngItemNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.flngItemNumber = (Integer)value;
      }
    });
    setters.put("flngRtnPsoVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.flngRtnPsoVerLast = (Integer)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fstrEmployeeName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrEmployeeName = (String)value;
      }
    });
    setters.put("fstrSurname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrSurname = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrTaxCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrTaxCode = (String)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fdtmStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPayPeriodStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fdtmPayPeriodStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPayPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fdtmPayPeriodEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPayFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrPayFrequency = (String)value;
      }
    });
    setters.put("fblnPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fblnPayment = (Integer)value;
      }
    });
    setters.put("fstrCSCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrCSCode = (String)value;
      }
    });
    setters.put("fcurGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPAYE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurPAYE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEarnings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurEarnings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChildSupport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurChildSupport = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurStudentLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurStudentLoan = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurKiwiSaverDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurKiwiSaverDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurKiwiSaverContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurKiwiSaverContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditsDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurTaxCreditsDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditsExtinguish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurTaxCreditsExtinguish = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurESCTDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurESCTDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFamilyTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurFamilyTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurHoursPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurHoursPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLCIRDedPosting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurSLCIRDedPosting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLBORDedPosting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurSLBORDedPosting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurKSEmployeeContRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurKSEmployeeContRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCECPosting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurCECPosting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurVECPosting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurVECPosting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurESSDedPosting", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurESSDedPosting = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPriorPeriodGrossAdj", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurPriorPeriodGrossAdj = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPriorPeriodPAYEAdj", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fcurPriorPeriodPAYEAdj = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepsoattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomepsoattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomepsoattributes with_fi64IncomeKey(Long fi64IncomeKey) {
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
  public tblnz_incomepsoattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomepsoattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_incomepsoattributes with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngItemNumber;
  public Integer get_flngItemNumber() {
    return flngItemNumber;
  }
  public void set_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
  }
  public tblnz_incomepsoattributes with_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
    return this;
  }
  private Integer flngRtnPsoVerLast;
  public Integer get_flngRtnPsoVerLast() {
    return flngRtnPsoVerLast;
  }
  public void set_flngRtnPsoVerLast(Integer flngRtnPsoVerLast) {
    this.flngRtnPsoVerLast = flngRtnPsoVerLast;
  }
  public tblnz_incomepsoattributes with_flngRtnPsoVerLast(Integer flngRtnPsoVerLast) {
    this.flngRtnPsoVerLast = flngRtnPsoVerLast;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_incomepsoattributes with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private String fstrEmployeeName;
  public String get_fstrEmployeeName() {
    return fstrEmployeeName;
  }
  public void set_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
  }
  public tblnz_incomepsoattributes with_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
    return this;
  }
  private String fstrSurname;
  public String get_fstrSurname() {
    return fstrSurname;
  }
  public void set_fstrSurname(String fstrSurname) {
    this.fstrSurname = fstrSurname;
  }
  public tblnz_incomepsoattributes with_fstrSurname(String fstrSurname) {
    this.fstrSurname = fstrSurname;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblnz_incomepsoattributes with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrTaxCode;
  public String get_fstrTaxCode() {
    return fstrTaxCode;
  }
  public void set_fstrTaxCode(String fstrTaxCode) {
    this.fstrTaxCode = fstrTaxCode;
  }
  public tblnz_incomepsoattributes with_fstrTaxCode(String fstrTaxCode) {
    this.fstrTaxCode = fstrTaxCode;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tblnz_incomepsoattributes with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmStop;
  public java.sql.Timestamp get_fdtmStop() {
    return fdtmStop;
  }
  public void set_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
  }
  public tblnz_incomepsoattributes with_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
    return this;
  }
  private java.sql.Timestamp fdtmPayPeriodStart;
  public java.sql.Timestamp get_fdtmPayPeriodStart() {
    return fdtmPayPeriodStart;
  }
  public void set_fdtmPayPeriodStart(java.sql.Timestamp fdtmPayPeriodStart) {
    this.fdtmPayPeriodStart = fdtmPayPeriodStart;
  }
  public tblnz_incomepsoattributes with_fdtmPayPeriodStart(java.sql.Timestamp fdtmPayPeriodStart) {
    this.fdtmPayPeriodStart = fdtmPayPeriodStart;
    return this;
  }
  private java.sql.Timestamp fdtmPayPeriodEnd;
  public java.sql.Timestamp get_fdtmPayPeriodEnd() {
    return fdtmPayPeriodEnd;
  }
  public void set_fdtmPayPeriodEnd(java.sql.Timestamp fdtmPayPeriodEnd) {
    this.fdtmPayPeriodEnd = fdtmPayPeriodEnd;
  }
  public tblnz_incomepsoattributes with_fdtmPayPeriodEnd(java.sql.Timestamp fdtmPayPeriodEnd) {
    this.fdtmPayPeriodEnd = fdtmPayPeriodEnd;
    return this;
  }
  private String fstrPayFrequency;
  public String get_fstrPayFrequency() {
    return fstrPayFrequency;
  }
  public void set_fstrPayFrequency(String fstrPayFrequency) {
    this.fstrPayFrequency = fstrPayFrequency;
  }
  public tblnz_incomepsoattributes with_fstrPayFrequency(String fstrPayFrequency) {
    this.fstrPayFrequency = fstrPayFrequency;
    return this;
  }
  private Integer fblnPayment;
  public Integer get_fblnPayment() {
    return fblnPayment;
  }
  public void set_fblnPayment(Integer fblnPayment) {
    this.fblnPayment = fblnPayment;
  }
  public tblnz_incomepsoattributes with_fblnPayment(Integer fblnPayment) {
    this.fblnPayment = fblnPayment;
    return this;
  }
  private String fstrCSCode;
  public String get_fstrCSCode() {
    return fstrCSCode;
  }
  public void set_fstrCSCode(String fstrCSCode) {
    this.fstrCSCode = fstrCSCode;
  }
  public tblnz_incomepsoattributes with_fstrCSCode(String fstrCSCode) {
    this.fstrCSCode = fstrCSCode;
    return this;
  }
  private java.math.BigDecimal fcurGross;
  public java.math.BigDecimal get_fcurGross() {
    return fcurGross;
  }
  public void set_fcurGross(java.math.BigDecimal fcurGross) {
    this.fcurGross = fcurGross;
  }
  public tblnz_incomepsoattributes with_fcurGross(java.math.BigDecimal fcurGross) {
    this.fcurGross = fcurGross;
    return this;
  }
  private java.math.BigDecimal fcurPAYE;
  public java.math.BigDecimal get_fcurPAYE() {
    return fcurPAYE;
  }
  public void set_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
  }
  public tblnz_incomepsoattributes with_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
    return this;
  }
  private java.math.BigDecimal fcurEarnings;
  public java.math.BigDecimal get_fcurEarnings() {
    return fcurEarnings;
  }
  public void set_fcurEarnings(java.math.BigDecimal fcurEarnings) {
    this.fcurEarnings = fcurEarnings;
  }
  public tblnz_incomepsoattributes with_fcurEarnings(java.math.BigDecimal fcurEarnings) {
    this.fcurEarnings = fcurEarnings;
    return this;
  }
  private java.math.BigDecimal fcurChildSupport;
  public java.math.BigDecimal get_fcurChildSupport() {
    return fcurChildSupport;
  }
  public void set_fcurChildSupport(java.math.BigDecimal fcurChildSupport) {
    this.fcurChildSupport = fcurChildSupport;
  }
  public tblnz_incomepsoattributes with_fcurChildSupport(java.math.BigDecimal fcurChildSupport) {
    this.fcurChildSupport = fcurChildSupport;
    return this;
  }
  private java.math.BigDecimal fcurStudentLoan;
  public java.math.BigDecimal get_fcurStudentLoan() {
    return fcurStudentLoan;
  }
  public void set_fcurStudentLoan(java.math.BigDecimal fcurStudentLoan) {
    this.fcurStudentLoan = fcurStudentLoan;
  }
  public tblnz_incomepsoattributes with_fcurStudentLoan(java.math.BigDecimal fcurStudentLoan) {
    this.fcurStudentLoan = fcurStudentLoan;
    return this;
  }
  private java.math.BigDecimal fcurKiwiSaverDeductions;
  public java.math.BigDecimal get_fcurKiwiSaverDeductions() {
    return fcurKiwiSaverDeductions;
  }
  public void set_fcurKiwiSaverDeductions(java.math.BigDecimal fcurKiwiSaverDeductions) {
    this.fcurKiwiSaverDeductions = fcurKiwiSaverDeductions;
  }
  public tblnz_incomepsoattributes with_fcurKiwiSaverDeductions(java.math.BigDecimal fcurKiwiSaverDeductions) {
    this.fcurKiwiSaverDeductions = fcurKiwiSaverDeductions;
    return this;
  }
  private java.math.BigDecimal fcurKiwiSaverContributions;
  public java.math.BigDecimal get_fcurKiwiSaverContributions() {
    return fcurKiwiSaverContributions;
  }
  public void set_fcurKiwiSaverContributions(java.math.BigDecimal fcurKiwiSaverContributions) {
    this.fcurKiwiSaverContributions = fcurKiwiSaverContributions;
  }
  public tblnz_incomepsoattributes with_fcurKiwiSaverContributions(java.math.BigDecimal fcurKiwiSaverContributions) {
    this.fcurKiwiSaverContributions = fcurKiwiSaverContributions;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditsDonations;
  public java.math.BigDecimal get_fcurTaxCreditsDonations() {
    return fcurTaxCreditsDonations;
  }
  public void set_fcurTaxCreditsDonations(java.math.BigDecimal fcurTaxCreditsDonations) {
    this.fcurTaxCreditsDonations = fcurTaxCreditsDonations;
  }
  public tblnz_incomepsoattributes with_fcurTaxCreditsDonations(java.math.BigDecimal fcurTaxCreditsDonations) {
    this.fcurTaxCreditsDonations = fcurTaxCreditsDonations;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditsExtinguish;
  public java.math.BigDecimal get_fcurTaxCreditsExtinguish() {
    return fcurTaxCreditsExtinguish;
  }
  public void set_fcurTaxCreditsExtinguish(java.math.BigDecimal fcurTaxCreditsExtinguish) {
    this.fcurTaxCreditsExtinguish = fcurTaxCreditsExtinguish;
  }
  public tblnz_incomepsoattributes with_fcurTaxCreditsExtinguish(java.math.BigDecimal fcurTaxCreditsExtinguish) {
    this.fcurTaxCreditsExtinguish = fcurTaxCreditsExtinguish;
    return this;
  }
  private java.math.BigDecimal fcurESCTDeductions;
  public java.math.BigDecimal get_fcurESCTDeductions() {
    return fcurESCTDeductions;
  }
  public void set_fcurESCTDeductions(java.math.BigDecimal fcurESCTDeductions) {
    this.fcurESCTDeductions = fcurESCTDeductions;
  }
  public tblnz_incomepsoattributes with_fcurESCTDeductions(java.math.BigDecimal fcurESCTDeductions) {
    this.fcurESCTDeductions = fcurESCTDeductions;
    return this;
  }
  private java.math.BigDecimal fcurFamilyTaxCredits;
  public java.math.BigDecimal get_fcurFamilyTaxCredits() {
    return fcurFamilyTaxCredits;
  }
  public void set_fcurFamilyTaxCredits(java.math.BigDecimal fcurFamilyTaxCredits) {
    this.fcurFamilyTaxCredits = fcurFamilyTaxCredits;
  }
  public tblnz_incomepsoattributes with_fcurFamilyTaxCredits(java.math.BigDecimal fcurFamilyTaxCredits) {
    this.fcurFamilyTaxCredits = fcurFamilyTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurHoursPaid;
  public java.math.BigDecimal get_fcurHoursPaid() {
    return fcurHoursPaid;
  }
  public void set_fcurHoursPaid(java.math.BigDecimal fcurHoursPaid) {
    this.fcurHoursPaid = fcurHoursPaid;
  }
  public tblnz_incomepsoattributes with_fcurHoursPaid(java.math.BigDecimal fcurHoursPaid) {
    this.fcurHoursPaid = fcurHoursPaid;
    return this;
  }
  private java.math.BigDecimal fcurSLCIRDedPosting;
  public java.math.BigDecimal get_fcurSLCIRDedPosting() {
    return fcurSLCIRDedPosting;
  }
  public void set_fcurSLCIRDedPosting(java.math.BigDecimal fcurSLCIRDedPosting) {
    this.fcurSLCIRDedPosting = fcurSLCIRDedPosting;
  }
  public tblnz_incomepsoattributes with_fcurSLCIRDedPosting(java.math.BigDecimal fcurSLCIRDedPosting) {
    this.fcurSLCIRDedPosting = fcurSLCIRDedPosting;
    return this;
  }
  private java.math.BigDecimal fcurSLBORDedPosting;
  public java.math.BigDecimal get_fcurSLBORDedPosting() {
    return fcurSLBORDedPosting;
  }
  public void set_fcurSLBORDedPosting(java.math.BigDecimal fcurSLBORDedPosting) {
    this.fcurSLBORDedPosting = fcurSLBORDedPosting;
  }
  public tblnz_incomepsoattributes with_fcurSLBORDedPosting(java.math.BigDecimal fcurSLBORDedPosting) {
    this.fcurSLBORDedPosting = fcurSLBORDedPosting;
    return this;
  }
  private java.math.BigDecimal fcurKSEmployeeContRate;
  public java.math.BigDecimal get_fcurKSEmployeeContRate() {
    return fcurKSEmployeeContRate;
  }
  public void set_fcurKSEmployeeContRate(java.math.BigDecimal fcurKSEmployeeContRate) {
    this.fcurKSEmployeeContRate = fcurKSEmployeeContRate;
  }
  public tblnz_incomepsoattributes with_fcurKSEmployeeContRate(java.math.BigDecimal fcurKSEmployeeContRate) {
    this.fcurKSEmployeeContRate = fcurKSEmployeeContRate;
    return this;
  }
  private java.math.BigDecimal fcurCECPosting;
  public java.math.BigDecimal get_fcurCECPosting() {
    return fcurCECPosting;
  }
  public void set_fcurCECPosting(java.math.BigDecimal fcurCECPosting) {
    this.fcurCECPosting = fcurCECPosting;
  }
  public tblnz_incomepsoattributes with_fcurCECPosting(java.math.BigDecimal fcurCECPosting) {
    this.fcurCECPosting = fcurCECPosting;
    return this;
  }
  private java.math.BigDecimal fcurVECPosting;
  public java.math.BigDecimal get_fcurVECPosting() {
    return fcurVECPosting;
  }
  public void set_fcurVECPosting(java.math.BigDecimal fcurVECPosting) {
    this.fcurVECPosting = fcurVECPosting;
  }
  public tblnz_incomepsoattributes with_fcurVECPosting(java.math.BigDecimal fcurVECPosting) {
    this.fcurVECPosting = fcurVECPosting;
    return this;
  }
  private java.math.BigDecimal fcurESSDedPosting;
  public java.math.BigDecimal get_fcurESSDedPosting() {
    return fcurESSDedPosting;
  }
  public void set_fcurESSDedPosting(java.math.BigDecimal fcurESSDedPosting) {
    this.fcurESSDedPosting = fcurESSDedPosting;
  }
  public tblnz_incomepsoattributes with_fcurESSDedPosting(java.math.BigDecimal fcurESSDedPosting) {
    this.fcurESSDedPosting = fcurESSDedPosting;
    return this;
  }
  private java.math.BigDecimal fcurPriorPeriodGrossAdj;
  public java.math.BigDecimal get_fcurPriorPeriodGrossAdj() {
    return fcurPriorPeriodGrossAdj;
  }
  public void set_fcurPriorPeriodGrossAdj(java.math.BigDecimal fcurPriorPeriodGrossAdj) {
    this.fcurPriorPeriodGrossAdj = fcurPriorPeriodGrossAdj;
  }
  public tblnz_incomepsoattributes with_fcurPriorPeriodGrossAdj(java.math.BigDecimal fcurPriorPeriodGrossAdj) {
    this.fcurPriorPeriodGrossAdj = fcurPriorPeriodGrossAdj;
    return this;
  }
  private java.math.BigDecimal fcurPriorPeriodPAYEAdj;
  public java.math.BigDecimal get_fcurPriorPeriodPAYEAdj() {
    return fcurPriorPeriodPAYEAdj;
  }
  public void set_fcurPriorPeriodPAYEAdj(java.math.BigDecimal fcurPriorPeriodPAYEAdj) {
    this.fcurPriorPeriodPAYEAdj = fcurPriorPeriodPAYEAdj;
  }
  public tblnz_incomepsoattributes with_fcurPriorPeriodPAYEAdj(java.math.BigDecimal fcurPriorPeriodPAYEAdj) {
    this.fcurPriorPeriodPAYEAdj = fcurPriorPeriodPAYEAdj;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_incomepsoattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomepsoattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomepsoattributes)) {
      return false;
    }
    tblnz_incomepsoattributes that = (tblnz_incomepsoattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngRtnPsoVerLast == null ? that.flngRtnPsoVerLast == null : this.flngRtnPsoVerLast.equals(that.flngRtnPsoVerLast));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.fstrSurname == null ? that.fstrSurname == null : this.fstrSurname.equals(that.fstrSurname));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrTaxCode == null ? that.fstrTaxCode == null : this.fstrTaxCode.equals(that.fstrTaxCode));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fdtmPayPeriodStart == null ? that.fdtmPayPeriodStart == null : this.fdtmPayPeriodStart.equals(that.fdtmPayPeriodStart));
    equal = equal && (this.fdtmPayPeriodEnd == null ? that.fdtmPayPeriodEnd == null : this.fdtmPayPeriodEnd.equals(that.fdtmPayPeriodEnd));
    equal = equal && (this.fstrPayFrequency == null ? that.fstrPayFrequency == null : this.fstrPayFrequency.equals(that.fstrPayFrequency));
    equal = equal && (this.fblnPayment == null ? that.fblnPayment == null : this.fblnPayment.equals(that.fblnPayment));
    equal = equal && (this.fstrCSCode == null ? that.fstrCSCode == null : this.fstrCSCode.equals(that.fstrCSCode));
    equal = equal && (this.fcurGross == null ? that.fcurGross == null : this.fcurGross.equals(that.fcurGross));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurEarnings == null ? that.fcurEarnings == null : this.fcurEarnings.equals(that.fcurEarnings));
    equal = equal && (this.fcurChildSupport == null ? that.fcurChildSupport == null : this.fcurChildSupport.equals(that.fcurChildSupport));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurKiwiSaverDeductions == null ? that.fcurKiwiSaverDeductions == null : this.fcurKiwiSaverDeductions.equals(that.fcurKiwiSaverDeductions));
    equal = equal && (this.fcurKiwiSaverContributions == null ? that.fcurKiwiSaverContributions == null : this.fcurKiwiSaverContributions.equals(that.fcurKiwiSaverContributions));
    equal = equal && (this.fcurTaxCreditsDonations == null ? that.fcurTaxCreditsDonations == null : this.fcurTaxCreditsDonations.equals(that.fcurTaxCreditsDonations));
    equal = equal && (this.fcurTaxCreditsExtinguish == null ? that.fcurTaxCreditsExtinguish == null : this.fcurTaxCreditsExtinguish.equals(that.fcurTaxCreditsExtinguish));
    equal = equal && (this.fcurESCTDeductions == null ? that.fcurESCTDeductions == null : this.fcurESCTDeductions.equals(that.fcurESCTDeductions));
    equal = equal && (this.fcurFamilyTaxCredits == null ? that.fcurFamilyTaxCredits == null : this.fcurFamilyTaxCredits.equals(that.fcurFamilyTaxCredits));
    equal = equal && (this.fcurHoursPaid == null ? that.fcurHoursPaid == null : this.fcurHoursPaid.equals(that.fcurHoursPaid));
    equal = equal && (this.fcurSLCIRDedPosting == null ? that.fcurSLCIRDedPosting == null : this.fcurSLCIRDedPosting.equals(that.fcurSLCIRDedPosting));
    equal = equal && (this.fcurSLBORDedPosting == null ? that.fcurSLBORDedPosting == null : this.fcurSLBORDedPosting.equals(that.fcurSLBORDedPosting));
    equal = equal && (this.fcurKSEmployeeContRate == null ? that.fcurKSEmployeeContRate == null : this.fcurKSEmployeeContRate.equals(that.fcurKSEmployeeContRate));
    equal = equal && (this.fcurCECPosting == null ? that.fcurCECPosting == null : this.fcurCECPosting.equals(that.fcurCECPosting));
    equal = equal && (this.fcurVECPosting == null ? that.fcurVECPosting == null : this.fcurVECPosting.equals(that.fcurVECPosting));
    equal = equal && (this.fcurESSDedPosting == null ? that.fcurESSDedPosting == null : this.fcurESSDedPosting.equals(that.fcurESSDedPosting));
    equal = equal && (this.fcurPriorPeriodGrossAdj == null ? that.fcurPriorPeriodGrossAdj == null : this.fcurPriorPeriodGrossAdj.equals(that.fcurPriorPeriodGrossAdj));
    equal = equal && (this.fcurPriorPeriodPAYEAdj == null ? that.fcurPriorPeriodPAYEAdj == null : this.fcurPriorPeriodPAYEAdj.equals(that.fcurPriorPeriodPAYEAdj));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomepsoattributes)) {
      return false;
    }
    tblnz_incomepsoattributes that = (tblnz_incomepsoattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngRtnPsoVerLast == null ? that.flngRtnPsoVerLast == null : this.flngRtnPsoVerLast.equals(that.flngRtnPsoVerLast));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.fstrSurname == null ? that.fstrSurname == null : this.fstrSurname.equals(that.fstrSurname));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrTaxCode == null ? that.fstrTaxCode == null : this.fstrTaxCode.equals(that.fstrTaxCode));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fdtmPayPeriodStart == null ? that.fdtmPayPeriodStart == null : this.fdtmPayPeriodStart.equals(that.fdtmPayPeriodStart));
    equal = equal && (this.fdtmPayPeriodEnd == null ? that.fdtmPayPeriodEnd == null : this.fdtmPayPeriodEnd.equals(that.fdtmPayPeriodEnd));
    equal = equal && (this.fstrPayFrequency == null ? that.fstrPayFrequency == null : this.fstrPayFrequency.equals(that.fstrPayFrequency));
    equal = equal && (this.fblnPayment == null ? that.fblnPayment == null : this.fblnPayment.equals(that.fblnPayment));
    equal = equal && (this.fstrCSCode == null ? that.fstrCSCode == null : this.fstrCSCode.equals(that.fstrCSCode));
    equal = equal && (this.fcurGross == null ? that.fcurGross == null : this.fcurGross.equals(that.fcurGross));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurEarnings == null ? that.fcurEarnings == null : this.fcurEarnings.equals(that.fcurEarnings));
    equal = equal && (this.fcurChildSupport == null ? that.fcurChildSupport == null : this.fcurChildSupport.equals(that.fcurChildSupport));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurKiwiSaverDeductions == null ? that.fcurKiwiSaverDeductions == null : this.fcurKiwiSaverDeductions.equals(that.fcurKiwiSaverDeductions));
    equal = equal && (this.fcurKiwiSaverContributions == null ? that.fcurKiwiSaverContributions == null : this.fcurKiwiSaverContributions.equals(that.fcurKiwiSaverContributions));
    equal = equal && (this.fcurTaxCreditsDonations == null ? that.fcurTaxCreditsDonations == null : this.fcurTaxCreditsDonations.equals(that.fcurTaxCreditsDonations));
    equal = equal && (this.fcurTaxCreditsExtinguish == null ? that.fcurTaxCreditsExtinguish == null : this.fcurTaxCreditsExtinguish.equals(that.fcurTaxCreditsExtinguish));
    equal = equal && (this.fcurESCTDeductions == null ? that.fcurESCTDeductions == null : this.fcurESCTDeductions.equals(that.fcurESCTDeductions));
    equal = equal && (this.fcurFamilyTaxCredits == null ? that.fcurFamilyTaxCredits == null : this.fcurFamilyTaxCredits.equals(that.fcurFamilyTaxCredits));
    equal = equal && (this.fcurHoursPaid == null ? that.fcurHoursPaid == null : this.fcurHoursPaid.equals(that.fcurHoursPaid));
    equal = equal && (this.fcurSLCIRDedPosting == null ? that.fcurSLCIRDedPosting == null : this.fcurSLCIRDedPosting.equals(that.fcurSLCIRDedPosting));
    equal = equal && (this.fcurSLBORDedPosting == null ? that.fcurSLBORDedPosting == null : this.fcurSLBORDedPosting.equals(that.fcurSLBORDedPosting));
    equal = equal && (this.fcurKSEmployeeContRate == null ? that.fcurKSEmployeeContRate == null : this.fcurKSEmployeeContRate.equals(that.fcurKSEmployeeContRate));
    equal = equal && (this.fcurCECPosting == null ? that.fcurCECPosting == null : this.fcurCECPosting.equals(that.fcurCECPosting));
    equal = equal && (this.fcurVECPosting == null ? that.fcurVECPosting == null : this.fcurVECPosting.equals(that.fcurVECPosting));
    equal = equal && (this.fcurESSDedPosting == null ? that.fcurESSDedPosting == null : this.fcurESSDedPosting.equals(that.fcurESSDedPosting));
    equal = equal && (this.fcurPriorPeriodGrossAdj == null ? that.fcurPriorPeriodGrossAdj == null : this.fcurPriorPeriodGrossAdj.equals(that.fcurPriorPeriodGrossAdj));
    equal = equal && (this.fcurPriorPeriodPAYEAdj == null ? that.fcurPriorPeriodPAYEAdj == null : this.fcurPriorPeriodPAYEAdj.equals(that.fcurPriorPeriodPAYEAdj));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRtnPsoVerLast = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSurname = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTaxCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmPayPeriodStart = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmPayPeriodEnd = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrPayFrequency = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnPayment = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrCSCode = JdbcWritableBridge.readString(18, __dbResults);
    this.fcurGross = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEarnings = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurChildSupport = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxCreditsDonations = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurESCTDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurHoursPaid = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurSLCIRDedPosting = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurSLBORDedPosting = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurKSEmployeeContRate = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurCECPosting = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurVECPosting = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurESSDedPosting = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurPriorPeriodGrossAdj = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurPriorPeriodPAYEAdj = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(40, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRtnPsoVerLast = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSurname = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrTaxCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmPayPeriodStart = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmPayPeriodEnd = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrPayFrequency = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnPayment = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrCSCode = JdbcWritableBridge.readString(18, __dbResults);
    this.fcurGross = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurEarnings = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurChildSupport = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTaxCreditsDonations = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurESCTDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurHoursPaid = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurSLCIRDedPosting = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurSLBORDedPosting = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurKSEmployeeContRate = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurCECPosting = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurVECPosting = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurESSDedPosting = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurPriorPeriodGrossAdj = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurPriorPeriodPAYEAdj = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(39, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(40, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRtnPsoVerLast, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSurname, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTaxCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayPeriodStart, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayPeriodEnd, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayFrequency, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayment, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCSCode, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGross, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEarnings, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupport, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverDeductions, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverContributions, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsDonations, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsExtinguish, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFamilyTaxCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurHoursPaid, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLCIRDedPosting, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLBORDedPosting, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKSEmployeeContRate, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCECPosting, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVECPosting, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESSDedPosting, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorPeriodGrossAdj, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorPeriodPAYEAdj, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 40 + __off, 93, __dbStmt);
    return 40;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRtnPsoVerLast, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSurname, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTaxCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayPeriodStart, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayPeriodEnd, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayFrequency, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayment, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCSCode, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGross, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEarnings, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupport, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverDeductions, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverContributions, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsDonations, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsExtinguish, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFamilyTaxCredits, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurHoursPaid, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLCIRDedPosting, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLBORDedPosting, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKSEmployeeContRate, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCECPosting, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVECPosting, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESSDedPosting, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorPeriodGrossAdj, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorPeriodPAYEAdj, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 40 + __off, 93, __dbStmt);
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
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngItemNumber = null;
    } else {
    this.flngItemNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngRtnPsoVerLast = null;
    } else {
    this.flngRtnPsoVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeName = null;
    } else {
    this.fstrEmployeeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSurname = null;
    } else {
    this.fstrSurname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTaxCode = null;
    } else {
    this.fstrTaxCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStop = null;
    } else {
    this.fdtmStop = new Timestamp(__dataIn.readLong());
    this.fdtmStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayPeriodStart = null;
    } else {
    this.fdtmPayPeriodStart = new Timestamp(__dataIn.readLong());
    this.fdtmPayPeriodStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayPeriodEnd = null;
    } else {
    this.fdtmPayPeriodEnd = new Timestamp(__dataIn.readLong());
    this.fdtmPayPeriodEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayFrequency = null;
    } else {
    this.fstrPayFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPayment = null;
    } else {
    this.fblnPayment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCSCode = null;
    } else {
    this.fstrCSCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGross = null;
    } else {
    this.fcurGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPAYE = null;
    } else {
    this.fcurPAYE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEarnings = null;
    } else {
    this.fcurEarnings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurChildSupport = null;
    } else {
    this.fcurChildSupport = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurStudentLoan = null;
    } else {
    this.fcurStudentLoan = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurKiwiSaverDeductions = null;
    } else {
    this.fcurKiwiSaverDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurKiwiSaverContributions = null;
    } else {
    this.fcurKiwiSaverContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditsDonations = null;
    } else {
    this.fcurTaxCreditsDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditsExtinguish = null;
    } else {
    this.fcurTaxCreditsExtinguish = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurESCTDeductions = null;
    } else {
    this.fcurESCTDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFamilyTaxCredits = null;
    } else {
    this.fcurFamilyTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurHoursPaid = null;
    } else {
    this.fcurHoursPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLCIRDedPosting = null;
    } else {
    this.fcurSLCIRDedPosting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLBORDedPosting = null;
    } else {
    this.fcurSLBORDedPosting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurKSEmployeeContRate = null;
    } else {
    this.fcurKSEmployeeContRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCECPosting = null;
    } else {
    this.fcurCECPosting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurVECPosting = null;
    } else {
    this.fcurVECPosting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurESSDedPosting = null;
    } else {
    this.fcurESSDedPosting = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPriorPeriodGrossAdj = null;
    } else {
    this.fcurPriorPeriodGrossAdj = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPriorPeriodPAYEAdj = null;
    } else {
    this.fcurPriorPeriodPAYEAdj = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
    }
    if (null == this.flngRtnPsoVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRtnPsoVerLast);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.fstrSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSurname);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTaxCode);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fdtmPayPeriodStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayPeriodStart.getTime());
    __dataOut.writeInt(this.fdtmPayPeriodStart.getNanos());
    }
    if (null == this.fdtmPayPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmPayPeriodEnd.getNanos());
    }
    if (null == this.fstrPayFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayFrequency);
    }
    if (null == this.fblnPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayment);
    }
    if (null == this.fstrCSCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCSCode);
    }
    if (null == this.fcurGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGross, __dataOut);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
    }
    if (null == this.fcurEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEarnings, __dataOut);
    }
    if (null == this.fcurChildSupport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupport, __dataOut);
    }
    if (null == this.fcurStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStudentLoan, __dataOut);
    }
    if (null == this.fcurKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurKiwiSaverContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKiwiSaverContributions, __dataOut);
    }
    if (null == this.fcurTaxCreditsDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsDonations, __dataOut);
    }
    if (null == this.fcurTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTDeductions, __dataOut);
    }
    if (null == this.fcurFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFamilyTaxCredits, __dataOut);
    }
    if (null == this.fcurHoursPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurHoursPaid, __dataOut);
    }
    if (null == this.fcurSLCIRDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLCIRDedPosting, __dataOut);
    }
    if (null == this.fcurSLBORDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLBORDedPosting, __dataOut);
    }
    if (null == this.fcurKSEmployeeContRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKSEmployeeContRate, __dataOut);
    }
    if (null == this.fcurCECPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCECPosting, __dataOut);
    }
    if (null == this.fcurVECPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVECPosting, __dataOut);
    }
    if (null == this.fcurESSDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESSDedPosting, __dataOut);
    }
    if (null == this.fcurPriorPeriodGrossAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorPeriodGrossAdj, __dataOut);
    }
    if (null == this.fcurPriorPeriodPAYEAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorPeriodPAYEAdj, __dataOut);
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
    }
    if (null == this.flngRtnPsoVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRtnPsoVerLast);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.fstrSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSurname);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTaxCode);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fdtmPayPeriodStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayPeriodStart.getTime());
    __dataOut.writeInt(this.fdtmPayPeriodStart.getNanos());
    }
    if (null == this.fdtmPayPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmPayPeriodEnd.getNanos());
    }
    if (null == this.fstrPayFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayFrequency);
    }
    if (null == this.fblnPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayment);
    }
    if (null == this.fstrCSCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCSCode);
    }
    if (null == this.fcurGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGross, __dataOut);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
    }
    if (null == this.fcurEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEarnings, __dataOut);
    }
    if (null == this.fcurChildSupport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurChildSupport, __dataOut);
    }
    if (null == this.fcurStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStudentLoan, __dataOut);
    }
    if (null == this.fcurKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurKiwiSaverContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKiwiSaverContributions, __dataOut);
    }
    if (null == this.fcurTaxCreditsDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsDonations, __dataOut);
    }
    if (null == this.fcurTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTDeductions, __dataOut);
    }
    if (null == this.fcurFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFamilyTaxCredits, __dataOut);
    }
    if (null == this.fcurHoursPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurHoursPaid, __dataOut);
    }
    if (null == this.fcurSLCIRDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLCIRDedPosting, __dataOut);
    }
    if (null == this.fcurSLBORDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLBORDedPosting, __dataOut);
    }
    if (null == this.fcurKSEmployeeContRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurKSEmployeeContRate, __dataOut);
    }
    if (null == this.fcurCECPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCECPosting, __dataOut);
    }
    if (null == this.fcurVECPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVECPosting, __dataOut);
    }
    if (null == this.fcurESSDedPosting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESSDedPosting, __dataOut);
    }
    if (null == this.fcurPriorPeriodGrossAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorPeriodGrossAdj, __dataOut);
    }
    if (null == this.fcurPriorPeriodPAYEAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorPeriodPAYEAdj, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRtnPsoVerLast==null?"\\N":"" + flngRtnPsoVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSurname==null?"\\N":fstrSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTaxCode==null?"\\N":fstrTaxCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayPeriodStart==null?"\\N":"" + fdtmPayPeriodStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayPeriodEnd==null?"\\N":"" + fdtmPayPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayFrequency==null?"\\N":fstrPayFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayment==null?"\\N":"" + fblnPayment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCSCode==null?"\\N":fstrCSCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGross==null?"\\N":fcurGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEarnings==null?"\\N":fcurEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupport==null?"\\N":fcurChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverDeductions==null?"\\N":fcurKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverContributions==null?"\\N":fcurKiwiSaverContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsDonations==null?"\\N":fcurTaxCreditsDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsExtinguish==null?"\\N":fcurTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTDeductions==null?"\\N":fcurESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFamilyTaxCredits==null?"\\N":fcurFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurHoursPaid==null?"\\N":fcurHoursPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLCIRDedPosting==null?"\\N":fcurSLCIRDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLBORDedPosting==null?"\\N":fcurSLBORDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKSEmployeeContRate==null?"\\N":fcurKSEmployeeContRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCECPosting==null?"\\N":fcurCECPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVECPosting==null?"\\N":fcurVECPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESSDedPosting==null?"\\N":fcurESSDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorPeriodGrossAdj==null?"\\N":fcurPriorPeriodGrossAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorPeriodPAYEAdj==null?"\\N":fcurPriorPeriodPAYEAdj.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRtnPsoVerLast==null?"\\N":"" + flngRtnPsoVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSurname==null?"\\N":fstrSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTaxCode==null?"\\N":fstrTaxCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayPeriodStart==null?"\\N":"" + fdtmPayPeriodStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayPeriodEnd==null?"\\N":"" + fdtmPayPeriodEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayFrequency==null?"\\N":fstrPayFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayment==null?"\\N":"" + fblnPayment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCSCode==null?"\\N":fstrCSCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGross==null?"\\N":fcurGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEarnings==null?"\\N":fcurEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupport==null?"\\N":fcurChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverDeductions==null?"\\N":fcurKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverContributions==null?"\\N":fcurKiwiSaverContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsDonations==null?"\\N":fcurTaxCreditsDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsExtinguish==null?"\\N":fcurTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTDeductions==null?"\\N":fcurESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFamilyTaxCredits==null?"\\N":fcurFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurHoursPaid==null?"\\N":fcurHoursPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLCIRDedPosting==null?"\\N":fcurSLCIRDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLBORDedPosting==null?"\\N":fcurSLBORDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKSEmployeeContRate==null?"\\N":fcurKSEmployeeContRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCECPosting==null?"\\N":fcurCECPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVECPosting==null?"\\N":fcurVECPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESSDedPosting==null?"\\N":fcurESSDedPosting.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorPeriodGrossAdj==null?"\\N":fcurPriorPeriodGrossAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorPeriodPAYEAdj==null?"\\N":fcurPriorPeriodPAYEAdj.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRtnPsoVerLast = null; } else {
      this.flngRtnPsoVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSurname = null; } else {
      this.fstrSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTaxCode = null; } else {
      this.fstrTaxCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayPeriodStart = null; } else {
      this.fdtmPayPeriodStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayPeriodEnd = null; } else {
      this.fdtmPayPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayFrequency = null; } else {
      this.fstrPayFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayment = null; } else {
      this.fblnPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCSCode = null; } else {
      this.fstrCSCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGross = null; } else {
      this.fcurGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPAYE = null; } else {
      this.fcurPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEarnings = null; } else {
      this.fcurEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupport = null; } else {
      this.fcurChildSupport = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStudentLoan = null; } else {
      this.fcurStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKiwiSaverDeductions = null; } else {
      this.fcurKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKiwiSaverContributions = null; } else {
      this.fcurKiwiSaverContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsDonations = null; } else {
      this.fcurTaxCreditsDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsExtinguish = null; } else {
      this.fcurTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTDeductions = null; } else {
      this.fcurESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFamilyTaxCredits = null; } else {
      this.fcurFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurHoursPaid = null; } else {
      this.fcurHoursPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLCIRDedPosting = null; } else {
      this.fcurSLCIRDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLBORDedPosting = null; } else {
      this.fcurSLBORDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKSEmployeeContRate = null; } else {
      this.fcurKSEmployeeContRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCECPosting = null; } else {
      this.fcurCECPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVECPosting = null; } else {
      this.fcurVECPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESSDedPosting = null; } else {
      this.fcurESSDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorPeriodGrossAdj = null; } else {
      this.fcurPriorPeriodGrossAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorPeriodPAYEAdj = null; } else {
      this.fcurPriorPeriodPAYEAdj = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRtnPsoVerLast = null; } else {
      this.flngRtnPsoVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSurname = null; } else {
      this.fstrSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTaxCode = null; } else {
      this.fstrTaxCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayPeriodStart = null; } else {
      this.fdtmPayPeriodStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayPeriodEnd = null; } else {
      this.fdtmPayPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayFrequency = null; } else {
      this.fstrPayFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayment = null; } else {
      this.fblnPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCSCode = null; } else {
      this.fstrCSCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGross = null; } else {
      this.fcurGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPAYE = null; } else {
      this.fcurPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEarnings = null; } else {
      this.fcurEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurChildSupport = null; } else {
      this.fcurChildSupport = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStudentLoan = null; } else {
      this.fcurStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKiwiSaverDeductions = null; } else {
      this.fcurKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKiwiSaverContributions = null; } else {
      this.fcurKiwiSaverContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsDonations = null; } else {
      this.fcurTaxCreditsDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsExtinguish = null; } else {
      this.fcurTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTDeductions = null; } else {
      this.fcurESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFamilyTaxCredits = null; } else {
      this.fcurFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurHoursPaid = null; } else {
      this.fcurHoursPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLCIRDedPosting = null; } else {
      this.fcurSLCIRDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLBORDedPosting = null; } else {
      this.fcurSLBORDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurKSEmployeeContRate = null; } else {
      this.fcurKSEmployeeContRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCECPosting = null; } else {
      this.fcurCECPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVECPosting = null; } else {
      this.fcurVECPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESSDedPosting = null; } else {
      this.fcurESSDedPosting = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorPeriodGrossAdj = null; } else {
      this.fcurPriorPeriodGrossAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorPeriodPAYEAdj = null; } else {
      this.fcurPriorPeriodPAYEAdj = new java.math.BigDecimal(__cur_str);
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
    tblnz_incomepsoattributes o = (tblnz_incomepsoattributes) super.clone();
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmPayPeriodStart = (o.fdtmPayPeriodStart != null) ? (java.sql.Timestamp) o.fdtmPayPeriodStart.clone() : null;
    o.fdtmPayPeriodEnd = (o.fdtmPayPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmPayPeriodEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomepsoattributes o) throws CloneNotSupportedException {
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmPayPeriodStart = (o.fdtmPayPeriodStart != null) ? (java.sql.Timestamp) o.fdtmPayPeriodStart.clone() : null;
    o.fdtmPayPeriodEnd = (o.fdtmPayPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmPayPeriodEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngRtnPsoVerLast", this.flngRtnPsoVerLast);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("fstrSurname", this.fstrSurname);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrTaxCode", this.fstrTaxCode);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fdtmPayPeriodStart", this.fdtmPayPeriodStart);
    __sqoop$field_map.put("fdtmPayPeriodEnd", this.fdtmPayPeriodEnd);
    __sqoop$field_map.put("fstrPayFrequency", this.fstrPayFrequency);
    __sqoop$field_map.put("fblnPayment", this.fblnPayment);
    __sqoop$field_map.put("fstrCSCode", this.fstrCSCode);
    __sqoop$field_map.put("fcurGross", this.fcurGross);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurEarnings", this.fcurEarnings);
    __sqoop$field_map.put("fcurChildSupport", this.fcurChildSupport);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurKiwiSaverDeductions", this.fcurKiwiSaverDeductions);
    __sqoop$field_map.put("fcurKiwiSaverContributions", this.fcurKiwiSaverContributions);
    __sqoop$field_map.put("fcurTaxCreditsDonations", this.fcurTaxCreditsDonations);
    __sqoop$field_map.put("fcurTaxCreditsExtinguish", this.fcurTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurESCTDeductions", this.fcurESCTDeductions);
    __sqoop$field_map.put("fcurFamilyTaxCredits", this.fcurFamilyTaxCredits);
    __sqoop$field_map.put("fcurHoursPaid", this.fcurHoursPaid);
    __sqoop$field_map.put("fcurSLCIRDedPosting", this.fcurSLCIRDedPosting);
    __sqoop$field_map.put("fcurSLBORDedPosting", this.fcurSLBORDedPosting);
    __sqoop$field_map.put("fcurKSEmployeeContRate", this.fcurKSEmployeeContRate);
    __sqoop$field_map.put("fcurCECPosting", this.fcurCECPosting);
    __sqoop$field_map.put("fcurVECPosting", this.fcurVECPosting);
    __sqoop$field_map.put("fcurESSDedPosting", this.fcurESSDedPosting);
    __sqoop$field_map.put("fcurPriorPeriodGrossAdj", this.fcurPriorPeriodGrossAdj);
    __sqoop$field_map.put("fcurPriorPeriodPAYEAdj", this.fcurPriorPeriodPAYEAdj);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngRtnPsoVerLast", this.flngRtnPsoVerLast);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("fstrSurname", this.fstrSurname);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrTaxCode", this.fstrTaxCode);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fdtmPayPeriodStart", this.fdtmPayPeriodStart);
    __sqoop$field_map.put("fdtmPayPeriodEnd", this.fdtmPayPeriodEnd);
    __sqoop$field_map.put("fstrPayFrequency", this.fstrPayFrequency);
    __sqoop$field_map.put("fblnPayment", this.fblnPayment);
    __sqoop$field_map.put("fstrCSCode", this.fstrCSCode);
    __sqoop$field_map.put("fcurGross", this.fcurGross);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurEarnings", this.fcurEarnings);
    __sqoop$field_map.put("fcurChildSupport", this.fcurChildSupport);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurKiwiSaverDeductions", this.fcurKiwiSaverDeductions);
    __sqoop$field_map.put("fcurKiwiSaverContributions", this.fcurKiwiSaverContributions);
    __sqoop$field_map.put("fcurTaxCreditsDonations", this.fcurTaxCreditsDonations);
    __sqoop$field_map.put("fcurTaxCreditsExtinguish", this.fcurTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurESCTDeductions", this.fcurESCTDeductions);
    __sqoop$field_map.put("fcurFamilyTaxCredits", this.fcurFamilyTaxCredits);
    __sqoop$field_map.put("fcurHoursPaid", this.fcurHoursPaid);
    __sqoop$field_map.put("fcurSLCIRDedPosting", this.fcurSLCIRDedPosting);
    __sqoop$field_map.put("fcurSLBORDedPosting", this.fcurSLBORDedPosting);
    __sqoop$field_map.put("fcurKSEmployeeContRate", this.fcurKSEmployeeContRate);
    __sqoop$field_map.put("fcurCECPosting", this.fcurCECPosting);
    __sqoop$field_map.put("fcurVECPosting", this.fcurVECPosting);
    __sqoop$field_map.put("fcurESSDedPosting", this.fcurESSDedPosting);
    __sqoop$field_map.put("fcurPriorPeriodGrossAdj", this.fcurPriorPeriodGrossAdj);
    __sqoop$field_map.put("fcurPriorPeriodPAYEAdj", this.fcurPriorPeriodPAYEAdj);
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
