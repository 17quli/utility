// ORM class for table 'tblnz_rtngst'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:15:26 NZDT 2020
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

public class tblnz_rtngst extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrRegistrationNo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrRegistrationNo = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFilingFreq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrFilingFreq = (String)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fblnNil", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnNil = (Integer)value;
      }
    });
    setters.put("fblnFinalReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnFinalReturn = (Integer)value;
      }
    });
    setters.put("fblnIncorrectForm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnIncorrectForm = (Integer)value;
      }
    });
    setters.put("fstrFormTypeFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrFormTypeFiled = (String)value;
      }
    });
    setters.put("fstrFormTypeExpected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrFormTypeExpected = (String)value;
      }
    });
    setters.put("fblnHospice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnHospice = (Integer)value;
      }
    });
    setters.put("fstrHospiceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrHospiceType = (String)value;
      }
    });
    setters.put("fblnProvisionalFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnProvisionalFiler = (Integer)value;
      }
    });
    setters.put("fstrProvisionalOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrProvisionalOption = (String)value;
      }
    });
    setters.put("fblnCompulsory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnCompulsory = (Integer)value;
      }
    });
    setters.put("fblnMultibranchFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnMultibranchFiler = (Integer)value;
      }
    });
    setters.put("fblnTransitionalReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnTransitionalReturn = (Integer)value;
      }
    });
    setters.put("fblnCorrespondence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnCorrespondence = (Integer)value;
      }
    });
    setters.put("fstrVendorID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrVendorID = (String)value;
      }
    });
    setters.put("fstrSoftwareProvider", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrSoftwareProvider = (String)value;
      }
    });
    setters.put("fstrWebLogonID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrWebLogonID = (String)value;
      }
    });
    setters.put("fblnQualifyRatio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fblnQualifyRatio = (Integer)value;
      }
    });
    setters.put("fcurRatio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurRatio = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGSTTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurGSTTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurTotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1TotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1TotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1ZeroSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1ZeroSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1IncomeCalculation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1IncomeCalculation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1GSTCollected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1GSTCollected = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1LongTermSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1LongTermSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1LongTermGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1LongTermGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1HospitalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1HospitalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1HospitalGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1HospitalGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1SalesAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1SalesAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1NetSalesAndIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1NetSalesAndIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1TotalExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1TotalExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1ExpensesCalculation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1ExpensesCalculation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1CreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1CreditAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1GSTCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1GSTCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP1TotalGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP1TotalGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2TotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2TotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2ZeroSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2ZeroSupplies = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2LongTermSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2LongTermSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2LongTermGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2LongTermGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2HospitalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2HospitalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2HospitalGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2HospitalGST = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2SalesAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2SalesAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2TotalExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2TotalExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurP2CreditAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurP2CreditAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTPreviousTotalSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTPreviousTotalSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTTotalBranchSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTTotalBranchSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTIncludeBranchesTSI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTIncludeBranchesTSI = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTAssetAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTAssetAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTLessAssetsTSI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTLessAssetsTSI = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTInstalmentDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTInstalmentDue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTVoluntaryAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTVoluntaryAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTRefundTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTRefundTransfer = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTGSTToPay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTGSTToPay = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTProvTaxDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTProvTaxDue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fcurPTPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtngst.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtngst() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtngst with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrRegistrationNo;
  public String get_fstrRegistrationNo() {
    return fstrRegistrationNo;
  }
  public void set_fstrRegistrationNo(String fstrRegistrationNo) {
    this.fstrRegistrationNo = fstrRegistrationNo;
  }
  public tblnz_rtngst with_fstrRegistrationNo(String fstrRegistrationNo) {
    this.fstrRegistrationNo = fstrRegistrationNo;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtngst with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrFilingFreq;
  public String get_fstrFilingFreq() {
    return fstrFilingFreq;
  }
  public void set_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
  }
  public tblnz_rtngst with_fstrFilingFreq(String fstrFilingFreq) {
    this.fstrFilingFreq = fstrFilingFreq;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_rtngst with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private Integer fblnNil;
  public Integer get_fblnNil() {
    return fblnNil;
  }
  public void set_fblnNil(Integer fblnNil) {
    this.fblnNil = fblnNil;
  }
  public tblnz_rtngst with_fblnNil(Integer fblnNil) {
    this.fblnNil = fblnNil;
    return this;
  }
  private Integer fblnFinalReturn;
  public Integer get_fblnFinalReturn() {
    return fblnFinalReturn;
  }
  public void set_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
  }
  public tblnz_rtngst with_fblnFinalReturn(Integer fblnFinalReturn) {
    this.fblnFinalReturn = fblnFinalReturn;
    return this;
  }
  private Integer fblnIncorrectForm;
  public Integer get_fblnIncorrectForm() {
    return fblnIncorrectForm;
  }
  public void set_fblnIncorrectForm(Integer fblnIncorrectForm) {
    this.fblnIncorrectForm = fblnIncorrectForm;
  }
  public tblnz_rtngst with_fblnIncorrectForm(Integer fblnIncorrectForm) {
    this.fblnIncorrectForm = fblnIncorrectForm;
    return this;
  }
  private String fstrFormTypeFiled;
  public String get_fstrFormTypeFiled() {
    return fstrFormTypeFiled;
  }
  public void set_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
  }
  public tblnz_rtngst with_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
    return this;
  }
  private String fstrFormTypeExpected;
  public String get_fstrFormTypeExpected() {
    return fstrFormTypeExpected;
  }
  public void set_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
  }
  public tblnz_rtngst with_fstrFormTypeExpected(String fstrFormTypeExpected) {
    this.fstrFormTypeExpected = fstrFormTypeExpected;
    return this;
  }
  private Integer fblnHospice;
  public Integer get_fblnHospice() {
    return fblnHospice;
  }
  public void set_fblnHospice(Integer fblnHospice) {
    this.fblnHospice = fblnHospice;
  }
  public tblnz_rtngst with_fblnHospice(Integer fblnHospice) {
    this.fblnHospice = fblnHospice;
    return this;
  }
  private String fstrHospiceType;
  public String get_fstrHospiceType() {
    return fstrHospiceType;
  }
  public void set_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
  }
  public tblnz_rtngst with_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
    return this;
  }
  private Integer fblnProvisionalFiler;
  public Integer get_fblnProvisionalFiler() {
    return fblnProvisionalFiler;
  }
  public void set_fblnProvisionalFiler(Integer fblnProvisionalFiler) {
    this.fblnProvisionalFiler = fblnProvisionalFiler;
  }
  public tblnz_rtngst with_fblnProvisionalFiler(Integer fblnProvisionalFiler) {
    this.fblnProvisionalFiler = fblnProvisionalFiler;
    return this;
  }
  private String fstrProvisionalOption;
  public String get_fstrProvisionalOption() {
    return fstrProvisionalOption;
  }
  public void set_fstrProvisionalOption(String fstrProvisionalOption) {
    this.fstrProvisionalOption = fstrProvisionalOption;
  }
  public tblnz_rtngst with_fstrProvisionalOption(String fstrProvisionalOption) {
    this.fstrProvisionalOption = fstrProvisionalOption;
    return this;
  }
  private Integer fblnCompulsory;
  public Integer get_fblnCompulsory() {
    return fblnCompulsory;
  }
  public void set_fblnCompulsory(Integer fblnCompulsory) {
    this.fblnCompulsory = fblnCompulsory;
  }
  public tblnz_rtngst with_fblnCompulsory(Integer fblnCompulsory) {
    this.fblnCompulsory = fblnCompulsory;
    return this;
  }
  private Integer fblnMultibranchFiler;
  public Integer get_fblnMultibranchFiler() {
    return fblnMultibranchFiler;
  }
  public void set_fblnMultibranchFiler(Integer fblnMultibranchFiler) {
    this.fblnMultibranchFiler = fblnMultibranchFiler;
  }
  public tblnz_rtngst with_fblnMultibranchFiler(Integer fblnMultibranchFiler) {
    this.fblnMultibranchFiler = fblnMultibranchFiler;
    return this;
  }
  private Integer fblnTransitionalReturn;
  public Integer get_fblnTransitionalReturn() {
    return fblnTransitionalReturn;
  }
  public void set_fblnTransitionalReturn(Integer fblnTransitionalReturn) {
    this.fblnTransitionalReturn = fblnTransitionalReturn;
  }
  public tblnz_rtngst with_fblnTransitionalReturn(Integer fblnTransitionalReturn) {
    this.fblnTransitionalReturn = fblnTransitionalReturn;
    return this;
  }
  private Integer fblnCorrespondence;
  public Integer get_fblnCorrespondence() {
    return fblnCorrespondence;
  }
  public void set_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
  }
  public tblnz_rtngst with_fblnCorrespondence(Integer fblnCorrespondence) {
    this.fblnCorrespondence = fblnCorrespondence;
    return this;
  }
  private String fstrVendorID;
  public String get_fstrVendorID() {
    return fstrVendorID;
  }
  public void set_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
  }
  public tblnz_rtngst with_fstrVendorID(String fstrVendorID) {
    this.fstrVendorID = fstrVendorID;
    return this;
  }
  private String fstrSoftwareProvider;
  public String get_fstrSoftwareProvider() {
    return fstrSoftwareProvider;
  }
  public void set_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
  }
  public tblnz_rtngst with_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
    return this;
  }
  private String fstrWebLogonID;
  public String get_fstrWebLogonID() {
    return fstrWebLogonID;
  }
  public void set_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
  }
  public tblnz_rtngst with_fstrWebLogonID(String fstrWebLogonID) {
    this.fstrWebLogonID = fstrWebLogonID;
    return this;
  }
  private Integer fblnQualifyRatio;
  public Integer get_fblnQualifyRatio() {
    return fblnQualifyRatio;
  }
  public void set_fblnQualifyRatio(Integer fblnQualifyRatio) {
    this.fblnQualifyRatio = fblnQualifyRatio;
  }
  public tblnz_rtngst with_fblnQualifyRatio(Integer fblnQualifyRatio) {
    this.fblnQualifyRatio = fblnQualifyRatio;
    return this;
  }
  private java.math.BigDecimal fcurRatio;
  public java.math.BigDecimal get_fcurRatio() {
    return fcurRatio;
  }
  public void set_fcurRatio(java.math.BigDecimal fcurRatio) {
    this.fcurRatio = fcurRatio;
  }
  public tblnz_rtngst with_fcurRatio(java.math.BigDecimal fcurRatio) {
    this.fcurRatio = fcurRatio;
    return this;
  }
  private java.math.BigDecimal fcurGSTTotal;
  public java.math.BigDecimal get_fcurGSTTotal() {
    return fcurGSTTotal;
  }
  public void set_fcurGSTTotal(java.math.BigDecimal fcurGSTTotal) {
    this.fcurGSTTotal = fcurGSTTotal;
  }
  public tblnz_rtngst with_fcurGSTTotal(java.math.BigDecimal fcurGSTTotal) {
    this.fcurGSTTotal = fcurGSTTotal;
    return this;
  }
  private java.math.BigDecimal fcurTotalSales;
  public java.math.BigDecimal get_fcurTotalSales() {
    return fcurTotalSales;
  }
  public void set_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
  }
  public tblnz_rtngst with_fcurTotalSales(java.math.BigDecimal fcurTotalSales) {
    this.fcurTotalSales = fcurTotalSales;
    return this;
  }
  private java.math.BigDecimal fcurP1TotalSales;
  public java.math.BigDecimal get_fcurP1TotalSales() {
    return fcurP1TotalSales;
  }
  public void set_fcurP1TotalSales(java.math.BigDecimal fcurP1TotalSales) {
    this.fcurP1TotalSales = fcurP1TotalSales;
  }
  public tblnz_rtngst with_fcurP1TotalSales(java.math.BigDecimal fcurP1TotalSales) {
    this.fcurP1TotalSales = fcurP1TotalSales;
    return this;
  }
  private java.math.BigDecimal fcurP1ZeroSupplies;
  public java.math.BigDecimal get_fcurP1ZeroSupplies() {
    return fcurP1ZeroSupplies;
  }
  public void set_fcurP1ZeroSupplies(java.math.BigDecimal fcurP1ZeroSupplies) {
    this.fcurP1ZeroSupplies = fcurP1ZeroSupplies;
  }
  public tblnz_rtngst with_fcurP1ZeroSupplies(java.math.BigDecimal fcurP1ZeroSupplies) {
    this.fcurP1ZeroSupplies = fcurP1ZeroSupplies;
    return this;
  }
  private java.math.BigDecimal fcurP1IncomeCalculation;
  public java.math.BigDecimal get_fcurP1IncomeCalculation() {
    return fcurP1IncomeCalculation;
  }
  public void set_fcurP1IncomeCalculation(java.math.BigDecimal fcurP1IncomeCalculation) {
    this.fcurP1IncomeCalculation = fcurP1IncomeCalculation;
  }
  public tblnz_rtngst with_fcurP1IncomeCalculation(java.math.BigDecimal fcurP1IncomeCalculation) {
    this.fcurP1IncomeCalculation = fcurP1IncomeCalculation;
    return this;
  }
  private java.math.BigDecimal fcurP1GSTCollected;
  public java.math.BigDecimal get_fcurP1GSTCollected() {
    return fcurP1GSTCollected;
  }
  public void set_fcurP1GSTCollected(java.math.BigDecimal fcurP1GSTCollected) {
    this.fcurP1GSTCollected = fcurP1GSTCollected;
  }
  public tblnz_rtngst with_fcurP1GSTCollected(java.math.BigDecimal fcurP1GSTCollected) {
    this.fcurP1GSTCollected = fcurP1GSTCollected;
    return this;
  }
  private java.math.BigDecimal fcurP1LongTermSales;
  public java.math.BigDecimal get_fcurP1LongTermSales() {
    return fcurP1LongTermSales;
  }
  public void set_fcurP1LongTermSales(java.math.BigDecimal fcurP1LongTermSales) {
    this.fcurP1LongTermSales = fcurP1LongTermSales;
  }
  public tblnz_rtngst with_fcurP1LongTermSales(java.math.BigDecimal fcurP1LongTermSales) {
    this.fcurP1LongTermSales = fcurP1LongTermSales;
    return this;
  }
  private java.math.BigDecimal fcurP1LongTermGST;
  public java.math.BigDecimal get_fcurP1LongTermGST() {
    return fcurP1LongTermGST;
  }
  public void set_fcurP1LongTermGST(java.math.BigDecimal fcurP1LongTermGST) {
    this.fcurP1LongTermGST = fcurP1LongTermGST;
  }
  public tblnz_rtngst with_fcurP1LongTermGST(java.math.BigDecimal fcurP1LongTermGST) {
    this.fcurP1LongTermGST = fcurP1LongTermGST;
    return this;
  }
  private java.math.BigDecimal fcurP1HospitalSales;
  public java.math.BigDecimal get_fcurP1HospitalSales() {
    return fcurP1HospitalSales;
  }
  public void set_fcurP1HospitalSales(java.math.BigDecimal fcurP1HospitalSales) {
    this.fcurP1HospitalSales = fcurP1HospitalSales;
  }
  public tblnz_rtngst with_fcurP1HospitalSales(java.math.BigDecimal fcurP1HospitalSales) {
    this.fcurP1HospitalSales = fcurP1HospitalSales;
    return this;
  }
  private java.math.BigDecimal fcurP1HospitalGST;
  public java.math.BigDecimal get_fcurP1HospitalGST() {
    return fcurP1HospitalGST;
  }
  public void set_fcurP1HospitalGST(java.math.BigDecimal fcurP1HospitalGST) {
    this.fcurP1HospitalGST = fcurP1HospitalGST;
  }
  public tblnz_rtngst with_fcurP1HospitalGST(java.math.BigDecimal fcurP1HospitalGST) {
    this.fcurP1HospitalGST = fcurP1HospitalGST;
    return this;
  }
  private java.math.BigDecimal fcurP1SalesAdjustments;
  public java.math.BigDecimal get_fcurP1SalesAdjustments() {
    return fcurP1SalesAdjustments;
  }
  public void set_fcurP1SalesAdjustments(java.math.BigDecimal fcurP1SalesAdjustments) {
    this.fcurP1SalesAdjustments = fcurP1SalesAdjustments;
  }
  public tblnz_rtngst with_fcurP1SalesAdjustments(java.math.BigDecimal fcurP1SalesAdjustments) {
    this.fcurP1SalesAdjustments = fcurP1SalesAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurP1NetSalesAndIncome;
  public java.math.BigDecimal get_fcurP1NetSalesAndIncome() {
    return fcurP1NetSalesAndIncome;
  }
  public void set_fcurP1NetSalesAndIncome(java.math.BigDecimal fcurP1NetSalesAndIncome) {
    this.fcurP1NetSalesAndIncome = fcurP1NetSalesAndIncome;
  }
  public tblnz_rtngst with_fcurP1NetSalesAndIncome(java.math.BigDecimal fcurP1NetSalesAndIncome) {
    this.fcurP1NetSalesAndIncome = fcurP1NetSalesAndIncome;
    return this;
  }
  private java.math.BigDecimal fcurP1TotalExpenses;
  public java.math.BigDecimal get_fcurP1TotalExpenses() {
    return fcurP1TotalExpenses;
  }
  public void set_fcurP1TotalExpenses(java.math.BigDecimal fcurP1TotalExpenses) {
    this.fcurP1TotalExpenses = fcurP1TotalExpenses;
  }
  public tblnz_rtngst with_fcurP1TotalExpenses(java.math.BigDecimal fcurP1TotalExpenses) {
    this.fcurP1TotalExpenses = fcurP1TotalExpenses;
    return this;
  }
  private java.math.BigDecimal fcurP1ExpensesCalculation;
  public java.math.BigDecimal get_fcurP1ExpensesCalculation() {
    return fcurP1ExpensesCalculation;
  }
  public void set_fcurP1ExpensesCalculation(java.math.BigDecimal fcurP1ExpensesCalculation) {
    this.fcurP1ExpensesCalculation = fcurP1ExpensesCalculation;
  }
  public tblnz_rtngst with_fcurP1ExpensesCalculation(java.math.BigDecimal fcurP1ExpensesCalculation) {
    this.fcurP1ExpensesCalculation = fcurP1ExpensesCalculation;
    return this;
  }
  private java.math.BigDecimal fcurP1CreditAdjustments;
  public java.math.BigDecimal get_fcurP1CreditAdjustments() {
    return fcurP1CreditAdjustments;
  }
  public void set_fcurP1CreditAdjustments(java.math.BigDecimal fcurP1CreditAdjustments) {
    this.fcurP1CreditAdjustments = fcurP1CreditAdjustments;
  }
  public tblnz_rtngst with_fcurP1CreditAdjustments(java.math.BigDecimal fcurP1CreditAdjustments) {
    this.fcurP1CreditAdjustments = fcurP1CreditAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurP1GSTCredit;
  public java.math.BigDecimal get_fcurP1GSTCredit() {
    return fcurP1GSTCredit;
  }
  public void set_fcurP1GSTCredit(java.math.BigDecimal fcurP1GSTCredit) {
    this.fcurP1GSTCredit = fcurP1GSTCredit;
  }
  public tblnz_rtngst with_fcurP1GSTCredit(java.math.BigDecimal fcurP1GSTCredit) {
    this.fcurP1GSTCredit = fcurP1GSTCredit;
    return this;
  }
  private java.math.BigDecimal fcurP1TotalGST;
  public java.math.BigDecimal get_fcurP1TotalGST() {
    return fcurP1TotalGST;
  }
  public void set_fcurP1TotalGST(java.math.BigDecimal fcurP1TotalGST) {
    this.fcurP1TotalGST = fcurP1TotalGST;
  }
  public tblnz_rtngst with_fcurP1TotalGST(java.math.BigDecimal fcurP1TotalGST) {
    this.fcurP1TotalGST = fcurP1TotalGST;
    return this;
  }
  private java.math.BigDecimal fcurP2TotalSales;
  public java.math.BigDecimal get_fcurP2TotalSales() {
    return fcurP2TotalSales;
  }
  public void set_fcurP2TotalSales(java.math.BigDecimal fcurP2TotalSales) {
    this.fcurP2TotalSales = fcurP2TotalSales;
  }
  public tblnz_rtngst with_fcurP2TotalSales(java.math.BigDecimal fcurP2TotalSales) {
    this.fcurP2TotalSales = fcurP2TotalSales;
    return this;
  }
  private java.math.BigDecimal fcurP2ZeroSupplies;
  public java.math.BigDecimal get_fcurP2ZeroSupplies() {
    return fcurP2ZeroSupplies;
  }
  public void set_fcurP2ZeroSupplies(java.math.BigDecimal fcurP2ZeroSupplies) {
    this.fcurP2ZeroSupplies = fcurP2ZeroSupplies;
  }
  public tblnz_rtngst with_fcurP2ZeroSupplies(java.math.BigDecimal fcurP2ZeroSupplies) {
    this.fcurP2ZeroSupplies = fcurP2ZeroSupplies;
    return this;
  }
  private java.math.BigDecimal fcurP2LongTermSales;
  public java.math.BigDecimal get_fcurP2LongTermSales() {
    return fcurP2LongTermSales;
  }
  public void set_fcurP2LongTermSales(java.math.BigDecimal fcurP2LongTermSales) {
    this.fcurP2LongTermSales = fcurP2LongTermSales;
  }
  public tblnz_rtngst with_fcurP2LongTermSales(java.math.BigDecimal fcurP2LongTermSales) {
    this.fcurP2LongTermSales = fcurP2LongTermSales;
    return this;
  }
  private java.math.BigDecimal fcurP2LongTermGST;
  public java.math.BigDecimal get_fcurP2LongTermGST() {
    return fcurP2LongTermGST;
  }
  public void set_fcurP2LongTermGST(java.math.BigDecimal fcurP2LongTermGST) {
    this.fcurP2LongTermGST = fcurP2LongTermGST;
  }
  public tblnz_rtngst with_fcurP2LongTermGST(java.math.BigDecimal fcurP2LongTermGST) {
    this.fcurP2LongTermGST = fcurP2LongTermGST;
    return this;
  }
  private java.math.BigDecimal fcurP2HospitalSales;
  public java.math.BigDecimal get_fcurP2HospitalSales() {
    return fcurP2HospitalSales;
  }
  public void set_fcurP2HospitalSales(java.math.BigDecimal fcurP2HospitalSales) {
    this.fcurP2HospitalSales = fcurP2HospitalSales;
  }
  public tblnz_rtngst with_fcurP2HospitalSales(java.math.BigDecimal fcurP2HospitalSales) {
    this.fcurP2HospitalSales = fcurP2HospitalSales;
    return this;
  }
  private java.math.BigDecimal fcurP2HospitalGST;
  public java.math.BigDecimal get_fcurP2HospitalGST() {
    return fcurP2HospitalGST;
  }
  public void set_fcurP2HospitalGST(java.math.BigDecimal fcurP2HospitalGST) {
    this.fcurP2HospitalGST = fcurP2HospitalGST;
  }
  public tblnz_rtngst with_fcurP2HospitalGST(java.math.BigDecimal fcurP2HospitalGST) {
    this.fcurP2HospitalGST = fcurP2HospitalGST;
    return this;
  }
  private java.math.BigDecimal fcurP2SalesAdjustments;
  public java.math.BigDecimal get_fcurP2SalesAdjustments() {
    return fcurP2SalesAdjustments;
  }
  public void set_fcurP2SalesAdjustments(java.math.BigDecimal fcurP2SalesAdjustments) {
    this.fcurP2SalesAdjustments = fcurP2SalesAdjustments;
  }
  public tblnz_rtngst with_fcurP2SalesAdjustments(java.math.BigDecimal fcurP2SalesAdjustments) {
    this.fcurP2SalesAdjustments = fcurP2SalesAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurP2TotalExpenses;
  public java.math.BigDecimal get_fcurP2TotalExpenses() {
    return fcurP2TotalExpenses;
  }
  public void set_fcurP2TotalExpenses(java.math.BigDecimal fcurP2TotalExpenses) {
    this.fcurP2TotalExpenses = fcurP2TotalExpenses;
  }
  public tblnz_rtngst with_fcurP2TotalExpenses(java.math.BigDecimal fcurP2TotalExpenses) {
    this.fcurP2TotalExpenses = fcurP2TotalExpenses;
    return this;
  }
  private java.math.BigDecimal fcurP2CreditAdjustments;
  public java.math.BigDecimal get_fcurP2CreditAdjustments() {
    return fcurP2CreditAdjustments;
  }
  public void set_fcurP2CreditAdjustments(java.math.BigDecimal fcurP2CreditAdjustments) {
    this.fcurP2CreditAdjustments = fcurP2CreditAdjustments;
  }
  public tblnz_rtngst with_fcurP2CreditAdjustments(java.math.BigDecimal fcurP2CreditAdjustments) {
    this.fcurP2CreditAdjustments = fcurP2CreditAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurPTPreviousTotalSales;
  public java.math.BigDecimal get_fcurPTPreviousTotalSales() {
    return fcurPTPreviousTotalSales;
  }
  public void set_fcurPTPreviousTotalSales(java.math.BigDecimal fcurPTPreviousTotalSales) {
    this.fcurPTPreviousTotalSales = fcurPTPreviousTotalSales;
  }
  public tblnz_rtngst with_fcurPTPreviousTotalSales(java.math.BigDecimal fcurPTPreviousTotalSales) {
    this.fcurPTPreviousTotalSales = fcurPTPreviousTotalSales;
    return this;
  }
  private java.math.BigDecimal fcurPTTotalBranchSales;
  public java.math.BigDecimal get_fcurPTTotalBranchSales() {
    return fcurPTTotalBranchSales;
  }
  public void set_fcurPTTotalBranchSales(java.math.BigDecimal fcurPTTotalBranchSales) {
    this.fcurPTTotalBranchSales = fcurPTTotalBranchSales;
  }
  public tblnz_rtngst with_fcurPTTotalBranchSales(java.math.BigDecimal fcurPTTotalBranchSales) {
    this.fcurPTTotalBranchSales = fcurPTTotalBranchSales;
    return this;
  }
  private java.math.BigDecimal fcurPTIncludeBranchesTSI;
  public java.math.BigDecimal get_fcurPTIncludeBranchesTSI() {
    return fcurPTIncludeBranchesTSI;
  }
  public void set_fcurPTIncludeBranchesTSI(java.math.BigDecimal fcurPTIncludeBranchesTSI) {
    this.fcurPTIncludeBranchesTSI = fcurPTIncludeBranchesTSI;
  }
  public tblnz_rtngst with_fcurPTIncludeBranchesTSI(java.math.BigDecimal fcurPTIncludeBranchesTSI) {
    this.fcurPTIncludeBranchesTSI = fcurPTIncludeBranchesTSI;
    return this;
  }
  private java.math.BigDecimal fcurPTAssetAdjustment;
  public java.math.BigDecimal get_fcurPTAssetAdjustment() {
    return fcurPTAssetAdjustment;
  }
  public void set_fcurPTAssetAdjustment(java.math.BigDecimal fcurPTAssetAdjustment) {
    this.fcurPTAssetAdjustment = fcurPTAssetAdjustment;
  }
  public tblnz_rtngst with_fcurPTAssetAdjustment(java.math.BigDecimal fcurPTAssetAdjustment) {
    this.fcurPTAssetAdjustment = fcurPTAssetAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurPTLessAssetsTSI;
  public java.math.BigDecimal get_fcurPTLessAssetsTSI() {
    return fcurPTLessAssetsTSI;
  }
  public void set_fcurPTLessAssetsTSI(java.math.BigDecimal fcurPTLessAssetsTSI) {
    this.fcurPTLessAssetsTSI = fcurPTLessAssetsTSI;
  }
  public tblnz_rtngst with_fcurPTLessAssetsTSI(java.math.BigDecimal fcurPTLessAssetsTSI) {
    this.fcurPTLessAssetsTSI = fcurPTLessAssetsTSI;
    return this;
  }
  private java.math.BigDecimal fcurPTInstalmentDue;
  public java.math.BigDecimal get_fcurPTInstalmentDue() {
    return fcurPTInstalmentDue;
  }
  public void set_fcurPTInstalmentDue(java.math.BigDecimal fcurPTInstalmentDue) {
    this.fcurPTInstalmentDue = fcurPTInstalmentDue;
  }
  public tblnz_rtngst with_fcurPTInstalmentDue(java.math.BigDecimal fcurPTInstalmentDue) {
    this.fcurPTInstalmentDue = fcurPTInstalmentDue;
    return this;
  }
  private java.math.BigDecimal fcurPTVoluntaryAmount;
  public java.math.BigDecimal get_fcurPTVoluntaryAmount() {
    return fcurPTVoluntaryAmount;
  }
  public void set_fcurPTVoluntaryAmount(java.math.BigDecimal fcurPTVoluntaryAmount) {
    this.fcurPTVoluntaryAmount = fcurPTVoluntaryAmount;
  }
  public tblnz_rtngst with_fcurPTVoluntaryAmount(java.math.BigDecimal fcurPTVoluntaryAmount) {
    this.fcurPTVoluntaryAmount = fcurPTVoluntaryAmount;
    return this;
  }
  private java.math.BigDecimal fcurPTRefundTransfer;
  public java.math.BigDecimal get_fcurPTRefundTransfer() {
    return fcurPTRefundTransfer;
  }
  public void set_fcurPTRefundTransfer(java.math.BigDecimal fcurPTRefundTransfer) {
    this.fcurPTRefundTransfer = fcurPTRefundTransfer;
  }
  public tblnz_rtngst with_fcurPTRefundTransfer(java.math.BigDecimal fcurPTRefundTransfer) {
    this.fcurPTRefundTransfer = fcurPTRefundTransfer;
    return this;
  }
  private java.math.BigDecimal fcurPTGSTToPay;
  public java.math.BigDecimal get_fcurPTGSTToPay() {
    return fcurPTGSTToPay;
  }
  public void set_fcurPTGSTToPay(java.math.BigDecimal fcurPTGSTToPay) {
    this.fcurPTGSTToPay = fcurPTGSTToPay;
  }
  public tblnz_rtngst with_fcurPTGSTToPay(java.math.BigDecimal fcurPTGSTToPay) {
    this.fcurPTGSTToPay = fcurPTGSTToPay;
    return this;
  }
  private java.math.BigDecimal fcurPTProvTaxDue;
  public java.math.BigDecimal get_fcurPTProvTaxDue() {
    return fcurPTProvTaxDue;
  }
  public void set_fcurPTProvTaxDue(java.math.BigDecimal fcurPTProvTaxDue) {
    this.fcurPTProvTaxDue = fcurPTProvTaxDue;
  }
  public tblnz_rtngst with_fcurPTProvTaxDue(java.math.BigDecimal fcurPTProvTaxDue) {
    this.fcurPTProvTaxDue = fcurPTProvTaxDue;
    return this;
  }
  private java.math.BigDecimal fcurPTPayment;
  public java.math.BigDecimal get_fcurPTPayment() {
    return fcurPTPayment;
  }
  public void set_fcurPTPayment(java.math.BigDecimal fcurPTPayment) {
    this.fcurPTPayment = fcurPTPayment;
  }
  public tblnz_rtngst with_fcurPTPayment(java.math.BigDecimal fcurPTPayment) {
    this.fcurPTPayment = fcurPTPayment;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtngst with_fstrWho(String fstrWho) {
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
  public tblnz_rtngst with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngst)) {
      return false;
    }
    tblnz_rtngst that = (tblnz_rtngst) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRegistrationNo == null ? that.fstrRegistrationNo == null : this.fstrRegistrationNo.equals(that.fstrRegistrationNo));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fblnNil == null ? that.fblnNil == null : this.fblnNil.equals(that.fblnNil));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnIncorrectForm == null ? that.fblnIncorrectForm == null : this.fblnIncorrectForm.equals(that.fblnIncorrectForm));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fblnHospice == null ? that.fblnHospice == null : this.fblnHospice.equals(that.fblnHospice));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fblnProvisionalFiler == null ? that.fblnProvisionalFiler == null : this.fblnProvisionalFiler.equals(that.fblnProvisionalFiler));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fblnCompulsory == null ? that.fblnCompulsory == null : this.fblnCompulsory.equals(that.fblnCompulsory));
    equal = equal && (this.fblnMultibranchFiler == null ? that.fblnMultibranchFiler == null : this.fblnMultibranchFiler.equals(that.fblnMultibranchFiler));
    equal = equal && (this.fblnTransitionalReturn == null ? that.fblnTransitionalReturn == null : this.fblnTransitionalReturn.equals(that.fblnTransitionalReturn));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fblnQualifyRatio == null ? that.fblnQualifyRatio == null : this.fblnQualifyRatio.equals(that.fblnQualifyRatio));
    equal = equal && (this.fcurRatio == null ? that.fcurRatio == null : this.fcurRatio.equals(that.fcurRatio));
    equal = equal && (this.fcurGSTTotal == null ? that.fcurGSTTotal == null : this.fcurGSTTotal.equals(that.fcurGSTTotal));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurP1TotalSales == null ? that.fcurP1TotalSales == null : this.fcurP1TotalSales.equals(that.fcurP1TotalSales));
    equal = equal && (this.fcurP1ZeroSupplies == null ? that.fcurP1ZeroSupplies == null : this.fcurP1ZeroSupplies.equals(that.fcurP1ZeroSupplies));
    equal = equal && (this.fcurP1IncomeCalculation == null ? that.fcurP1IncomeCalculation == null : this.fcurP1IncomeCalculation.equals(that.fcurP1IncomeCalculation));
    equal = equal && (this.fcurP1GSTCollected == null ? that.fcurP1GSTCollected == null : this.fcurP1GSTCollected.equals(that.fcurP1GSTCollected));
    equal = equal && (this.fcurP1LongTermSales == null ? that.fcurP1LongTermSales == null : this.fcurP1LongTermSales.equals(that.fcurP1LongTermSales));
    equal = equal && (this.fcurP1LongTermGST == null ? that.fcurP1LongTermGST == null : this.fcurP1LongTermGST.equals(that.fcurP1LongTermGST));
    equal = equal && (this.fcurP1HospitalSales == null ? that.fcurP1HospitalSales == null : this.fcurP1HospitalSales.equals(that.fcurP1HospitalSales));
    equal = equal && (this.fcurP1HospitalGST == null ? that.fcurP1HospitalGST == null : this.fcurP1HospitalGST.equals(that.fcurP1HospitalGST));
    equal = equal && (this.fcurP1SalesAdjustments == null ? that.fcurP1SalesAdjustments == null : this.fcurP1SalesAdjustments.equals(that.fcurP1SalesAdjustments));
    equal = equal && (this.fcurP1NetSalesAndIncome == null ? that.fcurP1NetSalesAndIncome == null : this.fcurP1NetSalesAndIncome.equals(that.fcurP1NetSalesAndIncome));
    equal = equal && (this.fcurP1TotalExpenses == null ? that.fcurP1TotalExpenses == null : this.fcurP1TotalExpenses.equals(that.fcurP1TotalExpenses));
    equal = equal && (this.fcurP1ExpensesCalculation == null ? that.fcurP1ExpensesCalculation == null : this.fcurP1ExpensesCalculation.equals(that.fcurP1ExpensesCalculation));
    equal = equal && (this.fcurP1CreditAdjustments == null ? that.fcurP1CreditAdjustments == null : this.fcurP1CreditAdjustments.equals(that.fcurP1CreditAdjustments));
    equal = equal && (this.fcurP1GSTCredit == null ? that.fcurP1GSTCredit == null : this.fcurP1GSTCredit.equals(that.fcurP1GSTCredit));
    equal = equal && (this.fcurP1TotalGST == null ? that.fcurP1TotalGST == null : this.fcurP1TotalGST.equals(that.fcurP1TotalGST));
    equal = equal && (this.fcurP2TotalSales == null ? that.fcurP2TotalSales == null : this.fcurP2TotalSales.equals(that.fcurP2TotalSales));
    equal = equal && (this.fcurP2ZeroSupplies == null ? that.fcurP2ZeroSupplies == null : this.fcurP2ZeroSupplies.equals(that.fcurP2ZeroSupplies));
    equal = equal && (this.fcurP2LongTermSales == null ? that.fcurP2LongTermSales == null : this.fcurP2LongTermSales.equals(that.fcurP2LongTermSales));
    equal = equal && (this.fcurP2LongTermGST == null ? that.fcurP2LongTermGST == null : this.fcurP2LongTermGST.equals(that.fcurP2LongTermGST));
    equal = equal && (this.fcurP2HospitalSales == null ? that.fcurP2HospitalSales == null : this.fcurP2HospitalSales.equals(that.fcurP2HospitalSales));
    equal = equal && (this.fcurP2HospitalGST == null ? that.fcurP2HospitalGST == null : this.fcurP2HospitalGST.equals(that.fcurP2HospitalGST));
    equal = equal && (this.fcurP2SalesAdjustments == null ? that.fcurP2SalesAdjustments == null : this.fcurP2SalesAdjustments.equals(that.fcurP2SalesAdjustments));
    equal = equal && (this.fcurP2TotalExpenses == null ? that.fcurP2TotalExpenses == null : this.fcurP2TotalExpenses.equals(that.fcurP2TotalExpenses));
    equal = equal && (this.fcurP2CreditAdjustments == null ? that.fcurP2CreditAdjustments == null : this.fcurP2CreditAdjustments.equals(that.fcurP2CreditAdjustments));
    equal = equal && (this.fcurPTPreviousTotalSales == null ? that.fcurPTPreviousTotalSales == null : this.fcurPTPreviousTotalSales.equals(that.fcurPTPreviousTotalSales));
    equal = equal && (this.fcurPTTotalBranchSales == null ? that.fcurPTTotalBranchSales == null : this.fcurPTTotalBranchSales.equals(that.fcurPTTotalBranchSales));
    equal = equal && (this.fcurPTIncludeBranchesTSI == null ? that.fcurPTIncludeBranchesTSI == null : this.fcurPTIncludeBranchesTSI.equals(that.fcurPTIncludeBranchesTSI));
    equal = equal && (this.fcurPTAssetAdjustment == null ? that.fcurPTAssetAdjustment == null : this.fcurPTAssetAdjustment.equals(that.fcurPTAssetAdjustment));
    equal = equal && (this.fcurPTLessAssetsTSI == null ? that.fcurPTLessAssetsTSI == null : this.fcurPTLessAssetsTSI.equals(that.fcurPTLessAssetsTSI));
    equal = equal && (this.fcurPTInstalmentDue == null ? that.fcurPTInstalmentDue == null : this.fcurPTInstalmentDue.equals(that.fcurPTInstalmentDue));
    equal = equal && (this.fcurPTVoluntaryAmount == null ? that.fcurPTVoluntaryAmount == null : this.fcurPTVoluntaryAmount.equals(that.fcurPTVoluntaryAmount));
    equal = equal && (this.fcurPTRefundTransfer == null ? that.fcurPTRefundTransfer == null : this.fcurPTRefundTransfer.equals(that.fcurPTRefundTransfer));
    equal = equal && (this.fcurPTGSTToPay == null ? that.fcurPTGSTToPay == null : this.fcurPTGSTToPay.equals(that.fcurPTGSTToPay));
    equal = equal && (this.fcurPTProvTaxDue == null ? that.fcurPTProvTaxDue == null : this.fcurPTProvTaxDue.equals(that.fcurPTProvTaxDue));
    equal = equal && (this.fcurPTPayment == null ? that.fcurPTPayment == null : this.fcurPTPayment.equals(that.fcurPTPayment));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtngst)) {
      return false;
    }
    tblnz_rtngst that = (tblnz_rtngst) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrRegistrationNo == null ? that.fstrRegistrationNo == null : this.fstrRegistrationNo.equals(that.fstrRegistrationNo));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrFilingFreq == null ? that.fstrFilingFreq == null : this.fstrFilingFreq.equals(that.fstrFilingFreq));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fblnNil == null ? that.fblnNil == null : this.fblnNil.equals(that.fblnNil));
    equal = equal && (this.fblnFinalReturn == null ? that.fblnFinalReturn == null : this.fblnFinalReturn.equals(that.fblnFinalReturn));
    equal = equal && (this.fblnIncorrectForm == null ? that.fblnIncorrectForm == null : this.fblnIncorrectForm.equals(that.fblnIncorrectForm));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrFormTypeExpected == null ? that.fstrFormTypeExpected == null : this.fstrFormTypeExpected.equals(that.fstrFormTypeExpected));
    equal = equal && (this.fblnHospice == null ? that.fblnHospice == null : this.fblnHospice.equals(that.fblnHospice));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fblnProvisionalFiler == null ? that.fblnProvisionalFiler == null : this.fblnProvisionalFiler.equals(that.fblnProvisionalFiler));
    equal = equal && (this.fstrProvisionalOption == null ? that.fstrProvisionalOption == null : this.fstrProvisionalOption.equals(that.fstrProvisionalOption));
    equal = equal && (this.fblnCompulsory == null ? that.fblnCompulsory == null : this.fblnCompulsory.equals(that.fblnCompulsory));
    equal = equal && (this.fblnMultibranchFiler == null ? that.fblnMultibranchFiler == null : this.fblnMultibranchFiler.equals(that.fblnMultibranchFiler));
    equal = equal && (this.fblnTransitionalReturn == null ? that.fblnTransitionalReturn == null : this.fblnTransitionalReturn.equals(that.fblnTransitionalReturn));
    equal = equal && (this.fblnCorrespondence == null ? that.fblnCorrespondence == null : this.fblnCorrespondence.equals(that.fblnCorrespondence));
    equal = equal && (this.fstrVendorID == null ? that.fstrVendorID == null : this.fstrVendorID.equals(that.fstrVendorID));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrWebLogonID == null ? that.fstrWebLogonID == null : this.fstrWebLogonID.equals(that.fstrWebLogonID));
    equal = equal && (this.fblnQualifyRatio == null ? that.fblnQualifyRatio == null : this.fblnQualifyRatio.equals(that.fblnQualifyRatio));
    equal = equal && (this.fcurRatio == null ? that.fcurRatio == null : this.fcurRatio.equals(that.fcurRatio));
    equal = equal && (this.fcurGSTTotal == null ? that.fcurGSTTotal == null : this.fcurGSTTotal.equals(that.fcurGSTTotal));
    equal = equal && (this.fcurTotalSales == null ? that.fcurTotalSales == null : this.fcurTotalSales.equals(that.fcurTotalSales));
    equal = equal && (this.fcurP1TotalSales == null ? that.fcurP1TotalSales == null : this.fcurP1TotalSales.equals(that.fcurP1TotalSales));
    equal = equal && (this.fcurP1ZeroSupplies == null ? that.fcurP1ZeroSupplies == null : this.fcurP1ZeroSupplies.equals(that.fcurP1ZeroSupplies));
    equal = equal && (this.fcurP1IncomeCalculation == null ? that.fcurP1IncomeCalculation == null : this.fcurP1IncomeCalculation.equals(that.fcurP1IncomeCalculation));
    equal = equal && (this.fcurP1GSTCollected == null ? that.fcurP1GSTCollected == null : this.fcurP1GSTCollected.equals(that.fcurP1GSTCollected));
    equal = equal && (this.fcurP1LongTermSales == null ? that.fcurP1LongTermSales == null : this.fcurP1LongTermSales.equals(that.fcurP1LongTermSales));
    equal = equal && (this.fcurP1LongTermGST == null ? that.fcurP1LongTermGST == null : this.fcurP1LongTermGST.equals(that.fcurP1LongTermGST));
    equal = equal && (this.fcurP1HospitalSales == null ? that.fcurP1HospitalSales == null : this.fcurP1HospitalSales.equals(that.fcurP1HospitalSales));
    equal = equal && (this.fcurP1HospitalGST == null ? that.fcurP1HospitalGST == null : this.fcurP1HospitalGST.equals(that.fcurP1HospitalGST));
    equal = equal && (this.fcurP1SalesAdjustments == null ? that.fcurP1SalesAdjustments == null : this.fcurP1SalesAdjustments.equals(that.fcurP1SalesAdjustments));
    equal = equal && (this.fcurP1NetSalesAndIncome == null ? that.fcurP1NetSalesAndIncome == null : this.fcurP1NetSalesAndIncome.equals(that.fcurP1NetSalesAndIncome));
    equal = equal && (this.fcurP1TotalExpenses == null ? that.fcurP1TotalExpenses == null : this.fcurP1TotalExpenses.equals(that.fcurP1TotalExpenses));
    equal = equal && (this.fcurP1ExpensesCalculation == null ? that.fcurP1ExpensesCalculation == null : this.fcurP1ExpensesCalculation.equals(that.fcurP1ExpensesCalculation));
    equal = equal && (this.fcurP1CreditAdjustments == null ? that.fcurP1CreditAdjustments == null : this.fcurP1CreditAdjustments.equals(that.fcurP1CreditAdjustments));
    equal = equal && (this.fcurP1GSTCredit == null ? that.fcurP1GSTCredit == null : this.fcurP1GSTCredit.equals(that.fcurP1GSTCredit));
    equal = equal && (this.fcurP1TotalGST == null ? that.fcurP1TotalGST == null : this.fcurP1TotalGST.equals(that.fcurP1TotalGST));
    equal = equal && (this.fcurP2TotalSales == null ? that.fcurP2TotalSales == null : this.fcurP2TotalSales.equals(that.fcurP2TotalSales));
    equal = equal && (this.fcurP2ZeroSupplies == null ? that.fcurP2ZeroSupplies == null : this.fcurP2ZeroSupplies.equals(that.fcurP2ZeroSupplies));
    equal = equal && (this.fcurP2LongTermSales == null ? that.fcurP2LongTermSales == null : this.fcurP2LongTermSales.equals(that.fcurP2LongTermSales));
    equal = equal && (this.fcurP2LongTermGST == null ? that.fcurP2LongTermGST == null : this.fcurP2LongTermGST.equals(that.fcurP2LongTermGST));
    equal = equal && (this.fcurP2HospitalSales == null ? that.fcurP2HospitalSales == null : this.fcurP2HospitalSales.equals(that.fcurP2HospitalSales));
    equal = equal && (this.fcurP2HospitalGST == null ? that.fcurP2HospitalGST == null : this.fcurP2HospitalGST.equals(that.fcurP2HospitalGST));
    equal = equal && (this.fcurP2SalesAdjustments == null ? that.fcurP2SalesAdjustments == null : this.fcurP2SalesAdjustments.equals(that.fcurP2SalesAdjustments));
    equal = equal && (this.fcurP2TotalExpenses == null ? that.fcurP2TotalExpenses == null : this.fcurP2TotalExpenses.equals(that.fcurP2TotalExpenses));
    equal = equal && (this.fcurP2CreditAdjustments == null ? that.fcurP2CreditAdjustments == null : this.fcurP2CreditAdjustments.equals(that.fcurP2CreditAdjustments));
    equal = equal && (this.fcurPTPreviousTotalSales == null ? that.fcurPTPreviousTotalSales == null : this.fcurPTPreviousTotalSales.equals(that.fcurPTPreviousTotalSales));
    equal = equal && (this.fcurPTTotalBranchSales == null ? that.fcurPTTotalBranchSales == null : this.fcurPTTotalBranchSales.equals(that.fcurPTTotalBranchSales));
    equal = equal && (this.fcurPTIncludeBranchesTSI == null ? that.fcurPTIncludeBranchesTSI == null : this.fcurPTIncludeBranchesTSI.equals(that.fcurPTIncludeBranchesTSI));
    equal = equal && (this.fcurPTAssetAdjustment == null ? that.fcurPTAssetAdjustment == null : this.fcurPTAssetAdjustment.equals(that.fcurPTAssetAdjustment));
    equal = equal && (this.fcurPTLessAssetsTSI == null ? that.fcurPTLessAssetsTSI == null : this.fcurPTLessAssetsTSI.equals(that.fcurPTLessAssetsTSI));
    equal = equal && (this.fcurPTInstalmentDue == null ? that.fcurPTInstalmentDue == null : this.fcurPTInstalmentDue.equals(that.fcurPTInstalmentDue));
    equal = equal && (this.fcurPTVoluntaryAmount == null ? that.fcurPTVoluntaryAmount == null : this.fcurPTVoluntaryAmount.equals(that.fcurPTVoluntaryAmount));
    equal = equal && (this.fcurPTRefundTransfer == null ? that.fcurPTRefundTransfer == null : this.fcurPTRefundTransfer.equals(that.fcurPTRefundTransfer));
    equal = equal && (this.fcurPTGSTToPay == null ? that.fcurPTGSTToPay == null : this.fcurPTGSTToPay.equals(that.fcurPTGSTToPay));
    equal = equal && (this.fcurPTProvTaxDue == null ? that.fcurPTProvTaxDue == null : this.fcurPTProvTaxDue.equals(that.fcurPTProvTaxDue));
    equal = equal && (this.fcurPTPayment == null ? that.fcurPTPayment == null : this.fcurPTPayment.equals(that.fcurPTPayment));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRegistrationNo = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnNil = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnIncorrectForm = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnHospice = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(12, __dbResults);
    this.fblnProvisionalFiler = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnCompulsory = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMultibranchFiler = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnTransitionalReturn = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnQualifyRatio = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fcurRatio = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurGSTTotal = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurP1TotalSales = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurP1ZeroSupplies = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurP1IncomeCalculation = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurP1GSTCollected = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurP1LongTermSales = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurP1LongTermGST = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurP1HospitalSales = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurP1HospitalGST = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurP1SalesAdjustments = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurP1NetSalesAndIncome = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurP1TotalExpenses = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurP1ExpensesCalculation = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurP1CreditAdjustments = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurP1GSTCredit = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurP1TotalGST = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurP2TotalSales = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurP2ZeroSupplies = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurP2LongTermSales = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurP2LongTermGST = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurP2HospitalSales = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurP2HospitalGST = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurP2SalesAdjustments = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurP2TotalExpenses = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurP2CreditAdjustments = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurPTPreviousTotalSales = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurPTTotalBranchSales = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurPTIncludeBranchesTSI = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurPTAssetAdjustment = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurPTLessAssetsTSI = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurPTInstalmentDue = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurPTVoluntaryAmount = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurPTRefundTransfer = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurPTGSTToPay = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurPTProvTaxDue = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurPTPayment = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(61, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(62, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRegistrationNo = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrFilingFreq = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnNil = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnFinalReturn = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnIncorrectForm = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrFormTypeExpected = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnHospice = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(12, __dbResults);
    this.fblnProvisionalFiler = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrProvisionalOption = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnCompulsory = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMultibranchFiler = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnTransitionalReturn = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCorrespondence = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrVendorID = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWebLogonID = JdbcWritableBridge.readString(21, __dbResults);
    this.fblnQualifyRatio = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fcurRatio = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurGSTTotal = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurTotalSales = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurP1TotalSales = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurP1ZeroSupplies = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurP1IncomeCalculation = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurP1GSTCollected = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurP1LongTermSales = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurP1LongTermGST = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurP1HospitalSales = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurP1HospitalGST = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurP1SalesAdjustments = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurP1NetSalesAndIncome = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurP1TotalExpenses = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurP1ExpensesCalculation = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurP1CreditAdjustments = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurP1GSTCredit = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurP1TotalGST = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurP2TotalSales = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurP2ZeroSupplies = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurP2LongTermSales = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurP2LongTermGST = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurP2HospitalSales = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurP2HospitalGST = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurP2SalesAdjustments = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurP2TotalExpenses = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurP2CreditAdjustments = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurPTPreviousTotalSales = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurPTTotalBranchSales = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurPTIncludeBranchesTSI = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurPTAssetAdjustment = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurPTLessAssetsTSI = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurPTInstalmentDue = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurPTVoluntaryAmount = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurPTRefundTransfer = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurPTGSTToPay = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurPTProvTaxDue = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurPTPayment = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(61, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(62, __dbResults);
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
    JdbcWritableBridge.writeString(fstrRegistrationNo, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNil, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncorrectForm, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospice, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisionalFiler, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCompulsory, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultibranchFiler, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransitionalReturn, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnQualifyRatio, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRatio, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTTotal, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalSales, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1ZeroSupplies, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1IncomeCalculation, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1GSTCollected, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1LongTermSales, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1LongTermGST, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1HospitalSales, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1HospitalGST, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1SalesAdjustments, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1NetSalesAndIncome, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalExpenses, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1ExpensesCalculation, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1CreditAdjustments, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1GSTCredit, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalGST, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalSales, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2ZeroSupplies, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermSales, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermGST, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalSales, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalGST, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2SalesAdjustments, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalExpenses, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2CreditAdjustments, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTPreviousTotalSales, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTTotalBranchSales, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTIncludeBranchesTSI, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTAssetAdjustment, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTLessAssetsTSI, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTInstalmentDue, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTVoluntaryAmount, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRefundTransfer, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTGSTToPay, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTProvTaxDue, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTPayment, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 62 + __off, 93, __dbStmt);
    return 62;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegistrationNo, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFreq, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNil, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinalReturn, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncorrectForm, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeExpected, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospice, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisionalFiler, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrProvisionalOption, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCompulsory, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultibranchFiler, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransitionalReturn, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCorrespondence, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVendorID, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonID, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnQualifyRatio, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRatio, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTTotal, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalSales, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalSales, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1ZeroSupplies, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1IncomeCalculation, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1GSTCollected, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1LongTermSales, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1LongTermGST, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1HospitalSales, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1HospitalGST, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1SalesAdjustments, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1NetSalesAndIncome, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalExpenses, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1ExpensesCalculation, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1CreditAdjustments, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1GSTCredit, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP1TotalGST, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalSales, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2ZeroSupplies, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermSales, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2LongTermGST, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalSales, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2HospitalGST, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2SalesAdjustments, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2TotalExpenses, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurP2CreditAdjustments, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTPreviousTotalSales, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTTotalBranchSales, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTIncludeBranchesTSI, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTAssetAdjustment, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTLessAssetsTSI, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTInstalmentDue, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTVoluntaryAmount, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTRefundTransfer, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTGSTToPay, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTProvTaxDue, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTPayment, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 62 + __off, 93, __dbStmt);
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
        this.fstrRegistrationNo = null;
    } else {
    this.fstrRegistrationNo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFreq = null;
    } else {
    this.fstrFilingFreq = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNil = null;
    } else {
    this.fblnNil = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFinalReturn = null;
    } else {
    this.fblnFinalReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIncorrectForm = null;
    } else {
    this.fblnIncorrectForm = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeFiled = null;
    } else {
    this.fstrFormTypeFiled = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeExpected = null;
    } else {
    this.fstrFormTypeExpected = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHospice = null;
    } else {
    this.fblnHospice = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHospiceType = null;
    } else {
    this.fstrHospiceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProvisionalFiler = null;
    } else {
    this.fblnProvisionalFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProvisionalOption = null;
    } else {
    this.fstrProvisionalOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCompulsory = null;
    } else {
    this.fblnCompulsory = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMultibranchFiler = null;
    } else {
    this.fblnMultibranchFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransitionalReturn = null;
    } else {
    this.fblnTransitionalReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCorrespondence = null;
    } else {
    this.fblnCorrespondence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVendorID = null;
    } else {
    this.fstrVendorID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwareProvider = null;
    } else {
    this.fstrSoftwareProvider = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebLogonID = null;
    } else {
    this.fstrWebLogonID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnQualifyRatio = null;
    } else {
    this.fblnQualifyRatio = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRatio = null;
    } else {
    this.fcurRatio = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGSTTotal = null;
    } else {
    this.fcurGSTTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalSales = null;
    } else {
    this.fcurTotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1TotalSales = null;
    } else {
    this.fcurP1TotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1ZeroSupplies = null;
    } else {
    this.fcurP1ZeroSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1IncomeCalculation = null;
    } else {
    this.fcurP1IncomeCalculation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1GSTCollected = null;
    } else {
    this.fcurP1GSTCollected = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1LongTermSales = null;
    } else {
    this.fcurP1LongTermSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1LongTermGST = null;
    } else {
    this.fcurP1LongTermGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1HospitalSales = null;
    } else {
    this.fcurP1HospitalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1HospitalGST = null;
    } else {
    this.fcurP1HospitalGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1SalesAdjustments = null;
    } else {
    this.fcurP1SalesAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1NetSalesAndIncome = null;
    } else {
    this.fcurP1NetSalesAndIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1TotalExpenses = null;
    } else {
    this.fcurP1TotalExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1ExpensesCalculation = null;
    } else {
    this.fcurP1ExpensesCalculation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1CreditAdjustments = null;
    } else {
    this.fcurP1CreditAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1GSTCredit = null;
    } else {
    this.fcurP1GSTCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP1TotalGST = null;
    } else {
    this.fcurP1TotalGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2TotalSales = null;
    } else {
    this.fcurP2TotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2ZeroSupplies = null;
    } else {
    this.fcurP2ZeroSupplies = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2LongTermSales = null;
    } else {
    this.fcurP2LongTermSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2LongTermGST = null;
    } else {
    this.fcurP2LongTermGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2HospitalSales = null;
    } else {
    this.fcurP2HospitalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2HospitalGST = null;
    } else {
    this.fcurP2HospitalGST = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2SalesAdjustments = null;
    } else {
    this.fcurP2SalesAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2TotalExpenses = null;
    } else {
    this.fcurP2TotalExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurP2CreditAdjustments = null;
    } else {
    this.fcurP2CreditAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTPreviousTotalSales = null;
    } else {
    this.fcurPTPreviousTotalSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTTotalBranchSales = null;
    } else {
    this.fcurPTTotalBranchSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTIncludeBranchesTSI = null;
    } else {
    this.fcurPTIncludeBranchesTSI = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTAssetAdjustment = null;
    } else {
    this.fcurPTAssetAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTLessAssetsTSI = null;
    } else {
    this.fcurPTLessAssetsTSI = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTInstalmentDue = null;
    } else {
    this.fcurPTInstalmentDue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTVoluntaryAmount = null;
    } else {
    this.fcurPTVoluntaryAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTRefundTransfer = null;
    } else {
    this.fcurPTRefundTransfer = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTGSTToPay = null;
    } else {
    this.fcurPTGSTToPay = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTProvTaxDue = null;
    } else {
    this.fcurPTProvTaxDue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTPayment = null;
    } else {
    this.fcurPTPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fstrRegistrationNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationNo);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fblnNil) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNil);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnIncorrectForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncorrectForm);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fblnHospice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospice);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fblnProvisionalFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisionalFiler);
    }
    if (null == this.fstrProvisionalOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProvisionalOption);
    }
    if (null == this.fblnCompulsory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCompulsory);
    }
    if (null == this.fblnMultibranchFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultibranchFiler);
    }
    if (null == this.fblnTransitionalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransitionalReturn);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fblnQualifyRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnQualifyRatio);
    }
    if (null == this.fcurRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRatio, __dataOut);
    }
    if (null == this.fcurGSTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTTotal, __dataOut);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurP1TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalSales, __dataOut);
    }
    if (null == this.fcurP1ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP1IncomeCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1IncomeCalculation, __dataOut);
    }
    if (null == this.fcurP1GSTCollected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1GSTCollected, __dataOut);
    }
    if (null == this.fcurP1LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1LongTermSales, __dataOut);
    }
    if (null == this.fcurP1LongTermGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1LongTermGST, __dataOut);
    }
    if (null == this.fcurP1HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1HospitalSales, __dataOut);
    }
    if (null == this.fcurP1HospitalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1HospitalGST, __dataOut);
    }
    if (null == this.fcurP1SalesAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1SalesAdjustments, __dataOut);
    }
    if (null == this.fcurP1NetSalesAndIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1NetSalesAndIncome, __dataOut);
    }
    if (null == this.fcurP1TotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalExpenses, __dataOut);
    }
    if (null == this.fcurP1ExpensesCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1ExpensesCalculation, __dataOut);
    }
    if (null == this.fcurP1CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1CreditAdjustments, __dataOut);
    }
    if (null == this.fcurP1GSTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1GSTCredit, __dataOut);
    }
    if (null == this.fcurP1TotalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalGST, __dataOut);
    }
    if (null == this.fcurP2TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalSales, __dataOut);
    }
    if (null == this.fcurP2ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP2LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermSales, __dataOut);
    }
    if (null == this.fcurP2LongTermGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermGST, __dataOut);
    }
    if (null == this.fcurP2HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalSales, __dataOut);
    }
    if (null == this.fcurP2HospitalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalGST, __dataOut);
    }
    if (null == this.fcurP2SalesAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2SalesAdjustments, __dataOut);
    }
    if (null == this.fcurP2TotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalExpenses, __dataOut);
    }
    if (null == this.fcurP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2CreditAdjustments, __dataOut);
    }
    if (null == this.fcurPTPreviousTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTPreviousTotalSales, __dataOut);
    }
    if (null == this.fcurPTTotalBranchSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTTotalBranchSales, __dataOut);
    }
    if (null == this.fcurPTIncludeBranchesTSI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTIncludeBranchesTSI, __dataOut);
    }
    if (null == this.fcurPTAssetAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTAssetAdjustment, __dataOut);
    }
    if (null == this.fcurPTLessAssetsTSI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTLessAssetsTSI, __dataOut);
    }
    if (null == this.fcurPTInstalmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTInstalmentDue, __dataOut);
    }
    if (null == this.fcurPTVoluntaryAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTVoluntaryAmount, __dataOut);
    }
    if (null == this.fcurPTRefundTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRefundTransfer, __dataOut);
    }
    if (null == this.fcurPTGSTToPay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTGSTToPay, __dataOut);
    }
    if (null == this.fcurPTProvTaxDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTProvTaxDue, __dataOut);
    }
    if (null == this.fcurPTPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTPayment, __dataOut);
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
    if (null == this.fstrRegistrationNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegistrationNo);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrFilingFreq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFreq);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fblnNil) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNil);
    }
    if (null == this.fblnFinalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinalReturn);
    }
    if (null == this.fblnIncorrectForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncorrectForm);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
    }
    if (null == this.fstrFormTypeExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeExpected);
    }
    if (null == this.fblnHospice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospice);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fblnProvisionalFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisionalFiler);
    }
    if (null == this.fstrProvisionalOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProvisionalOption);
    }
    if (null == this.fblnCompulsory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCompulsory);
    }
    if (null == this.fblnMultibranchFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultibranchFiler);
    }
    if (null == this.fblnTransitionalReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransitionalReturn);
    }
    if (null == this.fblnCorrespondence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCorrespondence);
    }
    if (null == this.fstrVendorID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVendorID);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrWebLogonID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonID);
    }
    if (null == this.fblnQualifyRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnQualifyRatio);
    }
    if (null == this.fcurRatio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRatio, __dataOut);
    }
    if (null == this.fcurGSTTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTTotal, __dataOut);
    }
    if (null == this.fcurTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalSales, __dataOut);
    }
    if (null == this.fcurP1TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalSales, __dataOut);
    }
    if (null == this.fcurP1ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP1IncomeCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1IncomeCalculation, __dataOut);
    }
    if (null == this.fcurP1GSTCollected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1GSTCollected, __dataOut);
    }
    if (null == this.fcurP1LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1LongTermSales, __dataOut);
    }
    if (null == this.fcurP1LongTermGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1LongTermGST, __dataOut);
    }
    if (null == this.fcurP1HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1HospitalSales, __dataOut);
    }
    if (null == this.fcurP1HospitalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1HospitalGST, __dataOut);
    }
    if (null == this.fcurP1SalesAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1SalesAdjustments, __dataOut);
    }
    if (null == this.fcurP1NetSalesAndIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1NetSalesAndIncome, __dataOut);
    }
    if (null == this.fcurP1TotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalExpenses, __dataOut);
    }
    if (null == this.fcurP1ExpensesCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1ExpensesCalculation, __dataOut);
    }
    if (null == this.fcurP1CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1CreditAdjustments, __dataOut);
    }
    if (null == this.fcurP1GSTCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1GSTCredit, __dataOut);
    }
    if (null == this.fcurP1TotalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP1TotalGST, __dataOut);
    }
    if (null == this.fcurP2TotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalSales, __dataOut);
    }
    if (null == this.fcurP2ZeroSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2ZeroSupplies, __dataOut);
    }
    if (null == this.fcurP2LongTermSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermSales, __dataOut);
    }
    if (null == this.fcurP2LongTermGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2LongTermGST, __dataOut);
    }
    if (null == this.fcurP2HospitalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalSales, __dataOut);
    }
    if (null == this.fcurP2HospitalGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2HospitalGST, __dataOut);
    }
    if (null == this.fcurP2SalesAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2SalesAdjustments, __dataOut);
    }
    if (null == this.fcurP2TotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2TotalExpenses, __dataOut);
    }
    if (null == this.fcurP2CreditAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurP2CreditAdjustments, __dataOut);
    }
    if (null == this.fcurPTPreviousTotalSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTPreviousTotalSales, __dataOut);
    }
    if (null == this.fcurPTTotalBranchSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTTotalBranchSales, __dataOut);
    }
    if (null == this.fcurPTIncludeBranchesTSI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTIncludeBranchesTSI, __dataOut);
    }
    if (null == this.fcurPTAssetAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTAssetAdjustment, __dataOut);
    }
    if (null == this.fcurPTLessAssetsTSI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTLessAssetsTSI, __dataOut);
    }
    if (null == this.fcurPTInstalmentDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTInstalmentDue, __dataOut);
    }
    if (null == this.fcurPTVoluntaryAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTVoluntaryAmount, __dataOut);
    }
    if (null == this.fcurPTRefundTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTRefundTransfer, __dataOut);
    }
    if (null == this.fcurPTGSTToPay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTGSTToPay, __dataOut);
    }
    if (null == this.fcurPTProvTaxDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTProvTaxDue, __dataOut);
    }
    if (null == this.fcurPTPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTPayment, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationNo==null?"\\N":fstrRegistrationNo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNil==null?"\\N":"" + fblnNil, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncorrectForm==null?"\\N":"" + fblnIncorrectForm, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospice==null?"\\N":"" + fblnHospice, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisionalFiler==null?"\\N":"" + fblnProvisionalFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProvisionalOption==null?"\\N":fstrProvisionalOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCompulsory==null?"\\N":"" + fblnCompulsory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultibranchFiler==null?"\\N":"" + fblnMultibranchFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransitionalReturn==null?"\\N":"" + fblnTransitionalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorID==null?"\\N":fstrVendorID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnQualifyRatio==null?"\\N":"" + fblnQualifyRatio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRatio==null?"\\N":fcurRatio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTTotal==null?"\\N":fcurGSTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalSales==null?"\\N":fcurP1TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1ZeroSupplies==null?"\\N":fcurP1ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1IncomeCalculation==null?"\\N":fcurP1IncomeCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1GSTCollected==null?"\\N":fcurP1GSTCollected.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1LongTermSales==null?"\\N":fcurP1LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1LongTermGST==null?"\\N":fcurP1LongTermGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1HospitalSales==null?"\\N":fcurP1HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1HospitalGST==null?"\\N":fcurP1HospitalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1SalesAdjustments==null?"\\N":fcurP1SalesAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1NetSalesAndIncome==null?"\\N":fcurP1NetSalesAndIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalExpenses==null?"\\N":fcurP1TotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1ExpensesCalculation==null?"\\N":fcurP1ExpensesCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1CreditAdjustments==null?"\\N":fcurP1CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1GSTCredit==null?"\\N":fcurP1GSTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalGST==null?"\\N":fcurP1TotalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalSales==null?"\\N":fcurP2TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2ZeroSupplies==null?"\\N":fcurP2ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermSales==null?"\\N":fcurP2LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermGST==null?"\\N":fcurP2LongTermGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalSales==null?"\\N":fcurP2HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalGST==null?"\\N":fcurP2HospitalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2SalesAdjustments==null?"\\N":fcurP2SalesAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalExpenses==null?"\\N":fcurP2TotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2CreditAdjustments==null?"\\N":fcurP2CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTPreviousTotalSales==null?"\\N":fcurPTPreviousTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTTotalBranchSales==null?"\\N":fcurPTTotalBranchSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTIncludeBranchesTSI==null?"\\N":fcurPTIncludeBranchesTSI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTAssetAdjustment==null?"\\N":fcurPTAssetAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTLessAssetsTSI==null?"\\N":fcurPTLessAssetsTSI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTInstalmentDue==null?"\\N":fcurPTInstalmentDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTVoluntaryAmount==null?"\\N":fcurPTVoluntaryAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRefundTransfer==null?"\\N":fcurPTRefundTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTGSTToPay==null?"\\N":fcurPTGSTToPay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTProvTaxDue==null?"\\N":fcurPTProvTaxDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTPayment==null?"\\N":fcurPTPayment.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegistrationNo==null?"\\N":fstrRegistrationNo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFreq==null?"\\N":fstrFilingFreq, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNil==null?"\\N":"" + fblnNil, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinalReturn==null?"\\N":"" + fblnFinalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncorrectForm==null?"\\N":"" + fblnIncorrectForm, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeExpected==null?"\\N":fstrFormTypeExpected, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospice==null?"\\N":"" + fblnHospice, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisionalFiler==null?"\\N":"" + fblnProvisionalFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProvisionalOption==null?"\\N":fstrProvisionalOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCompulsory==null?"\\N":"" + fblnCompulsory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultibranchFiler==null?"\\N":"" + fblnMultibranchFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransitionalReturn==null?"\\N":"" + fblnTransitionalReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCorrespondence==null?"\\N":"" + fblnCorrespondence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVendorID==null?"\\N":fstrVendorID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonID==null?"\\N":fstrWebLogonID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnQualifyRatio==null?"\\N":"" + fblnQualifyRatio, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRatio==null?"\\N":fcurRatio.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTTotal==null?"\\N":fcurGSTTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalSales==null?"\\N":fcurTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalSales==null?"\\N":fcurP1TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1ZeroSupplies==null?"\\N":fcurP1ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1IncomeCalculation==null?"\\N":fcurP1IncomeCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1GSTCollected==null?"\\N":fcurP1GSTCollected.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1LongTermSales==null?"\\N":fcurP1LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1LongTermGST==null?"\\N":fcurP1LongTermGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1HospitalSales==null?"\\N":fcurP1HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1HospitalGST==null?"\\N":fcurP1HospitalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1SalesAdjustments==null?"\\N":fcurP1SalesAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1NetSalesAndIncome==null?"\\N":fcurP1NetSalesAndIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalExpenses==null?"\\N":fcurP1TotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1ExpensesCalculation==null?"\\N":fcurP1ExpensesCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1CreditAdjustments==null?"\\N":fcurP1CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1GSTCredit==null?"\\N":fcurP1GSTCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP1TotalGST==null?"\\N":fcurP1TotalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalSales==null?"\\N":fcurP2TotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2ZeroSupplies==null?"\\N":fcurP2ZeroSupplies.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermSales==null?"\\N":fcurP2LongTermSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2LongTermGST==null?"\\N":fcurP2LongTermGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalSales==null?"\\N":fcurP2HospitalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2HospitalGST==null?"\\N":fcurP2HospitalGST.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2SalesAdjustments==null?"\\N":fcurP2SalesAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2TotalExpenses==null?"\\N":fcurP2TotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurP2CreditAdjustments==null?"\\N":fcurP2CreditAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTPreviousTotalSales==null?"\\N":fcurPTPreviousTotalSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTTotalBranchSales==null?"\\N":fcurPTTotalBranchSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTIncludeBranchesTSI==null?"\\N":fcurPTIncludeBranchesTSI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTAssetAdjustment==null?"\\N":fcurPTAssetAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTLessAssetsTSI==null?"\\N":fcurPTLessAssetsTSI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTInstalmentDue==null?"\\N":fcurPTInstalmentDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTVoluntaryAmount==null?"\\N":fcurPTVoluntaryAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTRefundTransfer==null?"\\N":fcurPTRefundTransfer.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTGSTToPay==null?"\\N":fcurPTGSTToPay.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTProvTaxDue==null?"\\N":fcurPTProvTaxDue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTPayment==null?"\\N":fcurPTPayment.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.fstrRegistrationNo = null; } else {
      this.fstrRegistrationNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNil = null; } else {
      this.fblnNil = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalReturn = null; } else {
      this.fblnFinalReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncorrectForm = null; } else {
      this.fblnIncorrectForm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospice = null; } else {
      this.fblnHospice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisionalFiler = null; } else {
      this.fblnProvisionalFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProvisionalOption = null; } else {
      this.fstrProvisionalOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCompulsory = null; } else {
      this.fblnCompulsory = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultibranchFiler = null; } else {
      this.fblnMultibranchFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransitionalReturn = null; } else {
      this.fblnTransitionalReturn = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareProvider = null; } else {
      this.fstrSoftwareProvider = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnQualifyRatio = null; } else {
      this.fblnQualifyRatio = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRatio = null; } else {
      this.fcurRatio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTTotal = null; } else {
      this.fcurGSTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalSales = null; } else {
      this.fcurP1TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1ZeroSupplies = null; } else {
      this.fcurP1ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1IncomeCalculation = null; } else {
      this.fcurP1IncomeCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1GSTCollected = null; } else {
      this.fcurP1GSTCollected = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1LongTermSales = null; } else {
      this.fcurP1LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1LongTermGST = null; } else {
      this.fcurP1LongTermGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1HospitalSales = null; } else {
      this.fcurP1HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1HospitalGST = null; } else {
      this.fcurP1HospitalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1SalesAdjustments = null; } else {
      this.fcurP1SalesAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1NetSalesAndIncome = null; } else {
      this.fcurP1NetSalesAndIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalExpenses = null; } else {
      this.fcurP1TotalExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1ExpensesCalculation = null; } else {
      this.fcurP1ExpensesCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1CreditAdjustments = null; } else {
      this.fcurP1CreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1GSTCredit = null; } else {
      this.fcurP1GSTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalGST = null; } else {
      this.fcurP1TotalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalSales = null; } else {
      this.fcurP2TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2ZeroSupplies = null; } else {
      this.fcurP2ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermSales = null; } else {
      this.fcurP2LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermGST = null; } else {
      this.fcurP2LongTermGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalSales = null; } else {
      this.fcurP2HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalGST = null; } else {
      this.fcurP2HospitalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2SalesAdjustments = null; } else {
      this.fcurP2SalesAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalExpenses = null; } else {
      this.fcurP2TotalExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2CreditAdjustments = null; } else {
      this.fcurP2CreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTPreviousTotalSales = null; } else {
      this.fcurPTPreviousTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTTotalBranchSales = null; } else {
      this.fcurPTTotalBranchSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTIncludeBranchesTSI = null; } else {
      this.fcurPTIncludeBranchesTSI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTAssetAdjustment = null; } else {
      this.fcurPTAssetAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTLessAssetsTSI = null; } else {
      this.fcurPTLessAssetsTSI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTInstalmentDue = null; } else {
      this.fcurPTInstalmentDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTVoluntaryAmount = null; } else {
      this.fcurPTVoluntaryAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRefundTransfer = null; } else {
      this.fcurPTRefundTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTGSTToPay = null; } else {
      this.fcurPTGSTToPay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTProvTaxDue = null; } else {
      this.fcurPTProvTaxDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTPayment = null; } else {
      this.fcurPTPayment = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRegistrationNo = null; } else {
      this.fstrRegistrationNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFreq = null; } else {
      this.fstrFilingFreq = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNil = null; } else {
      this.fblnNil = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinalReturn = null; } else {
      this.fblnFinalReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncorrectForm = null; } else {
      this.fblnIncorrectForm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeExpected = null; } else {
      this.fstrFormTypeExpected = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospice = null; } else {
      this.fblnHospice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisionalFiler = null; } else {
      this.fblnProvisionalFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProvisionalOption = null; } else {
      this.fstrProvisionalOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCompulsory = null; } else {
      this.fblnCompulsory = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultibranchFiler = null; } else {
      this.fblnMultibranchFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransitionalReturn = null; } else {
      this.fblnTransitionalReturn = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVendorID = null; } else {
      this.fstrVendorID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareProvider = null; } else {
      this.fstrSoftwareProvider = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonID = null; } else {
      this.fstrWebLogonID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnQualifyRatio = null; } else {
      this.fblnQualifyRatio = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRatio = null; } else {
      this.fcurRatio = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTTotal = null; } else {
      this.fcurGSTTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalSales = null; } else {
      this.fcurTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalSales = null; } else {
      this.fcurP1TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1ZeroSupplies = null; } else {
      this.fcurP1ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1IncomeCalculation = null; } else {
      this.fcurP1IncomeCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1GSTCollected = null; } else {
      this.fcurP1GSTCollected = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1LongTermSales = null; } else {
      this.fcurP1LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1LongTermGST = null; } else {
      this.fcurP1LongTermGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1HospitalSales = null; } else {
      this.fcurP1HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1HospitalGST = null; } else {
      this.fcurP1HospitalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1SalesAdjustments = null; } else {
      this.fcurP1SalesAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1NetSalesAndIncome = null; } else {
      this.fcurP1NetSalesAndIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalExpenses = null; } else {
      this.fcurP1TotalExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1ExpensesCalculation = null; } else {
      this.fcurP1ExpensesCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1CreditAdjustments = null; } else {
      this.fcurP1CreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1GSTCredit = null; } else {
      this.fcurP1GSTCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP1TotalGST = null; } else {
      this.fcurP1TotalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalSales = null; } else {
      this.fcurP2TotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2ZeroSupplies = null; } else {
      this.fcurP2ZeroSupplies = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermSales = null; } else {
      this.fcurP2LongTermSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2LongTermGST = null; } else {
      this.fcurP2LongTermGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalSales = null; } else {
      this.fcurP2HospitalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2HospitalGST = null; } else {
      this.fcurP2HospitalGST = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2SalesAdjustments = null; } else {
      this.fcurP2SalesAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2TotalExpenses = null; } else {
      this.fcurP2TotalExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurP2CreditAdjustments = null; } else {
      this.fcurP2CreditAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTPreviousTotalSales = null; } else {
      this.fcurPTPreviousTotalSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTTotalBranchSales = null; } else {
      this.fcurPTTotalBranchSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTIncludeBranchesTSI = null; } else {
      this.fcurPTIncludeBranchesTSI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTAssetAdjustment = null; } else {
      this.fcurPTAssetAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTLessAssetsTSI = null; } else {
      this.fcurPTLessAssetsTSI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTInstalmentDue = null; } else {
      this.fcurPTInstalmentDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTVoluntaryAmount = null; } else {
      this.fcurPTVoluntaryAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTRefundTransfer = null; } else {
      this.fcurPTRefundTransfer = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTGSTToPay = null; } else {
      this.fcurPTGSTToPay = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTProvTaxDue = null; } else {
      this.fcurPTProvTaxDue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTPayment = null; } else {
      this.fcurPTPayment = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtngst o = (tblnz_rtngst) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtngst o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRegistrationNo", this.fstrRegistrationNo);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fblnNil", this.fblnNil);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnIncorrectForm", this.fblnIncorrectForm);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fblnHospice", this.fblnHospice);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fblnProvisionalFiler", this.fblnProvisionalFiler);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fblnCompulsory", this.fblnCompulsory);
    __sqoop$field_map.put("fblnMultibranchFiler", this.fblnMultibranchFiler);
    __sqoop$field_map.put("fblnTransitionalReturn", this.fblnTransitionalReturn);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fblnQualifyRatio", this.fblnQualifyRatio);
    __sqoop$field_map.put("fcurRatio", this.fcurRatio);
    __sqoop$field_map.put("fcurGSTTotal", this.fcurGSTTotal);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurP1TotalSales", this.fcurP1TotalSales);
    __sqoop$field_map.put("fcurP1ZeroSupplies", this.fcurP1ZeroSupplies);
    __sqoop$field_map.put("fcurP1IncomeCalculation", this.fcurP1IncomeCalculation);
    __sqoop$field_map.put("fcurP1GSTCollected", this.fcurP1GSTCollected);
    __sqoop$field_map.put("fcurP1LongTermSales", this.fcurP1LongTermSales);
    __sqoop$field_map.put("fcurP1LongTermGST", this.fcurP1LongTermGST);
    __sqoop$field_map.put("fcurP1HospitalSales", this.fcurP1HospitalSales);
    __sqoop$field_map.put("fcurP1HospitalGST", this.fcurP1HospitalGST);
    __sqoop$field_map.put("fcurP1SalesAdjustments", this.fcurP1SalesAdjustments);
    __sqoop$field_map.put("fcurP1NetSalesAndIncome", this.fcurP1NetSalesAndIncome);
    __sqoop$field_map.put("fcurP1TotalExpenses", this.fcurP1TotalExpenses);
    __sqoop$field_map.put("fcurP1ExpensesCalculation", this.fcurP1ExpensesCalculation);
    __sqoop$field_map.put("fcurP1CreditAdjustments", this.fcurP1CreditAdjustments);
    __sqoop$field_map.put("fcurP1GSTCredit", this.fcurP1GSTCredit);
    __sqoop$field_map.put("fcurP1TotalGST", this.fcurP1TotalGST);
    __sqoop$field_map.put("fcurP2TotalSales", this.fcurP2TotalSales);
    __sqoop$field_map.put("fcurP2ZeroSupplies", this.fcurP2ZeroSupplies);
    __sqoop$field_map.put("fcurP2LongTermSales", this.fcurP2LongTermSales);
    __sqoop$field_map.put("fcurP2LongTermGST", this.fcurP2LongTermGST);
    __sqoop$field_map.put("fcurP2HospitalSales", this.fcurP2HospitalSales);
    __sqoop$field_map.put("fcurP2HospitalGST", this.fcurP2HospitalGST);
    __sqoop$field_map.put("fcurP2SalesAdjustments", this.fcurP2SalesAdjustments);
    __sqoop$field_map.put("fcurP2TotalExpenses", this.fcurP2TotalExpenses);
    __sqoop$field_map.put("fcurP2CreditAdjustments", this.fcurP2CreditAdjustments);
    __sqoop$field_map.put("fcurPTPreviousTotalSales", this.fcurPTPreviousTotalSales);
    __sqoop$field_map.put("fcurPTTotalBranchSales", this.fcurPTTotalBranchSales);
    __sqoop$field_map.put("fcurPTIncludeBranchesTSI", this.fcurPTIncludeBranchesTSI);
    __sqoop$field_map.put("fcurPTAssetAdjustment", this.fcurPTAssetAdjustment);
    __sqoop$field_map.put("fcurPTLessAssetsTSI", this.fcurPTLessAssetsTSI);
    __sqoop$field_map.put("fcurPTInstalmentDue", this.fcurPTInstalmentDue);
    __sqoop$field_map.put("fcurPTVoluntaryAmount", this.fcurPTVoluntaryAmount);
    __sqoop$field_map.put("fcurPTRefundTransfer", this.fcurPTRefundTransfer);
    __sqoop$field_map.put("fcurPTGSTToPay", this.fcurPTGSTToPay);
    __sqoop$field_map.put("fcurPTProvTaxDue", this.fcurPTProvTaxDue);
    __sqoop$field_map.put("fcurPTPayment", this.fcurPTPayment);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrRegistrationNo", this.fstrRegistrationNo);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrFilingFreq", this.fstrFilingFreq);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fblnNil", this.fblnNil);
    __sqoop$field_map.put("fblnFinalReturn", this.fblnFinalReturn);
    __sqoop$field_map.put("fblnIncorrectForm", this.fblnIncorrectForm);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrFormTypeExpected", this.fstrFormTypeExpected);
    __sqoop$field_map.put("fblnHospice", this.fblnHospice);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fblnProvisionalFiler", this.fblnProvisionalFiler);
    __sqoop$field_map.put("fstrProvisionalOption", this.fstrProvisionalOption);
    __sqoop$field_map.put("fblnCompulsory", this.fblnCompulsory);
    __sqoop$field_map.put("fblnMultibranchFiler", this.fblnMultibranchFiler);
    __sqoop$field_map.put("fblnTransitionalReturn", this.fblnTransitionalReturn);
    __sqoop$field_map.put("fblnCorrespondence", this.fblnCorrespondence);
    __sqoop$field_map.put("fstrVendorID", this.fstrVendorID);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrWebLogonID", this.fstrWebLogonID);
    __sqoop$field_map.put("fblnQualifyRatio", this.fblnQualifyRatio);
    __sqoop$field_map.put("fcurRatio", this.fcurRatio);
    __sqoop$field_map.put("fcurGSTTotal", this.fcurGSTTotal);
    __sqoop$field_map.put("fcurTotalSales", this.fcurTotalSales);
    __sqoop$field_map.put("fcurP1TotalSales", this.fcurP1TotalSales);
    __sqoop$field_map.put("fcurP1ZeroSupplies", this.fcurP1ZeroSupplies);
    __sqoop$field_map.put("fcurP1IncomeCalculation", this.fcurP1IncomeCalculation);
    __sqoop$field_map.put("fcurP1GSTCollected", this.fcurP1GSTCollected);
    __sqoop$field_map.put("fcurP1LongTermSales", this.fcurP1LongTermSales);
    __sqoop$field_map.put("fcurP1LongTermGST", this.fcurP1LongTermGST);
    __sqoop$field_map.put("fcurP1HospitalSales", this.fcurP1HospitalSales);
    __sqoop$field_map.put("fcurP1HospitalGST", this.fcurP1HospitalGST);
    __sqoop$field_map.put("fcurP1SalesAdjustments", this.fcurP1SalesAdjustments);
    __sqoop$field_map.put("fcurP1NetSalesAndIncome", this.fcurP1NetSalesAndIncome);
    __sqoop$field_map.put("fcurP1TotalExpenses", this.fcurP1TotalExpenses);
    __sqoop$field_map.put("fcurP1ExpensesCalculation", this.fcurP1ExpensesCalculation);
    __sqoop$field_map.put("fcurP1CreditAdjustments", this.fcurP1CreditAdjustments);
    __sqoop$field_map.put("fcurP1GSTCredit", this.fcurP1GSTCredit);
    __sqoop$field_map.put("fcurP1TotalGST", this.fcurP1TotalGST);
    __sqoop$field_map.put("fcurP2TotalSales", this.fcurP2TotalSales);
    __sqoop$field_map.put("fcurP2ZeroSupplies", this.fcurP2ZeroSupplies);
    __sqoop$field_map.put("fcurP2LongTermSales", this.fcurP2LongTermSales);
    __sqoop$field_map.put("fcurP2LongTermGST", this.fcurP2LongTermGST);
    __sqoop$field_map.put("fcurP2HospitalSales", this.fcurP2HospitalSales);
    __sqoop$field_map.put("fcurP2HospitalGST", this.fcurP2HospitalGST);
    __sqoop$field_map.put("fcurP2SalesAdjustments", this.fcurP2SalesAdjustments);
    __sqoop$field_map.put("fcurP2TotalExpenses", this.fcurP2TotalExpenses);
    __sqoop$field_map.put("fcurP2CreditAdjustments", this.fcurP2CreditAdjustments);
    __sqoop$field_map.put("fcurPTPreviousTotalSales", this.fcurPTPreviousTotalSales);
    __sqoop$field_map.put("fcurPTTotalBranchSales", this.fcurPTTotalBranchSales);
    __sqoop$field_map.put("fcurPTIncludeBranchesTSI", this.fcurPTIncludeBranchesTSI);
    __sqoop$field_map.put("fcurPTAssetAdjustment", this.fcurPTAssetAdjustment);
    __sqoop$field_map.put("fcurPTLessAssetsTSI", this.fcurPTLessAssetsTSI);
    __sqoop$field_map.put("fcurPTInstalmentDue", this.fcurPTInstalmentDue);
    __sqoop$field_map.put("fcurPTVoluntaryAmount", this.fcurPTVoluntaryAmount);
    __sqoop$field_map.put("fcurPTRefundTransfer", this.fcurPTRefundTransfer);
    __sqoop$field_map.put("fcurPTGSTToPay", this.fcurPTGSTToPay);
    __sqoop$field_map.put("fcurPTProvTaxDue", this.fcurPTProvTaxDue);
    __sqoop$field_map.put("fcurPTPayment", this.fcurPTPayment);
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
