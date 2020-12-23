// ORM class for table 'tblnz_rtnpsoemployeesummary'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:26:53 NZDT 2020
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

public class tblnz_rtnpsoemployeesummary extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngSubmissionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.flngSubmissionKey = (Integer)value;
      }
    });
    setters.put("flngFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.flngFileKey = (Integer)value;
      }
    });
    setters.put("flngHeaderNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.flngHeaderNumber = (Integer)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrDLN = (String)value;
      }
    });
    setters.put("fdtmSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmOriginalSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmOriginalSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmLastSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFIRSTCnvError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnFIRSTCnvError = (Integer)value;
      }
    });
    setters.put("fblnFIRSTCnvErrorWorkItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnFIRSTCnvErrorWorkItem = (Integer)value;
      }
    });
    setters.put("fblnFIRSTCnvErrorComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnFIRSTCnvErrorComplete = (Integer)value;
      }
    });
    setters.put("fcurTotalGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalEarnings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalEarnings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPAYE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalPAYE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalChildSupport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalChildSupport = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalStudentLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalStudentLoan = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalKiwiSaverDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalKiwiSaverDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalKiwiSaverContribution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalKiwiSaverContribution = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalESCTDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalESCTDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAmountPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalAmountPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCreditsDonations", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalTaxCreditsDonations = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCreditsExtinguish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalTaxCreditsExtinguish = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalFamilyTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalFamilyTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurESCTAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurESCTAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurESCTKiwiSaver", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurESCTKiwiSaver = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCompEmployerCont", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalCompEmployerCont = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalVoluntaryEmployerCont", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalVoluntaryEmployerCont = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalSLCIRDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalSLCIRDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalSLBORDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalSLBORDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalESSEarnings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalESSEarnings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPriorPeriodGrossAdj", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalPriorPeriodGrossAdj = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPriorPeriodPAYEAdj", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurTotalPriorPeriodPAYEAdj = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMaximumEarnings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fcurMaximumEarnings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPIIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrPIIRDNumber = (String)value;
      }
    });
    setters.put("fstrContactPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrContactPhoneNumber = (String)value;
      }
    });
    setters.put("fstrContactName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrContactName = (String)value;
      }
    });
    setters.put("fstrPayrollPackage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrPayrollPackage = (String)value;
      }
    });
    setters.put("fstrPayrollContactEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrPayrollContactEmail = (String)value;
      }
    });
    setters.put("fblnCorrespondence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnCorrespondence = (Integer)value;
      }
    });
    setters.put("fblnPaymentAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnPaymentAttached = (Integer)value;
      }
    });
    setters.put("fblnPayDayFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnPayDayFiler = (Integer)value;
      }
    });
    setters.put("fdtmPayDayPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmPayDayPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPayDayDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmPayDayDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmMonthlyDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmMonthlyDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmConsolidationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmConsolidationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnMSD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnMSD = (Integer)value;
      }
    });
    setters.put("fblnDuplicate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnDuplicate = (Integer)value;
      }
    });
    setters.put("fblnDuplicateLineItems", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnDuplicateLineItems = (Integer)value;
      }
    });
    setters.put("fblnLineItemsProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnLineItemsProcessed = (Integer)value;
      }
    });
    setters.put("fblnProxyFieldsExpected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnProxyFieldsExpected = (Integer)value;
      }
    });
    setters.put("fblnDefaultAssessment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fblnDefaultAssessment = (Integer)value;
      }
    });
    setters.put("fstrEmployerGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrEmployerGroup = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpsoemployeesummary.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnpsoemployeesummary() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnpsoemployeesummary with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngSubmissionKey;
  public Integer get_flngSubmissionKey() {
    return flngSubmissionKey;
  }
  public void set_flngSubmissionKey(Integer flngSubmissionKey) {
    this.flngSubmissionKey = flngSubmissionKey;
  }
  public tblnz_rtnpsoemployeesummary with_flngSubmissionKey(Integer flngSubmissionKey) {
    this.flngSubmissionKey = flngSubmissionKey;
    return this;
  }
  private Integer flngFileKey;
  public Integer get_flngFileKey() {
    return flngFileKey;
  }
  public void set_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
  }
  public tblnz_rtnpsoemployeesummary with_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
    return this;
  }
  private Integer flngHeaderNumber;
  public Integer get_flngHeaderNumber() {
    return flngHeaderNumber;
  }
  public void set_flngHeaderNumber(Integer flngHeaderNumber) {
    this.flngHeaderNumber = flngHeaderNumber;
  }
  public tblnz_rtnpsoemployeesummary with_flngHeaderNumber(Integer flngHeaderNumber) {
    this.flngHeaderNumber = flngHeaderNumber;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblnz_rtnpsoemployeesummary with_fstrDLN(String fstrDLN) {
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
  public tblnz_rtnpsoemployeesummary with_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
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
  public tblnz_rtnpsoemployeesummary with_fdtmOriginalSentToFIRST(java.sql.Timestamp fdtmOriginalSentToFIRST) {
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
  public tblnz_rtnpsoemployeesummary with_fdtmLastSentToFIRST(java.sql.Timestamp fdtmLastSentToFIRST) {
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
  public tblnz_rtnpsoemployeesummary with_fblnFIRSTCnvError(Integer fblnFIRSTCnvError) {
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
  public tblnz_rtnpsoemployeesummary with_fblnFIRSTCnvErrorWorkItem(Integer fblnFIRSTCnvErrorWorkItem) {
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
  public tblnz_rtnpsoemployeesummary with_fblnFIRSTCnvErrorComplete(Integer fblnFIRSTCnvErrorComplete) {
    this.fblnFIRSTCnvErrorComplete = fblnFIRSTCnvErrorComplete;
    return this;
  }
  private java.math.BigDecimal fcurTotalGross;
  public java.math.BigDecimal get_fcurTotalGross() {
    return fcurTotalGross;
  }
  public void set_fcurTotalGross(java.math.BigDecimal fcurTotalGross) {
    this.fcurTotalGross = fcurTotalGross;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalGross(java.math.BigDecimal fcurTotalGross) {
    this.fcurTotalGross = fcurTotalGross;
    return this;
  }
  private java.math.BigDecimal fcurTotalEarnings;
  public java.math.BigDecimal get_fcurTotalEarnings() {
    return fcurTotalEarnings;
  }
  public void set_fcurTotalEarnings(java.math.BigDecimal fcurTotalEarnings) {
    this.fcurTotalEarnings = fcurTotalEarnings;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalEarnings(java.math.BigDecimal fcurTotalEarnings) {
    this.fcurTotalEarnings = fcurTotalEarnings;
    return this;
  }
  private java.math.BigDecimal fcurTotalPAYE;
  public java.math.BigDecimal get_fcurTotalPAYE() {
    return fcurTotalPAYE;
  }
  public void set_fcurTotalPAYE(java.math.BigDecimal fcurTotalPAYE) {
    this.fcurTotalPAYE = fcurTotalPAYE;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalPAYE(java.math.BigDecimal fcurTotalPAYE) {
    this.fcurTotalPAYE = fcurTotalPAYE;
    return this;
  }
  private java.math.BigDecimal fcurTotalChildSupport;
  public java.math.BigDecimal get_fcurTotalChildSupport() {
    return fcurTotalChildSupport;
  }
  public void set_fcurTotalChildSupport(java.math.BigDecimal fcurTotalChildSupport) {
    this.fcurTotalChildSupport = fcurTotalChildSupport;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalChildSupport(java.math.BigDecimal fcurTotalChildSupport) {
    this.fcurTotalChildSupport = fcurTotalChildSupport;
    return this;
  }
  private java.math.BigDecimal fcurTotalStudentLoan;
  public java.math.BigDecimal get_fcurTotalStudentLoan() {
    return fcurTotalStudentLoan;
  }
  public void set_fcurTotalStudentLoan(java.math.BigDecimal fcurTotalStudentLoan) {
    this.fcurTotalStudentLoan = fcurTotalStudentLoan;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalStudentLoan(java.math.BigDecimal fcurTotalStudentLoan) {
    this.fcurTotalStudentLoan = fcurTotalStudentLoan;
    return this;
  }
  private java.math.BigDecimal fcurTotalKiwiSaverDeductions;
  public java.math.BigDecimal get_fcurTotalKiwiSaverDeductions() {
    return fcurTotalKiwiSaverDeductions;
  }
  public void set_fcurTotalKiwiSaverDeductions(java.math.BigDecimal fcurTotalKiwiSaverDeductions) {
    this.fcurTotalKiwiSaverDeductions = fcurTotalKiwiSaverDeductions;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalKiwiSaverDeductions(java.math.BigDecimal fcurTotalKiwiSaverDeductions) {
    this.fcurTotalKiwiSaverDeductions = fcurTotalKiwiSaverDeductions;
    return this;
  }
  private java.math.BigDecimal fcurTotalKiwiSaverContribution;
  public java.math.BigDecimal get_fcurTotalKiwiSaverContribution() {
    return fcurTotalKiwiSaverContribution;
  }
  public void set_fcurTotalKiwiSaverContribution(java.math.BigDecimal fcurTotalKiwiSaverContribution) {
    this.fcurTotalKiwiSaverContribution = fcurTotalKiwiSaverContribution;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalKiwiSaverContribution(java.math.BigDecimal fcurTotalKiwiSaverContribution) {
    this.fcurTotalKiwiSaverContribution = fcurTotalKiwiSaverContribution;
    return this;
  }
  private java.math.BigDecimal fcurTotalESCTDeductions;
  public java.math.BigDecimal get_fcurTotalESCTDeductions() {
    return fcurTotalESCTDeductions;
  }
  public void set_fcurTotalESCTDeductions(java.math.BigDecimal fcurTotalESCTDeductions) {
    this.fcurTotalESCTDeductions = fcurTotalESCTDeductions;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalESCTDeductions(java.math.BigDecimal fcurTotalESCTDeductions) {
    this.fcurTotalESCTDeductions = fcurTotalESCTDeductions;
    return this;
  }
  private java.math.BigDecimal fcurTotalAmountPayable;
  public java.math.BigDecimal get_fcurTotalAmountPayable() {
    return fcurTotalAmountPayable;
  }
  public void set_fcurTotalAmountPayable(java.math.BigDecimal fcurTotalAmountPayable) {
    this.fcurTotalAmountPayable = fcurTotalAmountPayable;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalAmountPayable(java.math.BigDecimal fcurTotalAmountPayable) {
    this.fcurTotalAmountPayable = fcurTotalAmountPayable;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCreditsDonations;
  public java.math.BigDecimal get_fcurTotalTaxCreditsDonations() {
    return fcurTotalTaxCreditsDonations;
  }
  public void set_fcurTotalTaxCreditsDonations(java.math.BigDecimal fcurTotalTaxCreditsDonations) {
    this.fcurTotalTaxCreditsDonations = fcurTotalTaxCreditsDonations;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalTaxCreditsDonations(java.math.BigDecimal fcurTotalTaxCreditsDonations) {
    this.fcurTotalTaxCreditsDonations = fcurTotalTaxCreditsDonations;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCreditsExtinguish;
  public java.math.BigDecimal get_fcurTotalTaxCreditsExtinguish() {
    return fcurTotalTaxCreditsExtinguish;
  }
  public void set_fcurTotalTaxCreditsExtinguish(java.math.BigDecimal fcurTotalTaxCreditsExtinguish) {
    this.fcurTotalTaxCreditsExtinguish = fcurTotalTaxCreditsExtinguish;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalTaxCreditsExtinguish(java.math.BigDecimal fcurTotalTaxCreditsExtinguish) {
    this.fcurTotalTaxCreditsExtinguish = fcurTotalTaxCreditsExtinguish;
    return this;
  }
  private java.math.BigDecimal fcurTotalFamilyTaxCredits;
  public java.math.BigDecimal get_fcurTotalFamilyTaxCredits() {
    return fcurTotalFamilyTaxCredits;
  }
  public void set_fcurTotalFamilyTaxCredits(java.math.BigDecimal fcurTotalFamilyTaxCredits) {
    this.fcurTotalFamilyTaxCredits = fcurTotalFamilyTaxCredits;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalFamilyTaxCredits(java.math.BigDecimal fcurTotalFamilyTaxCredits) {
    this.fcurTotalFamilyTaxCredits = fcurTotalFamilyTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurESCTAdjustments;
  public java.math.BigDecimal get_fcurESCTAdjustments() {
    return fcurESCTAdjustments;
  }
  public void set_fcurESCTAdjustments(java.math.BigDecimal fcurESCTAdjustments) {
    this.fcurESCTAdjustments = fcurESCTAdjustments;
  }
  public tblnz_rtnpsoemployeesummary with_fcurESCTAdjustments(java.math.BigDecimal fcurESCTAdjustments) {
    this.fcurESCTAdjustments = fcurESCTAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurESCTKiwiSaver;
  public java.math.BigDecimal get_fcurESCTKiwiSaver() {
    return fcurESCTKiwiSaver;
  }
  public void set_fcurESCTKiwiSaver(java.math.BigDecimal fcurESCTKiwiSaver) {
    this.fcurESCTKiwiSaver = fcurESCTKiwiSaver;
  }
  public tblnz_rtnpsoemployeesummary with_fcurESCTKiwiSaver(java.math.BigDecimal fcurESCTKiwiSaver) {
    this.fcurESCTKiwiSaver = fcurESCTKiwiSaver;
    return this;
  }
  private java.math.BigDecimal fcurTotalCompEmployerCont;
  public java.math.BigDecimal get_fcurTotalCompEmployerCont() {
    return fcurTotalCompEmployerCont;
  }
  public void set_fcurTotalCompEmployerCont(java.math.BigDecimal fcurTotalCompEmployerCont) {
    this.fcurTotalCompEmployerCont = fcurTotalCompEmployerCont;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalCompEmployerCont(java.math.BigDecimal fcurTotalCompEmployerCont) {
    this.fcurTotalCompEmployerCont = fcurTotalCompEmployerCont;
    return this;
  }
  private java.math.BigDecimal fcurTotalVoluntaryEmployerCont;
  public java.math.BigDecimal get_fcurTotalVoluntaryEmployerCont() {
    return fcurTotalVoluntaryEmployerCont;
  }
  public void set_fcurTotalVoluntaryEmployerCont(java.math.BigDecimal fcurTotalVoluntaryEmployerCont) {
    this.fcurTotalVoluntaryEmployerCont = fcurTotalVoluntaryEmployerCont;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalVoluntaryEmployerCont(java.math.BigDecimal fcurTotalVoluntaryEmployerCont) {
    this.fcurTotalVoluntaryEmployerCont = fcurTotalVoluntaryEmployerCont;
    return this;
  }
  private java.math.BigDecimal fcurTotalSLCIRDeductions;
  public java.math.BigDecimal get_fcurTotalSLCIRDeductions() {
    return fcurTotalSLCIRDeductions;
  }
  public void set_fcurTotalSLCIRDeductions(java.math.BigDecimal fcurTotalSLCIRDeductions) {
    this.fcurTotalSLCIRDeductions = fcurTotalSLCIRDeductions;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalSLCIRDeductions(java.math.BigDecimal fcurTotalSLCIRDeductions) {
    this.fcurTotalSLCIRDeductions = fcurTotalSLCIRDeductions;
    return this;
  }
  private java.math.BigDecimal fcurTotalSLBORDeductions;
  public java.math.BigDecimal get_fcurTotalSLBORDeductions() {
    return fcurTotalSLBORDeductions;
  }
  public void set_fcurTotalSLBORDeductions(java.math.BigDecimal fcurTotalSLBORDeductions) {
    this.fcurTotalSLBORDeductions = fcurTotalSLBORDeductions;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalSLBORDeductions(java.math.BigDecimal fcurTotalSLBORDeductions) {
    this.fcurTotalSLBORDeductions = fcurTotalSLBORDeductions;
    return this;
  }
  private java.math.BigDecimal fcurTotalESSEarnings;
  public java.math.BigDecimal get_fcurTotalESSEarnings() {
    return fcurTotalESSEarnings;
  }
  public void set_fcurTotalESSEarnings(java.math.BigDecimal fcurTotalESSEarnings) {
    this.fcurTotalESSEarnings = fcurTotalESSEarnings;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalESSEarnings(java.math.BigDecimal fcurTotalESSEarnings) {
    this.fcurTotalESSEarnings = fcurTotalESSEarnings;
    return this;
  }
  private java.math.BigDecimal fcurTotalPriorPeriodGrossAdj;
  public java.math.BigDecimal get_fcurTotalPriorPeriodGrossAdj() {
    return fcurTotalPriorPeriodGrossAdj;
  }
  public void set_fcurTotalPriorPeriodGrossAdj(java.math.BigDecimal fcurTotalPriorPeriodGrossAdj) {
    this.fcurTotalPriorPeriodGrossAdj = fcurTotalPriorPeriodGrossAdj;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalPriorPeriodGrossAdj(java.math.BigDecimal fcurTotalPriorPeriodGrossAdj) {
    this.fcurTotalPriorPeriodGrossAdj = fcurTotalPriorPeriodGrossAdj;
    return this;
  }
  private java.math.BigDecimal fcurTotalPriorPeriodPAYEAdj;
  public java.math.BigDecimal get_fcurTotalPriorPeriodPAYEAdj() {
    return fcurTotalPriorPeriodPAYEAdj;
  }
  public void set_fcurTotalPriorPeriodPAYEAdj(java.math.BigDecimal fcurTotalPriorPeriodPAYEAdj) {
    this.fcurTotalPriorPeriodPAYEAdj = fcurTotalPriorPeriodPAYEAdj;
  }
  public tblnz_rtnpsoemployeesummary with_fcurTotalPriorPeriodPAYEAdj(java.math.BigDecimal fcurTotalPriorPeriodPAYEAdj) {
    this.fcurTotalPriorPeriodPAYEAdj = fcurTotalPriorPeriodPAYEAdj;
    return this;
  }
  private java.math.BigDecimal fcurMaximumEarnings;
  public java.math.BigDecimal get_fcurMaximumEarnings() {
    return fcurMaximumEarnings;
  }
  public void set_fcurMaximumEarnings(java.math.BigDecimal fcurMaximumEarnings) {
    this.fcurMaximumEarnings = fcurMaximumEarnings;
  }
  public tblnz_rtnpsoemployeesummary with_fcurMaximumEarnings(java.math.BigDecimal fcurMaximumEarnings) {
    this.fcurMaximumEarnings = fcurMaximumEarnings;
    return this;
  }
  private String fstrPIIRDNumber;
  public String get_fstrPIIRDNumber() {
    return fstrPIIRDNumber;
  }
  public void set_fstrPIIRDNumber(String fstrPIIRDNumber) {
    this.fstrPIIRDNumber = fstrPIIRDNumber;
  }
  public tblnz_rtnpsoemployeesummary with_fstrPIIRDNumber(String fstrPIIRDNumber) {
    this.fstrPIIRDNumber = fstrPIIRDNumber;
    return this;
  }
  private String fstrContactPhoneNumber;
  public String get_fstrContactPhoneNumber() {
    return fstrContactPhoneNumber;
  }
  public void set_fstrContactPhoneNumber(String fstrContactPhoneNumber) {
    this.fstrContactPhoneNumber = fstrContactPhoneNumber;
  }
  public tblnz_rtnpsoemployeesummary with_fstrContactPhoneNumber(String fstrContactPhoneNumber) {
    this.fstrContactPhoneNumber = fstrContactPhoneNumber;
    return this;
  }
  private String fstrContactName;
  public String get_fstrContactName() {
    return fstrContactName;
  }
  public void set_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
  }
  public tblnz_rtnpsoemployeesummary with_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
    return this;
  }
  private String fstrPayrollPackage;
  public String get_fstrPayrollPackage() {
    return fstrPayrollPackage;
  }
  public void set_fstrPayrollPackage(String fstrPayrollPackage) {
    this.fstrPayrollPackage = fstrPayrollPackage;
  }
  public tblnz_rtnpsoemployeesummary with_fstrPayrollPackage(String fstrPayrollPackage) {
    this.fstrPayrollPackage = fstrPayrollPackage;
    return this;
  }
  private String fstrPayrollContactEmail;
  public String get_fstrPayrollContactEmail() {
    return fstrPayrollContactEmail;
  }
  public void set_fstrPayrollContactEmail(String fstrPayrollContactEmail) {
    this.fstrPayrollContactEmail = fstrPayrollContactEmail;
  }
  public tblnz_rtnpsoemployeesummary with_fstrPayrollContactEmail(String fstrPayrollContactEmail) {
    this.fstrPayrollContactEmail = fstrPayrollContactEmail;
    return this;
  }
  private Integer fblnCorrespondence;
  public Integer get_fblnCorrespondence() {
    return fblnCorrespondence;
  }
  public void set_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
  }
  public tblnz_rtnpsoemployeesummary with_fblnCorrespondence(Integer fblnCorrespondence) {
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
  public tblnz_rtnpsoemployeesummary with_fblnPaymentAttached(Integer fblnPaymentAttached) {
    this.fblnPaymentAttached = fblnPaymentAttached;
    return this;
  }
  private Integer fblnPayDayFiler;
  public Integer get_fblnPayDayFiler() {
    return fblnPayDayFiler;
  }
  public void set_fblnPayDayFiler(Integer fblnPayDayFiler) {
    this.fblnPayDayFiler = fblnPayDayFiler;
  }
  public tblnz_rtnpsoemployeesummary with_fblnPayDayFiler(Integer fblnPayDayFiler) {
    this.fblnPayDayFiler = fblnPayDayFiler;
    return this;
  }
  private java.sql.Timestamp fdtmPayDayPeriod;
  public java.sql.Timestamp get_fdtmPayDayPeriod() {
    return fdtmPayDayPeriod;
  }
  public void set_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
  }
  public tblnz_rtnpsoemployeesummary with_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmPayDayDueDate;
  public java.sql.Timestamp get_fdtmPayDayDueDate() {
    return fdtmPayDayDueDate;
  }
  public void set_fdtmPayDayDueDate(java.sql.Timestamp fdtmPayDayDueDate) {
    this.fdtmPayDayDueDate = fdtmPayDayDueDate;
  }
  public tblnz_rtnpsoemployeesummary with_fdtmPayDayDueDate(java.sql.Timestamp fdtmPayDayDueDate) {
    this.fdtmPayDayDueDate = fdtmPayDayDueDate;
    return this;
  }
  private java.sql.Timestamp fdtmMonthlyDueDate;
  public java.sql.Timestamp get_fdtmMonthlyDueDate() {
    return fdtmMonthlyDueDate;
  }
  public void set_fdtmMonthlyDueDate(java.sql.Timestamp fdtmMonthlyDueDate) {
    this.fdtmMonthlyDueDate = fdtmMonthlyDueDate;
  }
  public tblnz_rtnpsoemployeesummary with_fdtmMonthlyDueDate(java.sql.Timestamp fdtmMonthlyDueDate) {
    this.fdtmMonthlyDueDate = fdtmMonthlyDueDate;
    return this;
  }
  private java.sql.Timestamp fdtmConsolidationDate;
  public java.sql.Timestamp get_fdtmConsolidationDate() {
    return fdtmConsolidationDate;
  }
  public void set_fdtmConsolidationDate(java.sql.Timestamp fdtmConsolidationDate) {
    this.fdtmConsolidationDate = fdtmConsolidationDate;
  }
  public tblnz_rtnpsoemployeesummary with_fdtmConsolidationDate(java.sql.Timestamp fdtmConsolidationDate) {
    this.fdtmConsolidationDate = fdtmConsolidationDate;
    return this;
  }
  private Integer fblnMSD;
  public Integer get_fblnMSD() {
    return fblnMSD;
  }
  public void set_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
  }
  public tblnz_rtnpsoemployeesummary with_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
    return this;
  }
  private Integer fblnDuplicate;
  public Integer get_fblnDuplicate() {
    return fblnDuplicate;
  }
  public void set_fblnDuplicate(Integer fblnDuplicate) {
    this.fblnDuplicate = fblnDuplicate;
  }
  public tblnz_rtnpsoemployeesummary with_fblnDuplicate(Integer fblnDuplicate) {
    this.fblnDuplicate = fblnDuplicate;
    return this;
  }
  private Integer fblnDuplicateLineItems;
  public Integer get_fblnDuplicateLineItems() {
    return fblnDuplicateLineItems;
  }
  public void set_fblnDuplicateLineItems(Integer fblnDuplicateLineItems) {
    this.fblnDuplicateLineItems = fblnDuplicateLineItems;
  }
  public tblnz_rtnpsoemployeesummary with_fblnDuplicateLineItems(Integer fblnDuplicateLineItems) {
    this.fblnDuplicateLineItems = fblnDuplicateLineItems;
    return this;
  }
  private Integer fblnLineItemsProcessed;
  public Integer get_fblnLineItemsProcessed() {
    return fblnLineItemsProcessed;
  }
  public void set_fblnLineItemsProcessed(Integer fblnLineItemsProcessed) {
    this.fblnLineItemsProcessed = fblnLineItemsProcessed;
  }
  public tblnz_rtnpsoemployeesummary with_fblnLineItemsProcessed(Integer fblnLineItemsProcessed) {
    this.fblnLineItemsProcessed = fblnLineItemsProcessed;
    return this;
  }
  private Integer fblnProxyFieldsExpected;
  public Integer get_fblnProxyFieldsExpected() {
    return fblnProxyFieldsExpected;
  }
  public void set_fblnProxyFieldsExpected(Integer fblnProxyFieldsExpected) {
    this.fblnProxyFieldsExpected = fblnProxyFieldsExpected;
  }
  public tblnz_rtnpsoemployeesummary with_fblnProxyFieldsExpected(Integer fblnProxyFieldsExpected) {
    this.fblnProxyFieldsExpected = fblnProxyFieldsExpected;
    return this;
  }
  private Integer fblnDefaultAssessment;
  public Integer get_fblnDefaultAssessment() {
    return fblnDefaultAssessment;
  }
  public void set_fblnDefaultAssessment(Integer fblnDefaultAssessment) {
    this.fblnDefaultAssessment = fblnDefaultAssessment;
  }
  public tblnz_rtnpsoemployeesummary with_fblnDefaultAssessment(Integer fblnDefaultAssessment) {
    this.fblnDefaultAssessment = fblnDefaultAssessment;
    return this;
  }
  private String fstrEmployerGroup;
  public String get_fstrEmployerGroup() {
    return fstrEmployerGroup;
  }
  public void set_fstrEmployerGroup(String fstrEmployerGroup) {
    this.fstrEmployerGroup = fstrEmployerGroup;
  }
  public tblnz_rtnpsoemployeesummary with_fstrEmployerGroup(String fstrEmployerGroup) {
    this.fstrEmployerGroup = fstrEmployerGroup;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpsoemployeesummary with_fstrWho(String fstrWho) {
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
  public tblnz_rtnpsoemployeesummary with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpsoemployeesummary)) {
      return false;
    }
    tblnz_rtnpsoemployeesummary that = (tblnz_rtnpsoemployeesummary) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngSubmissionKey == null ? that.flngSubmissionKey == null : this.flngSubmissionKey.equals(that.flngSubmissionKey));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngHeaderNumber == null ? that.flngHeaderNumber == null : this.flngHeaderNumber.equals(that.flngHeaderNumber));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fdtmOriginalSentToFIRST == null ? that.fdtmOriginalSentToFIRST == null : this.fdtmOriginalSentToFIRST.equals(that.fdtmOriginalSentToFIRST));
    equal = equal && (this.fdtmLastSentToFIRST == null ? that.fdtmLastSentToFIRST == null : this.fdtmLastSentToFIRST.equals(that.fdtmLastSentToFIRST));
    equal = equal && (this.fblnFIRSTCnvError == null ? that.fblnFIRSTCnvError == null : this.fblnFIRSTCnvError.equals(that.fblnFIRSTCnvError));
    equal = equal && (this.fblnFIRSTCnvErrorWorkItem == null ? that.fblnFIRSTCnvErrorWorkItem == null : this.fblnFIRSTCnvErrorWorkItem.equals(that.fblnFIRSTCnvErrorWorkItem));
    equal = equal && (this.fblnFIRSTCnvErrorComplete == null ? that.fblnFIRSTCnvErrorComplete == null : this.fblnFIRSTCnvErrorComplete.equals(that.fblnFIRSTCnvErrorComplete));
    equal = equal && (this.fcurTotalGross == null ? that.fcurTotalGross == null : this.fcurTotalGross.equals(that.fcurTotalGross));
    equal = equal && (this.fcurTotalEarnings == null ? that.fcurTotalEarnings == null : this.fcurTotalEarnings.equals(that.fcurTotalEarnings));
    equal = equal && (this.fcurTotalPAYE == null ? that.fcurTotalPAYE == null : this.fcurTotalPAYE.equals(that.fcurTotalPAYE));
    equal = equal && (this.fcurTotalChildSupport == null ? that.fcurTotalChildSupport == null : this.fcurTotalChildSupport.equals(that.fcurTotalChildSupport));
    equal = equal && (this.fcurTotalStudentLoan == null ? that.fcurTotalStudentLoan == null : this.fcurTotalStudentLoan.equals(that.fcurTotalStudentLoan));
    equal = equal && (this.fcurTotalKiwiSaverDeductions == null ? that.fcurTotalKiwiSaverDeductions == null : this.fcurTotalKiwiSaverDeductions.equals(that.fcurTotalKiwiSaverDeductions));
    equal = equal && (this.fcurTotalKiwiSaverContribution == null ? that.fcurTotalKiwiSaverContribution == null : this.fcurTotalKiwiSaverContribution.equals(that.fcurTotalKiwiSaverContribution));
    equal = equal && (this.fcurTotalESCTDeductions == null ? that.fcurTotalESCTDeductions == null : this.fcurTotalESCTDeductions.equals(that.fcurTotalESCTDeductions));
    equal = equal && (this.fcurTotalAmountPayable == null ? that.fcurTotalAmountPayable == null : this.fcurTotalAmountPayable.equals(that.fcurTotalAmountPayable));
    equal = equal && (this.fcurTotalTaxCreditsDonations == null ? that.fcurTotalTaxCreditsDonations == null : this.fcurTotalTaxCreditsDonations.equals(that.fcurTotalTaxCreditsDonations));
    equal = equal && (this.fcurTotalTaxCreditsExtinguish == null ? that.fcurTotalTaxCreditsExtinguish == null : this.fcurTotalTaxCreditsExtinguish.equals(that.fcurTotalTaxCreditsExtinguish));
    equal = equal && (this.fcurTotalFamilyTaxCredits == null ? that.fcurTotalFamilyTaxCredits == null : this.fcurTotalFamilyTaxCredits.equals(that.fcurTotalFamilyTaxCredits));
    equal = equal && (this.fcurESCTAdjustments == null ? that.fcurESCTAdjustments == null : this.fcurESCTAdjustments.equals(that.fcurESCTAdjustments));
    equal = equal && (this.fcurESCTKiwiSaver == null ? that.fcurESCTKiwiSaver == null : this.fcurESCTKiwiSaver.equals(that.fcurESCTKiwiSaver));
    equal = equal && (this.fcurTotalCompEmployerCont == null ? that.fcurTotalCompEmployerCont == null : this.fcurTotalCompEmployerCont.equals(that.fcurTotalCompEmployerCont));
    equal = equal && (this.fcurTotalVoluntaryEmployerCont == null ? that.fcurTotalVoluntaryEmployerCont == null : this.fcurTotalVoluntaryEmployerCont.equals(that.fcurTotalVoluntaryEmployerCont));
    equal = equal && (this.fcurTotalSLCIRDeductions == null ? that.fcurTotalSLCIRDeductions == null : this.fcurTotalSLCIRDeductions.equals(that.fcurTotalSLCIRDeductions));
    equal = equal && (this.fcurTotalSLBORDeductions == null ? that.fcurTotalSLBORDeductions == null : this.fcurTotalSLBORDeductions.equals(that.fcurTotalSLBORDeductions));
    equal = equal && (this.fcurTotalESSEarnings == null ? that.fcurTotalESSEarnings == null : this.fcurTotalESSEarnings.equals(that.fcurTotalESSEarnings));
    equal = equal && (this.fcurTotalPriorPeriodGrossAdj == null ? that.fcurTotalPriorPeriodGrossAdj == null : this.fcurTotalPriorPeriodGrossAdj.equals(that.fcurTotalPriorPeriodGrossAdj));
    equal = equal && (this.fcurTotalPriorPeriodPAYEAdj == null ? that.fcurTotalPriorPeriodPAYEAdj == null : this.fcurTotalPriorPeriodPAYEAdj.equals(that.fcurTotalPriorPeriodPAYEAdj));
    equal = equal && (this.fcurMaximumEarnings == null ? that.fcurMaximumEarnings == null : this.fcurMaximumEarnings.equals(that.fcurMaximumEarnings));
    equal = equal && (this.fstrPIIRDNumber == null ? that.fstrPIIRDNumber == null : this.fstrPIIRDNumber.equals(that.fstrPIIRDNumber));
    equal = equal && (this.fstrContactPhoneNumber == null ? that.fstrContactPhoneNumber == null : this.fstrContactPhoneNumber.equals(that.fstrContactPhoneNumber));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrPayrollPackage == null ? that.fstrPayrollPackage == null : this.fstrPayrollPackage.equals(that.fstrPayrollPackage));
    equal = equal && (this.fstrPayrollContactEmail == null ? that.fstrPayrollContactEmail == null : this.fstrPayrollContactEmail.equals(that.fstrPayrollContactEmail));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnPaymentAttached == null ? that.fblnPaymentAttached == null : this.fblnPaymentAttached.equals(that.fblnPaymentAttached));
    equal = equal && (this.fblnPayDayFiler == null ? that.fblnPayDayFiler == null : this.fblnPayDayFiler.equals(that.fblnPayDayFiler));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fdtmPayDayDueDate == null ? that.fdtmPayDayDueDate == null : this.fdtmPayDayDueDate.equals(that.fdtmPayDayDueDate));
    equal = equal && (this.fdtmMonthlyDueDate == null ? that.fdtmMonthlyDueDate == null : this.fdtmMonthlyDueDate.equals(that.fdtmMonthlyDueDate));
    equal = equal && (this.fdtmConsolidationDate == null ? that.fdtmConsolidationDate == null : this.fdtmConsolidationDate.equals(that.fdtmConsolidationDate));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fblnDuplicate == null ? that.fblnDuplicate == null : this.fblnDuplicate.equals(that.fblnDuplicate));
    equal = equal && (this.fblnDuplicateLineItems == null ? that.fblnDuplicateLineItems == null : this.fblnDuplicateLineItems.equals(that.fblnDuplicateLineItems));
    equal = equal && (this.fblnLineItemsProcessed == null ? that.fblnLineItemsProcessed == null : this.fblnLineItemsProcessed.equals(that.fblnLineItemsProcessed));
    equal = equal && (this.fblnProxyFieldsExpected == null ? that.fblnProxyFieldsExpected == null : this.fblnProxyFieldsExpected.equals(that.fblnProxyFieldsExpected));
    equal = equal && (this.fblnDefaultAssessment == null ? that.fblnDefaultAssessment == null : this.fblnDefaultAssessment.equals(that.fblnDefaultAssessment));
    equal = equal && (this.fstrEmployerGroup == null ? that.fstrEmployerGroup == null : this.fstrEmployerGroup.equals(that.fstrEmployerGroup));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpsoemployeesummary)) {
      return false;
    }
    tblnz_rtnpsoemployeesummary that = (tblnz_rtnpsoemployeesummary) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngSubmissionKey == null ? that.flngSubmissionKey == null : this.flngSubmissionKey.equals(that.flngSubmissionKey));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngHeaderNumber == null ? that.flngHeaderNumber == null : this.flngHeaderNumber.equals(that.flngHeaderNumber));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fdtmOriginalSentToFIRST == null ? that.fdtmOriginalSentToFIRST == null : this.fdtmOriginalSentToFIRST.equals(that.fdtmOriginalSentToFIRST));
    equal = equal && (this.fdtmLastSentToFIRST == null ? that.fdtmLastSentToFIRST == null : this.fdtmLastSentToFIRST.equals(that.fdtmLastSentToFIRST));
    equal = equal && (this.fblnFIRSTCnvError == null ? that.fblnFIRSTCnvError == null : this.fblnFIRSTCnvError.equals(that.fblnFIRSTCnvError));
    equal = equal && (this.fblnFIRSTCnvErrorWorkItem == null ? that.fblnFIRSTCnvErrorWorkItem == null : this.fblnFIRSTCnvErrorWorkItem.equals(that.fblnFIRSTCnvErrorWorkItem));
    equal = equal && (this.fblnFIRSTCnvErrorComplete == null ? that.fblnFIRSTCnvErrorComplete == null : this.fblnFIRSTCnvErrorComplete.equals(that.fblnFIRSTCnvErrorComplete));
    equal = equal && (this.fcurTotalGross == null ? that.fcurTotalGross == null : this.fcurTotalGross.equals(that.fcurTotalGross));
    equal = equal && (this.fcurTotalEarnings == null ? that.fcurTotalEarnings == null : this.fcurTotalEarnings.equals(that.fcurTotalEarnings));
    equal = equal && (this.fcurTotalPAYE == null ? that.fcurTotalPAYE == null : this.fcurTotalPAYE.equals(that.fcurTotalPAYE));
    equal = equal && (this.fcurTotalChildSupport == null ? that.fcurTotalChildSupport == null : this.fcurTotalChildSupport.equals(that.fcurTotalChildSupport));
    equal = equal && (this.fcurTotalStudentLoan == null ? that.fcurTotalStudentLoan == null : this.fcurTotalStudentLoan.equals(that.fcurTotalStudentLoan));
    equal = equal && (this.fcurTotalKiwiSaverDeductions == null ? that.fcurTotalKiwiSaverDeductions == null : this.fcurTotalKiwiSaverDeductions.equals(that.fcurTotalKiwiSaverDeductions));
    equal = equal && (this.fcurTotalKiwiSaverContribution == null ? that.fcurTotalKiwiSaverContribution == null : this.fcurTotalKiwiSaverContribution.equals(that.fcurTotalKiwiSaverContribution));
    equal = equal && (this.fcurTotalESCTDeductions == null ? that.fcurTotalESCTDeductions == null : this.fcurTotalESCTDeductions.equals(that.fcurTotalESCTDeductions));
    equal = equal && (this.fcurTotalAmountPayable == null ? that.fcurTotalAmountPayable == null : this.fcurTotalAmountPayable.equals(that.fcurTotalAmountPayable));
    equal = equal && (this.fcurTotalTaxCreditsDonations == null ? that.fcurTotalTaxCreditsDonations == null : this.fcurTotalTaxCreditsDonations.equals(that.fcurTotalTaxCreditsDonations));
    equal = equal && (this.fcurTotalTaxCreditsExtinguish == null ? that.fcurTotalTaxCreditsExtinguish == null : this.fcurTotalTaxCreditsExtinguish.equals(that.fcurTotalTaxCreditsExtinguish));
    equal = equal && (this.fcurTotalFamilyTaxCredits == null ? that.fcurTotalFamilyTaxCredits == null : this.fcurTotalFamilyTaxCredits.equals(that.fcurTotalFamilyTaxCredits));
    equal = equal && (this.fcurESCTAdjustments == null ? that.fcurESCTAdjustments == null : this.fcurESCTAdjustments.equals(that.fcurESCTAdjustments));
    equal = equal && (this.fcurESCTKiwiSaver == null ? that.fcurESCTKiwiSaver == null : this.fcurESCTKiwiSaver.equals(that.fcurESCTKiwiSaver));
    equal = equal && (this.fcurTotalCompEmployerCont == null ? that.fcurTotalCompEmployerCont == null : this.fcurTotalCompEmployerCont.equals(that.fcurTotalCompEmployerCont));
    equal = equal && (this.fcurTotalVoluntaryEmployerCont == null ? that.fcurTotalVoluntaryEmployerCont == null : this.fcurTotalVoluntaryEmployerCont.equals(that.fcurTotalVoluntaryEmployerCont));
    equal = equal && (this.fcurTotalSLCIRDeductions == null ? that.fcurTotalSLCIRDeductions == null : this.fcurTotalSLCIRDeductions.equals(that.fcurTotalSLCIRDeductions));
    equal = equal && (this.fcurTotalSLBORDeductions == null ? that.fcurTotalSLBORDeductions == null : this.fcurTotalSLBORDeductions.equals(that.fcurTotalSLBORDeductions));
    equal = equal && (this.fcurTotalESSEarnings == null ? that.fcurTotalESSEarnings == null : this.fcurTotalESSEarnings.equals(that.fcurTotalESSEarnings));
    equal = equal && (this.fcurTotalPriorPeriodGrossAdj == null ? that.fcurTotalPriorPeriodGrossAdj == null : this.fcurTotalPriorPeriodGrossAdj.equals(that.fcurTotalPriorPeriodGrossAdj));
    equal = equal && (this.fcurTotalPriorPeriodPAYEAdj == null ? that.fcurTotalPriorPeriodPAYEAdj == null : this.fcurTotalPriorPeriodPAYEAdj.equals(that.fcurTotalPriorPeriodPAYEAdj));
    equal = equal && (this.fcurMaximumEarnings == null ? that.fcurMaximumEarnings == null : this.fcurMaximumEarnings.equals(that.fcurMaximumEarnings));
    equal = equal && (this.fstrPIIRDNumber == null ? that.fstrPIIRDNumber == null : this.fstrPIIRDNumber.equals(that.fstrPIIRDNumber));
    equal = equal && (this.fstrContactPhoneNumber == null ? that.fstrContactPhoneNumber == null : this.fstrContactPhoneNumber.equals(that.fstrContactPhoneNumber));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrPayrollPackage == null ? that.fstrPayrollPackage == null : this.fstrPayrollPackage.equals(that.fstrPayrollPackage));
    equal = equal && (this.fstrPayrollContactEmail == null ? that.fstrPayrollContactEmail == null : this.fstrPayrollContactEmail.equals(that.fstrPayrollContactEmail));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fblnPaymentAttached == null ? that.fblnPaymentAttached == null : this.fblnPaymentAttached.equals(that.fblnPaymentAttached));
    equal = equal && (this.fblnPayDayFiler == null ? that.fblnPayDayFiler == null : this.fblnPayDayFiler.equals(that.fblnPayDayFiler));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fdtmPayDayDueDate == null ? that.fdtmPayDayDueDate == null : this.fdtmPayDayDueDate.equals(that.fdtmPayDayDueDate));
    equal = equal && (this.fdtmMonthlyDueDate == null ? that.fdtmMonthlyDueDate == null : this.fdtmMonthlyDueDate.equals(that.fdtmMonthlyDueDate));
    equal = equal && (this.fdtmConsolidationDate == null ? that.fdtmConsolidationDate == null : this.fdtmConsolidationDate.equals(that.fdtmConsolidationDate));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fblnDuplicate == null ? that.fblnDuplicate == null : this.fblnDuplicate.equals(that.fblnDuplicate));
    equal = equal && (this.fblnDuplicateLineItems == null ? that.fblnDuplicateLineItems == null : this.fblnDuplicateLineItems.equals(that.fblnDuplicateLineItems));
    equal = equal && (this.fblnLineItemsProcessed == null ? that.fblnLineItemsProcessed == null : this.fblnLineItemsProcessed.equals(that.fblnLineItemsProcessed));
    equal = equal && (this.fblnProxyFieldsExpected == null ? that.fblnProxyFieldsExpected == null : this.fblnProxyFieldsExpected.equals(that.fblnProxyFieldsExpected));
    equal = equal && (this.fblnDefaultAssessment == null ? that.fblnDefaultAssessment == null : this.fblnDefaultAssessment.equals(that.fblnDefaultAssessment));
    equal = equal && (this.fstrEmployerGroup == null ? that.fstrEmployerGroup == null : this.fstrEmployerGroup.equals(that.fstrEmployerGroup));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSubmissionKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngHeaderNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmOriginalSentToFIRST = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmLastSentToFIRST = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnFIRSTCnvError = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnFIRSTCnvErrorWorkItem = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnFIRSTCnvErrorComplete = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurTotalGross = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalEarnings = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalPAYE = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalChildSupport = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalStudentLoan = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalKiwiSaverContribution = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalESCTDeductions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalAmountPayable = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalTaxCreditsDonations = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurESCTAdjustments = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurESCTKiwiSaver = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalCompEmployerCont = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalVoluntaryEmployerCont = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurTotalSLCIRDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTotalSLBORDeductions = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalESSEarnings = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalPriorPeriodGrossAdj = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalPriorPeriodPAYEAdj = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurMaximumEarnings = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fstrPIIRDNumber = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrContactPhoneNumber = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrPayrollPackage = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrPayrollContactEmail = JdbcWritableBridge.readString(38, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPaymentAttached = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnPayDayFiler = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.fdtmPayDayDueDate = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fdtmMonthlyDueDate = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.fdtmConsolidationDate = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fblnDuplicate = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fblnDuplicateLineItems = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fblnLineItemsProcessed = JdbcWritableBridge.readInteger(49, __dbResults);
    this.fblnProxyFieldsExpected = JdbcWritableBridge.readInteger(50, __dbResults);
    this.fblnDefaultAssessment = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrEmployerGroup = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(53, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(54, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSubmissionKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngHeaderNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmOriginalSentToFIRST = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmLastSentToFIRST = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fblnFIRSTCnvError = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnFIRSTCnvErrorWorkItem = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnFIRSTCnvErrorComplete = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurTotalGross = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalEarnings = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalPAYE = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalChildSupport = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalStudentLoan = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalKiwiSaverContribution = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTotalESCTDeductions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalAmountPayable = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurTotalTaxCreditsDonations = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTotalTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurTotalFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurESCTAdjustments = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurESCTKiwiSaver = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalCompEmployerCont = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTotalVoluntaryEmployerCont = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurTotalSLCIRDeductions = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTotalSLBORDeductions = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurTotalESSEarnings = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurTotalPriorPeriodGrossAdj = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurTotalPriorPeriodPAYEAdj = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurMaximumEarnings = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fstrPIIRDNumber = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrContactPhoneNumber = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrPayrollPackage = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrPayrollContactEmail = JdbcWritableBridge.readString(38, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnPaymentAttached = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnPayDayFiler = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.fdtmPayDayDueDate = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.fdtmMonthlyDueDate = JdbcWritableBridge.readTimestamp(44, __dbResults);
    this.fdtmConsolidationDate = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fblnDuplicate = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fblnDuplicateLineItems = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fblnLineItemsProcessed = JdbcWritableBridge.readInteger(49, __dbResults);
    this.fblnProxyFieldsExpected = JdbcWritableBridge.readInteger(50, __dbResults);
    this.fblnDefaultAssessment = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fstrEmployerGroup = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(53, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(54, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngSubmissionKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngHeaderNumber, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOriginalSentToFIRST, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastSentToFIRST, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvError, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorWorkItem, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorComplete, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGross, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEarnings, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPAYE, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalChildSupport, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalStudentLoan, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalKiwiSaverDeductions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalKiwiSaverContribution, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalESCTDeductions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountPayable, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsDonations, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsExtinguish, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalFamilyTaxCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTAdjustments, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTKiwiSaver, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCompEmployerCont, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalVoluntaryEmployerCont, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSLCIRDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSLBORDeductions, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalESSEarnings, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPriorPeriodGrossAdj, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPriorPeriodPAYEAdj, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaximumEarnings, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIIRDNumber, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactPhoneNumber, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayrollPackage, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayrollContactEmail, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentAttached, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDayFiler, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayDueDate, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMonthlyDueDate, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmConsolidationDate, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicate, 47 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicateLineItems, 48 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLineItemsProcessed, 49 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProxyFieldsExpected, 50 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultAssessment, 51 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerGroup, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 54 + __off, 93, __dbStmt);
    return 54;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSubmissionKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngHeaderNumber, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOriginalSentToFIRST, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastSentToFIRST, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvError, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorWorkItem, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTCnvErrorComplete, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGross, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalEarnings, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPAYE, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalChildSupport, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalStudentLoan, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalKiwiSaverDeductions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalKiwiSaverContribution, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalESCTDeductions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmountPayable, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsDonations, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCreditsExtinguish, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalFamilyTaxCredits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTAdjustments, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurESCTKiwiSaver, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCompEmployerCont, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalVoluntaryEmployerCont, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSLCIRDeductions, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSLBORDeductions, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalESSEarnings, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPriorPeriodGrossAdj, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPriorPeriodPAYEAdj, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaximumEarnings, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPIIRDNumber, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactPhoneNumber, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayrollPackage, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayrollContactEmail, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentAttached, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDayFiler, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayDueDate, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmMonthlyDueDate, 44 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmConsolidationDate, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicate, 47 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicateLineItems, 48 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLineItemsProcessed, 49 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProxyFieldsExpected, 50 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultAssessment, 51 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerGroup, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 54 + __off, 93, __dbStmt);
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
        this.flngSubmissionKey = null;
    } else {
    this.flngSubmissionKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFileKey = null;
    } else {
    this.flngFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngHeaderNumber = null;
    } else {
    this.flngHeaderNumber = Integer.valueOf(__dataIn.readInt());
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
        this.fcurTotalGross = null;
    } else {
    this.fcurTotalGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalEarnings = null;
    } else {
    this.fcurTotalEarnings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPAYE = null;
    } else {
    this.fcurTotalPAYE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalChildSupport = null;
    } else {
    this.fcurTotalChildSupport = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalStudentLoan = null;
    } else {
    this.fcurTotalStudentLoan = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalKiwiSaverDeductions = null;
    } else {
    this.fcurTotalKiwiSaverDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalKiwiSaverContribution = null;
    } else {
    this.fcurTotalKiwiSaverContribution = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalESCTDeductions = null;
    } else {
    this.fcurTotalESCTDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAmountPayable = null;
    } else {
    this.fcurTotalAmountPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCreditsDonations = null;
    } else {
    this.fcurTotalTaxCreditsDonations = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCreditsExtinguish = null;
    } else {
    this.fcurTotalTaxCreditsExtinguish = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalFamilyTaxCredits = null;
    } else {
    this.fcurTotalFamilyTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurESCTAdjustments = null;
    } else {
    this.fcurESCTAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurESCTKiwiSaver = null;
    } else {
    this.fcurESCTKiwiSaver = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalCompEmployerCont = null;
    } else {
    this.fcurTotalCompEmployerCont = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalVoluntaryEmployerCont = null;
    } else {
    this.fcurTotalVoluntaryEmployerCont = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSLCIRDeductions = null;
    } else {
    this.fcurTotalSLCIRDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSLBORDeductions = null;
    } else {
    this.fcurTotalSLBORDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalESSEarnings = null;
    } else {
    this.fcurTotalESSEarnings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPriorPeriodGrossAdj = null;
    } else {
    this.fcurTotalPriorPeriodGrossAdj = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPriorPeriodPAYEAdj = null;
    } else {
    this.fcurTotalPriorPeriodPAYEAdj = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaximumEarnings = null;
    } else {
    this.fcurMaximumEarnings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPIIRDNumber = null;
    } else {
    this.fstrPIIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactPhoneNumber = null;
    } else {
    this.fstrContactPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactName = null;
    } else {
    this.fstrContactName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayrollPackage = null;
    } else {
    this.fstrPayrollPackage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayrollContactEmail = null;
    } else {
    this.fstrPayrollContactEmail = Text.readString(__dataIn);
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
        this.fblnPayDayFiler = null;
    } else {
    this.fblnPayDayFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDayPeriod = null;
    } else {
    this.fdtmPayDayPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPayDayPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDayDueDate = null;
    } else {
    this.fdtmPayDayDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmPayDayDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmMonthlyDueDate = null;
    } else {
    this.fdtmMonthlyDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmMonthlyDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmConsolidationDate = null;
    } else {
    this.fdtmConsolidationDate = new Timestamp(__dataIn.readLong());
    this.fdtmConsolidationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMSD = null;
    } else {
    this.fblnMSD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDuplicate = null;
    } else {
    this.fblnDuplicate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDuplicateLineItems = null;
    } else {
    this.fblnDuplicateLineItems = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLineItemsProcessed = null;
    } else {
    this.fblnLineItemsProcessed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProxyFieldsExpected = null;
    } else {
    this.fblnProxyFieldsExpected = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefaultAssessment = null;
    } else {
    this.fblnDefaultAssessment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerGroup = null;
    } else {
    this.fstrEmployerGroup = Text.readString(__dataIn);
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
    if (null == this.flngSubmissionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSubmissionKey);
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngHeaderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngHeaderNumber);
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
    if (null == this.fcurTotalGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGross, __dataOut);
    }
    if (null == this.fcurTotalEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEarnings, __dataOut);
    }
    if (null == this.fcurTotalPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPAYE, __dataOut);
    }
    if (null == this.fcurTotalChildSupport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChildSupport, __dataOut);
    }
    if (null == this.fcurTotalStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalStudentLoan, __dataOut);
    }
    if (null == this.fcurTotalKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurTotalKiwiSaverContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalKiwiSaverContribution, __dataOut);
    }
    if (null == this.fcurTotalESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalESCTDeductions, __dataOut);
    }
    if (null == this.fcurTotalAmountPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountPayable, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsDonations, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurTotalFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalFamilyTaxCredits, __dataOut);
    }
    if (null == this.fcurESCTAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTAdjustments, __dataOut);
    }
    if (null == this.fcurESCTKiwiSaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTKiwiSaver, __dataOut);
    }
    if (null == this.fcurTotalCompEmployerCont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCompEmployerCont, __dataOut);
    }
    if (null == this.fcurTotalVoluntaryEmployerCont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalVoluntaryEmployerCont, __dataOut);
    }
    if (null == this.fcurTotalSLCIRDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSLCIRDeductions, __dataOut);
    }
    if (null == this.fcurTotalSLBORDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSLBORDeductions, __dataOut);
    }
    if (null == this.fcurTotalESSEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalESSEarnings, __dataOut);
    }
    if (null == this.fcurTotalPriorPeriodGrossAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPriorPeriodGrossAdj, __dataOut);
    }
    if (null == this.fcurTotalPriorPeriodPAYEAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPriorPeriodPAYEAdj, __dataOut);
    }
    if (null == this.fcurMaximumEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaximumEarnings, __dataOut);
    }
    if (null == this.fstrPIIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIIRDNumber);
    }
    if (null == this.fstrContactPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactPhoneNumber);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrPayrollPackage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayrollPackage);
    }
    if (null == this.fstrPayrollContactEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayrollContactEmail);
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
    if (null == this.fblnPayDayFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDayFiler);
    }
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fdtmPayDayDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayDueDate.getTime());
    __dataOut.writeInt(this.fdtmPayDayDueDate.getNanos());
    }
    if (null == this.fdtmMonthlyDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMonthlyDueDate.getTime());
    __dataOut.writeInt(this.fdtmMonthlyDueDate.getNanos());
    }
    if (null == this.fdtmConsolidationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmConsolidationDate.getTime());
    __dataOut.writeInt(this.fdtmConsolidationDate.getNanos());
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fblnDuplicate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicate);
    }
    if (null == this.fblnDuplicateLineItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicateLineItems);
    }
    if (null == this.fblnLineItemsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLineItemsProcessed);
    }
    if (null == this.fblnProxyFieldsExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProxyFieldsExpected);
    }
    if (null == this.fblnDefaultAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultAssessment);
    }
    if (null == this.fstrEmployerGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerGroup);
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
    if (null == this.flngSubmissionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSubmissionKey);
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngHeaderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngHeaderNumber);
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
    if (null == this.fcurTotalGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGross, __dataOut);
    }
    if (null == this.fcurTotalEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalEarnings, __dataOut);
    }
    if (null == this.fcurTotalPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPAYE, __dataOut);
    }
    if (null == this.fcurTotalChildSupport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChildSupport, __dataOut);
    }
    if (null == this.fcurTotalStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalStudentLoan, __dataOut);
    }
    if (null == this.fcurTotalKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurTotalKiwiSaverContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalKiwiSaverContribution, __dataOut);
    }
    if (null == this.fcurTotalESCTDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalESCTDeductions, __dataOut);
    }
    if (null == this.fcurTotalAmountPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmountPayable, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsDonations) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsDonations, __dataOut);
    }
    if (null == this.fcurTotalTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurTotalFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalFamilyTaxCredits, __dataOut);
    }
    if (null == this.fcurESCTAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTAdjustments, __dataOut);
    }
    if (null == this.fcurESCTKiwiSaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurESCTKiwiSaver, __dataOut);
    }
    if (null == this.fcurTotalCompEmployerCont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCompEmployerCont, __dataOut);
    }
    if (null == this.fcurTotalVoluntaryEmployerCont) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalVoluntaryEmployerCont, __dataOut);
    }
    if (null == this.fcurTotalSLCIRDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSLCIRDeductions, __dataOut);
    }
    if (null == this.fcurTotalSLBORDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSLBORDeductions, __dataOut);
    }
    if (null == this.fcurTotalESSEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalESSEarnings, __dataOut);
    }
    if (null == this.fcurTotalPriorPeriodGrossAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPriorPeriodGrossAdj, __dataOut);
    }
    if (null == this.fcurTotalPriorPeriodPAYEAdj) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPriorPeriodPAYEAdj, __dataOut);
    }
    if (null == this.fcurMaximumEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaximumEarnings, __dataOut);
    }
    if (null == this.fstrPIIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPIIRDNumber);
    }
    if (null == this.fstrContactPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactPhoneNumber);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrPayrollPackage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayrollPackage);
    }
    if (null == this.fstrPayrollContactEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayrollContactEmail);
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
    if (null == this.fblnPayDayFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDayFiler);
    }
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fdtmPayDayDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayDueDate.getTime());
    __dataOut.writeInt(this.fdtmPayDayDueDate.getNanos());
    }
    if (null == this.fdtmMonthlyDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmMonthlyDueDate.getTime());
    __dataOut.writeInt(this.fdtmMonthlyDueDate.getNanos());
    }
    if (null == this.fdtmConsolidationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmConsolidationDate.getTime());
    __dataOut.writeInt(this.fdtmConsolidationDate.getNanos());
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fblnDuplicate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicate);
    }
    if (null == this.fblnDuplicateLineItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicateLineItems);
    }
    if (null == this.fblnLineItemsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLineItemsProcessed);
    }
    if (null == this.fblnProxyFieldsExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProxyFieldsExpected);
    }
    if (null == this.fblnDefaultAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultAssessment);
    }
    if (null == this.fstrEmployerGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerGroup);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngSubmissionKey==null?"\\N":"" + flngSubmissionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngHeaderNumber==null?"\\N":"" + flngHeaderNumber, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGross==null?"\\N":fcurTotalGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEarnings==null?"\\N":fcurTotalEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPAYE==null?"\\N":fcurTotalPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChildSupport==null?"\\N":fcurTotalChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalStudentLoan==null?"\\N":fcurTotalStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalKiwiSaverDeductions==null?"\\N":fcurTotalKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalKiwiSaverContribution==null?"\\N":fcurTotalKiwiSaverContribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalESCTDeductions==null?"\\N":fcurTotalESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountPayable==null?"\\N":fcurTotalAmountPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsDonations==null?"\\N":fcurTotalTaxCreditsDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsExtinguish==null?"\\N":fcurTotalTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalFamilyTaxCredits==null?"\\N":fcurTotalFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTAdjustments==null?"\\N":fcurESCTAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTKiwiSaver==null?"\\N":fcurESCTKiwiSaver.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCompEmployerCont==null?"\\N":fcurTotalCompEmployerCont.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalVoluntaryEmployerCont==null?"\\N":fcurTotalVoluntaryEmployerCont.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSLCIRDeductions==null?"\\N":fcurTotalSLCIRDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSLBORDeductions==null?"\\N":fcurTotalSLBORDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalESSEarnings==null?"\\N":fcurTotalESSEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPriorPeriodGrossAdj==null?"\\N":fcurTotalPriorPeriodGrossAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPriorPeriodPAYEAdj==null?"\\N":fcurTotalPriorPeriodPAYEAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaximumEarnings==null?"\\N":fcurMaximumEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIIRDNumber==null?"\\N":fstrPIIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactPhoneNumber==null?"\\N":fstrContactPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayrollPackage==null?"\\N":fstrPayrollPackage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayrollContactEmail==null?"\\N":fstrPayrollContactEmail, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentAttached==null?"\\N":"" + fblnPaymentAttached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDayFiler==null?"\\N":"" + fblnPayDayFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayDueDate==null?"\\N":"" + fdtmPayDayDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMonthlyDueDate==null?"\\N":"" + fdtmMonthlyDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmConsolidationDate==null?"\\N":"" + fdtmConsolidationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicate==null?"\\N":"" + fblnDuplicate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicateLineItems==null?"\\N":"" + fblnDuplicateLineItems, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLineItemsProcessed==null?"\\N":"" + fblnLineItemsProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProxyFieldsExpected==null?"\\N":"" + fblnProxyFieldsExpected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultAssessment==null?"\\N":"" + fblnDefaultAssessment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerGroup==null?"\\N":fstrEmployerGroup, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngSubmissionKey==null?"\\N":"" + flngSubmissionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngHeaderNumber==null?"\\N":"" + flngHeaderNumber, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGross==null?"\\N":fcurTotalGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalEarnings==null?"\\N":fcurTotalEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPAYE==null?"\\N":fcurTotalPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChildSupport==null?"\\N":fcurTotalChildSupport.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalStudentLoan==null?"\\N":fcurTotalStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalKiwiSaverDeductions==null?"\\N":fcurTotalKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalKiwiSaverContribution==null?"\\N":fcurTotalKiwiSaverContribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalESCTDeductions==null?"\\N":fcurTotalESCTDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmountPayable==null?"\\N":fcurTotalAmountPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsDonations==null?"\\N":fcurTotalTaxCreditsDonations.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCreditsExtinguish==null?"\\N":fcurTotalTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalFamilyTaxCredits==null?"\\N":fcurTotalFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTAdjustments==null?"\\N":fcurESCTAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurESCTKiwiSaver==null?"\\N":fcurESCTKiwiSaver.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCompEmployerCont==null?"\\N":fcurTotalCompEmployerCont.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalVoluntaryEmployerCont==null?"\\N":fcurTotalVoluntaryEmployerCont.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSLCIRDeductions==null?"\\N":fcurTotalSLCIRDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSLBORDeductions==null?"\\N":fcurTotalSLBORDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalESSEarnings==null?"\\N":fcurTotalESSEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPriorPeriodGrossAdj==null?"\\N":fcurTotalPriorPeriodGrossAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPriorPeriodPAYEAdj==null?"\\N":fcurTotalPriorPeriodPAYEAdj.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaximumEarnings==null?"\\N":fcurMaximumEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPIIRDNumber==null?"\\N":fstrPIIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactPhoneNumber==null?"\\N":fstrContactPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayrollPackage==null?"\\N":fstrPayrollPackage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayrollContactEmail==null?"\\N":fstrPayrollContactEmail, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentAttached==null?"\\N":"" + fblnPaymentAttached, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDayFiler==null?"\\N":"" + fblnPayDayFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayDueDate==null?"\\N":"" + fdtmPayDayDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmMonthlyDueDate==null?"\\N":"" + fdtmMonthlyDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmConsolidationDate==null?"\\N":"" + fdtmConsolidationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicate==null?"\\N":"" + fblnDuplicate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicateLineItems==null?"\\N":"" + fblnDuplicateLineItems, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLineItemsProcessed==null?"\\N":"" + fblnLineItemsProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProxyFieldsExpected==null?"\\N":"" + fblnProxyFieldsExpected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultAssessment==null?"\\N":"" + fblnDefaultAssessment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerGroup==null?"\\N":fstrEmployerGroup, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSubmissionKey = null; } else {
      this.flngSubmissionKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngHeaderNumber = null; } else {
      this.flngHeaderNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGross = null; } else {
      this.fcurTotalGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEarnings = null; } else {
      this.fcurTotalEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPAYE = null; } else {
      this.fcurTotalPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChildSupport = null; } else {
      this.fcurTotalChildSupport = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalStudentLoan = null; } else {
      this.fcurTotalStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalKiwiSaverDeductions = null; } else {
      this.fcurTotalKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalKiwiSaverContribution = null; } else {
      this.fcurTotalKiwiSaverContribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalESCTDeductions = null; } else {
      this.fcurTotalESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountPayable = null; } else {
      this.fcurTotalAmountPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsDonations = null; } else {
      this.fcurTotalTaxCreditsDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsExtinguish = null; } else {
      this.fcurTotalTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalFamilyTaxCredits = null; } else {
      this.fcurTotalFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTAdjustments = null; } else {
      this.fcurESCTAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTKiwiSaver = null; } else {
      this.fcurESCTKiwiSaver = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCompEmployerCont = null; } else {
      this.fcurTotalCompEmployerCont = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalVoluntaryEmployerCont = null; } else {
      this.fcurTotalVoluntaryEmployerCont = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSLCIRDeductions = null; } else {
      this.fcurTotalSLCIRDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSLBORDeductions = null; } else {
      this.fcurTotalSLBORDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalESSEarnings = null; } else {
      this.fcurTotalESSEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPriorPeriodGrossAdj = null; } else {
      this.fcurTotalPriorPeriodGrossAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPriorPeriodPAYEAdj = null; } else {
      this.fcurTotalPriorPeriodPAYEAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaximumEarnings = null; } else {
      this.fcurMaximumEarnings = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrContactPhoneNumber = null; } else {
      this.fstrContactPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayrollPackage = null; } else {
      this.fstrPayrollPackage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayrollContactEmail = null; } else {
      this.fstrPayrollContactEmail = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDayFiler = null; } else {
      this.fblnPayDayFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayDueDate = null; } else {
      this.fdtmPayDayDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMonthlyDueDate = null; } else {
      this.fdtmMonthlyDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmConsolidationDate = null; } else {
      this.fdtmConsolidationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicate = null; } else {
      this.fblnDuplicate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicateLineItems = null; } else {
      this.fblnDuplicateLineItems = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLineItemsProcessed = null; } else {
      this.fblnLineItemsProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProxyFieldsExpected = null; } else {
      this.fblnProxyFieldsExpected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultAssessment = null; } else {
      this.fblnDefaultAssessment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerGroup = null; } else {
      this.fstrEmployerGroup = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSubmissionKey = null; } else {
      this.flngSubmissionKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngHeaderNumber = null; } else {
      this.flngHeaderNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGross = null; } else {
      this.fcurTotalGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalEarnings = null; } else {
      this.fcurTotalEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPAYE = null; } else {
      this.fcurTotalPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChildSupport = null; } else {
      this.fcurTotalChildSupport = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalStudentLoan = null; } else {
      this.fcurTotalStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalKiwiSaverDeductions = null; } else {
      this.fcurTotalKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalKiwiSaverContribution = null; } else {
      this.fcurTotalKiwiSaverContribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalESCTDeductions = null; } else {
      this.fcurTotalESCTDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmountPayable = null; } else {
      this.fcurTotalAmountPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsDonations = null; } else {
      this.fcurTotalTaxCreditsDonations = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCreditsExtinguish = null; } else {
      this.fcurTotalTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalFamilyTaxCredits = null; } else {
      this.fcurTotalFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTAdjustments = null; } else {
      this.fcurESCTAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurESCTKiwiSaver = null; } else {
      this.fcurESCTKiwiSaver = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCompEmployerCont = null; } else {
      this.fcurTotalCompEmployerCont = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalVoluntaryEmployerCont = null; } else {
      this.fcurTotalVoluntaryEmployerCont = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSLCIRDeductions = null; } else {
      this.fcurTotalSLCIRDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSLBORDeductions = null; } else {
      this.fcurTotalSLBORDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalESSEarnings = null; } else {
      this.fcurTotalESSEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPriorPeriodGrossAdj = null; } else {
      this.fcurTotalPriorPeriodGrossAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPriorPeriodPAYEAdj = null; } else {
      this.fcurTotalPriorPeriodPAYEAdj = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaximumEarnings = null; } else {
      this.fcurMaximumEarnings = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrContactPhoneNumber = null; } else {
      this.fstrContactPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayrollPackage = null; } else {
      this.fstrPayrollPackage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayrollContactEmail = null; } else {
      this.fstrPayrollContactEmail = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDayFiler = null; } else {
      this.fblnPayDayFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayDueDate = null; } else {
      this.fdtmPayDayDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmMonthlyDueDate = null; } else {
      this.fdtmMonthlyDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmConsolidationDate = null; } else {
      this.fdtmConsolidationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicate = null; } else {
      this.fblnDuplicate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicateLineItems = null; } else {
      this.fblnDuplicateLineItems = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLineItemsProcessed = null; } else {
      this.fblnLineItemsProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProxyFieldsExpected = null; } else {
      this.fblnProxyFieldsExpected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultAssessment = null; } else {
      this.fblnDefaultAssessment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerGroup = null; } else {
      this.fstrEmployerGroup = __cur_str;
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
    tblnz_rtnpsoemployeesummary o = (tblnz_rtnpsoemployeesummary) super.clone();
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmOriginalSentToFIRST = (o.fdtmOriginalSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmOriginalSentToFIRST.clone() : null;
    o.fdtmLastSentToFIRST = (o.fdtmLastSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmLastSentToFIRST.clone() : null;
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmPayDayDueDate = (o.fdtmPayDayDueDate != null) ? (java.sql.Timestamp) o.fdtmPayDayDueDate.clone() : null;
    o.fdtmMonthlyDueDate = (o.fdtmMonthlyDueDate != null) ? (java.sql.Timestamp) o.fdtmMonthlyDueDate.clone() : null;
    o.fdtmConsolidationDate = (o.fdtmConsolidationDate != null) ? (java.sql.Timestamp) o.fdtmConsolidationDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpsoemployeesummary o) throws CloneNotSupportedException {
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmOriginalSentToFIRST = (o.fdtmOriginalSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmOriginalSentToFIRST.clone() : null;
    o.fdtmLastSentToFIRST = (o.fdtmLastSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmLastSentToFIRST.clone() : null;
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmPayDayDueDate = (o.fdtmPayDayDueDate != null) ? (java.sql.Timestamp) o.fdtmPayDayDueDate.clone() : null;
    o.fdtmMonthlyDueDate = (o.fdtmMonthlyDueDate != null) ? (java.sql.Timestamp) o.fdtmMonthlyDueDate.clone() : null;
    o.fdtmConsolidationDate = (o.fdtmConsolidationDate != null) ? (java.sql.Timestamp) o.fdtmConsolidationDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngSubmissionKey", this.flngSubmissionKey);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngHeaderNumber", this.flngHeaderNumber);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fdtmOriginalSentToFIRST", this.fdtmOriginalSentToFIRST);
    __sqoop$field_map.put("fdtmLastSentToFIRST", this.fdtmLastSentToFIRST);
    __sqoop$field_map.put("fblnFIRSTCnvError", this.fblnFIRSTCnvError);
    __sqoop$field_map.put("fblnFIRSTCnvErrorWorkItem", this.fblnFIRSTCnvErrorWorkItem);
    __sqoop$field_map.put("fblnFIRSTCnvErrorComplete", this.fblnFIRSTCnvErrorComplete);
    __sqoop$field_map.put("fcurTotalGross", this.fcurTotalGross);
    __sqoop$field_map.put("fcurTotalEarnings", this.fcurTotalEarnings);
    __sqoop$field_map.put("fcurTotalPAYE", this.fcurTotalPAYE);
    __sqoop$field_map.put("fcurTotalChildSupport", this.fcurTotalChildSupport);
    __sqoop$field_map.put("fcurTotalStudentLoan", this.fcurTotalStudentLoan);
    __sqoop$field_map.put("fcurTotalKiwiSaverDeductions", this.fcurTotalKiwiSaverDeductions);
    __sqoop$field_map.put("fcurTotalKiwiSaverContribution", this.fcurTotalKiwiSaverContribution);
    __sqoop$field_map.put("fcurTotalESCTDeductions", this.fcurTotalESCTDeductions);
    __sqoop$field_map.put("fcurTotalAmountPayable", this.fcurTotalAmountPayable);
    __sqoop$field_map.put("fcurTotalTaxCreditsDonations", this.fcurTotalTaxCreditsDonations);
    __sqoop$field_map.put("fcurTotalTaxCreditsExtinguish", this.fcurTotalTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurTotalFamilyTaxCredits", this.fcurTotalFamilyTaxCredits);
    __sqoop$field_map.put("fcurESCTAdjustments", this.fcurESCTAdjustments);
    __sqoop$field_map.put("fcurESCTKiwiSaver", this.fcurESCTKiwiSaver);
    __sqoop$field_map.put("fcurTotalCompEmployerCont", this.fcurTotalCompEmployerCont);
    __sqoop$field_map.put("fcurTotalVoluntaryEmployerCont", this.fcurTotalVoluntaryEmployerCont);
    __sqoop$field_map.put("fcurTotalSLCIRDeductions", this.fcurTotalSLCIRDeductions);
    __sqoop$field_map.put("fcurTotalSLBORDeductions", this.fcurTotalSLBORDeductions);
    __sqoop$field_map.put("fcurTotalESSEarnings", this.fcurTotalESSEarnings);
    __sqoop$field_map.put("fcurTotalPriorPeriodGrossAdj", this.fcurTotalPriorPeriodGrossAdj);
    __sqoop$field_map.put("fcurTotalPriorPeriodPAYEAdj", this.fcurTotalPriorPeriodPAYEAdj);
    __sqoop$field_map.put("fcurMaximumEarnings", this.fcurMaximumEarnings);
    __sqoop$field_map.put("fstrPIIRDNumber", this.fstrPIIRDNumber);
    __sqoop$field_map.put("fstrContactPhoneNumber", this.fstrContactPhoneNumber);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrPayrollPackage", this.fstrPayrollPackage);
    __sqoop$field_map.put("fstrPayrollContactEmail", this.fstrPayrollContactEmail);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnPaymentAttached", this.fblnPaymentAttached);
    __sqoop$field_map.put("fblnPayDayFiler", this.fblnPayDayFiler);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fdtmPayDayDueDate", this.fdtmPayDayDueDate);
    __sqoop$field_map.put("fdtmMonthlyDueDate", this.fdtmMonthlyDueDate);
    __sqoop$field_map.put("fdtmConsolidationDate", this.fdtmConsolidationDate);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fblnDuplicate", this.fblnDuplicate);
    __sqoop$field_map.put("fblnDuplicateLineItems", this.fblnDuplicateLineItems);
    __sqoop$field_map.put("fblnLineItemsProcessed", this.fblnLineItemsProcessed);
    __sqoop$field_map.put("fblnProxyFieldsExpected", this.fblnProxyFieldsExpected);
    __sqoop$field_map.put("fblnDefaultAssessment", this.fblnDefaultAssessment);
    __sqoop$field_map.put("fstrEmployerGroup", this.fstrEmployerGroup);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngSubmissionKey", this.flngSubmissionKey);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngHeaderNumber", this.flngHeaderNumber);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fdtmOriginalSentToFIRST", this.fdtmOriginalSentToFIRST);
    __sqoop$field_map.put("fdtmLastSentToFIRST", this.fdtmLastSentToFIRST);
    __sqoop$field_map.put("fblnFIRSTCnvError", this.fblnFIRSTCnvError);
    __sqoop$field_map.put("fblnFIRSTCnvErrorWorkItem", this.fblnFIRSTCnvErrorWorkItem);
    __sqoop$field_map.put("fblnFIRSTCnvErrorComplete", this.fblnFIRSTCnvErrorComplete);
    __sqoop$field_map.put("fcurTotalGross", this.fcurTotalGross);
    __sqoop$field_map.put("fcurTotalEarnings", this.fcurTotalEarnings);
    __sqoop$field_map.put("fcurTotalPAYE", this.fcurTotalPAYE);
    __sqoop$field_map.put("fcurTotalChildSupport", this.fcurTotalChildSupport);
    __sqoop$field_map.put("fcurTotalStudentLoan", this.fcurTotalStudentLoan);
    __sqoop$field_map.put("fcurTotalKiwiSaverDeductions", this.fcurTotalKiwiSaverDeductions);
    __sqoop$field_map.put("fcurTotalKiwiSaverContribution", this.fcurTotalKiwiSaverContribution);
    __sqoop$field_map.put("fcurTotalESCTDeductions", this.fcurTotalESCTDeductions);
    __sqoop$field_map.put("fcurTotalAmountPayable", this.fcurTotalAmountPayable);
    __sqoop$field_map.put("fcurTotalTaxCreditsDonations", this.fcurTotalTaxCreditsDonations);
    __sqoop$field_map.put("fcurTotalTaxCreditsExtinguish", this.fcurTotalTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurTotalFamilyTaxCredits", this.fcurTotalFamilyTaxCredits);
    __sqoop$field_map.put("fcurESCTAdjustments", this.fcurESCTAdjustments);
    __sqoop$field_map.put("fcurESCTKiwiSaver", this.fcurESCTKiwiSaver);
    __sqoop$field_map.put("fcurTotalCompEmployerCont", this.fcurTotalCompEmployerCont);
    __sqoop$field_map.put("fcurTotalVoluntaryEmployerCont", this.fcurTotalVoluntaryEmployerCont);
    __sqoop$field_map.put("fcurTotalSLCIRDeductions", this.fcurTotalSLCIRDeductions);
    __sqoop$field_map.put("fcurTotalSLBORDeductions", this.fcurTotalSLBORDeductions);
    __sqoop$field_map.put("fcurTotalESSEarnings", this.fcurTotalESSEarnings);
    __sqoop$field_map.put("fcurTotalPriorPeriodGrossAdj", this.fcurTotalPriorPeriodGrossAdj);
    __sqoop$field_map.put("fcurTotalPriorPeriodPAYEAdj", this.fcurTotalPriorPeriodPAYEAdj);
    __sqoop$field_map.put("fcurMaximumEarnings", this.fcurMaximumEarnings);
    __sqoop$field_map.put("fstrPIIRDNumber", this.fstrPIIRDNumber);
    __sqoop$field_map.put("fstrContactPhoneNumber", this.fstrContactPhoneNumber);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrPayrollPackage", this.fstrPayrollPackage);
    __sqoop$field_map.put("fstrPayrollContactEmail", this.fstrPayrollContactEmail);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fblnPaymentAttached", this.fblnPaymentAttached);
    __sqoop$field_map.put("fblnPayDayFiler", this.fblnPayDayFiler);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fdtmPayDayDueDate", this.fdtmPayDayDueDate);
    __sqoop$field_map.put("fdtmMonthlyDueDate", this.fdtmMonthlyDueDate);
    __sqoop$field_map.put("fdtmConsolidationDate", this.fdtmConsolidationDate);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fblnDuplicate", this.fblnDuplicate);
    __sqoop$field_map.put("fblnDuplicateLineItems", this.fblnDuplicateLineItems);
    __sqoop$field_map.put("fblnLineItemsProcessed", this.fblnLineItemsProcessed);
    __sqoop$field_map.put("fblnProxyFieldsExpected", this.fblnProxyFieldsExpected);
    __sqoop$field_map.put("fblnDefaultAssessment", this.fblnDefaultAssessment);
    __sqoop$field_map.put("fstrEmployerGroup", this.fstrEmployerGroup);
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
