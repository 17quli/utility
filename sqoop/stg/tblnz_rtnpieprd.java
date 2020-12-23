// ORM class for table 'tblnz_rtnpieprd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:03:28 NZDT 2020
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

public class tblnz_rtnpieprd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTotalInvestmentValue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTotalInvestmentValue = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGrossIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurGrossIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductibleExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurDeductibleExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurNetIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetLandIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurNetLandIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCombinedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurCombinedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFormationLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurFormationLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLandLossBroughtForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLandLossBroughtForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLandLossCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLandLossCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLandLossClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLandLossClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTotalLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeRetained", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeRetained = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeExitedInvestors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeExitedInvestors = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInvestorExpenses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurInvestorExpenses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalIncomeToAttribute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTotalIncomeToAttribute = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLossToAttribute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTotalLossToAttribute = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAttributedZero", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeAttributedZero = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossAttributedZero", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLossAttributedZero = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAttributedLow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeAttributedLow = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossAttributedLow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLossAttributedLow = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAttributedMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeAttributedMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossAttributedMid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLossAttributedMid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAttributedTop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeAttributedTop = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossAttributedTop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurLossAttributedTop = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaymentExitedInvestors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTaxPaymentExitedInvestors = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetTaxPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurNetTaxPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurForeignTaxCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurForeignTaxCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendWithholdingPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurDividendWithholdingPayment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurImputationCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidentWithholdingTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurResidentWithholdingTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAttributedNFI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurIncomeAttributedNFI = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxPaidNFI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fcurTaxPaidNFI = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnIncludeIncomeLossAprFeb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fblnIncludeIncomeLossAprFeb = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpieprd.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnpieprd() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnpieprd with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTotalInvestmentValue;
  public java.math.BigDecimal get_fcurTotalInvestmentValue() {
    return fcurTotalInvestmentValue;
  }
  public void set_fcurTotalInvestmentValue(java.math.BigDecimal fcurTotalInvestmentValue) {
    this.fcurTotalInvestmentValue = fcurTotalInvestmentValue;
  }
  public tblnz_rtnpieprd with_fcurTotalInvestmentValue(java.math.BigDecimal fcurTotalInvestmentValue) {
    this.fcurTotalInvestmentValue = fcurTotalInvestmentValue;
    return this;
  }
  private java.math.BigDecimal fcurGrossIncome;
  public java.math.BigDecimal get_fcurGrossIncome() {
    return fcurGrossIncome;
  }
  public void set_fcurGrossIncome(java.math.BigDecimal fcurGrossIncome) {
    this.fcurGrossIncome = fcurGrossIncome;
  }
  public tblnz_rtnpieprd with_fcurGrossIncome(java.math.BigDecimal fcurGrossIncome) {
    this.fcurGrossIncome = fcurGrossIncome;
    return this;
  }
  private java.math.BigDecimal fcurDeductibleExpenses;
  public java.math.BigDecimal get_fcurDeductibleExpenses() {
    return fcurDeductibleExpenses;
  }
  public void set_fcurDeductibleExpenses(java.math.BigDecimal fcurDeductibleExpenses) {
    this.fcurDeductibleExpenses = fcurDeductibleExpenses;
  }
  public tblnz_rtnpieprd with_fcurDeductibleExpenses(java.math.BigDecimal fcurDeductibleExpenses) {
    this.fcurDeductibleExpenses = fcurDeductibleExpenses;
    return this;
  }
  private java.math.BigDecimal fcurNetIncome;
  public java.math.BigDecimal get_fcurNetIncome() {
    return fcurNetIncome;
  }
  public void set_fcurNetIncome(java.math.BigDecimal fcurNetIncome) {
    this.fcurNetIncome = fcurNetIncome;
  }
  public tblnz_rtnpieprd with_fcurNetIncome(java.math.BigDecimal fcurNetIncome) {
    this.fcurNetIncome = fcurNetIncome;
    return this;
  }
  private java.math.BigDecimal fcurNetLandIncome;
  public java.math.BigDecimal get_fcurNetLandIncome() {
    return fcurNetLandIncome;
  }
  public void set_fcurNetLandIncome(java.math.BigDecimal fcurNetLandIncome) {
    this.fcurNetLandIncome = fcurNetLandIncome;
  }
  public tblnz_rtnpieprd with_fcurNetLandIncome(java.math.BigDecimal fcurNetLandIncome) {
    this.fcurNetLandIncome = fcurNetLandIncome;
    return this;
  }
  private java.math.BigDecimal fcurCombinedIncome;
  public java.math.BigDecimal get_fcurCombinedIncome() {
    return fcurCombinedIncome;
  }
  public void set_fcurCombinedIncome(java.math.BigDecimal fcurCombinedIncome) {
    this.fcurCombinedIncome = fcurCombinedIncome;
  }
  public tblnz_rtnpieprd with_fcurCombinedIncome(java.math.BigDecimal fcurCombinedIncome) {
    this.fcurCombinedIncome = fcurCombinedIncome;
    return this;
  }
  private java.math.BigDecimal fcurFormationLoss;
  public java.math.BigDecimal get_fcurFormationLoss() {
    return fcurFormationLoss;
  }
  public void set_fcurFormationLoss(java.math.BigDecimal fcurFormationLoss) {
    this.fcurFormationLoss = fcurFormationLoss;
  }
  public tblnz_rtnpieprd with_fcurFormationLoss(java.math.BigDecimal fcurFormationLoss) {
    this.fcurFormationLoss = fcurFormationLoss;
    return this;
  }
  private java.math.BigDecimal fcurLandLossBroughtForward;
  public java.math.BigDecimal get_fcurLandLossBroughtForward() {
    return fcurLandLossBroughtForward;
  }
  public void set_fcurLandLossBroughtForward(java.math.BigDecimal fcurLandLossBroughtForward) {
    this.fcurLandLossBroughtForward = fcurLandLossBroughtForward;
  }
  public tblnz_rtnpieprd with_fcurLandLossBroughtForward(java.math.BigDecimal fcurLandLossBroughtForward) {
    this.fcurLandLossBroughtForward = fcurLandLossBroughtForward;
    return this;
  }
  private java.math.BigDecimal fcurLandLossCarryForward;
  public java.math.BigDecimal get_fcurLandLossCarryForward() {
    return fcurLandLossCarryForward;
  }
  public void set_fcurLandLossCarryForward(java.math.BigDecimal fcurLandLossCarryForward) {
    this.fcurLandLossCarryForward = fcurLandLossCarryForward;
  }
  public tblnz_rtnpieprd with_fcurLandLossCarryForward(java.math.BigDecimal fcurLandLossCarryForward) {
    this.fcurLandLossCarryForward = fcurLandLossCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurLandLossClaimed;
  public java.math.BigDecimal get_fcurLandLossClaimed() {
    return fcurLandLossClaimed;
  }
  public void set_fcurLandLossClaimed(java.math.BigDecimal fcurLandLossClaimed) {
    this.fcurLandLossClaimed = fcurLandLossClaimed;
  }
  public tblnz_rtnpieprd with_fcurLandLossClaimed(java.math.BigDecimal fcurLandLossClaimed) {
    this.fcurLandLossClaimed = fcurLandLossClaimed;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnpieprd with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurTotalLoss;
  public java.math.BigDecimal get_fcurTotalLoss() {
    return fcurTotalLoss;
  }
  public void set_fcurTotalLoss(java.math.BigDecimal fcurTotalLoss) {
    this.fcurTotalLoss = fcurTotalLoss;
  }
  public tblnz_rtnpieprd with_fcurTotalLoss(java.math.BigDecimal fcurTotalLoss) {
    this.fcurTotalLoss = fcurTotalLoss;
    return this;
  }
  private java.math.BigDecimal fcurIncomeRetained;
  public java.math.BigDecimal get_fcurIncomeRetained() {
    return fcurIncomeRetained;
  }
  public void set_fcurIncomeRetained(java.math.BigDecimal fcurIncomeRetained) {
    this.fcurIncomeRetained = fcurIncomeRetained;
  }
  public tblnz_rtnpieprd with_fcurIncomeRetained(java.math.BigDecimal fcurIncomeRetained) {
    this.fcurIncomeRetained = fcurIncomeRetained;
    return this;
  }
  private java.math.BigDecimal fcurIncomeExitedInvestors;
  public java.math.BigDecimal get_fcurIncomeExitedInvestors() {
    return fcurIncomeExitedInvestors;
  }
  public void set_fcurIncomeExitedInvestors(java.math.BigDecimal fcurIncomeExitedInvestors) {
    this.fcurIncomeExitedInvestors = fcurIncomeExitedInvestors;
  }
  public tblnz_rtnpieprd with_fcurIncomeExitedInvestors(java.math.BigDecimal fcurIncomeExitedInvestors) {
    this.fcurIncomeExitedInvestors = fcurIncomeExitedInvestors;
    return this;
  }
  private java.math.BigDecimal fcurInvestorExpenses;
  public java.math.BigDecimal get_fcurInvestorExpenses() {
    return fcurInvestorExpenses;
  }
  public void set_fcurInvestorExpenses(java.math.BigDecimal fcurInvestorExpenses) {
    this.fcurInvestorExpenses = fcurInvestorExpenses;
  }
  public tblnz_rtnpieprd with_fcurInvestorExpenses(java.math.BigDecimal fcurInvestorExpenses) {
    this.fcurInvestorExpenses = fcurInvestorExpenses;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncomeToAttribute;
  public java.math.BigDecimal get_fcurTotalIncomeToAttribute() {
    return fcurTotalIncomeToAttribute;
  }
  public void set_fcurTotalIncomeToAttribute(java.math.BigDecimal fcurTotalIncomeToAttribute) {
    this.fcurTotalIncomeToAttribute = fcurTotalIncomeToAttribute;
  }
  public tblnz_rtnpieprd with_fcurTotalIncomeToAttribute(java.math.BigDecimal fcurTotalIncomeToAttribute) {
    this.fcurTotalIncomeToAttribute = fcurTotalIncomeToAttribute;
    return this;
  }
  private java.math.BigDecimal fcurTotalLossToAttribute;
  public java.math.BigDecimal get_fcurTotalLossToAttribute() {
    return fcurTotalLossToAttribute;
  }
  public void set_fcurTotalLossToAttribute(java.math.BigDecimal fcurTotalLossToAttribute) {
    this.fcurTotalLossToAttribute = fcurTotalLossToAttribute;
  }
  public tblnz_rtnpieprd with_fcurTotalLossToAttribute(java.math.BigDecimal fcurTotalLossToAttribute) {
    this.fcurTotalLossToAttribute = fcurTotalLossToAttribute;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAttributedZero;
  public java.math.BigDecimal get_fcurIncomeAttributedZero() {
    return fcurIncomeAttributedZero;
  }
  public void set_fcurIncomeAttributedZero(java.math.BigDecimal fcurIncomeAttributedZero) {
    this.fcurIncomeAttributedZero = fcurIncomeAttributedZero;
  }
  public tblnz_rtnpieprd with_fcurIncomeAttributedZero(java.math.BigDecimal fcurIncomeAttributedZero) {
    this.fcurIncomeAttributedZero = fcurIncomeAttributedZero;
    return this;
  }
  private java.math.BigDecimal fcurLossAttributedZero;
  public java.math.BigDecimal get_fcurLossAttributedZero() {
    return fcurLossAttributedZero;
  }
  public void set_fcurLossAttributedZero(java.math.BigDecimal fcurLossAttributedZero) {
    this.fcurLossAttributedZero = fcurLossAttributedZero;
  }
  public tblnz_rtnpieprd with_fcurLossAttributedZero(java.math.BigDecimal fcurLossAttributedZero) {
    this.fcurLossAttributedZero = fcurLossAttributedZero;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAttributedLow;
  public java.math.BigDecimal get_fcurIncomeAttributedLow() {
    return fcurIncomeAttributedLow;
  }
  public void set_fcurIncomeAttributedLow(java.math.BigDecimal fcurIncomeAttributedLow) {
    this.fcurIncomeAttributedLow = fcurIncomeAttributedLow;
  }
  public tblnz_rtnpieprd with_fcurIncomeAttributedLow(java.math.BigDecimal fcurIncomeAttributedLow) {
    this.fcurIncomeAttributedLow = fcurIncomeAttributedLow;
    return this;
  }
  private java.math.BigDecimal fcurLossAttributedLow;
  public java.math.BigDecimal get_fcurLossAttributedLow() {
    return fcurLossAttributedLow;
  }
  public void set_fcurLossAttributedLow(java.math.BigDecimal fcurLossAttributedLow) {
    this.fcurLossAttributedLow = fcurLossAttributedLow;
  }
  public tblnz_rtnpieprd with_fcurLossAttributedLow(java.math.BigDecimal fcurLossAttributedLow) {
    this.fcurLossAttributedLow = fcurLossAttributedLow;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAttributedMid;
  public java.math.BigDecimal get_fcurIncomeAttributedMid() {
    return fcurIncomeAttributedMid;
  }
  public void set_fcurIncomeAttributedMid(java.math.BigDecimal fcurIncomeAttributedMid) {
    this.fcurIncomeAttributedMid = fcurIncomeAttributedMid;
  }
  public tblnz_rtnpieprd with_fcurIncomeAttributedMid(java.math.BigDecimal fcurIncomeAttributedMid) {
    this.fcurIncomeAttributedMid = fcurIncomeAttributedMid;
    return this;
  }
  private java.math.BigDecimal fcurLossAttributedMid;
  public java.math.BigDecimal get_fcurLossAttributedMid() {
    return fcurLossAttributedMid;
  }
  public void set_fcurLossAttributedMid(java.math.BigDecimal fcurLossAttributedMid) {
    this.fcurLossAttributedMid = fcurLossAttributedMid;
  }
  public tblnz_rtnpieprd with_fcurLossAttributedMid(java.math.BigDecimal fcurLossAttributedMid) {
    this.fcurLossAttributedMid = fcurLossAttributedMid;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAttributedTop;
  public java.math.BigDecimal get_fcurIncomeAttributedTop() {
    return fcurIncomeAttributedTop;
  }
  public void set_fcurIncomeAttributedTop(java.math.BigDecimal fcurIncomeAttributedTop) {
    this.fcurIncomeAttributedTop = fcurIncomeAttributedTop;
  }
  public tblnz_rtnpieprd with_fcurIncomeAttributedTop(java.math.BigDecimal fcurIncomeAttributedTop) {
    this.fcurIncomeAttributedTop = fcurIncomeAttributedTop;
    return this;
  }
  private java.math.BigDecimal fcurLossAttributedTop;
  public java.math.BigDecimal get_fcurLossAttributedTop() {
    return fcurLossAttributedTop;
  }
  public void set_fcurLossAttributedTop(java.math.BigDecimal fcurLossAttributedTop) {
    this.fcurLossAttributedTop = fcurLossAttributedTop;
  }
  public tblnz_rtnpieprd with_fcurLossAttributedTop(java.math.BigDecimal fcurLossAttributedTop) {
    this.fcurLossAttributedTop = fcurLossAttributedTop;
    return this;
  }
  private java.math.BigDecimal fcurTaxPayable;
  public java.math.BigDecimal get_fcurTaxPayable() {
    return fcurTaxPayable;
  }
  public void set_fcurTaxPayable(java.math.BigDecimal fcurTaxPayable) {
    this.fcurTaxPayable = fcurTaxPayable;
  }
  public tblnz_rtnpieprd with_fcurTaxPayable(java.math.BigDecimal fcurTaxPayable) {
    this.fcurTaxPayable = fcurTaxPayable;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaymentExitedInvestors;
  public java.math.BigDecimal get_fcurTaxPaymentExitedInvestors() {
    return fcurTaxPaymentExitedInvestors;
  }
  public void set_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
  }
  public tblnz_rtnpieprd with_fcurTaxPaymentExitedInvestors(java.math.BigDecimal fcurTaxPaymentExitedInvestors) {
    this.fcurTaxPaymentExitedInvestors = fcurTaxPaymentExitedInvestors;
    return this;
  }
  private java.math.BigDecimal fcurNetTaxPayable;
  public java.math.BigDecimal get_fcurNetTaxPayable() {
    return fcurNetTaxPayable;
  }
  public void set_fcurNetTaxPayable(java.math.BigDecimal fcurNetTaxPayable) {
    this.fcurNetTaxPayable = fcurNetTaxPayable;
  }
  public tblnz_rtnpieprd with_fcurNetTaxPayable(java.math.BigDecimal fcurNetTaxPayable) {
    this.fcurNetTaxPayable = fcurNetTaxPayable;
    return this;
  }
  private java.math.BigDecimal fcurForeignTaxCredit;
  public java.math.BigDecimal get_fcurForeignTaxCredit() {
    return fcurForeignTaxCredit;
  }
  public void set_fcurForeignTaxCredit(java.math.BigDecimal fcurForeignTaxCredit) {
    this.fcurForeignTaxCredit = fcurForeignTaxCredit;
  }
  public tblnz_rtnpieprd with_fcurForeignTaxCredit(java.math.BigDecimal fcurForeignTaxCredit) {
    this.fcurForeignTaxCredit = fcurForeignTaxCredit;
    return this;
  }
  private java.math.BigDecimal fcurDividendWithholdingPayment;
  public java.math.BigDecimal get_fcurDividendWithholdingPayment() {
    return fcurDividendWithholdingPayment;
  }
  public void set_fcurDividendWithholdingPayment(java.math.BigDecimal fcurDividendWithholdingPayment) {
    this.fcurDividendWithholdingPayment = fcurDividendWithholdingPayment;
  }
  public tblnz_rtnpieprd with_fcurDividendWithholdingPayment(java.math.BigDecimal fcurDividendWithholdingPayment) {
    this.fcurDividendWithholdingPayment = fcurDividendWithholdingPayment;
    return this;
  }
  private java.math.BigDecimal fcurImputationCredit;
  public java.math.BigDecimal get_fcurImputationCredit() {
    return fcurImputationCredit;
  }
  public void set_fcurImputationCredit(java.math.BigDecimal fcurImputationCredit) {
    this.fcurImputationCredit = fcurImputationCredit;
  }
  public tblnz_rtnpieprd with_fcurImputationCredit(java.math.BigDecimal fcurImputationCredit) {
    this.fcurImputationCredit = fcurImputationCredit;
    return this;
  }
  private java.math.BigDecimal fcurResidentWithholdingTax;
  public java.math.BigDecimal get_fcurResidentWithholdingTax() {
    return fcurResidentWithholdingTax;
  }
  public void set_fcurResidentWithholdingTax(java.math.BigDecimal fcurResidentWithholdingTax) {
    this.fcurResidentWithholdingTax = fcurResidentWithholdingTax;
  }
  public tblnz_rtnpieprd with_fcurResidentWithholdingTax(java.math.BigDecimal fcurResidentWithholdingTax) {
    this.fcurResidentWithholdingTax = fcurResidentWithholdingTax;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAttributedNFI;
  public java.math.BigDecimal get_fcurIncomeAttributedNFI() {
    return fcurIncomeAttributedNFI;
  }
  public void set_fcurIncomeAttributedNFI(java.math.BigDecimal fcurIncomeAttributedNFI) {
    this.fcurIncomeAttributedNFI = fcurIncomeAttributedNFI;
  }
  public tblnz_rtnpieprd with_fcurIncomeAttributedNFI(java.math.BigDecimal fcurIncomeAttributedNFI) {
    this.fcurIncomeAttributedNFI = fcurIncomeAttributedNFI;
    return this;
  }
  private java.math.BigDecimal fcurTaxPaidNFI;
  public java.math.BigDecimal get_fcurTaxPaidNFI() {
    return fcurTaxPaidNFI;
  }
  public void set_fcurTaxPaidNFI(java.math.BigDecimal fcurTaxPaidNFI) {
    this.fcurTaxPaidNFI = fcurTaxPaidNFI;
  }
  public tblnz_rtnpieprd with_fcurTaxPaidNFI(java.math.BigDecimal fcurTaxPaidNFI) {
    this.fcurTaxPaidNFI = fcurTaxPaidNFI;
    return this;
  }
  private Integer fblnIncludeIncomeLossAprFeb;
  public Integer get_fblnIncludeIncomeLossAprFeb() {
    return fblnIncludeIncomeLossAprFeb;
  }
  public void set_fblnIncludeIncomeLossAprFeb(Integer fblnIncludeIncomeLossAprFeb) {
    this.fblnIncludeIncomeLossAprFeb = fblnIncludeIncomeLossAprFeb;
  }
  public tblnz_rtnpieprd with_fblnIncludeIncomeLossAprFeb(Integer fblnIncludeIncomeLossAprFeb) {
    this.fblnIncludeIncomeLossAprFeb = fblnIncludeIncomeLossAprFeb;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpieprd with_fstrWho(String fstrWho) {
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
  public tblnz_rtnpieprd with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieprd)) {
      return false;
    }
    tblnz_rtnpieprd that = (tblnz_rtnpieprd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalInvestmentValue == null ? that.fcurTotalInvestmentValue == null : this.fcurTotalInvestmentValue.equals(that.fcurTotalInvestmentValue));
    equal = equal && (this.fcurGrossIncome == null ? that.fcurGrossIncome == null : this.fcurGrossIncome.equals(that.fcurGrossIncome));
    equal = equal && (this.fcurDeductibleExpenses == null ? that.fcurDeductibleExpenses == null : this.fcurDeductibleExpenses.equals(that.fcurDeductibleExpenses));
    equal = equal && (this.fcurNetIncome == null ? that.fcurNetIncome == null : this.fcurNetIncome.equals(that.fcurNetIncome));
    equal = equal && (this.fcurNetLandIncome == null ? that.fcurNetLandIncome == null : this.fcurNetLandIncome.equals(that.fcurNetLandIncome));
    equal = equal && (this.fcurCombinedIncome == null ? that.fcurCombinedIncome == null : this.fcurCombinedIncome.equals(that.fcurCombinedIncome));
    equal = equal && (this.fcurFormationLoss == null ? that.fcurFormationLoss == null : this.fcurFormationLoss.equals(that.fcurFormationLoss));
    equal = equal && (this.fcurLandLossBroughtForward == null ? that.fcurLandLossBroughtForward == null : this.fcurLandLossBroughtForward.equals(that.fcurLandLossBroughtForward));
    equal = equal && (this.fcurLandLossCarryForward == null ? that.fcurLandLossCarryForward == null : this.fcurLandLossCarryForward.equals(that.fcurLandLossCarryForward));
    equal = equal && (this.fcurLandLossClaimed == null ? that.fcurLandLossClaimed == null : this.fcurLandLossClaimed.equals(that.fcurLandLossClaimed));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalLoss == null ? that.fcurTotalLoss == null : this.fcurTotalLoss.equals(that.fcurTotalLoss));
    equal = equal && (this.fcurIncomeRetained == null ? that.fcurIncomeRetained == null : this.fcurIncomeRetained.equals(that.fcurIncomeRetained));
    equal = equal && (this.fcurIncomeExitedInvestors == null ? that.fcurIncomeExitedInvestors == null : this.fcurIncomeExitedInvestors.equals(that.fcurIncomeExitedInvestors));
    equal = equal && (this.fcurInvestorExpenses == null ? that.fcurInvestorExpenses == null : this.fcurInvestorExpenses.equals(that.fcurInvestorExpenses));
    equal = equal && (this.fcurTotalIncomeToAttribute == null ? that.fcurTotalIncomeToAttribute == null : this.fcurTotalIncomeToAttribute.equals(that.fcurTotalIncomeToAttribute));
    equal = equal && (this.fcurTotalLossToAttribute == null ? that.fcurTotalLossToAttribute == null : this.fcurTotalLossToAttribute.equals(that.fcurTotalLossToAttribute));
    equal = equal && (this.fcurIncomeAttributedZero == null ? that.fcurIncomeAttributedZero == null : this.fcurIncomeAttributedZero.equals(that.fcurIncomeAttributedZero));
    equal = equal && (this.fcurLossAttributedZero == null ? that.fcurLossAttributedZero == null : this.fcurLossAttributedZero.equals(that.fcurLossAttributedZero));
    equal = equal && (this.fcurIncomeAttributedLow == null ? that.fcurIncomeAttributedLow == null : this.fcurIncomeAttributedLow.equals(that.fcurIncomeAttributedLow));
    equal = equal && (this.fcurLossAttributedLow == null ? that.fcurLossAttributedLow == null : this.fcurLossAttributedLow.equals(that.fcurLossAttributedLow));
    equal = equal && (this.fcurIncomeAttributedMid == null ? that.fcurIncomeAttributedMid == null : this.fcurIncomeAttributedMid.equals(that.fcurIncomeAttributedMid));
    equal = equal && (this.fcurLossAttributedMid == null ? that.fcurLossAttributedMid == null : this.fcurLossAttributedMid.equals(that.fcurLossAttributedMid));
    equal = equal && (this.fcurIncomeAttributedTop == null ? that.fcurIncomeAttributedTop == null : this.fcurIncomeAttributedTop.equals(that.fcurIncomeAttributedTop));
    equal = equal && (this.fcurLossAttributedTop == null ? that.fcurLossAttributedTop == null : this.fcurLossAttributedTop.equals(that.fcurLossAttributedTop));
    equal = equal && (this.fcurTaxPayable == null ? that.fcurTaxPayable == null : this.fcurTaxPayable.equals(that.fcurTaxPayable));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fcurNetTaxPayable == null ? that.fcurNetTaxPayable == null : this.fcurNetTaxPayable.equals(that.fcurNetTaxPayable));
    equal = equal && (this.fcurForeignTaxCredit == null ? that.fcurForeignTaxCredit == null : this.fcurForeignTaxCredit.equals(that.fcurForeignTaxCredit));
    equal = equal && (this.fcurDividendWithholdingPayment == null ? that.fcurDividendWithholdingPayment == null : this.fcurDividendWithholdingPayment.equals(that.fcurDividendWithholdingPayment));
    equal = equal && (this.fcurImputationCredit == null ? that.fcurImputationCredit == null : this.fcurImputationCredit.equals(that.fcurImputationCredit));
    equal = equal && (this.fcurResidentWithholdingTax == null ? that.fcurResidentWithholdingTax == null : this.fcurResidentWithholdingTax.equals(that.fcurResidentWithholdingTax));
    equal = equal && (this.fcurIncomeAttributedNFI == null ? that.fcurIncomeAttributedNFI == null : this.fcurIncomeAttributedNFI.equals(that.fcurIncomeAttributedNFI));
    equal = equal && (this.fcurTaxPaidNFI == null ? that.fcurTaxPaidNFI == null : this.fcurTaxPaidNFI.equals(that.fcurTaxPaidNFI));
    equal = equal && (this.fblnIncludeIncomeLossAprFeb == null ? that.fblnIncludeIncomeLossAprFeb == null : this.fblnIncludeIncomeLossAprFeb.equals(that.fblnIncludeIncomeLossAprFeb));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpieprd)) {
      return false;
    }
    tblnz_rtnpieprd that = (tblnz_rtnpieprd) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalInvestmentValue == null ? that.fcurTotalInvestmentValue == null : this.fcurTotalInvestmentValue.equals(that.fcurTotalInvestmentValue));
    equal = equal && (this.fcurGrossIncome == null ? that.fcurGrossIncome == null : this.fcurGrossIncome.equals(that.fcurGrossIncome));
    equal = equal && (this.fcurDeductibleExpenses == null ? that.fcurDeductibleExpenses == null : this.fcurDeductibleExpenses.equals(that.fcurDeductibleExpenses));
    equal = equal && (this.fcurNetIncome == null ? that.fcurNetIncome == null : this.fcurNetIncome.equals(that.fcurNetIncome));
    equal = equal && (this.fcurNetLandIncome == null ? that.fcurNetLandIncome == null : this.fcurNetLandIncome.equals(that.fcurNetLandIncome));
    equal = equal && (this.fcurCombinedIncome == null ? that.fcurCombinedIncome == null : this.fcurCombinedIncome.equals(that.fcurCombinedIncome));
    equal = equal && (this.fcurFormationLoss == null ? that.fcurFormationLoss == null : this.fcurFormationLoss.equals(that.fcurFormationLoss));
    equal = equal && (this.fcurLandLossBroughtForward == null ? that.fcurLandLossBroughtForward == null : this.fcurLandLossBroughtForward.equals(that.fcurLandLossBroughtForward));
    equal = equal && (this.fcurLandLossCarryForward == null ? that.fcurLandLossCarryForward == null : this.fcurLandLossCarryForward.equals(that.fcurLandLossCarryForward));
    equal = equal && (this.fcurLandLossClaimed == null ? that.fcurLandLossClaimed == null : this.fcurLandLossClaimed.equals(that.fcurLandLossClaimed));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurTotalLoss == null ? that.fcurTotalLoss == null : this.fcurTotalLoss.equals(that.fcurTotalLoss));
    equal = equal && (this.fcurIncomeRetained == null ? that.fcurIncomeRetained == null : this.fcurIncomeRetained.equals(that.fcurIncomeRetained));
    equal = equal && (this.fcurIncomeExitedInvestors == null ? that.fcurIncomeExitedInvestors == null : this.fcurIncomeExitedInvestors.equals(that.fcurIncomeExitedInvestors));
    equal = equal && (this.fcurInvestorExpenses == null ? that.fcurInvestorExpenses == null : this.fcurInvestorExpenses.equals(that.fcurInvestorExpenses));
    equal = equal && (this.fcurTotalIncomeToAttribute == null ? that.fcurTotalIncomeToAttribute == null : this.fcurTotalIncomeToAttribute.equals(that.fcurTotalIncomeToAttribute));
    equal = equal && (this.fcurTotalLossToAttribute == null ? that.fcurTotalLossToAttribute == null : this.fcurTotalLossToAttribute.equals(that.fcurTotalLossToAttribute));
    equal = equal && (this.fcurIncomeAttributedZero == null ? that.fcurIncomeAttributedZero == null : this.fcurIncomeAttributedZero.equals(that.fcurIncomeAttributedZero));
    equal = equal && (this.fcurLossAttributedZero == null ? that.fcurLossAttributedZero == null : this.fcurLossAttributedZero.equals(that.fcurLossAttributedZero));
    equal = equal && (this.fcurIncomeAttributedLow == null ? that.fcurIncomeAttributedLow == null : this.fcurIncomeAttributedLow.equals(that.fcurIncomeAttributedLow));
    equal = equal && (this.fcurLossAttributedLow == null ? that.fcurLossAttributedLow == null : this.fcurLossAttributedLow.equals(that.fcurLossAttributedLow));
    equal = equal && (this.fcurIncomeAttributedMid == null ? that.fcurIncomeAttributedMid == null : this.fcurIncomeAttributedMid.equals(that.fcurIncomeAttributedMid));
    equal = equal && (this.fcurLossAttributedMid == null ? that.fcurLossAttributedMid == null : this.fcurLossAttributedMid.equals(that.fcurLossAttributedMid));
    equal = equal && (this.fcurIncomeAttributedTop == null ? that.fcurIncomeAttributedTop == null : this.fcurIncomeAttributedTop.equals(that.fcurIncomeAttributedTop));
    equal = equal && (this.fcurLossAttributedTop == null ? that.fcurLossAttributedTop == null : this.fcurLossAttributedTop.equals(that.fcurLossAttributedTop));
    equal = equal && (this.fcurTaxPayable == null ? that.fcurTaxPayable == null : this.fcurTaxPayable.equals(that.fcurTaxPayable));
    equal = equal && (this.fcurTaxPaymentExitedInvestors == null ? that.fcurTaxPaymentExitedInvestors == null : this.fcurTaxPaymentExitedInvestors.equals(that.fcurTaxPaymentExitedInvestors));
    equal = equal && (this.fcurNetTaxPayable == null ? that.fcurNetTaxPayable == null : this.fcurNetTaxPayable.equals(that.fcurNetTaxPayable));
    equal = equal && (this.fcurForeignTaxCredit == null ? that.fcurForeignTaxCredit == null : this.fcurForeignTaxCredit.equals(that.fcurForeignTaxCredit));
    equal = equal && (this.fcurDividendWithholdingPayment == null ? that.fcurDividendWithholdingPayment == null : this.fcurDividendWithholdingPayment.equals(that.fcurDividendWithholdingPayment));
    equal = equal && (this.fcurImputationCredit == null ? that.fcurImputationCredit == null : this.fcurImputationCredit.equals(that.fcurImputationCredit));
    equal = equal && (this.fcurResidentWithholdingTax == null ? that.fcurResidentWithholdingTax == null : this.fcurResidentWithholdingTax.equals(that.fcurResidentWithholdingTax));
    equal = equal && (this.fcurIncomeAttributedNFI == null ? that.fcurIncomeAttributedNFI == null : this.fcurIncomeAttributedNFI.equals(that.fcurIncomeAttributedNFI));
    equal = equal && (this.fcurTaxPaidNFI == null ? that.fcurTaxPaidNFI == null : this.fcurTaxPaidNFI.equals(that.fcurTaxPaidNFI));
    equal = equal && (this.fblnIncludeIncomeLossAprFeb == null ? that.fblnIncludeIncomeLossAprFeb == null : this.fblnIncludeIncomeLossAprFeb.equals(that.fblnIncludeIncomeLossAprFeb));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalInvestmentValue = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDeductibleExpenses = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurNetIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNetLandIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurCombinedIncome = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFormationLoss = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurLandLossBroughtForward = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurLandLossCarryForward = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLandLossClaimed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalLoss = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurIncomeRetained = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurIncomeExitedInvestors = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInvestorExpenses = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalIncomeToAttribute = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalLossToAttribute = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurIncomeAttributedZero = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurLossAttributedZero = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurIncomeAttributedLow = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurLossAttributedLow = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurIncomeAttributedMid = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurLossAttributedMid = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurIncomeAttributedTop = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurLossAttributedTop = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTaxPayable = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetTaxPayable = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurForeignTaxCredit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurDividendWithholdingPayment = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurImputationCredit = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurResidentWithholdingTax = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAttributedNFI = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTaxPaidNFI = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fblnIncludeIncomeLossAprFeb = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalInvestmentValue = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurGrossIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurDeductibleExpenses = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurNetIncome = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurNetLandIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurCombinedIncome = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurFormationLoss = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurLandLossBroughtForward = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurLandLossCarryForward = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLandLossClaimed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalLoss = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurIncomeRetained = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurIncomeExitedInvestors = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInvestorExpenses = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalIncomeToAttribute = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalLossToAttribute = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurIncomeAttributedZero = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurLossAttributedZero = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurIncomeAttributedLow = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurLossAttributedLow = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurIncomeAttributedMid = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurLossAttributedMid = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurIncomeAttributedTop = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurLossAttributedTop = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurTaxPayable = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurTaxPaymentExitedInvestors = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurNetTaxPayable = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurForeignTaxCredit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurDividendWithholdingPayment = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurImputationCredit = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fcurResidentWithholdingTax = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.fcurIncomeAttributedNFI = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.fcurTaxPaidNFI = JdbcWritableBridge.readBigDecimal(35, __dbResults);
    this.fblnIncludeIncomeLossAprFeb = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurTotalInvestmentValue, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductibleExpenses, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLandIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCombinedIncome, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFormationLoss, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossBroughtForward, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossCarryForward, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossClaimed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLoss, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeRetained, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeExitedInvestors, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInvestorExpenses, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeToAttribute, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossToAttribute, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedZero, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedZero, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedLow, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedLow, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedMid, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedMid, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedTop, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedTop, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayable, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPayable, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurForeignTaxCredit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendWithholdingPayment, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredit, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidentWithholdingTax, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedNFI, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidNFI, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncludeIncomeLossAprFeb, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
    return 38;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalInvestmentValue, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductibleExpenses, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetIncome, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetLandIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCombinedIncome, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFormationLoss, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossBroughtForward, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossCarryForward, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLandLossClaimed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLoss, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeRetained, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeExitedInvestors, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInvestorExpenses, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncomeToAttribute, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLossToAttribute, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedZero, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedZero, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedLow, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedLow, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedMid, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedMid, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedTop, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAttributedTop, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPayable, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaymentExitedInvestors, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetTaxPayable, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurForeignTaxCredit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendWithholdingPayment, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredit, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidentWithholdingTax, 33 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAttributedNFI, 34 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxPaidNFI, 35 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncludeIncomeLossAprFeb, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
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
        this.fcurTotalInvestmentValue = null;
    } else {
    this.fcurTotalInvestmentValue = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossIncome = null;
    } else {
    this.fcurGrossIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductibleExpenses = null;
    } else {
    this.fcurDeductibleExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetIncome = null;
    } else {
    this.fcurNetIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetLandIncome = null;
    } else {
    this.fcurNetLandIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCombinedIncome = null;
    } else {
    this.fcurCombinedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFormationLoss = null;
    } else {
    this.fcurFormationLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLandLossBroughtForward = null;
    } else {
    this.fcurLandLossBroughtForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLandLossCarryForward = null;
    } else {
    this.fcurLandLossCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLandLossClaimed = null;
    } else {
    this.fcurLandLossClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLoss = null;
    } else {
    this.fcurTotalLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeRetained = null;
    } else {
    this.fcurIncomeRetained = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeExitedInvestors = null;
    } else {
    this.fcurIncomeExitedInvestors = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInvestorExpenses = null;
    } else {
    this.fcurInvestorExpenses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalIncomeToAttribute = null;
    } else {
    this.fcurTotalIncomeToAttribute = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLossToAttribute = null;
    } else {
    this.fcurTotalLossToAttribute = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAttributedZero = null;
    } else {
    this.fcurIncomeAttributedZero = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossAttributedZero = null;
    } else {
    this.fcurLossAttributedZero = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAttributedLow = null;
    } else {
    this.fcurIncomeAttributedLow = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossAttributedLow = null;
    } else {
    this.fcurLossAttributedLow = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAttributedMid = null;
    } else {
    this.fcurIncomeAttributedMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossAttributedMid = null;
    } else {
    this.fcurLossAttributedMid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAttributedTop = null;
    } else {
    this.fcurIncomeAttributedTop = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossAttributedTop = null;
    } else {
    this.fcurLossAttributedTop = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPayable = null;
    } else {
    this.fcurTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaymentExitedInvestors = null;
    } else {
    this.fcurTaxPaymentExitedInvestors = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetTaxPayable = null;
    } else {
    this.fcurNetTaxPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurForeignTaxCredit = null;
    } else {
    this.fcurForeignTaxCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendWithholdingPayment = null;
    } else {
    this.fcurDividendWithholdingPayment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationCredit = null;
    } else {
    this.fcurImputationCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResidentWithholdingTax = null;
    } else {
    this.fcurResidentWithholdingTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAttributedNFI = null;
    } else {
    this.fcurIncomeAttributedNFI = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxPaidNFI = null;
    } else {
    this.fcurTaxPaidNFI = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIncludeIncomeLossAprFeb = null;
    } else {
    this.fblnIncludeIncomeLossAprFeb = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurTotalInvestmentValue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalInvestmentValue, __dataOut);
    }
    if (null == this.fcurGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossIncome, __dataOut);
    }
    if (null == this.fcurDeductibleExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductibleExpenses, __dataOut);
    }
    if (null == this.fcurNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncome, __dataOut);
    }
    if (null == this.fcurNetLandIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLandIncome, __dataOut);
    }
    if (null == this.fcurCombinedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCombinedIncome, __dataOut);
    }
    if (null == this.fcurFormationLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFormationLoss, __dataOut);
    }
    if (null == this.fcurLandLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossBroughtForward, __dataOut);
    }
    if (null == this.fcurLandLossCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossCarryForward, __dataOut);
    }
    if (null == this.fcurLandLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossClaimed, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurTotalLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLoss, __dataOut);
    }
    if (null == this.fcurIncomeRetained) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeRetained, __dataOut);
    }
    if (null == this.fcurIncomeExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeExitedInvestors, __dataOut);
    }
    if (null == this.fcurInvestorExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInvestorExpenses, __dataOut);
    }
    if (null == this.fcurTotalIncomeToAttribute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeToAttribute, __dataOut);
    }
    if (null == this.fcurTotalLossToAttribute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossToAttribute, __dataOut);
    }
    if (null == this.fcurIncomeAttributedZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedZero, __dataOut);
    }
    if (null == this.fcurLossAttributedZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedZero, __dataOut);
    }
    if (null == this.fcurIncomeAttributedLow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedLow, __dataOut);
    }
    if (null == this.fcurLossAttributedLow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedLow, __dataOut);
    }
    if (null == this.fcurIncomeAttributedMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedMid, __dataOut);
    }
    if (null == this.fcurLossAttributedMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedMid, __dataOut);
    }
    if (null == this.fcurIncomeAttributedTop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedTop, __dataOut);
    }
    if (null == this.fcurLossAttributedTop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedTop, __dataOut);
    }
    if (null == this.fcurTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayable, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fcurNetTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPayable, __dataOut);
    }
    if (null == this.fcurForeignTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurForeignTaxCredit, __dataOut);
    }
    if (null == this.fcurDividendWithholdingPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendWithholdingPayment, __dataOut);
    }
    if (null == this.fcurImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredit, __dataOut);
    }
    if (null == this.fcurResidentWithholdingTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidentWithholdingTax, __dataOut);
    }
    if (null == this.fcurIncomeAttributedNFI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedNFI, __dataOut);
    }
    if (null == this.fcurTaxPaidNFI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidNFI, __dataOut);
    }
    if (null == this.fblnIncludeIncomeLossAprFeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncludeIncomeLossAprFeb);
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
    if (null == this.fcurTotalInvestmentValue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalInvestmentValue, __dataOut);
    }
    if (null == this.fcurGrossIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossIncome, __dataOut);
    }
    if (null == this.fcurDeductibleExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductibleExpenses, __dataOut);
    }
    if (null == this.fcurNetIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetIncome, __dataOut);
    }
    if (null == this.fcurNetLandIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetLandIncome, __dataOut);
    }
    if (null == this.fcurCombinedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCombinedIncome, __dataOut);
    }
    if (null == this.fcurFormationLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFormationLoss, __dataOut);
    }
    if (null == this.fcurLandLossBroughtForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossBroughtForward, __dataOut);
    }
    if (null == this.fcurLandLossCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossCarryForward, __dataOut);
    }
    if (null == this.fcurLandLossClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLandLossClaimed, __dataOut);
    }
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurTotalLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLoss, __dataOut);
    }
    if (null == this.fcurIncomeRetained) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeRetained, __dataOut);
    }
    if (null == this.fcurIncomeExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeExitedInvestors, __dataOut);
    }
    if (null == this.fcurInvestorExpenses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInvestorExpenses, __dataOut);
    }
    if (null == this.fcurTotalIncomeToAttribute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncomeToAttribute, __dataOut);
    }
    if (null == this.fcurTotalLossToAttribute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLossToAttribute, __dataOut);
    }
    if (null == this.fcurIncomeAttributedZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedZero, __dataOut);
    }
    if (null == this.fcurLossAttributedZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedZero, __dataOut);
    }
    if (null == this.fcurIncomeAttributedLow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedLow, __dataOut);
    }
    if (null == this.fcurLossAttributedLow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedLow, __dataOut);
    }
    if (null == this.fcurIncomeAttributedMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedMid, __dataOut);
    }
    if (null == this.fcurLossAttributedMid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedMid, __dataOut);
    }
    if (null == this.fcurIncomeAttributedTop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedTop, __dataOut);
    }
    if (null == this.fcurLossAttributedTop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAttributedTop, __dataOut);
    }
    if (null == this.fcurTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPayable, __dataOut);
    }
    if (null == this.fcurTaxPaymentExitedInvestors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaymentExitedInvestors, __dataOut);
    }
    if (null == this.fcurNetTaxPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetTaxPayable, __dataOut);
    }
    if (null == this.fcurForeignTaxCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurForeignTaxCredit, __dataOut);
    }
    if (null == this.fcurDividendWithholdingPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendWithholdingPayment, __dataOut);
    }
    if (null == this.fcurImputationCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredit, __dataOut);
    }
    if (null == this.fcurResidentWithholdingTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidentWithholdingTax, __dataOut);
    }
    if (null == this.fcurIncomeAttributedNFI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAttributedNFI, __dataOut);
    }
    if (null == this.fcurTaxPaidNFI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxPaidNFI, __dataOut);
    }
    if (null == this.fblnIncludeIncomeLossAprFeb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncludeIncomeLossAprFeb);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalInvestmentValue==null?"\\N":fcurTotalInvestmentValue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossIncome==null?"\\N":fcurGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductibleExpenses==null?"\\N":fcurDeductibleExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncome==null?"\\N":fcurNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLandIncome==null?"\\N":fcurNetLandIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCombinedIncome==null?"\\N":fcurCombinedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFormationLoss==null?"\\N":fcurFormationLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossBroughtForward==null?"\\N":fcurLandLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossCarryForward==null?"\\N":fcurLandLossCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossClaimed==null?"\\N":fcurLandLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLoss==null?"\\N":fcurTotalLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeRetained==null?"\\N":fcurIncomeRetained.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeExitedInvestors==null?"\\N":fcurIncomeExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInvestorExpenses==null?"\\N":fcurInvestorExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeToAttribute==null?"\\N":fcurTotalIncomeToAttribute.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossToAttribute==null?"\\N":fcurTotalLossToAttribute.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedZero==null?"\\N":fcurIncomeAttributedZero.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedZero==null?"\\N":fcurLossAttributedZero.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedLow==null?"\\N":fcurIncomeAttributedLow.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedLow==null?"\\N":fcurLossAttributedLow.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedMid==null?"\\N":fcurIncomeAttributedMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedMid==null?"\\N":fcurLossAttributedMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedTop==null?"\\N":fcurIncomeAttributedTop.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedTop==null?"\\N":fcurLossAttributedTop.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayable==null?"\\N":fcurTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPayable==null?"\\N":fcurNetTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurForeignTaxCredit==null?"\\N":fcurForeignTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendWithholdingPayment==null?"\\N":fcurDividendWithholdingPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredit==null?"\\N":fcurImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidentWithholdingTax==null?"\\N":fcurResidentWithholdingTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedNFI==null?"\\N":fcurIncomeAttributedNFI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidNFI==null?"\\N":fcurTaxPaidNFI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncludeIncomeLossAprFeb==null?"\\N":"" + fblnIncludeIncomeLossAprFeb, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalInvestmentValue==null?"\\N":fcurTotalInvestmentValue.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossIncome==null?"\\N":fcurGrossIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductibleExpenses==null?"\\N":fcurDeductibleExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetIncome==null?"\\N":fcurNetIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetLandIncome==null?"\\N":fcurNetLandIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCombinedIncome==null?"\\N":fcurCombinedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFormationLoss==null?"\\N":fcurFormationLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossBroughtForward==null?"\\N":fcurLandLossBroughtForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossCarryForward==null?"\\N":fcurLandLossCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLandLossClaimed==null?"\\N":fcurLandLossClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLoss==null?"\\N":fcurTotalLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeRetained==null?"\\N":fcurIncomeRetained.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeExitedInvestors==null?"\\N":fcurIncomeExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInvestorExpenses==null?"\\N":fcurInvestorExpenses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncomeToAttribute==null?"\\N":fcurTotalIncomeToAttribute.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLossToAttribute==null?"\\N":fcurTotalLossToAttribute.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedZero==null?"\\N":fcurIncomeAttributedZero.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedZero==null?"\\N":fcurLossAttributedZero.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedLow==null?"\\N":fcurIncomeAttributedLow.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedLow==null?"\\N":fcurLossAttributedLow.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedMid==null?"\\N":fcurIncomeAttributedMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedMid==null?"\\N":fcurLossAttributedMid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedTop==null?"\\N":fcurIncomeAttributedTop.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAttributedTop==null?"\\N":fcurLossAttributedTop.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPayable==null?"\\N":fcurTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaymentExitedInvestors==null?"\\N":fcurTaxPaymentExitedInvestors.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetTaxPayable==null?"\\N":fcurNetTaxPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurForeignTaxCredit==null?"\\N":fcurForeignTaxCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendWithholdingPayment==null?"\\N":fcurDividendWithholdingPayment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredit==null?"\\N":fcurImputationCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidentWithholdingTax==null?"\\N":fcurResidentWithholdingTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAttributedNFI==null?"\\N":fcurIncomeAttributedNFI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxPaidNFI==null?"\\N":fcurTaxPaidNFI.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncludeIncomeLossAprFeb==null?"\\N":"" + fblnIncludeIncomeLossAprFeb, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalInvestmentValue = null; } else {
      this.fcurTotalInvestmentValue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossIncome = null; } else {
      this.fcurGrossIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductibleExpenses = null; } else {
      this.fcurDeductibleExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncome = null; } else {
      this.fcurNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLandIncome = null; } else {
      this.fcurNetLandIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCombinedIncome = null; } else {
      this.fcurCombinedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFormationLoss = null; } else {
      this.fcurFormationLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossBroughtForward = null; } else {
      this.fcurLandLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossCarryForward = null; } else {
      this.fcurLandLossCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossClaimed = null; } else {
      this.fcurLandLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLoss = null; } else {
      this.fcurTotalLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeRetained = null; } else {
      this.fcurIncomeRetained = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeExitedInvestors = null; } else {
      this.fcurIncomeExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInvestorExpenses = null; } else {
      this.fcurInvestorExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeToAttribute = null; } else {
      this.fcurTotalIncomeToAttribute = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossToAttribute = null; } else {
      this.fcurTotalLossToAttribute = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedZero = null; } else {
      this.fcurIncomeAttributedZero = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedZero = null; } else {
      this.fcurLossAttributedZero = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedLow = null; } else {
      this.fcurIncomeAttributedLow = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedLow = null; } else {
      this.fcurLossAttributedLow = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedMid = null; } else {
      this.fcurIncomeAttributedMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedMid = null; } else {
      this.fcurLossAttributedMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedTop = null; } else {
      this.fcurIncomeAttributedTop = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedTop = null; } else {
      this.fcurLossAttributedTop = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayable = null; } else {
      this.fcurTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPayable = null; } else {
      this.fcurNetTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurForeignTaxCredit = null; } else {
      this.fcurForeignTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendWithholdingPayment = null; } else {
      this.fcurDividendWithholdingPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredit = null; } else {
      this.fcurImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidentWithholdingTax = null; } else {
      this.fcurResidentWithholdingTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedNFI = null; } else {
      this.fcurIncomeAttributedNFI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidNFI = null; } else {
      this.fcurTaxPaidNFI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncludeIncomeLossAprFeb = null; } else {
      this.fblnIncludeIncomeLossAprFeb = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalInvestmentValue = null; } else {
      this.fcurTotalInvestmentValue = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossIncome = null; } else {
      this.fcurGrossIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductibleExpenses = null; } else {
      this.fcurDeductibleExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetIncome = null; } else {
      this.fcurNetIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetLandIncome = null; } else {
      this.fcurNetLandIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCombinedIncome = null; } else {
      this.fcurCombinedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFormationLoss = null; } else {
      this.fcurFormationLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossBroughtForward = null; } else {
      this.fcurLandLossBroughtForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossCarryForward = null; } else {
      this.fcurLandLossCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLandLossClaimed = null; } else {
      this.fcurLandLossClaimed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLoss = null; } else {
      this.fcurTotalLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeRetained = null; } else {
      this.fcurIncomeRetained = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeExitedInvestors = null; } else {
      this.fcurIncomeExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInvestorExpenses = null; } else {
      this.fcurInvestorExpenses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncomeToAttribute = null; } else {
      this.fcurTotalIncomeToAttribute = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLossToAttribute = null; } else {
      this.fcurTotalLossToAttribute = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedZero = null; } else {
      this.fcurIncomeAttributedZero = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedZero = null; } else {
      this.fcurLossAttributedZero = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedLow = null; } else {
      this.fcurIncomeAttributedLow = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedLow = null; } else {
      this.fcurLossAttributedLow = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedMid = null; } else {
      this.fcurIncomeAttributedMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedMid = null; } else {
      this.fcurLossAttributedMid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedTop = null; } else {
      this.fcurIncomeAttributedTop = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAttributedTop = null; } else {
      this.fcurLossAttributedTop = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPayable = null; } else {
      this.fcurTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaymentExitedInvestors = null; } else {
      this.fcurTaxPaymentExitedInvestors = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetTaxPayable = null; } else {
      this.fcurNetTaxPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurForeignTaxCredit = null; } else {
      this.fcurForeignTaxCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendWithholdingPayment = null; } else {
      this.fcurDividendWithholdingPayment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredit = null; } else {
      this.fcurImputationCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidentWithholdingTax = null; } else {
      this.fcurResidentWithholdingTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAttributedNFI = null; } else {
      this.fcurIncomeAttributedNFI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxPaidNFI = null; } else {
      this.fcurTaxPaidNFI = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncludeIncomeLossAprFeb = null; } else {
      this.fblnIncludeIncomeLossAprFeb = Integer.valueOf(__cur_str);
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
    tblnz_rtnpieprd o = (tblnz_rtnpieprd) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpieprd o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalInvestmentValue", this.fcurTotalInvestmentValue);
    __sqoop$field_map.put("fcurGrossIncome", this.fcurGrossIncome);
    __sqoop$field_map.put("fcurDeductibleExpenses", this.fcurDeductibleExpenses);
    __sqoop$field_map.put("fcurNetIncome", this.fcurNetIncome);
    __sqoop$field_map.put("fcurNetLandIncome", this.fcurNetLandIncome);
    __sqoop$field_map.put("fcurCombinedIncome", this.fcurCombinedIncome);
    __sqoop$field_map.put("fcurFormationLoss", this.fcurFormationLoss);
    __sqoop$field_map.put("fcurLandLossBroughtForward", this.fcurLandLossBroughtForward);
    __sqoop$field_map.put("fcurLandLossCarryForward", this.fcurLandLossCarryForward);
    __sqoop$field_map.put("fcurLandLossClaimed", this.fcurLandLossClaimed);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalLoss", this.fcurTotalLoss);
    __sqoop$field_map.put("fcurIncomeRetained", this.fcurIncomeRetained);
    __sqoop$field_map.put("fcurIncomeExitedInvestors", this.fcurIncomeExitedInvestors);
    __sqoop$field_map.put("fcurInvestorExpenses", this.fcurInvestorExpenses);
    __sqoop$field_map.put("fcurTotalIncomeToAttribute", this.fcurTotalIncomeToAttribute);
    __sqoop$field_map.put("fcurTotalLossToAttribute", this.fcurTotalLossToAttribute);
    __sqoop$field_map.put("fcurIncomeAttributedZero", this.fcurIncomeAttributedZero);
    __sqoop$field_map.put("fcurLossAttributedZero", this.fcurLossAttributedZero);
    __sqoop$field_map.put("fcurIncomeAttributedLow", this.fcurIncomeAttributedLow);
    __sqoop$field_map.put("fcurLossAttributedLow", this.fcurLossAttributedLow);
    __sqoop$field_map.put("fcurIncomeAttributedMid", this.fcurIncomeAttributedMid);
    __sqoop$field_map.put("fcurLossAttributedMid", this.fcurLossAttributedMid);
    __sqoop$field_map.put("fcurIncomeAttributedTop", this.fcurIncomeAttributedTop);
    __sqoop$field_map.put("fcurLossAttributedTop", this.fcurLossAttributedTop);
    __sqoop$field_map.put("fcurTaxPayable", this.fcurTaxPayable);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fcurNetTaxPayable", this.fcurNetTaxPayable);
    __sqoop$field_map.put("fcurForeignTaxCredit", this.fcurForeignTaxCredit);
    __sqoop$field_map.put("fcurDividendWithholdingPayment", this.fcurDividendWithholdingPayment);
    __sqoop$field_map.put("fcurImputationCredit", this.fcurImputationCredit);
    __sqoop$field_map.put("fcurResidentWithholdingTax", this.fcurResidentWithholdingTax);
    __sqoop$field_map.put("fcurIncomeAttributedNFI", this.fcurIncomeAttributedNFI);
    __sqoop$field_map.put("fcurTaxPaidNFI", this.fcurTaxPaidNFI);
    __sqoop$field_map.put("fblnIncludeIncomeLossAprFeb", this.fblnIncludeIncomeLossAprFeb);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalInvestmentValue", this.fcurTotalInvestmentValue);
    __sqoop$field_map.put("fcurGrossIncome", this.fcurGrossIncome);
    __sqoop$field_map.put("fcurDeductibleExpenses", this.fcurDeductibleExpenses);
    __sqoop$field_map.put("fcurNetIncome", this.fcurNetIncome);
    __sqoop$field_map.put("fcurNetLandIncome", this.fcurNetLandIncome);
    __sqoop$field_map.put("fcurCombinedIncome", this.fcurCombinedIncome);
    __sqoop$field_map.put("fcurFormationLoss", this.fcurFormationLoss);
    __sqoop$field_map.put("fcurLandLossBroughtForward", this.fcurLandLossBroughtForward);
    __sqoop$field_map.put("fcurLandLossCarryForward", this.fcurLandLossCarryForward);
    __sqoop$field_map.put("fcurLandLossClaimed", this.fcurLandLossClaimed);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurTotalLoss", this.fcurTotalLoss);
    __sqoop$field_map.put("fcurIncomeRetained", this.fcurIncomeRetained);
    __sqoop$field_map.put("fcurIncomeExitedInvestors", this.fcurIncomeExitedInvestors);
    __sqoop$field_map.put("fcurInvestorExpenses", this.fcurInvestorExpenses);
    __sqoop$field_map.put("fcurTotalIncomeToAttribute", this.fcurTotalIncomeToAttribute);
    __sqoop$field_map.put("fcurTotalLossToAttribute", this.fcurTotalLossToAttribute);
    __sqoop$field_map.put("fcurIncomeAttributedZero", this.fcurIncomeAttributedZero);
    __sqoop$field_map.put("fcurLossAttributedZero", this.fcurLossAttributedZero);
    __sqoop$field_map.put("fcurIncomeAttributedLow", this.fcurIncomeAttributedLow);
    __sqoop$field_map.put("fcurLossAttributedLow", this.fcurLossAttributedLow);
    __sqoop$field_map.put("fcurIncomeAttributedMid", this.fcurIncomeAttributedMid);
    __sqoop$field_map.put("fcurLossAttributedMid", this.fcurLossAttributedMid);
    __sqoop$field_map.put("fcurIncomeAttributedTop", this.fcurIncomeAttributedTop);
    __sqoop$field_map.put("fcurLossAttributedTop", this.fcurLossAttributedTop);
    __sqoop$field_map.put("fcurTaxPayable", this.fcurTaxPayable);
    __sqoop$field_map.put("fcurTaxPaymentExitedInvestors", this.fcurTaxPaymentExitedInvestors);
    __sqoop$field_map.put("fcurNetTaxPayable", this.fcurNetTaxPayable);
    __sqoop$field_map.put("fcurForeignTaxCredit", this.fcurForeignTaxCredit);
    __sqoop$field_map.put("fcurDividendWithholdingPayment", this.fcurDividendWithholdingPayment);
    __sqoop$field_map.put("fcurImputationCredit", this.fcurImputationCredit);
    __sqoop$field_map.put("fcurResidentWithholdingTax", this.fcurResidentWithholdingTax);
    __sqoop$field_map.put("fcurIncomeAttributedNFI", this.fcurIncomeAttributedNFI);
    __sqoop$field_map.put("fcurTaxPaidNFI", this.fcurTaxPaidNFI);
    __sqoop$field_map.put("fblnIncludeIncomeLossAprFeb", this.fblnIncludeIncomeLossAprFeb);
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
