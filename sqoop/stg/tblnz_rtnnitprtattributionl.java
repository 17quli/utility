// ORM class for table 'tblnz_rtnnitprtattributionl'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:54:29 NZDT 2020
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

public class tblnz_rtnnitprtattributionl extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrOwnerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fstrOwnerName = (String)value;
      }
    });
    setters.put("fstrOwnerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fstrOwnerIRD = (String)value;
      }
    });
    setters.put("fcurOwnerPercentageAttr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerPercentageAttr = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerMaoriDist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerMaoriDist = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerRental", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerRental = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerPassiveIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerPassiveIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerSumOfIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerSumOfIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerExtinguishedLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerExtinguishedLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerOtherTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerOtherTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerNonAllowableDeduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerNonAllowableDeduction = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerNonAllowableBrghtFwd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerNonAllowableBrghtFwd = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerNonAllowableClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerNonAllowableClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerNonAllowableCarried", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerNonAllowableCarried = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOwnerDeduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurOwnerDeduction = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fcurResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionl.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitprtattributionl() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitprtattributionl with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_rtnnitprtattributionl with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrOwnerName;
  public String get_fstrOwnerName() {
    return fstrOwnerName;
  }
  public void set_fstrOwnerName(String fstrOwnerName) {
    this.fstrOwnerName = fstrOwnerName;
  }
  public tblnz_rtnnitprtattributionl with_fstrOwnerName(String fstrOwnerName) {
    this.fstrOwnerName = fstrOwnerName;
    return this;
  }
  private String fstrOwnerIRD;
  public String get_fstrOwnerIRD() {
    return fstrOwnerIRD;
  }
  public void set_fstrOwnerIRD(String fstrOwnerIRD) {
    this.fstrOwnerIRD = fstrOwnerIRD;
  }
  public tblnz_rtnnitprtattributionl with_fstrOwnerIRD(String fstrOwnerIRD) {
    this.fstrOwnerIRD = fstrOwnerIRD;
    return this;
  }
  private java.math.BigDecimal fcurOwnerPercentageAttr;
  public java.math.BigDecimal get_fcurOwnerPercentageAttr() {
    return fcurOwnerPercentageAttr;
  }
  public void set_fcurOwnerPercentageAttr(java.math.BigDecimal fcurOwnerPercentageAttr) {
    this.fcurOwnerPercentageAttr = fcurOwnerPercentageAttr;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerPercentageAttr(java.math.BigDecimal fcurOwnerPercentageAttr) {
    this.fcurOwnerPercentageAttr = fcurOwnerPercentageAttr;
    return this;
  }
  private java.math.BigDecimal fcurOwnerInterest;
  public java.math.BigDecimal get_fcurOwnerInterest() {
    return fcurOwnerInterest;
  }
  public void set_fcurOwnerInterest(java.math.BigDecimal fcurOwnerInterest) {
    this.fcurOwnerInterest = fcurOwnerInterest;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerInterest(java.math.BigDecimal fcurOwnerInterest) {
    this.fcurOwnerInterest = fcurOwnerInterest;
    return this;
  }
  private java.math.BigDecimal fcurOwnerDividends;
  public java.math.BigDecimal get_fcurOwnerDividends() {
    return fcurOwnerDividends;
  }
  public void set_fcurOwnerDividends(java.math.BigDecimal fcurOwnerDividends) {
    this.fcurOwnerDividends = fcurOwnerDividends;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerDividends(java.math.BigDecimal fcurOwnerDividends) {
    this.fcurOwnerDividends = fcurOwnerDividends;
    return this;
  }
  private java.math.BigDecimal fcurOwnerMaoriDist;
  public java.math.BigDecimal get_fcurOwnerMaoriDist() {
    return fcurOwnerMaoriDist;
  }
  public void set_fcurOwnerMaoriDist(java.math.BigDecimal fcurOwnerMaoriDist) {
    this.fcurOwnerMaoriDist = fcurOwnerMaoriDist;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerMaoriDist(java.math.BigDecimal fcurOwnerMaoriDist) {
    this.fcurOwnerMaoriDist = fcurOwnerMaoriDist;
    return this;
  }
  private java.math.BigDecimal fcurOwnerOverseas;
  public java.math.BigDecimal get_fcurOwnerOverseas() {
    return fcurOwnerOverseas;
  }
  public void set_fcurOwnerOverseas(java.math.BigDecimal fcurOwnerOverseas) {
    this.fcurOwnerOverseas = fcurOwnerOverseas;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerOverseas(java.math.BigDecimal fcurOwnerOverseas) {
    this.fcurOwnerOverseas = fcurOwnerOverseas;
    return this;
  }
  private java.math.BigDecimal fcurOwnerRental;
  public java.math.BigDecimal get_fcurOwnerRental() {
    return fcurOwnerRental;
  }
  public void set_fcurOwnerRental(java.math.BigDecimal fcurOwnerRental) {
    this.fcurOwnerRental = fcurOwnerRental;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerRental(java.math.BigDecimal fcurOwnerRental) {
    this.fcurOwnerRental = fcurOwnerRental;
    return this;
  }
  private java.math.BigDecimal fcurOwnerPassiveIncome;
  public java.math.BigDecimal get_fcurOwnerPassiveIncome() {
    return fcurOwnerPassiveIncome;
  }
  public void set_fcurOwnerPassiveIncome(java.math.BigDecimal fcurOwnerPassiveIncome) {
    this.fcurOwnerPassiveIncome = fcurOwnerPassiveIncome;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerPassiveIncome(java.math.BigDecimal fcurOwnerPassiveIncome) {
    this.fcurOwnerPassiveIncome = fcurOwnerPassiveIncome;
    return this;
  }
  private java.math.BigDecimal fcurOwnerOtherIncome;
  public java.math.BigDecimal get_fcurOwnerOtherIncome() {
    return fcurOwnerOtherIncome;
  }
  public void set_fcurOwnerOtherIncome(java.math.BigDecimal fcurOwnerOtherIncome) {
    this.fcurOwnerOtherIncome = fcurOwnerOtherIncome;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerOtherIncome(java.math.BigDecimal fcurOwnerOtherIncome) {
    this.fcurOwnerOtherIncome = fcurOwnerOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurOwnerTotalIncome;
  public java.math.BigDecimal get_fcurOwnerTotalIncome() {
    return fcurOwnerTotalIncome;
  }
  public void set_fcurOwnerTotalIncome(java.math.BigDecimal fcurOwnerTotalIncome) {
    this.fcurOwnerTotalIncome = fcurOwnerTotalIncome;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerTotalIncome(java.math.BigDecimal fcurOwnerTotalIncome) {
    this.fcurOwnerTotalIncome = fcurOwnerTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurOwnerSumOfIncome;
  public java.math.BigDecimal get_fcurOwnerSumOfIncome() {
    return fcurOwnerSumOfIncome;
  }
  public void set_fcurOwnerSumOfIncome(java.math.BigDecimal fcurOwnerSumOfIncome) {
    this.fcurOwnerSumOfIncome = fcurOwnerSumOfIncome;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerSumOfIncome(java.math.BigDecimal fcurOwnerSumOfIncome) {
    this.fcurOwnerSumOfIncome = fcurOwnerSumOfIncome;
    return this;
  }
  private java.math.BigDecimal fcurOwnerExtinguishedLosses;
  public java.math.BigDecimal get_fcurOwnerExtinguishedLosses() {
    return fcurOwnerExtinguishedLosses;
  }
  public void set_fcurOwnerExtinguishedLosses(java.math.BigDecimal fcurOwnerExtinguishedLosses) {
    this.fcurOwnerExtinguishedLosses = fcurOwnerExtinguishedLosses;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerExtinguishedLosses(java.math.BigDecimal fcurOwnerExtinguishedLosses) {
    this.fcurOwnerExtinguishedLosses = fcurOwnerExtinguishedLosses;
    return this;
  }
  private java.math.BigDecimal fcurOwnerOverseasTax;
  public java.math.BigDecimal get_fcurOwnerOverseasTax() {
    return fcurOwnerOverseasTax;
  }
  public void set_fcurOwnerOverseasTax(java.math.BigDecimal fcurOwnerOverseasTax) {
    this.fcurOwnerOverseasTax = fcurOwnerOverseasTax;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerOverseasTax(java.math.BigDecimal fcurOwnerOverseasTax) {
    this.fcurOwnerOverseasTax = fcurOwnerOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurOwnerImputation;
  public java.math.BigDecimal get_fcurOwnerImputation() {
    return fcurOwnerImputation;
  }
  public void set_fcurOwnerImputation(java.math.BigDecimal fcurOwnerImputation) {
    this.fcurOwnerImputation = fcurOwnerImputation;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerImputation(java.math.BigDecimal fcurOwnerImputation) {
    this.fcurOwnerImputation = fcurOwnerImputation;
    return this;
  }
  private java.math.BigDecimal fcurOwnerOtherTaxCredits;
  public java.math.BigDecimal get_fcurOwnerOtherTaxCredits() {
    return fcurOwnerOtherTaxCredits;
  }
  public void set_fcurOwnerOtherTaxCredits(java.math.BigDecimal fcurOwnerOtherTaxCredits) {
    this.fcurOwnerOtherTaxCredits = fcurOwnerOtherTaxCredits;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerOtherTaxCredits(java.math.BigDecimal fcurOwnerOtherTaxCredits) {
    this.fcurOwnerOtherTaxCredits = fcurOwnerOtherTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurOwnerNonAllowableDeduction;
  public java.math.BigDecimal get_fcurOwnerNonAllowableDeduction() {
    return fcurOwnerNonAllowableDeduction;
  }
  public void set_fcurOwnerNonAllowableDeduction(java.math.BigDecimal fcurOwnerNonAllowableDeduction) {
    this.fcurOwnerNonAllowableDeduction = fcurOwnerNonAllowableDeduction;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerNonAllowableDeduction(java.math.BigDecimal fcurOwnerNonAllowableDeduction) {
    this.fcurOwnerNonAllowableDeduction = fcurOwnerNonAllowableDeduction;
    return this;
  }
  private java.math.BigDecimal fcurOwnerNonAllowableBrghtFwd;
  public java.math.BigDecimal get_fcurOwnerNonAllowableBrghtFwd() {
    return fcurOwnerNonAllowableBrghtFwd;
  }
  public void set_fcurOwnerNonAllowableBrghtFwd(java.math.BigDecimal fcurOwnerNonAllowableBrghtFwd) {
    this.fcurOwnerNonAllowableBrghtFwd = fcurOwnerNonAllowableBrghtFwd;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerNonAllowableBrghtFwd(java.math.BigDecimal fcurOwnerNonAllowableBrghtFwd) {
    this.fcurOwnerNonAllowableBrghtFwd = fcurOwnerNonAllowableBrghtFwd;
    return this;
  }
  private java.math.BigDecimal fcurOwnerNonAllowableClaimed;
  public java.math.BigDecimal get_fcurOwnerNonAllowableClaimed() {
    return fcurOwnerNonAllowableClaimed;
  }
  public void set_fcurOwnerNonAllowableClaimed(java.math.BigDecimal fcurOwnerNonAllowableClaimed) {
    this.fcurOwnerNonAllowableClaimed = fcurOwnerNonAllowableClaimed;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerNonAllowableClaimed(java.math.BigDecimal fcurOwnerNonAllowableClaimed) {
    this.fcurOwnerNonAllowableClaimed = fcurOwnerNonAllowableClaimed;
    return this;
  }
  private java.math.BigDecimal fcurOwnerNonAllowableCarried;
  public java.math.BigDecimal get_fcurOwnerNonAllowableCarried() {
    return fcurOwnerNonAllowableCarried;
  }
  public void set_fcurOwnerNonAllowableCarried(java.math.BigDecimal fcurOwnerNonAllowableCarried) {
    this.fcurOwnerNonAllowableCarried = fcurOwnerNonAllowableCarried;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerNonAllowableCarried(java.math.BigDecimal fcurOwnerNonAllowableCarried) {
    this.fcurOwnerNonAllowableCarried = fcurOwnerNonAllowableCarried;
    return this;
  }
  private java.math.BigDecimal fcurOwnerDeduction;
  public java.math.BigDecimal get_fcurOwnerDeduction() {
    return fcurOwnerDeduction;
  }
  public void set_fcurOwnerDeduction(java.math.BigDecimal fcurOwnerDeduction) {
    this.fcurOwnerDeduction = fcurOwnerDeduction;
  }
  public tblnz_rtnnitprtattributionl with_fcurOwnerDeduction(java.math.BigDecimal fcurOwnerDeduction) {
    this.fcurOwnerDeduction = fcurOwnerDeduction;
    return this;
  }
  private java.math.BigDecimal fcurResIncome;
  public java.math.BigDecimal get_fcurResIncome() {
    return fcurResIncome;
  }
  public void set_fcurResIncome(java.math.BigDecimal fcurResIncome) {
    this.fcurResIncome = fcurResIncome;
  }
  public tblnz_rtnnitprtattributionl with_fcurResIncome(java.math.BigDecimal fcurResIncome) {
    this.fcurResIncome = fcurResIncome;
    return this;
  }
  private java.math.BigDecimal fcurResDeductions;
  public java.math.BigDecimal get_fcurResDeductions() {
    return fcurResDeductions;
  }
  public void set_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
  }
  public tblnz_rtnnitprtattributionl with_fcurResDeductions(java.math.BigDecimal fcurResDeductions) {
    this.fcurResDeductions = fcurResDeductions;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnitprtattributionl with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitprtattributionl with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprtattributionl)) {
      return false;
    }
    tblnz_rtnnitprtattributionl that = (tblnz_rtnnitprtattributionl) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrOwnerName == null ? that.fstrOwnerName == null : this.fstrOwnerName.equals(that.fstrOwnerName));
    equal = equal && (this.fstrOwnerIRD == null ? that.fstrOwnerIRD == null : this.fstrOwnerIRD.equals(that.fstrOwnerIRD));
    equal = equal && (this.fcurOwnerPercentageAttr == null ? that.fcurOwnerPercentageAttr == null : this.fcurOwnerPercentageAttr.equals(that.fcurOwnerPercentageAttr));
    equal = equal && (this.fcurOwnerInterest == null ? that.fcurOwnerInterest == null : this.fcurOwnerInterest.equals(that.fcurOwnerInterest));
    equal = equal && (this.fcurOwnerDividends == null ? that.fcurOwnerDividends == null : this.fcurOwnerDividends.equals(that.fcurOwnerDividends));
    equal = equal && (this.fcurOwnerMaoriDist == null ? that.fcurOwnerMaoriDist == null : this.fcurOwnerMaoriDist.equals(that.fcurOwnerMaoriDist));
    equal = equal && (this.fcurOwnerOverseas == null ? that.fcurOwnerOverseas == null : this.fcurOwnerOverseas.equals(that.fcurOwnerOverseas));
    equal = equal && (this.fcurOwnerRental == null ? that.fcurOwnerRental == null : this.fcurOwnerRental.equals(that.fcurOwnerRental));
    equal = equal && (this.fcurOwnerPassiveIncome == null ? that.fcurOwnerPassiveIncome == null : this.fcurOwnerPassiveIncome.equals(that.fcurOwnerPassiveIncome));
    equal = equal && (this.fcurOwnerOtherIncome == null ? that.fcurOwnerOtherIncome == null : this.fcurOwnerOtherIncome.equals(that.fcurOwnerOtherIncome));
    equal = equal && (this.fcurOwnerTotalIncome == null ? that.fcurOwnerTotalIncome == null : this.fcurOwnerTotalIncome.equals(that.fcurOwnerTotalIncome));
    equal = equal && (this.fcurOwnerSumOfIncome == null ? that.fcurOwnerSumOfIncome == null : this.fcurOwnerSumOfIncome.equals(that.fcurOwnerSumOfIncome));
    equal = equal && (this.fcurOwnerExtinguishedLosses == null ? that.fcurOwnerExtinguishedLosses == null : this.fcurOwnerExtinguishedLosses.equals(that.fcurOwnerExtinguishedLosses));
    equal = equal && (this.fcurOwnerOverseasTax == null ? that.fcurOwnerOverseasTax == null : this.fcurOwnerOverseasTax.equals(that.fcurOwnerOverseasTax));
    equal = equal && (this.fcurOwnerImputation == null ? that.fcurOwnerImputation == null : this.fcurOwnerImputation.equals(that.fcurOwnerImputation));
    equal = equal && (this.fcurOwnerOtherTaxCredits == null ? that.fcurOwnerOtherTaxCredits == null : this.fcurOwnerOtherTaxCredits.equals(that.fcurOwnerOtherTaxCredits));
    equal = equal && (this.fcurOwnerNonAllowableDeduction == null ? that.fcurOwnerNonAllowableDeduction == null : this.fcurOwnerNonAllowableDeduction.equals(that.fcurOwnerNonAllowableDeduction));
    equal = equal && (this.fcurOwnerNonAllowableBrghtFwd == null ? that.fcurOwnerNonAllowableBrghtFwd == null : this.fcurOwnerNonAllowableBrghtFwd.equals(that.fcurOwnerNonAllowableBrghtFwd));
    equal = equal && (this.fcurOwnerNonAllowableClaimed == null ? that.fcurOwnerNonAllowableClaimed == null : this.fcurOwnerNonAllowableClaimed.equals(that.fcurOwnerNonAllowableClaimed));
    equal = equal && (this.fcurOwnerNonAllowableCarried == null ? that.fcurOwnerNonAllowableCarried == null : this.fcurOwnerNonAllowableCarried.equals(that.fcurOwnerNonAllowableCarried));
    equal = equal && (this.fcurOwnerDeduction == null ? that.fcurOwnerDeduction == null : this.fcurOwnerDeduction.equals(that.fcurOwnerDeduction));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprtattributionl)) {
      return false;
    }
    tblnz_rtnnitprtattributionl that = (tblnz_rtnnitprtattributionl) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrOwnerName == null ? that.fstrOwnerName == null : this.fstrOwnerName.equals(that.fstrOwnerName));
    equal = equal && (this.fstrOwnerIRD == null ? that.fstrOwnerIRD == null : this.fstrOwnerIRD.equals(that.fstrOwnerIRD));
    equal = equal && (this.fcurOwnerPercentageAttr == null ? that.fcurOwnerPercentageAttr == null : this.fcurOwnerPercentageAttr.equals(that.fcurOwnerPercentageAttr));
    equal = equal && (this.fcurOwnerInterest == null ? that.fcurOwnerInterest == null : this.fcurOwnerInterest.equals(that.fcurOwnerInterest));
    equal = equal && (this.fcurOwnerDividends == null ? that.fcurOwnerDividends == null : this.fcurOwnerDividends.equals(that.fcurOwnerDividends));
    equal = equal && (this.fcurOwnerMaoriDist == null ? that.fcurOwnerMaoriDist == null : this.fcurOwnerMaoriDist.equals(that.fcurOwnerMaoriDist));
    equal = equal && (this.fcurOwnerOverseas == null ? that.fcurOwnerOverseas == null : this.fcurOwnerOverseas.equals(that.fcurOwnerOverseas));
    equal = equal && (this.fcurOwnerRental == null ? that.fcurOwnerRental == null : this.fcurOwnerRental.equals(that.fcurOwnerRental));
    equal = equal && (this.fcurOwnerPassiveIncome == null ? that.fcurOwnerPassiveIncome == null : this.fcurOwnerPassiveIncome.equals(that.fcurOwnerPassiveIncome));
    equal = equal && (this.fcurOwnerOtherIncome == null ? that.fcurOwnerOtherIncome == null : this.fcurOwnerOtherIncome.equals(that.fcurOwnerOtherIncome));
    equal = equal && (this.fcurOwnerTotalIncome == null ? that.fcurOwnerTotalIncome == null : this.fcurOwnerTotalIncome.equals(that.fcurOwnerTotalIncome));
    equal = equal && (this.fcurOwnerSumOfIncome == null ? that.fcurOwnerSumOfIncome == null : this.fcurOwnerSumOfIncome.equals(that.fcurOwnerSumOfIncome));
    equal = equal && (this.fcurOwnerExtinguishedLosses == null ? that.fcurOwnerExtinguishedLosses == null : this.fcurOwnerExtinguishedLosses.equals(that.fcurOwnerExtinguishedLosses));
    equal = equal && (this.fcurOwnerOverseasTax == null ? that.fcurOwnerOverseasTax == null : this.fcurOwnerOverseasTax.equals(that.fcurOwnerOverseasTax));
    equal = equal && (this.fcurOwnerImputation == null ? that.fcurOwnerImputation == null : this.fcurOwnerImputation.equals(that.fcurOwnerImputation));
    equal = equal && (this.fcurOwnerOtherTaxCredits == null ? that.fcurOwnerOtherTaxCredits == null : this.fcurOwnerOtherTaxCredits.equals(that.fcurOwnerOtherTaxCredits));
    equal = equal && (this.fcurOwnerNonAllowableDeduction == null ? that.fcurOwnerNonAllowableDeduction == null : this.fcurOwnerNonAllowableDeduction.equals(that.fcurOwnerNonAllowableDeduction));
    equal = equal && (this.fcurOwnerNonAllowableBrghtFwd == null ? that.fcurOwnerNonAllowableBrghtFwd == null : this.fcurOwnerNonAllowableBrghtFwd.equals(that.fcurOwnerNonAllowableBrghtFwd));
    equal = equal && (this.fcurOwnerNonAllowableClaimed == null ? that.fcurOwnerNonAllowableClaimed == null : this.fcurOwnerNonAllowableClaimed.equals(that.fcurOwnerNonAllowableClaimed));
    equal = equal && (this.fcurOwnerNonAllowableCarried == null ? that.fcurOwnerNonAllowableCarried == null : this.fcurOwnerNonAllowableCarried.equals(that.fcurOwnerNonAllowableCarried));
    equal = equal && (this.fcurOwnerDeduction == null ? that.fcurOwnerDeduction == null : this.fcurOwnerDeduction.equals(that.fcurOwnerDeduction));
    equal = equal && (this.fcurResIncome == null ? that.fcurResIncome == null : this.fcurResIncome.equals(that.fcurResIncome));
    equal = equal && (this.fcurResDeductions == null ? that.fcurResDeductions == null : this.fcurResDeductions.equals(that.fcurResDeductions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrOwnerName = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrOwnerIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurOwnerPercentageAttr = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOwnerInterest = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurOwnerDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurOwnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOwnerOverseas = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurOwnerRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOwnerPassiveIncome = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOwnerOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurOwnerTotalIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOwnerSumOfIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOwnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurOwnerOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurOwnerImputation = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOwnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOwnerNonAllowableDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOwnerNonAllowableBrghtFwd = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOwnerNonAllowableClaimed = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurOwnerNonAllowableCarried = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurOwnerDeduction = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrOwnerName = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrOwnerIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurOwnerPercentageAttr = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOwnerInterest = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurOwnerDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurOwnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurOwnerOverseas = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurOwnerRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurOwnerPassiveIncome = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurOwnerOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurOwnerTotalIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurOwnerSumOfIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurOwnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurOwnerOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurOwnerImputation = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOwnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurOwnerNonAllowableDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurOwnerNonAllowableBrghtFwd = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurOwnerNonAllowableClaimed = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurOwnerNonAllowableCarried = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurOwnerDeduction = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurResIncome = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurResDeductions = JdbcWritableBridge.readBigDecimal(25, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwnerName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwnerIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerPercentageAttr, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerInterest, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOverseas, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerPassiveIncome, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerTotalIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerSumOfIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerExtinguishedLosses, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerImputation, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOtherTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableBrghtFwd, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableClaimed, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableCarried, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerDeduction, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwnerName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwnerIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerPercentageAttr, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerInterest, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOverseas, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerPassiveIncome, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerTotalIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerSumOfIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerExtinguishedLosses, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerImputation, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerOtherTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableBrghtFwd, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableClaimed, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerNonAllowableCarried, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOwnerDeduction, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResIncome, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResDeductions, 25 + __off, 3, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwnerName = null;
    } else {
    this.fstrOwnerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwnerIRD = null;
    } else {
    this.fstrOwnerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerPercentageAttr = null;
    } else {
    this.fcurOwnerPercentageAttr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerInterest = null;
    } else {
    this.fcurOwnerInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerDividends = null;
    } else {
    this.fcurOwnerDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerMaoriDist = null;
    } else {
    this.fcurOwnerMaoriDist = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerOverseas = null;
    } else {
    this.fcurOwnerOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerRental = null;
    } else {
    this.fcurOwnerRental = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerPassiveIncome = null;
    } else {
    this.fcurOwnerPassiveIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerOtherIncome = null;
    } else {
    this.fcurOwnerOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerTotalIncome = null;
    } else {
    this.fcurOwnerTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerSumOfIncome = null;
    } else {
    this.fcurOwnerSumOfIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerExtinguishedLosses = null;
    } else {
    this.fcurOwnerExtinguishedLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerOverseasTax = null;
    } else {
    this.fcurOwnerOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerImputation = null;
    } else {
    this.fcurOwnerImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerOtherTaxCredits = null;
    } else {
    this.fcurOwnerOtherTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerNonAllowableDeduction = null;
    } else {
    this.fcurOwnerNonAllowableDeduction = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerNonAllowableBrghtFwd = null;
    } else {
    this.fcurOwnerNonAllowableBrghtFwd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerNonAllowableClaimed = null;
    } else {
    this.fcurOwnerNonAllowableClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerNonAllowableCarried = null;
    } else {
    this.fcurOwnerNonAllowableCarried = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOwnerDeduction = null;
    } else {
    this.fcurOwnerDeduction = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResIncome = null;
    } else {
    this.fcurResIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResDeductions = null;
    } else {
    this.fcurResDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrOwnerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwnerName);
    }
    if (null == this.fstrOwnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwnerIRD);
    }
    if (null == this.fcurOwnerPercentageAttr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerPercentageAttr, __dataOut);
    }
    if (null == this.fcurOwnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerInterest, __dataOut);
    }
    if (null == this.fcurOwnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerDividends, __dataOut);
    }
    if (null == this.fcurOwnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerMaoriDist, __dataOut);
    }
    if (null == this.fcurOwnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOverseas, __dataOut);
    }
    if (null == this.fcurOwnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerRental, __dataOut);
    }
    if (null == this.fcurOwnerPassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerPassiveIncome, __dataOut);
    }
    if (null == this.fcurOwnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOtherIncome, __dataOut);
    }
    if (null == this.fcurOwnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerTotalIncome, __dataOut);
    }
    if (null == this.fcurOwnerSumOfIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerSumOfIncome, __dataOut);
    }
    if (null == this.fcurOwnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurOwnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOverseasTax, __dataOut);
    }
    if (null == this.fcurOwnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerImputation, __dataOut);
    }
    if (null == this.fcurOwnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableDeduction, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableBrghtFwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableBrghtFwd, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableClaimed, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableCarried) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableCarried, __dataOut);
    }
    if (null == this.fcurOwnerDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerDeduction, __dataOut);
    }
    if (null == this.fcurResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResIncome, __dataOut);
    }
    if (null == this.fcurResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductions, __dataOut);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrOwnerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwnerName);
    }
    if (null == this.fstrOwnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwnerIRD);
    }
    if (null == this.fcurOwnerPercentageAttr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerPercentageAttr, __dataOut);
    }
    if (null == this.fcurOwnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerInterest, __dataOut);
    }
    if (null == this.fcurOwnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerDividends, __dataOut);
    }
    if (null == this.fcurOwnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerMaoriDist, __dataOut);
    }
    if (null == this.fcurOwnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOverseas, __dataOut);
    }
    if (null == this.fcurOwnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerRental, __dataOut);
    }
    if (null == this.fcurOwnerPassiveIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerPassiveIncome, __dataOut);
    }
    if (null == this.fcurOwnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOtherIncome, __dataOut);
    }
    if (null == this.fcurOwnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerTotalIncome, __dataOut);
    }
    if (null == this.fcurOwnerSumOfIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerSumOfIncome, __dataOut);
    }
    if (null == this.fcurOwnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurOwnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOverseasTax, __dataOut);
    }
    if (null == this.fcurOwnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerImputation, __dataOut);
    }
    if (null == this.fcurOwnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableDeduction, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableBrghtFwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableBrghtFwd, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableClaimed, __dataOut);
    }
    if (null == this.fcurOwnerNonAllowableCarried) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerNonAllowableCarried, __dataOut);
    }
    if (null == this.fcurOwnerDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOwnerDeduction, __dataOut);
    }
    if (null == this.fcurResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResIncome, __dataOut);
    }
    if (null == this.fcurResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResDeductions, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwnerName==null?"\\N":fstrOwnerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwnerIRD==null?"\\N":fstrOwnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerPercentageAttr==null?"\\N":fcurOwnerPercentageAttr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerInterest==null?"\\N":fcurOwnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerDividends==null?"\\N":fcurOwnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerMaoriDist==null?"\\N":fcurOwnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOverseas==null?"\\N":fcurOwnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerRental==null?"\\N":fcurOwnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerPassiveIncome==null?"\\N":fcurOwnerPassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOtherIncome==null?"\\N":fcurOwnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerTotalIncome==null?"\\N":fcurOwnerTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerSumOfIncome==null?"\\N":fcurOwnerSumOfIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerExtinguishedLosses==null?"\\N":fcurOwnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOverseasTax==null?"\\N":fcurOwnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerImputation==null?"\\N":fcurOwnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOtherTaxCredits==null?"\\N":fcurOwnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableDeduction==null?"\\N":fcurOwnerNonAllowableDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableBrghtFwd==null?"\\N":fcurOwnerNonAllowableBrghtFwd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableClaimed==null?"\\N":fcurOwnerNonAllowableClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableCarried==null?"\\N":fcurOwnerNonAllowableCarried.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerDeduction==null?"\\N":fcurOwnerDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwnerName==null?"\\N":fstrOwnerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwnerIRD==null?"\\N":fstrOwnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerPercentageAttr==null?"\\N":fcurOwnerPercentageAttr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerInterest==null?"\\N":fcurOwnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerDividends==null?"\\N":fcurOwnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerMaoriDist==null?"\\N":fcurOwnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOverseas==null?"\\N":fcurOwnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerRental==null?"\\N":fcurOwnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerPassiveIncome==null?"\\N":fcurOwnerPassiveIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOtherIncome==null?"\\N":fcurOwnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerTotalIncome==null?"\\N":fcurOwnerTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerSumOfIncome==null?"\\N":fcurOwnerSumOfIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerExtinguishedLosses==null?"\\N":fcurOwnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOverseasTax==null?"\\N":fcurOwnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerImputation==null?"\\N":fcurOwnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerOtherTaxCredits==null?"\\N":fcurOwnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableDeduction==null?"\\N":fcurOwnerNonAllowableDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableBrghtFwd==null?"\\N":fcurOwnerNonAllowableBrghtFwd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableClaimed==null?"\\N":fcurOwnerNonAllowableClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerNonAllowableCarried==null?"\\N":fcurOwnerNonAllowableCarried.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOwnerDeduction==null?"\\N":fcurOwnerDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResIncome==null?"\\N":fcurResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResDeductions==null?"\\N":fcurResDeductions.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwnerName = null; } else {
      this.fstrOwnerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwnerIRD = null; } else {
      this.fstrOwnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerPercentageAttr = null; } else {
      this.fcurOwnerPercentageAttr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerInterest = null; } else {
      this.fcurOwnerInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerDividends = null; } else {
      this.fcurOwnerDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerMaoriDist = null; } else {
      this.fcurOwnerMaoriDist = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOverseas = null; } else {
      this.fcurOwnerOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerRental = null; } else {
      this.fcurOwnerRental = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerPassiveIncome = null; } else {
      this.fcurOwnerPassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOtherIncome = null; } else {
      this.fcurOwnerOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerTotalIncome = null; } else {
      this.fcurOwnerTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerSumOfIncome = null; } else {
      this.fcurOwnerSumOfIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerExtinguishedLosses = null; } else {
      this.fcurOwnerExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOverseasTax = null; } else {
      this.fcurOwnerOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerImputation = null; } else {
      this.fcurOwnerImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOtherTaxCredits = null; } else {
      this.fcurOwnerOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableDeduction = null; } else {
      this.fcurOwnerNonAllowableDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableBrghtFwd = null; } else {
      this.fcurOwnerNonAllowableBrghtFwd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableClaimed = null; } else {
      this.fcurOwnerNonAllowableClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableCarried = null; } else {
      this.fcurOwnerNonAllowableCarried = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerDeduction = null; } else {
      this.fcurOwnerDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResIncome = null; } else {
      this.fcurResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductions = null; } else {
      this.fcurResDeductions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwnerName = null; } else {
      this.fstrOwnerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwnerIRD = null; } else {
      this.fstrOwnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerPercentageAttr = null; } else {
      this.fcurOwnerPercentageAttr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerInterest = null; } else {
      this.fcurOwnerInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerDividends = null; } else {
      this.fcurOwnerDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerMaoriDist = null; } else {
      this.fcurOwnerMaoriDist = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOverseas = null; } else {
      this.fcurOwnerOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerRental = null; } else {
      this.fcurOwnerRental = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerPassiveIncome = null; } else {
      this.fcurOwnerPassiveIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOtherIncome = null; } else {
      this.fcurOwnerOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerTotalIncome = null; } else {
      this.fcurOwnerTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerSumOfIncome = null; } else {
      this.fcurOwnerSumOfIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerExtinguishedLosses = null; } else {
      this.fcurOwnerExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOverseasTax = null; } else {
      this.fcurOwnerOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerImputation = null; } else {
      this.fcurOwnerImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerOtherTaxCredits = null; } else {
      this.fcurOwnerOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableDeduction = null; } else {
      this.fcurOwnerNonAllowableDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableBrghtFwd = null; } else {
      this.fcurOwnerNonAllowableBrghtFwd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableClaimed = null; } else {
      this.fcurOwnerNonAllowableClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerNonAllowableCarried = null; } else {
      this.fcurOwnerNonAllowableCarried = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOwnerDeduction = null; } else {
      this.fcurOwnerDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResIncome = null; } else {
      this.fcurResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResDeductions = null; } else {
      this.fcurResDeductions = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnnitprtattributionl o = (tblnz_rtnnitprtattributionl) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitprtattributionl o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrOwnerName", this.fstrOwnerName);
    __sqoop$field_map.put("fstrOwnerIRD", this.fstrOwnerIRD);
    __sqoop$field_map.put("fcurOwnerPercentageAttr", this.fcurOwnerPercentageAttr);
    __sqoop$field_map.put("fcurOwnerInterest", this.fcurOwnerInterest);
    __sqoop$field_map.put("fcurOwnerDividends", this.fcurOwnerDividends);
    __sqoop$field_map.put("fcurOwnerMaoriDist", this.fcurOwnerMaoriDist);
    __sqoop$field_map.put("fcurOwnerOverseas", this.fcurOwnerOverseas);
    __sqoop$field_map.put("fcurOwnerRental", this.fcurOwnerRental);
    __sqoop$field_map.put("fcurOwnerPassiveIncome", this.fcurOwnerPassiveIncome);
    __sqoop$field_map.put("fcurOwnerOtherIncome", this.fcurOwnerOtherIncome);
    __sqoop$field_map.put("fcurOwnerTotalIncome", this.fcurOwnerTotalIncome);
    __sqoop$field_map.put("fcurOwnerSumOfIncome", this.fcurOwnerSumOfIncome);
    __sqoop$field_map.put("fcurOwnerExtinguishedLosses", this.fcurOwnerExtinguishedLosses);
    __sqoop$field_map.put("fcurOwnerOverseasTax", this.fcurOwnerOverseasTax);
    __sqoop$field_map.put("fcurOwnerImputation", this.fcurOwnerImputation);
    __sqoop$field_map.put("fcurOwnerOtherTaxCredits", this.fcurOwnerOtherTaxCredits);
    __sqoop$field_map.put("fcurOwnerNonAllowableDeduction", this.fcurOwnerNonAllowableDeduction);
    __sqoop$field_map.put("fcurOwnerNonAllowableBrghtFwd", this.fcurOwnerNonAllowableBrghtFwd);
    __sqoop$field_map.put("fcurOwnerNonAllowableClaimed", this.fcurOwnerNonAllowableClaimed);
    __sqoop$field_map.put("fcurOwnerNonAllowableCarried", this.fcurOwnerNonAllowableCarried);
    __sqoop$field_map.put("fcurOwnerDeduction", this.fcurOwnerDeduction);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrOwnerName", this.fstrOwnerName);
    __sqoop$field_map.put("fstrOwnerIRD", this.fstrOwnerIRD);
    __sqoop$field_map.put("fcurOwnerPercentageAttr", this.fcurOwnerPercentageAttr);
    __sqoop$field_map.put("fcurOwnerInterest", this.fcurOwnerInterest);
    __sqoop$field_map.put("fcurOwnerDividends", this.fcurOwnerDividends);
    __sqoop$field_map.put("fcurOwnerMaoriDist", this.fcurOwnerMaoriDist);
    __sqoop$field_map.put("fcurOwnerOverseas", this.fcurOwnerOverseas);
    __sqoop$field_map.put("fcurOwnerRental", this.fcurOwnerRental);
    __sqoop$field_map.put("fcurOwnerPassiveIncome", this.fcurOwnerPassiveIncome);
    __sqoop$field_map.put("fcurOwnerOtherIncome", this.fcurOwnerOtherIncome);
    __sqoop$field_map.put("fcurOwnerTotalIncome", this.fcurOwnerTotalIncome);
    __sqoop$field_map.put("fcurOwnerSumOfIncome", this.fcurOwnerSumOfIncome);
    __sqoop$field_map.put("fcurOwnerExtinguishedLosses", this.fcurOwnerExtinguishedLosses);
    __sqoop$field_map.put("fcurOwnerOverseasTax", this.fcurOwnerOverseasTax);
    __sqoop$field_map.put("fcurOwnerImputation", this.fcurOwnerImputation);
    __sqoop$field_map.put("fcurOwnerOtherTaxCredits", this.fcurOwnerOtherTaxCredits);
    __sqoop$field_map.put("fcurOwnerNonAllowableDeduction", this.fcurOwnerNonAllowableDeduction);
    __sqoop$field_map.put("fcurOwnerNonAllowableBrghtFwd", this.fcurOwnerNonAllowableBrghtFwd);
    __sqoop$field_map.put("fcurOwnerNonAllowableClaimed", this.fcurOwnerNonAllowableClaimed);
    __sqoop$field_map.put("fcurOwnerNonAllowableCarried", this.fcurOwnerNonAllowableCarried);
    __sqoop$field_map.put("fcurOwnerDeduction", this.fcurOwnerDeduction);
    __sqoop$field_map.put("fcurResIncome", this.fcurResIncome);
    __sqoop$field_map.put("fcurResDeductions", this.fcurResDeductions);
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
