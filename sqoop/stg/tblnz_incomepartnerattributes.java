// ORM class for table 'tblnz_incomepartnerattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:26:14 NZDT 2020
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

public class tblnz_incomepartnerattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fcurPartnerDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerExtinguishedLosses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerExtinguishedLosses = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerImputation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerImputation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerMaoriDist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerMaoriDist = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerOtherIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherPassive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerOtherPassive = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOtherTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerOtherTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOverseas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerOverseas = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerOverseasTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerOverseasTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerRental", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerRental = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerResIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerResIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPartnerResDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fcurPartnerResDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomepartnerattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomepartnerattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomepartnerattributes with_fi64IncomeKey(Long fi64IncomeKey) {
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
  public tblnz_incomepartnerattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomepartnerattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.math.BigDecimal fcurPartnerDividends;
  public java.math.BigDecimal get_fcurPartnerDividends() {
    return fcurPartnerDividends;
  }
  public void set_fcurPartnerDividends(java.math.BigDecimal fcurPartnerDividends) {
    this.fcurPartnerDividends = fcurPartnerDividends;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerDividends(java.math.BigDecimal fcurPartnerDividends) {
    this.fcurPartnerDividends = fcurPartnerDividends;
    return this;
  }
  private java.math.BigDecimal fcurPartnerExtinguishedLosses;
  public java.math.BigDecimal get_fcurPartnerExtinguishedLosses() {
    return fcurPartnerExtinguishedLosses;
  }
  public void set_fcurPartnerExtinguishedLosses(java.math.BigDecimal fcurPartnerExtinguishedLosses) {
    this.fcurPartnerExtinguishedLosses = fcurPartnerExtinguishedLosses;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerExtinguishedLosses(java.math.BigDecimal fcurPartnerExtinguishedLosses) {
    this.fcurPartnerExtinguishedLosses = fcurPartnerExtinguishedLosses;
    return this;
  }
  private java.math.BigDecimal fcurPartnerImputation;
  public java.math.BigDecimal get_fcurPartnerImputation() {
    return fcurPartnerImputation;
  }
  public void set_fcurPartnerImputation(java.math.BigDecimal fcurPartnerImputation) {
    this.fcurPartnerImputation = fcurPartnerImputation;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerImputation(java.math.BigDecimal fcurPartnerImputation) {
    this.fcurPartnerImputation = fcurPartnerImputation;
    return this;
  }
  private java.math.BigDecimal fcurPartnerInterest;
  public java.math.BigDecimal get_fcurPartnerInterest() {
    return fcurPartnerInterest;
  }
  public void set_fcurPartnerInterest(java.math.BigDecimal fcurPartnerInterest) {
    this.fcurPartnerInterest = fcurPartnerInterest;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerInterest(java.math.BigDecimal fcurPartnerInterest) {
    this.fcurPartnerInterest = fcurPartnerInterest;
    return this;
  }
  private java.math.BigDecimal fcurPartnerMaoriDist;
  public java.math.BigDecimal get_fcurPartnerMaoriDist() {
    return fcurPartnerMaoriDist;
  }
  public void set_fcurPartnerMaoriDist(java.math.BigDecimal fcurPartnerMaoriDist) {
    this.fcurPartnerMaoriDist = fcurPartnerMaoriDist;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerMaoriDist(java.math.BigDecimal fcurPartnerMaoriDist) {
    this.fcurPartnerMaoriDist = fcurPartnerMaoriDist;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherIncome;
  public java.math.BigDecimal get_fcurPartnerOtherIncome() {
    return fcurPartnerOtherIncome;
  }
  public void set_fcurPartnerOtherIncome(java.math.BigDecimal fcurPartnerOtherIncome) {
    this.fcurPartnerOtherIncome = fcurPartnerOtherIncome;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerOtherIncome(java.math.BigDecimal fcurPartnerOtherIncome) {
    this.fcurPartnerOtherIncome = fcurPartnerOtherIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherPassive;
  public java.math.BigDecimal get_fcurPartnerOtherPassive() {
    return fcurPartnerOtherPassive;
  }
  public void set_fcurPartnerOtherPassive(java.math.BigDecimal fcurPartnerOtherPassive) {
    this.fcurPartnerOtherPassive = fcurPartnerOtherPassive;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerOtherPassive(java.math.BigDecimal fcurPartnerOtherPassive) {
    this.fcurPartnerOtherPassive = fcurPartnerOtherPassive;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOtherTaxCredits;
  public java.math.BigDecimal get_fcurPartnerOtherTaxCredits() {
    return fcurPartnerOtherTaxCredits;
  }
  public void set_fcurPartnerOtherTaxCredits(java.math.BigDecimal fcurPartnerOtherTaxCredits) {
    this.fcurPartnerOtherTaxCredits = fcurPartnerOtherTaxCredits;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerOtherTaxCredits(java.math.BigDecimal fcurPartnerOtherTaxCredits) {
    this.fcurPartnerOtherTaxCredits = fcurPartnerOtherTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOverseas;
  public java.math.BigDecimal get_fcurPartnerOverseas() {
    return fcurPartnerOverseas;
  }
  public void set_fcurPartnerOverseas(java.math.BigDecimal fcurPartnerOverseas) {
    this.fcurPartnerOverseas = fcurPartnerOverseas;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerOverseas(java.math.BigDecimal fcurPartnerOverseas) {
    this.fcurPartnerOverseas = fcurPartnerOverseas;
    return this;
  }
  private java.math.BigDecimal fcurPartnerOverseasTax;
  public java.math.BigDecimal get_fcurPartnerOverseasTax() {
    return fcurPartnerOverseasTax;
  }
  public void set_fcurPartnerOverseasTax(java.math.BigDecimal fcurPartnerOverseasTax) {
    this.fcurPartnerOverseasTax = fcurPartnerOverseasTax;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerOverseasTax(java.math.BigDecimal fcurPartnerOverseasTax) {
    this.fcurPartnerOverseasTax = fcurPartnerOverseasTax;
    return this;
  }
  private java.math.BigDecimal fcurPartnerRental;
  public java.math.BigDecimal get_fcurPartnerRental() {
    return fcurPartnerRental;
  }
  public void set_fcurPartnerRental(java.math.BigDecimal fcurPartnerRental) {
    this.fcurPartnerRental = fcurPartnerRental;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerRental(java.math.BigDecimal fcurPartnerRental) {
    this.fcurPartnerRental = fcurPartnerRental;
    return this;
  }
  private java.math.BigDecimal fcurPartnerTotalIncome;
  public java.math.BigDecimal get_fcurPartnerTotalIncome() {
    return fcurPartnerTotalIncome;
  }
  public void set_fcurPartnerTotalIncome(java.math.BigDecimal fcurPartnerTotalIncome) {
    this.fcurPartnerTotalIncome = fcurPartnerTotalIncome;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerTotalIncome(java.math.BigDecimal fcurPartnerTotalIncome) {
    this.fcurPartnerTotalIncome = fcurPartnerTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurPartnerResIncome;
  public java.math.BigDecimal get_fcurPartnerResIncome() {
    return fcurPartnerResIncome;
  }
  public void set_fcurPartnerResIncome(java.math.BigDecimal fcurPartnerResIncome) {
    this.fcurPartnerResIncome = fcurPartnerResIncome;
  }
  public tblnz_incomepartnerattributes with_fcurPartnerResIncome(java.math.BigDecimal fcurPartnerResIncome) {
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
  public tblnz_incomepartnerattributes with_fcurPartnerResDeductions(java.math.BigDecimal fcurPartnerResDeductions) {
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
  public tblnz_incomepartnerattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomepartnerattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomepartnerattributes)) {
      return false;
    }
    tblnz_incomepartnerattributes that = (tblnz_incomepartnerattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurPartnerDividends == null ? that.fcurPartnerDividends == null : this.fcurPartnerDividends.equals(that.fcurPartnerDividends));
    equal = equal && (this.fcurPartnerExtinguishedLosses == null ? that.fcurPartnerExtinguishedLosses == null : this.fcurPartnerExtinguishedLosses.equals(that.fcurPartnerExtinguishedLosses));
    equal = equal && (this.fcurPartnerImputation == null ? that.fcurPartnerImputation == null : this.fcurPartnerImputation.equals(that.fcurPartnerImputation));
    equal = equal && (this.fcurPartnerInterest == null ? that.fcurPartnerInterest == null : this.fcurPartnerInterest.equals(that.fcurPartnerInterest));
    equal = equal && (this.fcurPartnerMaoriDist == null ? that.fcurPartnerMaoriDist == null : this.fcurPartnerMaoriDist.equals(that.fcurPartnerMaoriDist));
    equal = equal && (this.fcurPartnerOtherIncome == null ? that.fcurPartnerOtherIncome == null : this.fcurPartnerOtherIncome.equals(that.fcurPartnerOtherIncome));
    equal = equal && (this.fcurPartnerOtherPassive == null ? that.fcurPartnerOtherPassive == null : this.fcurPartnerOtherPassive.equals(that.fcurPartnerOtherPassive));
    equal = equal && (this.fcurPartnerOtherTaxCredits == null ? that.fcurPartnerOtherTaxCredits == null : this.fcurPartnerOtherTaxCredits.equals(that.fcurPartnerOtherTaxCredits));
    equal = equal && (this.fcurPartnerOverseas == null ? that.fcurPartnerOverseas == null : this.fcurPartnerOverseas.equals(that.fcurPartnerOverseas));
    equal = equal && (this.fcurPartnerOverseasTax == null ? that.fcurPartnerOverseasTax == null : this.fcurPartnerOverseasTax.equals(that.fcurPartnerOverseasTax));
    equal = equal && (this.fcurPartnerRental == null ? that.fcurPartnerRental == null : this.fcurPartnerRental.equals(that.fcurPartnerRental));
    equal = equal && (this.fcurPartnerTotalIncome == null ? that.fcurPartnerTotalIncome == null : this.fcurPartnerTotalIncome.equals(that.fcurPartnerTotalIncome));
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
    if (!(o instanceof tblnz_incomepartnerattributes)) {
      return false;
    }
    tblnz_incomepartnerattributes that = (tblnz_incomepartnerattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurPartnerDividends == null ? that.fcurPartnerDividends == null : this.fcurPartnerDividends.equals(that.fcurPartnerDividends));
    equal = equal && (this.fcurPartnerExtinguishedLosses == null ? that.fcurPartnerExtinguishedLosses == null : this.fcurPartnerExtinguishedLosses.equals(that.fcurPartnerExtinguishedLosses));
    equal = equal && (this.fcurPartnerImputation == null ? that.fcurPartnerImputation == null : this.fcurPartnerImputation.equals(that.fcurPartnerImputation));
    equal = equal && (this.fcurPartnerInterest == null ? that.fcurPartnerInterest == null : this.fcurPartnerInterest.equals(that.fcurPartnerInterest));
    equal = equal && (this.fcurPartnerMaoriDist == null ? that.fcurPartnerMaoriDist == null : this.fcurPartnerMaoriDist.equals(that.fcurPartnerMaoriDist));
    equal = equal && (this.fcurPartnerOtherIncome == null ? that.fcurPartnerOtherIncome == null : this.fcurPartnerOtherIncome.equals(that.fcurPartnerOtherIncome));
    equal = equal && (this.fcurPartnerOtherPassive == null ? that.fcurPartnerOtherPassive == null : this.fcurPartnerOtherPassive.equals(that.fcurPartnerOtherPassive));
    equal = equal && (this.fcurPartnerOtherTaxCredits == null ? that.fcurPartnerOtherTaxCredits == null : this.fcurPartnerOtherTaxCredits.equals(that.fcurPartnerOtherTaxCredits));
    equal = equal && (this.fcurPartnerOverseas == null ? that.fcurPartnerOverseas == null : this.fcurPartnerOverseas.equals(that.fcurPartnerOverseas));
    equal = equal && (this.fcurPartnerOverseasTax == null ? that.fcurPartnerOverseasTax == null : this.fcurPartnerOverseasTax.equals(that.fcurPartnerOverseasTax));
    equal = equal && (this.fcurPartnerRental == null ? that.fcurPartnerRental == null : this.fcurPartnerRental.equals(that.fcurPartnerRental));
    equal = equal && (this.fcurPartnerTotalIncome == null ? that.fcurPartnerTotalIncome == null : this.fcurPartnerTotalIncome.equals(that.fcurPartnerTotalIncome));
    equal = equal && (this.fcurPartnerResIncome == null ? that.fcurPartnerResIncome == null : this.fcurPartnerResIncome.equals(that.fcurPartnerResIncome));
    equal = equal && (this.fcurPartnerResDeductions == null ? that.fcurPartnerResDeductions == null : this.fcurPartnerResDeductions.equals(that.fcurPartnerResDeductions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurPartnerDividends = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPartnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPartnerImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPartnerInterest = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPartnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPartnerOtherIncome = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPartnerOtherPassive = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPartnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPartnerOverseas = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurPartnerOverseasTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPartnerRental = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPartnerTotalIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPartnerResIncome = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPartnerResDeductions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurPartnerDividends = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurPartnerExtinguishedLosses = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPartnerImputation = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurPartnerInterest = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPartnerMaoriDist = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPartnerOtherIncome = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPartnerOtherPassive = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPartnerOtherTaxCredits = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPartnerOverseas = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurPartnerOverseasTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPartnerRental = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurPartnerTotalIncome = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurPartnerResIncome = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurPartnerResDeductions = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDividends, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerExtinguishedLosses, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerInterest, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherIncome, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherPassive, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseas, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseasTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerRental, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerTotalIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResIncome, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResDeductions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerDividends, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerExtinguishedLosses, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerImputation, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerInterest, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerMaoriDist, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherIncome, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherPassive, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOtherTaxCredits, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseas, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerOverseasTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerRental, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerTotalIncome, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResIncome, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPartnerResDeductions, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fcurPartnerDividends = null;
    } else {
    this.fcurPartnerDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerExtinguishedLosses = null;
    } else {
    this.fcurPartnerExtinguishedLosses = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerImputation = null;
    } else {
    this.fcurPartnerImputation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerInterest = null;
    } else {
    this.fcurPartnerInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerMaoriDist = null;
    } else {
    this.fcurPartnerMaoriDist = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherIncome = null;
    } else {
    this.fcurPartnerOtherIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherPassive = null;
    } else {
    this.fcurPartnerOtherPassive = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOtherTaxCredits = null;
    } else {
    this.fcurPartnerOtherTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOverseas = null;
    } else {
    this.fcurPartnerOverseas = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerOverseasTax = null;
    } else {
    this.fcurPartnerOverseasTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerRental = null;
    } else {
    this.fcurPartnerRental = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPartnerTotalIncome = null;
    } else {
    this.fcurPartnerTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurPartnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDividends, __dataOut);
    }
    if (null == this.fcurPartnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPartnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerImputation, __dataOut);
    }
    if (null == this.fcurPartnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerInterest, __dataOut);
    }
    if (null == this.fcurPartnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerMaoriDist, __dataOut);
    }
    if (null == this.fcurPartnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherIncome, __dataOut);
    }
    if (null == this.fcurPartnerOtherPassive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherPassive, __dataOut);
    }
    if (null == this.fcurPartnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurPartnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseas, __dataOut);
    }
    if (null == this.fcurPartnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseasTax, __dataOut);
    }
    if (null == this.fcurPartnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerRental, __dataOut);
    }
    if (null == this.fcurPartnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerTotalIncome, __dataOut);
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
    if (null == this.fcurPartnerDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerDividends, __dataOut);
    }
    if (null == this.fcurPartnerExtinguishedLosses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerExtinguishedLosses, __dataOut);
    }
    if (null == this.fcurPartnerImputation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerImputation, __dataOut);
    }
    if (null == this.fcurPartnerInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerInterest, __dataOut);
    }
    if (null == this.fcurPartnerMaoriDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerMaoriDist, __dataOut);
    }
    if (null == this.fcurPartnerOtherIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherIncome, __dataOut);
    }
    if (null == this.fcurPartnerOtherPassive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherPassive, __dataOut);
    }
    if (null == this.fcurPartnerOtherTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOtherTaxCredits, __dataOut);
    }
    if (null == this.fcurPartnerOverseas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseas, __dataOut);
    }
    if (null == this.fcurPartnerOverseasTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerOverseasTax, __dataOut);
    }
    if (null == this.fcurPartnerRental) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerRental, __dataOut);
    }
    if (null == this.fcurPartnerTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPartnerTotalIncome, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDividends==null?"\\N":fcurPartnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerExtinguishedLosses==null?"\\N":fcurPartnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerImputation==null?"\\N":fcurPartnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerInterest==null?"\\N":fcurPartnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerMaoriDist==null?"\\N":fcurPartnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherIncome==null?"\\N":fcurPartnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherPassive==null?"\\N":fcurPartnerOtherPassive.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherTaxCredits==null?"\\N":fcurPartnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseas==null?"\\N":fcurPartnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseasTax==null?"\\N":fcurPartnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerRental==null?"\\N":fcurPartnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerTotalIncome==null?"\\N":fcurPartnerTotalIncome.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerDividends==null?"\\N":fcurPartnerDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerExtinguishedLosses==null?"\\N":fcurPartnerExtinguishedLosses.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerImputation==null?"\\N":fcurPartnerImputation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerInterest==null?"\\N":fcurPartnerInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerMaoriDist==null?"\\N":fcurPartnerMaoriDist.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherIncome==null?"\\N":fcurPartnerOtherIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherPassive==null?"\\N":fcurPartnerOtherPassive.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOtherTaxCredits==null?"\\N":fcurPartnerOtherTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseas==null?"\\N":fcurPartnerOverseas.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerOverseasTax==null?"\\N":fcurPartnerOverseasTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerRental==null?"\\N":fcurPartnerRental.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPartnerTotalIncome==null?"\\N":fcurPartnerTotalIncome.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDividends = null; } else {
      this.fcurPartnerDividends = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerImputation = null; } else {
      this.fcurPartnerImputation = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerMaoriDist = null; } else {
      this.fcurPartnerMaoriDist = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherPassive = null; } else {
      this.fcurPartnerOtherPassive = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseas = null; } else {
      this.fcurPartnerOverseas = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerRental = null; } else {
      this.fcurPartnerRental = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerDividends = null; } else {
      this.fcurPartnerDividends = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerImputation = null; } else {
      this.fcurPartnerImputation = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerMaoriDist = null; } else {
      this.fcurPartnerMaoriDist = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOtherPassive = null; } else {
      this.fcurPartnerOtherPassive = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerOverseas = null; } else {
      this.fcurPartnerOverseas = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPartnerRental = null; } else {
      this.fcurPartnerRental = new java.math.BigDecimal(__cur_str);
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
    tblnz_incomepartnerattributes o = (tblnz_incomepartnerattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomepartnerattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurPartnerDividends", this.fcurPartnerDividends);
    __sqoop$field_map.put("fcurPartnerExtinguishedLosses", this.fcurPartnerExtinguishedLosses);
    __sqoop$field_map.put("fcurPartnerImputation", this.fcurPartnerImputation);
    __sqoop$field_map.put("fcurPartnerInterest", this.fcurPartnerInterest);
    __sqoop$field_map.put("fcurPartnerMaoriDist", this.fcurPartnerMaoriDist);
    __sqoop$field_map.put("fcurPartnerOtherIncome", this.fcurPartnerOtherIncome);
    __sqoop$field_map.put("fcurPartnerOtherPassive", this.fcurPartnerOtherPassive);
    __sqoop$field_map.put("fcurPartnerOtherTaxCredits", this.fcurPartnerOtherTaxCredits);
    __sqoop$field_map.put("fcurPartnerOverseas", this.fcurPartnerOverseas);
    __sqoop$field_map.put("fcurPartnerOverseasTax", this.fcurPartnerOverseasTax);
    __sqoop$field_map.put("fcurPartnerRental", this.fcurPartnerRental);
    __sqoop$field_map.put("fcurPartnerTotalIncome", this.fcurPartnerTotalIncome);
    __sqoop$field_map.put("fcurPartnerResIncome", this.fcurPartnerResIncome);
    __sqoop$field_map.put("fcurPartnerResDeductions", this.fcurPartnerResDeductions);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurPartnerDividends", this.fcurPartnerDividends);
    __sqoop$field_map.put("fcurPartnerExtinguishedLosses", this.fcurPartnerExtinguishedLosses);
    __sqoop$field_map.put("fcurPartnerImputation", this.fcurPartnerImputation);
    __sqoop$field_map.put("fcurPartnerInterest", this.fcurPartnerInterest);
    __sqoop$field_map.put("fcurPartnerMaoriDist", this.fcurPartnerMaoriDist);
    __sqoop$field_map.put("fcurPartnerOtherIncome", this.fcurPartnerOtherIncome);
    __sqoop$field_map.put("fcurPartnerOtherPassive", this.fcurPartnerOtherPassive);
    __sqoop$field_map.put("fcurPartnerOtherTaxCredits", this.fcurPartnerOtherTaxCredits);
    __sqoop$field_map.put("fcurPartnerOverseas", this.fcurPartnerOverseas);
    __sqoop$field_map.put("fcurPartnerOverseasTax", this.fcurPartnerOverseasTax);
    __sqoop$field_map.put("fcurPartnerRental", this.fcurPartnerRental);
    __sqoop$field_map.put("fcurPartnerTotalIncome", this.fcurPartnerTotalIncome);
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
