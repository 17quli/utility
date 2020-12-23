// ORM class for table 'tblnz_rtnpsoded'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:13:06 NZDT 2020
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

public class tblnz_rtnpsoded extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fstrDLN = (String)value;
      }
    });
    setters.put("fdtmSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fdtmSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmOriginalSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fdtmOriginalSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fdtmLastSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFIRSTCnvError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnFIRSTCnvError = (Integer)value;
      }
    });
    setters.put("fblnFIRSTCnvErrorWorkItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnFIRSTCnvErrorWorkItem = (Integer)value;
      }
    });
    setters.put("fblnFIRSTCnvErrorComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnFIRSTCnvErrorComplete = (Integer)value;
      }
    });
    setters.put("fcurPAYE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurPAYE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurChildSupport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurChildSupport = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurStudentLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurStudentLoan = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurKiwiSaverDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurKiwiSaverDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurKiwiSaverContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurKiwiSaverContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurESCTDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurESCTDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurAmountPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditKiwiSaver", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurTaxCreditKiwiSaver = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditCompliance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fcurTaxCreditCompliance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnElectronicPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnElectronicPayment = (Integer)value;
      }
    });
    setters.put("fblnCorrespondence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnCorrespondence = (Integer)value;
      }
    });
    setters.put("fblnPaymentAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnPaymentAttached = (Integer)value;
      }
    });
    setters.put("fblnPayrollIntermediary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fblnPayrollIntermediary = (Integer)value;
      }
    });
    setters.put("fstrPIIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fstrPIIRDNumber = (String)value;
      }
    });
    setters.put("fdtmPIFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fdtmPIFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPIRecordType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fstrPIRecordType = (String)value;
      }
    });
    setters.put("fstrPIDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fstrPIDLN = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoded.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnpsoded() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnpsoded with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_rtnpsoded with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private java.sql.Timestamp fdtmSentToFIRST;
  public java.sql.Timestamp get_fdtmSentToFIRST() {
    return fdtmSentToFIRST;
  }
  public void set_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
  }
  public tblnz_rtnpsoded with_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
    return this;
  }
  private java.sql.Timestamp fdtmOriginalSentToFIRST;
  public java.sql.Timestamp get_fdtmOriginalSentToFIRST() {
    return fdtmOriginalSentToFIRST;
  }
  public void set_fdtmOriginalSentToFIRST(java.sql.Timestamp fdtmOriginalSentToFIRST) {
    this.fdtmOriginalSentToFIRST = fdtmOriginalSentToFIRST;
  }
  public tblnz_rtnpsoded with_fdtmOriginalSentToFIRST(java.sql.Timestamp fdtmOriginalSentToFIRST) {
    this.fdtmOriginalSentToFIRST = fdtmOriginalSentToFIRST;
    return this;
  }
  private java.sql.Timestamp fdtmLastSentToFIRST;
  public java.sql.Timestamp get_fdtmLastSentToFIRST() {
    return fdtmLastSentToFIRST;
  }
  public void set_fdtmLastSentToFIRST(java.sql.Timestamp fdtmLastSentToFIRST) {
    this.fdtmLastSentToFIRST = fdtmLastSentToFIRST;
  }
  public tblnz_rtnpsoded with_fdtmLastSentToFIRST(java.sql.Timestamp fdtmLastSentToFIRST) {
    this.fdtmLastSentToFIRST = fdtmLastSentToFIRST;
    return this;
  }
  private Integer fblnFIRSTCnvError;
  public Integer get_fblnFIRSTCnvError() {
    return fblnFIRSTCnvError;
  }
  public void set_fblnFIRSTCnvError(Integer fblnFIRSTCnvError) {
    this.fblnFIRSTCnvError = fblnFIRSTCnvError;
  }
  public tblnz_rtnpsoded with_fblnFIRSTCnvError(Integer fblnFIRSTCnvError) {
    this.fblnFIRSTCnvError = fblnFIRSTCnvError;
    return this;
  }
  private Integer fblnFIRSTCnvErrorWorkItem;
  public Integer get_fblnFIRSTCnvErrorWorkItem() {
    return fblnFIRSTCnvErrorWorkItem;
  }
  public void set_fblnFIRSTCnvErrorWorkItem(Integer fblnFIRSTCnvErrorWorkItem) {
    this.fblnFIRSTCnvErrorWorkItem = fblnFIRSTCnvErrorWorkItem;
  }
  public tblnz_rtnpsoded with_fblnFIRSTCnvErrorWorkItem(Integer fblnFIRSTCnvErrorWorkItem) {
    this.fblnFIRSTCnvErrorWorkItem = fblnFIRSTCnvErrorWorkItem;
    return this;
  }
  private Integer fblnFIRSTCnvErrorComplete;
  public Integer get_fblnFIRSTCnvErrorComplete() {
    return fblnFIRSTCnvErrorComplete;
  }
  public void set_fblnFIRSTCnvErrorComplete(Integer fblnFIRSTCnvErrorComplete) {
    this.fblnFIRSTCnvErrorComplete = fblnFIRSTCnvErrorComplete;
  }
  public tblnz_rtnpsoded with_fblnFIRSTCnvErrorComplete(Integer fblnFIRSTCnvErrorComplete) {
    this.fblnFIRSTCnvErrorComplete = fblnFIRSTCnvErrorComplete;
    return this;
  }
  private java.math.BigDecimal fcurPAYE;
  public java.math.BigDecimal get_fcurPAYE() {
    return fcurPAYE;
  }
  public void set_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
  }
  public tblnz_rtnpsoded with_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
    return this;
  }
  private java.math.BigDecimal fcurChildSupport;
  public java.math.BigDecimal get_fcurChildSupport() {
    return fcurChildSupport;
  }
  public void set_fcurChildSupport(java.math.BigDecimal fcurChildSupport) {
    this.fcurChildSupport = fcurChildSupport;
  }
  public tblnz_rtnpsoded with_fcurChildSupport(java.math.BigDecimal fcurChildSupport) {
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
  public tblnz_rtnpsoded with_fcurStudentLoan(java.math.BigDecimal fcurStudentLoan) {
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
  public tblnz_rtnpsoded with_fcurKiwiSaverDeductions(java.math.BigDecimal fcurKiwiSaverDeductions) {
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
  public tblnz_rtnpsoded with_fcurKiwiSaverContributions(java.math.BigDecimal fcurKiwiSaverContributions) {
    this.fcurKiwiSaverContributions = fcurKiwiSaverContributions;
    return this;
  }
  private java.math.BigDecimal fcurESCTDeductions;
  public java.math.BigDecimal get_fcurESCTDeductions() {
    return fcurESCTDeductions;
  }
  public void set_fcurESCTDeductions(java.math.BigDecimal fcurESCTDeductions) {
    this.fcurESCTDeductions = fcurESCTDeductions;
  }
  public tblnz_rtnpsoded with_fcurESCTDeductions(java.math.BigDecimal fcurESCTDeductions) {
    this.fcurESCTDeductions = fcurESCTDeductions;
    return this;
  }
  private java.math.BigDecimal fcurAmountPayable;
  public java.math.BigDecimal get_fcurAmountPayable() {
    return fcurAmountPayable;
  }
  public void set_fcurAmountPayable(java.math.BigDecimal fcurAmountPayable) {
    this.fcurAmountPayable = fcurAmountPayable;
  }
  public tblnz_rtnpsoded with_fcurAmountPayable(java.math.BigDecimal fcurAmountPayable) {
    this.fcurAmountPayable = fcurAmountPayable;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditKiwiSaver;
  public java.math.BigDecimal get_fcurTaxCreditKiwiSaver() {
    return fcurTaxCreditKiwiSaver;
  }
  public void set_fcurTaxCreditKiwiSaver(java.math.BigDecimal fcurTaxCreditKiwiSaver) {
    this.fcurTaxCreditKiwiSaver = fcurTaxCreditKiwiSaver;
  }
  public tblnz_rtnpsoded with_fcurTaxCreditKiwiSaver(java.math.BigDecimal fcurTaxCreditKiwiSaver) {
    this.fcurTaxCreditKiwiSaver = fcurTaxCreditKiwiSaver;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditCompliance;
  public java.math.BigDecimal get_fcurTaxCreditCompliance() {
    return fcurTaxCreditCompliance;
  }
  public void set_fcurTaxCreditCompliance(java.math.BigDecimal fcurTaxCreditCompliance) {
    this.fcurTaxCreditCompliance = fcurTaxCreditCompliance;
  }
  public tblnz_rtnpsoded with_fcurTaxCreditCompliance(java.math.BigDecimal fcurTaxCreditCompliance) {
    this.fcurTaxCreditCompliance = fcurTaxCreditCompliance;
    return this;
  }
  private Integer fblnElectronicPayment;
  public Integer get_fblnElectronicPayment() {
    return fblnElectronicPayment;
  }
  public void set_fblnElectronicPayment(Integer fblnElectronicPayment) {
    this.fblnElectronicPayment = fblnElectronicPayment;
  }
  public tblnz_rtnpsoded with_fblnElectronicPayment(Integer fblnElectronicPayment) {
    this.fblnElectronicPayment = fblnElectronicPayment;
    return this;
  }
  private Integer fblnCorrespondence;
  public Integer get_fblnCorrespondence() {
    return fblnCorrespondence;
  }
  public void set_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
  }
  public tblnz_rtnpsoded with_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
    return this;
  }
  private Integer fblnPaymentAttached;
  public Integer get_fblnPaymentAttached() {
    return fblnPaymentAttached;
  }
  public void set_fblnPaymentAttached(Integer fblnPaymentAttached) {
    this.fblnPaymentAttached = fblnPaymentAttached;
  }
  public tblnz_rtnpsoded with_fblnPaymentAttached(Integer fblnPaymentAttached) {
    this.fblnPaymentAttached = fblnPaymentAttached;
    return this;
  }
  private Integer fblnPayrollIntermediary;
  public Integer get_fblnPayrollIntermediary() {
    return fblnPayrollIntermediary;
  }
  public void set_fblnPayrollIntermediary(Integer fblnPayrollIntermediary) {
    this.fblnPayrollIntermediary = fblnPayrollIntermediary;
  }
  public tblnz_rtnpsoded with_fblnPayrollIntermediary(Integer fblnPayrollIntermediary) {
    this.fblnPayrollIntermediary = fblnPayrollIntermediary;
    return this;
  }
  private String fstrPIIRDNumber;
  public String get_fstrPIIRDNumber() {
    return fstrPIIRDNumber;
  }
  public void set_fstrPIIRDNumber(String fstrPIIRDNumber) {
    this.fstrPIIRDNumber = fstrPIIRDNumber;
  }
  public tblnz_rtnpsoded with_fstrPIIRDNumber(String fstrPIIRDNumber) {
    this.fstrPIIRDNumber = fstrPIIRDNumber;
    return this;
  }
  private java.sql.Timestamp fdtmPIFilingPeriod;
  public java.sql.Timestamp get_fdtmPIFilingPeriod() {
    return fdtmPIFilingPeriod;
  }
  public void set_fdtmPIFilingPeriod(java.sql.Timestamp fdtmPIFilingPeriod) {
    this.fdtmPIFilingPeriod = fdtmPIFilingPeriod;
  }
  public tblnz_rtnpsoded with_fdtmPIFilingPeriod(java.sql.Timestamp fdtmPIFilingPeriod) {
    this.fdtmPIFilingPeriod = fdtmPIFilingPeriod;
    return this;
  }
  private String fstrPIRecordType;
  public String get_fstrPIRecordType() {
    return fstrPIRecordType;
  }
  public void set_fstrPIRecordType(String fstrPIRecordType) {
    this.fstrPIRecordType = fstrPIRecordType;
  }
  public tblnz_rtnpsoded with_fstrPIRecordType(String fstrPIRecordType) {
    this.fstrPIRecordType = fstrPIRecordType;
    return this;
  }
  private String fstrPIDLN;
  public String get_fstrPIDLN() {
    return fstrPIDLN;
  }
  public void set_fstrPIDLN(String fstrPIDLN) {
    this.fstrPIDLN = fstrPIDLN;
  }
  public tblnz_rtnpsoded with_fstrPIDLN(String fstrPIDLN) {
    this.fstrPIDLN = fstrPIDLN;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpsoded with_fstrWho(String fstrWho) {
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
  public tblnz_rtnpsoded with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpsoded)) {
      return false;
    }
    tblnz_rtnpsoded that = (tblnz_rtnpsoded) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fdtmOriginalSentToFIRST == null ? that.fdtmOriginalSentToFIRST == null : this.fdtmOriginalSentToFIRST.equals(that.fdtmOriginalSentToFIRST));
    equal = equal && (this.fdtmLastSentToFIRST == null ? that.fdtmLastSentToFIRST == null : this.fdtmLastSentToFIRST.equals(that.fdtmLastSentToFIRST));
    equal = equal && (this.fblnFIRSTCnvError == null ? that.fblnFIRSTCnvError == null : this.fblnFIRSTCnvError.equals(that.fblnFIRSTCnvError));
    equal = equal && (this.fblnFIRSTCnvErrorWorkItem == null ? that.fblnFIRSTCnvErrorWorkItem == null : this.fblnFIRSTCnvErrorWorkItem.equals(that.fblnFIRSTCnvErrorWorkItem));
    equal = equal && (this.fblnFIRSTCnvErrorComplete == null ? that.fblnFIRSTCnvErrorComplete == null : this.fblnFIRSTCnvErrorComplete.equals(that.fblnFIRSTCnvErrorComplete));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurChildSupport == null ? that.fcurChildSupport == null : this.fcurChildSupport.equals(that.fcurChildSupport));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurKiwiSaverDeductions == null ? that.fcurKiwiSaverDeductions == null : this.fcurKiwiSaverDeductions.equals(that.fcurKiwiSaverDeductions));
    equal = equal && (this.fcurKiwiSaverContributions == null ? that.fcurKiwiSaverContributions == null : this.fcurKiwiSaverContributions.equals(that.fcurKiwiSaverContributions));
    equal = equal && (this.fcurESCTDeductions == null ? that.fcurESCTDeductions == null : this.fcurESCTDeductions.equals(that.fcurESCTDeductions));
    equal = equal && (this.fcurAmountPayable == null ? that.fcurAmountPayable == null : this.fcurAmountPayable.equals(that.fcurAmountPayable));
    equal = equal && (this.fcurTaxCreditKiwiSaver == null ? that.fcurTaxCreditKiwiSaver == null : this.fcurTaxCreditKiwiSaver.equals(that.fcurTaxCreditKiwiSaver));
    equal = equal && (this.fcurTaxCreditCompliance == null ? that.fcurTaxCreditCompliance == null : this.fcurTaxCreditCompliance.equals(that.fcurTaxCreditCompliance));
    equal = equal && (this.fblnElectronicPayment == null ? that.fblnElectronicPayment == null : this.fblnElectronicPayment.equals(that.fblnElectronicPayment));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnPaymentAttached == null ? that.fblnPaymentAttached == null : this.fblnPaymentAttached.equals(that.fblnPaymentAttached));
    equal = equal && (this.fblnPayrollIntermediary == null ? that.fblnPayrollIntermediary == null : this.fblnPayrollIntermediary.equals(that.fblnPayrollIntermediary));
    equal = equal && (this.fstrPIIRDNumber == null ? that.fstrPIIRDNumber == null : this.fstrPIIRDNumber.equals(that.fstrPIIRDNumber));
    equal = equal && (this.fdtmPIFilingPeriod == null ? that.fdtmPIFilingPeriod == null : this.fdtmPIFilingPeriod.equals(that.fdtmPIFilingPeriod));
    equal = equal && (this.fstrPIRecordType == null ? that.fstrPIRecordType == null : this.fstrPIRecordType.equals(that.fstrPIRecordType));
    equal = equal && (this.fstrPIDLN == null ? that.fstrPIDLN == null : this.fstrPIDLN.equals(that.fstrPIDLN));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpsoded)) {
      return false;
    }
    tblnz_rtnpsoded that = (tblnz_rtnpsoded) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fdtmOriginalSentToFIRST == null ? that.fdtmOriginalSentToFIRST == null : this.fdtmOriginalSentToFIRST.equals(that.fdtmOriginalSentToFIRST));
    equal = equal && (this.fdtmLastSentToFIRST == null ? that.fdtmLastSentToFIRST == null : this.fdtmLastSentToFIRST.equals(that.fdtmLastSentToFIRST));
    equal = equal && (this.fblnFIRSTCnvError == null ? that.fblnFIRSTCnvError == null : this.fblnFIRSTCnvError.equals(that.fblnFIRSTCnvError));
    equal = equal && (this.fblnFIRSTCnvErrorWorkItem == null ? that.fblnFIRSTCnvErrorWorkItem == null : this.fblnFIRSTCnvErrorWorkItem.equals(that.fblnFIRSTCnvErrorWorkItem));
    equal = equal && (this.fblnFIRSTCnvErrorComplete == null ? that.fblnFIRSTCnvErrorComplete == null : this.fblnFIRSTCnvErrorComplete.equals(that.fblnFIRSTCnvErrorComplete));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurChildSupport == null ? that.fcurChildSupport == null : this.fcurChildSupport.equals(that.fcurChildSupport));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurKiwiSaverDeductions == null ? that.fcurKiwiSaverDeductions == null : this.fcurKiwiSaverDeductions.equals(that.fcurKiwiSaverDeductions));
    equal = equal && (this.fcurKiwiSaverContributions == null ? that.fcurKiwiSaverContributions == null : this.fcurKiwiSaverContributions.equals(that.fcurKiwiSaverContributions));
    equal = equal && (this.fcurESCTDeductions == null ? that.fcurESCTDeductions == null : this.fcurESCTDeductions.equals(that.fcurESCTDeductions));
    equal = equal && (this.fcurAmountPayable == null ? that.fcurAmountPayable == null : this.fcurAmountPayable.equals(that.fcurAmountPayable));
    equal = equal && (this.fcurTaxCreditKiwiSaver == null ? that.fcurTaxCreditKiwiSaver == null : this.fcurTaxCreditKiwiSaver.equals(that.fcurTaxCreditKiwiSaver));
    equal = equal && (this.fcurTaxCreditCompliance == null ? that.fcurTaxCreditCompliance == null : this.fcurTaxCreditCompliance.equals(that.fcurTaxCreditCompliance));
    equal = equal && (this.fblnElectronicPayment == null ? that.fblnElectronicPayment == null : this.fblnElectronicPayment.equals(that.fblnElectronicPayment));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnPaymentAttached == null ? that.fblnPaymentAttached == null : this.fblnPaymentAttached.equals(that.fblnPaymentAttached));
    equal = equal && (this.fblnPayrollIntermediary == null ? that.fblnPayrollIntermediary == null : this.fblnPayrollIntermediary.equals(that.fblnPayrollIntermediary));
    equal = equal && (this.fstrPIIRDNumber == null ? that.fstrPIIRDNumber == null : this.fstrPIIRDNumber.equals(that.fstrPIIRDNumber));
    equal = equal && (this.fdtmPIFilingPeriod == null ? that.fdtmPIFilingPeriod == null : this.fdtmPIFilingPeriod.equals(that.fdtmPIFilingPeriod));
    equal = equal && (this.fstrPIRecordType == null ? that.fstrPIRecordType == null : this.fstrPIRecordType.equals(that.fstrPIRecordType));
    equal = equal && (this.fstrPIDLN == null ? that.fstrPIDLN == null : this.fstrPIDLN.equals(that.fstrPIDLN));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmOriginalSentToFIRST = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmLastSentToFIRST = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fblnFIRSTCnvError = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnFIRSTCnvErrorWorkItem = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnFIRSTCnvErrorComplete = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurChildSupport = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurESCTDeductions = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAmountPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTaxCreditKiwiSaver = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTaxCreditCompliance = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnElectronicPayment = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnPaymentAttached = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnPayrollIntermediary = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrPIIRDNumber = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmPIFilingPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPIRecordType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPIDLN = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmOriginalSentToFIRST = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmLastSentToFIRST = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fblnFIRSTCnvError = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnFIRSTCnvErrorWorkItem = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnFIRSTCnvErrorComplete = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurChildSupport = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurESCTDeductions = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurAmountPayable = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTaxCreditKiwiSaver = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTaxCreditCompliance = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnElectronicPayment = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnPaymentAttached = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnPayrollIntermediary = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrPIIRDNumber = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmPIFilingPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPIRecordType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPIDLN = JdbcWritableBridge.readString(25, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOriginalSentToFIRST, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastSentToFIRST, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvError, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorWorkItem, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorComplete, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupport, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverDeductions, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverContributions, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTDeductions, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditKiwiSaver, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditCompliance, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicPayment, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentAttached, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayrollIntermediary, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIIRDNumber, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPIFilingPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIRecordType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIDLN, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOriginalSentToFIRST, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastSentToFIRST, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvError, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorWorkItem, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorComplete, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurChildSupport, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverDeductions, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurKiwiSaverContributions, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTDeductions, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPayable, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditKiwiSaver, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditCompliance, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicPayment, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentAttached, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayrollIntermediary, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIIRDNumber, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPIFilingPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIRecordType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIDLN, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
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
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSentToFIRST = null;
    } else {
    this.fdtmSentToFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmSentToFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmOriginalSentToFIRST = null;
    } else {
    this.fdtmOriginalSentToFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmOriginalSentToFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastSentToFIRST = null;
    } else {
    this.fdtmLastSentToFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmLastSentToFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFIRSTCnvError = null;
    } else {
    this.fblnFIRSTCnvError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFIRSTCnvErrorWorkItem = null;
    } else {
    this.fblnFIRSTCnvErrorWorkItem = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFIRSTCnvErrorComplete = null;
    } else {
    this.fblnFIRSTCnvErrorComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPAYE = null;
    } else {
    this.fcurPAYE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurESCTDeductions = null;
    } else {
    this.fcurESCTDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountPayable = null;
    } else {
    this.fcurAmountPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditKiwiSaver = null;
    } else {
    this.fcurTaxCreditKiwiSaver = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditCompliance = null;
    } else {
    this.fcurTaxCreditCompliance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnElectronicPayment = null;
    } else {
    this.fblnElectronicPayment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCorrespondence = null;
    } else {
    this.fblnCorrespondence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPaymentAttached = null;
    } else {
    this.fblnPaymentAttached = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPayrollIntermediary = null;
    } else {
    this.fblnPayrollIntermediary = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPIIRDNumber = null;
    } else {
    this.fstrPIIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPIFilingPeriod = null;
    } else {
    this.fdtmPIFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPIFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPIRecordType = null;
    } else {
    this.fstrPIRecordType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPIDLN = null;
    } else {
    this.fstrPIDLN = Text.readString(__dataIn);
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
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.fdtmOriginalSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOriginalSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmOriginalSentToFIRST.getNanos());
    }
    if (null == this.fdtmLastSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmLastSentToFIRST.getNanos());
    }
    if (null == this.fblnFIRSTCnvError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvError);
    }
    if (null == this.fblnFIRSTCnvErrorWorkItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvErrorWorkItem);
    }
    if (null == this.fblnFIRSTCnvErrorComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvErrorComplete);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
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
    if (null == this.fcurESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTDeductions, __dataOut);
    }
    if (null == this.fcurAmountPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPayable, __dataOut);
    }
    if (null == this.fcurTaxCreditKiwiSaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditKiwiSaver, __dataOut);
    }
    if (null == this.fcurTaxCreditCompliance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditCompliance, __dataOut);
    }
    if (null == this.fblnElectronicPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicPayment);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnPaymentAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaymentAttached);
    }
    if (null == this.fblnPayrollIntermediary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayrollIntermediary);
    }
    if (null == this.fstrPIIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIIRDNumber);
    }
    if (null == this.fdtmPIFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPIFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmPIFilingPeriod.getNanos());
    }
    if (null == this.fstrPIRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIRecordType);
    }
    if (null == this.fstrPIDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIDLN);
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
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.fdtmOriginalSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOriginalSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmOriginalSentToFIRST.getNanos());
    }
    if (null == this.fdtmLastSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmLastSentToFIRST.getNanos());
    }
    if (null == this.fblnFIRSTCnvError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvError);
    }
    if (null == this.fblnFIRSTCnvErrorWorkItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvErrorWorkItem);
    }
    if (null == this.fblnFIRSTCnvErrorComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTCnvErrorComplete);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
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
    if (null == this.fcurESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTDeductions, __dataOut);
    }
    if (null == this.fcurAmountPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPayable, __dataOut);
    }
    if (null == this.fcurTaxCreditKiwiSaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditKiwiSaver, __dataOut);
    }
    if (null == this.fcurTaxCreditCompliance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditCompliance, __dataOut);
    }
    if (null == this.fblnElectronicPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicPayment);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fblnPaymentAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaymentAttached);
    }
    if (null == this.fblnPayrollIntermediary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayrollIntermediary);
    }
    if (null == this.fstrPIIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIIRDNumber);
    }
    if (null == this.fdtmPIFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPIFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmPIFilingPeriod.getNanos());
    }
    if (null == this.fstrPIRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIRecordType);
    }
    if (null == this.fstrPIDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIDLN);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOriginalSentToFIRST==null?"\\N":"" + fdtmOriginalSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastSentToFIRST==null?"\\N":"" + fdtmLastSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvError==null?"\\N":"" + fblnFIRSTCnvError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvErrorWorkItem==null?"\\N":"" + fblnFIRSTCnvErrorWorkItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvErrorComplete==null?"\\N":"" + fblnFIRSTCnvErrorComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupport==null?"\\N":fcurChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverDeductions==null?"\\N":fcurKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverContributions==null?"\\N":fcurKiwiSaverContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTDeductions==null?"\\N":fcurESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPayable==null?"\\N":fcurAmountPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditKiwiSaver==null?"\\N":fcurTaxCreditKiwiSaver.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditCompliance==null?"\\N":fcurTaxCreditCompliance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicPayment==null?"\\N":"" + fblnElectronicPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentAttached==null?"\\N":"" + fblnPaymentAttached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayrollIntermediary==null?"\\N":"" + fblnPayrollIntermediary, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIIRDNumber==null?"\\N":fstrPIIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPIFilingPeriod==null?"\\N":"" + fdtmPIFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIRecordType==null?"\\N":fstrPIRecordType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIDLN==null?"\\N":fstrPIDLN, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOriginalSentToFIRST==null?"\\N":"" + fdtmOriginalSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastSentToFIRST==null?"\\N":"" + fdtmLastSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvError==null?"\\N":"" + fblnFIRSTCnvError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvErrorWorkItem==null?"\\N":"" + fblnFIRSTCnvErrorWorkItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTCnvErrorComplete==null?"\\N":"" + fblnFIRSTCnvErrorComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurChildSupport==null?"\\N":fcurChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverDeductions==null?"\\N":fcurKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurKiwiSaverContributions==null?"\\N":fcurKiwiSaverContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTDeductions==null?"\\N":fcurESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPayable==null?"\\N":fcurAmountPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditKiwiSaver==null?"\\N":fcurTaxCreditKiwiSaver.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditCompliance==null?"\\N":fcurTaxCreditCompliance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicPayment==null?"\\N":"" + fblnElectronicPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentAttached==null?"\\N":"" + fblnPaymentAttached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayrollIntermediary==null?"\\N":"" + fblnPayrollIntermediary, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIIRDNumber==null?"\\N":fstrPIIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPIFilingPeriod==null?"\\N":"" + fdtmPIFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIRecordType==null?"\\N":fstrPIRecordType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIDLN==null?"\\N":fstrPIDLN, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOriginalSentToFIRST = null; } else {
      this.fdtmOriginalSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastSentToFIRST = null; } else {
      this.fdtmLastSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvError = null; } else {
      this.fblnFIRSTCnvError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvErrorWorkItem = null; } else {
      this.fblnFIRSTCnvErrorWorkItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvErrorComplete = null; } else {
      this.fblnFIRSTCnvErrorComplete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTDeductions = null; } else {
      this.fcurESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPayable = null; } else {
      this.fcurAmountPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditKiwiSaver = null; } else {
      this.fcurTaxCreditKiwiSaver = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditCompliance = null; } else {
      this.fcurTaxCreditCompliance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicPayment = null; } else {
      this.fblnElectronicPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaymentAttached = null; } else {
      this.fblnPaymentAttached = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayrollIntermediary = null; } else {
      this.fblnPayrollIntermediary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIIRDNumber = null; } else {
      this.fstrPIIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPIFilingPeriod = null; } else {
      this.fdtmPIFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIRecordType = null; } else {
      this.fstrPIRecordType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIDLN = null; } else {
      this.fstrPIDLN = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOriginalSentToFIRST = null; } else {
      this.fdtmOriginalSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastSentToFIRST = null; } else {
      this.fdtmLastSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvError = null; } else {
      this.fblnFIRSTCnvError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvErrorWorkItem = null; } else {
      this.fblnFIRSTCnvErrorWorkItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTCnvErrorComplete = null; } else {
      this.fblnFIRSTCnvErrorComplete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTDeductions = null; } else {
      this.fcurESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPayable = null; } else {
      this.fcurAmountPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditKiwiSaver = null; } else {
      this.fcurTaxCreditKiwiSaver = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditCompliance = null; } else {
      this.fcurTaxCreditCompliance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicPayment = null; } else {
      this.fblnElectronicPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCorrespondence = null; } else {
      this.fblnCorrespondence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaymentAttached = null; } else {
      this.fblnPaymentAttached = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayrollIntermediary = null; } else {
      this.fblnPayrollIntermediary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIIRDNumber = null; } else {
      this.fstrPIIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPIFilingPeriod = null; } else {
      this.fdtmPIFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIRecordType = null; } else {
      this.fstrPIRecordType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPIDLN = null; } else {
      this.fstrPIDLN = __cur_str;
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
    tblnz_rtnpsoded o = (tblnz_rtnpsoded) super.clone();
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmOriginalSentToFIRST = (o.fdtmOriginalSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmOriginalSentToFIRST.clone() : null;
    o.fdtmLastSentToFIRST = (o.fdtmLastSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmLastSentToFIRST.clone() : null;
    o.fdtmPIFilingPeriod = (o.fdtmPIFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmPIFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpsoded o) throws CloneNotSupportedException {
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmOriginalSentToFIRST = (o.fdtmOriginalSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmOriginalSentToFIRST.clone() : null;
    o.fdtmLastSentToFIRST = (o.fdtmLastSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmLastSentToFIRST.clone() : null;
    o.fdtmPIFilingPeriod = (o.fdtmPIFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmPIFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fdtmOriginalSentToFIRST", this.fdtmOriginalSentToFIRST);
    __sqoop$field_map.put("fdtmLastSentToFIRST", this.fdtmLastSentToFIRST);
    __sqoop$field_map.put("fblnFIRSTCnvError", this.fblnFIRSTCnvError);
    __sqoop$field_map.put("fblnFIRSTCnvErrorWorkItem", this.fblnFIRSTCnvErrorWorkItem);
    __sqoop$field_map.put("fblnFIRSTCnvErrorComplete", this.fblnFIRSTCnvErrorComplete);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurChildSupport", this.fcurChildSupport);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurKiwiSaverDeductions", this.fcurKiwiSaverDeductions);
    __sqoop$field_map.put("fcurKiwiSaverContributions", this.fcurKiwiSaverContributions);
    __sqoop$field_map.put("fcurESCTDeductions", this.fcurESCTDeductions);
    __sqoop$field_map.put("fcurAmountPayable", this.fcurAmountPayable);
    __sqoop$field_map.put("fcurTaxCreditKiwiSaver", this.fcurTaxCreditKiwiSaver);
    __sqoop$field_map.put("fcurTaxCreditCompliance", this.fcurTaxCreditCompliance);
    __sqoop$field_map.put("fblnElectronicPayment", this.fblnElectronicPayment);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnPaymentAttached", this.fblnPaymentAttached);
    __sqoop$field_map.put("fblnPayrollIntermediary", this.fblnPayrollIntermediary);
    __sqoop$field_map.put("fstrPIIRDNumber", this.fstrPIIRDNumber);
    __sqoop$field_map.put("fdtmPIFilingPeriod", this.fdtmPIFilingPeriod);
    __sqoop$field_map.put("fstrPIRecordType", this.fstrPIRecordType);
    __sqoop$field_map.put("fstrPIDLN", this.fstrPIDLN);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fdtmOriginalSentToFIRST", this.fdtmOriginalSentToFIRST);
    __sqoop$field_map.put("fdtmLastSentToFIRST", this.fdtmLastSentToFIRST);
    __sqoop$field_map.put("fblnFIRSTCnvError", this.fblnFIRSTCnvError);
    __sqoop$field_map.put("fblnFIRSTCnvErrorWorkItem", this.fblnFIRSTCnvErrorWorkItem);
    __sqoop$field_map.put("fblnFIRSTCnvErrorComplete", this.fblnFIRSTCnvErrorComplete);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurChildSupport", this.fcurChildSupport);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurKiwiSaverDeductions", this.fcurKiwiSaverDeductions);
    __sqoop$field_map.put("fcurKiwiSaverContributions", this.fcurKiwiSaverContributions);
    __sqoop$field_map.put("fcurESCTDeductions", this.fcurESCTDeductions);
    __sqoop$field_map.put("fcurAmountPayable", this.fcurAmountPayable);
    __sqoop$field_map.put("fcurTaxCreditKiwiSaver", this.fcurTaxCreditKiwiSaver);
    __sqoop$field_map.put("fcurTaxCreditCompliance", this.fcurTaxCreditCompliance);
    __sqoop$field_map.put("fblnElectronicPayment", this.fblnElectronicPayment);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnPaymentAttached", this.fblnPaymentAttached);
    __sqoop$field_map.put("fblnPayrollIntermediary", this.fblnPayrollIntermediary);
    __sqoop$field_map.put("fstrPIIRDNumber", this.fstrPIIRDNumber);
    __sqoop$field_map.put("fdtmPIFilingPeriod", this.fdtmPIFilingPeriod);
    __sqoop$field_map.put("fstrPIRecordType", this.fstrPIRecordType);
    __sqoop$field_map.put("fstrPIDLN", this.fstrPIDLN);
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
