// ORM class for table 'tblnz_rtnsoa'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:27:36 NZDT 2020
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

public class tblnz_rtnsoa extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnMidYearEntry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fblnMidYearEntry = (Integer)value;
      }
    });
    setters.put("fblnOver5M", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fblnOver5M = (Integer)value;
      }
    });
    setters.put("fdtmAIM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fdtmAIM = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFilingFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrFilingFrequency = (String)value;
      }
    });
    setters.put("fblnHasMultipleActivities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fblnHasMultipleActivities = (Integer)value;
      }
    });
    setters.put("fcurSalesServices", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurSalesServices = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOpeningStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOpeningStock = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPurchases", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPurchases = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurClosingStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurClosingStock = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurClosingStockSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurClosingStockSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurClosingStockUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurClosingStockUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossProfit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurGrossProfit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurInterestReceived = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendsReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDividendsReceived = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRentalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurRentalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBadDebts", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurBadDebts = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountingDepreciation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountingDepreciation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInsurance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurInsurance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestExpense", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurInterestExpense = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProfessionalFees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProfessionalFees = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurRates = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRentalPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurRentalPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRepairs", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurRepairs = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResearchAndDevelopment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurResearchAndDevelopment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAssociatedPersonsRenum", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAssociatedPersonsRenum = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPaidToEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPaidToEmployees = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurContractorPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurContractorPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExceptionalItems", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurExceptionalItems = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurNetProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTaxAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentYearTaxablePL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurCurrentYearTaxablePL = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsReceivable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsReceivable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsReceivableSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsReceivableSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDepreciationRecovered", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDepreciationRecovered = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDepreciationRecoveredSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDepreciationRecoveredSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDepreciationRecoveredUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDepreciationRecoveredUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCashDeposits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurCashDeposits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherCurrentAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherCurrentAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurVehicles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurVehicles = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPlantAndMachinery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPlantAndMachinery = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFurnitureAndFittings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurFurnitureAndFittings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLand", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurLand = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBuildings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurBuildings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIntangibles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurIntangibles = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSharesOwnershipInterests", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurSharesOwnershipInterests = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTermDeposits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTermDeposits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherNonCurrentAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherNonCurrentAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsPayableSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsPayableSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsPayableUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsPayableUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentLoans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurCurrentLoans = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherCurrentLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOtherCurrentLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonCurrentLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurNonCurrentLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnersEquity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurOwnersEquity = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDepreciation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTaxDepreciation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDepreciationSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTaxDepreciationSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDepreciationUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTaxDepreciationUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUntaxedRealisedGains", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurUntaxedRealisedGains = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdditionsToFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAdditionsToFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDisposalsForFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDisposalsForFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendsPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDividendsPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDrawings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurDrawings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentAccountYearEndBal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurCurrentAccountYearEndBal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDeductibleLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurTaxDeductibleLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderProvTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurShareholderProvTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionsShareholders", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisionsShareholders = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionsShareholdersSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisionsShareholdersSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionsShareholdersUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisionsShareholdersUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsReceivableUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurAccountsReceivableUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPrivateUse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPrivateUse = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPrivateUseSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPrivateUseSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPrivateUseUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurPrivateUseUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionsSAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisionsSAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisionsUAV", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurProvisionsUAV = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurYearToDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurYearToDate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurThisInstalment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurThisInstalment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fcurRefundAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnRefundIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fblnRefundIndicator = (Integer)value;
      }
    });
    setters.put("fstrSoftwareProvider", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrSoftwareProvider = (String)value;
      }
    });
    setters.put("fstrSoftwarePlatform", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrSoftwarePlatform = (String)value;
      }
    });
    setters.put("fstrSoftwareRelease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrSoftwareRelease = (String)value;
      }
    });
    setters.put("fstrIPAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrIPAddress = (String)value;
      }
    });
    setters.put("fstrWebLogonId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrWebLogonId = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnsoa.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnsoa() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnsoa with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_rtnsoa with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer fblnMidYearEntry;
  public Integer get_fblnMidYearEntry() {
    return fblnMidYearEntry;
  }
  public void set_fblnMidYearEntry(Integer fblnMidYearEntry) {
    this.fblnMidYearEntry = fblnMidYearEntry;
  }
  public tblnz_rtnsoa with_fblnMidYearEntry(Integer fblnMidYearEntry) {
    this.fblnMidYearEntry = fblnMidYearEntry;
    return this;
  }
  private Integer fblnOver5M;
  public Integer get_fblnOver5M() {
    return fblnOver5M;
  }
  public void set_fblnOver5M(Integer fblnOver5M) {
    this.fblnOver5M = fblnOver5M;
  }
  public tblnz_rtnsoa with_fblnOver5M(Integer fblnOver5M) {
    this.fblnOver5M = fblnOver5M;
    return this;
  }
  private java.sql.Timestamp fdtmAIM;
  public java.sql.Timestamp get_fdtmAIM() {
    return fdtmAIM;
  }
  public void set_fdtmAIM(java.sql.Timestamp fdtmAIM) {
    this.fdtmAIM = fdtmAIM;
  }
  public tblnz_rtnsoa with_fdtmAIM(java.sql.Timestamp fdtmAIM) {
    this.fdtmAIM = fdtmAIM;
    return this;
  }
  private String fstrFilingFrequency;
  public String get_fstrFilingFrequency() {
    return fstrFilingFrequency;
  }
  public void set_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
  }
  public tblnz_rtnsoa with_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
    return this;
  }
  private Integer fblnHasMultipleActivities;
  public Integer get_fblnHasMultipleActivities() {
    return fblnHasMultipleActivities;
  }
  public void set_fblnHasMultipleActivities(Integer fblnHasMultipleActivities) {
    this.fblnHasMultipleActivities = fblnHasMultipleActivities;
  }
  public tblnz_rtnsoa with_fblnHasMultipleActivities(Integer fblnHasMultipleActivities) {
    this.fblnHasMultipleActivities = fblnHasMultipleActivities;
    return this;
  }
  private java.math.BigDecimal fcurSalesServices;
  public java.math.BigDecimal get_fcurSalesServices() {
    return fcurSalesServices;
  }
  public void set_fcurSalesServices(java.math.BigDecimal fcurSalesServices) {
    this.fcurSalesServices = fcurSalesServices;
  }
  public tblnz_rtnsoa with_fcurSalesServices(java.math.BigDecimal fcurSalesServices) {
    this.fcurSalesServices = fcurSalesServices;
    return this;
  }
  private java.math.BigDecimal fcurOpeningStock;
  public java.math.BigDecimal get_fcurOpeningStock() {
    return fcurOpeningStock;
  }
  public void set_fcurOpeningStock(java.math.BigDecimal fcurOpeningStock) {
    this.fcurOpeningStock = fcurOpeningStock;
  }
  public tblnz_rtnsoa with_fcurOpeningStock(java.math.BigDecimal fcurOpeningStock) {
    this.fcurOpeningStock = fcurOpeningStock;
    return this;
  }
  private java.math.BigDecimal fcurPurchases;
  public java.math.BigDecimal get_fcurPurchases() {
    return fcurPurchases;
  }
  public void set_fcurPurchases(java.math.BigDecimal fcurPurchases) {
    this.fcurPurchases = fcurPurchases;
  }
  public tblnz_rtnsoa with_fcurPurchases(java.math.BigDecimal fcurPurchases) {
    this.fcurPurchases = fcurPurchases;
    return this;
  }
  private java.math.BigDecimal fcurClosingStock;
  public java.math.BigDecimal get_fcurClosingStock() {
    return fcurClosingStock;
  }
  public void set_fcurClosingStock(java.math.BigDecimal fcurClosingStock) {
    this.fcurClosingStock = fcurClosingStock;
  }
  public tblnz_rtnsoa with_fcurClosingStock(java.math.BigDecimal fcurClosingStock) {
    this.fcurClosingStock = fcurClosingStock;
    return this;
  }
  private java.math.BigDecimal fcurClosingStockSAV;
  public java.math.BigDecimal get_fcurClosingStockSAV() {
    return fcurClosingStockSAV;
  }
  public void set_fcurClosingStockSAV(java.math.BigDecimal fcurClosingStockSAV) {
    this.fcurClosingStockSAV = fcurClosingStockSAV;
  }
  public tblnz_rtnsoa with_fcurClosingStockSAV(java.math.BigDecimal fcurClosingStockSAV) {
    this.fcurClosingStockSAV = fcurClosingStockSAV;
    return this;
  }
  private java.math.BigDecimal fcurClosingStockUAV;
  public java.math.BigDecimal get_fcurClosingStockUAV() {
    return fcurClosingStockUAV;
  }
  public void set_fcurClosingStockUAV(java.math.BigDecimal fcurClosingStockUAV) {
    this.fcurClosingStockUAV = fcurClosingStockUAV;
  }
  public tblnz_rtnsoa with_fcurClosingStockUAV(java.math.BigDecimal fcurClosingStockUAV) {
    this.fcurClosingStockUAV = fcurClosingStockUAV;
    return this;
  }
  private java.math.BigDecimal fcurGrossProfit;
  public java.math.BigDecimal get_fcurGrossProfit() {
    return fcurGrossProfit;
  }
  public void set_fcurGrossProfit(java.math.BigDecimal fcurGrossProfit) {
    this.fcurGrossProfit = fcurGrossProfit;
  }
  public tblnz_rtnsoa with_fcurGrossProfit(java.math.BigDecimal fcurGrossProfit) {
    this.fcurGrossProfit = fcurGrossProfit;
    return this;
  }
  private java.math.BigDecimal fcurInterestReceived;
  public java.math.BigDecimal get_fcurInterestReceived() {
    return fcurInterestReceived;
  }
  public void set_fcurInterestReceived(java.math.BigDecimal fcurInterestReceived) {
    this.fcurInterestReceived = fcurInterestReceived;
  }
  public tblnz_rtnsoa with_fcurInterestReceived(java.math.BigDecimal fcurInterestReceived) {
    this.fcurInterestReceived = fcurInterestReceived;
    return this;
  }
  private java.math.BigDecimal fcurDividendsReceived;
  public java.math.BigDecimal get_fcurDividendsReceived() {
    return fcurDividendsReceived;
  }
  public void set_fcurDividendsReceived(java.math.BigDecimal fcurDividendsReceived) {
    this.fcurDividendsReceived = fcurDividendsReceived;
  }
  public tblnz_rtnsoa with_fcurDividendsReceived(java.math.BigDecimal fcurDividendsReceived) {
    this.fcurDividendsReceived = fcurDividendsReceived;
    return this;
  }
  private java.math.BigDecimal fcurRentalIncome;
  public java.math.BigDecimal get_fcurRentalIncome() {
    return fcurRentalIncome;
  }
  public void set_fcurRentalIncome(java.math.BigDecimal fcurRentalIncome) {
    this.fcurRentalIncome = fcurRentalIncome;
  }
  public tblnz_rtnsoa with_fcurRentalIncome(java.math.BigDecimal fcurRentalIncome) {
    this.fcurRentalIncome = fcurRentalIncome;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_rtnsoa with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurBadDebts;
  public java.math.BigDecimal get_fcurBadDebts() {
    return fcurBadDebts;
  }
  public void set_fcurBadDebts(java.math.BigDecimal fcurBadDebts) {
    this.fcurBadDebts = fcurBadDebts;
  }
  public tblnz_rtnsoa with_fcurBadDebts(java.math.BigDecimal fcurBadDebts) {
    this.fcurBadDebts = fcurBadDebts;
    return this;
  }
  private java.math.BigDecimal fcurAccountingDepreciation;
  public java.math.BigDecimal get_fcurAccountingDepreciation() {
    return fcurAccountingDepreciation;
  }
  public void set_fcurAccountingDepreciation(java.math.BigDecimal fcurAccountingDepreciation) {
    this.fcurAccountingDepreciation = fcurAccountingDepreciation;
  }
  public tblnz_rtnsoa with_fcurAccountingDepreciation(java.math.BigDecimal fcurAccountingDepreciation) {
    this.fcurAccountingDepreciation = fcurAccountingDepreciation;
    return this;
  }
  private java.math.BigDecimal fcurInsurance;
  public java.math.BigDecimal get_fcurInsurance() {
    return fcurInsurance;
  }
  public void set_fcurInsurance(java.math.BigDecimal fcurInsurance) {
    this.fcurInsurance = fcurInsurance;
  }
  public tblnz_rtnsoa with_fcurInsurance(java.math.BigDecimal fcurInsurance) {
    this.fcurInsurance = fcurInsurance;
    return this;
  }
  private java.math.BigDecimal fcurInterestExpense;
  public java.math.BigDecimal get_fcurInterestExpense() {
    return fcurInterestExpense;
  }
  public void set_fcurInterestExpense(java.math.BigDecimal fcurInterestExpense) {
    this.fcurInterestExpense = fcurInterestExpense;
  }
  public tblnz_rtnsoa with_fcurInterestExpense(java.math.BigDecimal fcurInterestExpense) {
    this.fcurInterestExpense = fcurInterestExpense;
    return this;
  }
  private java.math.BigDecimal fcurProfessionalFees;
  public java.math.BigDecimal get_fcurProfessionalFees() {
    return fcurProfessionalFees;
  }
  public void set_fcurProfessionalFees(java.math.BigDecimal fcurProfessionalFees) {
    this.fcurProfessionalFees = fcurProfessionalFees;
  }
  public tblnz_rtnsoa with_fcurProfessionalFees(java.math.BigDecimal fcurProfessionalFees) {
    this.fcurProfessionalFees = fcurProfessionalFees;
    return this;
  }
  private java.math.BigDecimal fcurRates;
  public java.math.BigDecimal get_fcurRates() {
    return fcurRates;
  }
  public void set_fcurRates(java.math.BigDecimal fcurRates) {
    this.fcurRates = fcurRates;
  }
  public tblnz_rtnsoa with_fcurRates(java.math.BigDecimal fcurRates) {
    this.fcurRates = fcurRates;
    return this;
  }
  private java.math.BigDecimal fcurRentalPayments;
  public java.math.BigDecimal get_fcurRentalPayments() {
    return fcurRentalPayments;
  }
  public void set_fcurRentalPayments(java.math.BigDecimal fcurRentalPayments) {
    this.fcurRentalPayments = fcurRentalPayments;
  }
  public tblnz_rtnsoa with_fcurRentalPayments(java.math.BigDecimal fcurRentalPayments) {
    this.fcurRentalPayments = fcurRentalPayments;
    return this;
  }
  private java.math.BigDecimal fcurRepairs;
  public java.math.BigDecimal get_fcurRepairs() {
    return fcurRepairs;
  }
  public void set_fcurRepairs(java.math.BigDecimal fcurRepairs) {
    this.fcurRepairs = fcurRepairs;
  }
  public tblnz_rtnsoa with_fcurRepairs(java.math.BigDecimal fcurRepairs) {
    this.fcurRepairs = fcurRepairs;
    return this;
  }
  private java.math.BigDecimal fcurResearchAndDevelopment;
  public java.math.BigDecimal get_fcurResearchAndDevelopment() {
    return fcurResearchAndDevelopment;
  }
  public void set_fcurResearchAndDevelopment(java.math.BigDecimal fcurResearchAndDevelopment) {
    this.fcurResearchAndDevelopment = fcurResearchAndDevelopment;
  }
  public tblnz_rtnsoa with_fcurResearchAndDevelopment(java.math.BigDecimal fcurResearchAndDevelopment) {
    this.fcurResearchAndDevelopment = fcurResearchAndDevelopment;
    return this;
  }
  private java.math.BigDecimal fcurAssociatedPersonsRenum;
  public java.math.BigDecimal get_fcurAssociatedPersonsRenum() {
    return fcurAssociatedPersonsRenum;
  }
  public void set_fcurAssociatedPersonsRenum(java.math.BigDecimal fcurAssociatedPersonsRenum) {
    this.fcurAssociatedPersonsRenum = fcurAssociatedPersonsRenum;
  }
  public tblnz_rtnsoa with_fcurAssociatedPersonsRenum(java.math.BigDecimal fcurAssociatedPersonsRenum) {
    this.fcurAssociatedPersonsRenum = fcurAssociatedPersonsRenum;
    return this;
  }
  private java.math.BigDecimal fcurPaidToEmployees;
  public java.math.BigDecimal get_fcurPaidToEmployees() {
    return fcurPaidToEmployees;
  }
  public void set_fcurPaidToEmployees(java.math.BigDecimal fcurPaidToEmployees) {
    this.fcurPaidToEmployees = fcurPaidToEmployees;
  }
  public tblnz_rtnsoa with_fcurPaidToEmployees(java.math.BigDecimal fcurPaidToEmployees) {
    this.fcurPaidToEmployees = fcurPaidToEmployees;
    return this;
  }
  private java.math.BigDecimal fcurContractorPayments;
  public java.math.BigDecimal get_fcurContractorPayments() {
    return fcurContractorPayments;
  }
  public void set_fcurContractorPayments(java.math.BigDecimal fcurContractorPayments) {
    this.fcurContractorPayments = fcurContractorPayments;
  }
  public tblnz_rtnsoa with_fcurContractorPayments(java.math.BigDecimal fcurContractorPayments) {
    this.fcurContractorPayments = fcurContractorPayments;
    return this;
  }
  private java.math.BigDecimal fcurOtherExpenses;
  public java.math.BigDecimal get_fcurOtherExpenses() {
    return fcurOtherExpenses;
  }
  public void set_fcurOtherExpenses(java.math.BigDecimal fcurOtherExpenses) {
    this.fcurOtherExpenses = fcurOtherExpenses;
  }
  public tblnz_rtnsoa with_fcurOtherExpenses(java.math.BigDecimal fcurOtherExpenses) {
    this.fcurOtherExpenses = fcurOtherExpenses;
    return this;
  }
  private java.math.BigDecimal fcurExceptionalItems;
  public java.math.BigDecimal get_fcurExceptionalItems() {
    return fcurExceptionalItems;
  }
  public void set_fcurExceptionalItems(java.math.BigDecimal fcurExceptionalItems) {
    this.fcurExceptionalItems = fcurExceptionalItems;
  }
  public tblnz_rtnsoa with_fcurExceptionalItems(java.math.BigDecimal fcurExceptionalItems) {
    this.fcurExceptionalItems = fcurExceptionalItems;
    return this;
  }
  private java.math.BigDecimal fcurNetProfitLoss;
  public java.math.BigDecimal get_fcurNetProfitLoss() {
    return fcurNetProfitLoss;
  }
  public void set_fcurNetProfitLoss(java.math.BigDecimal fcurNetProfitLoss) {
    this.fcurNetProfitLoss = fcurNetProfitLoss;
  }
  public tblnz_rtnsoa with_fcurNetProfitLoss(java.math.BigDecimal fcurNetProfitLoss) {
    this.fcurNetProfitLoss = fcurNetProfitLoss;
    return this;
  }
  private java.math.BigDecimal fcurTaxAdjustments;
  public java.math.BigDecimal get_fcurTaxAdjustments() {
    return fcurTaxAdjustments;
  }
  public void set_fcurTaxAdjustments(java.math.BigDecimal fcurTaxAdjustments) {
    this.fcurTaxAdjustments = fcurTaxAdjustments;
  }
  public tblnz_rtnsoa with_fcurTaxAdjustments(java.math.BigDecimal fcurTaxAdjustments) {
    this.fcurTaxAdjustments = fcurTaxAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurCurrentYearTaxablePL;
  public java.math.BigDecimal get_fcurCurrentYearTaxablePL() {
    return fcurCurrentYearTaxablePL;
  }
  public void set_fcurCurrentYearTaxablePL(java.math.BigDecimal fcurCurrentYearTaxablePL) {
    this.fcurCurrentYearTaxablePL = fcurCurrentYearTaxablePL;
  }
  public tblnz_rtnsoa with_fcurCurrentYearTaxablePL(java.math.BigDecimal fcurCurrentYearTaxablePL) {
    this.fcurCurrentYearTaxablePL = fcurCurrentYearTaxablePL;
    return this;
  }
  private java.math.BigDecimal fcurAccountsReceivable;
  public java.math.BigDecimal get_fcurAccountsReceivable() {
    return fcurAccountsReceivable;
  }
  public void set_fcurAccountsReceivable(java.math.BigDecimal fcurAccountsReceivable) {
    this.fcurAccountsReceivable = fcurAccountsReceivable;
  }
  public tblnz_rtnsoa with_fcurAccountsReceivable(java.math.BigDecimal fcurAccountsReceivable) {
    this.fcurAccountsReceivable = fcurAccountsReceivable;
    return this;
  }
  private java.math.BigDecimal fcurAccountsReceivableSAV;
  public java.math.BigDecimal get_fcurAccountsReceivableSAV() {
    return fcurAccountsReceivableSAV;
  }
  public void set_fcurAccountsReceivableSAV(java.math.BigDecimal fcurAccountsReceivableSAV) {
    this.fcurAccountsReceivableSAV = fcurAccountsReceivableSAV;
  }
  public tblnz_rtnsoa with_fcurAccountsReceivableSAV(java.math.BigDecimal fcurAccountsReceivableSAV) {
    this.fcurAccountsReceivableSAV = fcurAccountsReceivableSAV;
    return this;
  }
  private java.math.BigDecimal fcurDepreciationRecovered;
  public java.math.BigDecimal get_fcurDepreciationRecovered() {
    return fcurDepreciationRecovered;
  }
  public void set_fcurDepreciationRecovered(java.math.BigDecimal fcurDepreciationRecovered) {
    this.fcurDepreciationRecovered = fcurDepreciationRecovered;
  }
  public tblnz_rtnsoa with_fcurDepreciationRecovered(java.math.BigDecimal fcurDepreciationRecovered) {
    this.fcurDepreciationRecovered = fcurDepreciationRecovered;
    return this;
  }
  private java.math.BigDecimal fcurDepreciationRecoveredSAV;
  public java.math.BigDecimal get_fcurDepreciationRecoveredSAV() {
    return fcurDepreciationRecoveredSAV;
  }
  public void set_fcurDepreciationRecoveredSAV(java.math.BigDecimal fcurDepreciationRecoveredSAV) {
    this.fcurDepreciationRecoveredSAV = fcurDepreciationRecoveredSAV;
  }
  public tblnz_rtnsoa with_fcurDepreciationRecoveredSAV(java.math.BigDecimal fcurDepreciationRecoveredSAV) {
    this.fcurDepreciationRecoveredSAV = fcurDepreciationRecoveredSAV;
    return this;
  }
  private java.math.BigDecimal fcurDepreciationRecoveredUAV;
  public java.math.BigDecimal get_fcurDepreciationRecoveredUAV() {
    return fcurDepreciationRecoveredUAV;
  }
  public void set_fcurDepreciationRecoveredUAV(java.math.BigDecimal fcurDepreciationRecoveredUAV) {
    this.fcurDepreciationRecoveredUAV = fcurDepreciationRecoveredUAV;
  }
  public tblnz_rtnsoa with_fcurDepreciationRecoveredUAV(java.math.BigDecimal fcurDepreciationRecoveredUAV) {
    this.fcurDepreciationRecoveredUAV = fcurDepreciationRecoveredUAV;
    return this;
  }
  private java.math.BigDecimal fcurCashDeposits;
  public java.math.BigDecimal get_fcurCashDeposits() {
    return fcurCashDeposits;
  }
  public void set_fcurCashDeposits(java.math.BigDecimal fcurCashDeposits) {
    this.fcurCashDeposits = fcurCashDeposits;
  }
  public tblnz_rtnsoa with_fcurCashDeposits(java.math.BigDecimal fcurCashDeposits) {
    this.fcurCashDeposits = fcurCashDeposits;
    return this;
  }
  private java.math.BigDecimal fcurOtherCurrentAssets;
  public java.math.BigDecimal get_fcurOtherCurrentAssets() {
    return fcurOtherCurrentAssets;
  }
  public void set_fcurOtherCurrentAssets(java.math.BigDecimal fcurOtherCurrentAssets) {
    this.fcurOtherCurrentAssets = fcurOtherCurrentAssets;
  }
  public tblnz_rtnsoa with_fcurOtherCurrentAssets(java.math.BigDecimal fcurOtherCurrentAssets) {
    this.fcurOtherCurrentAssets = fcurOtherCurrentAssets;
    return this;
  }
  private java.math.BigDecimal fcurVehicles;
  public java.math.BigDecimal get_fcurVehicles() {
    return fcurVehicles;
  }
  public void set_fcurVehicles(java.math.BigDecimal fcurVehicles) {
    this.fcurVehicles = fcurVehicles;
  }
  public tblnz_rtnsoa with_fcurVehicles(java.math.BigDecimal fcurVehicles) {
    this.fcurVehicles = fcurVehicles;
    return this;
  }
  private java.math.BigDecimal fcurPlantAndMachinery;
  public java.math.BigDecimal get_fcurPlantAndMachinery() {
    return fcurPlantAndMachinery;
  }
  public void set_fcurPlantAndMachinery(java.math.BigDecimal fcurPlantAndMachinery) {
    this.fcurPlantAndMachinery = fcurPlantAndMachinery;
  }
  public tblnz_rtnsoa with_fcurPlantAndMachinery(java.math.BigDecimal fcurPlantAndMachinery) {
    this.fcurPlantAndMachinery = fcurPlantAndMachinery;
    return this;
  }
  private java.math.BigDecimal fcurFurnitureAndFittings;
  public java.math.BigDecimal get_fcurFurnitureAndFittings() {
    return fcurFurnitureAndFittings;
  }
  public void set_fcurFurnitureAndFittings(java.math.BigDecimal fcurFurnitureAndFittings) {
    this.fcurFurnitureAndFittings = fcurFurnitureAndFittings;
  }
  public tblnz_rtnsoa with_fcurFurnitureAndFittings(java.math.BigDecimal fcurFurnitureAndFittings) {
    this.fcurFurnitureAndFittings = fcurFurnitureAndFittings;
    return this;
  }
  private java.math.BigDecimal fcurLand;
  public java.math.BigDecimal get_fcurLand() {
    return fcurLand;
  }
  public void set_fcurLand(java.math.BigDecimal fcurLand) {
    this.fcurLand = fcurLand;
  }
  public tblnz_rtnsoa with_fcurLand(java.math.BigDecimal fcurLand) {
    this.fcurLand = fcurLand;
    return this;
  }
  private java.math.BigDecimal fcurBuildings;
  public java.math.BigDecimal get_fcurBuildings() {
    return fcurBuildings;
  }
  public void set_fcurBuildings(java.math.BigDecimal fcurBuildings) {
    this.fcurBuildings = fcurBuildings;
  }
  public tblnz_rtnsoa with_fcurBuildings(java.math.BigDecimal fcurBuildings) {
    this.fcurBuildings = fcurBuildings;
    return this;
  }
  private java.math.BigDecimal fcurOtherFixedAssets;
  public java.math.BigDecimal get_fcurOtherFixedAssets() {
    return fcurOtherFixedAssets;
  }
  public void set_fcurOtherFixedAssets(java.math.BigDecimal fcurOtherFixedAssets) {
    this.fcurOtherFixedAssets = fcurOtherFixedAssets;
  }
  public tblnz_rtnsoa with_fcurOtherFixedAssets(java.math.BigDecimal fcurOtherFixedAssets) {
    this.fcurOtherFixedAssets = fcurOtherFixedAssets;
    return this;
  }
  private java.math.BigDecimal fcurIntangibles;
  public java.math.BigDecimal get_fcurIntangibles() {
    return fcurIntangibles;
  }
  public void set_fcurIntangibles(java.math.BigDecimal fcurIntangibles) {
    this.fcurIntangibles = fcurIntangibles;
  }
  public tblnz_rtnsoa with_fcurIntangibles(java.math.BigDecimal fcurIntangibles) {
    this.fcurIntangibles = fcurIntangibles;
    return this;
  }
  private java.math.BigDecimal fcurSharesOwnershipInterests;
  public java.math.BigDecimal get_fcurSharesOwnershipInterests() {
    return fcurSharesOwnershipInterests;
  }
  public void set_fcurSharesOwnershipInterests(java.math.BigDecimal fcurSharesOwnershipInterests) {
    this.fcurSharesOwnershipInterests = fcurSharesOwnershipInterests;
  }
  public tblnz_rtnsoa with_fcurSharesOwnershipInterests(java.math.BigDecimal fcurSharesOwnershipInterests) {
    this.fcurSharesOwnershipInterests = fcurSharesOwnershipInterests;
    return this;
  }
  private java.math.BigDecimal fcurTermDeposits;
  public java.math.BigDecimal get_fcurTermDeposits() {
    return fcurTermDeposits;
  }
  public void set_fcurTermDeposits(java.math.BigDecimal fcurTermDeposits) {
    this.fcurTermDeposits = fcurTermDeposits;
  }
  public tblnz_rtnsoa with_fcurTermDeposits(java.math.BigDecimal fcurTermDeposits) {
    this.fcurTermDeposits = fcurTermDeposits;
    return this;
  }
  private java.math.BigDecimal fcurOtherNonCurrentAssets;
  public java.math.BigDecimal get_fcurOtherNonCurrentAssets() {
    return fcurOtherNonCurrentAssets;
  }
  public void set_fcurOtherNonCurrentAssets(java.math.BigDecimal fcurOtherNonCurrentAssets) {
    this.fcurOtherNonCurrentAssets = fcurOtherNonCurrentAssets;
  }
  public tblnz_rtnsoa with_fcurOtherNonCurrentAssets(java.math.BigDecimal fcurOtherNonCurrentAssets) {
    this.fcurOtherNonCurrentAssets = fcurOtherNonCurrentAssets;
    return this;
  }
  private java.math.BigDecimal fcurProvisions;
  public java.math.BigDecimal get_fcurProvisions() {
    return fcurProvisions;
  }
  public void set_fcurProvisions(java.math.BigDecimal fcurProvisions) {
    this.fcurProvisions = fcurProvisions;
  }
  public tblnz_rtnsoa with_fcurProvisions(java.math.BigDecimal fcurProvisions) {
    this.fcurProvisions = fcurProvisions;
    return this;
  }
  private java.math.BigDecimal fcurAccountsPayable;
  public java.math.BigDecimal get_fcurAccountsPayable() {
    return fcurAccountsPayable;
  }
  public void set_fcurAccountsPayable(java.math.BigDecimal fcurAccountsPayable) {
    this.fcurAccountsPayable = fcurAccountsPayable;
  }
  public tblnz_rtnsoa with_fcurAccountsPayable(java.math.BigDecimal fcurAccountsPayable) {
    this.fcurAccountsPayable = fcurAccountsPayable;
    return this;
  }
  private java.math.BigDecimal fcurAccountsPayableSAV;
  public java.math.BigDecimal get_fcurAccountsPayableSAV() {
    return fcurAccountsPayableSAV;
  }
  public void set_fcurAccountsPayableSAV(java.math.BigDecimal fcurAccountsPayableSAV) {
    this.fcurAccountsPayableSAV = fcurAccountsPayableSAV;
  }
  public tblnz_rtnsoa with_fcurAccountsPayableSAV(java.math.BigDecimal fcurAccountsPayableSAV) {
    this.fcurAccountsPayableSAV = fcurAccountsPayableSAV;
    return this;
  }
  private java.math.BigDecimal fcurAccountsPayableUAV;
  public java.math.BigDecimal get_fcurAccountsPayableUAV() {
    return fcurAccountsPayableUAV;
  }
  public void set_fcurAccountsPayableUAV(java.math.BigDecimal fcurAccountsPayableUAV) {
    this.fcurAccountsPayableUAV = fcurAccountsPayableUAV;
  }
  public tblnz_rtnsoa with_fcurAccountsPayableUAV(java.math.BigDecimal fcurAccountsPayableUAV) {
    this.fcurAccountsPayableUAV = fcurAccountsPayableUAV;
    return this;
  }
  private java.math.BigDecimal fcurCurrentLoans;
  public java.math.BigDecimal get_fcurCurrentLoans() {
    return fcurCurrentLoans;
  }
  public void set_fcurCurrentLoans(java.math.BigDecimal fcurCurrentLoans) {
    this.fcurCurrentLoans = fcurCurrentLoans;
  }
  public tblnz_rtnsoa with_fcurCurrentLoans(java.math.BigDecimal fcurCurrentLoans) {
    this.fcurCurrentLoans = fcurCurrentLoans;
    return this;
  }
  private java.math.BigDecimal fcurOtherCurrentLiabilities;
  public java.math.BigDecimal get_fcurOtherCurrentLiabilities() {
    return fcurOtherCurrentLiabilities;
  }
  public void set_fcurOtherCurrentLiabilities(java.math.BigDecimal fcurOtherCurrentLiabilities) {
    this.fcurOtherCurrentLiabilities = fcurOtherCurrentLiabilities;
  }
  public tblnz_rtnsoa with_fcurOtherCurrentLiabilities(java.math.BigDecimal fcurOtherCurrentLiabilities) {
    this.fcurOtherCurrentLiabilities = fcurOtherCurrentLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurNonCurrentLiabilities;
  public java.math.BigDecimal get_fcurNonCurrentLiabilities() {
    return fcurNonCurrentLiabilities;
  }
  public void set_fcurNonCurrentLiabilities(java.math.BigDecimal fcurNonCurrentLiabilities) {
    this.fcurNonCurrentLiabilities = fcurNonCurrentLiabilities;
  }
  public tblnz_rtnsoa with_fcurNonCurrentLiabilities(java.math.BigDecimal fcurNonCurrentLiabilities) {
    this.fcurNonCurrentLiabilities = fcurNonCurrentLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurOwnersEquity;
  public java.math.BigDecimal get_fcurOwnersEquity() {
    return fcurOwnersEquity;
  }
  public void set_fcurOwnersEquity(java.math.BigDecimal fcurOwnersEquity) {
    this.fcurOwnersEquity = fcurOwnersEquity;
  }
  public tblnz_rtnsoa with_fcurOwnersEquity(java.math.BigDecimal fcurOwnersEquity) {
    this.fcurOwnersEquity = fcurOwnersEquity;
    return this;
  }
  private java.math.BigDecimal fcurTaxDepreciation;
  public java.math.BigDecimal get_fcurTaxDepreciation() {
    return fcurTaxDepreciation;
  }
  public void set_fcurTaxDepreciation(java.math.BigDecimal fcurTaxDepreciation) {
    this.fcurTaxDepreciation = fcurTaxDepreciation;
  }
  public tblnz_rtnsoa with_fcurTaxDepreciation(java.math.BigDecimal fcurTaxDepreciation) {
    this.fcurTaxDepreciation = fcurTaxDepreciation;
    return this;
  }
  private java.math.BigDecimal fcurTaxDepreciationSAV;
  public java.math.BigDecimal get_fcurTaxDepreciationSAV() {
    return fcurTaxDepreciationSAV;
  }
  public void set_fcurTaxDepreciationSAV(java.math.BigDecimal fcurTaxDepreciationSAV) {
    this.fcurTaxDepreciationSAV = fcurTaxDepreciationSAV;
  }
  public tblnz_rtnsoa with_fcurTaxDepreciationSAV(java.math.BigDecimal fcurTaxDepreciationSAV) {
    this.fcurTaxDepreciationSAV = fcurTaxDepreciationSAV;
    return this;
  }
  private java.math.BigDecimal fcurTaxDepreciationUAV;
  public java.math.BigDecimal get_fcurTaxDepreciationUAV() {
    return fcurTaxDepreciationUAV;
  }
  public void set_fcurTaxDepreciationUAV(java.math.BigDecimal fcurTaxDepreciationUAV) {
    this.fcurTaxDepreciationUAV = fcurTaxDepreciationUAV;
  }
  public tblnz_rtnsoa with_fcurTaxDepreciationUAV(java.math.BigDecimal fcurTaxDepreciationUAV) {
    this.fcurTaxDepreciationUAV = fcurTaxDepreciationUAV;
    return this;
  }
  private java.math.BigDecimal fcurUntaxedRealisedGains;
  public java.math.BigDecimal get_fcurUntaxedRealisedGains() {
    return fcurUntaxedRealisedGains;
  }
  public void set_fcurUntaxedRealisedGains(java.math.BigDecimal fcurUntaxedRealisedGains) {
    this.fcurUntaxedRealisedGains = fcurUntaxedRealisedGains;
  }
  public tblnz_rtnsoa with_fcurUntaxedRealisedGains(java.math.BigDecimal fcurUntaxedRealisedGains) {
    this.fcurUntaxedRealisedGains = fcurUntaxedRealisedGains;
    return this;
  }
  private java.math.BigDecimal fcurAdditionsToFixedAssets;
  public java.math.BigDecimal get_fcurAdditionsToFixedAssets() {
    return fcurAdditionsToFixedAssets;
  }
  public void set_fcurAdditionsToFixedAssets(java.math.BigDecimal fcurAdditionsToFixedAssets) {
    this.fcurAdditionsToFixedAssets = fcurAdditionsToFixedAssets;
  }
  public tblnz_rtnsoa with_fcurAdditionsToFixedAssets(java.math.BigDecimal fcurAdditionsToFixedAssets) {
    this.fcurAdditionsToFixedAssets = fcurAdditionsToFixedAssets;
    return this;
  }
  private java.math.BigDecimal fcurDisposalsForFixedAssets;
  public java.math.BigDecimal get_fcurDisposalsForFixedAssets() {
    return fcurDisposalsForFixedAssets;
  }
  public void set_fcurDisposalsForFixedAssets(java.math.BigDecimal fcurDisposalsForFixedAssets) {
    this.fcurDisposalsForFixedAssets = fcurDisposalsForFixedAssets;
  }
  public tblnz_rtnsoa with_fcurDisposalsForFixedAssets(java.math.BigDecimal fcurDisposalsForFixedAssets) {
    this.fcurDisposalsForFixedAssets = fcurDisposalsForFixedAssets;
    return this;
  }
  private java.math.BigDecimal fcurDividendsPaid;
  public java.math.BigDecimal get_fcurDividendsPaid() {
    return fcurDividendsPaid;
  }
  public void set_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
    this.fcurDividendsPaid = fcurDividendsPaid;
  }
  public tblnz_rtnsoa with_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
    this.fcurDividendsPaid = fcurDividendsPaid;
    return this;
  }
  private java.math.BigDecimal fcurDrawings;
  public java.math.BigDecimal get_fcurDrawings() {
    return fcurDrawings;
  }
  public void set_fcurDrawings(java.math.BigDecimal fcurDrawings) {
    this.fcurDrawings = fcurDrawings;
  }
  public tblnz_rtnsoa with_fcurDrawings(java.math.BigDecimal fcurDrawings) {
    this.fcurDrawings = fcurDrawings;
    return this;
  }
  private java.math.BigDecimal fcurCurrentAccountYearEndBal;
  public java.math.BigDecimal get_fcurCurrentAccountYearEndBal() {
    return fcurCurrentAccountYearEndBal;
  }
  public void set_fcurCurrentAccountYearEndBal(java.math.BigDecimal fcurCurrentAccountYearEndBal) {
    this.fcurCurrentAccountYearEndBal = fcurCurrentAccountYearEndBal;
  }
  public tblnz_rtnsoa with_fcurCurrentAccountYearEndBal(java.math.BigDecimal fcurCurrentAccountYearEndBal) {
    this.fcurCurrentAccountYearEndBal = fcurCurrentAccountYearEndBal;
    return this;
  }
  private java.math.BigDecimal fcurTaxDeductibleLoss;
  public java.math.BigDecimal get_fcurTaxDeductibleLoss() {
    return fcurTaxDeductibleLoss;
  }
  public void set_fcurTaxDeductibleLoss(java.math.BigDecimal fcurTaxDeductibleLoss) {
    this.fcurTaxDeductibleLoss = fcurTaxDeductibleLoss;
  }
  public tblnz_rtnsoa with_fcurTaxDeductibleLoss(java.math.BigDecimal fcurTaxDeductibleLoss) {
    this.fcurTaxDeductibleLoss = fcurTaxDeductibleLoss;
    return this;
  }
  private java.math.BigDecimal fcurShareholderProvTax;
  public java.math.BigDecimal get_fcurShareholderProvTax() {
    return fcurShareholderProvTax;
  }
  public void set_fcurShareholderProvTax(java.math.BigDecimal fcurShareholderProvTax) {
    this.fcurShareholderProvTax = fcurShareholderProvTax;
  }
  public tblnz_rtnsoa with_fcurShareholderProvTax(java.math.BigDecimal fcurShareholderProvTax) {
    this.fcurShareholderProvTax = fcurShareholderProvTax;
    return this;
  }
  private java.math.BigDecimal fcurProvisionsShareholders;
  public java.math.BigDecimal get_fcurProvisionsShareholders() {
    return fcurProvisionsShareholders;
  }
  public void set_fcurProvisionsShareholders(java.math.BigDecimal fcurProvisionsShareholders) {
    this.fcurProvisionsShareholders = fcurProvisionsShareholders;
  }
  public tblnz_rtnsoa with_fcurProvisionsShareholders(java.math.BigDecimal fcurProvisionsShareholders) {
    this.fcurProvisionsShareholders = fcurProvisionsShareholders;
    return this;
  }
  private java.math.BigDecimal fcurProvisionsShareholdersSAV;
  public java.math.BigDecimal get_fcurProvisionsShareholdersSAV() {
    return fcurProvisionsShareholdersSAV;
  }
  public void set_fcurProvisionsShareholdersSAV(java.math.BigDecimal fcurProvisionsShareholdersSAV) {
    this.fcurProvisionsShareholdersSAV = fcurProvisionsShareholdersSAV;
  }
  public tblnz_rtnsoa with_fcurProvisionsShareholdersSAV(java.math.BigDecimal fcurProvisionsShareholdersSAV) {
    this.fcurProvisionsShareholdersSAV = fcurProvisionsShareholdersSAV;
    return this;
  }
  private java.math.BigDecimal fcurProvisionsShareholdersUAV;
  public java.math.BigDecimal get_fcurProvisionsShareholdersUAV() {
    return fcurProvisionsShareholdersUAV;
  }
  public void set_fcurProvisionsShareholdersUAV(java.math.BigDecimal fcurProvisionsShareholdersUAV) {
    this.fcurProvisionsShareholdersUAV = fcurProvisionsShareholdersUAV;
  }
  public tblnz_rtnsoa with_fcurProvisionsShareholdersUAV(java.math.BigDecimal fcurProvisionsShareholdersUAV) {
    this.fcurProvisionsShareholdersUAV = fcurProvisionsShareholdersUAV;
    return this;
  }
  private java.math.BigDecimal fcurAccountsReceivableUAV;
  public java.math.BigDecimal get_fcurAccountsReceivableUAV() {
    return fcurAccountsReceivableUAV;
  }
  public void set_fcurAccountsReceivableUAV(java.math.BigDecimal fcurAccountsReceivableUAV) {
    this.fcurAccountsReceivableUAV = fcurAccountsReceivableUAV;
  }
  public tblnz_rtnsoa with_fcurAccountsReceivableUAV(java.math.BigDecimal fcurAccountsReceivableUAV) {
    this.fcurAccountsReceivableUAV = fcurAccountsReceivableUAV;
    return this;
  }
  private java.math.BigDecimal fcurPrivateUse;
  public java.math.BigDecimal get_fcurPrivateUse() {
    return fcurPrivateUse;
  }
  public void set_fcurPrivateUse(java.math.BigDecimal fcurPrivateUse) {
    this.fcurPrivateUse = fcurPrivateUse;
  }
  public tblnz_rtnsoa with_fcurPrivateUse(java.math.BigDecimal fcurPrivateUse) {
    this.fcurPrivateUse = fcurPrivateUse;
    return this;
  }
  private java.math.BigDecimal fcurLosses;
  public java.math.BigDecimal get_fcurLosses() {
    return fcurLosses;
  }
  public void set_fcurLosses(java.math.BigDecimal fcurLosses) {
    this.fcurLosses = fcurLosses;
  }
  public tblnz_rtnsoa with_fcurLosses(java.math.BigDecimal fcurLosses) {
    this.fcurLosses = fcurLosses;
    return this;
  }
  private java.math.BigDecimal fcurPrivateUseSAV;
  public java.math.BigDecimal get_fcurPrivateUseSAV() {
    return fcurPrivateUseSAV;
  }
  public void set_fcurPrivateUseSAV(java.math.BigDecimal fcurPrivateUseSAV) {
    this.fcurPrivateUseSAV = fcurPrivateUseSAV;
  }
  public tblnz_rtnsoa with_fcurPrivateUseSAV(java.math.BigDecimal fcurPrivateUseSAV) {
    this.fcurPrivateUseSAV = fcurPrivateUseSAV;
    return this;
  }
  private java.math.BigDecimal fcurPrivateUseUAV;
  public java.math.BigDecimal get_fcurPrivateUseUAV() {
    return fcurPrivateUseUAV;
  }
  public void set_fcurPrivateUseUAV(java.math.BigDecimal fcurPrivateUseUAV) {
    this.fcurPrivateUseUAV = fcurPrivateUseUAV;
  }
  public tblnz_rtnsoa with_fcurPrivateUseUAV(java.math.BigDecimal fcurPrivateUseUAV) {
    this.fcurPrivateUseUAV = fcurPrivateUseUAV;
    return this;
  }
  private java.math.BigDecimal fcurProvisionsSAV;
  public java.math.BigDecimal get_fcurProvisionsSAV() {
    return fcurProvisionsSAV;
  }
  public void set_fcurProvisionsSAV(java.math.BigDecimal fcurProvisionsSAV) {
    this.fcurProvisionsSAV = fcurProvisionsSAV;
  }
  public tblnz_rtnsoa with_fcurProvisionsSAV(java.math.BigDecimal fcurProvisionsSAV) {
    this.fcurProvisionsSAV = fcurProvisionsSAV;
    return this;
  }
  private java.math.BigDecimal fcurProvisionsUAV;
  public java.math.BigDecimal get_fcurProvisionsUAV() {
    return fcurProvisionsUAV;
  }
  public void set_fcurProvisionsUAV(java.math.BigDecimal fcurProvisionsUAV) {
    this.fcurProvisionsUAV = fcurProvisionsUAV;
  }
  public tblnz_rtnsoa with_fcurProvisionsUAV(java.math.BigDecimal fcurProvisionsUAV) {
    this.fcurProvisionsUAV = fcurProvisionsUAV;
    return this;
  }
  private java.math.BigDecimal fcurYearToDate;
  public java.math.BigDecimal get_fcurYearToDate() {
    return fcurYearToDate;
  }
  public void set_fcurYearToDate(java.math.BigDecimal fcurYearToDate) {
    this.fcurYearToDate = fcurYearToDate;
  }
  public tblnz_rtnsoa with_fcurYearToDate(java.math.BigDecimal fcurYearToDate) {
    this.fcurYearToDate = fcurYearToDate;
    return this;
  }
  private java.math.BigDecimal fcurThisInstalment;
  public java.math.BigDecimal get_fcurThisInstalment() {
    return fcurThisInstalment;
  }
  public void set_fcurThisInstalment(java.math.BigDecimal fcurThisInstalment) {
    this.fcurThisInstalment = fcurThisInstalment;
  }
  public tblnz_rtnsoa with_fcurThisInstalment(java.math.BigDecimal fcurThisInstalment) {
    this.fcurThisInstalment = fcurThisInstalment;
    return this;
  }
  private java.math.BigDecimal fcurRefundAmount;
  public java.math.BigDecimal get_fcurRefundAmount() {
    return fcurRefundAmount;
  }
  public void set_fcurRefundAmount(java.math.BigDecimal fcurRefundAmount) {
    this.fcurRefundAmount = fcurRefundAmount;
  }
  public tblnz_rtnsoa with_fcurRefundAmount(java.math.BigDecimal fcurRefundAmount) {
    this.fcurRefundAmount = fcurRefundAmount;
    return this;
  }
  private Integer fblnRefundIndicator;
  public Integer get_fblnRefundIndicator() {
    return fblnRefundIndicator;
  }
  public void set_fblnRefundIndicator(Integer fblnRefundIndicator) {
    this.fblnRefundIndicator = fblnRefundIndicator;
  }
  public tblnz_rtnsoa with_fblnRefundIndicator(Integer fblnRefundIndicator) {
    this.fblnRefundIndicator = fblnRefundIndicator;
    return this;
  }
  private String fstrSoftwareProvider;
  public String get_fstrSoftwareProvider() {
    return fstrSoftwareProvider;
  }
  public void set_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
  }
  public tblnz_rtnsoa with_fstrSoftwareProvider(String fstrSoftwareProvider) {
    this.fstrSoftwareProvider = fstrSoftwareProvider;
    return this;
  }
  private String fstrSoftwarePlatform;
  public String get_fstrSoftwarePlatform() {
    return fstrSoftwarePlatform;
  }
  public void set_fstrSoftwarePlatform(String fstrSoftwarePlatform) {
    this.fstrSoftwarePlatform = fstrSoftwarePlatform;
  }
  public tblnz_rtnsoa with_fstrSoftwarePlatform(String fstrSoftwarePlatform) {
    this.fstrSoftwarePlatform = fstrSoftwarePlatform;
    return this;
  }
  private String fstrSoftwareRelease;
  public String get_fstrSoftwareRelease() {
    return fstrSoftwareRelease;
  }
  public void set_fstrSoftwareRelease(String fstrSoftwareRelease) {
    this.fstrSoftwareRelease = fstrSoftwareRelease;
  }
  public tblnz_rtnsoa with_fstrSoftwareRelease(String fstrSoftwareRelease) {
    this.fstrSoftwareRelease = fstrSoftwareRelease;
    return this;
  }
  private String fstrIPAddress;
  public String get_fstrIPAddress() {
    return fstrIPAddress;
  }
  public void set_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
  }
  public tblnz_rtnsoa with_fstrIPAddress(String fstrIPAddress) {
    this.fstrIPAddress = fstrIPAddress;
    return this;
  }
  private String fstrWebLogonId;
  public String get_fstrWebLogonId() {
    return fstrWebLogonId;
  }
  public void set_fstrWebLogonId(String fstrWebLogonId) {
    this.fstrWebLogonId = fstrWebLogonId;
  }
  public tblnz_rtnsoa with_fstrWebLogonId(String fstrWebLogonId) {
    this.fstrWebLogonId = fstrWebLogonId;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnsoa with_fstrWho(String fstrWho) {
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
  public tblnz_rtnsoa with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnsoa)) {
      return false;
    }
    tblnz_rtnsoa that = (tblnz_rtnsoa) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fblnMidYearEntry == null ? that.fblnMidYearEntry == null : this.fblnMidYearEntry.equals(that.fblnMidYearEntry));
    equal = equal && (this.fblnOver5M == null ? that.fblnOver5M == null : this.fblnOver5M.equals(that.fblnOver5M));
    equal = equal && (this.fdtmAIM == null ? that.fdtmAIM == null : this.fdtmAIM.equals(that.fdtmAIM));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fblnHasMultipleActivities == null ? that.fblnHasMultipleActivities == null : this.fblnHasMultipleActivities.equals(that.fblnHasMultipleActivities));
    equal = equal && (this.fcurSalesServices == null ? that.fcurSalesServices == null : this.fcurSalesServices.equals(that.fcurSalesServices));
    equal = equal && (this.fcurOpeningStock == null ? that.fcurOpeningStock == null : this.fcurOpeningStock.equals(that.fcurOpeningStock));
    equal = equal && (this.fcurPurchases == null ? that.fcurPurchases == null : this.fcurPurchases.equals(that.fcurPurchases));
    equal = equal && (this.fcurClosingStock == null ? that.fcurClosingStock == null : this.fcurClosingStock.equals(that.fcurClosingStock));
    equal = equal && (this.fcurClosingStockSAV == null ? that.fcurClosingStockSAV == null : this.fcurClosingStockSAV.equals(that.fcurClosingStockSAV));
    equal = equal && (this.fcurClosingStockUAV == null ? that.fcurClosingStockUAV == null : this.fcurClosingStockUAV.equals(that.fcurClosingStockUAV));
    equal = equal && (this.fcurGrossProfit == null ? that.fcurGrossProfit == null : this.fcurGrossProfit.equals(that.fcurGrossProfit));
    equal = equal && (this.fcurInterestReceived == null ? that.fcurInterestReceived == null : this.fcurInterestReceived.equals(that.fcurInterestReceived));
    equal = equal && (this.fcurDividendsReceived == null ? that.fcurDividendsReceived == null : this.fcurDividendsReceived.equals(that.fcurDividendsReceived));
    equal = equal && (this.fcurRentalIncome == null ? that.fcurRentalIncome == null : this.fcurRentalIncome.equals(that.fcurRentalIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurBadDebts == null ? that.fcurBadDebts == null : this.fcurBadDebts.equals(that.fcurBadDebts));
    equal = equal && (this.fcurAccountingDepreciation == null ? that.fcurAccountingDepreciation == null : this.fcurAccountingDepreciation.equals(that.fcurAccountingDepreciation));
    equal = equal && (this.fcurInsurance == null ? that.fcurInsurance == null : this.fcurInsurance.equals(that.fcurInsurance));
    equal = equal && (this.fcurInterestExpense == null ? that.fcurInterestExpense == null : this.fcurInterestExpense.equals(that.fcurInterestExpense));
    equal = equal && (this.fcurProfessionalFees == null ? that.fcurProfessionalFees == null : this.fcurProfessionalFees.equals(that.fcurProfessionalFees));
    equal = equal && (this.fcurRates == null ? that.fcurRates == null : this.fcurRates.equals(that.fcurRates));
    equal = equal && (this.fcurRentalPayments == null ? that.fcurRentalPayments == null : this.fcurRentalPayments.equals(that.fcurRentalPayments));
    equal = equal && (this.fcurRepairs == null ? that.fcurRepairs == null : this.fcurRepairs.equals(that.fcurRepairs));
    equal = equal && (this.fcurResearchAndDevelopment == null ? that.fcurResearchAndDevelopment == null : this.fcurResearchAndDevelopment.equals(that.fcurResearchAndDevelopment));
    equal = equal && (this.fcurAssociatedPersonsRenum == null ? that.fcurAssociatedPersonsRenum == null : this.fcurAssociatedPersonsRenum.equals(that.fcurAssociatedPersonsRenum));
    equal = equal && (this.fcurPaidToEmployees == null ? that.fcurPaidToEmployees == null : this.fcurPaidToEmployees.equals(that.fcurPaidToEmployees));
    equal = equal && (this.fcurContractorPayments == null ? that.fcurContractorPayments == null : this.fcurContractorPayments.equals(that.fcurContractorPayments));
    equal = equal && (this.fcurOtherExpenses == null ? that.fcurOtherExpenses == null : this.fcurOtherExpenses.equals(that.fcurOtherExpenses));
    equal = equal && (this.fcurExceptionalItems == null ? that.fcurExceptionalItems == null : this.fcurExceptionalItems.equals(that.fcurExceptionalItems));
    equal = equal && (this.fcurNetProfitLoss == null ? that.fcurNetProfitLoss == null : this.fcurNetProfitLoss.equals(that.fcurNetProfitLoss));
    equal = equal && (this.fcurTaxAdjustments == null ? that.fcurTaxAdjustments == null : this.fcurTaxAdjustments.equals(that.fcurTaxAdjustments));
    equal = equal && (this.fcurCurrentYearTaxablePL == null ? that.fcurCurrentYearTaxablePL == null : this.fcurCurrentYearTaxablePL.equals(that.fcurCurrentYearTaxablePL));
    equal = equal && (this.fcurAccountsReceivable == null ? that.fcurAccountsReceivable == null : this.fcurAccountsReceivable.equals(that.fcurAccountsReceivable));
    equal = equal && (this.fcurAccountsReceivableSAV == null ? that.fcurAccountsReceivableSAV == null : this.fcurAccountsReceivableSAV.equals(that.fcurAccountsReceivableSAV));
    equal = equal && (this.fcurDepreciationRecovered == null ? that.fcurDepreciationRecovered == null : this.fcurDepreciationRecovered.equals(that.fcurDepreciationRecovered));
    equal = equal && (this.fcurDepreciationRecoveredSAV == null ? that.fcurDepreciationRecoveredSAV == null : this.fcurDepreciationRecoveredSAV.equals(that.fcurDepreciationRecoveredSAV));
    equal = equal && (this.fcurDepreciationRecoveredUAV == null ? that.fcurDepreciationRecoveredUAV == null : this.fcurDepreciationRecoveredUAV.equals(that.fcurDepreciationRecoveredUAV));
    equal = equal && (this.fcurCashDeposits == null ? that.fcurCashDeposits == null : this.fcurCashDeposits.equals(that.fcurCashDeposits));
    equal = equal && (this.fcurOtherCurrentAssets == null ? that.fcurOtherCurrentAssets == null : this.fcurOtherCurrentAssets.equals(that.fcurOtherCurrentAssets));
    equal = equal && (this.fcurVehicles == null ? that.fcurVehicles == null : this.fcurVehicles.equals(that.fcurVehicles));
    equal = equal && (this.fcurPlantAndMachinery == null ? that.fcurPlantAndMachinery == null : this.fcurPlantAndMachinery.equals(that.fcurPlantAndMachinery));
    equal = equal && (this.fcurFurnitureAndFittings == null ? that.fcurFurnitureAndFittings == null : this.fcurFurnitureAndFittings.equals(that.fcurFurnitureAndFittings));
    equal = equal && (this.fcurLand == null ? that.fcurLand == null : this.fcurLand.equals(that.fcurLand));
    equal = equal && (this.fcurBuildings == null ? that.fcurBuildings == null : this.fcurBuildings.equals(that.fcurBuildings));
    equal = equal && (this.fcurOtherFixedAssets == null ? that.fcurOtherFixedAssets == null : this.fcurOtherFixedAssets.equals(that.fcurOtherFixedAssets));
    equal = equal && (this.fcurIntangibles == null ? that.fcurIntangibles == null : this.fcurIntangibles.equals(that.fcurIntangibles));
    equal = equal && (this.fcurSharesOwnershipInterests == null ? that.fcurSharesOwnershipInterests == null : this.fcurSharesOwnershipInterests.equals(that.fcurSharesOwnershipInterests));
    equal = equal && (this.fcurTermDeposits == null ? that.fcurTermDeposits == null : this.fcurTermDeposits.equals(that.fcurTermDeposits));
    equal = equal && (this.fcurOtherNonCurrentAssets == null ? that.fcurOtherNonCurrentAssets == null : this.fcurOtherNonCurrentAssets.equals(that.fcurOtherNonCurrentAssets));
    equal = equal && (this.fcurProvisions == null ? that.fcurProvisions == null : this.fcurProvisions.equals(that.fcurProvisions));
    equal = equal && (this.fcurAccountsPayable == null ? that.fcurAccountsPayable == null : this.fcurAccountsPayable.equals(that.fcurAccountsPayable));
    equal = equal && (this.fcurAccountsPayableSAV == null ? that.fcurAccountsPayableSAV == null : this.fcurAccountsPayableSAV.equals(that.fcurAccountsPayableSAV));
    equal = equal && (this.fcurAccountsPayableUAV == null ? that.fcurAccountsPayableUAV == null : this.fcurAccountsPayableUAV.equals(that.fcurAccountsPayableUAV));
    equal = equal && (this.fcurCurrentLoans == null ? that.fcurCurrentLoans == null : this.fcurCurrentLoans.equals(that.fcurCurrentLoans));
    equal = equal && (this.fcurOtherCurrentLiabilities == null ? that.fcurOtherCurrentLiabilities == null : this.fcurOtherCurrentLiabilities.equals(that.fcurOtherCurrentLiabilities));
    equal = equal && (this.fcurNonCurrentLiabilities == null ? that.fcurNonCurrentLiabilities == null : this.fcurNonCurrentLiabilities.equals(that.fcurNonCurrentLiabilities));
    equal = equal && (this.fcurOwnersEquity == null ? that.fcurOwnersEquity == null : this.fcurOwnersEquity.equals(that.fcurOwnersEquity));
    equal = equal && (this.fcurTaxDepreciation == null ? that.fcurTaxDepreciation == null : this.fcurTaxDepreciation.equals(that.fcurTaxDepreciation));
    equal = equal && (this.fcurTaxDepreciationSAV == null ? that.fcurTaxDepreciationSAV == null : this.fcurTaxDepreciationSAV.equals(that.fcurTaxDepreciationSAV));
    equal = equal && (this.fcurTaxDepreciationUAV == null ? that.fcurTaxDepreciationUAV == null : this.fcurTaxDepreciationUAV.equals(that.fcurTaxDepreciationUAV));
    equal = equal && (this.fcurUntaxedRealisedGains == null ? that.fcurUntaxedRealisedGains == null : this.fcurUntaxedRealisedGains.equals(that.fcurUntaxedRealisedGains));
    equal = equal && (this.fcurAdditionsToFixedAssets == null ? that.fcurAdditionsToFixedAssets == null : this.fcurAdditionsToFixedAssets.equals(that.fcurAdditionsToFixedAssets));
    equal = equal && (this.fcurDisposalsForFixedAssets == null ? that.fcurDisposalsForFixedAssets == null : this.fcurDisposalsForFixedAssets.equals(that.fcurDisposalsForFixedAssets));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDrawings == null ? that.fcurDrawings == null : this.fcurDrawings.equals(that.fcurDrawings));
    equal = equal && (this.fcurCurrentAccountYearEndBal == null ? that.fcurCurrentAccountYearEndBal == null : this.fcurCurrentAccountYearEndBal.equals(that.fcurCurrentAccountYearEndBal));
    equal = equal && (this.fcurTaxDeductibleLoss == null ? that.fcurTaxDeductibleLoss == null : this.fcurTaxDeductibleLoss.equals(that.fcurTaxDeductibleLoss));
    equal = equal && (this.fcurShareholderProvTax == null ? that.fcurShareholderProvTax == null : this.fcurShareholderProvTax.equals(that.fcurShareholderProvTax));
    equal = equal && (this.fcurProvisionsShareholders == null ? that.fcurProvisionsShareholders == null : this.fcurProvisionsShareholders.equals(that.fcurProvisionsShareholders));
    equal = equal && (this.fcurProvisionsShareholdersSAV == null ? that.fcurProvisionsShareholdersSAV == null : this.fcurProvisionsShareholdersSAV.equals(that.fcurProvisionsShareholdersSAV));
    equal = equal && (this.fcurProvisionsShareholdersUAV == null ? that.fcurProvisionsShareholdersUAV == null : this.fcurProvisionsShareholdersUAV.equals(that.fcurProvisionsShareholdersUAV));
    equal = equal && (this.fcurAccountsReceivableUAV == null ? that.fcurAccountsReceivableUAV == null : this.fcurAccountsReceivableUAV.equals(that.fcurAccountsReceivableUAV));
    equal = equal && (this.fcurPrivateUse == null ? that.fcurPrivateUse == null : this.fcurPrivateUse.equals(that.fcurPrivateUse));
    equal = equal && (this.fcurLosses == null ? that.fcurLosses == null : this.fcurLosses.equals(that.fcurLosses));
    equal = equal && (this.fcurPrivateUseSAV == null ? that.fcurPrivateUseSAV == null : this.fcurPrivateUseSAV.equals(that.fcurPrivateUseSAV));
    equal = equal && (this.fcurPrivateUseUAV == null ? that.fcurPrivateUseUAV == null : this.fcurPrivateUseUAV.equals(that.fcurPrivateUseUAV));
    equal = equal && (this.fcurProvisionsSAV == null ? that.fcurProvisionsSAV == null : this.fcurProvisionsSAV.equals(that.fcurProvisionsSAV));
    equal = equal && (this.fcurProvisionsUAV == null ? that.fcurProvisionsUAV == null : this.fcurProvisionsUAV.equals(that.fcurProvisionsUAV));
    equal = equal && (this.fcurYearToDate == null ? that.fcurYearToDate == null : this.fcurYearToDate.equals(that.fcurYearToDate));
    equal = equal && (this.fcurThisInstalment == null ? that.fcurThisInstalment == null : this.fcurThisInstalment.equals(that.fcurThisInstalment));
    equal = equal && (this.fcurRefundAmount == null ? that.fcurRefundAmount == null : this.fcurRefundAmount.equals(that.fcurRefundAmount));
    equal = equal && (this.fblnRefundIndicator == null ? that.fblnRefundIndicator == null : this.fblnRefundIndicator.equals(that.fblnRefundIndicator));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrSoftwarePlatform == null ? that.fstrSoftwarePlatform == null : this.fstrSoftwarePlatform.equals(that.fstrSoftwarePlatform));
    equal = equal && (this.fstrSoftwareRelease == null ? that.fstrSoftwareRelease == null : this.fstrSoftwareRelease.equals(that.fstrSoftwareRelease));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrWebLogonId == null ? that.fstrWebLogonId == null : this.fstrWebLogonId.equals(that.fstrWebLogonId));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnsoa)) {
      return false;
    }
    tblnz_rtnsoa that = (tblnz_rtnsoa) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fblnMidYearEntry == null ? that.fblnMidYearEntry == null : this.fblnMidYearEntry.equals(that.fblnMidYearEntry));
    equal = equal && (this.fblnOver5M == null ? that.fblnOver5M == null : this.fblnOver5M.equals(that.fblnOver5M));
    equal = equal && (this.fdtmAIM == null ? that.fdtmAIM == null : this.fdtmAIM.equals(that.fdtmAIM));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fblnHasMultipleActivities == null ? that.fblnHasMultipleActivities == null : this.fblnHasMultipleActivities.equals(that.fblnHasMultipleActivities));
    equal = equal && (this.fcurSalesServices == null ? that.fcurSalesServices == null : this.fcurSalesServices.equals(that.fcurSalesServices));
    equal = equal && (this.fcurOpeningStock == null ? that.fcurOpeningStock == null : this.fcurOpeningStock.equals(that.fcurOpeningStock));
    equal = equal && (this.fcurPurchases == null ? that.fcurPurchases == null : this.fcurPurchases.equals(that.fcurPurchases));
    equal = equal && (this.fcurClosingStock == null ? that.fcurClosingStock == null : this.fcurClosingStock.equals(that.fcurClosingStock));
    equal = equal && (this.fcurClosingStockSAV == null ? that.fcurClosingStockSAV == null : this.fcurClosingStockSAV.equals(that.fcurClosingStockSAV));
    equal = equal && (this.fcurClosingStockUAV == null ? that.fcurClosingStockUAV == null : this.fcurClosingStockUAV.equals(that.fcurClosingStockUAV));
    equal = equal && (this.fcurGrossProfit == null ? that.fcurGrossProfit == null : this.fcurGrossProfit.equals(that.fcurGrossProfit));
    equal = equal && (this.fcurInterestReceived == null ? that.fcurInterestReceived == null : this.fcurInterestReceived.equals(that.fcurInterestReceived));
    equal = equal && (this.fcurDividendsReceived == null ? that.fcurDividendsReceived == null : this.fcurDividendsReceived.equals(that.fcurDividendsReceived));
    equal = equal && (this.fcurRentalIncome == null ? that.fcurRentalIncome == null : this.fcurRentalIncome.equals(that.fcurRentalIncome));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurBadDebts == null ? that.fcurBadDebts == null : this.fcurBadDebts.equals(that.fcurBadDebts));
    equal = equal && (this.fcurAccountingDepreciation == null ? that.fcurAccountingDepreciation == null : this.fcurAccountingDepreciation.equals(that.fcurAccountingDepreciation));
    equal = equal && (this.fcurInsurance == null ? that.fcurInsurance == null : this.fcurInsurance.equals(that.fcurInsurance));
    equal = equal && (this.fcurInterestExpense == null ? that.fcurInterestExpense == null : this.fcurInterestExpense.equals(that.fcurInterestExpense));
    equal = equal && (this.fcurProfessionalFees == null ? that.fcurProfessionalFees == null : this.fcurProfessionalFees.equals(that.fcurProfessionalFees));
    equal = equal && (this.fcurRates == null ? that.fcurRates == null : this.fcurRates.equals(that.fcurRates));
    equal = equal && (this.fcurRentalPayments == null ? that.fcurRentalPayments == null : this.fcurRentalPayments.equals(that.fcurRentalPayments));
    equal = equal && (this.fcurRepairs == null ? that.fcurRepairs == null : this.fcurRepairs.equals(that.fcurRepairs));
    equal = equal && (this.fcurResearchAndDevelopment == null ? that.fcurResearchAndDevelopment == null : this.fcurResearchAndDevelopment.equals(that.fcurResearchAndDevelopment));
    equal = equal && (this.fcurAssociatedPersonsRenum == null ? that.fcurAssociatedPersonsRenum == null : this.fcurAssociatedPersonsRenum.equals(that.fcurAssociatedPersonsRenum));
    equal = equal && (this.fcurPaidToEmployees == null ? that.fcurPaidToEmployees == null : this.fcurPaidToEmployees.equals(that.fcurPaidToEmployees));
    equal = equal && (this.fcurContractorPayments == null ? that.fcurContractorPayments == null : this.fcurContractorPayments.equals(that.fcurContractorPayments));
    equal = equal && (this.fcurOtherExpenses == null ? that.fcurOtherExpenses == null : this.fcurOtherExpenses.equals(that.fcurOtherExpenses));
    equal = equal && (this.fcurExceptionalItems == null ? that.fcurExceptionalItems == null : this.fcurExceptionalItems.equals(that.fcurExceptionalItems));
    equal = equal && (this.fcurNetProfitLoss == null ? that.fcurNetProfitLoss == null : this.fcurNetProfitLoss.equals(that.fcurNetProfitLoss));
    equal = equal && (this.fcurTaxAdjustments == null ? that.fcurTaxAdjustments == null : this.fcurTaxAdjustments.equals(that.fcurTaxAdjustments));
    equal = equal && (this.fcurCurrentYearTaxablePL == null ? that.fcurCurrentYearTaxablePL == null : this.fcurCurrentYearTaxablePL.equals(that.fcurCurrentYearTaxablePL));
    equal = equal && (this.fcurAccountsReceivable == null ? that.fcurAccountsReceivable == null : this.fcurAccountsReceivable.equals(that.fcurAccountsReceivable));
    equal = equal && (this.fcurAccountsReceivableSAV == null ? that.fcurAccountsReceivableSAV == null : this.fcurAccountsReceivableSAV.equals(that.fcurAccountsReceivableSAV));
    equal = equal && (this.fcurDepreciationRecovered == null ? that.fcurDepreciationRecovered == null : this.fcurDepreciationRecovered.equals(that.fcurDepreciationRecovered));
    equal = equal && (this.fcurDepreciationRecoveredSAV == null ? that.fcurDepreciationRecoveredSAV == null : this.fcurDepreciationRecoveredSAV.equals(that.fcurDepreciationRecoveredSAV));
    equal = equal && (this.fcurDepreciationRecoveredUAV == null ? that.fcurDepreciationRecoveredUAV == null : this.fcurDepreciationRecoveredUAV.equals(that.fcurDepreciationRecoveredUAV));
    equal = equal && (this.fcurCashDeposits == null ? that.fcurCashDeposits == null : this.fcurCashDeposits.equals(that.fcurCashDeposits));
    equal = equal && (this.fcurOtherCurrentAssets == null ? that.fcurOtherCurrentAssets == null : this.fcurOtherCurrentAssets.equals(that.fcurOtherCurrentAssets));
    equal = equal && (this.fcurVehicles == null ? that.fcurVehicles == null : this.fcurVehicles.equals(that.fcurVehicles));
    equal = equal && (this.fcurPlantAndMachinery == null ? that.fcurPlantAndMachinery == null : this.fcurPlantAndMachinery.equals(that.fcurPlantAndMachinery));
    equal = equal && (this.fcurFurnitureAndFittings == null ? that.fcurFurnitureAndFittings == null : this.fcurFurnitureAndFittings.equals(that.fcurFurnitureAndFittings));
    equal = equal && (this.fcurLand == null ? that.fcurLand == null : this.fcurLand.equals(that.fcurLand));
    equal = equal && (this.fcurBuildings == null ? that.fcurBuildings == null : this.fcurBuildings.equals(that.fcurBuildings));
    equal = equal && (this.fcurOtherFixedAssets == null ? that.fcurOtherFixedAssets == null : this.fcurOtherFixedAssets.equals(that.fcurOtherFixedAssets));
    equal = equal && (this.fcurIntangibles == null ? that.fcurIntangibles == null : this.fcurIntangibles.equals(that.fcurIntangibles));
    equal = equal && (this.fcurSharesOwnershipInterests == null ? that.fcurSharesOwnershipInterests == null : this.fcurSharesOwnershipInterests.equals(that.fcurSharesOwnershipInterests));
    equal = equal && (this.fcurTermDeposits == null ? that.fcurTermDeposits == null : this.fcurTermDeposits.equals(that.fcurTermDeposits));
    equal = equal && (this.fcurOtherNonCurrentAssets == null ? that.fcurOtherNonCurrentAssets == null : this.fcurOtherNonCurrentAssets.equals(that.fcurOtherNonCurrentAssets));
    equal = equal && (this.fcurProvisions == null ? that.fcurProvisions == null : this.fcurProvisions.equals(that.fcurProvisions));
    equal = equal && (this.fcurAccountsPayable == null ? that.fcurAccountsPayable == null : this.fcurAccountsPayable.equals(that.fcurAccountsPayable));
    equal = equal && (this.fcurAccountsPayableSAV == null ? that.fcurAccountsPayableSAV == null : this.fcurAccountsPayableSAV.equals(that.fcurAccountsPayableSAV));
    equal = equal && (this.fcurAccountsPayableUAV == null ? that.fcurAccountsPayableUAV == null : this.fcurAccountsPayableUAV.equals(that.fcurAccountsPayableUAV));
    equal = equal && (this.fcurCurrentLoans == null ? that.fcurCurrentLoans == null : this.fcurCurrentLoans.equals(that.fcurCurrentLoans));
    equal = equal && (this.fcurOtherCurrentLiabilities == null ? that.fcurOtherCurrentLiabilities == null : this.fcurOtherCurrentLiabilities.equals(that.fcurOtherCurrentLiabilities));
    equal = equal && (this.fcurNonCurrentLiabilities == null ? that.fcurNonCurrentLiabilities == null : this.fcurNonCurrentLiabilities.equals(that.fcurNonCurrentLiabilities));
    equal = equal && (this.fcurOwnersEquity == null ? that.fcurOwnersEquity == null : this.fcurOwnersEquity.equals(that.fcurOwnersEquity));
    equal = equal && (this.fcurTaxDepreciation == null ? that.fcurTaxDepreciation == null : this.fcurTaxDepreciation.equals(that.fcurTaxDepreciation));
    equal = equal && (this.fcurTaxDepreciationSAV == null ? that.fcurTaxDepreciationSAV == null : this.fcurTaxDepreciationSAV.equals(that.fcurTaxDepreciationSAV));
    equal = equal && (this.fcurTaxDepreciationUAV == null ? that.fcurTaxDepreciationUAV == null : this.fcurTaxDepreciationUAV.equals(that.fcurTaxDepreciationUAV));
    equal = equal && (this.fcurUntaxedRealisedGains == null ? that.fcurUntaxedRealisedGains == null : this.fcurUntaxedRealisedGains.equals(that.fcurUntaxedRealisedGains));
    equal = equal && (this.fcurAdditionsToFixedAssets == null ? that.fcurAdditionsToFixedAssets == null : this.fcurAdditionsToFixedAssets.equals(that.fcurAdditionsToFixedAssets));
    equal = equal && (this.fcurDisposalsForFixedAssets == null ? that.fcurDisposalsForFixedAssets == null : this.fcurDisposalsForFixedAssets.equals(that.fcurDisposalsForFixedAssets));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDrawings == null ? that.fcurDrawings == null : this.fcurDrawings.equals(that.fcurDrawings));
    equal = equal && (this.fcurCurrentAccountYearEndBal == null ? that.fcurCurrentAccountYearEndBal == null : this.fcurCurrentAccountYearEndBal.equals(that.fcurCurrentAccountYearEndBal));
    equal = equal && (this.fcurTaxDeductibleLoss == null ? that.fcurTaxDeductibleLoss == null : this.fcurTaxDeductibleLoss.equals(that.fcurTaxDeductibleLoss));
    equal = equal && (this.fcurShareholderProvTax == null ? that.fcurShareholderProvTax == null : this.fcurShareholderProvTax.equals(that.fcurShareholderProvTax));
    equal = equal && (this.fcurProvisionsShareholders == null ? that.fcurProvisionsShareholders == null : this.fcurProvisionsShareholders.equals(that.fcurProvisionsShareholders));
    equal = equal && (this.fcurProvisionsShareholdersSAV == null ? that.fcurProvisionsShareholdersSAV == null : this.fcurProvisionsShareholdersSAV.equals(that.fcurProvisionsShareholdersSAV));
    equal = equal && (this.fcurProvisionsShareholdersUAV == null ? that.fcurProvisionsShareholdersUAV == null : this.fcurProvisionsShareholdersUAV.equals(that.fcurProvisionsShareholdersUAV));
    equal = equal && (this.fcurAccountsReceivableUAV == null ? that.fcurAccountsReceivableUAV == null : this.fcurAccountsReceivableUAV.equals(that.fcurAccountsReceivableUAV));
    equal = equal && (this.fcurPrivateUse == null ? that.fcurPrivateUse == null : this.fcurPrivateUse.equals(that.fcurPrivateUse));
    equal = equal && (this.fcurLosses == null ? that.fcurLosses == null : this.fcurLosses.equals(that.fcurLosses));
    equal = equal && (this.fcurPrivateUseSAV == null ? that.fcurPrivateUseSAV == null : this.fcurPrivateUseSAV.equals(that.fcurPrivateUseSAV));
    equal = equal && (this.fcurPrivateUseUAV == null ? that.fcurPrivateUseUAV == null : this.fcurPrivateUseUAV.equals(that.fcurPrivateUseUAV));
    equal = equal && (this.fcurProvisionsSAV == null ? that.fcurProvisionsSAV == null : this.fcurProvisionsSAV.equals(that.fcurProvisionsSAV));
    equal = equal && (this.fcurProvisionsUAV == null ? that.fcurProvisionsUAV == null : this.fcurProvisionsUAV.equals(that.fcurProvisionsUAV));
    equal = equal && (this.fcurYearToDate == null ? that.fcurYearToDate == null : this.fcurYearToDate.equals(that.fcurYearToDate));
    equal = equal && (this.fcurThisInstalment == null ? that.fcurThisInstalment == null : this.fcurThisInstalment.equals(that.fcurThisInstalment));
    equal = equal && (this.fcurRefundAmount == null ? that.fcurRefundAmount == null : this.fcurRefundAmount.equals(that.fcurRefundAmount));
    equal = equal && (this.fblnRefundIndicator == null ? that.fblnRefundIndicator == null : this.fblnRefundIndicator.equals(that.fblnRefundIndicator));
    equal = equal && (this.fstrSoftwareProvider == null ? that.fstrSoftwareProvider == null : this.fstrSoftwareProvider.equals(that.fstrSoftwareProvider));
    equal = equal && (this.fstrSoftwarePlatform == null ? that.fstrSoftwarePlatform == null : this.fstrSoftwarePlatform.equals(that.fstrSoftwarePlatform));
    equal = equal && (this.fstrSoftwareRelease == null ? that.fstrSoftwareRelease == null : this.fstrSoftwareRelease.equals(that.fstrSoftwareRelease));
    equal = equal && (this.fstrIPAddress == null ? that.fstrIPAddress == null : this.fstrIPAddress.equals(that.fstrIPAddress));
    equal = equal && (this.fstrWebLogonId == null ? that.fstrWebLogonId == null : this.fstrWebLogonId.equals(that.fstrWebLogonId));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fblnMidYearEntry = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnOver5M = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmAIM = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnHasMultipleActivities = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurSalesServices = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOpeningStock = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPurchases = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurClosingStock = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurClosingStockSAV = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurClosingStockUAV = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurGrossProfit = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestReceived = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurDividendsReceived = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurRentalIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurBadDebts = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurAccountingDepreciation = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurInsurance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurInterestExpense = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurProfessionalFees = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurRates = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurRentalPayments = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurRepairs = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurResearchAndDevelopment = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurAssociatedPersonsRenum = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurPaidToEmployees = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurContractorPayments = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurOtherExpenses = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurExceptionalItems = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurNetProfitLoss = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTaxAdjustments = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurCurrentYearTaxablePL = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurAccountsReceivable = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurAccountsReceivableSAV = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurDepreciationRecovered = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurDepreciationRecoveredSAV = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurDepreciationRecoveredUAV = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurCashDeposits = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurOtherCurrentAssets = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurVehicles = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurPlantAndMachinery = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurFurnitureAndFittings = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurLand = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurBuildings = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurOtherFixedAssets = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurIntangibles = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurSharesOwnershipInterests = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurTermDeposits = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurOtherNonCurrentAssets = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurProvisions = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurAccountsPayable = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurAccountsPayableSAV = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurAccountsPayableUAV = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurCurrentLoans = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurOtherCurrentLiabilities = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurNonCurrentLiabilities = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurOwnersEquity = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTaxDepreciation = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurTaxDepreciationSAV = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurTaxDepreciationUAV = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurUntaxedRealisedGains = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurAdditionsToFixedAssets = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurDisposalsForFixedAssets = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurDrawings = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurCurrentAccountYearEndBal = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurTaxDeductibleLoss = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurShareholderProvTax = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurProvisionsShareholders = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurProvisionsShareholdersSAV = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fcurProvisionsShareholdersUAV = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.fcurAccountsReceivableUAV = JdbcWritableBridge.readBigDecimal(75, __dbResults);
    this.fcurPrivateUse = JdbcWritableBridge.readBigDecimal(76, __dbResults);
    this.fcurLosses = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.fcurPrivateUseSAV = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.fcurPrivateUseUAV = JdbcWritableBridge.readBigDecimal(79, __dbResults);
    this.fcurProvisionsSAV = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.fcurProvisionsUAV = JdbcWritableBridge.readBigDecimal(81, __dbResults);
    this.fcurYearToDate = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.fcurThisInstalment = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.fcurRefundAmount = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.fblnRefundIndicator = JdbcWritableBridge.readInteger(85, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(86, __dbResults);
    this.fstrSoftwarePlatform = JdbcWritableBridge.readString(87, __dbResults);
    this.fstrSoftwareRelease = JdbcWritableBridge.readString(88, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(89, __dbResults);
    this.fstrWebLogonId = JdbcWritableBridge.readString(90, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(91, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(92, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fblnMidYearEntry = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnOver5M = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmAIM = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnHasMultipleActivities = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurSalesServices = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOpeningStock = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPurchases = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurClosingStock = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurClosingStockSAV = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurClosingStockUAV = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurGrossProfit = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestReceived = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurDividendsReceived = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurRentalIncome = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurBadDebts = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurAccountingDepreciation = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurInsurance = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurInterestExpense = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurProfessionalFees = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurRates = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurRentalPayments = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurRepairs = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurResearchAndDevelopment = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurAssociatedPersonsRenum = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurPaidToEmployees = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurContractorPayments = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurOtherExpenses = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurExceptionalItems = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurNetProfitLoss = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurTaxAdjustments = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurCurrentYearTaxablePL = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurAccountsReceivable = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurAccountsReceivableSAV = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurDepreciationRecovered = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurDepreciationRecoveredSAV = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurDepreciationRecoveredUAV = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurCashDeposits = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurOtherCurrentAssets = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurVehicles = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurPlantAndMachinery = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurFurnitureAndFittings = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurLand = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurBuildings = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurOtherFixedAssets = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurIntangibles = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurSharesOwnershipInterests = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurTermDeposits = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurOtherNonCurrentAssets = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurProvisions = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurAccountsPayable = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurAccountsPayableSAV = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurAccountsPayableUAV = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurCurrentLoans = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurOtherCurrentLiabilities = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurNonCurrentLiabilities = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurOwnersEquity = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fcurTaxDepreciation = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.fcurTaxDepreciationSAV = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.fcurTaxDepreciationUAV = JdbcWritableBridge.readBigDecimal(63, __dbResults);
    this.fcurUntaxedRealisedGains = JdbcWritableBridge.readBigDecimal(64, __dbResults);
    this.fcurAdditionsToFixedAssets = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.fcurDisposalsForFixedAssets = JdbcWritableBridge.readBigDecimal(66, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(67, __dbResults);
    this.fcurDrawings = JdbcWritableBridge.readBigDecimal(68, __dbResults);
    this.fcurCurrentAccountYearEndBal = JdbcWritableBridge.readBigDecimal(69, __dbResults);
    this.fcurTaxDeductibleLoss = JdbcWritableBridge.readBigDecimal(70, __dbResults);
    this.fcurShareholderProvTax = JdbcWritableBridge.readBigDecimal(71, __dbResults);
    this.fcurProvisionsShareholders = JdbcWritableBridge.readBigDecimal(72, __dbResults);
    this.fcurProvisionsShareholdersSAV = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.fcurProvisionsShareholdersUAV = JdbcWritableBridge.readBigDecimal(74, __dbResults);
    this.fcurAccountsReceivableUAV = JdbcWritableBridge.readBigDecimal(75, __dbResults);
    this.fcurPrivateUse = JdbcWritableBridge.readBigDecimal(76, __dbResults);
    this.fcurLosses = JdbcWritableBridge.readBigDecimal(77, __dbResults);
    this.fcurPrivateUseSAV = JdbcWritableBridge.readBigDecimal(78, __dbResults);
    this.fcurPrivateUseUAV = JdbcWritableBridge.readBigDecimal(79, __dbResults);
    this.fcurProvisionsSAV = JdbcWritableBridge.readBigDecimal(80, __dbResults);
    this.fcurProvisionsUAV = JdbcWritableBridge.readBigDecimal(81, __dbResults);
    this.fcurYearToDate = JdbcWritableBridge.readBigDecimal(82, __dbResults);
    this.fcurThisInstalment = JdbcWritableBridge.readBigDecimal(83, __dbResults);
    this.fcurRefundAmount = JdbcWritableBridge.readBigDecimal(84, __dbResults);
    this.fblnRefundIndicator = JdbcWritableBridge.readInteger(85, __dbResults);
    this.fstrSoftwareProvider = JdbcWritableBridge.readString(86, __dbResults);
    this.fstrSoftwarePlatform = JdbcWritableBridge.readString(87, __dbResults);
    this.fstrSoftwareRelease = JdbcWritableBridge.readString(88, __dbResults);
    this.fstrIPAddress = JdbcWritableBridge.readString(89, __dbResults);
    this.fstrWebLogonId = JdbcWritableBridge.readString(90, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(91, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(92, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMidYearEntry, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOver5M, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAIM, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasMultipleActivities, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalesServices, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOpeningStock, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPurchases, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStock, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStockSAV, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStockUAV, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossProfit, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestReceived, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsReceived, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBadDebts, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountingDepreciation, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInsurance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestExpense, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProfessionalFees, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRates, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalPayments, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRepairs, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResearchAndDevelopment, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAssociatedPersonsRenum, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaidToEmployees, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContractorPayments, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherExpenses, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExceptionalItems, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitLoss, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAdjustments, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentYearTaxablePL, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivable, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivableSAV, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecovered, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecoveredSAV, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecoveredUAV, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCashDeposits, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentAssets, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVehicles, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlantAndMachinery, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurnitureAndFittings, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLand, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildings, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherFixedAssets, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntangibles, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesOwnershipInterests, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTermDeposits, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherNonCurrentAssets, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisions, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayable, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayableSAV, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayableUAV, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentLoans, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentLiabilities, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentLiabilities, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnersEquity, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciation, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciationSAV, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciationUAV, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUntaxedRealisedGains, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdditionsToFixedAssets, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposalsForFixedAssets, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDrawings, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentAccountYearEndBal, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeductibleLoss, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderProvTax, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholders, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholdersSAV, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholdersUAV, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivableUAV, 75 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUse, 76 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLosses, 77 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUseSAV, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUseUAV, 79 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsSAV, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsUAV, 81 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurYearToDate, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurThisInstalment, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAmount, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRefundIndicator, 85 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 86 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwarePlatform, 87 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareRelease, 88 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 89 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonId, 90 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 91 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 92 + __off, 93, __dbStmt);
    return 92;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMidYearEntry, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOver5M, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAIM, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasMultipleActivities, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalesServices, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOpeningStock, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPurchases, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStock, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStockSAV, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClosingStockUAV, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossProfit, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestReceived, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsReceived, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalIncome, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBadDebts, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountingDepreciation, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInsurance, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestExpense, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProfessionalFees, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRates, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalPayments, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRepairs, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResearchAndDevelopment, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAssociatedPersonsRenum, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPaidToEmployees, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContractorPayments, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherExpenses, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExceptionalItems, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitLoss, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAdjustments, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentYearTaxablePL, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivable, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivableSAV, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecovered, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecoveredSAV, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepreciationRecoveredUAV, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCashDeposits, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentAssets, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVehicles, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlantAndMachinery, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurnitureAndFittings, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLand, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildings, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherFixedAssets, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntangibles, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesOwnershipInterests, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTermDeposits, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherNonCurrentAssets, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisions, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayable, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayableSAV, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayableUAV, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentLoans, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentLiabilities, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentLiabilities, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnersEquity, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciation, 61 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciationSAV, 62 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciationUAV, 63 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUntaxedRealisedGains, 64 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdditionsToFixedAssets, 65 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposalsForFixedAssets, 66 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 67 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDrawings, 68 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentAccountYearEndBal, 69 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeductibleLoss, 70 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderProvTax, 71 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholders, 72 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholdersSAV, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsShareholdersUAV, 74 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivableUAV, 75 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUse, 76 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLosses, 77 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUseSAV, 78 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPrivateUseUAV, 79 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsSAV, 80 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisionsUAV, 81 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurYearToDate, 82 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurThisInstalment, 83 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundAmount, 84 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRefundIndicator, 85 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareProvider, 86 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwarePlatform, 87 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSoftwareRelease, 88 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIPAddress, 89 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebLogonId, 90 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 91 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 92 + __off, 93, __dbStmt);
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
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMidYearEntry = null;
    } else {
    this.fblnMidYearEntry = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOver5M = null;
    } else {
    this.fblnOver5M = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAIM = null;
    } else {
    this.fdtmAIM = new Timestamp(__dataIn.readLong());
    this.fdtmAIM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFrequency = null;
    } else {
    this.fstrFilingFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHasMultipleActivities = null;
    } else {
    this.fblnHasMultipleActivities = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSalesServices = null;
    } else {
    this.fcurSalesServices = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOpeningStock = null;
    } else {
    this.fcurOpeningStock = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPurchases = null;
    } else {
    this.fcurPurchases = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurClosingStock = null;
    } else {
    this.fcurClosingStock = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurClosingStockSAV = null;
    } else {
    this.fcurClosingStockSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurClosingStockUAV = null;
    } else {
    this.fcurClosingStockUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossProfit = null;
    } else {
    this.fcurGrossProfit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestReceived = null;
    } else {
    this.fcurInterestReceived = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendsReceived = null;
    } else {
    this.fcurDividendsReceived = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRentalIncome = null;
    } else {
    this.fcurRentalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBadDebts = null;
    } else {
    this.fcurBadDebts = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountingDepreciation = null;
    } else {
    this.fcurAccountingDepreciation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInsurance = null;
    } else {
    this.fcurInsurance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestExpense = null;
    } else {
    this.fcurInterestExpense = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProfessionalFees = null;
    } else {
    this.fcurProfessionalFees = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRates = null;
    } else {
    this.fcurRates = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRentalPayments = null;
    } else {
    this.fcurRentalPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRepairs = null;
    } else {
    this.fcurRepairs = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResearchAndDevelopment = null;
    } else {
    this.fcurResearchAndDevelopment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAssociatedPersonsRenum = null;
    } else {
    this.fcurAssociatedPersonsRenum = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPaidToEmployees = null;
    } else {
    this.fcurPaidToEmployees = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurContractorPayments = null;
    } else {
    this.fcurContractorPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherExpenses = null;
    } else {
    this.fcurOtherExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExceptionalItems = null;
    } else {
    this.fcurExceptionalItems = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetProfitLoss = null;
    } else {
    this.fcurNetProfitLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAdjustments = null;
    } else {
    this.fcurTaxAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCurrentYearTaxablePL = null;
    } else {
    this.fcurCurrentYearTaxablePL = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsReceivable = null;
    } else {
    this.fcurAccountsReceivable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsReceivableSAV = null;
    } else {
    this.fcurAccountsReceivableSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDepreciationRecovered = null;
    } else {
    this.fcurDepreciationRecovered = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDepreciationRecoveredSAV = null;
    } else {
    this.fcurDepreciationRecoveredSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDepreciationRecoveredUAV = null;
    } else {
    this.fcurDepreciationRecoveredUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCashDeposits = null;
    } else {
    this.fcurCashDeposits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherCurrentAssets = null;
    } else {
    this.fcurOtherCurrentAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurVehicles = null;
    } else {
    this.fcurVehicles = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPlantAndMachinery = null;
    } else {
    this.fcurPlantAndMachinery = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFurnitureAndFittings = null;
    } else {
    this.fcurFurnitureAndFittings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLand = null;
    } else {
    this.fcurLand = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBuildings = null;
    } else {
    this.fcurBuildings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherFixedAssets = null;
    } else {
    this.fcurOtherFixedAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIntangibles = null;
    } else {
    this.fcurIntangibles = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSharesOwnershipInterests = null;
    } else {
    this.fcurSharesOwnershipInterests = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTermDeposits = null;
    } else {
    this.fcurTermDeposits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherNonCurrentAssets = null;
    } else {
    this.fcurOtherNonCurrentAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisions = null;
    } else {
    this.fcurProvisions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsPayable = null;
    } else {
    this.fcurAccountsPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsPayableSAV = null;
    } else {
    this.fcurAccountsPayableSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsPayableUAV = null;
    } else {
    this.fcurAccountsPayableUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCurrentLoans = null;
    } else {
    this.fcurCurrentLoans = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherCurrentLiabilities = null;
    } else {
    this.fcurOtherCurrentLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonCurrentLiabilities = null;
    } else {
    this.fcurNonCurrentLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnersEquity = null;
    } else {
    this.fcurOwnersEquity = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDepreciation = null;
    } else {
    this.fcurTaxDepreciation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDepreciationSAV = null;
    } else {
    this.fcurTaxDepreciationSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDepreciationUAV = null;
    } else {
    this.fcurTaxDepreciationUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUntaxedRealisedGains = null;
    } else {
    this.fcurUntaxedRealisedGains = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdditionsToFixedAssets = null;
    } else {
    this.fcurAdditionsToFixedAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisposalsForFixedAssets = null;
    } else {
    this.fcurDisposalsForFixedAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendsPaid = null;
    } else {
    this.fcurDividendsPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDrawings = null;
    } else {
    this.fcurDrawings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCurrentAccountYearEndBal = null;
    } else {
    this.fcurCurrentAccountYearEndBal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDeductibleLoss = null;
    } else {
    this.fcurTaxDeductibleLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderProvTax = null;
    } else {
    this.fcurShareholderProvTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionsShareholders = null;
    } else {
    this.fcurProvisionsShareholders = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionsShareholdersSAV = null;
    } else {
    this.fcurProvisionsShareholdersSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionsShareholdersUAV = null;
    } else {
    this.fcurProvisionsShareholdersUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsReceivableUAV = null;
    } else {
    this.fcurAccountsReceivableUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPrivateUse = null;
    } else {
    this.fcurPrivateUse = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLosses = null;
    } else {
    this.fcurLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPrivateUseSAV = null;
    } else {
    this.fcurPrivateUseSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPrivateUseUAV = null;
    } else {
    this.fcurPrivateUseUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionsSAV = null;
    } else {
    this.fcurProvisionsSAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurProvisionsUAV = null;
    } else {
    this.fcurProvisionsUAV = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurYearToDate = null;
    } else {
    this.fcurYearToDate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurThisInstalment = null;
    } else {
    this.fcurThisInstalment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundAmount = null;
    } else {
    this.fcurRefundAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRefundIndicator = null;
    } else {
    this.fblnRefundIndicator = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwareProvider = null;
    } else {
    this.fstrSoftwareProvider = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwarePlatform = null;
    } else {
    this.fstrSoftwarePlatform = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSoftwareRelease = null;
    } else {
    this.fstrSoftwareRelease = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIPAddress = null;
    } else {
    this.fstrIPAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebLogonId = null;
    } else {
    this.fstrWebLogonId = Text.readString(__dataIn);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fblnMidYearEntry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMidYearEntry);
    }
    if (null == this.fblnOver5M) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOver5M);
    }
    if (null == this.fdtmAIM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAIM.getTime());
    __dataOut.writeInt(this.fdtmAIM.getNanos());
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fblnHasMultipleActivities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasMultipleActivities);
    }
    if (null == this.fcurSalesServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalesServices, __dataOut);
    }
    if (null == this.fcurOpeningStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOpeningStock, __dataOut);
    }
    if (null == this.fcurPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPurchases, __dataOut);
    }
    if (null == this.fcurClosingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStock, __dataOut);
    }
    if (null == this.fcurClosingStockSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStockSAV, __dataOut);
    }
    if (null == this.fcurClosingStockUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStockUAV, __dataOut);
    }
    if (null == this.fcurGrossProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossProfit, __dataOut);
    }
    if (null == this.fcurInterestReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestReceived, __dataOut);
    }
    if (null == this.fcurDividendsReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsReceived, __dataOut);
    }
    if (null == this.fcurRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurBadDebts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBadDebts, __dataOut);
    }
    if (null == this.fcurAccountingDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountingDepreciation, __dataOut);
    }
    if (null == this.fcurInsurance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInsurance, __dataOut);
    }
    if (null == this.fcurInterestExpense) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestExpense, __dataOut);
    }
    if (null == this.fcurProfessionalFees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProfessionalFees, __dataOut);
    }
    if (null == this.fcurRates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRates, __dataOut);
    }
    if (null == this.fcurRentalPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalPayments, __dataOut);
    }
    if (null == this.fcurRepairs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRepairs, __dataOut);
    }
    if (null == this.fcurResearchAndDevelopment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResearchAndDevelopment, __dataOut);
    }
    if (null == this.fcurAssociatedPersonsRenum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAssociatedPersonsRenum, __dataOut);
    }
    if (null == this.fcurPaidToEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaidToEmployees, __dataOut);
    }
    if (null == this.fcurContractorPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContractorPayments, __dataOut);
    }
    if (null == this.fcurOtherExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherExpenses, __dataOut);
    }
    if (null == this.fcurExceptionalItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExceptionalItems, __dataOut);
    }
    if (null == this.fcurNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitLoss, __dataOut);
    }
    if (null == this.fcurTaxAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAdjustments, __dataOut);
    }
    if (null == this.fcurCurrentYearTaxablePL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentYearTaxablePL, __dataOut);
    }
    if (null == this.fcurAccountsReceivable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivable, __dataOut);
    }
    if (null == this.fcurAccountsReceivableSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivableSAV, __dataOut);
    }
    if (null == this.fcurDepreciationRecovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecovered, __dataOut);
    }
    if (null == this.fcurDepreciationRecoveredSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecoveredSAV, __dataOut);
    }
    if (null == this.fcurDepreciationRecoveredUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecoveredUAV, __dataOut);
    }
    if (null == this.fcurCashDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCashDeposits, __dataOut);
    }
    if (null == this.fcurOtherCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentAssets, __dataOut);
    }
    if (null == this.fcurVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVehicles, __dataOut);
    }
    if (null == this.fcurPlantAndMachinery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlantAndMachinery, __dataOut);
    }
    if (null == this.fcurFurnitureAndFittings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurnitureAndFittings, __dataOut);
    }
    if (null == this.fcurLand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLand, __dataOut);
    }
    if (null == this.fcurBuildings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBuildings, __dataOut);
    }
    if (null == this.fcurOtherFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherFixedAssets, __dataOut);
    }
    if (null == this.fcurIntangibles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIntangibles, __dataOut);
    }
    if (null == this.fcurSharesOwnershipInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesOwnershipInterests, __dataOut);
    }
    if (null == this.fcurTermDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTermDeposits, __dataOut);
    }
    if (null == this.fcurOtherNonCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherNonCurrentAssets, __dataOut);
    }
    if (null == this.fcurProvisions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisions, __dataOut);
    }
    if (null == this.fcurAccountsPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayable, __dataOut);
    }
    if (null == this.fcurAccountsPayableSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayableSAV, __dataOut);
    }
    if (null == this.fcurAccountsPayableUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayableUAV, __dataOut);
    }
    if (null == this.fcurCurrentLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentLoans, __dataOut);
    }
    if (null == this.fcurOtherCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurNonCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurOwnersEquity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnersEquity, __dataOut);
    }
    if (null == this.fcurTaxDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciation, __dataOut);
    }
    if (null == this.fcurTaxDepreciationSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciationSAV, __dataOut);
    }
    if (null == this.fcurTaxDepreciationUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciationUAV, __dataOut);
    }
    if (null == this.fcurUntaxedRealisedGains) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUntaxedRealisedGains, __dataOut);
    }
    if (null == this.fcurAdditionsToFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdditionsToFixedAssets, __dataOut);
    }
    if (null == this.fcurDisposalsForFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposalsForFixedAssets, __dataOut);
    }
    if (null == this.fcurDividendsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsPaid, __dataOut);
    }
    if (null == this.fcurDrawings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDrawings, __dataOut);
    }
    if (null == this.fcurCurrentAccountYearEndBal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentAccountYearEndBal, __dataOut);
    }
    if (null == this.fcurTaxDeductibleLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeductibleLoss, __dataOut);
    }
    if (null == this.fcurShareholderProvTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderProvTax, __dataOut);
    }
    if (null == this.fcurProvisionsShareholders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholders, __dataOut);
    }
    if (null == this.fcurProvisionsShareholdersSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholdersSAV, __dataOut);
    }
    if (null == this.fcurProvisionsShareholdersUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholdersUAV, __dataOut);
    }
    if (null == this.fcurAccountsReceivableUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivableUAV, __dataOut);
    }
    if (null == this.fcurPrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUse, __dataOut);
    }
    if (null == this.fcurLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLosses, __dataOut);
    }
    if (null == this.fcurPrivateUseSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUseSAV, __dataOut);
    }
    if (null == this.fcurPrivateUseUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUseUAV, __dataOut);
    }
    if (null == this.fcurProvisionsSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsSAV, __dataOut);
    }
    if (null == this.fcurProvisionsUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsUAV, __dataOut);
    }
    if (null == this.fcurYearToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurYearToDate, __dataOut);
    }
    if (null == this.fcurThisInstalment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurThisInstalment, __dataOut);
    }
    if (null == this.fcurRefundAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAmount, __dataOut);
    }
    if (null == this.fblnRefundIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRefundIndicator);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrSoftwarePlatform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwarePlatform);
    }
    if (null == this.fstrSoftwareRelease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareRelease);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrWebLogonId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonId);
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
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fblnMidYearEntry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMidYearEntry);
    }
    if (null == this.fblnOver5M) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOver5M);
    }
    if (null == this.fdtmAIM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAIM.getTime());
    __dataOut.writeInt(this.fdtmAIM.getNanos());
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fblnHasMultipleActivities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasMultipleActivities);
    }
    if (null == this.fcurSalesServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalesServices, __dataOut);
    }
    if (null == this.fcurOpeningStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOpeningStock, __dataOut);
    }
    if (null == this.fcurPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPurchases, __dataOut);
    }
    if (null == this.fcurClosingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStock, __dataOut);
    }
    if (null == this.fcurClosingStockSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStockSAV, __dataOut);
    }
    if (null == this.fcurClosingStockUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClosingStockUAV, __dataOut);
    }
    if (null == this.fcurGrossProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossProfit, __dataOut);
    }
    if (null == this.fcurInterestReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestReceived, __dataOut);
    }
    if (null == this.fcurDividendsReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsReceived, __dataOut);
    }
    if (null == this.fcurRentalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalIncome, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurBadDebts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBadDebts, __dataOut);
    }
    if (null == this.fcurAccountingDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountingDepreciation, __dataOut);
    }
    if (null == this.fcurInsurance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInsurance, __dataOut);
    }
    if (null == this.fcurInterestExpense) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestExpense, __dataOut);
    }
    if (null == this.fcurProfessionalFees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProfessionalFees, __dataOut);
    }
    if (null == this.fcurRates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRates, __dataOut);
    }
    if (null == this.fcurRentalPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalPayments, __dataOut);
    }
    if (null == this.fcurRepairs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRepairs, __dataOut);
    }
    if (null == this.fcurResearchAndDevelopment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResearchAndDevelopment, __dataOut);
    }
    if (null == this.fcurAssociatedPersonsRenum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAssociatedPersonsRenum, __dataOut);
    }
    if (null == this.fcurPaidToEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPaidToEmployees, __dataOut);
    }
    if (null == this.fcurContractorPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContractorPayments, __dataOut);
    }
    if (null == this.fcurOtherExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherExpenses, __dataOut);
    }
    if (null == this.fcurExceptionalItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExceptionalItems, __dataOut);
    }
    if (null == this.fcurNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitLoss, __dataOut);
    }
    if (null == this.fcurTaxAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAdjustments, __dataOut);
    }
    if (null == this.fcurCurrentYearTaxablePL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentYearTaxablePL, __dataOut);
    }
    if (null == this.fcurAccountsReceivable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivable, __dataOut);
    }
    if (null == this.fcurAccountsReceivableSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivableSAV, __dataOut);
    }
    if (null == this.fcurDepreciationRecovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecovered, __dataOut);
    }
    if (null == this.fcurDepreciationRecoveredSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecoveredSAV, __dataOut);
    }
    if (null == this.fcurDepreciationRecoveredUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepreciationRecoveredUAV, __dataOut);
    }
    if (null == this.fcurCashDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCashDeposits, __dataOut);
    }
    if (null == this.fcurOtherCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentAssets, __dataOut);
    }
    if (null == this.fcurVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVehicles, __dataOut);
    }
    if (null == this.fcurPlantAndMachinery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlantAndMachinery, __dataOut);
    }
    if (null == this.fcurFurnitureAndFittings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurnitureAndFittings, __dataOut);
    }
    if (null == this.fcurLand) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLand, __dataOut);
    }
    if (null == this.fcurBuildings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBuildings, __dataOut);
    }
    if (null == this.fcurOtherFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherFixedAssets, __dataOut);
    }
    if (null == this.fcurIntangibles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIntangibles, __dataOut);
    }
    if (null == this.fcurSharesOwnershipInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesOwnershipInterests, __dataOut);
    }
    if (null == this.fcurTermDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTermDeposits, __dataOut);
    }
    if (null == this.fcurOtherNonCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherNonCurrentAssets, __dataOut);
    }
    if (null == this.fcurProvisions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisions, __dataOut);
    }
    if (null == this.fcurAccountsPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayable, __dataOut);
    }
    if (null == this.fcurAccountsPayableSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayableSAV, __dataOut);
    }
    if (null == this.fcurAccountsPayableUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsPayableUAV, __dataOut);
    }
    if (null == this.fcurCurrentLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentLoans, __dataOut);
    }
    if (null == this.fcurOtherCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurNonCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurOwnersEquity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnersEquity, __dataOut);
    }
    if (null == this.fcurTaxDepreciation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciation, __dataOut);
    }
    if (null == this.fcurTaxDepreciationSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciationSAV, __dataOut);
    }
    if (null == this.fcurTaxDepreciationUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDepreciationUAV, __dataOut);
    }
    if (null == this.fcurUntaxedRealisedGains) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUntaxedRealisedGains, __dataOut);
    }
    if (null == this.fcurAdditionsToFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdditionsToFixedAssets, __dataOut);
    }
    if (null == this.fcurDisposalsForFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposalsForFixedAssets, __dataOut);
    }
    if (null == this.fcurDividendsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsPaid, __dataOut);
    }
    if (null == this.fcurDrawings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDrawings, __dataOut);
    }
    if (null == this.fcurCurrentAccountYearEndBal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentAccountYearEndBal, __dataOut);
    }
    if (null == this.fcurTaxDeductibleLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeductibleLoss, __dataOut);
    }
    if (null == this.fcurShareholderProvTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderProvTax, __dataOut);
    }
    if (null == this.fcurProvisionsShareholders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholders, __dataOut);
    }
    if (null == this.fcurProvisionsShareholdersSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholdersSAV, __dataOut);
    }
    if (null == this.fcurProvisionsShareholdersUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsShareholdersUAV, __dataOut);
    }
    if (null == this.fcurAccountsReceivableUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivableUAV, __dataOut);
    }
    if (null == this.fcurPrivateUse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUse, __dataOut);
    }
    if (null == this.fcurLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLosses, __dataOut);
    }
    if (null == this.fcurPrivateUseSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUseSAV, __dataOut);
    }
    if (null == this.fcurPrivateUseUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPrivateUseUAV, __dataOut);
    }
    if (null == this.fcurProvisionsSAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsSAV, __dataOut);
    }
    if (null == this.fcurProvisionsUAV) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurProvisionsUAV, __dataOut);
    }
    if (null == this.fcurYearToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurYearToDate, __dataOut);
    }
    if (null == this.fcurThisInstalment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurThisInstalment, __dataOut);
    }
    if (null == this.fcurRefundAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundAmount, __dataOut);
    }
    if (null == this.fblnRefundIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRefundIndicator);
    }
    if (null == this.fstrSoftwareProvider) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareProvider);
    }
    if (null == this.fstrSoftwarePlatform) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwarePlatform);
    }
    if (null == this.fstrSoftwareRelease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSoftwareRelease);
    }
    if (null == this.fstrIPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIPAddress);
    }
    if (null == this.fstrWebLogonId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebLogonId);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMidYearEntry==null?"\\N":"" + fblnMidYearEntry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOver5M==null?"\\N":"" + fblnOver5M, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAIM==null?"\\N":"" + fdtmAIM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasMultipleActivities==null?"\\N":"" + fblnHasMultipleActivities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalesServices==null?"\\N":fcurSalesServices.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOpeningStock==null?"\\N":fcurOpeningStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPurchases==null?"\\N":fcurPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStock==null?"\\N":fcurClosingStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStockSAV==null?"\\N":fcurClosingStockSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStockUAV==null?"\\N":fcurClosingStockUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossProfit==null?"\\N":fcurGrossProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestReceived==null?"\\N":fcurInterestReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsReceived==null?"\\N":fcurDividendsReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalIncome==null?"\\N":fcurRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBadDebts==null?"\\N":fcurBadDebts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountingDepreciation==null?"\\N":fcurAccountingDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInsurance==null?"\\N":fcurInsurance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestExpense==null?"\\N":fcurInterestExpense.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProfessionalFees==null?"\\N":fcurProfessionalFees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRates==null?"\\N":fcurRates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalPayments==null?"\\N":fcurRentalPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRepairs==null?"\\N":fcurRepairs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResearchAndDevelopment==null?"\\N":fcurResearchAndDevelopment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAssociatedPersonsRenum==null?"\\N":fcurAssociatedPersonsRenum.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaidToEmployees==null?"\\N":fcurPaidToEmployees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContractorPayments==null?"\\N":fcurContractorPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherExpenses==null?"\\N":fcurOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExceptionalItems==null?"\\N":fcurExceptionalItems.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitLoss==null?"\\N":fcurNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAdjustments==null?"\\N":fcurTaxAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentYearTaxablePL==null?"\\N":fcurCurrentYearTaxablePL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivable==null?"\\N":fcurAccountsReceivable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivableSAV==null?"\\N":fcurAccountsReceivableSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecovered==null?"\\N":fcurDepreciationRecovered.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecoveredSAV==null?"\\N":fcurDepreciationRecoveredSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecoveredUAV==null?"\\N":fcurDepreciationRecoveredUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCashDeposits==null?"\\N":fcurCashDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentAssets==null?"\\N":fcurOtherCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVehicles==null?"\\N":fcurVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlantAndMachinery==null?"\\N":fcurPlantAndMachinery.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurnitureAndFittings==null?"\\N":fcurFurnitureAndFittings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLand==null?"\\N":fcurLand.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildings==null?"\\N":fcurBuildings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherFixedAssets==null?"\\N":fcurOtherFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntangibles==null?"\\N":fcurIntangibles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesOwnershipInterests==null?"\\N":fcurSharesOwnershipInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTermDeposits==null?"\\N":fcurTermDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherNonCurrentAssets==null?"\\N":fcurOtherNonCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisions==null?"\\N":fcurProvisions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayable==null?"\\N":fcurAccountsPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayableSAV==null?"\\N":fcurAccountsPayableSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayableUAV==null?"\\N":fcurAccountsPayableUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentLoans==null?"\\N":fcurCurrentLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentLiabilities==null?"\\N":fcurOtherCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentLiabilities==null?"\\N":fcurNonCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnersEquity==null?"\\N":fcurOwnersEquity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciation==null?"\\N":fcurTaxDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciationSAV==null?"\\N":fcurTaxDepreciationSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciationUAV==null?"\\N":fcurTaxDepreciationUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUntaxedRealisedGains==null?"\\N":fcurUntaxedRealisedGains.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdditionsToFixedAssets==null?"\\N":fcurAdditionsToFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposalsForFixedAssets==null?"\\N":fcurDisposalsForFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDrawings==null?"\\N":fcurDrawings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentAccountYearEndBal==null?"\\N":fcurCurrentAccountYearEndBal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeductibleLoss==null?"\\N":fcurTaxDeductibleLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderProvTax==null?"\\N":fcurShareholderProvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholders==null?"\\N":fcurProvisionsShareholders.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholdersSAV==null?"\\N":fcurProvisionsShareholdersSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholdersUAV==null?"\\N":fcurProvisionsShareholdersUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivableUAV==null?"\\N":fcurAccountsReceivableUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUse==null?"\\N":fcurPrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLosses==null?"\\N":fcurLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUseSAV==null?"\\N":fcurPrivateUseSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUseUAV==null?"\\N":fcurPrivateUseUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsSAV==null?"\\N":fcurProvisionsSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsUAV==null?"\\N":fcurProvisionsUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurYearToDate==null?"\\N":fcurYearToDate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurThisInstalment==null?"\\N":fcurThisInstalment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAmount==null?"\\N":fcurRefundAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRefundIndicator==null?"\\N":"" + fblnRefundIndicator, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwarePlatform==null?"\\N":fstrSoftwarePlatform, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareRelease==null?"\\N":fstrSoftwareRelease, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonId==null?"\\N":fstrWebLogonId, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMidYearEntry==null?"\\N":"" + fblnMidYearEntry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOver5M==null?"\\N":"" + fblnOver5M, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAIM==null?"\\N":"" + fdtmAIM, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasMultipleActivities==null?"\\N":"" + fblnHasMultipleActivities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalesServices==null?"\\N":fcurSalesServices.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOpeningStock==null?"\\N":fcurOpeningStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPurchases==null?"\\N":fcurPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStock==null?"\\N":fcurClosingStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStockSAV==null?"\\N":fcurClosingStockSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClosingStockUAV==null?"\\N":fcurClosingStockUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossProfit==null?"\\N":fcurGrossProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestReceived==null?"\\N":fcurInterestReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsReceived==null?"\\N":fcurDividendsReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalIncome==null?"\\N":fcurRentalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBadDebts==null?"\\N":fcurBadDebts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountingDepreciation==null?"\\N":fcurAccountingDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInsurance==null?"\\N":fcurInsurance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestExpense==null?"\\N":fcurInterestExpense.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProfessionalFees==null?"\\N":fcurProfessionalFees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRates==null?"\\N":fcurRates.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalPayments==null?"\\N":fcurRentalPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRepairs==null?"\\N":fcurRepairs.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResearchAndDevelopment==null?"\\N":fcurResearchAndDevelopment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAssociatedPersonsRenum==null?"\\N":fcurAssociatedPersonsRenum.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPaidToEmployees==null?"\\N":fcurPaidToEmployees.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContractorPayments==null?"\\N":fcurContractorPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherExpenses==null?"\\N":fcurOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExceptionalItems==null?"\\N":fcurExceptionalItems.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitLoss==null?"\\N":fcurNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAdjustments==null?"\\N":fcurTaxAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentYearTaxablePL==null?"\\N":fcurCurrentYearTaxablePL.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivable==null?"\\N":fcurAccountsReceivable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivableSAV==null?"\\N":fcurAccountsReceivableSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecovered==null?"\\N":fcurDepreciationRecovered.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecoveredSAV==null?"\\N":fcurDepreciationRecoveredSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepreciationRecoveredUAV==null?"\\N":fcurDepreciationRecoveredUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCashDeposits==null?"\\N":fcurCashDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentAssets==null?"\\N":fcurOtherCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVehicles==null?"\\N":fcurVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlantAndMachinery==null?"\\N":fcurPlantAndMachinery.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurnitureAndFittings==null?"\\N":fcurFurnitureAndFittings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLand==null?"\\N":fcurLand.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildings==null?"\\N":fcurBuildings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherFixedAssets==null?"\\N":fcurOtherFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntangibles==null?"\\N":fcurIntangibles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesOwnershipInterests==null?"\\N":fcurSharesOwnershipInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTermDeposits==null?"\\N":fcurTermDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherNonCurrentAssets==null?"\\N":fcurOtherNonCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisions==null?"\\N":fcurProvisions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayable==null?"\\N":fcurAccountsPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayableSAV==null?"\\N":fcurAccountsPayableSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayableUAV==null?"\\N":fcurAccountsPayableUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentLoans==null?"\\N":fcurCurrentLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentLiabilities==null?"\\N":fcurOtherCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentLiabilities==null?"\\N":fcurNonCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnersEquity==null?"\\N":fcurOwnersEquity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciation==null?"\\N":fcurTaxDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciationSAV==null?"\\N":fcurTaxDepreciationSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciationUAV==null?"\\N":fcurTaxDepreciationUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUntaxedRealisedGains==null?"\\N":fcurUntaxedRealisedGains.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdditionsToFixedAssets==null?"\\N":fcurAdditionsToFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposalsForFixedAssets==null?"\\N":fcurDisposalsForFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDrawings==null?"\\N":fcurDrawings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentAccountYearEndBal==null?"\\N":fcurCurrentAccountYearEndBal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeductibleLoss==null?"\\N":fcurTaxDeductibleLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderProvTax==null?"\\N":fcurShareholderProvTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholders==null?"\\N":fcurProvisionsShareholders.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholdersSAV==null?"\\N":fcurProvisionsShareholdersSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsShareholdersUAV==null?"\\N":fcurProvisionsShareholdersUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivableUAV==null?"\\N":fcurAccountsReceivableUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUse==null?"\\N":fcurPrivateUse.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLosses==null?"\\N":fcurLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUseSAV==null?"\\N":fcurPrivateUseSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPrivateUseUAV==null?"\\N":fcurPrivateUseUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsSAV==null?"\\N":fcurProvisionsSAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisionsUAV==null?"\\N":fcurProvisionsUAV.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurYearToDate==null?"\\N":fcurYearToDate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurThisInstalment==null?"\\N":fcurThisInstalment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundAmount==null?"\\N":fcurRefundAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRefundIndicator==null?"\\N":"" + fblnRefundIndicator, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareProvider==null?"\\N":fstrSoftwareProvider, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwarePlatform==null?"\\N":fstrSoftwarePlatform, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSoftwareRelease==null?"\\N":fstrSoftwareRelease, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIPAddress==null?"\\N":fstrIPAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebLogonId==null?"\\N":fstrWebLogonId, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMidYearEntry = null; } else {
      this.fblnMidYearEntry = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOver5M = null; } else {
      this.fblnOver5M = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAIM = null; } else {
      this.fdtmAIM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasMultipleActivities = null; } else {
      this.fblnHasMultipleActivities = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalesServices = null; } else {
      this.fcurSalesServices = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOpeningStock = null; } else {
      this.fcurOpeningStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPurchases = null; } else {
      this.fcurPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStock = null; } else {
      this.fcurClosingStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStockSAV = null; } else {
      this.fcurClosingStockSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStockUAV = null; } else {
      this.fcurClosingStockUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossProfit = null; } else {
      this.fcurGrossProfit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestReceived = null; } else {
      this.fcurInterestReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsReceived = null; } else {
      this.fcurDividendsReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalIncome = null; } else {
      this.fcurRentalIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBadDebts = null; } else {
      this.fcurBadDebts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountingDepreciation = null; } else {
      this.fcurAccountingDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInsurance = null; } else {
      this.fcurInsurance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestExpense = null; } else {
      this.fcurInterestExpense = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProfessionalFees = null; } else {
      this.fcurProfessionalFees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRates = null; } else {
      this.fcurRates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalPayments = null; } else {
      this.fcurRentalPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRepairs = null; } else {
      this.fcurRepairs = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResearchAndDevelopment = null; } else {
      this.fcurResearchAndDevelopment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAssociatedPersonsRenum = null; } else {
      this.fcurAssociatedPersonsRenum = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaidToEmployees = null; } else {
      this.fcurPaidToEmployees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContractorPayments = null; } else {
      this.fcurContractorPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherExpenses = null; } else {
      this.fcurOtherExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExceptionalItems = null; } else {
      this.fcurExceptionalItems = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitLoss = null; } else {
      this.fcurNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAdjustments = null; } else {
      this.fcurTaxAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentYearTaxablePL = null; } else {
      this.fcurCurrentYearTaxablePL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivable = null; } else {
      this.fcurAccountsReceivable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivableSAV = null; } else {
      this.fcurAccountsReceivableSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecovered = null; } else {
      this.fcurDepreciationRecovered = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecoveredSAV = null; } else {
      this.fcurDepreciationRecoveredSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecoveredUAV = null; } else {
      this.fcurDepreciationRecoveredUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCashDeposits = null; } else {
      this.fcurCashDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherCurrentAssets = null; } else {
      this.fcurOtherCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVehicles = null; } else {
      this.fcurVehicles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlantAndMachinery = null; } else {
      this.fcurPlantAndMachinery = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurnitureAndFittings = null; } else {
      this.fcurFurnitureAndFittings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLand = null; } else {
      this.fcurLand = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBuildings = null; } else {
      this.fcurBuildings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherFixedAssets = null; } else {
      this.fcurOtherFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIntangibles = null; } else {
      this.fcurIntangibles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesOwnershipInterests = null; } else {
      this.fcurSharesOwnershipInterests = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTermDeposits = null; } else {
      this.fcurTermDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherNonCurrentAssets = null; } else {
      this.fcurOtherNonCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisions = null; } else {
      this.fcurProvisions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayable = null; } else {
      this.fcurAccountsPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayableSAV = null; } else {
      this.fcurAccountsPayableSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayableUAV = null; } else {
      this.fcurAccountsPayableUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentLoans = null; } else {
      this.fcurCurrentLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherCurrentLiabilities = null; } else {
      this.fcurOtherCurrentLiabilities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonCurrentLiabilities = null; } else {
      this.fcurNonCurrentLiabilities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnersEquity = null; } else {
      this.fcurOwnersEquity = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciation = null; } else {
      this.fcurTaxDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciationSAV = null; } else {
      this.fcurTaxDepreciationSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciationUAV = null; } else {
      this.fcurTaxDepreciationUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUntaxedRealisedGains = null; } else {
      this.fcurUntaxedRealisedGains = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdditionsToFixedAssets = null; } else {
      this.fcurAdditionsToFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposalsForFixedAssets = null; } else {
      this.fcurDisposalsForFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsPaid = null; } else {
      this.fcurDividendsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDrawings = null; } else {
      this.fcurDrawings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentAccountYearEndBal = null; } else {
      this.fcurCurrentAccountYearEndBal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDeductibleLoss = null; } else {
      this.fcurTaxDeductibleLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderProvTax = null; } else {
      this.fcurShareholderProvTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholders = null; } else {
      this.fcurProvisionsShareholders = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholdersSAV = null; } else {
      this.fcurProvisionsShareholdersSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholdersUAV = null; } else {
      this.fcurProvisionsShareholdersUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivableUAV = null; } else {
      this.fcurAccountsReceivableUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUse = null; } else {
      this.fcurPrivateUse = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUseSAV = null; } else {
      this.fcurPrivateUseSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUseUAV = null; } else {
      this.fcurPrivateUseUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsSAV = null; } else {
      this.fcurProvisionsSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsUAV = null; } else {
      this.fcurProvisionsUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurYearToDate = null; } else {
      this.fcurYearToDate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurThisInstalment = null; } else {
      this.fcurThisInstalment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAmount = null; } else {
      this.fcurRefundAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRefundIndicator = null; } else {
      this.fblnRefundIndicator = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrSoftwarePlatform = null; } else {
      this.fstrSoftwarePlatform = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareRelease = null; } else {
      this.fstrSoftwareRelease = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonId = null; } else {
      this.fstrWebLogonId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMidYearEntry = null; } else {
      this.fblnMidYearEntry = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOver5M = null; } else {
      this.fblnOver5M = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAIM = null; } else {
      this.fdtmAIM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasMultipleActivities = null; } else {
      this.fblnHasMultipleActivities = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalesServices = null; } else {
      this.fcurSalesServices = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOpeningStock = null; } else {
      this.fcurOpeningStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPurchases = null; } else {
      this.fcurPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStock = null; } else {
      this.fcurClosingStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStockSAV = null; } else {
      this.fcurClosingStockSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClosingStockUAV = null; } else {
      this.fcurClosingStockUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossProfit = null; } else {
      this.fcurGrossProfit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestReceived = null; } else {
      this.fcurInterestReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsReceived = null; } else {
      this.fcurDividendsReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalIncome = null; } else {
      this.fcurRentalIncome = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBadDebts = null; } else {
      this.fcurBadDebts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountingDepreciation = null; } else {
      this.fcurAccountingDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInsurance = null; } else {
      this.fcurInsurance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestExpense = null; } else {
      this.fcurInterestExpense = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProfessionalFees = null; } else {
      this.fcurProfessionalFees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRates = null; } else {
      this.fcurRates = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalPayments = null; } else {
      this.fcurRentalPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRepairs = null; } else {
      this.fcurRepairs = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResearchAndDevelopment = null; } else {
      this.fcurResearchAndDevelopment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAssociatedPersonsRenum = null; } else {
      this.fcurAssociatedPersonsRenum = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPaidToEmployees = null; } else {
      this.fcurPaidToEmployees = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContractorPayments = null; } else {
      this.fcurContractorPayments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherExpenses = null; } else {
      this.fcurOtherExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExceptionalItems = null; } else {
      this.fcurExceptionalItems = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitLoss = null; } else {
      this.fcurNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAdjustments = null; } else {
      this.fcurTaxAdjustments = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentYearTaxablePL = null; } else {
      this.fcurCurrentYearTaxablePL = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivable = null; } else {
      this.fcurAccountsReceivable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivableSAV = null; } else {
      this.fcurAccountsReceivableSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecovered = null; } else {
      this.fcurDepreciationRecovered = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecoveredSAV = null; } else {
      this.fcurDepreciationRecoveredSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepreciationRecoveredUAV = null; } else {
      this.fcurDepreciationRecoveredUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCashDeposits = null; } else {
      this.fcurCashDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherCurrentAssets = null; } else {
      this.fcurOtherCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurVehicles = null; } else {
      this.fcurVehicles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlantAndMachinery = null; } else {
      this.fcurPlantAndMachinery = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurnitureAndFittings = null; } else {
      this.fcurFurnitureAndFittings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLand = null; } else {
      this.fcurLand = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBuildings = null; } else {
      this.fcurBuildings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherFixedAssets = null; } else {
      this.fcurOtherFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIntangibles = null; } else {
      this.fcurIntangibles = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesOwnershipInterests = null; } else {
      this.fcurSharesOwnershipInterests = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTermDeposits = null; } else {
      this.fcurTermDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherNonCurrentAssets = null; } else {
      this.fcurOtherNonCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisions = null; } else {
      this.fcurProvisions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayable = null; } else {
      this.fcurAccountsPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayableSAV = null; } else {
      this.fcurAccountsPayableSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsPayableUAV = null; } else {
      this.fcurAccountsPayableUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentLoans = null; } else {
      this.fcurCurrentLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherCurrentLiabilities = null; } else {
      this.fcurOtherCurrentLiabilities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonCurrentLiabilities = null; } else {
      this.fcurNonCurrentLiabilities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnersEquity = null; } else {
      this.fcurOwnersEquity = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciation = null; } else {
      this.fcurTaxDepreciation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciationSAV = null; } else {
      this.fcurTaxDepreciationSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDepreciationUAV = null; } else {
      this.fcurTaxDepreciationUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUntaxedRealisedGains = null; } else {
      this.fcurUntaxedRealisedGains = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdditionsToFixedAssets = null; } else {
      this.fcurAdditionsToFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposalsForFixedAssets = null; } else {
      this.fcurDisposalsForFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsPaid = null; } else {
      this.fcurDividendsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDrawings = null; } else {
      this.fcurDrawings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentAccountYearEndBal = null; } else {
      this.fcurCurrentAccountYearEndBal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDeductibleLoss = null; } else {
      this.fcurTaxDeductibleLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderProvTax = null; } else {
      this.fcurShareholderProvTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholders = null; } else {
      this.fcurProvisionsShareholders = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholdersSAV = null; } else {
      this.fcurProvisionsShareholdersSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsShareholdersUAV = null; } else {
      this.fcurProvisionsShareholdersUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountsReceivableUAV = null; } else {
      this.fcurAccountsReceivableUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUse = null; } else {
      this.fcurPrivateUse = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUseSAV = null; } else {
      this.fcurPrivateUseSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPrivateUseUAV = null; } else {
      this.fcurPrivateUseUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsSAV = null; } else {
      this.fcurProvisionsSAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurProvisionsUAV = null; } else {
      this.fcurProvisionsUAV = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurYearToDate = null; } else {
      this.fcurYearToDate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurThisInstalment = null; } else {
      this.fcurThisInstalment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundAmount = null; } else {
      this.fcurRefundAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRefundIndicator = null; } else {
      this.fblnRefundIndicator = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrSoftwarePlatform = null; } else {
      this.fstrSoftwarePlatform = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSoftwareRelease = null; } else {
      this.fstrSoftwareRelease = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIPAddress = null; } else {
      this.fstrIPAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebLogonId = null; } else {
      this.fstrWebLogonId = __cur_str;
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
    tblnz_rtnsoa o = (tblnz_rtnsoa) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmAIM = (o.fdtmAIM != null) ? (java.sql.Timestamp) o.fdtmAIM.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnsoa o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmAIM = (o.fdtmAIM != null) ? (java.sql.Timestamp) o.fdtmAIM.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fblnMidYearEntry", this.fblnMidYearEntry);
    __sqoop$field_map.put("fblnOver5M", this.fblnOver5M);
    __sqoop$field_map.put("fdtmAIM", this.fdtmAIM);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fblnHasMultipleActivities", this.fblnHasMultipleActivities);
    __sqoop$field_map.put("fcurSalesServices", this.fcurSalesServices);
    __sqoop$field_map.put("fcurOpeningStock", this.fcurOpeningStock);
    __sqoop$field_map.put("fcurPurchases", this.fcurPurchases);
    __sqoop$field_map.put("fcurClosingStock", this.fcurClosingStock);
    __sqoop$field_map.put("fcurClosingStockSAV", this.fcurClosingStockSAV);
    __sqoop$field_map.put("fcurClosingStockUAV", this.fcurClosingStockUAV);
    __sqoop$field_map.put("fcurGrossProfit", this.fcurGrossProfit);
    __sqoop$field_map.put("fcurInterestReceived", this.fcurInterestReceived);
    __sqoop$field_map.put("fcurDividendsReceived", this.fcurDividendsReceived);
    __sqoop$field_map.put("fcurRentalIncome", this.fcurRentalIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurBadDebts", this.fcurBadDebts);
    __sqoop$field_map.put("fcurAccountingDepreciation", this.fcurAccountingDepreciation);
    __sqoop$field_map.put("fcurInsurance", this.fcurInsurance);
    __sqoop$field_map.put("fcurInterestExpense", this.fcurInterestExpense);
    __sqoop$field_map.put("fcurProfessionalFees", this.fcurProfessionalFees);
    __sqoop$field_map.put("fcurRates", this.fcurRates);
    __sqoop$field_map.put("fcurRentalPayments", this.fcurRentalPayments);
    __sqoop$field_map.put("fcurRepairs", this.fcurRepairs);
    __sqoop$field_map.put("fcurResearchAndDevelopment", this.fcurResearchAndDevelopment);
    __sqoop$field_map.put("fcurAssociatedPersonsRenum", this.fcurAssociatedPersonsRenum);
    __sqoop$field_map.put("fcurPaidToEmployees", this.fcurPaidToEmployees);
    __sqoop$field_map.put("fcurContractorPayments", this.fcurContractorPayments);
    __sqoop$field_map.put("fcurOtherExpenses", this.fcurOtherExpenses);
    __sqoop$field_map.put("fcurExceptionalItems", this.fcurExceptionalItems);
    __sqoop$field_map.put("fcurNetProfitLoss", this.fcurNetProfitLoss);
    __sqoop$field_map.put("fcurTaxAdjustments", this.fcurTaxAdjustments);
    __sqoop$field_map.put("fcurCurrentYearTaxablePL", this.fcurCurrentYearTaxablePL);
    __sqoop$field_map.put("fcurAccountsReceivable", this.fcurAccountsReceivable);
    __sqoop$field_map.put("fcurAccountsReceivableSAV", this.fcurAccountsReceivableSAV);
    __sqoop$field_map.put("fcurDepreciationRecovered", this.fcurDepreciationRecovered);
    __sqoop$field_map.put("fcurDepreciationRecoveredSAV", this.fcurDepreciationRecoveredSAV);
    __sqoop$field_map.put("fcurDepreciationRecoveredUAV", this.fcurDepreciationRecoveredUAV);
    __sqoop$field_map.put("fcurCashDeposits", this.fcurCashDeposits);
    __sqoop$field_map.put("fcurOtherCurrentAssets", this.fcurOtherCurrentAssets);
    __sqoop$field_map.put("fcurVehicles", this.fcurVehicles);
    __sqoop$field_map.put("fcurPlantAndMachinery", this.fcurPlantAndMachinery);
    __sqoop$field_map.put("fcurFurnitureAndFittings", this.fcurFurnitureAndFittings);
    __sqoop$field_map.put("fcurLand", this.fcurLand);
    __sqoop$field_map.put("fcurBuildings", this.fcurBuildings);
    __sqoop$field_map.put("fcurOtherFixedAssets", this.fcurOtherFixedAssets);
    __sqoop$field_map.put("fcurIntangibles", this.fcurIntangibles);
    __sqoop$field_map.put("fcurSharesOwnershipInterests", this.fcurSharesOwnershipInterests);
    __sqoop$field_map.put("fcurTermDeposits", this.fcurTermDeposits);
    __sqoop$field_map.put("fcurOtherNonCurrentAssets", this.fcurOtherNonCurrentAssets);
    __sqoop$field_map.put("fcurProvisions", this.fcurProvisions);
    __sqoop$field_map.put("fcurAccountsPayable", this.fcurAccountsPayable);
    __sqoop$field_map.put("fcurAccountsPayableSAV", this.fcurAccountsPayableSAV);
    __sqoop$field_map.put("fcurAccountsPayableUAV", this.fcurAccountsPayableUAV);
    __sqoop$field_map.put("fcurCurrentLoans", this.fcurCurrentLoans);
    __sqoop$field_map.put("fcurOtherCurrentLiabilities", this.fcurOtherCurrentLiabilities);
    __sqoop$field_map.put("fcurNonCurrentLiabilities", this.fcurNonCurrentLiabilities);
    __sqoop$field_map.put("fcurOwnersEquity", this.fcurOwnersEquity);
    __sqoop$field_map.put("fcurTaxDepreciation", this.fcurTaxDepreciation);
    __sqoop$field_map.put("fcurTaxDepreciationSAV", this.fcurTaxDepreciationSAV);
    __sqoop$field_map.put("fcurTaxDepreciationUAV", this.fcurTaxDepreciationUAV);
    __sqoop$field_map.put("fcurUntaxedRealisedGains", this.fcurUntaxedRealisedGains);
    __sqoop$field_map.put("fcurAdditionsToFixedAssets", this.fcurAdditionsToFixedAssets);
    __sqoop$field_map.put("fcurDisposalsForFixedAssets", this.fcurDisposalsForFixedAssets);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDrawings", this.fcurDrawings);
    __sqoop$field_map.put("fcurCurrentAccountYearEndBal", this.fcurCurrentAccountYearEndBal);
    __sqoop$field_map.put("fcurTaxDeductibleLoss", this.fcurTaxDeductibleLoss);
    __sqoop$field_map.put("fcurShareholderProvTax", this.fcurShareholderProvTax);
    __sqoop$field_map.put("fcurProvisionsShareholders", this.fcurProvisionsShareholders);
    __sqoop$field_map.put("fcurProvisionsShareholdersSAV", this.fcurProvisionsShareholdersSAV);
    __sqoop$field_map.put("fcurProvisionsShareholdersUAV", this.fcurProvisionsShareholdersUAV);
    __sqoop$field_map.put("fcurAccountsReceivableUAV", this.fcurAccountsReceivableUAV);
    __sqoop$field_map.put("fcurPrivateUse", this.fcurPrivateUse);
    __sqoop$field_map.put("fcurLosses", this.fcurLosses);
    __sqoop$field_map.put("fcurPrivateUseSAV", this.fcurPrivateUseSAV);
    __sqoop$field_map.put("fcurPrivateUseUAV", this.fcurPrivateUseUAV);
    __sqoop$field_map.put("fcurProvisionsSAV", this.fcurProvisionsSAV);
    __sqoop$field_map.put("fcurProvisionsUAV", this.fcurProvisionsUAV);
    __sqoop$field_map.put("fcurYearToDate", this.fcurYearToDate);
    __sqoop$field_map.put("fcurThisInstalment", this.fcurThisInstalment);
    __sqoop$field_map.put("fcurRefundAmount", this.fcurRefundAmount);
    __sqoop$field_map.put("fblnRefundIndicator", this.fblnRefundIndicator);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrSoftwarePlatform", this.fstrSoftwarePlatform);
    __sqoop$field_map.put("fstrSoftwareRelease", this.fstrSoftwareRelease);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrWebLogonId", this.fstrWebLogonId);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fblnMidYearEntry", this.fblnMidYearEntry);
    __sqoop$field_map.put("fblnOver5M", this.fblnOver5M);
    __sqoop$field_map.put("fdtmAIM", this.fdtmAIM);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fblnHasMultipleActivities", this.fblnHasMultipleActivities);
    __sqoop$field_map.put("fcurSalesServices", this.fcurSalesServices);
    __sqoop$field_map.put("fcurOpeningStock", this.fcurOpeningStock);
    __sqoop$field_map.put("fcurPurchases", this.fcurPurchases);
    __sqoop$field_map.put("fcurClosingStock", this.fcurClosingStock);
    __sqoop$field_map.put("fcurClosingStockSAV", this.fcurClosingStockSAV);
    __sqoop$field_map.put("fcurClosingStockUAV", this.fcurClosingStockUAV);
    __sqoop$field_map.put("fcurGrossProfit", this.fcurGrossProfit);
    __sqoop$field_map.put("fcurInterestReceived", this.fcurInterestReceived);
    __sqoop$field_map.put("fcurDividendsReceived", this.fcurDividendsReceived);
    __sqoop$field_map.put("fcurRentalIncome", this.fcurRentalIncome);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurBadDebts", this.fcurBadDebts);
    __sqoop$field_map.put("fcurAccountingDepreciation", this.fcurAccountingDepreciation);
    __sqoop$field_map.put("fcurInsurance", this.fcurInsurance);
    __sqoop$field_map.put("fcurInterestExpense", this.fcurInterestExpense);
    __sqoop$field_map.put("fcurProfessionalFees", this.fcurProfessionalFees);
    __sqoop$field_map.put("fcurRates", this.fcurRates);
    __sqoop$field_map.put("fcurRentalPayments", this.fcurRentalPayments);
    __sqoop$field_map.put("fcurRepairs", this.fcurRepairs);
    __sqoop$field_map.put("fcurResearchAndDevelopment", this.fcurResearchAndDevelopment);
    __sqoop$field_map.put("fcurAssociatedPersonsRenum", this.fcurAssociatedPersonsRenum);
    __sqoop$field_map.put("fcurPaidToEmployees", this.fcurPaidToEmployees);
    __sqoop$field_map.put("fcurContractorPayments", this.fcurContractorPayments);
    __sqoop$field_map.put("fcurOtherExpenses", this.fcurOtherExpenses);
    __sqoop$field_map.put("fcurExceptionalItems", this.fcurExceptionalItems);
    __sqoop$field_map.put("fcurNetProfitLoss", this.fcurNetProfitLoss);
    __sqoop$field_map.put("fcurTaxAdjustments", this.fcurTaxAdjustments);
    __sqoop$field_map.put("fcurCurrentYearTaxablePL", this.fcurCurrentYearTaxablePL);
    __sqoop$field_map.put("fcurAccountsReceivable", this.fcurAccountsReceivable);
    __sqoop$field_map.put("fcurAccountsReceivableSAV", this.fcurAccountsReceivableSAV);
    __sqoop$field_map.put("fcurDepreciationRecovered", this.fcurDepreciationRecovered);
    __sqoop$field_map.put("fcurDepreciationRecoveredSAV", this.fcurDepreciationRecoveredSAV);
    __sqoop$field_map.put("fcurDepreciationRecoveredUAV", this.fcurDepreciationRecoveredUAV);
    __sqoop$field_map.put("fcurCashDeposits", this.fcurCashDeposits);
    __sqoop$field_map.put("fcurOtherCurrentAssets", this.fcurOtherCurrentAssets);
    __sqoop$field_map.put("fcurVehicles", this.fcurVehicles);
    __sqoop$field_map.put("fcurPlantAndMachinery", this.fcurPlantAndMachinery);
    __sqoop$field_map.put("fcurFurnitureAndFittings", this.fcurFurnitureAndFittings);
    __sqoop$field_map.put("fcurLand", this.fcurLand);
    __sqoop$field_map.put("fcurBuildings", this.fcurBuildings);
    __sqoop$field_map.put("fcurOtherFixedAssets", this.fcurOtherFixedAssets);
    __sqoop$field_map.put("fcurIntangibles", this.fcurIntangibles);
    __sqoop$field_map.put("fcurSharesOwnershipInterests", this.fcurSharesOwnershipInterests);
    __sqoop$field_map.put("fcurTermDeposits", this.fcurTermDeposits);
    __sqoop$field_map.put("fcurOtherNonCurrentAssets", this.fcurOtherNonCurrentAssets);
    __sqoop$field_map.put("fcurProvisions", this.fcurProvisions);
    __sqoop$field_map.put("fcurAccountsPayable", this.fcurAccountsPayable);
    __sqoop$field_map.put("fcurAccountsPayableSAV", this.fcurAccountsPayableSAV);
    __sqoop$field_map.put("fcurAccountsPayableUAV", this.fcurAccountsPayableUAV);
    __sqoop$field_map.put("fcurCurrentLoans", this.fcurCurrentLoans);
    __sqoop$field_map.put("fcurOtherCurrentLiabilities", this.fcurOtherCurrentLiabilities);
    __sqoop$field_map.put("fcurNonCurrentLiabilities", this.fcurNonCurrentLiabilities);
    __sqoop$field_map.put("fcurOwnersEquity", this.fcurOwnersEquity);
    __sqoop$field_map.put("fcurTaxDepreciation", this.fcurTaxDepreciation);
    __sqoop$field_map.put("fcurTaxDepreciationSAV", this.fcurTaxDepreciationSAV);
    __sqoop$field_map.put("fcurTaxDepreciationUAV", this.fcurTaxDepreciationUAV);
    __sqoop$field_map.put("fcurUntaxedRealisedGains", this.fcurUntaxedRealisedGains);
    __sqoop$field_map.put("fcurAdditionsToFixedAssets", this.fcurAdditionsToFixedAssets);
    __sqoop$field_map.put("fcurDisposalsForFixedAssets", this.fcurDisposalsForFixedAssets);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDrawings", this.fcurDrawings);
    __sqoop$field_map.put("fcurCurrentAccountYearEndBal", this.fcurCurrentAccountYearEndBal);
    __sqoop$field_map.put("fcurTaxDeductibleLoss", this.fcurTaxDeductibleLoss);
    __sqoop$field_map.put("fcurShareholderProvTax", this.fcurShareholderProvTax);
    __sqoop$field_map.put("fcurProvisionsShareholders", this.fcurProvisionsShareholders);
    __sqoop$field_map.put("fcurProvisionsShareholdersSAV", this.fcurProvisionsShareholdersSAV);
    __sqoop$field_map.put("fcurProvisionsShareholdersUAV", this.fcurProvisionsShareholdersUAV);
    __sqoop$field_map.put("fcurAccountsReceivableUAV", this.fcurAccountsReceivableUAV);
    __sqoop$field_map.put("fcurPrivateUse", this.fcurPrivateUse);
    __sqoop$field_map.put("fcurLosses", this.fcurLosses);
    __sqoop$field_map.put("fcurPrivateUseSAV", this.fcurPrivateUseSAV);
    __sqoop$field_map.put("fcurPrivateUseUAV", this.fcurPrivateUseUAV);
    __sqoop$field_map.put("fcurProvisionsSAV", this.fcurProvisionsSAV);
    __sqoop$field_map.put("fcurProvisionsUAV", this.fcurProvisionsUAV);
    __sqoop$field_map.put("fcurYearToDate", this.fcurYearToDate);
    __sqoop$field_map.put("fcurThisInstalment", this.fcurThisInstalment);
    __sqoop$field_map.put("fcurRefundAmount", this.fcurRefundAmount);
    __sqoop$field_map.put("fblnRefundIndicator", this.fblnRefundIndicator);
    __sqoop$field_map.put("fstrSoftwareProvider", this.fstrSoftwareProvider);
    __sqoop$field_map.put("fstrSoftwarePlatform", this.fstrSoftwarePlatform);
    __sqoop$field_map.put("fstrSoftwareRelease", this.fstrSoftwareRelease);
    __sqoop$field_map.put("fstrIPAddress", this.fstrIPAddress);
    __sqoop$field_map.put("fstrWebLogonId", this.fstrWebLogonId);
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
