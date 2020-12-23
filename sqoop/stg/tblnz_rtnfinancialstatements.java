// ORM class for table 'tblnz_rtnfinancialstatements'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:58:40 NZDT 2020
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

public class tblnz_rtnfinancialstatements extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnMultipleActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fblnMultipleActivity = (Integer)value;
      }
    });
    setters.put("fcurGrossSales", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurGrossSales = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGoodsOpeningStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurGoodsOpeningStock = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGoodsPurchases", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurGoodsPurchases = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGoodsClosingStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurGoodsClosingStock = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossProfit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurGrossProfit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherGrossInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherGrossInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherRental", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherRental = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBadDebt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurBadDebt = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountingDepreciation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurAccountingDepreciation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInsurance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurInsurance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestExpense", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurInterestExpense = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProfessionalFees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurProfessionalFees = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurRates = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRentalPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurRentalPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRepairsMaintenance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurRepairsMaintenance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResearchDevelopment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurResearchDevelopment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAssociatedRemuneration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurAssociatedRemuneration = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEmployeeSalary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurEmployeeSalary = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurContractorPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurContractorPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTotalExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExceptionalItems", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurExceptionalItems = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetProfitBeforeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurNetProfitBeforeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAdjustments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTaxAdjustments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentTaxableProfit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurCurrentTaxableProfit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsReceivable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurAccountsReceivable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCashDeposits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurCashDeposits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurVehicles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurVehicles = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPlantMachinery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurPlantMachinery = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFurnitureFittings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurFurnitureFittings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLand", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurLand = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBuildings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurBuildings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIntangibles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurIntangibles = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSharesInterests", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurSharesInterests = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTermDeposits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTermDeposits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonCurrentAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurNonCurrentAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTotalAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurProvisions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurProvisions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountsPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurAccountsPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurCurrentLoan = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherCurrentLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOtherCurrentLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCurrentLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTotalCurrentLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonCurrentLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurNonCurrentLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFinalTotalLiabilities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurFinalTotalLiabilities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnersEquity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurOwnersEquity = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDepreciation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTaxDepreciation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUntaxedGains", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurUntaxedGains = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAdditionFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurAdditionFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDisposalsFixedAssets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurDisposalsFixedAssets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendsPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurDividendsPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDrawings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurDrawings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCurrentAccountBalances", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurCurrentAccountBalances = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDeductibleLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fcurTaxDeductibleLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfinancialstatements.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnfinancialstatements() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnfinancialstatements with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnMultipleActivity;
  public Integer get_fblnMultipleActivity() {
    return fblnMultipleActivity;
  }
  public void set_fblnMultipleActivity(Integer fblnMultipleActivity) {
    this.fblnMultipleActivity = fblnMultipleActivity;
  }
  public tblnz_rtnfinancialstatements with_fblnMultipleActivity(Integer fblnMultipleActivity) {
    this.fblnMultipleActivity = fblnMultipleActivity;
    return this;
  }
  private java.math.BigDecimal fcurGrossSales;
  public java.math.BigDecimal get_fcurGrossSales() {
    return fcurGrossSales;
  }
  public void set_fcurGrossSales(java.math.BigDecimal fcurGrossSales) {
    this.fcurGrossSales = fcurGrossSales;
  }
  public tblnz_rtnfinancialstatements with_fcurGrossSales(java.math.BigDecimal fcurGrossSales) {
    this.fcurGrossSales = fcurGrossSales;
    return this;
  }
  private java.math.BigDecimal fcurGoodsOpeningStock;
  public java.math.BigDecimal get_fcurGoodsOpeningStock() {
    return fcurGoodsOpeningStock;
  }
  public void set_fcurGoodsOpeningStock(java.math.BigDecimal fcurGoodsOpeningStock) {
    this.fcurGoodsOpeningStock = fcurGoodsOpeningStock;
  }
  public tblnz_rtnfinancialstatements with_fcurGoodsOpeningStock(java.math.BigDecimal fcurGoodsOpeningStock) {
    this.fcurGoodsOpeningStock = fcurGoodsOpeningStock;
    return this;
  }
  private java.math.BigDecimal fcurGoodsPurchases;
  public java.math.BigDecimal get_fcurGoodsPurchases() {
    return fcurGoodsPurchases;
  }
  public void set_fcurGoodsPurchases(java.math.BigDecimal fcurGoodsPurchases) {
    this.fcurGoodsPurchases = fcurGoodsPurchases;
  }
  public tblnz_rtnfinancialstatements with_fcurGoodsPurchases(java.math.BigDecimal fcurGoodsPurchases) {
    this.fcurGoodsPurchases = fcurGoodsPurchases;
    return this;
  }
  private java.math.BigDecimal fcurGoodsClosingStock;
  public java.math.BigDecimal get_fcurGoodsClosingStock() {
    return fcurGoodsClosingStock;
  }
  public void set_fcurGoodsClosingStock(java.math.BigDecimal fcurGoodsClosingStock) {
    this.fcurGoodsClosingStock = fcurGoodsClosingStock;
  }
  public tblnz_rtnfinancialstatements with_fcurGoodsClosingStock(java.math.BigDecimal fcurGoodsClosingStock) {
    this.fcurGoodsClosingStock = fcurGoodsClosingStock;
    return this;
  }
  private java.math.BigDecimal fcurGrossProfit;
  public java.math.BigDecimal get_fcurGrossProfit() {
    return fcurGrossProfit;
  }
  public void set_fcurGrossProfit(java.math.BigDecimal fcurGrossProfit) {
    this.fcurGrossProfit = fcurGrossProfit;
  }
  public tblnz_rtnfinancialstatements with_fcurGrossProfit(java.math.BigDecimal fcurGrossProfit) {
    this.fcurGrossProfit = fcurGrossProfit;
    return this;
  }
  private java.math.BigDecimal fcurOtherGrossInterest;
  public java.math.BigDecimal get_fcurOtherGrossInterest() {
    return fcurOtherGrossInterest;
  }
  public void set_fcurOtherGrossInterest(java.math.BigDecimal fcurOtherGrossInterest) {
    this.fcurOtherGrossInterest = fcurOtherGrossInterest;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherGrossInterest(java.math.BigDecimal fcurOtherGrossInterest) {
    this.fcurOtherGrossInterest = fcurOtherGrossInterest;
    return this;
  }
  private java.math.BigDecimal fcurOtherGrossDividends;
  public java.math.BigDecimal get_fcurOtherGrossDividends() {
    return fcurOtherGrossDividends;
  }
  public void set_fcurOtherGrossDividends(java.math.BigDecimal fcurOtherGrossDividends) {
    this.fcurOtherGrossDividends = fcurOtherGrossDividends;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherGrossDividends(java.math.BigDecimal fcurOtherGrossDividends) {
    this.fcurOtherGrossDividends = fcurOtherGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurOtherRental;
  public java.math.BigDecimal get_fcurOtherRental() {
    return fcurOtherRental;
  }
  public void set_fcurOtherRental(java.math.BigDecimal fcurOtherRental) {
    this.fcurOtherRental = fcurOtherRental;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherRental(java.math.BigDecimal fcurOtherRental) {
    this.fcurOtherRental = fcurOtherRental;
    return this;
  }
  private java.math.BigDecimal fcurOtherIncome;
  public java.math.BigDecimal get_fcurOtherIncome() {
    return fcurOtherIncome;
  }
  public void set_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherIncome(java.math.BigDecimal fcurOtherIncome) {
    this.fcurOtherIncome = fcurOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnfinancialstatements with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurBadDebt;
  public java.math.BigDecimal get_fcurBadDebt() {
    return fcurBadDebt;
  }
  public void set_fcurBadDebt(java.math.BigDecimal fcurBadDebt) {
    this.fcurBadDebt = fcurBadDebt;
  }
  public tblnz_rtnfinancialstatements with_fcurBadDebt(java.math.BigDecimal fcurBadDebt) {
    this.fcurBadDebt = fcurBadDebt;
    return this;
  }
  private java.math.BigDecimal fcurAccountingDepreciation;
  public java.math.BigDecimal get_fcurAccountingDepreciation() {
    return fcurAccountingDepreciation;
  }
  public void set_fcurAccountingDepreciation(java.math.BigDecimal fcurAccountingDepreciation) {
    this.fcurAccountingDepreciation = fcurAccountingDepreciation;
  }
  public tblnz_rtnfinancialstatements with_fcurAccountingDepreciation(java.math.BigDecimal fcurAccountingDepreciation) {
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
  public tblnz_rtnfinancialstatements with_fcurInsurance(java.math.BigDecimal fcurInsurance) {
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
  public tblnz_rtnfinancialstatements with_fcurInterestExpense(java.math.BigDecimal fcurInterestExpense) {
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
  public tblnz_rtnfinancialstatements with_fcurProfessionalFees(java.math.BigDecimal fcurProfessionalFees) {
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
  public tblnz_rtnfinancialstatements with_fcurRates(java.math.BigDecimal fcurRates) {
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
  public tblnz_rtnfinancialstatements with_fcurRentalPayments(java.math.BigDecimal fcurRentalPayments) {
    this.fcurRentalPayments = fcurRentalPayments;
    return this;
  }
  private java.math.BigDecimal fcurRepairsMaintenance;
  public java.math.BigDecimal get_fcurRepairsMaintenance() {
    return fcurRepairsMaintenance;
  }
  public void set_fcurRepairsMaintenance(java.math.BigDecimal fcurRepairsMaintenance) {
    this.fcurRepairsMaintenance = fcurRepairsMaintenance;
  }
  public tblnz_rtnfinancialstatements with_fcurRepairsMaintenance(java.math.BigDecimal fcurRepairsMaintenance) {
    this.fcurRepairsMaintenance = fcurRepairsMaintenance;
    return this;
  }
  private java.math.BigDecimal fcurResearchDevelopment;
  public java.math.BigDecimal get_fcurResearchDevelopment() {
    return fcurResearchDevelopment;
  }
  public void set_fcurResearchDevelopment(java.math.BigDecimal fcurResearchDevelopment) {
    this.fcurResearchDevelopment = fcurResearchDevelopment;
  }
  public tblnz_rtnfinancialstatements with_fcurResearchDevelopment(java.math.BigDecimal fcurResearchDevelopment) {
    this.fcurResearchDevelopment = fcurResearchDevelopment;
    return this;
  }
  private java.math.BigDecimal fcurAssociatedRemuneration;
  public java.math.BigDecimal get_fcurAssociatedRemuneration() {
    return fcurAssociatedRemuneration;
  }
  public void set_fcurAssociatedRemuneration(java.math.BigDecimal fcurAssociatedRemuneration) {
    this.fcurAssociatedRemuneration = fcurAssociatedRemuneration;
  }
  public tblnz_rtnfinancialstatements with_fcurAssociatedRemuneration(java.math.BigDecimal fcurAssociatedRemuneration) {
    this.fcurAssociatedRemuneration = fcurAssociatedRemuneration;
    return this;
  }
  private java.math.BigDecimal fcurEmployeeSalary;
  public java.math.BigDecimal get_fcurEmployeeSalary() {
    return fcurEmployeeSalary;
  }
  public void set_fcurEmployeeSalary(java.math.BigDecimal fcurEmployeeSalary) {
    this.fcurEmployeeSalary = fcurEmployeeSalary;
  }
  public tblnz_rtnfinancialstatements with_fcurEmployeeSalary(java.math.BigDecimal fcurEmployeeSalary) {
    this.fcurEmployeeSalary = fcurEmployeeSalary;
    return this;
  }
  private java.math.BigDecimal fcurContractorPayments;
  public java.math.BigDecimal get_fcurContractorPayments() {
    return fcurContractorPayments;
  }
  public void set_fcurContractorPayments(java.math.BigDecimal fcurContractorPayments) {
    this.fcurContractorPayments = fcurContractorPayments;
  }
  public tblnz_rtnfinancialstatements with_fcurContractorPayments(java.math.BigDecimal fcurContractorPayments) {
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
  public tblnz_rtnfinancialstatements with_fcurOtherExpenses(java.math.BigDecimal fcurOtherExpenses) {
    this.fcurOtherExpenses = fcurOtherExpenses;
    return this;
  }
  private java.math.BigDecimal fcurTotalExpenses;
  public java.math.BigDecimal get_fcurTotalExpenses() {
    return fcurTotalExpenses;
  }
  public void set_fcurTotalExpenses(java.math.BigDecimal fcurTotalExpenses) {
    this.fcurTotalExpenses = fcurTotalExpenses;
  }
  public tblnz_rtnfinancialstatements with_fcurTotalExpenses(java.math.BigDecimal fcurTotalExpenses) {
    this.fcurTotalExpenses = fcurTotalExpenses;
    return this;
  }
  private java.math.BigDecimal fcurExceptionalItems;
  public java.math.BigDecimal get_fcurExceptionalItems() {
    return fcurExceptionalItems;
  }
  public void set_fcurExceptionalItems(java.math.BigDecimal fcurExceptionalItems) {
    this.fcurExceptionalItems = fcurExceptionalItems;
  }
  public tblnz_rtnfinancialstatements with_fcurExceptionalItems(java.math.BigDecimal fcurExceptionalItems) {
    this.fcurExceptionalItems = fcurExceptionalItems;
    return this;
  }
  private java.math.BigDecimal fcurNetProfitBeforeTax;
  public java.math.BigDecimal get_fcurNetProfitBeforeTax() {
    return fcurNetProfitBeforeTax;
  }
  public void set_fcurNetProfitBeforeTax(java.math.BigDecimal fcurNetProfitBeforeTax) {
    this.fcurNetProfitBeforeTax = fcurNetProfitBeforeTax;
  }
  public tblnz_rtnfinancialstatements with_fcurNetProfitBeforeTax(java.math.BigDecimal fcurNetProfitBeforeTax) {
    this.fcurNetProfitBeforeTax = fcurNetProfitBeforeTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxAdjustments;
  public java.math.BigDecimal get_fcurTaxAdjustments() {
    return fcurTaxAdjustments;
  }
  public void set_fcurTaxAdjustments(java.math.BigDecimal fcurTaxAdjustments) {
    this.fcurTaxAdjustments = fcurTaxAdjustments;
  }
  public tblnz_rtnfinancialstatements with_fcurTaxAdjustments(java.math.BigDecimal fcurTaxAdjustments) {
    this.fcurTaxAdjustments = fcurTaxAdjustments;
    return this;
  }
  private java.math.BigDecimal fcurCurrentTaxableProfit;
  public java.math.BigDecimal get_fcurCurrentTaxableProfit() {
    return fcurCurrentTaxableProfit;
  }
  public void set_fcurCurrentTaxableProfit(java.math.BigDecimal fcurCurrentTaxableProfit) {
    this.fcurCurrentTaxableProfit = fcurCurrentTaxableProfit;
  }
  public tblnz_rtnfinancialstatements with_fcurCurrentTaxableProfit(java.math.BigDecimal fcurCurrentTaxableProfit) {
    this.fcurCurrentTaxableProfit = fcurCurrentTaxableProfit;
    return this;
  }
  private java.math.BigDecimal fcurAccountsReceivable;
  public java.math.BigDecimal get_fcurAccountsReceivable() {
    return fcurAccountsReceivable;
  }
  public void set_fcurAccountsReceivable(java.math.BigDecimal fcurAccountsReceivable) {
    this.fcurAccountsReceivable = fcurAccountsReceivable;
  }
  public tblnz_rtnfinancialstatements with_fcurAccountsReceivable(java.math.BigDecimal fcurAccountsReceivable) {
    this.fcurAccountsReceivable = fcurAccountsReceivable;
    return this;
  }
  private java.math.BigDecimal fcurCashDeposits;
  public java.math.BigDecimal get_fcurCashDeposits() {
    return fcurCashDeposits;
  }
  public void set_fcurCashDeposits(java.math.BigDecimal fcurCashDeposits) {
    this.fcurCashDeposits = fcurCashDeposits;
  }
  public tblnz_rtnfinancialstatements with_fcurCashDeposits(java.math.BigDecimal fcurCashDeposits) {
    this.fcurCashDeposits = fcurCashDeposits;
    return this;
  }
  private java.math.BigDecimal fcurOtherAssets;
  public java.math.BigDecimal get_fcurOtherAssets() {
    return fcurOtherAssets;
  }
  public void set_fcurOtherAssets(java.math.BigDecimal fcurOtherAssets) {
    this.fcurOtherAssets = fcurOtherAssets;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherAssets(java.math.BigDecimal fcurOtherAssets) {
    this.fcurOtherAssets = fcurOtherAssets;
    return this;
  }
  private java.math.BigDecimal fcurVehicles;
  public java.math.BigDecimal get_fcurVehicles() {
    return fcurVehicles;
  }
  public void set_fcurVehicles(java.math.BigDecimal fcurVehicles) {
    this.fcurVehicles = fcurVehicles;
  }
  public tblnz_rtnfinancialstatements with_fcurVehicles(java.math.BigDecimal fcurVehicles) {
    this.fcurVehicles = fcurVehicles;
    return this;
  }
  private java.math.BigDecimal fcurPlantMachinery;
  public java.math.BigDecimal get_fcurPlantMachinery() {
    return fcurPlantMachinery;
  }
  public void set_fcurPlantMachinery(java.math.BigDecimal fcurPlantMachinery) {
    this.fcurPlantMachinery = fcurPlantMachinery;
  }
  public tblnz_rtnfinancialstatements with_fcurPlantMachinery(java.math.BigDecimal fcurPlantMachinery) {
    this.fcurPlantMachinery = fcurPlantMachinery;
    return this;
  }
  private java.math.BigDecimal fcurFurnitureFittings;
  public java.math.BigDecimal get_fcurFurnitureFittings() {
    return fcurFurnitureFittings;
  }
  public void set_fcurFurnitureFittings(java.math.BigDecimal fcurFurnitureFittings) {
    this.fcurFurnitureFittings = fcurFurnitureFittings;
  }
  public tblnz_rtnfinancialstatements with_fcurFurnitureFittings(java.math.BigDecimal fcurFurnitureFittings) {
    this.fcurFurnitureFittings = fcurFurnitureFittings;
    return this;
  }
  private java.math.BigDecimal fcurLand;
  public java.math.BigDecimal get_fcurLand() {
    return fcurLand;
  }
  public void set_fcurLand(java.math.BigDecimal fcurLand) {
    this.fcurLand = fcurLand;
  }
  public tblnz_rtnfinancialstatements with_fcurLand(java.math.BigDecimal fcurLand) {
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
  public tblnz_rtnfinancialstatements with_fcurBuildings(java.math.BigDecimal fcurBuildings) {
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
  public tblnz_rtnfinancialstatements with_fcurOtherFixedAssets(java.math.BigDecimal fcurOtherFixedAssets) {
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
  public tblnz_rtnfinancialstatements with_fcurIntangibles(java.math.BigDecimal fcurIntangibles) {
    this.fcurIntangibles = fcurIntangibles;
    return this;
  }
  private java.math.BigDecimal fcurSharesInterests;
  public java.math.BigDecimal get_fcurSharesInterests() {
    return fcurSharesInterests;
  }
  public void set_fcurSharesInterests(java.math.BigDecimal fcurSharesInterests) {
    this.fcurSharesInterests = fcurSharesInterests;
  }
  public tblnz_rtnfinancialstatements with_fcurSharesInterests(java.math.BigDecimal fcurSharesInterests) {
    this.fcurSharesInterests = fcurSharesInterests;
    return this;
  }
  private java.math.BigDecimal fcurTermDeposits;
  public java.math.BigDecimal get_fcurTermDeposits() {
    return fcurTermDeposits;
  }
  public void set_fcurTermDeposits(java.math.BigDecimal fcurTermDeposits) {
    this.fcurTermDeposits = fcurTermDeposits;
  }
  public tblnz_rtnfinancialstatements with_fcurTermDeposits(java.math.BigDecimal fcurTermDeposits) {
    this.fcurTermDeposits = fcurTermDeposits;
    return this;
  }
  private java.math.BigDecimal fcurNonCurrentAssets;
  public java.math.BigDecimal get_fcurNonCurrentAssets() {
    return fcurNonCurrentAssets;
  }
  public void set_fcurNonCurrentAssets(java.math.BigDecimal fcurNonCurrentAssets) {
    this.fcurNonCurrentAssets = fcurNonCurrentAssets;
  }
  public tblnz_rtnfinancialstatements with_fcurNonCurrentAssets(java.math.BigDecimal fcurNonCurrentAssets) {
    this.fcurNonCurrentAssets = fcurNonCurrentAssets;
    return this;
  }
  private java.math.BigDecimal fcurTotalAssets;
  public java.math.BigDecimal get_fcurTotalAssets() {
    return fcurTotalAssets;
  }
  public void set_fcurTotalAssets(java.math.BigDecimal fcurTotalAssets) {
    this.fcurTotalAssets = fcurTotalAssets;
  }
  public tblnz_rtnfinancialstatements with_fcurTotalAssets(java.math.BigDecimal fcurTotalAssets) {
    this.fcurTotalAssets = fcurTotalAssets;
    return this;
  }
  private java.math.BigDecimal fcurProvisions;
  public java.math.BigDecimal get_fcurProvisions() {
    return fcurProvisions;
  }
  public void set_fcurProvisions(java.math.BigDecimal fcurProvisions) {
    this.fcurProvisions = fcurProvisions;
  }
  public tblnz_rtnfinancialstatements with_fcurProvisions(java.math.BigDecimal fcurProvisions) {
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
  public tblnz_rtnfinancialstatements with_fcurAccountsPayable(java.math.BigDecimal fcurAccountsPayable) {
    this.fcurAccountsPayable = fcurAccountsPayable;
    return this;
  }
  private java.math.BigDecimal fcurCurrentLoan;
  public java.math.BigDecimal get_fcurCurrentLoan() {
    return fcurCurrentLoan;
  }
  public void set_fcurCurrentLoan(java.math.BigDecimal fcurCurrentLoan) {
    this.fcurCurrentLoan = fcurCurrentLoan;
  }
  public tblnz_rtnfinancialstatements with_fcurCurrentLoan(java.math.BigDecimal fcurCurrentLoan) {
    this.fcurCurrentLoan = fcurCurrentLoan;
    return this;
  }
  private java.math.BigDecimal fcurOtherCurrentLiabilities;
  public java.math.BigDecimal get_fcurOtherCurrentLiabilities() {
    return fcurOtherCurrentLiabilities;
  }
  public void set_fcurOtherCurrentLiabilities(java.math.BigDecimal fcurOtherCurrentLiabilities) {
    this.fcurOtherCurrentLiabilities = fcurOtherCurrentLiabilities;
  }
  public tblnz_rtnfinancialstatements with_fcurOtherCurrentLiabilities(java.math.BigDecimal fcurOtherCurrentLiabilities) {
    this.fcurOtherCurrentLiabilities = fcurOtherCurrentLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurTotalCurrentLiabilities;
  public java.math.BigDecimal get_fcurTotalCurrentLiabilities() {
    return fcurTotalCurrentLiabilities;
  }
  public void set_fcurTotalCurrentLiabilities(java.math.BigDecimal fcurTotalCurrentLiabilities) {
    this.fcurTotalCurrentLiabilities = fcurTotalCurrentLiabilities;
  }
  public tblnz_rtnfinancialstatements with_fcurTotalCurrentLiabilities(java.math.BigDecimal fcurTotalCurrentLiabilities) {
    this.fcurTotalCurrentLiabilities = fcurTotalCurrentLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurNonCurrentLiabilities;
  public java.math.BigDecimal get_fcurNonCurrentLiabilities() {
    return fcurNonCurrentLiabilities;
  }
  public void set_fcurNonCurrentLiabilities(java.math.BigDecimal fcurNonCurrentLiabilities) {
    this.fcurNonCurrentLiabilities = fcurNonCurrentLiabilities;
  }
  public tblnz_rtnfinancialstatements with_fcurNonCurrentLiabilities(java.math.BigDecimal fcurNonCurrentLiabilities) {
    this.fcurNonCurrentLiabilities = fcurNonCurrentLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurFinalTotalLiabilities;
  public java.math.BigDecimal get_fcurFinalTotalLiabilities() {
    return fcurFinalTotalLiabilities;
  }
  public void set_fcurFinalTotalLiabilities(java.math.BigDecimal fcurFinalTotalLiabilities) {
    this.fcurFinalTotalLiabilities = fcurFinalTotalLiabilities;
  }
  public tblnz_rtnfinancialstatements with_fcurFinalTotalLiabilities(java.math.BigDecimal fcurFinalTotalLiabilities) {
    this.fcurFinalTotalLiabilities = fcurFinalTotalLiabilities;
    return this;
  }
  private java.math.BigDecimal fcurOwnersEquity;
  public java.math.BigDecimal get_fcurOwnersEquity() {
    return fcurOwnersEquity;
  }
  public void set_fcurOwnersEquity(java.math.BigDecimal fcurOwnersEquity) {
    this.fcurOwnersEquity = fcurOwnersEquity;
  }
  public tblnz_rtnfinancialstatements with_fcurOwnersEquity(java.math.BigDecimal fcurOwnersEquity) {
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
  public tblnz_rtnfinancialstatements with_fcurTaxDepreciation(java.math.BigDecimal fcurTaxDepreciation) {
    this.fcurTaxDepreciation = fcurTaxDepreciation;
    return this;
  }
  private java.math.BigDecimal fcurUntaxedGains;
  public java.math.BigDecimal get_fcurUntaxedGains() {
    return fcurUntaxedGains;
  }
  public void set_fcurUntaxedGains(java.math.BigDecimal fcurUntaxedGains) {
    this.fcurUntaxedGains = fcurUntaxedGains;
  }
  public tblnz_rtnfinancialstatements with_fcurUntaxedGains(java.math.BigDecimal fcurUntaxedGains) {
    this.fcurUntaxedGains = fcurUntaxedGains;
    return this;
  }
  private java.math.BigDecimal fcurAdditionFixedAssets;
  public java.math.BigDecimal get_fcurAdditionFixedAssets() {
    return fcurAdditionFixedAssets;
  }
  public void set_fcurAdditionFixedAssets(java.math.BigDecimal fcurAdditionFixedAssets) {
    this.fcurAdditionFixedAssets = fcurAdditionFixedAssets;
  }
  public tblnz_rtnfinancialstatements with_fcurAdditionFixedAssets(java.math.BigDecimal fcurAdditionFixedAssets) {
    this.fcurAdditionFixedAssets = fcurAdditionFixedAssets;
    return this;
  }
  private java.math.BigDecimal fcurDisposalsFixedAssets;
  public java.math.BigDecimal get_fcurDisposalsFixedAssets() {
    return fcurDisposalsFixedAssets;
  }
  public void set_fcurDisposalsFixedAssets(java.math.BigDecimal fcurDisposalsFixedAssets) {
    this.fcurDisposalsFixedAssets = fcurDisposalsFixedAssets;
  }
  public tblnz_rtnfinancialstatements with_fcurDisposalsFixedAssets(java.math.BigDecimal fcurDisposalsFixedAssets) {
    this.fcurDisposalsFixedAssets = fcurDisposalsFixedAssets;
    return this;
  }
  private java.math.BigDecimal fcurDividendsPaid;
  public java.math.BigDecimal get_fcurDividendsPaid() {
    return fcurDividendsPaid;
  }
  public void set_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
    this.fcurDividendsPaid = fcurDividendsPaid;
  }
  public tblnz_rtnfinancialstatements with_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
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
  public tblnz_rtnfinancialstatements with_fcurDrawings(java.math.BigDecimal fcurDrawings) {
    this.fcurDrawings = fcurDrawings;
    return this;
  }
  private java.math.BigDecimal fcurCurrentAccountBalances;
  public java.math.BigDecimal get_fcurCurrentAccountBalances() {
    return fcurCurrentAccountBalances;
  }
  public void set_fcurCurrentAccountBalances(java.math.BigDecimal fcurCurrentAccountBalances) {
    this.fcurCurrentAccountBalances = fcurCurrentAccountBalances;
  }
  public tblnz_rtnfinancialstatements with_fcurCurrentAccountBalances(java.math.BigDecimal fcurCurrentAccountBalances) {
    this.fcurCurrentAccountBalances = fcurCurrentAccountBalances;
    return this;
  }
  private java.math.BigDecimal fcurTaxDeductibleLoss;
  public java.math.BigDecimal get_fcurTaxDeductibleLoss() {
    return fcurTaxDeductibleLoss;
  }
  public void set_fcurTaxDeductibleLoss(java.math.BigDecimal fcurTaxDeductibleLoss) {
    this.fcurTaxDeductibleLoss = fcurTaxDeductibleLoss;
  }
  public tblnz_rtnfinancialstatements with_fcurTaxDeductibleLoss(java.math.BigDecimal fcurTaxDeductibleLoss) {
    this.fcurTaxDeductibleLoss = fcurTaxDeductibleLoss;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnfinancialstatements with_fstrWho(String fstrWho) {
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
  public tblnz_rtnfinancialstatements with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfinancialstatements)) {
      return false;
    }
    tblnz_rtnfinancialstatements that = (tblnz_rtnfinancialstatements) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnMultipleActivity == null ? that.fblnMultipleActivity == null : this.fblnMultipleActivity.equals(that.fblnMultipleActivity));
    equal = equal && (this.fcurGrossSales == null ? that.fcurGrossSales == null : this.fcurGrossSales.equals(that.fcurGrossSales));
    equal = equal && (this.fcurGoodsOpeningStock == null ? that.fcurGoodsOpeningStock == null : this.fcurGoodsOpeningStock.equals(that.fcurGoodsOpeningStock));
    equal = equal && (this.fcurGoodsPurchases == null ? that.fcurGoodsPurchases == null : this.fcurGoodsPurchases.equals(that.fcurGoodsPurchases));
    equal = equal && (this.fcurGoodsClosingStock == null ? that.fcurGoodsClosingStock == null : this.fcurGoodsClosingStock.equals(that.fcurGoodsClosingStock));
    equal = equal && (this.fcurGrossProfit == null ? that.fcurGrossProfit == null : this.fcurGrossProfit.equals(that.fcurGrossProfit));
    equal = equal && (this.fcurOtherGrossInterest == null ? that.fcurOtherGrossInterest == null : this.fcurOtherGrossInterest.equals(that.fcurOtherGrossInterest));
    equal = equal && (this.fcurOtherGrossDividends == null ? that.fcurOtherGrossDividends == null : this.fcurOtherGrossDividends.equals(that.fcurOtherGrossDividends));
    equal = equal && (this.fcurOtherRental == null ? that.fcurOtherRental == null : this.fcurOtherRental.equals(that.fcurOtherRental));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurBadDebt == null ? that.fcurBadDebt == null : this.fcurBadDebt.equals(that.fcurBadDebt));
    equal = equal && (this.fcurAccountingDepreciation == null ? that.fcurAccountingDepreciation == null : this.fcurAccountingDepreciation.equals(that.fcurAccountingDepreciation));
    equal = equal && (this.fcurInsurance == null ? that.fcurInsurance == null : this.fcurInsurance.equals(that.fcurInsurance));
    equal = equal && (this.fcurInterestExpense == null ? that.fcurInterestExpense == null : this.fcurInterestExpense.equals(that.fcurInterestExpense));
    equal = equal && (this.fcurProfessionalFees == null ? that.fcurProfessionalFees == null : this.fcurProfessionalFees.equals(that.fcurProfessionalFees));
    equal = equal && (this.fcurRates == null ? that.fcurRates == null : this.fcurRates.equals(that.fcurRates));
    equal = equal && (this.fcurRentalPayments == null ? that.fcurRentalPayments == null : this.fcurRentalPayments.equals(that.fcurRentalPayments));
    equal = equal && (this.fcurRepairsMaintenance == null ? that.fcurRepairsMaintenance == null : this.fcurRepairsMaintenance.equals(that.fcurRepairsMaintenance));
    equal = equal && (this.fcurResearchDevelopment == null ? that.fcurResearchDevelopment == null : this.fcurResearchDevelopment.equals(that.fcurResearchDevelopment));
    equal = equal && (this.fcurAssociatedRemuneration == null ? that.fcurAssociatedRemuneration == null : this.fcurAssociatedRemuneration.equals(that.fcurAssociatedRemuneration));
    equal = equal && (this.fcurEmployeeSalary == null ? that.fcurEmployeeSalary == null : this.fcurEmployeeSalary.equals(that.fcurEmployeeSalary));
    equal = equal && (this.fcurContractorPayments == null ? that.fcurContractorPayments == null : this.fcurContractorPayments.equals(that.fcurContractorPayments));
    equal = equal && (this.fcurOtherExpenses == null ? that.fcurOtherExpenses == null : this.fcurOtherExpenses.equals(that.fcurOtherExpenses));
    equal = equal && (this.fcurTotalExpenses == null ? that.fcurTotalExpenses == null : this.fcurTotalExpenses.equals(that.fcurTotalExpenses));
    equal = equal && (this.fcurExceptionalItems == null ? that.fcurExceptionalItems == null : this.fcurExceptionalItems.equals(that.fcurExceptionalItems));
    equal = equal && (this.fcurNetProfitBeforeTax == null ? that.fcurNetProfitBeforeTax == null : this.fcurNetProfitBeforeTax.equals(that.fcurNetProfitBeforeTax));
    equal = equal && (this.fcurTaxAdjustments == null ? that.fcurTaxAdjustments == null : this.fcurTaxAdjustments.equals(that.fcurTaxAdjustments));
    equal = equal && (this.fcurCurrentTaxableProfit == null ? that.fcurCurrentTaxableProfit == null : this.fcurCurrentTaxableProfit.equals(that.fcurCurrentTaxableProfit));
    equal = equal && (this.fcurAccountsReceivable == null ? that.fcurAccountsReceivable == null : this.fcurAccountsReceivable.equals(that.fcurAccountsReceivable));
    equal = equal && (this.fcurCashDeposits == null ? that.fcurCashDeposits == null : this.fcurCashDeposits.equals(that.fcurCashDeposits));
    equal = equal && (this.fcurOtherAssets == null ? that.fcurOtherAssets == null : this.fcurOtherAssets.equals(that.fcurOtherAssets));
    equal = equal && (this.fcurVehicles == null ? that.fcurVehicles == null : this.fcurVehicles.equals(that.fcurVehicles));
    equal = equal && (this.fcurPlantMachinery == null ? that.fcurPlantMachinery == null : this.fcurPlantMachinery.equals(that.fcurPlantMachinery));
    equal = equal && (this.fcurFurnitureFittings == null ? that.fcurFurnitureFittings == null : this.fcurFurnitureFittings.equals(that.fcurFurnitureFittings));
    equal = equal && (this.fcurLand == null ? that.fcurLand == null : this.fcurLand.equals(that.fcurLand));
    equal = equal && (this.fcurBuildings == null ? that.fcurBuildings == null : this.fcurBuildings.equals(that.fcurBuildings));
    equal = equal && (this.fcurOtherFixedAssets == null ? that.fcurOtherFixedAssets == null : this.fcurOtherFixedAssets.equals(that.fcurOtherFixedAssets));
    equal = equal && (this.fcurIntangibles == null ? that.fcurIntangibles == null : this.fcurIntangibles.equals(that.fcurIntangibles));
    equal = equal && (this.fcurSharesInterests == null ? that.fcurSharesInterests == null : this.fcurSharesInterests.equals(that.fcurSharesInterests));
    equal = equal && (this.fcurTermDeposits == null ? that.fcurTermDeposits == null : this.fcurTermDeposits.equals(that.fcurTermDeposits));
    equal = equal && (this.fcurNonCurrentAssets == null ? that.fcurNonCurrentAssets == null : this.fcurNonCurrentAssets.equals(that.fcurNonCurrentAssets));
    equal = equal && (this.fcurTotalAssets == null ? that.fcurTotalAssets == null : this.fcurTotalAssets.equals(that.fcurTotalAssets));
    equal = equal && (this.fcurProvisions == null ? that.fcurProvisions == null : this.fcurProvisions.equals(that.fcurProvisions));
    equal = equal && (this.fcurAccountsPayable == null ? that.fcurAccountsPayable == null : this.fcurAccountsPayable.equals(that.fcurAccountsPayable));
    equal = equal && (this.fcurCurrentLoan == null ? that.fcurCurrentLoan == null : this.fcurCurrentLoan.equals(that.fcurCurrentLoan));
    equal = equal && (this.fcurOtherCurrentLiabilities == null ? that.fcurOtherCurrentLiabilities == null : this.fcurOtherCurrentLiabilities.equals(that.fcurOtherCurrentLiabilities));
    equal = equal && (this.fcurTotalCurrentLiabilities == null ? that.fcurTotalCurrentLiabilities == null : this.fcurTotalCurrentLiabilities.equals(that.fcurTotalCurrentLiabilities));
    equal = equal && (this.fcurNonCurrentLiabilities == null ? that.fcurNonCurrentLiabilities == null : this.fcurNonCurrentLiabilities.equals(that.fcurNonCurrentLiabilities));
    equal = equal && (this.fcurFinalTotalLiabilities == null ? that.fcurFinalTotalLiabilities == null : this.fcurFinalTotalLiabilities.equals(that.fcurFinalTotalLiabilities));
    equal = equal && (this.fcurOwnersEquity == null ? that.fcurOwnersEquity == null : this.fcurOwnersEquity.equals(that.fcurOwnersEquity));
    equal = equal && (this.fcurTaxDepreciation == null ? that.fcurTaxDepreciation == null : this.fcurTaxDepreciation.equals(that.fcurTaxDepreciation));
    equal = equal && (this.fcurUntaxedGains == null ? that.fcurUntaxedGains == null : this.fcurUntaxedGains.equals(that.fcurUntaxedGains));
    equal = equal && (this.fcurAdditionFixedAssets == null ? that.fcurAdditionFixedAssets == null : this.fcurAdditionFixedAssets.equals(that.fcurAdditionFixedAssets));
    equal = equal && (this.fcurDisposalsFixedAssets == null ? that.fcurDisposalsFixedAssets == null : this.fcurDisposalsFixedAssets.equals(that.fcurDisposalsFixedAssets));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDrawings == null ? that.fcurDrawings == null : this.fcurDrawings.equals(that.fcurDrawings));
    equal = equal && (this.fcurCurrentAccountBalances == null ? that.fcurCurrentAccountBalances == null : this.fcurCurrentAccountBalances.equals(that.fcurCurrentAccountBalances));
    equal = equal && (this.fcurTaxDeductibleLoss == null ? that.fcurTaxDeductibleLoss == null : this.fcurTaxDeductibleLoss.equals(that.fcurTaxDeductibleLoss));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfinancialstatements)) {
      return false;
    }
    tblnz_rtnfinancialstatements that = (tblnz_rtnfinancialstatements) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnMultipleActivity == null ? that.fblnMultipleActivity == null : this.fblnMultipleActivity.equals(that.fblnMultipleActivity));
    equal = equal && (this.fcurGrossSales == null ? that.fcurGrossSales == null : this.fcurGrossSales.equals(that.fcurGrossSales));
    equal = equal && (this.fcurGoodsOpeningStock == null ? that.fcurGoodsOpeningStock == null : this.fcurGoodsOpeningStock.equals(that.fcurGoodsOpeningStock));
    equal = equal && (this.fcurGoodsPurchases == null ? that.fcurGoodsPurchases == null : this.fcurGoodsPurchases.equals(that.fcurGoodsPurchases));
    equal = equal && (this.fcurGoodsClosingStock == null ? that.fcurGoodsClosingStock == null : this.fcurGoodsClosingStock.equals(that.fcurGoodsClosingStock));
    equal = equal && (this.fcurGrossProfit == null ? that.fcurGrossProfit == null : this.fcurGrossProfit.equals(that.fcurGrossProfit));
    equal = equal && (this.fcurOtherGrossInterest == null ? that.fcurOtherGrossInterest == null : this.fcurOtherGrossInterest.equals(that.fcurOtherGrossInterest));
    equal = equal && (this.fcurOtherGrossDividends == null ? that.fcurOtherGrossDividends == null : this.fcurOtherGrossDividends.equals(that.fcurOtherGrossDividends));
    equal = equal && (this.fcurOtherRental == null ? that.fcurOtherRental == null : this.fcurOtherRental.equals(that.fcurOtherRental));
    equal = equal && (this.fcurOtherIncome == null ? that.fcurOtherIncome == null : this.fcurOtherIncome.equals(that.fcurOtherIncome));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurBadDebt == null ? that.fcurBadDebt == null : this.fcurBadDebt.equals(that.fcurBadDebt));
    equal = equal && (this.fcurAccountingDepreciation == null ? that.fcurAccountingDepreciation == null : this.fcurAccountingDepreciation.equals(that.fcurAccountingDepreciation));
    equal = equal && (this.fcurInsurance == null ? that.fcurInsurance == null : this.fcurInsurance.equals(that.fcurInsurance));
    equal = equal && (this.fcurInterestExpense == null ? that.fcurInterestExpense == null : this.fcurInterestExpense.equals(that.fcurInterestExpense));
    equal = equal && (this.fcurProfessionalFees == null ? that.fcurProfessionalFees == null : this.fcurProfessionalFees.equals(that.fcurProfessionalFees));
    equal = equal && (this.fcurRates == null ? that.fcurRates == null : this.fcurRates.equals(that.fcurRates));
    equal = equal && (this.fcurRentalPayments == null ? that.fcurRentalPayments == null : this.fcurRentalPayments.equals(that.fcurRentalPayments));
    equal = equal && (this.fcurRepairsMaintenance == null ? that.fcurRepairsMaintenance == null : this.fcurRepairsMaintenance.equals(that.fcurRepairsMaintenance));
    equal = equal && (this.fcurResearchDevelopment == null ? that.fcurResearchDevelopment == null : this.fcurResearchDevelopment.equals(that.fcurResearchDevelopment));
    equal = equal && (this.fcurAssociatedRemuneration == null ? that.fcurAssociatedRemuneration == null : this.fcurAssociatedRemuneration.equals(that.fcurAssociatedRemuneration));
    equal = equal && (this.fcurEmployeeSalary == null ? that.fcurEmployeeSalary == null : this.fcurEmployeeSalary.equals(that.fcurEmployeeSalary));
    equal = equal && (this.fcurContractorPayments == null ? that.fcurContractorPayments == null : this.fcurContractorPayments.equals(that.fcurContractorPayments));
    equal = equal && (this.fcurOtherExpenses == null ? that.fcurOtherExpenses == null : this.fcurOtherExpenses.equals(that.fcurOtherExpenses));
    equal = equal && (this.fcurTotalExpenses == null ? that.fcurTotalExpenses == null : this.fcurTotalExpenses.equals(that.fcurTotalExpenses));
    equal = equal && (this.fcurExceptionalItems == null ? that.fcurExceptionalItems == null : this.fcurExceptionalItems.equals(that.fcurExceptionalItems));
    equal = equal && (this.fcurNetProfitBeforeTax == null ? that.fcurNetProfitBeforeTax == null : this.fcurNetProfitBeforeTax.equals(that.fcurNetProfitBeforeTax));
    equal = equal && (this.fcurTaxAdjustments == null ? that.fcurTaxAdjustments == null : this.fcurTaxAdjustments.equals(that.fcurTaxAdjustments));
    equal = equal && (this.fcurCurrentTaxableProfit == null ? that.fcurCurrentTaxableProfit == null : this.fcurCurrentTaxableProfit.equals(that.fcurCurrentTaxableProfit));
    equal = equal && (this.fcurAccountsReceivable == null ? that.fcurAccountsReceivable == null : this.fcurAccountsReceivable.equals(that.fcurAccountsReceivable));
    equal = equal && (this.fcurCashDeposits == null ? that.fcurCashDeposits == null : this.fcurCashDeposits.equals(that.fcurCashDeposits));
    equal = equal && (this.fcurOtherAssets == null ? that.fcurOtherAssets == null : this.fcurOtherAssets.equals(that.fcurOtherAssets));
    equal = equal && (this.fcurVehicles == null ? that.fcurVehicles == null : this.fcurVehicles.equals(that.fcurVehicles));
    equal = equal && (this.fcurPlantMachinery == null ? that.fcurPlantMachinery == null : this.fcurPlantMachinery.equals(that.fcurPlantMachinery));
    equal = equal && (this.fcurFurnitureFittings == null ? that.fcurFurnitureFittings == null : this.fcurFurnitureFittings.equals(that.fcurFurnitureFittings));
    equal = equal && (this.fcurLand == null ? that.fcurLand == null : this.fcurLand.equals(that.fcurLand));
    equal = equal && (this.fcurBuildings == null ? that.fcurBuildings == null : this.fcurBuildings.equals(that.fcurBuildings));
    equal = equal && (this.fcurOtherFixedAssets == null ? that.fcurOtherFixedAssets == null : this.fcurOtherFixedAssets.equals(that.fcurOtherFixedAssets));
    equal = equal && (this.fcurIntangibles == null ? that.fcurIntangibles == null : this.fcurIntangibles.equals(that.fcurIntangibles));
    equal = equal && (this.fcurSharesInterests == null ? that.fcurSharesInterests == null : this.fcurSharesInterests.equals(that.fcurSharesInterests));
    equal = equal && (this.fcurTermDeposits == null ? that.fcurTermDeposits == null : this.fcurTermDeposits.equals(that.fcurTermDeposits));
    equal = equal && (this.fcurNonCurrentAssets == null ? that.fcurNonCurrentAssets == null : this.fcurNonCurrentAssets.equals(that.fcurNonCurrentAssets));
    equal = equal && (this.fcurTotalAssets == null ? that.fcurTotalAssets == null : this.fcurTotalAssets.equals(that.fcurTotalAssets));
    equal = equal && (this.fcurProvisions == null ? that.fcurProvisions == null : this.fcurProvisions.equals(that.fcurProvisions));
    equal = equal && (this.fcurAccountsPayable == null ? that.fcurAccountsPayable == null : this.fcurAccountsPayable.equals(that.fcurAccountsPayable));
    equal = equal && (this.fcurCurrentLoan == null ? that.fcurCurrentLoan == null : this.fcurCurrentLoan.equals(that.fcurCurrentLoan));
    equal = equal && (this.fcurOtherCurrentLiabilities == null ? that.fcurOtherCurrentLiabilities == null : this.fcurOtherCurrentLiabilities.equals(that.fcurOtherCurrentLiabilities));
    equal = equal && (this.fcurTotalCurrentLiabilities == null ? that.fcurTotalCurrentLiabilities == null : this.fcurTotalCurrentLiabilities.equals(that.fcurTotalCurrentLiabilities));
    equal = equal && (this.fcurNonCurrentLiabilities == null ? that.fcurNonCurrentLiabilities == null : this.fcurNonCurrentLiabilities.equals(that.fcurNonCurrentLiabilities));
    equal = equal && (this.fcurFinalTotalLiabilities == null ? that.fcurFinalTotalLiabilities == null : this.fcurFinalTotalLiabilities.equals(that.fcurFinalTotalLiabilities));
    equal = equal && (this.fcurOwnersEquity == null ? that.fcurOwnersEquity == null : this.fcurOwnersEquity.equals(that.fcurOwnersEquity));
    equal = equal && (this.fcurTaxDepreciation == null ? that.fcurTaxDepreciation == null : this.fcurTaxDepreciation.equals(that.fcurTaxDepreciation));
    equal = equal && (this.fcurUntaxedGains == null ? that.fcurUntaxedGains == null : this.fcurUntaxedGains.equals(that.fcurUntaxedGains));
    equal = equal && (this.fcurAdditionFixedAssets == null ? that.fcurAdditionFixedAssets == null : this.fcurAdditionFixedAssets.equals(that.fcurAdditionFixedAssets));
    equal = equal && (this.fcurDisposalsFixedAssets == null ? that.fcurDisposalsFixedAssets == null : this.fcurDisposalsFixedAssets.equals(that.fcurDisposalsFixedAssets));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDrawings == null ? that.fcurDrawings == null : this.fcurDrawings.equals(that.fcurDrawings));
    equal = equal && (this.fcurCurrentAccountBalances == null ? that.fcurCurrentAccountBalances == null : this.fcurCurrentAccountBalances.equals(that.fcurCurrentAccountBalances));
    equal = equal && (this.fcurTaxDeductibleLoss == null ? that.fcurTaxDeductibleLoss == null : this.fcurTaxDeductibleLoss.equals(that.fcurTaxDeductibleLoss));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnMultipleActivity = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurGrossSales = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGoodsOpeningStock = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGoodsPurchases = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGoodsClosingStock = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurGrossProfit = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurOtherGrossInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOtherGrossDividends = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurOtherRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBadDebt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAccountingDepreciation = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInsurance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestExpense = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurProfessionalFees = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurRates = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRentalPayments = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRepairsMaintenance = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurResearchDevelopment = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurAssociatedRemuneration = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurEmployeeSalary = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurContractorPayments = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOtherExpenses = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalExpenses = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExceptionalItems = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetProfitBeforeTax = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTaxAdjustments = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurCurrentTaxableProfit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurAccountsReceivable = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurCashDeposits = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurOtherAssets = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurVehicles = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurPlantMachinery = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurFurnitureFittings = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurLand = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurBuildings = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurOtherFixedAssets = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurIntangibles = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurSharesInterests = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurTermDeposits = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurNonCurrentAssets = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTotalAssets = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurProvisions = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurAccountsPayable = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurCurrentLoan = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurOtherCurrentLiabilities = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurTotalCurrentLiabilities = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurNonCurrentLiabilities = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurFinalTotalLiabilities = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurOwnersEquity = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurTaxDepreciation = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurUntaxedGains = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurAdditionFixedAssets = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurDisposalsFixedAssets = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurDrawings = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurCurrentAccountBalances = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTaxDeductibleLoss = JdbcWritableBridge.readBigDecimal(60, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(61, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(62, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnMultipleActivity = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurGrossSales = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurGoodsOpeningStock = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurGoodsPurchases = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurGoodsClosingStock = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurGrossProfit = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurOtherGrossInterest = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOtherGrossDividends = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurOtherRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOtherIncome = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBadDebt = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAccountingDepreciation = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInsurance = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestExpense = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurProfessionalFees = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurRates = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRentalPayments = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRepairsMaintenance = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurResearchDevelopment = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurAssociatedRemuneration = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurEmployeeSalary = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurContractorPayments = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOtherExpenses = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurTotalExpenses = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurExceptionalItems = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurNetProfitBeforeTax = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurTaxAdjustments = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurCurrentTaxableProfit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurAccountsReceivable = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurCashDeposits = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurOtherAssets = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurVehicles = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurPlantMachinery = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fcurFurnitureFittings = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.fcurLand = JdbcWritableBridge.readBigDecimal(37, __dbResults);
    this.fcurBuildings = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.fcurOtherFixedAssets = JdbcWritableBridge.readBigDecimal(39, __dbResults);
    this.fcurIntangibles = JdbcWritableBridge.readBigDecimal(40, __dbResults);
    this.fcurSharesInterests = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.fcurTermDeposits = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.fcurNonCurrentAssets = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.fcurTotalAssets = JdbcWritableBridge.readBigDecimal(44, __dbResults);
    this.fcurProvisions = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fcurAccountsPayable = JdbcWritableBridge.readBigDecimal(46, __dbResults);
    this.fcurCurrentLoan = JdbcWritableBridge.readBigDecimal(47, __dbResults);
    this.fcurOtherCurrentLiabilities = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.fcurTotalCurrentLiabilities = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.fcurNonCurrentLiabilities = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.fcurFinalTotalLiabilities = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.fcurOwnersEquity = JdbcWritableBridge.readBigDecimal(52, __dbResults);
    this.fcurTaxDepreciation = JdbcWritableBridge.readBigDecimal(53, __dbResults);
    this.fcurUntaxedGains = JdbcWritableBridge.readBigDecimal(54, __dbResults);
    this.fcurAdditionFixedAssets = JdbcWritableBridge.readBigDecimal(55, __dbResults);
    this.fcurDisposalsFixedAssets = JdbcWritableBridge.readBigDecimal(56, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(57, __dbResults);
    this.fcurDrawings = JdbcWritableBridge.readBigDecimal(58, __dbResults);
    this.fcurCurrentAccountBalances = JdbcWritableBridge.readBigDecimal(59, __dbResults);
    this.fcurTaxDeductibleLoss = JdbcWritableBridge.readBigDecimal(60, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnMultipleActivity, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossSales, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsOpeningStock, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsPurchases, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsClosingStock, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossProfit, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGrossInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGrossDividends, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBadDebt, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountingDepreciation, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInsurance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestExpense, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProfessionalFees, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRates, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalPayments, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRepairsMaintenance, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResearchDevelopment, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAssociatedRemuneration, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployeeSalary, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContractorPayments, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherExpenses, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalExpenses, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExceptionalItems, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitBeforeTax, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAdjustments, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentTaxableProfit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivable, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCashDeposits, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherAssets, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVehicles, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlantMachinery, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurnitureFittings, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLand, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildings, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherFixedAssets, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntangibles, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesInterests, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTermDeposits, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentAssets, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAssets, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisions, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayable, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentLoan, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentLiabilities, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCurrentLiabilities, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentLiabilities, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFinalTotalLiabilities, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnersEquity, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciation, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUntaxedGains, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdditionFixedAssets, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposalsFixedAssets, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDrawings, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentAccountBalances, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeductibleLoss, 60 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 62 + __off, 93, __dbStmt);
    return 62;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleActivity, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossSales, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsOpeningStock, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsPurchases, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGoodsClosingStock, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossProfit, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGrossInterest, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGrossDividends, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherIncome, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBadDebt, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountingDepreciation, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInsurance, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestExpense, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProfessionalFees, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRates, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalPayments, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRepairsMaintenance, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResearchDevelopment, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAssociatedRemuneration, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEmployeeSalary, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContractorPayments, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherExpenses, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalExpenses, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExceptionalItems, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitBeforeTax, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAdjustments, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentTaxableProfit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsReceivable, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCashDeposits, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherAssets, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurVehicles, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPlantMachinery, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurnitureFittings, 36 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLand, 37 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBuildings, 38 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherFixedAssets, 39 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntangibles, 40 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSharesInterests, 41 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTermDeposits, 42 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentAssets, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAssets, 44 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurProvisions, 45 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountsPayable, 46 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentLoan, 47 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherCurrentLiabilities, 48 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCurrentLiabilities, 49 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonCurrentLiabilities, 50 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFinalTotalLiabilities, 51 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnersEquity, 52 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDepreciation, 53 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUntaxedGains, 54 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAdditionFixedAssets, 55 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisposalsFixedAssets, 56 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 57 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDrawings, 58 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCurrentAccountBalances, 59 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDeductibleLoss, 60 + __off, 3, __dbStmt);
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
        this.fblnMultipleActivity = null;
    } else {
    this.fblnMultipleActivity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossSales = null;
    } else {
    this.fcurGrossSales = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGoodsOpeningStock = null;
    } else {
    this.fcurGoodsOpeningStock = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGoodsPurchases = null;
    } else {
    this.fcurGoodsPurchases = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGoodsClosingStock = null;
    } else {
    this.fcurGoodsClosingStock = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossProfit = null;
    } else {
    this.fcurGrossProfit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherGrossInterest = null;
    } else {
    this.fcurOtherGrossInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherGrossDividends = null;
    } else {
    this.fcurOtherGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherRental = null;
    } else {
    this.fcurOtherRental = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherIncome = null;
    } else {
    this.fcurOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBadDebt = null;
    } else {
    this.fcurBadDebt = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurRepairsMaintenance = null;
    } else {
    this.fcurRepairsMaintenance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResearchDevelopment = null;
    } else {
    this.fcurResearchDevelopment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAssociatedRemuneration = null;
    } else {
    this.fcurAssociatedRemuneration = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEmployeeSalary = null;
    } else {
    this.fcurEmployeeSalary = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurTotalExpenses = null;
    } else {
    this.fcurTotalExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExceptionalItems = null;
    } else {
    this.fcurExceptionalItems = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetProfitBeforeTax = null;
    } else {
    this.fcurNetProfitBeforeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAdjustments = null;
    } else {
    this.fcurTaxAdjustments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCurrentTaxableProfit = null;
    } else {
    this.fcurCurrentTaxableProfit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountsReceivable = null;
    } else {
    this.fcurAccountsReceivable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCashDeposits = null;
    } else {
    this.fcurCashDeposits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherAssets = null;
    } else {
    this.fcurOtherAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurVehicles = null;
    } else {
    this.fcurVehicles = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPlantMachinery = null;
    } else {
    this.fcurPlantMachinery = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFurnitureFittings = null;
    } else {
    this.fcurFurnitureFittings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurSharesInterests = null;
    } else {
    this.fcurSharesInterests = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTermDeposits = null;
    } else {
    this.fcurTermDeposits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonCurrentAssets = null;
    } else {
    this.fcurNonCurrentAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAssets = null;
    } else {
    this.fcurTotalAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurCurrentLoan = null;
    } else {
    this.fcurCurrentLoan = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherCurrentLiabilities = null;
    } else {
    this.fcurOtherCurrentLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalCurrentLiabilities = null;
    } else {
    this.fcurTotalCurrentLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonCurrentLiabilities = null;
    } else {
    this.fcurNonCurrentLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFinalTotalLiabilities = null;
    } else {
    this.fcurFinalTotalLiabilities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurUntaxedGains = null;
    } else {
    this.fcurUntaxedGains = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAdditionFixedAssets = null;
    } else {
    this.fcurAdditionFixedAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisposalsFixedAssets = null;
    } else {
    this.fcurDisposalsFixedAssets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
        this.fcurCurrentAccountBalances = null;
    } else {
    this.fcurCurrentAccountBalances = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDeductibleLoss = null;
    } else {
    this.fcurTaxDeductibleLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fblnMultipleActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleActivity);
    }
    if (null == this.fcurGrossSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossSales, __dataOut);
    }
    if (null == this.fcurGoodsOpeningStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsOpeningStock, __dataOut);
    }
    if (null == this.fcurGoodsPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsPurchases, __dataOut);
    }
    if (null == this.fcurGoodsClosingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsClosingStock, __dataOut);
    }
    if (null == this.fcurGrossProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossProfit, __dataOut);
    }
    if (null == this.fcurOtherGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGrossInterest, __dataOut);
    }
    if (null == this.fcurOtherGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGrossDividends, __dataOut);
    }
    if (null == this.fcurOtherRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherRental, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurBadDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBadDebt, __dataOut);
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
    if (null == this.fcurRepairsMaintenance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRepairsMaintenance, __dataOut);
    }
    if (null == this.fcurResearchDevelopment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResearchDevelopment, __dataOut);
    }
    if (null == this.fcurAssociatedRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAssociatedRemuneration, __dataOut);
    }
    if (null == this.fcurEmployeeSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployeeSalary, __dataOut);
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
    if (null == this.fcurTotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalExpenses, __dataOut);
    }
    if (null == this.fcurExceptionalItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExceptionalItems, __dataOut);
    }
    if (null == this.fcurNetProfitBeforeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitBeforeTax, __dataOut);
    }
    if (null == this.fcurTaxAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAdjustments, __dataOut);
    }
    if (null == this.fcurCurrentTaxableProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentTaxableProfit, __dataOut);
    }
    if (null == this.fcurAccountsReceivable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivable, __dataOut);
    }
    if (null == this.fcurCashDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCashDeposits, __dataOut);
    }
    if (null == this.fcurOtherAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherAssets, __dataOut);
    }
    if (null == this.fcurVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVehicles, __dataOut);
    }
    if (null == this.fcurPlantMachinery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlantMachinery, __dataOut);
    }
    if (null == this.fcurFurnitureFittings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurnitureFittings, __dataOut);
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
    if (null == this.fcurSharesInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesInterests, __dataOut);
    }
    if (null == this.fcurTermDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTermDeposits, __dataOut);
    }
    if (null == this.fcurNonCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentAssets, __dataOut);
    }
    if (null == this.fcurTotalAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAssets, __dataOut);
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
    if (null == this.fcurCurrentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentLoan, __dataOut);
    }
    if (null == this.fcurOtherCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurTotalCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurNonCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurFinalTotalLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFinalTotalLiabilities, __dataOut);
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
    if (null == this.fcurUntaxedGains) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUntaxedGains, __dataOut);
    }
    if (null == this.fcurAdditionFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdditionFixedAssets, __dataOut);
    }
    if (null == this.fcurDisposalsFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposalsFixedAssets, __dataOut);
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
    if (null == this.fcurCurrentAccountBalances) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentAccountBalances, __dataOut);
    }
    if (null == this.fcurTaxDeductibleLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeductibleLoss, __dataOut);
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
    if (null == this.fblnMultipleActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleActivity);
    }
    if (null == this.fcurGrossSales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossSales, __dataOut);
    }
    if (null == this.fcurGoodsOpeningStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsOpeningStock, __dataOut);
    }
    if (null == this.fcurGoodsPurchases) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsPurchases, __dataOut);
    }
    if (null == this.fcurGoodsClosingStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGoodsClosingStock, __dataOut);
    }
    if (null == this.fcurGrossProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossProfit, __dataOut);
    }
    if (null == this.fcurOtherGrossInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGrossInterest, __dataOut);
    }
    if (null == this.fcurOtherGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGrossDividends, __dataOut);
    }
    if (null == this.fcurOtherRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherRental, __dataOut);
    }
    if (null == this.fcurOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherIncome, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurBadDebt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBadDebt, __dataOut);
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
    if (null == this.fcurRepairsMaintenance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRepairsMaintenance, __dataOut);
    }
    if (null == this.fcurResearchDevelopment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResearchDevelopment, __dataOut);
    }
    if (null == this.fcurAssociatedRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAssociatedRemuneration, __dataOut);
    }
    if (null == this.fcurEmployeeSalary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEmployeeSalary, __dataOut);
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
    if (null == this.fcurTotalExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalExpenses, __dataOut);
    }
    if (null == this.fcurExceptionalItems) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExceptionalItems, __dataOut);
    }
    if (null == this.fcurNetProfitBeforeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitBeforeTax, __dataOut);
    }
    if (null == this.fcurTaxAdjustments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAdjustments, __dataOut);
    }
    if (null == this.fcurCurrentTaxableProfit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentTaxableProfit, __dataOut);
    }
    if (null == this.fcurAccountsReceivable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountsReceivable, __dataOut);
    }
    if (null == this.fcurCashDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCashDeposits, __dataOut);
    }
    if (null == this.fcurOtherAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherAssets, __dataOut);
    }
    if (null == this.fcurVehicles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurVehicles, __dataOut);
    }
    if (null == this.fcurPlantMachinery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPlantMachinery, __dataOut);
    }
    if (null == this.fcurFurnitureFittings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurnitureFittings, __dataOut);
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
    if (null == this.fcurSharesInterests) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSharesInterests, __dataOut);
    }
    if (null == this.fcurTermDeposits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTermDeposits, __dataOut);
    }
    if (null == this.fcurNonCurrentAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentAssets, __dataOut);
    }
    if (null == this.fcurTotalAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAssets, __dataOut);
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
    if (null == this.fcurCurrentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentLoan, __dataOut);
    }
    if (null == this.fcurOtherCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurTotalCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurNonCurrentLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonCurrentLiabilities, __dataOut);
    }
    if (null == this.fcurFinalTotalLiabilities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFinalTotalLiabilities, __dataOut);
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
    if (null == this.fcurUntaxedGains) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUntaxedGains, __dataOut);
    }
    if (null == this.fcurAdditionFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAdditionFixedAssets, __dataOut);
    }
    if (null == this.fcurDisposalsFixedAssets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisposalsFixedAssets, __dataOut);
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
    if (null == this.fcurCurrentAccountBalances) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCurrentAccountBalances, __dataOut);
    }
    if (null == this.fcurTaxDeductibleLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDeductibleLoss, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleActivity==null?"\\N":"" + fblnMultipleActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossSales==null?"\\N":fcurGrossSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsOpeningStock==null?"\\N":fcurGoodsOpeningStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsPurchases==null?"\\N":fcurGoodsPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsClosingStock==null?"\\N":fcurGoodsClosingStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossProfit==null?"\\N":fcurGrossProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGrossInterest==null?"\\N":fcurOtherGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGrossDividends==null?"\\N":fcurOtherGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherRental==null?"\\N":fcurOtherRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBadDebt==null?"\\N":fcurBadDebt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRepairsMaintenance==null?"\\N":fcurRepairsMaintenance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResearchDevelopment==null?"\\N":fcurResearchDevelopment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAssociatedRemuneration==null?"\\N":fcurAssociatedRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployeeSalary==null?"\\N":fcurEmployeeSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContractorPayments==null?"\\N":fcurContractorPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherExpenses==null?"\\N":fcurOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalExpenses==null?"\\N":fcurTotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExceptionalItems==null?"\\N":fcurExceptionalItems.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitBeforeTax==null?"\\N":fcurNetProfitBeforeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAdjustments==null?"\\N":fcurTaxAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentTaxableProfit==null?"\\N":fcurCurrentTaxableProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivable==null?"\\N":fcurAccountsReceivable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCashDeposits==null?"\\N":fcurCashDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherAssets==null?"\\N":fcurOtherAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVehicles==null?"\\N":fcurVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlantMachinery==null?"\\N":fcurPlantMachinery.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurnitureFittings==null?"\\N":fcurFurnitureFittings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLand==null?"\\N":fcurLand.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildings==null?"\\N":fcurBuildings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherFixedAssets==null?"\\N":fcurOtherFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntangibles==null?"\\N":fcurIntangibles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesInterests==null?"\\N":fcurSharesInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTermDeposits==null?"\\N":fcurTermDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentAssets==null?"\\N":fcurNonCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAssets==null?"\\N":fcurTotalAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisions==null?"\\N":fcurProvisions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayable==null?"\\N":fcurAccountsPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentLoan==null?"\\N":fcurCurrentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentLiabilities==null?"\\N":fcurOtherCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCurrentLiabilities==null?"\\N":fcurTotalCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentLiabilities==null?"\\N":fcurNonCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFinalTotalLiabilities==null?"\\N":fcurFinalTotalLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnersEquity==null?"\\N":fcurOwnersEquity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciation==null?"\\N":fcurTaxDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUntaxedGains==null?"\\N":fcurUntaxedGains.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdditionFixedAssets==null?"\\N":fcurAdditionFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposalsFixedAssets==null?"\\N":fcurDisposalsFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDrawings==null?"\\N":fcurDrawings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentAccountBalances==null?"\\N":fcurCurrentAccountBalances.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeductibleLoss==null?"\\N":fcurTaxDeductibleLoss.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleActivity==null?"\\N":"" + fblnMultipleActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossSales==null?"\\N":fcurGrossSales.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsOpeningStock==null?"\\N":fcurGoodsOpeningStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsPurchases==null?"\\N":fcurGoodsPurchases.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGoodsClosingStock==null?"\\N":fcurGoodsClosingStock.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossProfit==null?"\\N":fcurGrossProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGrossInterest==null?"\\N":fcurOtherGrossInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGrossDividends==null?"\\N":fcurOtherGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherRental==null?"\\N":fcurOtherRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherIncome==null?"\\N":fcurOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBadDebt==null?"\\N":fcurBadDebt.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRepairsMaintenance==null?"\\N":fcurRepairsMaintenance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResearchDevelopment==null?"\\N":fcurResearchDevelopment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAssociatedRemuneration==null?"\\N":fcurAssociatedRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEmployeeSalary==null?"\\N":fcurEmployeeSalary.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContractorPayments==null?"\\N":fcurContractorPayments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherExpenses==null?"\\N":fcurOtherExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalExpenses==null?"\\N":fcurTotalExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExceptionalItems==null?"\\N":fcurExceptionalItems.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitBeforeTax==null?"\\N":fcurNetProfitBeforeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAdjustments==null?"\\N":fcurTaxAdjustments.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentTaxableProfit==null?"\\N":fcurCurrentTaxableProfit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsReceivable==null?"\\N":fcurAccountsReceivable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCashDeposits==null?"\\N":fcurCashDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherAssets==null?"\\N":fcurOtherAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurVehicles==null?"\\N":fcurVehicles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPlantMachinery==null?"\\N":fcurPlantMachinery.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurnitureFittings==null?"\\N":fcurFurnitureFittings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLand==null?"\\N":fcurLand.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBuildings==null?"\\N":fcurBuildings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherFixedAssets==null?"\\N":fcurOtherFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntangibles==null?"\\N":fcurIntangibles.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSharesInterests==null?"\\N":fcurSharesInterests.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTermDeposits==null?"\\N":fcurTermDeposits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentAssets==null?"\\N":fcurNonCurrentAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAssets==null?"\\N":fcurTotalAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurProvisions==null?"\\N":fcurProvisions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountsPayable==null?"\\N":fcurAccountsPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentLoan==null?"\\N":fcurCurrentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherCurrentLiabilities==null?"\\N":fcurOtherCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCurrentLiabilities==null?"\\N":fcurTotalCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonCurrentLiabilities==null?"\\N":fcurNonCurrentLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFinalTotalLiabilities==null?"\\N":fcurFinalTotalLiabilities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnersEquity==null?"\\N":fcurOwnersEquity.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDepreciation==null?"\\N":fcurTaxDepreciation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUntaxedGains==null?"\\N":fcurUntaxedGains.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAdditionFixedAssets==null?"\\N":fcurAdditionFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisposalsFixedAssets==null?"\\N":fcurDisposalsFixedAssets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDrawings==null?"\\N":fcurDrawings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCurrentAccountBalances==null?"\\N":fcurCurrentAccountBalances.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDeductibleLoss==null?"\\N":fcurTaxDeductibleLoss.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleActivity = null; } else {
      this.fblnMultipleActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossSales = null; } else {
      this.fcurGrossSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsOpeningStock = null; } else {
      this.fcurGoodsOpeningStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsPurchases = null; } else {
      this.fcurGoodsPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsClosingStock = null; } else {
      this.fcurGoodsClosingStock = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGrossInterest = null; } else {
      this.fcurOtherGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGrossDividends = null; } else {
      this.fcurOtherGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherRental = null; } else {
      this.fcurOtherRental = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBadDebt = null; } else {
      this.fcurBadDebt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRepairsMaintenance = null; } else {
      this.fcurRepairsMaintenance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResearchDevelopment = null; } else {
      this.fcurResearchDevelopment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAssociatedRemuneration = null; } else {
      this.fcurAssociatedRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployeeSalary = null; } else {
      this.fcurEmployeeSalary = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalExpenses = null; } else {
      this.fcurTotalExpenses = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitBeforeTax = null; } else {
      this.fcurNetProfitBeforeTax = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentTaxableProfit = null; } else {
      this.fcurCurrentTaxableProfit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCashDeposits = null; } else {
      this.fcurCashDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherAssets = null; } else {
      this.fcurOtherAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlantMachinery = null; } else {
      this.fcurPlantMachinery = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurnitureFittings = null; } else {
      this.fcurFurnitureFittings = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesInterests = null; } else {
      this.fcurSharesInterests = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonCurrentAssets = null; } else {
      this.fcurNonCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAssets = null; } else {
      this.fcurTotalAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentLoan = null; } else {
      this.fcurCurrentLoan = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCurrentLiabilities = null; } else {
      this.fcurTotalCurrentLiabilities = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFinalTotalLiabilities = null; } else {
      this.fcurFinalTotalLiabilities = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUntaxedGains = null; } else {
      this.fcurUntaxedGains = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdditionFixedAssets = null; } else {
      this.fcurAdditionFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposalsFixedAssets = null; } else {
      this.fcurDisposalsFixedAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentAccountBalances = null; } else {
      this.fcurCurrentAccountBalances = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleActivity = null; } else {
      this.fblnMultipleActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossSales = null; } else {
      this.fcurGrossSales = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsOpeningStock = null; } else {
      this.fcurGoodsOpeningStock = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsPurchases = null; } else {
      this.fcurGoodsPurchases = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGoodsClosingStock = null; } else {
      this.fcurGoodsClosingStock = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGrossInterest = null; } else {
      this.fcurOtherGrossInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGrossDividends = null; } else {
      this.fcurOtherGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherRental = null; } else {
      this.fcurOtherRental = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBadDebt = null; } else {
      this.fcurBadDebt = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRepairsMaintenance = null; } else {
      this.fcurRepairsMaintenance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResearchDevelopment = null; } else {
      this.fcurResearchDevelopment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAssociatedRemuneration = null; } else {
      this.fcurAssociatedRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEmployeeSalary = null; } else {
      this.fcurEmployeeSalary = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalExpenses = null; } else {
      this.fcurTotalExpenses = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitBeforeTax = null; } else {
      this.fcurNetProfitBeforeTax = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentTaxableProfit = null; } else {
      this.fcurCurrentTaxableProfit = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCashDeposits = null; } else {
      this.fcurCashDeposits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherAssets = null; } else {
      this.fcurOtherAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPlantMachinery = null; } else {
      this.fcurPlantMachinery = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurnitureFittings = null; } else {
      this.fcurFurnitureFittings = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSharesInterests = null; } else {
      this.fcurSharesInterests = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonCurrentAssets = null; } else {
      this.fcurNonCurrentAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAssets = null; } else {
      this.fcurTotalAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentLoan = null; } else {
      this.fcurCurrentLoan = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCurrentLiabilities = null; } else {
      this.fcurTotalCurrentLiabilities = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFinalTotalLiabilities = null; } else {
      this.fcurFinalTotalLiabilities = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUntaxedGains = null; } else {
      this.fcurUntaxedGains = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAdditionFixedAssets = null; } else {
      this.fcurAdditionFixedAssets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisposalsFixedAssets = null; } else {
      this.fcurDisposalsFixedAssets = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCurrentAccountBalances = null; } else {
      this.fcurCurrentAccountBalances = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnfinancialstatements o = (tblnz_rtnfinancialstatements) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnfinancialstatements o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnMultipleActivity", this.fblnMultipleActivity);
    __sqoop$field_map.put("fcurGrossSales", this.fcurGrossSales);
    __sqoop$field_map.put("fcurGoodsOpeningStock", this.fcurGoodsOpeningStock);
    __sqoop$field_map.put("fcurGoodsPurchases", this.fcurGoodsPurchases);
    __sqoop$field_map.put("fcurGoodsClosingStock", this.fcurGoodsClosingStock);
    __sqoop$field_map.put("fcurGrossProfit", this.fcurGrossProfit);
    __sqoop$field_map.put("fcurOtherGrossInterest", this.fcurOtherGrossInterest);
    __sqoop$field_map.put("fcurOtherGrossDividends", this.fcurOtherGrossDividends);
    __sqoop$field_map.put("fcurOtherRental", this.fcurOtherRental);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurBadDebt", this.fcurBadDebt);
    __sqoop$field_map.put("fcurAccountingDepreciation", this.fcurAccountingDepreciation);
    __sqoop$field_map.put("fcurInsurance", this.fcurInsurance);
    __sqoop$field_map.put("fcurInterestExpense", this.fcurInterestExpense);
    __sqoop$field_map.put("fcurProfessionalFees", this.fcurProfessionalFees);
    __sqoop$field_map.put("fcurRates", this.fcurRates);
    __sqoop$field_map.put("fcurRentalPayments", this.fcurRentalPayments);
    __sqoop$field_map.put("fcurRepairsMaintenance", this.fcurRepairsMaintenance);
    __sqoop$field_map.put("fcurResearchDevelopment", this.fcurResearchDevelopment);
    __sqoop$field_map.put("fcurAssociatedRemuneration", this.fcurAssociatedRemuneration);
    __sqoop$field_map.put("fcurEmployeeSalary", this.fcurEmployeeSalary);
    __sqoop$field_map.put("fcurContractorPayments", this.fcurContractorPayments);
    __sqoop$field_map.put("fcurOtherExpenses", this.fcurOtherExpenses);
    __sqoop$field_map.put("fcurTotalExpenses", this.fcurTotalExpenses);
    __sqoop$field_map.put("fcurExceptionalItems", this.fcurExceptionalItems);
    __sqoop$field_map.put("fcurNetProfitBeforeTax", this.fcurNetProfitBeforeTax);
    __sqoop$field_map.put("fcurTaxAdjustments", this.fcurTaxAdjustments);
    __sqoop$field_map.put("fcurCurrentTaxableProfit", this.fcurCurrentTaxableProfit);
    __sqoop$field_map.put("fcurAccountsReceivable", this.fcurAccountsReceivable);
    __sqoop$field_map.put("fcurCashDeposits", this.fcurCashDeposits);
    __sqoop$field_map.put("fcurOtherAssets", this.fcurOtherAssets);
    __sqoop$field_map.put("fcurVehicles", this.fcurVehicles);
    __sqoop$field_map.put("fcurPlantMachinery", this.fcurPlantMachinery);
    __sqoop$field_map.put("fcurFurnitureFittings", this.fcurFurnitureFittings);
    __sqoop$field_map.put("fcurLand", this.fcurLand);
    __sqoop$field_map.put("fcurBuildings", this.fcurBuildings);
    __sqoop$field_map.put("fcurOtherFixedAssets", this.fcurOtherFixedAssets);
    __sqoop$field_map.put("fcurIntangibles", this.fcurIntangibles);
    __sqoop$field_map.put("fcurSharesInterests", this.fcurSharesInterests);
    __sqoop$field_map.put("fcurTermDeposits", this.fcurTermDeposits);
    __sqoop$field_map.put("fcurNonCurrentAssets", this.fcurNonCurrentAssets);
    __sqoop$field_map.put("fcurTotalAssets", this.fcurTotalAssets);
    __sqoop$field_map.put("fcurProvisions", this.fcurProvisions);
    __sqoop$field_map.put("fcurAccountsPayable", this.fcurAccountsPayable);
    __sqoop$field_map.put("fcurCurrentLoan", this.fcurCurrentLoan);
    __sqoop$field_map.put("fcurOtherCurrentLiabilities", this.fcurOtherCurrentLiabilities);
    __sqoop$field_map.put("fcurTotalCurrentLiabilities", this.fcurTotalCurrentLiabilities);
    __sqoop$field_map.put("fcurNonCurrentLiabilities", this.fcurNonCurrentLiabilities);
    __sqoop$field_map.put("fcurFinalTotalLiabilities", this.fcurFinalTotalLiabilities);
    __sqoop$field_map.put("fcurOwnersEquity", this.fcurOwnersEquity);
    __sqoop$field_map.put("fcurTaxDepreciation", this.fcurTaxDepreciation);
    __sqoop$field_map.put("fcurUntaxedGains", this.fcurUntaxedGains);
    __sqoop$field_map.put("fcurAdditionFixedAssets", this.fcurAdditionFixedAssets);
    __sqoop$field_map.put("fcurDisposalsFixedAssets", this.fcurDisposalsFixedAssets);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDrawings", this.fcurDrawings);
    __sqoop$field_map.put("fcurCurrentAccountBalances", this.fcurCurrentAccountBalances);
    __sqoop$field_map.put("fcurTaxDeductibleLoss", this.fcurTaxDeductibleLoss);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnMultipleActivity", this.fblnMultipleActivity);
    __sqoop$field_map.put("fcurGrossSales", this.fcurGrossSales);
    __sqoop$field_map.put("fcurGoodsOpeningStock", this.fcurGoodsOpeningStock);
    __sqoop$field_map.put("fcurGoodsPurchases", this.fcurGoodsPurchases);
    __sqoop$field_map.put("fcurGoodsClosingStock", this.fcurGoodsClosingStock);
    __sqoop$field_map.put("fcurGrossProfit", this.fcurGrossProfit);
    __sqoop$field_map.put("fcurOtherGrossInterest", this.fcurOtherGrossInterest);
    __sqoop$field_map.put("fcurOtherGrossDividends", this.fcurOtherGrossDividends);
    __sqoop$field_map.put("fcurOtherRental", this.fcurOtherRental);
    __sqoop$field_map.put("fcurOtherIncome", this.fcurOtherIncome);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurBadDebt", this.fcurBadDebt);
    __sqoop$field_map.put("fcurAccountingDepreciation", this.fcurAccountingDepreciation);
    __sqoop$field_map.put("fcurInsurance", this.fcurInsurance);
    __sqoop$field_map.put("fcurInterestExpense", this.fcurInterestExpense);
    __sqoop$field_map.put("fcurProfessionalFees", this.fcurProfessionalFees);
    __sqoop$field_map.put("fcurRates", this.fcurRates);
    __sqoop$field_map.put("fcurRentalPayments", this.fcurRentalPayments);
    __sqoop$field_map.put("fcurRepairsMaintenance", this.fcurRepairsMaintenance);
    __sqoop$field_map.put("fcurResearchDevelopment", this.fcurResearchDevelopment);
    __sqoop$field_map.put("fcurAssociatedRemuneration", this.fcurAssociatedRemuneration);
    __sqoop$field_map.put("fcurEmployeeSalary", this.fcurEmployeeSalary);
    __sqoop$field_map.put("fcurContractorPayments", this.fcurContractorPayments);
    __sqoop$field_map.put("fcurOtherExpenses", this.fcurOtherExpenses);
    __sqoop$field_map.put("fcurTotalExpenses", this.fcurTotalExpenses);
    __sqoop$field_map.put("fcurExceptionalItems", this.fcurExceptionalItems);
    __sqoop$field_map.put("fcurNetProfitBeforeTax", this.fcurNetProfitBeforeTax);
    __sqoop$field_map.put("fcurTaxAdjustments", this.fcurTaxAdjustments);
    __sqoop$field_map.put("fcurCurrentTaxableProfit", this.fcurCurrentTaxableProfit);
    __sqoop$field_map.put("fcurAccountsReceivable", this.fcurAccountsReceivable);
    __sqoop$field_map.put("fcurCashDeposits", this.fcurCashDeposits);
    __sqoop$field_map.put("fcurOtherAssets", this.fcurOtherAssets);
    __sqoop$field_map.put("fcurVehicles", this.fcurVehicles);
    __sqoop$field_map.put("fcurPlantMachinery", this.fcurPlantMachinery);
    __sqoop$field_map.put("fcurFurnitureFittings", this.fcurFurnitureFittings);
    __sqoop$field_map.put("fcurLand", this.fcurLand);
    __sqoop$field_map.put("fcurBuildings", this.fcurBuildings);
    __sqoop$field_map.put("fcurOtherFixedAssets", this.fcurOtherFixedAssets);
    __sqoop$field_map.put("fcurIntangibles", this.fcurIntangibles);
    __sqoop$field_map.put("fcurSharesInterests", this.fcurSharesInterests);
    __sqoop$field_map.put("fcurTermDeposits", this.fcurTermDeposits);
    __sqoop$field_map.put("fcurNonCurrentAssets", this.fcurNonCurrentAssets);
    __sqoop$field_map.put("fcurTotalAssets", this.fcurTotalAssets);
    __sqoop$field_map.put("fcurProvisions", this.fcurProvisions);
    __sqoop$field_map.put("fcurAccountsPayable", this.fcurAccountsPayable);
    __sqoop$field_map.put("fcurCurrentLoan", this.fcurCurrentLoan);
    __sqoop$field_map.put("fcurOtherCurrentLiabilities", this.fcurOtherCurrentLiabilities);
    __sqoop$field_map.put("fcurTotalCurrentLiabilities", this.fcurTotalCurrentLiabilities);
    __sqoop$field_map.put("fcurNonCurrentLiabilities", this.fcurNonCurrentLiabilities);
    __sqoop$field_map.put("fcurFinalTotalLiabilities", this.fcurFinalTotalLiabilities);
    __sqoop$field_map.put("fcurOwnersEquity", this.fcurOwnersEquity);
    __sqoop$field_map.put("fcurTaxDepreciation", this.fcurTaxDepreciation);
    __sqoop$field_map.put("fcurUntaxedGains", this.fcurUntaxedGains);
    __sqoop$field_map.put("fcurAdditionFixedAssets", this.fcurAdditionFixedAssets);
    __sqoop$field_map.put("fcurDisposalsFixedAssets", this.fcurDisposalsFixedAssets);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDrawings", this.fcurDrawings);
    __sqoop$field_map.put("fcurCurrentAccountBalances", this.fcurCurrentAccountBalances);
    __sqoop$field_map.put("fcurTaxDeductibleLoss", this.fcurTaxDeductibleLoss);
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
