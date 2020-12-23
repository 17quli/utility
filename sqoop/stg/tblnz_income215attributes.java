// ORM class for table 'tblnz_income215attributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:19:21 NZDT 2020
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

public class tblnz_income215attributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fcurTotalChildPassiveIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurTotalChildPassiveIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrSpouseName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fstrSpouseName = (String)value;
      }
    });
    setters.put("fstrPartnersIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fstrPartnersIRDNumber = (String)value;
      }
    });
    setters.put("fstrSpouseCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fstrSpouseCountry = (String)value;
      }
    });
    setters.put("fcurSpousePassiveIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurSpousePassiveIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalOtherPaymentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurTotalOtherPaymentAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRetirementContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurRetirementContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBuildingDepreciation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurBuildingDepreciation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonResidentForeign", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurNonResidentForeign = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrustDistribution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurTrustDistribution = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMotorVehicles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurMotorVehicles = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurVouchers", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurVouchers = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPIE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurPIE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPensions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurPensions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSuperannuation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurSuperannuation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOverseasPensions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurOverseasPensions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxExemptIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurTaxExemptIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSuperannuationPIE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurSuperannuationPIE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTrusteeIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurTrusteeIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFringeBenefits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurFringeBenefits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeEqualisation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurIncomeEqualisation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurWfFTCEqualisation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurWfFTCEqualisation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSLEqualisation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurSLEqualisation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAICompanyIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurAICompanyIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngAIPercentageShares", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.flngAIPercentageShares = (Integer)value;
      }
    });
    setters.put("fcurAICompanyDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurAICompanyDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurADCompanyIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurADCompanyIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngADPercentageShares", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.flngADPercentageShares = (Integer)value;
      }
    });
    setters.put("fcurADCompanyDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fcurADCompanyDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_income215attributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_income215attributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_income215attributes with_fi64IncomeKey(Long fi64IncomeKey) {
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
  public tblnz_income215attributes with_flngVer(Integer flngVer) {
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
  public tblnz_income215attributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.math.BigDecimal fcurTotalChildPassiveIncome;
  public java.math.BigDecimal get_fcurTotalChildPassiveIncome() {
    return fcurTotalChildPassiveIncome;
  }
  public void set_fcurTotalChildPassiveIncome(java.math.BigDecimal fcurTotalChildPassiveIncome) {
    this.fcurTotalChildPassiveIncome = fcurTotalChildPassiveIncome;
  }
  public tblnz_income215attributes with_fcurTotalChildPassiveIncome(java.math.BigDecimal fcurTotalChildPassiveIncome) {
    this.fcurTotalChildPassiveIncome = fcurTotalChildPassiveIncome;
    return this;
  }
  private String fstrSpouseName;
  public String get_fstrSpouseName() {
    return fstrSpouseName;
  }
  public void set_fstrSpouseName(String fstrSpouseName) {
    this.fstrSpouseName = fstrSpouseName;
  }
  public tblnz_income215attributes with_fstrSpouseName(String fstrSpouseName) {
    this.fstrSpouseName = fstrSpouseName;
    return this;
  }
  private String fstrPartnersIRDNumber;
  public String get_fstrPartnersIRDNumber() {
    return fstrPartnersIRDNumber;
  }
  public void set_fstrPartnersIRDNumber(String fstrPartnersIRDNumber) {
    this.fstrPartnersIRDNumber = fstrPartnersIRDNumber;
  }
  public tblnz_income215attributes with_fstrPartnersIRDNumber(String fstrPartnersIRDNumber) {
    this.fstrPartnersIRDNumber = fstrPartnersIRDNumber;
    return this;
  }
  private String fstrSpouseCountry;
  public String get_fstrSpouseCountry() {
    return fstrSpouseCountry;
  }
  public void set_fstrSpouseCountry(String fstrSpouseCountry) {
    this.fstrSpouseCountry = fstrSpouseCountry;
  }
  public tblnz_income215attributes with_fstrSpouseCountry(String fstrSpouseCountry) {
    this.fstrSpouseCountry = fstrSpouseCountry;
    return this;
  }
  private java.math.BigDecimal fcurSpousePassiveIncome;
  public java.math.BigDecimal get_fcurSpousePassiveIncome() {
    return fcurSpousePassiveIncome;
  }
  public void set_fcurSpousePassiveIncome(java.math.BigDecimal fcurSpousePassiveIncome) {
    this.fcurSpousePassiveIncome = fcurSpousePassiveIncome;
  }
  public tblnz_income215attributes with_fcurSpousePassiveIncome(java.math.BigDecimal fcurSpousePassiveIncome) {
    this.fcurSpousePassiveIncome = fcurSpousePassiveIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalOtherPaymentAmount;
  public java.math.BigDecimal get_fcurTotalOtherPaymentAmount() {
    return fcurTotalOtherPaymentAmount;
  }
  public void set_fcurTotalOtherPaymentAmount(java.math.BigDecimal fcurTotalOtherPaymentAmount) {
    this.fcurTotalOtherPaymentAmount = fcurTotalOtherPaymentAmount;
  }
  public tblnz_income215attributes with_fcurTotalOtherPaymentAmount(java.math.BigDecimal fcurTotalOtherPaymentAmount) {
    this.fcurTotalOtherPaymentAmount = fcurTotalOtherPaymentAmount;
    return this;
  }
  private java.math.BigDecimal fcurRetirementContributions;
  public java.math.BigDecimal get_fcurRetirementContributions() {
    return fcurRetirementContributions;
  }
  public void set_fcurRetirementContributions(java.math.BigDecimal fcurRetirementContributions) {
    this.fcurRetirementContributions = fcurRetirementContributions;
  }
  public tblnz_income215attributes with_fcurRetirementContributions(java.math.BigDecimal fcurRetirementContributions) {
    this.fcurRetirementContributions = fcurRetirementContributions;
    return this;
  }
  private java.math.BigDecimal fcurBuildingDepreciation;
  public java.math.BigDecimal get_fcurBuildingDepreciation() {
    return fcurBuildingDepreciation;
  }
  public void set_fcurBuildingDepreciation(java.math.BigDecimal fcurBuildingDepreciation) {
    this.fcurBuildingDepreciation = fcurBuildingDepreciation;
  }
  public tblnz_income215attributes with_fcurBuildingDepreciation(java.math.BigDecimal fcurBuildingDepreciation) {
    this.fcurBuildingDepreciation = fcurBuildingDepreciation;
    return this;
  }
  private java.math.BigDecimal fcurNonResidentForeign;
  public java.math.BigDecimal get_fcurNonResidentForeign() {
    return fcurNonResidentForeign;
  }
  public void set_fcurNonResidentForeign(java.math.BigDecimal fcurNonResidentForeign) {
    this.fcurNonResidentForeign = fcurNonResidentForeign;
  }
  public tblnz_income215attributes with_fcurNonResidentForeign(java.math.BigDecimal fcurNonResidentForeign) {
    this.fcurNonResidentForeign = fcurNonResidentForeign;
    return this;
  }
  private java.math.BigDecimal fcurTrustDistribution;
  public java.math.BigDecimal get_fcurTrustDistribution() {
    return fcurTrustDistribution;
  }
  public void set_fcurTrustDistribution(java.math.BigDecimal fcurTrustDistribution) {
    this.fcurTrustDistribution = fcurTrustDistribution;
  }
  public tblnz_income215attributes with_fcurTrustDistribution(java.math.BigDecimal fcurTrustDistribution) {
    this.fcurTrustDistribution = fcurTrustDistribution;
    return this;
  }
  private java.math.BigDecimal fcurMotorVehicles;
  public java.math.BigDecimal get_fcurMotorVehicles() {
    return fcurMotorVehicles;
  }
  public void set_fcurMotorVehicles(java.math.BigDecimal fcurMotorVehicles) {
    this.fcurMotorVehicles = fcurMotorVehicles;
  }
  public tblnz_income215attributes with_fcurMotorVehicles(java.math.BigDecimal fcurMotorVehicles) {
    this.fcurMotorVehicles = fcurMotorVehicles;
    return this;
  }
  private java.math.BigDecimal fcurVouchers;
  public java.math.BigDecimal get_fcurVouchers() {
    return fcurVouchers;
  }
  public void set_fcurVouchers(java.math.BigDecimal fcurVouchers) {
    this.fcurVouchers = fcurVouchers;
  }
  public tblnz_income215attributes with_fcurVouchers(java.math.BigDecimal fcurVouchers) {
    this.fcurVouchers = fcurVouchers;
    return this;
  }
  private java.math.BigDecimal fcurPIE;
  public java.math.BigDecimal get_fcurPIE() {
    return fcurPIE;
  }
  public void set_fcurPIE(java.math.BigDecimal fcurPIE) {
    this.fcurPIE = fcurPIE;
  }
  public tblnz_income215attributes with_fcurPIE(java.math.BigDecimal fcurPIE) {
    this.fcurPIE = fcurPIE;
    return this;
  }
  private java.math.BigDecimal fcurPensions;
  public java.math.BigDecimal get_fcurPensions() {
    return fcurPensions;
  }
  public void set_fcurPensions(java.math.BigDecimal fcurPensions) {
    this.fcurPensions = fcurPensions;
  }
  public tblnz_income215attributes with_fcurPensions(java.math.BigDecimal fcurPensions) {
    this.fcurPensions = fcurPensions;
    return this;
  }
  private java.math.BigDecimal fcurSuperannuation;
  public java.math.BigDecimal get_fcurSuperannuation() {
    return fcurSuperannuation;
  }
  public void set_fcurSuperannuation(java.math.BigDecimal fcurSuperannuation) {
    this.fcurSuperannuation = fcurSuperannuation;
  }
  public tblnz_income215attributes with_fcurSuperannuation(java.math.BigDecimal fcurSuperannuation) {
    this.fcurSuperannuation = fcurSuperannuation;
    return this;
  }
  private java.math.BigDecimal fcurOverseasPensions;
  public java.math.BigDecimal get_fcurOverseasPensions() {
    return fcurOverseasPensions;
  }
  public void set_fcurOverseasPensions(java.math.BigDecimal fcurOverseasPensions) {
    this.fcurOverseasPensions = fcurOverseasPensions;
  }
  public tblnz_income215attributes with_fcurOverseasPensions(java.math.BigDecimal fcurOverseasPensions) {
    this.fcurOverseasPensions = fcurOverseasPensions;
    return this;
  }
  private java.math.BigDecimal fcurTaxExemptIncome;
  public java.math.BigDecimal get_fcurTaxExemptIncome() {
    return fcurTaxExemptIncome;
  }
  public void set_fcurTaxExemptIncome(java.math.BigDecimal fcurTaxExemptIncome) {
    this.fcurTaxExemptIncome = fcurTaxExemptIncome;
  }
  public tblnz_income215attributes with_fcurTaxExemptIncome(java.math.BigDecimal fcurTaxExemptIncome) {
    this.fcurTaxExemptIncome = fcurTaxExemptIncome;
    return this;
  }
  private java.math.BigDecimal fcurSuperannuationPIE;
  public java.math.BigDecimal get_fcurSuperannuationPIE() {
    return fcurSuperannuationPIE;
  }
  public void set_fcurSuperannuationPIE(java.math.BigDecimal fcurSuperannuationPIE) {
    this.fcurSuperannuationPIE = fcurSuperannuationPIE;
  }
  public tblnz_income215attributes with_fcurSuperannuationPIE(java.math.BigDecimal fcurSuperannuationPIE) {
    this.fcurSuperannuationPIE = fcurSuperannuationPIE;
    return this;
  }
  private java.math.BigDecimal fcurTrusteeIncome;
  public java.math.BigDecimal get_fcurTrusteeIncome() {
    return fcurTrusteeIncome;
  }
  public void set_fcurTrusteeIncome(java.math.BigDecimal fcurTrusteeIncome) {
    this.fcurTrusteeIncome = fcurTrusteeIncome;
  }
  public tblnz_income215attributes with_fcurTrusteeIncome(java.math.BigDecimal fcurTrusteeIncome) {
    this.fcurTrusteeIncome = fcurTrusteeIncome;
    return this;
  }
  private java.math.BigDecimal fcurFringeBenefits;
  public java.math.BigDecimal get_fcurFringeBenefits() {
    return fcurFringeBenefits;
  }
  public void set_fcurFringeBenefits(java.math.BigDecimal fcurFringeBenefits) {
    this.fcurFringeBenefits = fcurFringeBenefits;
  }
  public tblnz_income215attributes with_fcurFringeBenefits(java.math.BigDecimal fcurFringeBenefits) {
    this.fcurFringeBenefits = fcurFringeBenefits;
    return this;
  }
  private java.math.BigDecimal fcurLosses;
  public java.math.BigDecimal get_fcurLosses() {
    return fcurLosses;
  }
  public void set_fcurLosses(java.math.BigDecimal fcurLosses) {
    this.fcurLosses = fcurLosses;
  }
  public tblnz_income215attributes with_fcurLosses(java.math.BigDecimal fcurLosses) {
    this.fcurLosses = fcurLosses;
    return this;
  }
  private java.math.BigDecimal fcurIncomeEqualisation;
  public java.math.BigDecimal get_fcurIncomeEqualisation() {
    return fcurIncomeEqualisation;
  }
  public void set_fcurIncomeEqualisation(java.math.BigDecimal fcurIncomeEqualisation) {
    this.fcurIncomeEqualisation = fcurIncomeEqualisation;
  }
  public tblnz_income215attributes with_fcurIncomeEqualisation(java.math.BigDecimal fcurIncomeEqualisation) {
    this.fcurIncomeEqualisation = fcurIncomeEqualisation;
    return this;
  }
  private java.math.BigDecimal fcurWfFTCEqualisation;
  public java.math.BigDecimal get_fcurWfFTCEqualisation() {
    return fcurWfFTCEqualisation;
  }
  public void set_fcurWfFTCEqualisation(java.math.BigDecimal fcurWfFTCEqualisation) {
    this.fcurWfFTCEqualisation = fcurWfFTCEqualisation;
  }
  public tblnz_income215attributes with_fcurWfFTCEqualisation(java.math.BigDecimal fcurWfFTCEqualisation) {
    this.fcurWfFTCEqualisation = fcurWfFTCEqualisation;
    return this;
  }
  private java.math.BigDecimal fcurSLEqualisation;
  public java.math.BigDecimal get_fcurSLEqualisation() {
    return fcurSLEqualisation;
  }
  public void set_fcurSLEqualisation(java.math.BigDecimal fcurSLEqualisation) {
    this.fcurSLEqualisation = fcurSLEqualisation;
  }
  public tblnz_income215attributes with_fcurSLEqualisation(java.math.BigDecimal fcurSLEqualisation) {
    this.fcurSLEqualisation = fcurSLEqualisation;
    return this;
  }
  private java.math.BigDecimal fcurAICompanyIncome;
  public java.math.BigDecimal get_fcurAICompanyIncome() {
    return fcurAICompanyIncome;
  }
  public void set_fcurAICompanyIncome(java.math.BigDecimal fcurAICompanyIncome) {
    this.fcurAICompanyIncome = fcurAICompanyIncome;
  }
  public tblnz_income215attributes with_fcurAICompanyIncome(java.math.BigDecimal fcurAICompanyIncome) {
    this.fcurAICompanyIncome = fcurAICompanyIncome;
    return this;
  }
  private Integer flngAIPercentageShares;
  public Integer get_flngAIPercentageShares() {
    return flngAIPercentageShares;
  }
  public void set_flngAIPercentageShares(Integer flngAIPercentageShares) {
    this.flngAIPercentageShares = flngAIPercentageShares;
  }
  public tblnz_income215attributes with_flngAIPercentageShares(Integer flngAIPercentageShares) {
    this.flngAIPercentageShares = flngAIPercentageShares;
    return this;
  }
  private java.math.BigDecimal fcurAICompanyDividends;
  public java.math.BigDecimal get_fcurAICompanyDividends() {
    return fcurAICompanyDividends;
  }
  public void set_fcurAICompanyDividends(java.math.BigDecimal fcurAICompanyDividends) {
    this.fcurAICompanyDividends = fcurAICompanyDividends;
  }
  public tblnz_income215attributes with_fcurAICompanyDividends(java.math.BigDecimal fcurAICompanyDividends) {
    this.fcurAICompanyDividends = fcurAICompanyDividends;
    return this;
  }
  private java.math.BigDecimal fcurADCompanyIncome;
  public java.math.BigDecimal get_fcurADCompanyIncome() {
    return fcurADCompanyIncome;
  }
  public void set_fcurADCompanyIncome(java.math.BigDecimal fcurADCompanyIncome) {
    this.fcurADCompanyIncome = fcurADCompanyIncome;
  }
  public tblnz_income215attributes with_fcurADCompanyIncome(java.math.BigDecimal fcurADCompanyIncome) {
    this.fcurADCompanyIncome = fcurADCompanyIncome;
    return this;
  }
  private Integer flngADPercentageShares;
  public Integer get_flngADPercentageShares() {
    return flngADPercentageShares;
  }
  public void set_flngADPercentageShares(Integer flngADPercentageShares) {
    this.flngADPercentageShares = flngADPercentageShares;
  }
  public tblnz_income215attributes with_flngADPercentageShares(Integer flngADPercentageShares) {
    this.flngADPercentageShares = flngADPercentageShares;
    return this;
  }
  private java.math.BigDecimal fcurADCompanyDividends;
  public java.math.BigDecimal get_fcurADCompanyDividends() {
    return fcurADCompanyDividends;
  }
  public void set_fcurADCompanyDividends(java.math.BigDecimal fcurADCompanyDividends) {
    this.fcurADCompanyDividends = fcurADCompanyDividends;
  }
  public tblnz_income215attributes with_fcurADCompanyDividends(java.math.BigDecimal fcurADCompanyDividends) {
    this.fcurADCompanyDividends = fcurADCompanyDividends;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_income215attributes with_fstrWho(String fstrWho) {
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
  public tblnz_income215attributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_income215attributes)) {
      return false;
    }
    tblnz_income215attributes that = (tblnz_income215attributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurTotalChildPassiveIncome == null ? that.fcurTotalChildPassiveIncome == null : this.fcurTotalChildPassiveIncome.equals(that.fcurTotalChildPassiveIncome));
    equal = equal && (this.fstrSpouseName == null ? that.fstrSpouseName == null : this.fstrSpouseName.equals(that.fstrSpouseName));
    equal = equal && (this.fstrPartnersIRDNumber == null ? that.fstrPartnersIRDNumber == null : this.fstrPartnersIRDNumber.equals(that.fstrPartnersIRDNumber));
    equal = equal && (this.fstrSpouseCountry == null ? that.fstrSpouseCountry == null : this.fstrSpouseCountry.equals(that.fstrSpouseCountry));
    equal = equal && (this.fcurSpousePassiveIncome == null ? that.fcurSpousePassiveIncome == null : this.fcurSpousePassiveIncome.equals(that.fcurSpousePassiveIncome));
    equal = equal && (this.fcurTotalOtherPaymentAmount == null ? that.fcurTotalOtherPaymentAmount == null : this.fcurTotalOtherPaymentAmount.equals(that.fcurTotalOtherPaymentAmount));
    equal = equal && (this.fcurRetirementContributions == null ? that.fcurRetirementContributions == null : this.fcurRetirementContributions.equals(that.fcurRetirementContributions));
    equal = equal && (this.fcurBuildingDepreciation == null ? that.fcurBuildingDepreciation == null : this.fcurBuildingDepreciation.equals(that.fcurBuildingDepreciation));
    equal = equal && (this.fcurNonResidentForeign == null ? that.fcurNonResidentForeign == null : this.fcurNonResidentForeign.equals(that.fcurNonResidentForeign));
    equal = equal && (this.fcurTrustDistribution == null ? that.fcurTrustDistribution == null : this.fcurTrustDistribution.equals(that.fcurTrustDistribution));
    equal = equal && (this.fcurMotorVehicles == null ? that.fcurMotorVehicles == null : this.fcurMotorVehicles.equals(that.fcurMotorVehicles));
    equal = equal && (this.fcurVouchers == null ? that.fcurVouchers == null : this.fcurVouchers.equals(that.fcurVouchers));
    equal = equal && (this.fcurPIE == null ? that.fcurPIE == null : this.fcurPIE.equals(that.fcurPIE));
    equal = equal && (this.fcurPensions == null ? that.fcurPensions == null : this.fcurPensions.equals(that.fcurPensions));
    equal = equal && (this.fcurSuperannuation == null ? that.fcurSuperannuation == null : this.fcurSuperannuation.equals(that.fcurSuperannuation));
    equal = equal && (this.fcurOverseasPensions == null ? that.fcurOverseasPensions == null : this.fcurOverseasPensions.equals(that.fcurOverseasPensions));
    equal = equal && (this.fcurTaxExemptIncome == null ? that.fcurTaxExemptIncome == null : this.fcurTaxExemptIncome.equals(that.fcurTaxExemptIncome));
    equal = equal && (this.fcurSuperannuationPIE == null ? that.fcurSuperannuationPIE == null : this.fcurSuperannuationPIE.equals(that.fcurSuperannuationPIE));
    equal = equal && (this.fcurTrusteeIncome == null ? that.fcurTrusteeIncome == null : this.fcurTrusteeIncome.equals(that.fcurTrusteeIncome));
    equal = equal && (this.fcurFringeBenefits == null ? that.fcurFringeBenefits == null : this.fcurFringeBenefits.equals(that.fcurFringeBenefits));
    equal = equal && (this.fcurLosses == null ? that.fcurLosses == null : this.fcurLosses.equals(that.fcurLosses));
    equal = equal && (this.fcurIncomeEqualisation == null ? that.fcurIncomeEqualisation == null : this.fcurIncomeEqualisation.equals(that.fcurIncomeEqualisation));
    equal = equal && (this.fcurWfFTCEqualisation == null ? that.fcurWfFTCEqualisation == null : this.fcurWfFTCEqualisation.equals(that.fcurWfFTCEqualisation));
    equal = equal && (this.fcurSLEqualisation == null ? that.fcurSLEqualisation == null : this.fcurSLEqualisation.equals(that.fcurSLEqualisation));
    equal = equal && (this.fcurAICompanyIncome == null ? that.fcurAICompanyIncome == null : this.fcurAICompanyIncome.equals(that.fcurAICompanyIncome));
    equal = equal && (this.flngAIPercentageShares == null ? that.flngAIPercentageShares == null : this.flngAIPercentageShares.equals(that.flngAIPercentageShares));
    equal = equal && (this.fcurAICompanyDividends == null ? that.fcurAICompanyDividends == null : this.fcurAICompanyDividends.equals(that.fcurAICompanyDividends));
    equal = equal && (this.fcurADCompanyIncome == null ? that.fcurADCompanyIncome == null : this.fcurADCompanyIncome.equals(that.fcurADCompanyIncome));
    equal = equal && (this.flngADPercentageShares == null ? that.flngADPercentageShares == null : this.flngADPercentageShares.equals(that.flngADPercentageShares));
    equal = equal && (this.fcurADCompanyDividends == null ? that.fcurADCompanyDividends == null : this.fcurADCompanyDividends.equals(that.fcurADCompanyDividends));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_income215attributes)) {
      return false;
    }
    tblnz_income215attributes that = (tblnz_income215attributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurTotalChildPassiveIncome == null ? that.fcurTotalChildPassiveIncome == null : this.fcurTotalChildPassiveIncome.equals(that.fcurTotalChildPassiveIncome));
    equal = equal && (this.fstrSpouseName == null ? that.fstrSpouseName == null : this.fstrSpouseName.equals(that.fstrSpouseName));
    equal = equal && (this.fstrPartnersIRDNumber == null ? that.fstrPartnersIRDNumber == null : this.fstrPartnersIRDNumber.equals(that.fstrPartnersIRDNumber));
    equal = equal && (this.fstrSpouseCountry == null ? that.fstrSpouseCountry == null : this.fstrSpouseCountry.equals(that.fstrSpouseCountry));
    equal = equal && (this.fcurSpousePassiveIncome == null ? that.fcurSpousePassiveIncome == null : this.fcurSpousePassiveIncome.equals(that.fcurSpousePassiveIncome));
    equal = equal && (this.fcurTotalOtherPaymentAmount == null ? that.fcurTotalOtherPaymentAmount == null : this.fcurTotalOtherPaymentAmount.equals(that.fcurTotalOtherPaymentAmount));
    equal = equal && (this.fcurRetirementContributions == null ? that.fcurRetirementContributions == null : this.fcurRetirementContributions.equals(that.fcurRetirementContributions));
    equal = equal && (this.fcurBuildingDepreciation == null ? that.fcurBuildingDepreciation == null : this.fcurBuildingDepreciation.equals(that.fcurBuildingDepreciation));
    equal = equal && (this.fcurNonResidentForeign == null ? that.fcurNonResidentForeign == null : this.fcurNonResidentForeign.equals(that.fcurNonResidentForeign));
    equal = equal && (this.fcurTrustDistribution == null ? that.fcurTrustDistribution == null : this.fcurTrustDistribution.equals(that.fcurTrustDistribution));
    equal = equal && (this.fcurMotorVehicles == null ? that.fcurMotorVehicles == null : this.fcurMotorVehicles.equals(that.fcurMotorVehicles));
    equal = equal && (this.fcurVouchers == null ? that.fcurVouchers == null : this.fcurVouchers.equals(that.fcurVouchers));
    equal = equal && (this.fcurPIE == null ? that.fcurPIE == null : this.fcurPIE.equals(that.fcurPIE));
    equal = equal && (this.fcurPensions == null ? that.fcurPensions == null : this.fcurPensions.equals(that.fcurPensions));
    equal = equal && (this.fcurSuperannuation == null ? that.fcurSuperannuation == null : this.fcurSuperannuation.equals(that.fcurSuperannuation));
    equal = equal && (this.fcurOverseasPensions == null ? that.fcurOverseasPensions == null : this.fcurOverseasPensions.equals(that.fcurOverseasPensions));
    equal = equal && (this.fcurTaxExemptIncome == null ? that.fcurTaxExemptIncome == null : this.fcurTaxExemptIncome.equals(that.fcurTaxExemptIncome));
    equal = equal && (this.fcurSuperannuationPIE == null ? that.fcurSuperannuationPIE == null : this.fcurSuperannuationPIE.equals(that.fcurSuperannuationPIE));
    equal = equal && (this.fcurTrusteeIncome == null ? that.fcurTrusteeIncome == null : this.fcurTrusteeIncome.equals(that.fcurTrusteeIncome));
    equal = equal && (this.fcurFringeBenefits == null ? that.fcurFringeBenefits == null : this.fcurFringeBenefits.equals(that.fcurFringeBenefits));
    equal = equal && (this.fcurLosses == null ? that.fcurLosses == null : this.fcurLosses.equals(that.fcurLosses));
    equal = equal && (this.fcurIncomeEqualisation == null ? that.fcurIncomeEqualisation == null : this.fcurIncomeEqualisation.equals(that.fcurIncomeEqualisation));
    equal = equal && (this.fcurWfFTCEqualisation == null ? that.fcurWfFTCEqualisation == null : this.fcurWfFTCEqualisation.equals(that.fcurWfFTCEqualisation));
    equal = equal && (this.fcurSLEqualisation == null ? that.fcurSLEqualisation == null : this.fcurSLEqualisation.equals(that.fcurSLEqualisation));
    equal = equal && (this.fcurAICompanyIncome == null ? that.fcurAICompanyIncome == null : this.fcurAICompanyIncome.equals(that.fcurAICompanyIncome));
    equal = equal && (this.flngAIPercentageShares == null ? that.flngAIPercentageShares == null : this.flngAIPercentageShares.equals(that.flngAIPercentageShares));
    equal = equal && (this.fcurAICompanyDividends == null ? that.fcurAICompanyDividends == null : this.fcurAICompanyDividends.equals(that.fcurAICompanyDividends));
    equal = equal && (this.fcurADCompanyIncome == null ? that.fcurADCompanyIncome == null : this.fcurADCompanyIncome.equals(that.fcurADCompanyIncome));
    equal = equal && (this.flngADPercentageShares == null ? that.flngADPercentageShares == null : this.flngADPercentageShares.equals(that.flngADPercentageShares));
    equal = equal && (this.fcurADCompanyDividends == null ? that.fcurADCompanyDividends == null : this.fcurADCompanyDividends.equals(that.fcurADCompanyDividends));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurTotalChildPassiveIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fstrSpouseName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPartnersIRDNumber = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSpouseCountry = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurSpousePassiveIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalOtherPaymentAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRetirementContributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBuildingDepreciation = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNonResidentForeign = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTrustDistribution = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurMotorVehicles = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurVouchers = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPIE = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPensions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurSuperannuation = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOverseasPensions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTaxExemptIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurSuperannuationPIE = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTrusteeIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurFringeBenefits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurLosses = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurIncomeEqualisation = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurWfFTCEqualisation = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurSLEqualisation = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurAICompanyIncome = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.flngAIPercentageShares = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fcurAICompanyDividends = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurADCompanyIncome = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.flngADPercentageShares = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fcurADCompanyDividends = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurTotalChildPassiveIncome = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fstrSpouseName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPartnersIRDNumber = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSpouseCountry = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurSpousePassiveIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalOtherPaymentAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRetirementContributions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurBuildingDepreciation = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNonResidentForeign = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTrustDistribution = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurMotorVehicles = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurVouchers = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPIE = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPensions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurSuperannuation = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOverseasPensions = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTaxExemptIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurSuperannuationPIE = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurTrusteeIncome = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurFringeBenefits = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurLosses = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurIncomeEqualisation = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurWfFTCEqualisation = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurSLEqualisation = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurAICompanyIncome = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.flngAIPercentageShares = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fcurAICompanyDividends = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurADCompanyIncome = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.flngADPercentageShares = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fcurADCompanyDividends = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurTotalChildPassiveIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpouseName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnersIRDNumber, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpouseCountry, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSpousePassiveIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherPaymentAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRetirementContributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildingDepreciation, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonResidentForeign, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustDistribution, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMotorVehicles, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVouchers, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPIE, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPensions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSuperannuation, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasPensions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxExemptIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSuperannuationPIE, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrusteeIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFringeBenefits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLosses, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeEqualisation, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWfFTCEqualisation, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLEqualisation, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAICompanyIncome, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAIPercentageShares, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAICompanyDividends, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurADCompanyIncome, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngADPercentageShares, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurADCompanyDividends, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 35 + __off, 93, __dbStmt);
    return 35;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalChildPassiveIncome, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpouseName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnersIRDNumber, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSpouseCountry, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSpousePassiveIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalOtherPaymentAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRetirementContributions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildingDepreciation, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonResidentForeign, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrustDistribution, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMotorVehicles, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVouchers, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPIE, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPensions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSuperannuation, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOverseasPensions, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxExemptIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSuperannuationPIE, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTrusteeIncome, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFringeBenefits, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLosses, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeEqualisation, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWfFTCEqualisation, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSLEqualisation, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAICompanyIncome, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAIPercentageShares, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAICompanyDividends, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurADCompanyIncome, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngADPercentageShares, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurADCompanyDividends, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 35 + __off, 93, __dbStmt);
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
        this.fcurTotalChildPassiveIncome = null;
    } else {
    this.fcurTotalChildPassiveIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSpouseName = null;
    } else {
    this.fstrSpouseName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartnersIRDNumber = null;
    } else {
    this.fstrPartnersIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSpouseCountry = null;
    } else {
    this.fstrSpouseCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSpousePassiveIncome = null;
    } else {
    this.fcurSpousePassiveIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalOtherPaymentAmount = null;
    } else {
    this.fcurTotalOtherPaymentAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRetirementContributions = null;
    } else {
    this.fcurRetirementContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBuildingDepreciation = null;
    } else {
    this.fcurBuildingDepreciation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonResidentForeign = null;
    } else {
    this.fcurNonResidentForeign = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTrustDistribution = null;
    } else {
    this.fcurTrustDistribution = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMotorVehicles = null;
    } else {
    this.fcurMotorVehicles = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurVouchers = null;
    } else {
    this.fcurVouchers = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPIE = null;
    } else {
    this.fcurPIE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPensions = null;
    } else {
    this.fcurPensions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSuperannuation = null;
    } else {
    this.fcurSuperannuation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOverseasPensions = null;
    } else {
    this.fcurOverseasPensions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxExemptIncome = null;
    } else {
    this.fcurTaxExemptIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSuperannuationPIE = null;
    } else {
    this.fcurSuperannuationPIE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTrusteeIncome = null;
    } else {
    this.fcurTrusteeIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFringeBenefits = null;
    } else {
    this.fcurFringeBenefits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLosses = null;
    } else {
    this.fcurLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeEqualisation = null;
    } else {
    this.fcurIncomeEqualisation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWfFTCEqualisation = null;
    } else {
    this.fcurWfFTCEqualisation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSLEqualisation = null;
    } else {
    this.fcurSLEqualisation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAICompanyIncome = null;
    } else {
    this.fcurAICompanyIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAIPercentageShares = null;
    } else {
    this.flngAIPercentageShares = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAICompanyDividends = null;
    } else {
    this.fcurAICompanyDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurADCompanyIncome = null;
    } else {
    this.fcurADCompanyIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngADPercentageShares = null;
    } else {
    this.flngADPercentageShares = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurADCompanyDividends = null;
    } else {
    this.fcurADCompanyDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurTotalChildPassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChildPassiveIncome, __dataOut);
    }
    if (null == this.fstrSpouseName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpouseName);
    }
    if (null == this.fstrPartnersIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnersIRDNumber);
    }
    if (null == this.fstrSpouseCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpouseCountry);
    }
    if (null == this.fcurSpousePassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSpousePassiveIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherPaymentAmount, __dataOut);
    }
    if (null == this.fcurRetirementContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRetirementContributions, __dataOut);
    }
    if (null == this.fcurBuildingDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBuildingDepreciation, __dataOut);
    }
    if (null == this.fcurNonResidentForeign) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonResidentForeign, __dataOut);
    }
    if (null == this.fcurTrustDistribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustDistribution, __dataOut);
    }
    if (null == this.fcurMotorVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMotorVehicles, __dataOut);
    }
    if (null == this.fcurVouchers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVouchers, __dataOut);
    }
    if (null == this.fcurPIE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPIE, __dataOut);
    }
    if (null == this.fcurPensions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPensions, __dataOut);
    }
    if (null == this.fcurSuperannuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSuperannuation, __dataOut);
    }
    if (null == this.fcurOverseasPensions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasPensions, __dataOut);
    }
    if (null == this.fcurTaxExemptIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxExemptIncome, __dataOut);
    }
    if (null == this.fcurSuperannuationPIE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSuperannuationPIE, __dataOut);
    }
    if (null == this.fcurTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrusteeIncome, __dataOut);
    }
    if (null == this.fcurFringeBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFringeBenefits, __dataOut);
    }
    if (null == this.fcurLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLosses, __dataOut);
    }
    if (null == this.fcurIncomeEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeEqualisation, __dataOut);
    }
    if (null == this.fcurWfFTCEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWfFTCEqualisation, __dataOut);
    }
    if (null == this.fcurSLEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLEqualisation, __dataOut);
    }
    if (null == this.fcurAICompanyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAICompanyIncome, __dataOut);
    }
    if (null == this.flngAIPercentageShares) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAIPercentageShares);
    }
    if (null == this.fcurAICompanyDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAICompanyDividends, __dataOut);
    }
    if (null == this.fcurADCompanyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurADCompanyIncome, __dataOut);
    }
    if (null == this.flngADPercentageShares) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngADPercentageShares);
    }
    if (null == this.fcurADCompanyDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurADCompanyDividends, __dataOut);
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
    if (null == this.fcurTotalChildPassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalChildPassiveIncome, __dataOut);
    }
    if (null == this.fstrSpouseName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpouseName);
    }
    if (null == this.fstrPartnersIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnersIRDNumber);
    }
    if (null == this.fstrSpouseCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSpouseCountry);
    }
    if (null == this.fcurSpousePassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSpousePassiveIncome, __dataOut);
    }
    if (null == this.fcurTotalOtherPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalOtherPaymentAmount, __dataOut);
    }
    if (null == this.fcurRetirementContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRetirementContributions, __dataOut);
    }
    if (null == this.fcurBuildingDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBuildingDepreciation, __dataOut);
    }
    if (null == this.fcurNonResidentForeign) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonResidentForeign, __dataOut);
    }
    if (null == this.fcurTrustDistribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrustDistribution, __dataOut);
    }
    if (null == this.fcurMotorVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMotorVehicles, __dataOut);
    }
    if (null == this.fcurVouchers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVouchers, __dataOut);
    }
    if (null == this.fcurPIE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPIE, __dataOut);
    }
    if (null == this.fcurPensions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPensions, __dataOut);
    }
    if (null == this.fcurSuperannuation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSuperannuation, __dataOut);
    }
    if (null == this.fcurOverseasPensions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOverseasPensions, __dataOut);
    }
    if (null == this.fcurTaxExemptIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxExemptIncome, __dataOut);
    }
    if (null == this.fcurSuperannuationPIE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSuperannuationPIE, __dataOut);
    }
    if (null == this.fcurTrusteeIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTrusteeIncome, __dataOut);
    }
    if (null == this.fcurFringeBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFringeBenefits, __dataOut);
    }
    if (null == this.fcurLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLosses, __dataOut);
    }
    if (null == this.fcurIncomeEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeEqualisation, __dataOut);
    }
    if (null == this.fcurWfFTCEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWfFTCEqualisation, __dataOut);
    }
    if (null == this.fcurSLEqualisation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSLEqualisation, __dataOut);
    }
    if (null == this.fcurAICompanyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAICompanyIncome, __dataOut);
    }
    if (null == this.flngAIPercentageShares) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAIPercentageShares);
    }
    if (null == this.fcurAICompanyDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAICompanyDividends, __dataOut);
    }
    if (null == this.fcurADCompanyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurADCompanyIncome, __dataOut);
    }
    if (null == this.flngADPercentageShares) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngADPercentageShares);
    }
    if (null == this.fcurADCompanyDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurADCompanyDividends, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChildPassiveIncome==null?"\\N":fcurTotalChildPassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpouseName==null?"\\N":fstrSpouseName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnersIRDNumber==null?"\\N":fstrPartnersIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpouseCountry==null?"\\N":fstrSpouseCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSpousePassiveIncome==null?"\\N":fcurSpousePassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherPaymentAmount==null?"\\N":fcurTotalOtherPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRetirementContributions==null?"\\N":fcurRetirementContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildingDepreciation==null?"\\N":fcurBuildingDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonResidentForeign==null?"\\N":fcurNonResidentForeign.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustDistribution==null?"\\N":fcurTrustDistribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMotorVehicles==null?"\\N":fcurMotorVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVouchers==null?"\\N":fcurVouchers.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPIE==null?"\\N":fcurPIE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPensions==null?"\\N":fcurPensions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSuperannuation==null?"\\N":fcurSuperannuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasPensions==null?"\\N":fcurOverseasPensions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxExemptIncome==null?"\\N":fcurTaxExemptIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSuperannuationPIE==null?"\\N":fcurSuperannuationPIE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrusteeIncome==null?"\\N":fcurTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFringeBenefits==null?"\\N":fcurFringeBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLosses==null?"\\N":fcurLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeEqualisation==null?"\\N":fcurIncomeEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWfFTCEqualisation==null?"\\N":fcurWfFTCEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLEqualisation==null?"\\N":fcurSLEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAICompanyIncome==null?"\\N":fcurAICompanyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAIPercentageShares==null?"\\N":"" + flngAIPercentageShares, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAICompanyDividends==null?"\\N":fcurAICompanyDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurADCompanyIncome==null?"\\N":fcurADCompanyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngADPercentageShares==null?"\\N":"" + flngADPercentageShares, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurADCompanyDividends==null?"\\N":fcurADCompanyDividends.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalChildPassiveIncome==null?"\\N":fcurTotalChildPassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpouseName==null?"\\N":fstrSpouseName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnersIRDNumber==null?"\\N":fstrPartnersIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSpouseCountry==null?"\\N":fstrSpouseCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSpousePassiveIncome==null?"\\N":fcurSpousePassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalOtherPaymentAmount==null?"\\N":fcurTotalOtherPaymentAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRetirementContributions==null?"\\N":fcurRetirementContributions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildingDepreciation==null?"\\N":fcurBuildingDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonResidentForeign==null?"\\N":fcurNonResidentForeign.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrustDistribution==null?"\\N":fcurTrustDistribution.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMotorVehicles==null?"\\N":fcurMotorVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVouchers==null?"\\N":fcurVouchers.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPIE==null?"\\N":fcurPIE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPensions==null?"\\N":fcurPensions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSuperannuation==null?"\\N":fcurSuperannuation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOverseasPensions==null?"\\N":fcurOverseasPensions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxExemptIncome==null?"\\N":fcurTaxExemptIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSuperannuationPIE==null?"\\N":fcurSuperannuationPIE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTrusteeIncome==null?"\\N":fcurTrusteeIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFringeBenefits==null?"\\N":fcurFringeBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLosses==null?"\\N":fcurLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeEqualisation==null?"\\N":fcurIncomeEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWfFTCEqualisation==null?"\\N":fcurWfFTCEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSLEqualisation==null?"\\N":fcurSLEqualisation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAICompanyIncome==null?"\\N":fcurAICompanyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAIPercentageShares==null?"\\N":"" + flngAIPercentageShares, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAICompanyDividends==null?"\\N":fcurAICompanyDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurADCompanyIncome==null?"\\N":fcurADCompanyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngADPercentageShares==null?"\\N":"" + flngADPercentageShares, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurADCompanyDividends==null?"\\N":fcurADCompanyDividends.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChildPassiveIncome = null; } else {
      this.fcurTotalChildPassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpouseName = null; } else {
      this.fstrSpouseName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnersIRDNumber = null; } else {
      this.fstrPartnersIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpouseCountry = null; } else {
      this.fstrSpouseCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSpousePassiveIncome = null; } else {
      this.fcurSpousePassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherPaymentAmount = null; } else {
      this.fcurTotalOtherPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRetirementContributions = null; } else {
      this.fcurRetirementContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBuildingDepreciation = null; } else {
      this.fcurBuildingDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonResidentForeign = null; } else {
      this.fcurNonResidentForeign = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustDistribution = null; } else {
      this.fcurTrustDistribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMotorVehicles = null; } else {
      this.fcurMotorVehicles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVouchers = null; } else {
      this.fcurVouchers = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPIE = null; } else {
      this.fcurPIE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPensions = null; } else {
      this.fcurPensions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSuperannuation = null; } else {
      this.fcurSuperannuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasPensions = null; } else {
      this.fcurOverseasPensions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxExemptIncome = null; } else {
      this.fcurTaxExemptIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSuperannuationPIE = null; } else {
      this.fcurSuperannuationPIE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrusteeIncome = null; } else {
      this.fcurTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFringeBenefits = null; } else {
      this.fcurFringeBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLosses = null; } else {
      this.fcurLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeEqualisation = null; } else {
      this.fcurIncomeEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWfFTCEqualisation = null; } else {
      this.fcurWfFTCEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLEqualisation = null; } else {
      this.fcurSLEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAICompanyIncome = null; } else {
      this.fcurAICompanyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAIPercentageShares = null; } else {
      this.flngAIPercentageShares = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAICompanyDividends = null; } else {
      this.fcurAICompanyDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurADCompanyIncome = null; } else {
      this.fcurADCompanyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngADPercentageShares = null; } else {
      this.flngADPercentageShares = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurADCompanyDividends = null; } else {
      this.fcurADCompanyDividends = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalChildPassiveIncome = null; } else {
      this.fcurTotalChildPassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpouseName = null; } else {
      this.fstrSpouseName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnersIRDNumber = null; } else {
      this.fstrPartnersIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSpouseCountry = null; } else {
      this.fstrSpouseCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSpousePassiveIncome = null; } else {
      this.fcurSpousePassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalOtherPaymentAmount = null; } else {
      this.fcurTotalOtherPaymentAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRetirementContributions = null; } else {
      this.fcurRetirementContributions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBuildingDepreciation = null; } else {
      this.fcurBuildingDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonResidentForeign = null; } else {
      this.fcurNonResidentForeign = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrustDistribution = null; } else {
      this.fcurTrustDistribution = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMotorVehicles = null; } else {
      this.fcurMotorVehicles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVouchers = null; } else {
      this.fcurVouchers = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPIE = null; } else {
      this.fcurPIE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPensions = null; } else {
      this.fcurPensions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSuperannuation = null; } else {
      this.fcurSuperannuation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOverseasPensions = null; } else {
      this.fcurOverseasPensions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxExemptIncome = null; } else {
      this.fcurTaxExemptIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSuperannuationPIE = null; } else {
      this.fcurSuperannuationPIE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTrusteeIncome = null; } else {
      this.fcurTrusteeIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFringeBenefits = null; } else {
      this.fcurFringeBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLosses = null; } else {
      this.fcurLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeEqualisation = null; } else {
      this.fcurIncomeEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWfFTCEqualisation = null; } else {
      this.fcurWfFTCEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSLEqualisation = null; } else {
      this.fcurSLEqualisation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAICompanyIncome = null; } else {
      this.fcurAICompanyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAIPercentageShares = null; } else {
      this.flngAIPercentageShares = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAICompanyDividends = null; } else {
      this.fcurAICompanyDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurADCompanyIncome = null; } else {
      this.fcurADCompanyIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngADPercentageShares = null; } else {
      this.flngADPercentageShares = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurADCompanyDividends = null; } else {
      this.fcurADCompanyDividends = new java.math.BigDecimal(__cur_str);
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
    tblnz_income215attributes o = (tblnz_income215attributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_income215attributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurTotalChildPassiveIncome", this.fcurTotalChildPassiveIncome);
    __sqoop$field_map.put("fstrSpouseName", this.fstrSpouseName);
    __sqoop$field_map.put("fstrPartnersIRDNumber", this.fstrPartnersIRDNumber);
    __sqoop$field_map.put("fstrSpouseCountry", this.fstrSpouseCountry);
    __sqoop$field_map.put("fcurSpousePassiveIncome", this.fcurSpousePassiveIncome);
    __sqoop$field_map.put("fcurTotalOtherPaymentAmount", this.fcurTotalOtherPaymentAmount);
    __sqoop$field_map.put("fcurRetirementContributions", this.fcurRetirementContributions);
    __sqoop$field_map.put("fcurBuildingDepreciation", this.fcurBuildingDepreciation);
    __sqoop$field_map.put("fcurNonResidentForeign", this.fcurNonResidentForeign);
    __sqoop$field_map.put("fcurTrustDistribution", this.fcurTrustDistribution);
    __sqoop$field_map.put("fcurMotorVehicles", this.fcurMotorVehicles);
    __sqoop$field_map.put("fcurVouchers", this.fcurVouchers);
    __sqoop$field_map.put("fcurPIE", this.fcurPIE);
    __sqoop$field_map.put("fcurPensions", this.fcurPensions);
    __sqoop$field_map.put("fcurSuperannuation", this.fcurSuperannuation);
    __sqoop$field_map.put("fcurOverseasPensions", this.fcurOverseasPensions);
    __sqoop$field_map.put("fcurTaxExemptIncome", this.fcurTaxExemptIncome);
    __sqoop$field_map.put("fcurSuperannuationPIE", this.fcurSuperannuationPIE);
    __sqoop$field_map.put("fcurTrusteeIncome", this.fcurTrusteeIncome);
    __sqoop$field_map.put("fcurFringeBenefits", this.fcurFringeBenefits);
    __sqoop$field_map.put("fcurLosses", this.fcurLosses);
    __sqoop$field_map.put("fcurIncomeEqualisation", this.fcurIncomeEqualisation);
    __sqoop$field_map.put("fcurWfFTCEqualisation", this.fcurWfFTCEqualisation);
    __sqoop$field_map.put("fcurSLEqualisation", this.fcurSLEqualisation);
    __sqoop$field_map.put("fcurAICompanyIncome", this.fcurAICompanyIncome);
    __sqoop$field_map.put("flngAIPercentageShares", this.flngAIPercentageShares);
    __sqoop$field_map.put("fcurAICompanyDividends", this.fcurAICompanyDividends);
    __sqoop$field_map.put("fcurADCompanyIncome", this.fcurADCompanyIncome);
    __sqoop$field_map.put("flngADPercentageShares", this.flngADPercentageShares);
    __sqoop$field_map.put("fcurADCompanyDividends", this.fcurADCompanyDividends);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurTotalChildPassiveIncome", this.fcurTotalChildPassiveIncome);
    __sqoop$field_map.put("fstrSpouseName", this.fstrSpouseName);
    __sqoop$field_map.put("fstrPartnersIRDNumber", this.fstrPartnersIRDNumber);
    __sqoop$field_map.put("fstrSpouseCountry", this.fstrSpouseCountry);
    __sqoop$field_map.put("fcurSpousePassiveIncome", this.fcurSpousePassiveIncome);
    __sqoop$field_map.put("fcurTotalOtherPaymentAmount", this.fcurTotalOtherPaymentAmount);
    __sqoop$field_map.put("fcurRetirementContributions", this.fcurRetirementContributions);
    __sqoop$field_map.put("fcurBuildingDepreciation", this.fcurBuildingDepreciation);
    __sqoop$field_map.put("fcurNonResidentForeign", this.fcurNonResidentForeign);
    __sqoop$field_map.put("fcurTrustDistribution", this.fcurTrustDistribution);
    __sqoop$field_map.put("fcurMotorVehicles", this.fcurMotorVehicles);
    __sqoop$field_map.put("fcurVouchers", this.fcurVouchers);
    __sqoop$field_map.put("fcurPIE", this.fcurPIE);
    __sqoop$field_map.put("fcurPensions", this.fcurPensions);
    __sqoop$field_map.put("fcurSuperannuation", this.fcurSuperannuation);
    __sqoop$field_map.put("fcurOverseasPensions", this.fcurOverseasPensions);
    __sqoop$field_map.put("fcurTaxExemptIncome", this.fcurTaxExemptIncome);
    __sqoop$field_map.put("fcurSuperannuationPIE", this.fcurSuperannuationPIE);
    __sqoop$field_map.put("fcurTrusteeIncome", this.fcurTrusteeIncome);
    __sqoop$field_map.put("fcurFringeBenefits", this.fcurFringeBenefits);
    __sqoop$field_map.put("fcurLosses", this.fcurLosses);
    __sqoop$field_map.put("fcurIncomeEqualisation", this.fcurIncomeEqualisation);
    __sqoop$field_map.put("fcurWfFTCEqualisation", this.fcurWfFTCEqualisation);
    __sqoop$field_map.put("fcurSLEqualisation", this.fcurSLEqualisation);
    __sqoop$field_map.put("fcurAICompanyIncome", this.fcurAICompanyIncome);
    __sqoop$field_map.put("flngAIPercentageShares", this.flngAIPercentageShares);
    __sqoop$field_map.put("fcurAICompanyDividends", this.fcurAICompanyDividends);
    __sqoop$field_map.put("fcurADCompanyIncome", this.fcurADCompanyIncome);
    __sqoop$field_map.put("flngADPercentageShares", this.flngADPercentageShares);
    __sqoop$field_map.put("fcurADCompanyDividends", this.fcurADCompanyDividends);
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
