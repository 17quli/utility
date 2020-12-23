// ORM class for table 'tblnz_rtnnitprtattributionp'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:04:17 NZDT 2020
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

public class tblnz_rtnnitprtattributionp extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrPartnerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fstrPartnerName = (String)value;
      }
    });
    setters.put("fstrPartnerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fstrPartnerIRD = (String)value;
      }
    });
    setters.put("fcurPartnerPercentageAttr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerPercentageAttr = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerMaoriDist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerMaoriDist = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerRental", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerRental = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherPassive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerOtherPassive = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerSumOfIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerSumOfIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerExtinguishedLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerExtinguishedLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerOtherTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerDeduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerDeduction = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fcurPartnerResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnitprtattributionp.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnitprtattributionp() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnnitprtattributionp with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_rtnnitprtattributionp with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrPartnerName;
  public String get_fstrPartnerName() {
    return fstrPartnerName;
  }
  public void set_fstrPartnerName(String fstrPartnerName) {
    this.fstrPartnerName = fstrPartnerName;
  }
  public tblnz_rtnnitprtattributionp with_fstrPartnerName(String fstrPartnerName) {
    this.fstrPartnerName = fstrPartnerName;
    return this;
  }
  private String fstrPartnerIRD;
  public String get_fstrPartnerIRD() {
    return fstrPartnerIRD;
  }
  public void set_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
  }
  public tblnz_rtnnitprtattributionp with_fstrPartnerIRD(String fstrPartnerIRD) {
    this.fstrPartnerIRD = fstrPartnerIRD;
    return this;
  }
  private java.math.BigDecimal fcurPartnerPercentageAttr;
  public java.math.BigDecimal get_fcurPartnerPercentageAttr() {
    return fcurPartnerPercentageAttr;
  }
  public void set_fcurPartnerPercentageAttr(java.math.BigDecimal fcurPartnerPercentageAttr) {
    this.fcurPartnerPercentageAttr = fcurPartnerPercentageAttr;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerPercentageAttr(java.math.BigDecimal fcurPartnerPercentageAttr) {
    this.fcurPartnerPercentageAttr = fcurPartnerPercentageAttr;
    return this;
  }
  private java.math.BigDecimal fcurPartnerInterest;
  public java.math.BigDecimal get_fcurPartnerInterest() {
    return fcurPartnerInterest;
  }
  public void set_fcurPartnerInterest(java.math.BigDecimal fcurPartnerInterest) {
    this.fcurPartnerInterest = fcurPartnerInterest;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerInterest(java.math.BigDecimal fcurPartnerInterest) {
    this.fcurPartnerInterest = fcurPartnerInterest;
    return this;
  }
  private java.math.BigDecimal fcurPartnerDividends;
  public java.math.BigDecimal get_fcurPartnerDividends() {
    return fcurPartnerDividends;
  }
  public void set_fcurPartnerDividends(java.math.BigDecimal fcurPartnerDividends) {
    this.fcurPartnerDividends = fcurPartnerDividends;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerDividends(java.math.BigDecimal fcurPartnerDividends) {
    this.fcurPartnerDividends = fcurPartnerDividends;
    return this;
  }
  private java.math.BigDecimal fcurPartnerMaoriDist;
  public java.math.BigDecimal get_fcurPartnerMaoriDist() {
    return fcurPartnerMaoriDist;
  }
  public void set_fcurPartnerMaoriDist(java.math.BigDecimal fcurPartnerMaoriDist) {
    this.fcurPartnerMaoriDist = fcurPartnerMaoriDist;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerMaoriDist(java.math.BigDecimal fcurPartnerMaoriDist) {
    this.fcurPartnerMaoriDist = fcurPartnerMaoriDist;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOverseas;
  public java.math.BigDecimal get_fcurPartnerOverseas() {
    return fcurPartnerOverseas;
  }
  public void set_fcurPartnerOverseas(java.math.BigDecimal fcurPartnerOverseas) {
    this.fcurPartnerOverseas = fcurPartnerOverseas;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerOverseas(java.math.BigDecimal fcurPartnerOverseas) {
    this.fcurPartnerOverseas = fcurPartnerOverseas;
    return this;
  }
  private java.math.BigDecimal fcurPartnerRental;
  public java.math.BigDecimal get_fcurPartnerRental() {
    return fcurPartnerRental;
  }
  public void set_fcurPartnerRental(java.math.BigDecimal fcurPartnerRental) {
    this.fcurPartnerRental = fcurPartnerRental;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerRental(java.math.BigDecimal fcurPartnerRental) {
    this.fcurPartnerRental = fcurPartnerRental;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherPassive;
  public java.math.BigDecimal get_fcurPartnerOtherPassive() {
    return fcurPartnerOtherPassive;
  }
  public void set_fcurPartnerOtherPassive(java.math.BigDecimal fcurPartnerOtherPassive) {
    this.fcurPartnerOtherPassive = fcurPartnerOtherPassive;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerOtherPassive(java.math.BigDecimal fcurPartnerOtherPassive) {
    this.fcurPartnerOtherPassive = fcurPartnerOtherPassive;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherIncome;
  public java.math.BigDecimal get_fcurPartnerOtherIncome() {
    return fcurPartnerOtherIncome;
  }
  public void set_fcurPartnerOtherIncome(java.math.BigDecimal fcurPartnerOtherIncome) {
    this.fcurPartnerOtherIncome = fcurPartnerOtherIncome;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerOtherIncome(java.math.BigDecimal fcurPartnerOtherIncome) {
    this.fcurPartnerOtherIncome = fcurPartnerOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerTotalIncome;
  public java.math.BigDecimal get_fcurPartnerTotalIncome() {
    return fcurPartnerTotalIncome;
  }
  public void set_fcurPartnerTotalIncome(java.math.BigDecimal fcurPartnerTotalIncome) {
    this.fcurPartnerTotalIncome = fcurPartnerTotalIncome;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerTotalIncome(java.math.BigDecimal fcurPartnerTotalIncome) {
    this.fcurPartnerTotalIncome = fcurPartnerTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerSumOfIncome;
  public java.math.BigDecimal get_fcurPartnerSumOfIncome() {
    return fcurPartnerSumOfIncome;
  }
  public void set_fcurPartnerSumOfIncome(java.math.BigDecimal fcurPartnerSumOfIncome) {
    this.fcurPartnerSumOfIncome = fcurPartnerSumOfIncome;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerSumOfIncome(java.math.BigDecimal fcurPartnerSumOfIncome) {
    this.fcurPartnerSumOfIncome = fcurPartnerSumOfIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerExtinguishedLosses;
  public java.math.BigDecimal get_fcurPartnerExtinguishedLosses() {
    return fcurPartnerExtinguishedLosses;
  }
  public void set_fcurPartnerExtinguishedLosses(java.math.BigDecimal fcurPartnerExtinguishedLosses) {
    this.fcurPartnerExtinguishedLosses = fcurPartnerExtinguishedLosses;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerExtinguishedLosses(java.math.BigDecimal fcurPartnerExtinguishedLosses) {
    this.fcurPartnerExtinguishedLosses = fcurPartnerExtinguishedLosses;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOverseasTax;
  public java.math.BigDecimal get_fcurPartnerOverseasTax() {
    return fcurPartnerOverseasTax;
  }
  public void set_fcurPartnerOverseasTax(java.math.BigDecimal fcurPartnerOverseasTax) {
    this.fcurPartnerOverseasTax = fcurPartnerOverseasTax;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerOverseasTax(java.math.BigDecimal fcurPartnerOverseasTax) {
    this.fcurPartnerOverseasTax = fcurPartnerOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurPartnerImputation;
  public java.math.BigDecimal get_fcurPartnerImputation() {
    return fcurPartnerImputation;
  }
  public void set_fcurPartnerImputation(java.math.BigDecimal fcurPartnerImputation) {
    this.fcurPartnerImputation = fcurPartnerImputation;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerImputation(java.math.BigDecimal fcurPartnerImputation) {
    this.fcurPartnerImputation = fcurPartnerImputation;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherTaxCredits;
  public java.math.BigDecimal get_fcurPartnerOtherTaxCredits() {
    return fcurPartnerOtherTaxCredits;
  }
  public void set_fcurPartnerOtherTaxCredits(java.math.BigDecimal fcurPartnerOtherTaxCredits) {
    this.fcurPartnerOtherTaxCredits = fcurPartnerOtherTaxCredits;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerOtherTaxCredits(java.math.BigDecimal fcurPartnerOtherTaxCredits) {
    this.fcurPartnerOtherTaxCredits = fcurPartnerOtherTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurPartnerDeduction;
  public java.math.BigDecimal get_fcurPartnerDeduction() {
    return fcurPartnerDeduction;
  }
  public void set_fcurPartnerDeduction(java.math.BigDecimal fcurPartnerDeduction) {
    this.fcurPartnerDeduction = fcurPartnerDeduction;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerDeduction(java.math.BigDecimal fcurPartnerDeduction) {
    this.fcurPartnerDeduction = fcurPartnerDeduction;
    return this;
  }
  private java.math.BigDecimal fcurPartnerResIncome;
  public java.math.BigDecimal get_fcurPartnerResIncome() {
    return fcurPartnerResIncome;
  }
  public void set_fcurPartnerResIncome(java.math.BigDecimal fcurPartnerResIncome) {
    this.fcurPartnerResIncome = fcurPartnerResIncome;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerResIncome(java.math.BigDecimal fcurPartnerResIncome) {
    this.fcurPartnerResIncome = fcurPartnerResIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerResDeductions;
  public java.math.BigDecimal get_fcurPartnerResDeductions() {
    return fcurPartnerResDeductions;
  }
  public void set_fcurPartnerResDeductions(java.math.BigDecimal fcurPartnerResDeductions) {
    this.fcurPartnerResDeductions = fcurPartnerResDeductions;
  }
  public tblnz_rtnnitprtattributionp with_fcurPartnerResDeductions(java.math.BigDecimal fcurPartnerResDeductions) {
    this.fcurPartnerResDeductions = fcurPartnerResDeductions;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnitprtattributionp with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnitprtattributionp with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprtattributionp)) {
      return false;
    }
    tblnz_rtnnitprtattributionp that = (tblnz_rtnnitprtattributionp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrPartnerName == null ? that.fstrPartnerName == null : this.fstrPartnerName.equals(that.fstrPartnerName));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.fcurPartnerPercentageAttr == null ? that.fcurPartnerPercentageAttr == null : this.fcurPartnerPercentageAttr.equals(that.fcurPartnerPercentageAttr));
    equal = equal && (this.fcurPartnerInterest == null ? that.fcurPartnerInterest == null : this.fcurPartnerInterest.equals(that.fcurPartnerInterest));
    equal = equal && (this.fcurPartnerDividends == null ? that.fcurPartnerDividends == null : this.fcurPartnerDividends.equals(that.fcurPartnerDividends));
    equal = equal && (this.fcurPartnerMaoriDist == null ? that.fcurPartnerMaoriDist == null : this.fcurPartnerMaoriDist.equals(that.fcurPartnerMaoriDist));
    equal = equal && (this.fcurPartnerOverseas == null ? that.fcurPartnerOverseas == null : this.fcurPartnerOverseas.equals(that.fcurPartnerOverseas));
    equal = equal && (this.fcurPartnerRental == null ? that.fcurPartnerRental == null : this.fcurPartnerRental.equals(that.fcurPartnerRental));
    equal = equal && (this.fcurPartnerOtherPassive == null ? that.fcurPartnerOtherPassive == null : this.fcurPartnerOtherPassive.equals(that.fcurPartnerOtherPassive));
    equal = equal && (this.fcurPartnerOtherIncome == null ? that.fcurPartnerOtherIncome == null : this.fcurPartnerOtherIncome.equals(that.fcurPartnerOtherIncome));
    equal = equal && (this.fcurPartnerTotalIncome == null ? that.fcurPartnerTotalIncome == null : this.fcurPartnerTotalIncome.equals(that.fcurPartnerTotalIncome));
    equal = equal && (this.fcurPartnerSumOfIncome == null ? that.fcurPartnerSumOfIncome == null : this.fcurPartnerSumOfIncome.equals(that.fcurPartnerSumOfIncome));
    equal = equal && (this.fcurPartnerExtinguishedLosses == null ? that.fcurPartnerExtinguishedLosses == null : this.fcurPartnerExtinguishedLosses.equals(that.fcurPartnerExtinguishedLosses));
    equal = equal && (this.fcurPartnerOverseasTax == null ? that.fcurPartnerOverseasTax == null : this.fcurPartnerOverseasTax.equals(that.fcurPartnerOverseasTax));
    equal = equal && (this.fcurPartnerImputation == null ? that.fcurPartnerImputation == null : this.fcurPartnerImputation.equals(that.fcurPartnerImputation));
    equal = equal && (this.fcurPartnerOtherTaxCredits == null ? that.fcurPartnerOtherTaxCredits == null : this.fcurPartnerOtherTaxCredits.equals(that.fcurPartnerOtherTaxCredits));
    equal = equal && (this.fcurPartnerDeduction == null ? that.fcurPartnerDeduction == null : this.fcurPartnerDeduction.equals(that.fcurPartnerDeduction));
    equal = equal && (this.fcurPartnerResIncome == null ? that.fcurPartnerResIncome == null : this.fcurPartnerResIncome.equals(that.fcurPartnerResIncome));
    equal = equal && (this.fcurPartnerResDeductions == null ? that.fcurPartnerResDeductions == null : this.fcurPartnerResDeductions.equals(that.fcurPartnerResDeductions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnitprtattributionp)) {
      return false;
    }
    tblnz_rtnnitprtattributionp that = (tblnz_rtnnitprtattributionp) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrPartnerName == null ? that.fstrPartnerName == null : this.fstrPartnerName.equals(that.fstrPartnerName));
    equal = equal && (this.fstrPartnerIRD == null ? that.fstrPartnerIRD == null : this.fstrPartnerIRD.equals(that.fstrPartnerIRD));
    equal = equal && (this.fcurPartnerPercentageAttr == null ? that.fcurPartnerPercentageAttr == null : this.fcurPartnerPercentageAttr.equals(that.fcurPartnerPercentageAttr));
    equal = equal && (this.fcurPartnerInterest == null ? that.fcurPartnerInterest == null : this.fcurPartnerInterest.equals(that.fcurPartnerInterest));
    equal = equal && (this.fcurPartnerDividends == null ? that.fcurPartnerDividends == null : this.fcurPartnerDividends.equals(that.fcurPartnerDividends));
    equal = equal && (this.fcurPartnerMaoriDist == null ? that.fcurPartnerMaoriDist == null : this.fcurPartnerMaoriDist.equals(that.fcurPartnerMaoriDist));
    equal = equal && (this.fcurPartnerOverseas == null ? that.fcurPartnerOverseas == null : this.fcurPartnerOverseas.equals(that.fcurPartnerOverseas));
    equal = equal && (this.fcurPartnerRental == null ? that.fcurPartnerRental == null : this.fcurPartnerRental.equals(that.fcurPartnerRental));
    equal = equal && (this.fcurPartnerOtherPassive == null ? that.fcurPartnerOtherPassive == null : this.fcurPartnerOtherPassive.equals(that.fcurPartnerOtherPassive));
    equal = equal && (this.fcurPartnerOtherIncome == null ? that.fcurPartnerOtherIncome == null : this.fcurPartnerOtherIncome.equals(that.fcurPartnerOtherIncome));
    equal = equal && (this.fcurPartnerTotalIncome == null ? that.fcurPartnerTotalIncome == null : this.fcurPartnerTotalIncome.equals(that.fcurPartnerTotalIncome));
    equal = equal && (this.fcurPartnerSumOfIncome == null ? that.fcurPartnerSumOfIncome == null : this.fcurPartnerSumOfIncome.equals(that.fcurPartnerSumOfIncome));
    equal = equal && (this.fcurPartnerExtinguishedLosses == null ? that.fcurPartnerExtinguishedLosses == null : this.fcurPartnerExtinguishedLosses.equals(that.fcurPartnerExtinguishedLosses));
    equal = equal && (this.fcurPartnerOverseasTax == null ? that.fcurPartnerOverseasTax == null : this.fcurPartnerOverseasTax.equals(that.fcurPartnerOverseasTax));
    equal = equal && (this.fcurPartnerImputation == null ? that.fcurPartnerImputation == null : this.fcurPartnerImputation.equals(that.fcurPartnerImputation));
    equal = equal && (this.fcurPartnerOtherTaxCredits == null ? that.fcurPartnerOtherTaxCredits == null : this.fcurPartnerOtherTaxCredits.equals(that.fcurPartnerOtherTaxCredits));
    equal = equal && (this.fcurPartnerDeduction == null ? that.fcurPartnerDeduction == null : this.fcurPartnerDeduction.equals(that.fcurPartnerDeduction));
    equal = equal && (this.fcurPartnerResIncome == null ? that.fcurPartnerResIncome == null : this.fcurPartnerResIncome.equals(that.fcurPartnerResIncome));
    equal = equal && (this.fcurPartnerResDeductions == null ? that.fcurPartnerResDeductions == null : this.fcurPartnerResDeductions.equals(that.fcurPartnerResDeductions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPartnerName = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPartnerPercentageAttr = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPartnerInterest = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPartnerDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPartnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPartnerOverseas = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPartnerRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPartnerOtherPassive = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPartnerOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurPartnerTotalIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPartnerSumOfIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPartnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPartnerOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPartnerImputation = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPartnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPartnerDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPartnerResIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurPartnerResDeductions = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPartnerName = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPartnerIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurPartnerPercentageAttr = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPartnerInterest = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPartnerDividends = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPartnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPartnerOverseas = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPartnerRental = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPartnerOtherPassive = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPartnerOtherIncome = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurPartnerTotalIncome = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPartnerSumOfIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPartnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPartnerOverseasTax = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPartnerImputation = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurPartnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurPartnerDeduction = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPartnerResIncome = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurPartnerResDeductions = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeString(fstrPartnerName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerPercentageAttr, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerInterest, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseas, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherPassive, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerTotalIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerSumOfIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerExtinguishedLosses, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerImputation, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResDeductions, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPartnerIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerPercentageAttr, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerInterest, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDividends, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseas, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerRental, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherPassive, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherIncome, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerTotalIncome, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerSumOfIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerExtinguishedLosses, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseasTax, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerImputation, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDeduction, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResIncome, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResDeductions, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
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
        this.fstrPartnerName = null;
    } else {
    this.fstrPartnerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPartnerIRD = null;
    } else {
    this.fstrPartnerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerPercentageAttr = null;
    } else {
    this.fcurPartnerPercentageAttr = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerInterest = null;
    } else {
    this.fcurPartnerInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerDividends = null;
    } else {
    this.fcurPartnerDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerMaoriDist = null;
    } else {
    this.fcurPartnerMaoriDist = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOverseas = null;
    } else {
    this.fcurPartnerOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerRental = null;
    } else {
    this.fcurPartnerRental = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherPassive = null;
    } else {
    this.fcurPartnerOtherPassive = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherIncome = null;
    } else {
    this.fcurPartnerOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerTotalIncome = null;
    } else {
    this.fcurPartnerTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerSumOfIncome = null;
    } else {
    this.fcurPartnerSumOfIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerExtinguishedLosses = null;
    } else {
    this.fcurPartnerExtinguishedLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOverseasTax = null;
    } else {
    this.fcurPartnerOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerImputation = null;
    } else {
    this.fcurPartnerImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherTaxCredits = null;
    } else {
    this.fcurPartnerOtherTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerDeduction = null;
    } else {
    this.fcurPartnerDeduction = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerResIncome = null;
    } else {
    this.fcurPartnerResIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerResDeductions = null;
    } else {
    this.fcurPartnerResDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fstrPartnerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerName);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.fcurPartnerPercentageAttr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerPercentageAttr, __dataOut);
    }
    if (null == this.fcurPartnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerInterest, __dataOut);
    }
    if (null == this.fcurPartnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDividends, __dataOut);
    }
    if (null == this.fcurPartnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerMaoriDist, __dataOut);
    }
    if (null == this.fcurPartnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseas, __dataOut);
    }
    if (null == this.fcurPartnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerRental, __dataOut);
    }
    if (null == this.fcurPartnerOtherPassive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherPassive, __dataOut);
    }
    if (null == this.fcurPartnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherIncome, __dataOut);
    }
    if (null == this.fcurPartnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerTotalIncome, __dataOut);
    }
    if (null == this.fcurPartnerSumOfIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerSumOfIncome, __dataOut);
    }
    if (null == this.fcurPartnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPartnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseasTax, __dataOut);
    }
    if (null == this.fcurPartnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerImputation, __dataOut);
    }
    if (null == this.fcurPartnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurPartnerDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDeduction, __dataOut);
    }
    if (null == this.fcurPartnerResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerResIncome, __dataOut);
    }
    if (null == this.fcurPartnerResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerResDeductions, __dataOut);
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
    if (null == this.fstrPartnerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerName);
    }
    if (null == this.fstrPartnerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPartnerIRD);
    }
    if (null == this.fcurPartnerPercentageAttr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerPercentageAttr, __dataOut);
    }
    if (null == this.fcurPartnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerInterest, __dataOut);
    }
    if (null == this.fcurPartnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDividends, __dataOut);
    }
    if (null == this.fcurPartnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerMaoriDist, __dataOut);
    }
    if (null == this.fcurPartnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseas, __dataOut);
    }
    if (null == this.fcurPartnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerRental, __dataOut);
    }
    if (null == this.fcurPartnerOtherPassive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherPassive, __dataOut);
    }
    if (null == this.fcurPartnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherIncome, __dataOut);
    }
    if (null == this.fcurPartnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerTotalIncome, __dataOut);
    }
    if (null == this.fcurPartnerSumOfIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerSumOfIncome, __dataOut);
    }
    if (null == this.fcurPartnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPartnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseasTax, __dataOut);
    }
    if (null == this.fcurPartnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerImputation, __dataOut);
    }
    if (null == this.fcurPartnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurPartnerDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDeduction, __dataOut);
    }
    if (null == this.fcurPartnerResIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerResIncome, __dataOut);
    }
    if (null == this.fcurPartnerResDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerResDeductions, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerName==null?"\\N":fstrPartnerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerPercentageAttr==null?"\\N":fcurPartnerPercentageAttr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerInterest==null?"\\N":fcurPartnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDividends==null?"\\N":fcurPartnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerMaoriDist==null?"\\N":fcurPartnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseas==null?"\\N":fcurPartnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerRental==null?"\\N":fcurPartnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherPassive==null?"\\N":fcurPartnerOtherPassive.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherIncome==null?"\\N":fcurPartnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerTotalIncome==null?"\\N":fcurPartnerTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerSumOfIncome==null?"\\N":fcurPartnerSumOfIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerExtinguishedLosses==null?"\\N":fcurPartnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseasTax==null?"\\N":fcurPartnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerImputation==null?"\\N":fcurPartnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherTaxCredits==null?"\\N":fcurPartnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDeduction==null?"\\N":fcurPartnerDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerResIncome==null?"\\N":fcurPartnerResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerResDeductions==null?"\\N":fcurPartnerResDeductions.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerName==null?"\\N":fstrPartnerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPartnerIRD==null?"\\N":fstrPartnerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerPercentageAttr==null?"\\N":fcurPartnerPercentageAttr.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerInterest==null?"\\N":fcurPartnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDividends==null?"\\N":fcurPartnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerMaoriDist==null?"\\N":fcurPartnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseas==null?"\\N":fcurPartnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerRental==null?"\\N":fcurPartnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherPassive==null?"\\N":fcurPartnerOtherPassive.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherIncome==null?"\\N":fcurPartnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerTotalIncome==null?"\\N":fcurPartnerTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerSumOfIncome==null?"\\N":fcurPartnerSumOfIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerExtinguishedLosses==null?"\\N":fcurPartnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseasTax==null?"\\N":fcurPartnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerImputation==null?"\\N":fcurPartnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherTaxCredits==null?"\\N":fcurPartnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDeduction==null?"\\N":fcurPartnerDeduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerResIncome==null?"\\N":fcurPartnerResIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerResDeductions==null?"\\N":fcurPartnerResDeductions.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.fstrPartnerName = null; } else {
      this.fstrPartnerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerPercentageAttr = null; } else {
      this.fcurPartnerPercentageAttr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerInterest = null; } else {
      this.fcurPartnerInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDividends = null; } else {
      this.fcurPartnerDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerMaoriDist = null; } else {
      this.fcurPartnerMaoriDist = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseas = null; } else {
      this.fcurPartnerOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerRental = null; } else {
      this.fcurPartnerRental = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherPassive = null; } else {
      this.fcurPartnerOtherPassive = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherIncome = null; } else {
      this.fcurPartnerOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerTotalIncome = null; } else {
      this.fcurPartnerTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerSumOfIncome = null; } else {
      this.fcurPartnerSumOfIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerExtinguishedLosses = null; } else {
      this.fcurPartnerExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseasTax = null; } else {
      this.fcurPartnerOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerImputation = null; } else {
      this.fcurPartnerImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherTaxCredits = null; } else {
      this.fcurPartnerOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDeduction = null; } else {
      this.fcurPartnerDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerResIncome = null; } else {
      this.fcurPartnerResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerResDeductions = null; } else {
      this.fcurPartnerResDeductions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrPartnerName = null; } else {
      this.fstrPartnerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPartnerIRD = null; } else {
      this.fstrPartnerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerPercentageAttr = null; } else {
      this.fcurPartnerPercentageAttr = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerInterest = null; } else {
      this.fcurPartnerInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDividends = null; } else {
      this.fcurPartnerDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerMaoriDist = null; } else {
      this.fcurPartnerMaoriDist = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseas = null; } else {
      this.fcurPartnerOverseas = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerRental = null; } else {
      this.fcurPartnerRental = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherPassive = null; } else {
      this.fcurPartnerOtherPassive = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherIncome = null; } else {
      this.fcurPartnerOtherIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerTotalIncome = null; } else {
      this.fcurPartnerTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerSumOfIncome = null; } else {
      this.fcurPartnerSumOfIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerExtinguishedLosses = null; } else {
      this.fcurPartnerExtinguishedLosses = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseasTax = null; } else {
      this.fcurPartnerOverseasTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerImputation = null; } else {
      this.fcurPartnerImputation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherTaxCredits = null; } else {
      this.fcurPartnerOtherTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDeduction = null; } else {
      this.fcurPartnerDeduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerResIncome = null; } else {
      this.fcurPartnerResIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerResDeductions = null; } else {
      this.fcurPartnerResDeductions = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnnitprtattributionp o = (tblnz_rtnnitprtattributionp) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnitprtattributionp o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrPartnerName", this.fstrPartnerName);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("fcurPartnerPercentageAttr", this.fcurPartnerPercentageAttr);
    __sqoop$field_map.put("fcurPartnerInterest", this.fcurPartnerInterest);
    __sqoop$field_map.put("fcurPartnerDividends", this.fcurPartnerDividends);
    __sqoop$field_map.put("fcurPartnerMaoriDist", this.fcurPartnerMaoriDist);
    __sqoop$field_map.put("fcurPartnerOverseas", this.fcurPartnerOverseas);
    __sqoop$field_map.put("fcurPartnerRental", this.fcurPartnerRental);
    __sqoop$field_map.put("fcurPartnerOtherPassive", this.fcurPartnerOtherPassive);
    __sqoop$field_map.put("fcurPartnerOtherIncome", this.fcurPartnerOtherIncome);
    __sqoop$field_map.put("fcurPartnerTotalIncome", this.fcurPartnerTotalIncome);
    __sqoop$field_map.put("fcurPartnerSumOfIncome", this.fcurPartnerSumOfIncome);
    __sqoop$field_map.put("fcurPartnerExtinguishedLosses", this.fcurPartnerExtinguishedLosses);
    __sqoop$field_map.put("fcurPartnerOverseasTax", this.fcurPartnerOverseasTax);
    __sqoop$field_map.put("fcurPartnerImputation", this.fcurPartnerImputation);
    __sqoop$field_map.put("fcurPartnerOtherTaxCredits", this.fcurPartnerOtherTaxCredits);
    __sqoop$field_map.put("fcurPartnerDeduction", this.fcurPartnerDeduction);
    __sqoop$field_map.put("fcurPartnerResIncome", this.fcurPartnerResIncome);
    __sqoop$field_map.put("fcurPartnerResDeductions", this.fcurPartnerResDeductions);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrPartnerName", this.fstrPartnerName);
    __sqoop$field_map.put("fstrPartnerIRD", this.fstrPartnerIRD);
    __sqoop$field_map.put("fcurPartnerPercentageAttr", this.fcurPartnerPercentageAttr);
    __sqoop$field_map.put("fcurPartnerInterest", this.fcurPartnerInterest);
    __sqoop$field_map.put("fcurPartnerDividends", this.fcurPartnerDividends);
    __sqoop$field_map.put("fcurPartnerMaoriDist", this.fcurPartnerMaoriDist);
    __sqoop$field_map.put("fcurPartnerOverseas", this.fcurPartnerOverseas);
    __sqoop$field_map.put("fcurPartnerRental", this.fcurPartnerRental);
    __sqoop$field_map.put("fcurPartnerOtherPassive", this.fcurPartnerOtherPassive);
    __sqoop$field_map.put("fcurPartnerOtherIncome", this.fcurPartnerOtherIncome);
    __sqoop$field_map.put("fcurPartnerTotalIncome", this.fcurPartnerTotalIncome);
    __sqoop$field_map.put("fcurPartnerSumOfIncome", this.fcurPartnerSumOfIncome);
    __sqoop$field_map.put("fcurPartnerExtinguishedLosses", this.fcurPartnerExtinguishedLosses);
    __sqoop$field_map.put("fcurPartnerOverseasTax", this.fcurPartnerOverseasTax);
    __sqoop$field_map.put("fcurPartnerImputation", this.fcurPartnerImputation);
    __sqoop$field_map.put("fcurPartnerOtherTaxCredits", this.fcurPartnerOtherTaxCredits);
    __sqoop$field_map.put("fcurPartnerDeduction", this.fcurPartnerDeduction);
    __sqoop$field_map.put("fcurPartnerResIncome", this.fcurPartnerResIncome);
    __sqoop$field_map.put("fcurPartnerResDeductions", this.fcurPartnerResDeductions);
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
